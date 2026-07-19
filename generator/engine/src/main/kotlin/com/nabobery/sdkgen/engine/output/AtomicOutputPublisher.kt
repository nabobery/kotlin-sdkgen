@file:Suppress("ktlint:standard:max-line-length")
@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine.output

import com.nabobery.sdkgen.engine.declarations.GenerationDiagnostic
import com.nabobery.sdkgen.engine.declarations.GenerationExclusion
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.sha256Hex
import com.nabobery.sdkgen.engine.emit.RenderedKotlinFile
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import java.nio.channels.FileChannel
import java.nio.charset.StandardCharsets
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.DirectoryNotEmptyException
import java.nio.file.FileAlreadyExistsException
import java.nio.file.Files
import java.nio.file.LinkOption.NOFOLLOW_LINKS
import java.nio.file.Path
import java.nio.file.StandardCopyOption.ATOMIC_MOVE
import java.nio.file.StandardCopyOption.REPLACE_EXISTING
import java.nio.file.StandardOpenOption.CREATE
import java.nio.file.StandardOpenOption.WRITE
import java.util.Locale
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.io.path.createDirectories
import kotlin.io.path.createSymbolicLinkPointingTo
import kotlin.io.path.deleteExisting
import kotlin.io.path.exists
import kotlin.io.path.isSymbolicLink
import kotlin.io.path.name
import kotlin.io.path.readSymbolicLink
import kotlin.io.path.writeBytes

internal data class ManifestInput(
    val canonicalUri: String,
    val sha256: String,
    val contentLength: Long,
)

internal data class ManifestOverlay(
    val id: String,
    val canonicalUri: String,
    val sha256: String,
)

internal data class ManifestPlugin(
    val id: String,
    val version: String,
    val spiRange: String,
    val configSha256: String,
    val phases: List<String> = emptyList(),
)

internal data class ManifestTool(
    val id: String,
    val version: String,
)

internal data class ManifestCompatibilityProfile(
    val id: String,
    val version: String,
)

internal data class GenerationManifestIdentity(
    val configDigest: String,
    val source: ManifestInput,
    val references: List<ManifestInput>,
    val overlays: List<ManifestOverlay>,
    val generatorVersion: String,
    val edition: String,
    val kotlinPoetVersion: String,
    val targets: List<String>,
    val compatibilityProfiles: List<ManifestCompatibilityProfile>,
    val plugins: List<ManifestPlugin>,
    val warningsAsErrors: Boolean,
    val warningAllowlist: List<String>,
    val tools: List<ManifestTool> = emptyList(),
)

internal class AtomicOutputPublisher(
    private val symbolicLinkOperation: ((Path, Path) -> Unit)? = null,
    private val moveOperation: ((Path, Path, Boolean) -> Unit)? = null,
) {
    fun publish(
        destination: Path,
        declarationModel: KotlinDeclarationModel,
        files: List<RenderedKotlinFile>,
        identity: GenerationManifestIdentity,
        diagnostics: List<GenerationDiagnostic>,
        exclusions: List<GenerationExclusion>,
        failAfterFiles: Int? = null,
        lock: LockPublication? = null,
        verifier: (Path) -> Unit = {},
    ): PublicationResult {
        val parent = requireNotNull(destination.parent) { "destination must have a parent" }
        parent.createDirectories()
        val snapshots = parent.resolve(".snapshots")
        require(!Files.isSymbolicLink(snapshots)) {
            "generated snapshot directory must not be a symbolic link: $snapshots"
        }
        snapshots.createDirectories()
        val temp = Files.createTempDirectory(parent, ".sdkgen-")
        try {
            val sortedFiles = files.sortedBy(RenderedKotlinFile::path)
            validateFiles(sortedFiles)
            sortedFiles.forEachIndexed { index, file ->
                val target = stagedFile(temp, file.path)
                requireNotNull(target.parent).createDirectories()
                target.writeBytes(file.bytes)
                if (failAfterFiles != null && index + 1 == failAfterFiles) {
                    error("Injected failure after ${index + 1} emitted files")
                }
            }
            verify(temp, declarationModel, sortedFiles)
            verifier(temp)
            val manifest = manifestBytes(declarationModel, sortedFiles, identity, diagnostics, exclusions)
            temp.resolve("manifest.json").writeBytes(manifest)
            val snapshotDigest = directoryDigest(sortedFiles, manifest)
            val snapshot = snapshots.resolve(snapshotDigest)
            materializeOrVerifySnapshot(snapshot, temp, sortedFiles, manifest)
            val prepared = PreparedPublication(snapshotDigest, snapshot, destination, manifest.size.toLong())
            commit(prepared, lock)
            return PublicationResult(snapshotDigest, snapshot, destination, manifest.size.toLong())
        } catch (failure: Throwable) {
            if (temp.exists()) deleteRecursively(temp)
            throw failure
        }
    }

    private fun materializeOrVerifySnapshot(
        snapshot: Path,
        temp: Path,
        files: List<RenderedKotlinFile>,
        manifest: ByteArray,
    ) {
        while (true) {
            if (Files.isSymbolicLink(snapshot)) {
                throw IllegalStateException("generated snapshot must not be a symbolic link: $snapshot")
            }
            if (!Files.exists(snapshot, NOFOLLOW_LINKS)) {
                try {
                    atomicMove(temp, snapshot)
                    return
                } catch (_: FileAlreadyExistsException) {
                    // Another publisher won the no-replace move; verify its complete snapshot below.
                    continue
                } catch (_: DirectoryNotEmptyException) {
                    // Another publisher won the no-replace move; verify its complete snapshot below.
                    continue
                }
            }
            check(Files.isDirectory(snapshot, NOFOLLOW_LINKS)) {
                "existing generated snapshot is not a directory: $snapshot"
            }
            check(snapshotMatches(snapshot, files, manifest)) {
                "existing generated snapshot does not match freshly staged content: $snapshot"
            }
            deleteRecursively(temp)
            return
        }
    }

    private fun snapshotMatches(
        snapshot: Path,
        files: List<RenderedKotlinFile>,
        manifest: ByteArray,
    ): Boolean {
        val expected = linkedMapOf<String, ByteArray>()
        files.forEach { file -> expected[file.path] = file.bytes }
        expected["manifest.json"] = manifest

        val entries =
            Files.walk(snapshot).use { paths ->
                paths.filter { path -> path != snapshot }.toList()
            }
        if (entries.any { path -> Files.isSymbolicLink(path) }) {
            throw IllegalStateException("generated snapshot contains a symbolic link: $snapshot")
        }
        if (entries.any { path ->
                !Files.isDirectory(path, NOFOLLOW_LINKS) &&
                    !Files.isRegularFile(path, NOFOLLOW_LINKS)
            }
        ) {
            return false
        }
        val actual =
            entries
                .filter { path -> Files.isRegularFile(path, NOFOLLOW_LINKS) }
                .associate { path ->
                    snapshot.relativize(path).toString().replace('\\', '/') to Files.readAllBytes(path)
                }
        return actual.keys == expected.keys &&
            expected.all { (path, bytes) -> actual.getValue(path).contentEquals(bytes) }
    }

    private fun requireSafeSnapshot(snapshot: Path) {
        require(!Files.isSymbolicLink(snapshot)) {
            "generated snapshot must not be a symbolic link: $snapshot"
        }
        require(Files.isDirectory(snapshot, NOFOLLOW_LINKS)) {
            "generated snapshot must be a directory: $snapshot"
        }
        Files.walk(snapshot).use { paths ->
            paths.filter { path -> path != snapshot }.forEach { path ->
                require(!Files.isSymbolicLink(path)) {
                    "generated snapshot contains a symbolic link: $path"
                }
            }
        }
    }

    internal fun commit(
        prepared: PreparedPublication,
        lock: LockPublication? = null,
        beforeLockCommit: (Path) -> Unit = {},
    ) {
        val lockParent = lock?.destination?.parent?.also(Path::createDirectories)
        return withPublicationLock(prepared.destination, lock?.destination) {
            requireSafeSnapshot(prepared.snapshot)
            if (lock == null) {
                val previousDestination = preserveDestination(prepared.destination)
                try {
                    publishPointerTarget(
                        requireNotNull(prepared.destination.parent),
                        prepared.destination,
                        Path.of(".snapshots", prepared.digest),
                    )
                    previousDestination?.let(::deleteRecursively)
                } catch (failure: Throwable) {
                    rollbackDestination(prepared.destination, previousDestination, failure)
                    throw failure
                }
                return@withPublicationLock
            }

            val stagedLock = Files.createTempFile(requireNotNull(lockParent), ".sdkgen-lock-", ".tmp")
            stagedLock.writeBytes(lock.bytes)
            val previousDestination = preserveDestination(prepared.destination)
            try {
                publishPointerTarget(
                    requireNotNull(prepared.destination.parent),
                    prepared.destination,
                    Path.of(".snapshots", prepared.digest),
                )
                beforeLockCommit(stagedLock)
                atomicMove(stagedLock, lock.destination, replace = true)
                previousDestination?.let(::deleteRecursively)
            } catch (failure: Throwable) {
                rollbackDestination(prepared.destination, previousDestination, failure)
                throw failure
            } finally {
                Files.deleteIfExists(stagedLock)
            }
        }
    }

    /**
     * Blocks commits sharing either canonical output or canonical lock path. Both coordinator locks
     * are acquired in canonical order before reading the previous pointer and released only after
     * lock publication or rollback. JVM locks prevent overlapping locks in-process; file locks
     * serialize independent JVM processes.
     */
    private fun <T> withPublicationLock(
        destination: Path,
        lockDestination: Path?,
        action: () -> T,
    ): T =
        withCoordinatorLocks(
            listOfNotNull(destination, lockDestination)
                .map(::canonicalPath)
                .distinct()
                .map(::coordinatorPath)
                .sortedBy(Path::toString),
            0,
            action,
        )

    private fun <T> withCoordinatorLocks(
        coordinators: List<Path>,
        index: Int,
        action: () -> T,
    ): T {
        if (index == coordinators.size) return action()
        val coordinator = coordinators[index]
        val processLock = PUBLICATION_LOCKS.computeIfAbsent(coordinator) { ReentrantLock() }
        return processLock.withLock {
            FileChannel.open(coordinator, CREATE, WRITE).use { channel ->
                channel.lock().use { withCoordinatorLocks(coordinators, index + 1, action) }
            }
        }
    }

    private fun stagedFile(
        temp: Path,
        relativePath: String,
    ): Path {
        val path = temp.resolve(relativePath).normalize()
        require(path != temp && path.startsWith(temp)) {
            "emitted file path escapes the publication staging directory: $relativePath"
        }
        return path
    }

    private fun canonicalPath(path: Path): Path {
        val normalized = path.toAbsolutePath().normalize()
        val parent = requireNotNull(normalized.parent) { "publication destination must have a parent" }.toRealPath()
        return parent.resolve(normalized.fileName)
    }

    private fun coordinatorPath(path: Path): Path =
        requireNotNull(
            path.parent,
        ).resolve(".sdkgen-publish-${sha256Hex(path.toString().encodeToByteArray()).take(16)}.lock")

    private fun preserveDestination(destination: Path): Path? {
        if (!Files.exists(destination, NOFOLLOW_LINKS) && !Files.isSymbolicLink(destination)) return null
        val parent = requireNotNull(destination.parent)
        val backup = Files.createTempDirectory(parent, ".${destination.name}-rollback-")
        deleteRecursively(backup)
        atomicMove(destination, backup)
        return backup
    }

    private fun rollbackDestination(
        destination: Path,
        backup: Path?,
        failure: Throwable,
    ) {
        runCatching {
            deleteRecursively(destination)
            backup?.let { atomicMove(it, destination) }
        }.onFailure(failure::addSuppressed)
    }

    private fun validateFiles(files: List<RenderedKotlinFile>) {
        require(files.size <= MAX_MANIFEST_FILES) {
            "emission produced too many files (${files.size}); maximum is $MAX_MANIFEST_FILES"
        }
        val paths =
            files.map { file ->
                val value = file.path
                require(value.isNotBlank()) { "emitted file path must not be empty" }
                require(value.length <= MAX_MANIFEST_PATH_LENGTH) {
                    "emitted file path exceeds the maximum length of $MAX_MANIFEST_PATH_LENGTH: $value"
                }
                require(value.none { character -> character.code == 0 }) {
                    "emitted file path must not contain NUL: $value"
                }
                require(!value.startsWith('/') && !value.startsWith('\\')) {
                    "emitted file path must be relative: $value"
                }
                require(!(value.length >= 2 && value[1] == ':')) {
                    "emitted file path must be relative: $value"
                }
                require('\\' !in value) { "emitted file path must use '/' separators: $value" }
                val segments = value.split('/')
                require(segments.none { it.isEmpty() || it == "." || it == ".." }) {
                    "emitted file path is not canonical: $value"
                }
                value
            }
        require(paths.distinct().size == paths.size) { "emitted file paths must be unique" }
    }

    private fun verify(
        temp: Path,
        model: KotlinDeclarationModel,
        files: List<RenderedKotlinFile>,
    ) {
        require(files.isNotEmpty()) { "emission produced no files" }
        val packages = model.files.map { it.packageName }.toSet()
        files.forEach { file ->
            val path = stagedFile(temp, file.path)
            check(path.exists()) { "missing emitted file ${file.path}" }
            check(Files.size(path) > 0) { "empty emitted file ${file.path}" }
            val text = Files.readString(path)
            check(packages.any { text.startsWith("package $it") }) { "unexpected package in ${file.path}" }
        }
    }

    private fun manifestBytes(
        model: KotlinDeclarationModel,
        files: List<RenderedKotlinFile>,
        identity: GenerationManifestIdentity,
        diagnostics: List<GenerationDiagnostic>,
        exclusions: List<GenerationExclusion>,
    ): ByteArray {
        val manifest =
            buildJsonObject {
                put("schemaVersion", "v1alpha1")
                put("generatorVersion", identity.generatorVersion)
                put("edition", identity.edition)
                put("kotlinPoetVersion", identity.kotlinPoetVersion)
                put("configDigest", identity.configDigest)
                put("declarationModelSha256", model.digest())
                put("source", manifestInput(identity.source))
                put(
                    "references",
                    buildJsonArray {
                        identity.references.sortedBy(ManifestInput::canonicalUri).forEach { add(manifestInput(it)) }
                    },
                )
                put(
                    "overlays",
                    buildJsonArray {
                        identity.overlays.forEach { overlay ->
                            add(
                                buildJsonObject {
                                    put("id", overlay.id)
                                    put("canonicalUri", overlay.canonicalUri)
                                    put("sha256", overlay.sha256)
                                },
                            )
                        }
                    },
                )
                put("targets", buildJsonArray { identity.targets.sorted().forEach { add(JsonPrimitive(it)) } })
                put(
                    "compatibilityProfiles",
                    buildJsonArray {
                        identity.compatibilityProfiles
                            .sortedWith(
                                compareBy(ManifestCompatibilityProfile::id, ManifestCompatibilityProfile::version),
                            ).forEach { profile ->
                                add(
                                    buildJsonObject {
                                        put("id", profile.id)
                                        put("version", profile.version)
                                    },
                                )
                            }
                    },
                )
                put(
                    "plugins",
                    buildJsonArray {
                        identity.plugins.forEachIndexed { order, plugin ->
                            add(
                                buildJsonObject {
                                    put("order", order)
                                    put("id", plugin.id)
                                    put("version", plugin.version)
                                    put("spiRange", plugin.spiRange)
                                    put("configSha256", plugin.configSha256)
                                    put(
                                        "phases",
                                        buildJsonArray {
                                            plugin.phases.forEach { phase -> add(JsonPrimitive(phase)) }
                                        },
                                    )
                                },
                            )
                        }
                    },
                )
                put(
                    "tools",
                    buildJsonArray {
                        identity.tools
                            .sortedWith(compareBy(ManifestTool::id, ManifestTool::version))
                            .forEach { tool ->
                                add(
                                    buildJsonObject {
                                        put("id", tool.id)
                                        put("version", tool.version)
                                    },
                                )
                            }
                    },
                )
                put("warningsAsErrors", identity.warningsAsErrors)
                put(
                    "warningAllowlist",
                    buildJsonArray {
                        identity.warningAllowlist.sorted().forEach { add(JsonPrimitive(it)) }
                    },
                )
                put(
                    "diagnostics",
                    buildJsonArray {
                        diagnostics.forEach { diagnostic ->
                            add(
                                buildJsonObject {
                                    put("code", diagnostic.wireCode)
                                    put("severity", diagnostic.severity.name.lowercase(Locale.ROOT))
                                    put("phase", diagnostic.phase.name.lowercase(Locale.ROOT))
                                    diagnostic.pluginPhase?.let { phase ->
                                        put("pluginPhase", phase.name.lowercase(Locale.ROOT))
                                    }
                                    put("message", diagnostic.message)
                                    put(
                                        "source",
                                        sourcePointer(diagnostic.source.documentUri, diagnostic.source.jsonPointer),
                                    )
                                },
                            )
                        }
                    },
                )
                put(
                    "exclusions",
                    buildJsonArray {
                        exclusions.forEach { exclusion ->
                            add(
                                buildJsonObject {
                                    put("symbolId", exclusion.symbolId)
                                    put("reason", exclusion.reason)
                                    put(
                                        "source",
                                        sourcePointer(exclusion.source.documentUri, exclusion.source.jsonPointer),
                                    )
                                },
                            )
                        }
                    },
                )
                put(
                    "files",
                    buildJsonArray {
                        files.sortedBy(RenderedKotlinFile::path).forEach { file ->
                            add(
                                buildJsonObject {
                                    put("path", file.path)
                                    put("sha256", sha256Hex(file.bytes))
                                },
                            )
                        }
                    },
                )
            }
        return (MANIFEST_JSON.encodeToString(manifest) + "\n").toByteArray(StandardCharsets.UTF_8)
    }

    private fun manifestInput(input: ManifestInput) =
        buildJsonObject {
            put("canonicalUri", input.canonicalUri)
            put("sha256", input.sha256)
            put("contentLength", input.contentLength)
        }

    private fun sourcePointer(
        documentUri: String,
        jsonPointer: String,
    ) = buildJsonObject {
        put("documentUri", documentUri)
        put("jsonPointer", jsonPointer)
    }

    private fun directoryDigest(
        files: List<RenderedKotlinFile>,
        manifest: ByteArray,
    ): String =
        sha256Hex(
            buildList {
                files.sortedBy(RenderedKotlinFile::path).forEach { file ->
                    add(file.path.encodeToByteArray())
                    add(byteArrayOf(0))
                    add(file.bytes)
                    add(byteArrayOf(0))
                }
                add("manifest.json".encodeToByteArray())
                add(byteArrayOf(0))
                add(manifest)
            }.fold(ByteArray(0)) { accumulated, bytes -> accumulated + bytes },
        )

    private fun publishPointerTarget(
        parent: Path,
        destination: Path,
        target: Path,
    ) {
        val pointer = Files.createTempFile(parent, ".${destination.name}-", ".next")
        pointer.deleteExisting()
        try {
            try {
                symbolicLinkOperation?.invoke(pointer, target) ?: pointer.createSymbolicLinkPointingTo(target)
            } catch (_: Exception) {
                materializeTarget(parent, destination, target)
                return
            }
            atomicMove(pointer, destination, replace = true)
        } finally {
            Files.deleteIfExists(pointer)
        }
    }

    private fun materializeTarget(
        parent: Path,
        destination: Path,
        target: Path,
    ) {
        val source = parent.resolve(target).normalize()
        require(source.startsWith(parent) && source != parent) {
            "generated publication target must remain under its output directory: $target"
        }
        requireSafeSnapshot(source)
        val staged = Files.createTempDirectory(parent, ".${destination.name}-materialized-")
        try {
            copyDirectory(source, staged)
            val previousDestination = preserveDestination(destination)
            try {
                atomicMove(staged, destination)
                previousDestination?.let(::deleteRecursively)
            } catch (failure: Throwable) {
                rollbackDestination(destination, previousDestination, failure)
                throw failure
            }
        } finally {
            deleteRecursively(staged)
        }
    }

    private fun copyDirectory(
        source: Path,
        destination: Path,
    ) {
        Files.walk(source).use { paths ->
            paths.forEach { path ->
                val relative = source.relativize(path)
                if (relative.toString().isEmpty()) return@forEach
                val target = destination.resolve(relative.toString()).normalize()
                require(target.startsWith(destination)) {
                    "generated snapshot entry escapes the materialized output: $relative"
                }
                if (Files.isDirectory(path, NOFOLLOW_LINKS)) {
                    target.createDirectories()
                } else {
                    Files.copy(path, target)
                }
            }
        }
    }

    private fun atomicMove(
        source: Path,
        target: Path,
        replace: Boolean = false,
    ) {
        val options = if (replace) arrayOf(ATOMIC_MOVE, REPLACE_EXISTING) else arrayOf(ATOMIC_MOVE)
        try {
            if (moveOperation == null) {
                Files.move(source, target, *options)
            } else {
                moveOperation.invoke(source, target, replace)
            }
        } catch (failure: AtomicMoveNotSupportedException) {
            throw IllegalStateException("Atomic rename is required for generated output publication", failure)
        }
    }

    private fun deleteRecursively(root: Path) {
        if (root.isSymbolicLink()) {
            Files.deleteIfExists(root)
            return
        }
        if (!Files.exists(root, NOFOLLOW_LINKS)) return
        Files.walk(root).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach(Files::deleteIfExists) }
    }

    private companion object {
        const val MAX_MANIFEST_FILES = 10_000
        const val MAX_MANIFEST_PATH_LENGTH = 4096
        val MANIFEST_JSON: Json = Json { prettyPrint = true }
        val PUBLICATION_LOCKS = ConcurrentHashMap<Path, ReentrantLock>()
    }
}

internal data class PreparedPublication(
    val digest: String,
    val snapshot: Path,
    val destination: Path,
    val manifestBytes: Long,
)

internal data class LockPublication(
    val destination: Path,
    val bytes: ByteArray,
)

internal data class PublicationResult(
    val digest: String,
    val snapshot: Path,
    val destination: Path,
    val manifestBytes: Long,
)

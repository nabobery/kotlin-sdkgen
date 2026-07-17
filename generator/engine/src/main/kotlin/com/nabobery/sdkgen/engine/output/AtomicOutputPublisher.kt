@file:Suppress("ktlint:standard:max-line-length")

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
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption.ATOMIC_MOVE
import java.nio.file.StandardCopyOption.REPLACE_EXISTING
import java.nio.file.StandardOpenOption.CREATE
import java.nio.file.StandardOpenOption.WRITE
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
    val plugins: List<ManifestPlugin>,
)

internal class AtomicOutputPublisher(
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
        val snapshots = parent.resolve(".snapshots").also(Path::createDirectories)
        val temp = Files.createTempDirectory(parent, ".sdkgen-")
        try {
            val sortedFiles = files.sortedBy(RenderedKotlinFile::path)
            sortedFiles.forEachIndexed { index, file ->
                val target = temp.resolve(file.path)
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
            if (snapshot.exists()) deleteRecursively(temp) else atomicMove(temp, snapshot)
            val prepared = PreparedPublication(snapshotDigest, snapshot, destination, manifest.size.toLong())
            commit(prepared, lock)
            return PublicationResult(snapshotDigest, snapshot, destination, manifest.size.toLong())
        } catch (failure: Throwable) {
            if (temp.exists()) deleteRecursively(temp)
            throw failure
        }
    }

    internal fun commit(
        prepared: PreparedPublication,
        lock: LockPublication? = null,
        beforeLockCommit: (Path) -> Unit = {},
    ) {
        val lockParent = lock?.destination?.parent?.also(Path::createDirectories)
        return withPublicationLock(prepared.destination, lock?.destination) {
            if (lock == null) {
                publishPointer(requireNotNull(prepared.destination.parent), prepared.destination, prepared.digest)
                return@withPublicationLock
            }

            val stagedLock = Files.createTempFile(requireNotNull(lockParent), ".sdkgen-lock-", ".tmp")
            stagedLock.writeBytes(lock.bytes)
            val destinationExisted = prepared.destination.exists() || prepared.destination.isSymbolicLink()
            val previousTarget =
                if (destinationExisted) {
                    require(
                        prepared.destination.isSymbolicLink(),
                    ) { "existing generated output must be a symbolic link" }
                    prepared.destination.readSymbolicLink()
                } else {
                    null
                }
            var outputCommitted = false
            try {
                publishPointer(requireNotNull(prepared.destination.parent), prepared.destination, prepared.digest)
                outputCommitted = true
                beforeLockCommit(stagedLock)
                atomicMove(stagedLock, lock.destination, replace = true)
            } catch (failure: Throwable) {
                if (outputCommitted) {
                    try {
                        restorePointer(prepared.destination, destinationExisted, previousTarget)
                    } catch (rollbackFailure: Throwable) {
                        failure.addSuppressed(rollbackFailure)
                    }
                }
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

    private fun canonicalPath(path: Path): Path {
        val normalized = path.toAbsolutePath().normalize()
        val parent = requireNotNull(normalized.parent) { "publication destination must have a parent" }.toRealPath()
        return parent.resolve(normalized.fileName)
    }

    private fun coordinatorPath(path: Path): Path =
        requireNotNull(
            path.parent,
        ).resolve(".sdkgen-publish-${sha256Hex(path.toString().encodeToByteArray()).take(16)}.lock")

    private fun restorePointer(
        destination: Path,
        existed: Boolean,
        previousTarget: Path?,
    ) {
        val parent = requireNotNull(destination.parent)
        if (existed) {
            publishPointerTarget(parent, destination, requireNotNull(previousTarget))
        } else if (destination.exists() || destination.isSymbolicLink()) {
            val removed = Files.createTempFile(parent, ".${destination.name}-rollback-", ".tmp")
            Files.deleteIfExists(removed)
            try {
                atomicMove(destination, removed)
            } finally {
                Files.deleteIfExists(removed)
            }
        }
    }

    private fun verify(
        temp: Path,
        model: KotlinDeclarationModel,
        files: List<RenderedKotlinFile>,
    ) {
        require(files.isNotEmpty()) { "emission produced no files" }
        val packages = model.files.map { it.packageName }.toSet()
        files.forEach { file ->
            val path = temp.resolve(file.path)
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
                    "plugins",
                    buildJsonArray {
                        identity.plugins.forEach { plugin ->
                            add(
                                buildJsonObject {
                                    put("id", plugin.id)
                                    put("version", plugin.version)
                                    put("spiRange", plugin.spiRange)
                                    put("configSha256", plugin.configSha256)
                                },
                            )
                        }
                    },
                )
                put(
                    "diagnostics",
                    buildJsonArray {
                        diagnostics.forEach { diagnostic ->
                            add(
                                buildJsonObject {
                                    put("code", diagnostic.code)
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

    private fun publishPointer(
        parent: Path,
        destination: Path,
        snapshotDigest: String,
    ) {
        publishPointerTarget(parent, destination, Path.of(".snapshots", snapshotDigest))
    }

    private fun publishPointerTarget(
        parent: Path,
        destination: Path,
        target: Path,
    ) {
        val pointer = Files.createTempFile(parent, ".${destination.name}-", ".next")
        pointer.deleteExisting()
        try {
            pointer.createSymbolicLinkPointingTo(target)
            atomicMove(pointer, destination, replace = true)
        } finally {
            Files.deleteIfExists(pointer)
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
        Files.walk(root).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach(Files::deleteIfExists) }
    }

    private companion object {
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

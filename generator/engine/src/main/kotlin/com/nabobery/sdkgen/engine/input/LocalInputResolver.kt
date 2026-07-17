package com.nabobery.sdkgen.engine.input

import com.nabobery.sdkgen.engine.ResolvedGenerationOverlay
import com.nabobery.sdkgen.engine.ResolvedReference
import com.nabobery.sdkgen.engine.ResolvedSource
import com.nabobery.sdkgen.engine.config.AcquisitionException
import com.nabobery.sdkgen.engine.config.AcquisitionMode
import com.nabobery.sdkgen.engine.config.Diagnostic
import com.nabobery.sdkgen.engine.config.DiagnosticPath
import com.nabobery.sdkgen.engine.config.DiagnosticPhase
import com.nabobery.sdkgen.engine.config.DiagnosticSeverity
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.openapi.LocalReferenceClosure
import com.nabobery.sdkgen.openapi.ReferenceNotRegularFileException
import com.nabobery.sdkgen.openapi.ReferenceOutsideTrustedRootsException
import java.io.Closeable
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.security.MessageDigest
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.path.createDirectories
import kotlin.io.path.deleteIfExists
import kotlin.io.path.exists
import kotlin.io.path.isRegularFile
import kotlin.io.path.name

/**
 * Resolves and stages every local byte that can affect one generation.
 *
 * The returned workspace owns temporary files and must be closed after validation or generation.
 */
public class LocalInputResolver(
    private val inputOpener: (Path) -> InputStream = Files::newInputStream,
    private val workspaceDeleter: (Path) -> Unit = ::deleteRecursively,
) {
    public fun resolve(
        configFile: Path,
        config: SdkgenConfigV1Alpha1,
    ): ResolvedGenerationInputs {
        if (config.source.acquisition.mode != AcquisitionMode.LOCAL) {
            throw acquisitionFailure(
                code = "SDKGEN-ACQUISITION-MODE-UNSUPPORTED",
                file = configFile,
                path = "$.source.acquisition.mode",
                message = "Phase 1 supports only local source acquisition.",
                remediation = "Use acquisition mode 'local'; HTTPS acquisition is scheduled for a later phase.",
            )
        }

        val projectRoot = requireNotNull(configFile.toAbsolutePath().normalize().parent).toRealPath()
        val allowedRoots = resolveAllowedRoots(projectRoot, config.source.acquisition.allowedLocalRoots, configFile)
        val sourcePath =
            resolveExistingFile(
                projectRoot = projectRoot,
                value = config.source.uri,
                allowedRoots = allowedRoots,
                configFile = configFile,
                diagnosticPath = "$.source.uri",
            )
        val workspace = Files.createTempDirectory("sdkgen-inputs-")
        try {
            val stagedSourceRoot = workspace.resolve("source").also(Path::createDirectories)
            val stagedDocuments = mutableMapOf<Path, StagedFile>()
            val closure =
                try {
                    LocalReferenceClosure.resolveAndStage(sourcePath, allowedRoots) { source, relativePath ->
                        val staged =
                            stageFile(
                                source = source,
                                target = stagedSourceRoot.resolve(relativePath.toString()),
                                maxBytes = config.source.acquisition.maxBytes,
                                configFile = configFile,
                                diagnosticPath = "$.source.acquisition.maxBytes",
                            )
                        stagedDocuments[source] = staged
                        staged.path
                    }
                } catch (outsideRoot: ReferenceOutsideTrustedRootsException) {
                    throw acquisitionFailure(
                        code = "SDKGEN-ACQUISITION-OUTSIDE-ROOT",
                        file = configFile,
                        path = "$.source.uri",
                        message = "Local reference resolves outside every configured allowed root: ${outsideRoot.path}",
                        remediation = "Move the input under an allowed root or explicitly add its trusted root.",
                        cause = outsideRoot,
                    )
                } catch (notAFile: ReferenceNotRegularFileException) {
                    throw acquisitionFailure(
                        code = "SDKGEN-ACQUISITION-NOT-A-FILE",
                        file = configFile,
                        path = "$.source.uri",
                        message = "Local reference is not a regular file: ${notAFile.path}",
                        remediation = "Use a regular local file for every external reference.",
                        cause = notAFile,
                    )
                }
            val rootDocument = closure.single { it.path == sourcePath }
            val stagedRoot = stagedDocuments.getValue(rootDocument.path)
            config.source.sha256?.let { expected ->
                if (expected != stagedRoot.sha256) {
                    throw acquisitionFailure(
                        code = "SDKGEN-ACQUISITION-DIGEST-MISMATCH",
                        file = configFile,
                        path = "$.source.sha256",
                        message = "Configured source digest does not match the staged local source.",
                        remediation = "Restore the pinned source or update the reviewed SHA-256 value.",
                    )
                }
            }
            val references =
                closure
                    .filterNot { it.path == sourcePath }
                    .map { document ->
                        val staged = stagedDocuments.getValue(document.path)
                        ResolvedReference(document.canonicalUri, staged.sha256, staged.contentLength)
                    }
            val resolvedSource =
                ResolvedSource(
                    path = stagedRoot.path,
                    canonicalUri = rootDocument.canonicalUri,
                    sha256 = stagedRoot.sha256,
                    contentLength = stagedRoot.contentLength,
                    references = references,
                )
            val stagedOverlays = workspace.resolve("overlays").also(Path::createDirectories)
            val overlays =
                config.overlays.mapIndexed { index, overlay ->
                    val path =
                        resolveExistingFile(
                            projectRoot = projectRoot,
                            value = overlay.uri,
                            allowedRoots = allowedRoots,
                            configFile = configFile,
                            diagnosticPath = "$.overlays[$index].uri",
                        )
                    val target = stagedOverlays.resolve("${index.toString().padStart(4, '0')}-${path.name}")
                    val staged =
                        stageFile(
                            source = path,
                            target = target,
                            maxBytes = config.source.acquisition.maxBytes,
                            configFile = configFile,
                            diagnosticPath = "$.source.acquisition.maxBytes",
                        )
                    overlay.sha256?.let { expected ->
                        if (expected != staged.sha256) {
                            throw acquisitionFailure(
                                code = "SDKGEN-ACQUISITION-DIGEST-MISMATCH",
                                file = configFile,
                                path = "$.overlays[$index].sha256",
                                message = "Configured overlay digest does not match '${overlay.id}'.",
                                remediation = "Restore the overlay or update its reviewed SHA-256 value.",
                            )
                        }
                    }
                    ResolvedGenerationOverlay(
                        id = overlay.id,
                        path = staged.path,
                        canonicalUri = "sdkgen://overlay/${overlay.id}",
                        sha256 = staged.sha256,
                    )
                }
            return ResolvedGenerationInputs(resolvedSource, overlays, workspace)
        } catch (cancellation: CancellationException) {
            cleanupAfterFailure(workspace, cancellation)
            throw cancellation
        } catch (failure: Throwable) {
            cleanupAfterFailure(workspace, failure)
            throw failure
        }
    }

    private fun resolveAllowedRoots(
        projectRoot: Path,
        configuredRoots: List<String>,
        configFile: Path,
    ): List<Path> {
        val roots = if (configuredRoots.isEmpty()) listOf(projectRoot.toString()) else configuredRoots
        return roots
            .mapIndexed { index, value ->
                val candidate = Path.of(value).let { if (it.isAbsolute) it else projectRoot.resolve(it) }
                try {
                    candidate.toRealPath()
                } catch (failure: Exception) {
                    throw acquisitionFailure(
                        code = "SDKGEN-ACQUISITION-ROOT-INVALID",
                        file = configFile,
                        path = "$.source.acquisition.allowedLocalRoots[$index]",
                        message = "Allowed local root does not exist or cannot be resolved: $value",
                        remediation = "Configure an existing readable directory as an allowed local root.",
                        cause = failure,
                    )
                }
            }.distinct()
    }

    private fun resolveExistingFile(
        projectRoot: Path,
        value: String,
        allowedRoots: List<Path>,
        configFile: Path,
        diagnosticPath: String,
    ): Path {
        val candidate = Path.of(value).let { if (it.isAbsolute) it else projectRoot.resolve(it) }
        val real =
            try {
                candidate.toRealPath()
            } catch (failure: Exception) {
                throw acquisitionFailure(
                    code = "SDKGEN-ACQUISITION-INPUT-MISSING",
                    file = configFile,
                    path = diagnosticPath,
                    message = "Local input does not exist or cannot be resolved: $value",
                    remediation = "Configure an existing readable local file.",
                    cause = failure,
                )
            }
        enforceAllowed(real, allowedRoots, configFile, diagnosticPath)
        if (!real.isRegularFile()) {
            throw acquisitionFailure(
                code = "SDKGEN-ACQUISITION-NOT-A-FILE",
                file = configFile,
                path = diagnosticPath,
                message = "Local input is not a regular file: $value",
                remediation = "Configure a regular local file.",
            )
        }
        return real
    }

    private fun enforceAllowed(
        path: Path,
        allowedRoots: List<Path>,
        configFile: Path,
        diagnosticPath: String,
    ) {
        if (allowedRoots.none(path::startsWith)) {
            throw acquisitionFailure(
                code = "SDKGEN-ACQUISITION-OUTSIDE-ROOT",
                file = configFile,
                path = diagnosticPath,
                message = "Local input resolves outside every configured allowed root: $path",
                remediation = "Move the input under an allowed root or explicitly add its trusted root.",
            )
        }
    }

    private fun stageFile(
        source: Path,
        target: Path,
        maxBytes: Long,
        configFile: Path,
        diagnosticPath: String,
    ): StagedFile {
        requireNotNull(target.parent).createDirectories()
        val temporary = Files.createTempFile(target.parent, ".sdkgen-staging-", ".tmp")
        val digest = MessageDigest.getInstance("SHA-256")
        var contentLength = 0L
        try {
            inputOpener(source).use { input ->
                Files.newOutputStream(temporary).use { output ->
                    val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                    while (true) {
                        val read = input.read(buffer)
                        if (read < 0) break
                        contentLength += read
                        if (contentLength > maxBytes) {
                            throw acquisitionFailure(
                                code = "SDKGEN-ACQUISITION-SIZE-LIMIT",
                                file = configFile,
                                path = diagnosticPath,
                                message = "Local input exceeds the configured maximum of $maxBytes bytes: $source",
                                remediation =
                                    "Use a smaller pinned input or raise maxBytes after reviewing the resource cost.",
                            )
                        }
                        digest.update(buffer, 0, read)
                        output.write(buffer, 0, read)
                    }
                }
            }
            Files.move(temporary, target, StandardCopyOption.ATOMIC_MOVE)
            return StagedFile(target, digest.digest().toHex(), contentLength)
        } finally {
            temporary.deleteIfExists()
        }
    }

    private fun cleanupAfterFailure(
        workspace: Path,
        failure: Throwable,
    ) {
        try {
            workspaceDeleter(workspace)
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (cleanupFailure: Throwable) {
            failure.addSuppressed(cleanupFailure)
        }
    }

    private data class StagedFile(
        val path: Path,
        val sha256: String,
        val contentLength: Long,
    )
}

/** Verified local inputs staged for deterministic parser consumption. */
public class ResolvedGenerationInputs internal constructor(
    public val source: ResolvedSource,
    public val overlays: List<ResolvedGenerationOverlay>,
    internal val workspaceRoot: Path,
) : Closeable {
    override fun close() {
        deleteRecursively(workspaceRoot)
    }
}

private fun acquisitionFailure(
    code: String,
    file: Path,
    path: String,
    message: String,
    remediation: String,
    cause: Throwable? = null,
): AcquisitionException =
    AcquisitionException(
        diagnostic =
            Diagnostic(
                code = code,
                severity = DiagnosticSeverity.ERROR,
                path = DiagnosticPath(file.toString(), path),
                phase = DiagnosticPhase.ACQUISITION,
                message = message,
                remediation = remediation,
            ),
        cause = cause,
    )

private fun ByteArray.toHex(): String = joinToString("") { byte -> "%02x".format(byte) }

private fun deleteRecursively(root: Path) {
    if (!root.exists()) return
    Files.walk(root).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach(Path::deleteIfExists) }
}

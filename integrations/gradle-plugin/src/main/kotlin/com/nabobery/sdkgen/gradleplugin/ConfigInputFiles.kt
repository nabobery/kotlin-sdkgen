package com.nabobery.sdkgen.gradleplugin

import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.openapi.LocalReferenceClosure
import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path

/**
 * Computes local specification and overlay files used to fingerprint a generation task. The
 * engine still resolves and verifies the same closure during the task action.
 */
internal object ConfigInputFiles {
    fun source(configFile: File): List<File> =
        decode(configFile)
            ?.let { config ->
                localPath(configFile.toPath(), config.source.uri)?.let { source ->
                    sourceClosure(configFile.toPath(), source.toPath(), config)
                }
            }.orEmpty()

    fun overlays(configFile: File): List<File> =
        decode(configFile)
            ?.overlays
            ?.mapNotNull { overlay -> localPath(configFile.toPath(), overlay.uri) }
            .orEmpty()

    private fun sourceClosure(
        configFile: Path,
        source: Path,
        config: SdkgenConfigV1Alpha1,
    ): List<File> {
        val roots =
            config.source.acquisition.allowedLocalRoots
                .mapNotNull { root -> localPath(configFile, root)?.toPath() }
                .ifEmpty {
                    listOf(requireNotNull(configFile.toAbsolutePath().normalize().parent))
                }
        return runCatching {
            LocalReferenceClosure.resolve(source, roots).map { document -> document.path.toFile() }
        }.getOrElse { listOf(source.toFile()) }
    }

    private fun decode(configFile: File) =
        runCatching {
            val path = configFile.toPath()
            val text = Files.readString(path, StandardCharsets.UTF_8)
            if (path.fileName.toString().endsWith(".json", ignoreCase = true)) {
                ConfigLoader.decodeJson(text, path.toString())
            } else {
                ConfigLoader.decodeYaml(text, path.toString())
            }
        }.getOrNull()

    private fun localPath(
        configFile: Path,
        value: String,
    ): File? =
        runCatching {
            if (value.contains("://")) return@runCatching null
            val candidate = Path.of(value)
            val root = requireNotNull(configFile.toAbsolutePath().normalize().parent)
            (if (candidate.isAbsolute) candidate else root.resolve(candidate)).normalize().toFile()
        }.getOrNull()
}

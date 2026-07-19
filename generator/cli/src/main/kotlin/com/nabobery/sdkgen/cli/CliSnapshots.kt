@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.core.ProgramResult
import com.github.ajalt.clikt.core.parse
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.optional
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.choice
import com.nabobery.sdkgen.engine.GenerationBlockedException
import com.nabobery.sdkgen.engine.GenerationDiagnosticView
import com.nabobery.sdkgen.engine.GenerationExclusionView
import com.nabobery.sdkgen.engine.GenerationLockPublication
import com.nabobery.sdkgen.engine.GenerationPipeline
import com.nabobery.sdkgen.engine.ProjectedSymbolView
import com.nabobery.sdkgen.engine.ResolvedGenerationOverlay
import com.nabobery.sdkgen.engine.ResolvedReference
import com.nabobery.sdkgen.engine.ResolvedSource
import com.nabobery.sdkgen.engine.ValidationResult
import com.nabobery.sdkgen.engine.config.ConfigContractException
import com.nabobery.sdkgen.engine.config.ConfigDigest
import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.Diagnostic
import com.nabobery.sdkgen.engine.config.LockCodec
import com.nabobery.sdkgen.engine.config.LockContractException
import com.nabobery.sdkgen.engine.config.LockedCompatibilityProfile
import com.nabobery.sdkgen.engine.config.LockedGenerator
import com.nabobery.sdkgen.engine.config.LockedInputVerifier
import com.nabobery.sdkgen.engine.config.LockedOverlay
import com.nabobery.sdkgen.engine.config.LockedPlugin
import com.nabobery.sdkgen.engine.config.LockedReference
import com.nabobery.sdkgen.engine.config.LockedSource
import com.nabobery.sdkgen.engine.config.LockedTool
import com.nabobery.sdkgen.engine.config.OverlayConflictPolicy
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SdkgenLockV1Alpha1
import com.nabobery.sdkgen.engine.config.ZeroMatchPolicy
import com.nabobery.sdkgen.engine.input.LocalInputResolver
import com.nabobery.sdkgen.engine.input.ResolvedGenerationInputs
import com.nabobery.sdkgen.engine.spi.BuiltInSdkGenPlugins
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.openapi.overlays.ConflictPolicy
import com.nabobery.sdkgen.openapi.overlays.OverlayApplicator
import com.nabobery.sdkgen.openapi.overlays.OverlayInput
import com.nabobery.sdkgen.openapi.overlays.ZeroMatchMode
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import java.io.Closeable
import java.nio.file.Files
import java.nio.file.Path
import java.util.Locale
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.path.exists
import kotlin.io.path.isSymbolicLink
import kotlin.io.path.readBytes
import kotlin.io.path.readSymbolicLink
import kotlin.io.path.readText
import kotlin.system.exitProcess

internal sealed interface SnapshotDimension<out T> {
    data class Available<T>(
        val value: T,
    ) : SnapshotDimension<T>

    data object Unavailable : SnapshotDimension<Nothing>
}

internal data class SnapshotInput(
    val canonicalUri: String,
    val sha256: String,
    val contentLength: Long,
)

internal data class SnapshotOverlay(
    val id: String,
    val canonicalUri: String,
    val sha256: String,
)

internal data class SnapshotGenerator(
    val version: String,
    val edition: String,
)

internal data class SnapshotProfile(
    val id: String,
    val version: String,
)

internal data class SnapshotPlugin(
    val id: String,
    val version: String,
    val spiRange: String,
    val configSha256: String,
    val order: Int? = null,
    val phases: List<String> = emptyList(),
)

internal data class SnapshotTool(
    val id: String,
    val version: String,
)

internal data class SnapshotDiagnostic(
    val code: String,
    val message: String,
    val severity: DiagnosticSeverity?,
    val phase: String?,
    val documentUri: String,
    val pointer: String,
    val rawSeverity: String? = null,
    val pluginPhase: String? = null,
)

internal data class SnapshotExclusion(
    val symbolId: String,
    val reason: String,
    val documentUri: String,
    val pointer: String,
)

@Serializable
internal data class ManifestDocument(
    val schemaVersion: String? = null,
    val generatorVersion: String? = null,
    val edition: String? = null,
    val kotlinPoetVersion: String? = null,
    val configDigest: String? = null,
    val declarationModelSha256: String? = null,
    val source: ManifestInputDocument? = null,
    val references: List<ManifestInputDocument>? = null,
    val overlays: List<ManifestOverlayDocument>? = null,
    val targets: List<String>? = null,
    val compatibilityProfiles: List<ManifestProfileDocument>? = null,
    val plugins: List<ManifestPluginDocument>? = null,
    val tools: List<ManifestToolDocument>? = null,
    val warningsAsErrors: Boolean? = null,
    val warningAllowlist: List<String>? = null,
    val diagnostics: List<ManifestDiagnosticDocument>? = null,
    val exclusions: List<ManifestExclusionDocument>? = null,
    val files: List<ManifestFileDocument>? = null,
)

@Serializable
internal data class ManifestInputDocument(
    val canonicalUri: String,
    val sha256: String,
    val contentLength: Long,
)

@Serializable
internal data class ManifestOverlayDocument(
    val id: String,
    val canonicalUri: String,
    val sha256: String,
)

@Serializable
internal data class ManifestProfileDocument(
    val id: String,
    val version: String,
)

@Serializable
internal data class ManifestPluginDocument(
    val id: String,
    val version: String,
    val spiRange: String,
    val configSha256: String,
    val order: Int? = null,
    val phases: List<String>? = null,
)

@Serializable
internal data class ManifestToolDocument(
    val id: String,
    val version: String,
)

@Serializable
internal data class ManifestSourceDocument(
    val documentUri: String = "",
    @SerialName("jsonPointer") val jsonPointer: String? = null,
    val pointer: String? = null,
)

@Serializable
internal data class ManifestDiagnosticDocument(
    val code: String,
    val severity: String? = null,
    val phase: String? = null,
    val pluginPhase: String? = null,
    val message: String,
    val source: ManifestSourceDocument? = null,
    val sourcePointer: ManifestSourceDocument? = null,
)

@Serializable
internal data class ManifestExclusionDocument(
    val symbolId: String,
    val reason: String,
    val source: ManifestSourceDocument? = null,
    val sourcePointer: ManifestSourceDocument? = null,
)

@Serializable
internal data class ManifestFileDocument(
    val path: String,
    val sha256: String,
)

internal data class SnapshotContract(
    val configDigest: SnapshotDimension<String>,
    val source: SnapshotDimension<SnapshotInput>,
    val references: SnapshotDimension<List<SnapshotInput>>,
    val overlays: SnapshotDimension<List<SnapshotOverlay>>,
    val generator: SnapshotDimension<SnapshotGenerator>,
    val kotlinPoetVersion: SnapshotDimension<String>,
    val compatibilityProfiles: SnapshotDimension<List<SnapshotProfile>>,
    val plugins: SnapshotDimension<List<SnapshotPlugin>>,
    val tools: SnapshotDimension<List<SnapshotTool>>,
    val targets: SnapshotDimension<List<String>>,
    val declarationModelSha256: SnapshotDimension<String>,
    val files: SnapshotDimension<Map<String, String>>,
    val diagnostics: SnapshotDimension<List<SnapshotDiagnostic>>,
    val exclusions: SnapshotDimension<List<SnapshotExclusion>>,
    val warningsAsErrors: SnapshotDimension<Boolean>,
    val warningAllowlist: SnapshotDimension<List<String>>,
)

internal data class DiffSnapshot(
    val path: Path,
    val kind: String,
    val contract: SnapshotContract,
    val cleanup: (() -> Unit)? = null,
) {
    fun close() {
        cleanup?.invoke()
    }
}

internal data class DiffChange(
    val kind: String,
    val subject: String,
    val status: String,
    val impact: String,
    val from: String? = null,
    val to: String? = null,
)

internal data class DiffReport(
    val fromKind: String,
    val toKind: String,
    val changes: List<DiffChange>,
    val apiImpact: String,
    val semanticComparison: String,
    val warningsAsErrors: Boolean,
    val warningAllowlist: List<String> = emptyList(),
    val diagnostics: List<SnapshotDiagnostic> = emptyList(),
    val unavailableDimensions: List<String> = emptyList(),
    val truncated: Boolean = false,
    val hasBlockingDiagnostics: Boolean = false,
) {
    fun toJson(): JsonObject =
        buildJsonObject {
            put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
            put("status", if (changes.isEmpty() && !hasBlockingDiagnostics) "ok" else "changes")
            put("command", "diff")
            put("fromKind", fromKind)
            put("toKind", toKind)
            put("semanticComparison", semanticComparison)
            put("apiImpact", apiImpact)
            put("warningsAsErrors", warningsAsErrors)
            put("warningAllowlist", buildJsonArray { warningAllowlist.forEach { add(JsonPrimitive(it)) } })
            put("truncated", truncated)
            put(
                "unavailableDimensions",
                buildJsonArray { unavailableDimensions.sorted().forEach { add(JsonPrimitive(it)) } },
            )
            put(
                "changes",
                buildJsonArray {
                    changes.forEach { change ->
                        add(
                            buildJsonObject {
                                put("kind", change.kind)
                                put("subject", change.subject)
                                put("status", change.status)
                                put("impact", change.impact)
                                change.from?.let { put("from", it) }
                                change.to?.let { put("to", it) }
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
                                put("rule", diagnostic.code)
                                diagnostic.phase?.let { put("phase", it) }
                                diagnostic.pluginPhase?.let { put("pluginPhase", it) }
                                val severity = diagnostic.severity
                                if (severity != null) {
                                    put("severity", severity.name.lowercase(Locale.ROOT))
                                } else {
                                    diagnostic.rawSeverity?.let { put("severity", it) }
                                }
                                put("message", diagnostic.message)
                                put(
                                    "sourcePointer",
                                    buildJsonObject {
                                        put("documentUri", diagnostic.documentUri)
                                        put("pointer", diagnostic.pointer)
                                    },
                                )
                            },
                        )
                    }
                },
            )
        }
}

internal class DiffInputException(
    val operand: String,
    val rawPath: String,
    cause: Throwable,
) : RuntimeException("$operand input '$rawPath' is invalid: ${cause.message}", cause)

private class DiffJsonOperandTooLargeException(
    val path: Path,
    val size: Long,
) : IllegalArgumentException(
        "JSON operand exceeds the maximum size of $MAX_MANIFEST_BYTES bytes: $path ($size bytes)",
    )

internal fun readDiffOperand(
    rawPath: String,
    operand: String,
): DiffSnapshot =
    try {
        readDiffSnapshot(Path.of(rawPath))
    } catch (cancellation: CancellationException) {
        throw cancellation
    } catch (failure: Throwable) {
        throw DiffInputException(operand, rawPath, failure)
    }

private fun readDiffSnapshot(path: Path): DiffSnapshot {
    val absolute = path.toAbsolutePath().normalize()
    require(absolute.exists() || Files.isDirectory(absolute)) { "Input does not exist: $absolute" }
    if (Files.isDirectory(absolute)) {
        return readManifestSnapshot(absolute.resolve("manifest.json"))
    }
    val fileName = absolute.fileName.toString()
    if (fileName.endsWith(".json") || fileName.endsWith(".lock")) {
        requireJsonOperandSize(absolute)
    }
    if (fileName == "manifest.json") return readManifestSnapshot(absolute)
    if (fileName.endsWith(".yaml") || fileName.endsWith(".yml") || fileName.endsWith(".json")) {
        val parsed = runCatching { Json.parseToJsonElement(absolute.readText()).jsonObject }
        if (fileName.endsWith(".yaml") || fileName.endsWith(".yml") || parsed.isFailure) {
            return readConfigSnapshot(absolute)
        }
        val objectValue = requireNotNull(parsed.getOrNull())
        if (
            objectValue["schemaVersion"] != null ||
            objectValue["declarationModelSha256"] != null ||
            objectValue["files"] != null
        ) {
            return readManifestSnapshot(absolute)
        }
        if (objectValue["configDigest"] != null && objectValue["generator"] != null) {
            return readLockSnapshot(absolute)
        }
        return readConfigSnapshot(absolute)
    }
    if (fileName.endsWith(".lock")) return readLockSnapshot(absolute)
    return readManifestSnapshot(absolute)
}

private fun readConfigSnapshot(path: Path): DiffSnapshot {
    val temporaryRoot = Files.createTempDirectory("sdkgen-diff-")
    return try {
        loadInputs(path).use { inputs ->
            val output = temporaryRoot.resolve("generated")
            val result = pipeline().generate(inputs.config, inputs.source, inputs.overlays, output)
            val generated =
                readManifestSnapshot(output.resolve("manifest.json")).copy(
                    path = path,
                    kind = "config",
                    cleanup = { deleteRecursively(temporaryRoot) },
                )
            generated.copy(
                contract =
                    generated.contract.copy(
                        compatibilityProfiles =
                            SnapshotDimension.Available(
                                inputs.config.compatibilityProfiles
                                    .map { SnapshotProfile(it.id, it.version) }
                                    .sortedWith(snapshotProfileComparator),
                            ),
                        plugins =
                            SnapshotDimension.Available(
                                inputs.config.plugins
                                    .filter { it.enabled }
                                    .mapIndexed { index, plugin ->
                                        SnapshotPlugin(
                                            id = plugin.id,
                                            version = plugin.version,
                                            spiRange = plugin.spiRange,
                                            configSha256 = ConfigDigest.sha256(plugin.config),
                                            order = index,
                                            phases = builtInPluginPhases()[plugin.id].orEmpty(),
                                        )
                                    }.sortedWith(snapshotPluginComparator),
                            ),
                        targets =
                            SnapshotDimension.Available(
                                inputs.config.kotlin.targets
                                    .map { it.name.lowercase(Locale.ROOT) }
                                    .sorted(),
                            ),
                        diagnostics =
                            SnapshotDimension.Available(
                                result.diagnostics
                                    .map {
                                        snapshotDiagnostic(it, inputs)
                                    }.sortedWith(snapshotDiagnosticComparator),
                            ),
                        exclusions =
                            SnapshotDimension.Available(
                                result.exclusions
                                    .map {
                                        snapshotExclusion(it, inputs)
                                    }.sortedWith(snapshotExclusionComparator),
                            ),
                        warningsAsErrors =
                            SnapshotDimension.Available(
                                inputs.config.diagnostics.warningsAsErrors,
                            ),
                        warningAllowlist =
                            SnapshotDimension.Available(
                                inputs.config.diagnostics.warningAllowlist
                                    .sorted(),
                            ),
                    ),
            )
        }
    } catch (failure: Throwable) {
        deleteRecursively(temporaryRoot)
        throw failure
    }
}

private fun readLockSnapshot(path: Path): DiffSnapshot {
    val lock = LockCodec.decode(path.readText(), path.toString())
    validateLockSnapshot(lock)
    return DiffSnapshot(
        path = path,
        kind = "lock",
        contract =
            SnapshotContract(
                configDigest = SnapshotDimension.Available(validateSha256(lock.configDigest)),
                source = SnapshotDimension.Available(lock.source.toSnapshotInput()),
                references =
                    SnapshotDimension.Available(
                        lock.source.references
                            .sortedBy(LockedReference::canonicalUri)
                            .map(LockedReference::toSnapshotInput),
                    ),
                overlays =
                    SnapshotDimension.Available(
                        lock.overlays.map(LockedOverlay::toSnapshotOverlay),
                    ),
                generator =
                    SnapshotDimension.Available(
                        SnapshotGenerator(lock.generator.version, lock.generator.edition),
                    ),
                kotlinPoetVersion = SnapshotDimension.Unavailable,
                compatibilityProfiles =
                    SnapshotDimension.Available(
                        lock.compatibilityProfiles
                            .sortedWith(compareBy(LockedCompatibilityProfile::id, LockedCompatibilityProfile::version))
                            .map { SnapshotProfile(it.id, it.version) },
                    ),
                plugins =
                    SnapshotDimension.Available(
                        lock.plugins.mapIndexed { index, plugin ->
                            SnapshotPlugin(
                                id = plugin.id,
                                version = plugin.version,
                                spiRange = plugin.spiRange,
                                configSha256 = plugin.configSha256,
                                order = index,
                                phases = plugin.phases,
                            )
                        },
                    ),
                tools =
                    SnapshotDimension.Available(
                        lock.tools
                            .sortedWith(
                                compareBy({ it.id }, { it.version }),
                            ).map { SnapshotTool(it.id, it.version) },
                    ),
                targets = SnapshotDimension.Unavailable,
                declarationModelSha256 = SnapshotDimension.Unavailable,
                files = SnapshotDimension.Unavailable,
                diagnostics = SnapshotDimension.Unavailable,
                exclusions = SnapshotDimension.Unavailable,
                warningsAsErrors = SnapshotDimension.Unavailable,
                warningAllowlist = SnapshotDimension.Unavailable,
            ),
    )
}

private fun validateLockSnapshot(lock: SdkgenLockV1Alpha1) {
    validateSha256(lock.configDigest)
    validateSha256(lock.source.sha256)
    require(lock.source.contentLength >= 0) { "Lock source content length must not be negative" }
    require(
        lock.source.references
            .map { it.canonicalUri }
            .zipWithNext()
            .all { (before, after) -> before < after },
    ) {
        "Locked references must be in strict canonical URI order"
    }
    require(
        lock.source.references
            .map { it.canonicalUri }
            .distinct()
            .size == lock.source.references.size,
    ) {
        "Locked references must be unique"
    }
    lock.source.references.forEach { reference ->
        validateSha256(reference.sha256)
        require(reference.contentLength >= 0) { "Lock reference content length must not be negative" }
    }
    require(
        lock.overlays
            .map { it.id }
            .distinct()
            .size == lock.overlays.size,
    ) { "Locked overlay IDs must be unique" }
    lock.overlays.forEach { overlay -> validateSha256(overlay.sha256) }
    require(
        lock.compatibilityProfiles
            .map { it.id }
            .distinct()
            .size == lock.compatibilityProfiles.size,
    ) {
        "Locked compatibility profile IDs must be unique"
    }
    require(
        lock.plugins
            .map { it.id }
            .distinct()
            .size == lock.plugins.size,
    ) { "Locked plugin IDs must be unique" }
    lock.plugins.forEach { plugin -> validateSha256(plugin.configSha256) }
}

private fun requireJsonOperandSize(path: Path) {
    val size = Files.size(path)
    if (size > MAX_MANIFEST_BYTES) {
        throw DiffJsonOperandTooLargeException(path, size)
    }
}

private fun readManifestSnapshot(path: Path): DiffSnapshot {
    require(path.exists()) { "Manifest does not exist: $path" }
    require(Files.size(path) <= MAX_MANIFEST_BYTES) {
        "Manifest exceeds the maximum size of $MAX_MANIFEST_BYTES bytes: $path"
    }
    val manifest =
        try {
            MANIFEST_JSON.decodeFromString<ManifestDocument>(path.readText())
        } catch (failure: SerializationException) {
            throw IllegalArgumentException("Manifest could not be decoded: ${failure.message}", failure)
        }
    require(manifest.schemaVersion == "v1alpha1") {
        "Unsupported or missing manifest schemaVersion in $path"
    }
    manifest.files?.let { entries ->
        require(entries.size <= MAX_MANIFEST_FILES) {
            "Manifest declares too many files (${entries.size}); maximum is $MAX_MANIFEST_FILES"
        }
    }
    val fileEntries =
        manifest.files?.map { entry ->
            val declaredPath = validateManifestFilePath(entry.path)
            declaredPath to validateSha256(entry.sha256)
        }
    fileEntries?.let { entries ->
        require(entries.map { it.first }.distinct().size == entries.size) { "Manifest file paths must be unique" }
    }
    val source = manifest.source?.let(::snapshotInput)
    val references = manifest.references?.map(::snapshotInput)
    references?.let { values ->
        require(values.map { it.canonicalUri }.distinct().size == values.size) {
            "Manifest references must be unique"
        }
    }
    val overlays =
        manifest.overlays
            ?.map { value ->
                SnapshotOverlay(
                    id = value.id,
                    canonicalUri = value.canonicalUri,
                    sha256 = validateSha256(value.sha256),
                )
            }
    overlays?.let { values ->
        require(values.map { it.id }.distinct().size == values.size) { "Manifest overlay IDs must be unique" }
    }
    val generator =
        manifest.generatorVersion?.let { version ->
            manifest.edition?.let { edition -> SnapshotGenerator(version, edition) }
        }
    val profiles =
        manifest.compatibilityProfiles?.map { value -> SnapshotProfile(value.id, value.version) }
    profiles?.let { values ->
        require(
            values.map { it.id }.distinct().size == values.size,
        ) { "Manifest compatibility profile IDs must be unique" }
    }
    val plugins =
        manifest.plugins?.map { value ->
            SnapshotPlugin(
                id = value.id,
                version = value.version,
                spiRange = value.spiRange,
                configSha256 = validateSha256(value.configSha256),
                order = value.order,
                phases = value.phases.orEmpty(),
            )
        }
    plugins?.let { values ->
        require(values.map { it.id }.distinct().size == values.size) { "Manifest plugin IDs must be unique" }
    }
    val tools = manifest.tools?.map { value -> SnapshotTool(value.id, value.version) }
    tools?.let { values ->
        require(values.map { it.id }.distinct().size == values.size) { "Manifest tool IDs must be unique" }
    }
    val diagnostics = manifest.diagnostics?.map(::snapshotDiagnosticDocument)?.sortedWith(snapshotDiagnosticComparator)
    val exclusions = manifest.exclusions?.map(::snapshotExclusionDocument)?.sortedWith(snapshotExclusionComparator)
    return DiffSnapshot(
        path = path,
        kind = "manifest",
        contract =
            SnapshotContract(
                configDigest =
                    manifest.configDigest?.let(::validateSha256)?.let { SnapshotDimension.Available(it) }
                        ?: SnapshotDimension.Unavailable,
                source = source?.let { SnapshotDimension.Available(it) } ?: SnapshotDimension.Unavailable,
                references =
                    references?.let { SnapshotDimension.Available(it.sortedWith(snapshotInputComparator)) }
                        ?: SnapshotDimension.Unavailable,
                overlays =
                    overlays?.let { SnapshotDimension.Available(it) }
                        ?: SnapshotDimension.Unavailable,
                generator = generator?.let { SnapshotDimension.Available(it) } ?: SnapshotDimension.Unavailable,
                kotlinPoetVersion =
                    manifest.kotlinPoetVersion?.let { SnapshotDimension.Available(it) }
                        ?: SnapshotDimension.Unavailable,
                compatibilityProfiles =
                    profiles?.let { SnapshotDimension.Available(it.sortedWith(snapshotProfileComparator)) }
                        ?: SnapshotDimension.Unavailable,
                plugins =
                    plugins?.let { SnapshotDimension.Available(it.sortedWith(snapshotPluginComparator)) }
                        ?: SnapshotDimension.Unavailable,
                tools =
                    tools?.let { values ->
                        SnapshotDimension.Available(values.sortedWith(snapshotToolComparator))
                    } ?: SnapshotDimension.Unavailable,
                targets =
                    manifest.targets?.let { SnapshotDimension.Available(it.sorted()) }
                        ?: SnapshotDimension.Unavailable,
                declarationModelSha256 =
                    manifest.declarationModelSha256
                        ?.let(::validateSha256)
                        ?.let { SnapshotDimension.Available(it) } ?: SnapshotDimension.Unavailable,
                files =
                    fileEntries?.let { SnapshotDimension.Available(it.toMap().toSortedMap()) }
                        ?: SnapshotDimension.Unavailable,
                diagnostics =
                    diagnostics?.let {
                        SnapshotDimension.Available(
                            it,
                        )
                    } ?: SnapshotDimension.Unavailable,
                exclusions = exclusions?.let { SnapshotDimension.Available(it) } ?: SnapshotDimension.Unavailable,
                warningsAsErrors =
                    manifest.warningsAsErrors?.let { SnapshotDimension.Available(it) }
                        ?: SnapshotDimension.Unavailable,
                warningAllowlist =
                    manifest.warningAllowlist?.sorted()?.let { SnapshotDimension.Available(it) }
                        ?: SnapshotDimension.Unavailable,
            ),
    )
}

private fun snapshotInput(value: ManifestInputDocument): SnapshotInput =
    SnapshotInput(
        canonicalUri = value.canonicalUri,
        sha256 = validateSha256(value.sha256),
        contentLength = value.contentLength.also { require(it >= 0) },
    )

private fun snapshotDiagnosticDocument(value: ManifestDiagnosticDocument): SnapshotDiagnostic {
    val source = value.source ?: value.sourcePointer
    val severity =
        value.severity?.let { raw ->
            runCatching { DiagnosticSeverity.valueOf(raw.uppercase(Locale.ROOT)) }.getOrNull()
        }
    return SnapshotDiagnostic(
        code = value.code,
        message = value.message,
        severity = severity,
        phase = value.phase,
        documentUri = source?.documentUri.orEmpty(),
        pointer = source?.jsonPointer ?: source?.pointer.orEmpty(),
        rawSeverity = value.severity?.takeIf { severity == null },
        pluginPhase = value.pluginPhase,
    )
}

private fun snapshotExclusionDocument(value: ManifestExclusionDocument): SnapshotExclusion {
    val source = value.source ?: value.sourcePointer
    return SnapshotExclusion(
        symbolId = value.symbolId,
        reason = value.reason,
        documentUri = source?.documentUri.orEmpty(),
        pointer = source?.jsonPointer ?: source?.pointer.orEmpty(),
    )
}

private fun snapshotDiagnostic(value: GenerationDiagnosticView): SnapshotDiagnostic =
    SnapshotDiagnostic(
        value.code,
        value.message,
        value.severity,
        value.phase.name.lowercase(Locale.ROOT),
        value.documentUri,
        value.jsonPointer,
        pluginPhase = value.pluginPhase?.name?.lowercase(Locale.ROOT),
    )

private fun snapshotDiagnostic(
    value: GenerationDiagnosticView,
    inputs: CommandInputs,
): SnapshotDiagnostic =
    SnapshotDiagnostic(
        value.code,
        value.message,
        value.severity,
        value.phase.name.lowercase(Locale.ROOT),
        canonicalDocumentUri(value.documentUri, inputs),
        value.jsonPointer,
        pluginPhase = value.pluginPhase?.name?.lowercase(Locale.ROOT),
    )

private fun snapshotExclusion(
    value: GenerationExclusionView,
    inputs: CommandInputs,
): SnapshotExclusion =
    SnapshotExclusion(
        value.symbolId,
        value.reason,
        canonicalDocumentUri(value.documentUri, inputs),
        value.jsonPointer,
    )

internal fun canonicalDocumentUri(
    documentUri: String,
    inputs: CommandInputs,
): String {
    val knownUris =
        (listOf(inputs.source.canonicalUri) + inputs.source.references.map(ResolvedReference::canonicalUri)).toSet()
    return if (documentUri in knownUris) documentUri else inputs.source.canonicalUri
}

private fun availableDiagnostics(dimension: SnapshotDimension<List<SnapshotDiagnostic>>): List<SnapshotDiagnostic> =
    (dimension as? SnapshotDimension.Available)?.value.orEmpty()

private fun availablePolicy(dimension: SnapshotDimension<Boolean>): Boolean =
    (dimension as? SnapshotDimension.Available)?.value == true

private fun availableWarningAllowlist(dimension: SnapshotDimension<List<String>>): Set<String> =
    (dimension as? SnapshotDimension.Available)?.value?.toSet().orEmpty()

private fun blockingWarningsFor(
    snapshot: DiffSnapshot,
    forceWarningsAsErrors: Boolean,
): List<SnapshotDiagnostic> {
    val policyEnabled = forceWarningsAsErrors || availablePolicy(snapshot.contract.warningsAsErrors)
    if (!policyEnabled) return emptyList()
    val allowlist =
        if (forceWarningsAsErrors) {
            emptySet<String>()
        } else {
            availableWarningAllowlist(snapshot.contract.warningAllowlist)
        }
    return availableDiagnostics(snapshot.contract.diagnostics).filter { diagnostic ->
        diagnostic.severity == DiagnosticSeverity.WARNING && diagnostic.code !in allowlist
    }
}

private fun validateManifestFilePath(value: String): String {
    val normalized = value.replace('\\', '/')
    require(normalized.length <= MAX_MANIFEST_PATH_LENGTH) {
        "Manifest file path exceeds the maximum length of $MAX_MANIFEST_PATH_LENGTH: $value"
    }
    require(normalized.none { character -> character.code == 0 }) {
        "Manifest file path must not contain NUL: $value"
    }
    require(normalized.isNotBlank()) { "Manifest file path must not be empty" }
    require(!normalized.startsWith('/') && !normalized.startsWith('\\')) {
        "Manifest file path must be relative: $value"
    }
    require(!(normalized.length >= 2 && normalized[1] == ':')) {
        "Manifest file path must be relative: $value"
    }
    val segments = normalized.split('/')
    require(segments.none { it == ".." }) { "Manifest file path must not traverse its root: $value" }
    require(segments.none { it.isEmpty() || it == "." }) { "Manifest file path is not canonical: $value" }
    return normalized
}

private fun validateSha256(value: String): String {
    require(Regex("^[0-9a-fA-F]{64}$").matches(value)) { "Invalid SHA-256 digest: $value" }
    return value.lowercase(Locale.ROOT)
}

private fun LockedSource.toSnapshotInput(): SnapshotInput =
    SnapshotInput(canonicalUri, validateSha256(sha256), contentLength.also { require(it >= 0) })

private fun LockedReference.toSnapshotInput(): SnapshotInput =
    SnapshotInput(canonicalUri, validateSha256(sha256), contentLength.also { require(it >= 0) })

private fun LockedOverlay.toSnapshotOverlay(): SnapshotOverlay =
    SnapshotOverlay(id, canonicalUri, validateSha256(sha256))

private val snapshotInputComparator = compareBy<SnapshotInput>({ it.canonicalUri }, { it.sha256 }, { it.contentLength })
private val snapshotToolComparator = compareBy<SnapshotTool>({ it.id }, { it.version })
private val snapshotProfileComparator = compareBy<SnapshotProfile>({ it.id }, { it.version })
private val snapshotPluginComparator =
    compareBy<SnapshotPlugin>(
        { it.order ?: Int.MAX_VALUE },
        { it.id },
        { it.version },
        { it.spiRange },
        { it.configSha256 },
        { it.phases.joinToString(" ") },
    )
private val snapshotDiagnosticComparator =
    compareBy<SnapshotDiagnostic>(
        { it.phase.orEmpty() },
        { it.pluginPhase.orEmpty() },
        { it.documentUri },
        { it.pointer },
        { it.code },
        { it.message },
        { it.severity?.name.orEmpty() },
        { it.rawSeverity.orEmpty() },
    )
private val snapshotExclusionComparator =
    compareBy<SnapshotExclusion>({ it.documentUri }, { it.pointer }, { it.symbolId }, { it.reason })
private val diffChangeComparator =
    compareBy<DiffChange>(
        { it.kind },
        { it.subject },
        { it.status },
        { it.impact },
        { it.from.orEmpty() },
        { it.to.orEmpty() },
    )

private data class DimensionComparison(
    val change: DiffChange? = null,
    val unavailable: Boolean = false,
)

private fun <T> compareDimension(
    kind: String,
    subject: String,
    from: SnapshotDimension<T>,
    to: SnapshotDimension<T>,
    format: (T) -> String = { it.toString() },
): DimensionComparison =
    when {
        from is SnapshotDimension.Available && to is SnapshotDimension.Available && from.value != to.value -> {
            DimensionComparison(
                change =
                    DiffChange(
                        kind = kind,
                        subject = subject,
                        status = "changed",
                        impact = "potentially-breaking",
                        from = format(from.value),
                        to = format(to.value),
                    ),
            )
        }

        from is SnapshotDimension.Unavailable || to is SnapshotDimension.Unavailable -> {
            DimensionComparison(unavailable = true)
        }

        else -> {
            DimensionComparison()
        }
    }

private const val MAX_DIFF_CHANGES = 100
private const val MAX_DIFF_DIAGNOSTICS = 100
private const val MAX_MANIFEST_FILES = 10_000
private const val MAX_MANIFEST_PATH_LENGTH = 4096
private const val MAX_MANIFEST_BYTES = 16 * 1024 * 1024

internal fun compareDiffSnapshots(
    from: DiffSnapshot,
    to: DiffSnapshot,
    warningsAsErrors: Boolean,
): DiffReport {
    val changes = mutableListOf<DiffChange>()
    val unavailable = mutableSetOf<String>()
    val fileChanges = mutableListOf<DiffChange>()
    var fileChangesTruncated = false

    fun <T> addDimension(
        kind: String,
        subject: String,
        fromDimension: SnapshotDimension<T>,
        toDimension: SnapshotDimension<T>,
        format: (T) -> String = { it.toString() },
    ) {
        compareDimension(kind, subject, fromDimension, toDimension, format).let { comparison ->
            comparison.change?.let { changes += it }
            if (comparison.unavailable) unavailable += subject
        }
    }

    addDimension("configuration", "configDigest", from.contract.configDigest, to.contract.configDigest)
    addDimension("effective-contract", "source", from.contract.source, to.contract.source)
    addDimension("effective-contract", "references", from.contract.references, to.contract.references)
    addDimension("effective-contract", "overlays", from.contract.overlays, to.contract.overlays)
    addDimension("effective-contract", "generator", from.contract.generator, to.contract.generator)
    addDimension(
        "effective-contract",
        "kotlinPoetVersion",
        from.contract.kotlinPoetVersion,
        to.contract.kotlinPoetVersion,
    )
    addDimension(
        "effective-contract",
        "compatibilityProfiles",
        from.contract.compatibilityProfiles,
        to.contract.compatibilityProfiles,
    )
    addDimension("effective-contract", "plugins", from.contract.plugins, to.contract.plugins)
    addDimension("effective-contract", "tools", from.contract.tools, to.contract.tools)
    addDimension("effective-contract", "targets", from.contract.targets, to.contract.targets)
    addDimension("configuration", "warningsAsErrors", from.contract.warningsAsErrors, to.contract.warningsAsErrors)
    addDimension("configuration", "warningAllowlist", from.contract.warningAllowlist, to.contract.warningAllowlist)

    val semanticComparison =
        when {
            from.contract.declarationModelSha256 is SnapshotDimension.Available &&
                to.contract.declarationModelSha256 is SnapshotDimension.Available -> {
                if (from.contract.declarationModelSha256.value == to.contract.declarationModelSha256.value) {
                    "unchanged"
                } else {
                    "changed"
                }
            }

            else -> {
                "unavailable"
            }
        }
    addDimension(
        "generated-semantic",
        "declarationModelSha256",
        from.contract.declarationModelSha256,
        to.contract.declarationModelSha256,
    )
    addDimension("generated-semantic", "diagnostics", from.contract.diagnostics, to.contract.diagnostics)
    addDimension("generated-semantic", "exclusions", from.contract.exclusions, to.contract.exclusions)

    val fromFiles = from.contract.files
    val toFiles = to.contract.files
    when {
        fromFiles is SnapshotDimension.Available && toFiles is SnapshotDimension.Available -> {
            (fromFiles.value.keys + toFiles.value.keys).toSortedSet().forEach { path ->
                val before = fromFiles.value[path]
                val after = toFiles.value[path]
                if (before != after) {
                    val status = changeStatus(before, after)
                    if (fileChanges.size < MAX_DIFF_CHANGES + 1) {
                        fileChanges +=
                            DiffChange(
                                kind = "kotlin-api",
                                subject = path,
                                status = status,
                                impact =
                                    when (status) {
                                        "removed" -> "breaking"
                                        "added" -> "non-breaking"
                                        else -> "potentially-breaking"
                                    },
                                from = before,
                                to = after,
                            )
                    } else {
                        fileChangesTruncated = true
                    }
                }
            }
        }

        else -> {
            unavailable += "files"
        }
    }
    changes += fileChanges

    val allDiagnostics =
        (availableDiagnostics(from.contract.diagnostics) + availableDiagnostics(to.contract.diagnostics))
            .distinct()
            .sortedWith(snapshotDiagnosticComparator)
    val effectiveWarningsAsErrors =
        warningsAsErrors || availablePolicy(from.contract.warningsAsErrors) ||
            availablePolicy(to.contract.warningsAsErrors)
    val blockingWarnings =
        (blockingWarningsFor(from, warningsAsErrors) + blockingWarningsFor(to, warningsAsErrors))
            .distinct()
            .sortedWith(snapshotDiagnosticComparator)
    if (blockingWarnings.isNotEmpty()) {
        changes +=
            DiffChange(
                kind = "generated-semantic",
                subject = "warnings-as-errors",
                status = "changed",
                impact = "potentially-breaking",
                to = blockingWarnings.size.toString(),
            )
    }

    val sorted = changes.distinct().sortedWith(diffChangeComparator)
    val apiImpact =
        when {
            sorted.any { it.impact == "breaking" } -> "breaking"
            sorted.any { it.kind == "kotlin-api" || it.impact == "potentially-breaking" } -> "potentially-breaking"
            sorted.isNotEmpty() -> "non-breaking"
            else -> "none"
        }
    val truncated = fileChangesTruncated || sorted.size > MAX_DIFF_CHANGES || allDiagnostics.size > MAX_DIFF_DIAGNOSTICS
    val warningAllowlist =
        (
            availableWarningAllowlist(from.contract.warningAllowlist) +
                availableWarningAllowlist(to.contract.warningAllowlist)
        ).toSortedSet().toList()
    return DiffReport(
        fromKind = from.kind,
        toKind = to.kind,
        changes = sorted.take(MAX_DIFF_CHANGES),
        apiImpact = apiImpact,
        semanticComparison = semanticComparison,
        warningsAsErrors = effectiveWarningsAsErrors,
        warningAllowlist = warningAllowlist,
        diagnostics = allDiagnostics.take(MAX_DIFF_DIAGNOSTICS),
        unavailableDimensions = unavailable.toList().sorted(),
        truncated = truncated,
        hasBlockingDiagnostics =
            allDiagnostics.any { diagnostic -> diagnostic.severity == DiagnosticSeverity.ERROR } ||
                blockingWarnings.isNotEmpty(),
    )
}

private fun changeStatus(
    before: String?,
    after: String?,
): String =
    when {
        before == null -> "added"
        after == null -> "removed"
        else -> "changed"
    }

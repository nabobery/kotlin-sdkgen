@file:OptIn(ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine.spi

import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourcePointer
import kotlin.RequiresOptIn

/** Preview-only API for extending SDKGen's typed generation phases. */
@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.TYPEALIAS,
)
public annotation class ExperimentalSdkGenApi

internal object PluginSpiRange {
    const val CURRENT_ENGINE_SPI_VERSION: String = "0.1"

    enum class Validation {
        VALID,
        INVALID_SYNTAX,
        INCOMPATIBLE,
    }

    fun validate(value: String): Validation {
        val match = RANGE.matchEntire(value) ?: return Validation.INVALID_SYNTAX
        val lower = version(match, 1, 2) ?: return Validation.INVALID_SYNTAX
        val upper = version(match, 3, 4) ?: return Validation.INVALID_SYNTAX
        if (lower >= upper) return Validation.INVALID_SYNTAX
        return if (CURRENT < lower || CURRENT >= upper) Validation.INCOMPATIBLE else Validation.VALID
    }

    private fun version(
        match: MatchResult,
        majorGroup: Int,
        minorGroup: Int,
    ): SpiVersion? {
        val major = match.groupValues[majorGroup].toIntOrNull() ?: return null
        val minor = match.groupValues[minorGroup].toIntOrNull() ?: return null
        return SpiVersion(major, minor)
    }

    private data class SpiVersion(
        val major: Int,
        val minor: Int,
    ) : Comparable<SpiVersion> {
        override fun compareTo(other: SpiVersion): Int =
            compareValuesBy(this, other, SpiVersion::major, SpiVersion::minor)
    }

    private val CURRENT =
        CURRENT_ENGINE_SPI_VERSION.split('.').let { parts ->
            SpiVersion(parts[0].toInt(), parts[1].toInt())
        }
    private val RANGE =
        Regex(
            """^>=(0|[1-9][0-9]*)\.(0|[1-9][0-9]*) <(0|[1-9][0-9]*)\.(0|[1-9][0-9]*)$""",
        )
}

/** The ordered phases exposed by the preview plugin contract. */
@ExperimentalSdkGenApi
public enum class SdkGenPluginPhase {
    VALIDATION,
    SEMANTIC_TRANSFORM,
    NAMING_TYPE_MAPPING,
    DECLARATION_AUGMENTATION,
    OUTPUT_VERIFICATION,
}

/** Identity and supported phase range recorded for one plugin implementation. */
@ExperimentalSdkGenApi
public class PluginDescriptor(
    public val id: String,
    public val version: String,
    public val spiRange: String,
    phases: List<SdkGenPluginPhase> = emptyList(),
) {
    public val phases: List<SdkGenPluginPhase> = immutableList(phases)

    init {
        require(id.isNotBlank()) { "Plugin ID must not be blank" }
        require(version.isNotBlank()) { "Plugin version must not be blank" }
        require(spiRange.isNotBlank()) { "Plugin SPI range must not be blank" }
        require(phases == phases.distinct()) { "Plugin phases must not be duplicated" }
        require(phases == phases.sortedBy(SdkGenPluginPhase::ordinal)) {
            "Plugin phases must be listed in canonical phase order"
        }
    }

    override fun equals(other: Any?): Boolean =
        other is PluginDescriptor &&
            id == other.id &&
            version == other.version &&
            spiRange == other.spiRange &&
            phases == other.phases

    override fun hashCode(): Int = listOf(id, version, spiRange, phases).hashCode()

    override fun toString(): String = "PluginDescriptor(id=$id, version=$version, spiRange=$spiRange, phases=$phases)"
}

/** An immutable, source-linked diagnostic emitted by a plugin or by the SPI engine. */
@ExperimentalSdkGenApi
public data class PluginDiagnostic(
    public val code: String,
    public val severity: DiagnosticSeverity,
    public val phase: SdkGenPluginPhase,
    public val message: String,
    public val remediation: String,
    public val source: SourcePointer,
    public val pluginId: String = "",
)

/** The context supplied to every plugin invocation. */
@ExperimentalSdkGenApi
public class PluginContext(
    public val descriptor: PluginDescriptor,
    config: Map<String, String>,
    public val source: SourcePointer,
) {
    public val config: Map<String, String> = immutableMap(config)

    public fun diagnostic(
        code: String,
        phase: SdkGenPluginPhase,
        message: String,
        remediation: String,
        source: SourcePointer = this.source,
        severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
    ): PluginDiagnostic =
        PluginDiagnostic(
            code = code,
            severity = severity,
            phase = phase,
            message = message,
            remediation = remediation,
            source = source,
            pluginId = descriptor.id,
        )
}

/** A typed plugin result. A transforming plugin must return a new [Applied] value. */
@ExperimentalSdkGenApi
public sealed interface PluginPhaseResult<out T> {
    public data class Applied<T>(
        public val value: T,
    ) : PluginPhaseResult<T>

    public class Rejected(
        diagnostics: List<PluginDiagnostic>,
    ) : PluginPhaseResult<Nothing> {
        public val diagnostics: List<PluginDiagnostic> = immutableList(diagnostics)
    }
}

/** The validation phase value. Diagnostics are accumulated without mutating the document. */
@ExperimentalSdkGenApi
public class ValidationPhaseValue(
    document: SemanticDocument,
    diagnostics: List<PluginDiagnostic> = emptyList(),
) {
    public val document: SemanticDocument = document.immutableSnapshot()
    public val diagnostics: List<PluginDiagnostic> = immutableList(diagnostics)

    public fun copy(
        document: SemanticDocument = this.document,
        diagnostics: List<PluginDiagnostic> = this.diagnostics,
    ): ValidationPhaseValue = ValidationPhaseValue(document, diagnostics)

    override fun equals(other: Any?): Boolean =
        other is ValidationPhaseValue && document == other.document && diagnostics == other.diagnostics

    override fun hashCode(): Int = 31 * document.hashCode() + diagnostics.hashCode()

    override fun toString(): String = "ValidationPhaseValue(document=$document, diagnostics=$diagnostics)"
}

/** The semantic transformation value. A transformer replaces this value rather than mutating it. */
@ExperimentalSdkGenApi
public class SemanticTransformPhaseValue(
    document: SemanticDocument,
) {
    public val document: SemanticDocument = document.immutableSnapshot()

    public fun copy(document: SemanticDocument = this.document): SemanticTransformPhaseValue =
        SemanticTransformPhaseValue(document)

    override fun equals(other: Any?): Boolean = other is SemanticTransformPhaseValue && document == other.document

    override fun hashCode(): Int = document.hashCode()

    override fun toString(): String = "SemanticTransformPhaseValue(document=$document)"
}

/** A requested name change, retaining the source that authored the request. */
@ExperimentalSdkGenApi
public data class NamingOverride(
    public val key: String,
    public val value: String,
    public val source: SourcePointer,
)

/** The naming and type-mapping value passed between projection plugins. */
@ExperimentalSdkGenApi
public class NamingTypeMappingPhaseValue(
    public val clientName: String,
    public val modelPrefix: String? = null,
    public val operationPrefix: String? = null,
    overrides: List<NamingOverride> = emptyList(),
) {
    public val overrides: List<NamingOverride> = immutableList(overrides)

    public fun copy(
        clientName: String = this.clientName,
        modelPrefix: String? = this.modelPrefix,
        operationPrefix: String? = this.operationPrefix,
        overrides: List<NamingOverride> = this.overrides,
    ): NamingTypeMappingPhaseValue = NamingTypeMappingPhaseValue(clientName, modelPrefix, operationPrefix, overrides)

    override fun equals(other: Any?): Boolean =
        other is NamingTypeMappingPhaseValue &&
            clientName == other.clientName &&
            modelPrefix == other.modelPrefix &&
            operationPrefix == other.operationPrefix &&
            overrides == other.overrides

    override fun hashCode(): Int = listOf(clientName, modelPrefix, operationPrefix, overrides).hashCode()

    override fun toString(): String =
        "NamingTypeMappingPhaseValue(clientName=$clientName, modelPrefix=$modelPrefix, " +
            "operationPrefix=$operationPrefix, overrides=$overrides)"
}

/** A read-only declaration snapshot available to augmentation plugins. */
@ExperimentalSdkGenApi
public data class DeclarationSnapshot(
    public val symbolId: String,
    public val resolvedName: String,
    public val packageName: String,
    public val fileName: String,
    public val source: SourcePointer,
) {
    internal var emittedNamesFor: (String) -> List<String> = { name -> listOf(name) }
}

/** A typed, source-linked request to augment one declaration. */
@ExperimentalSdkGenApi
public data class DeclarationAugmentation(
    public val symbolId: String,
    public val resolvedName: String? = null,
    public val kdoc: String? = null,
    public val source: SourcePointer,
)

/** The declaration augmentation value passed after standard projection. */
@ExperimentalSdkGenApi
public class DeclarationAugmentationPhaseValue(
    declarations: List<DeclarationSnapshot>,
    augmentations: List<DeclarationAugmentation> = emptyList(),
) {
    public val declarations: List<DeclarationSnapshot> = immutableList(declarations)
    public val augmentations: List<DeclarationAugmentation> = immutableList(augmentations)

    public fun copy(
        declarations: List<DeclarationSnapshot> = this.declarations,
        augmentations: List<DeclarationAugmentation> = this.augmentations,
    ): DeclarationAugmentationPhaseValue = DeclarationAugmentationPhaseValue(declarations, augmentations)

    override fun equals(other: Any?): Boolean =
        other is DeclarationAugmentationPhaseValue &&
            declarations == other.declarations &&
            augmentations == other.augmentations

    override fun hashCode(): Int = 31 * declarations.hashCode() + augmentations.hashCode()

    override fun toString(): String =
        "DeclarationAugmentationPhaseValue(declarations=$declarations, augmentations=$augmentations)"
}

/** Immutable metadata for one rendered output file. */
@ExperimentalSdkGenApi
public data class GeneratedFileSnapshot(
    public val path: String,
    public val sha256: String,
    public val byteCount: Long,
) {
    init {
        require(path.isNotBlank()) { "Generated file path must not be blank" }
        require(sha256.matches(SHA256)) { "Generated file digest must be lowercase SHA-256" }
        require(byteCount >= 0) { "Generated file byte count must not be negative" }
    }

    private companion object {
        val SHA256 = Regex("^[0-9a-f]{64}$")
    }
}

/** The output verification value. Verification plugins may append diagnostics, never mutate files. */
@ExperimentalSdkGenApi
public class OutputVerificationPhaseValue(
    files: List<GeneratedFileSnapshot>,
    diagnostics: List<PluginDiagnostic> = emptyList(),
) {
    public val files: List<GeneratedFileSnapshot> = immutableList(files)
    public val diagnostics: List<PluginDiagnostic> = immutableList(diagnostics)

    public fun copy(
        files: List<GeneratedFileSnapshot> = this.files,
        diagnostics: List<PluginDiagnostic> = this.diagnostics,
    ): OutputVerificationPhaseValue = OutputVerificationPhaseValue(files, diagnostics)

    override fun equals(other: Any?): Boolean =
        other is OutputVerificationPhaseValue && files == other.files && diagnostics == other.diagnostics

    override fun hashCode(): Int = 31 * files.hashCode() + diagnostics.hashCode()

    override fun toString(): String = "OutputVerificationPhaseValue(files=$files, diagnostics=$diagnostics)"
}

/** Input to [SdkGenPluginEngine]. Later phases are optional for staged pipeline execution. */
@ExperimentalSdkGenApi
public class PluginPipelineInput(
    public val source: SourcePointer,
    document: SemanticDocument,
    public val naming: NamingTypeMappingPhaseValue,
    public val declarations: DeclarationAugmentationPhaseValue? = null,
    public val output: OutputVerificationPhaseValue? = null,
    initialDiagnostics: List<PluginDiagnostic> = emptyList(),
) {
    public val document: SemanticDocument = document.immutableSnapshot()
    public val initialDiagnostics: List<PluginDiagnostic> = immutableList(initialDiagnostics)
    internal val skippedPluginIds: MutableSet<String> = linkedSetOf()
}

/** A deterministic record suitable for both manifest and lock publication. */
@ExperimentalSdkGenApi
public class PluginRecord(
    public val id: String,
    public val version: String,
    public val spiRange: String,
    public val configDigest: String,
    phases: List<SdkGenPluginPhase> = emptyList(),
) {
    public val phases: List<SdkGenPluginPhase> = immutableList(phases)

    override fun equals(other: Any?): Boolean =
        other is PluginRecord &&
            id == other.id &&
            version == other.version &&
            spiRange == other.spiRange &&
            configDigest == other.configDigest &&
            phases == other.phases

    override fun hashCode(): Int = listOf(id, version, spiRange, configDigest, phases).hashCode()

    override fun toString(): String =
        "PluginRecord(id=$id, version=$version, spiRange=$spiRange, configDigest=$configDigest, phases=$phases)"
}

/** Output of a staged plugin run. Lists are defensive copies and preserve configured order. */
@ExperimentalSdkGenApi
public class PluginPipelineResult(
    document: SemanticDocument,
    public val naming: NamingTypeMappingPhaseValue,
    public val declarations: DeclarationAugmentationPhaseValue?,
    public val output: OutputVerificationPhaseValue?,
    diagnostics: List<PluginDiagnostic>,
    records: List<PluginRecord>,
    executionOrder: List<String>,
) {
    public val document: SemanticDocument = document.immutableSnapshot()
    public val diagnostics: List<PluginDiagnostic> = immutableList(diagnostics)
    public val records: List<PluginRecord> = immutableList(records)
    public val executionOrder: List<String> = immutableList(executionOrder)
    internal var skippedPluginIds: List<String> = emptyList()
}

/** Base identity contract implemented by every plugin. */
@ExperimentalSdkGenApi
public interface SdkGenPlugin {
    public val descriptor: PluginDescriptor
}

/** Validation plugins inspect the semantic document and return a new accumulated value. */
@ExperimentalSdkGenApi
public interface ValidationPlugin : SdkGenPlugin {
    public fun validate(
        input: ValidationPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<ValidationPhaseValue>
}

/** Semantic plugins replace the immutable semantic document with a validated new value. */
@ExperimentalSdkGenApi
public interface SemanticTransformPlugin : SdkGenPlugin {
    public fun transformSemantic(
        input: SemanticTransformPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<SemanticTransformPhaseValue>
}

/** Naming/type plugins return a new typed mapping value. */
@ExperimentalSdkGenApi
public interface NamingTypeMappingPlugin : SdkGenPlugin {
    public fun mapNamesAndTypes(
        input: NamingTypeMappingPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<NamingTypeMappingPhaseValue>
}

/** Declaration plugins return a new augmentation value over immutable declaration snapshots. */
@ExperimentalSdkGenApi
public interface DeclarationAugmentationPlugin : SdkGenPlugin {
    public fun augmentDeclarations(
        input: DeclarationAugmentationPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<DeclarationAugmentationPhaseValue>
}

/** Output plugins verify immutable rendered-file metadata before publication. */
@ExperimentalSdkGenApi
public interface OutputVerificationPlugin : SdkGenPlugin {
    public fun verifyOutput(
        input: OutputVerificationPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<OutputVerificationPhaseValue>
}

/** Explicitly ordered registry; discovery is intentionally not implicit in the preview. */
@ExperimentalSdkGenApi
public class SdkGenPluginRegistry(
    plugins: List<SdkGenPlugin>,
) {
    public val plugins: List<SdkGenPlugin> = immutableList(plugins)

    init {
        require(
            this.plugins
                .map { it.descriptor.id }
                .distinct()
                .size == this.plugins.size,
        ) {
            "Plugin IDs must be unique in a registry"
        }
    }

    public fun find(id: String): SdkGenPlugin? = plugins.firstOrNull { it.descriptor.id == id }
}

/** Built-ins used by the engine before any third-party discovery is introduced. */
@ExperimentalSdkGenApi
public object BuiltInSdkGenPlugins {
    public const val NAMING_OVERRIDE_ID: String = "com.nabobery.sdkgen.builtin.naming-override"
    public const val OUTPUT_VERIFICATION_ID: String = "com.nabobery.sdkgen.builtin.output-verification"

    public fun registry(): SdkGenPluginRegistry =
        SdkGenPluginRegistry(
            listOf(
                NamingOverridePlugin,
                OutputVerificationPluginImpl,
            ),
        )
}

@ExperimentalSdkGenApi
public object NamingOverridePlugin : NamingTypeMappingPlugin {
    public override val descriptor: PluginDescriptor =
        PluginDescriptor(
            id = BuiltInSdkGenPlugins.NAMING_OVERRIDE_ID,
            version = "0.1.0",
            spiRange = ">=0.1 <0.2",
            phases = listOf(SdkGenPluginPhase.NAMING_TYPE_MAPPING),
        )

    public override fun mapNamesAndTypes(
        input: NamingTypeMappingPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
        val clientName = context.config["clientName"] ?: return PluginPhaseResult.Applied(input)
        val source = context.source.copy(jsonPointer = "${context.source.jsonPointer}/config/clientName")
        return PluginPhaseResult.Applied(
            input.copy(
                overrides = input.overrides + NamingOverride("clientName", clientName, source),
            ),
        )
    }
}

@ExperimentalSdkGenApi
private object OutputVerificationPluginImpl : OutputVerificationPlugin {
    override val descriptor: PluginDescriptor =
        PluginDescriptor(
            id = BuiltInSdkGenPlugins.OUTPUT_VERIFICATION_ID,
            version = "0.1.0",
            spiRange = ">=0.1 <0.2",
            phases = listOf(SdkGenPluginPhase.OUTPUT_VERIFICATION),
        )

    override fun verifyOutput(
        input: OutputVerificationPhaseValue,
        context: PluginContext,
    ): PluginPhaseResult<OutputVerificationPhaseValue> {
        val diagnostics =
            input.files.flatMap { file ->
                if (file.byteCount > 0) {
                    emptyList()
                } else {
                    listOf(
                        context.diagnostic(
                            code = "SDKGEN-PLUGIN-EMPTY-OUTPUT",
                            phase = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                            message = "Generated output file '${file.path}' is empty.",
                            remediation = "Fix the emitter or remove the empty generated file before publishing.",
                            source = context.source.copy(jsonPointer = "/output/${file.path}"),
                        ),
                    )
                }
            }
        return PluginPhaseResult.Applied(input.copy(diagnostics = input.diagnostics + diagnostics))
    }
}

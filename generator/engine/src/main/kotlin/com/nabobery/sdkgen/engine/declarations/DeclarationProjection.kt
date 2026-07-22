@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.spi.SdkGenPluginPhase
import com.nabobery.sdkgen.model.Diagnostic
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourcePointer

internal data class DeclarationMappingResult(
    val model: KotlinDeclarationModel,
    val diagnostics: List<GenerationDiagnostic>,
    val exclusions: List<GenerationExclusion>,
    val origins: Map<String, SourcePointer> = emptyMap(),
)

internal enum class GenerationDiagnosticCode(
    val wireCode: String,
) {
    PROJECTION_FAILED("SDKGEN-PROJECTION-FAILED"),
    UNREPRESENTABLE_OPERATION("SDKGEN-PROJECTION-UNREPRESENTABLE-OPERATION"),
    UNREPRESENTABLE_RAW_RESPONSE_ALTERNATIVE("SDKGEN-PROJECTION-UNREPRESENTABLE-RAW-RESPONSE-ALTERNATIVE"),
    UNREPRESENTABLE_SCHEMA("SDKGEN-PROJECTION-UNREPRESENTABLE-SCHEMA"),
    MIXED_RESPONSE_MODES("SDKGEN-PROJECTION-MIXED-RESPONSE-MODES"),
    INCOMPATIBLE_SUCCESS_RESPONSE_SHAPES("SDKGEN-PROJECTION-INCOMPATIBLE-SUCCESS-RESPONSE-SHAPES"),
    NAME_COLLISION("SDKGEN-NAMING-COLLISION"),
    SEMANTIC("SDKGEN-SEMANTIC-DIAGNOSTIC"),
}

internal data class GenerationDiagnostic(
    val code: GenerationDiagnosticCode,
    val message: String,
    val source: SourcePointer,
    val symbolId: String,
    val sourceCode: String? = null,
    val severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
    val phase: DiagnosticPhase = DiagnosticPhase.ADAPTATION,
    val pluginPhase: SdkGenPluginPhase? = null,
    val remediation: String = "Correct the reported input and rerun generation.",
) {
    val wireCode: String
        get() = sourceCode ?: code.wireCode

    companion object {
        fun fromSemantic(diagnostic: Diagnostic): GenerationDiagnostic =
            GenerationDiagnostic(
                code = GenerationDiagnosticCode.SEMANTIC,
                message = diagnostic.message,
                source = diagnostic.source,
                symbolId = diagnostic.relatedSymbolId ?: "semantic:${diagnostic.code}:${diagnostic.source.jsonPointer}",
                sourceCode = "SDKGEN-${diagnostic.code.name.replace('_', '-')}",
                severity = diagnostic.severity,
                phase = diagnostic.phase,
                remediation = diagnostic.remediation,
            )
    }
}

internal enum class GenerationExclusionKind {
    SCHEMA,
    OPERATION,
}

internal data class GenerationExclusion(
    val kind: GenerationExclusionKind,
    val symbolId: String,
    val diagnosticCode: String,
    val reason: String,
    val source: SourcePointer,
)

internal data class DeclarationProjectionRequest(
    val document: SemanticDocument,
    val packageName: String,
    val canonicalDocumentUri: String,
    val clientName: String,
    val modelPrefix: String? = null,
    val operationPrefix: String? = null,
    val runtimeDefaults: RuntimeDefaults = RuntimeDefaults(),
)

internal fun interface DeclarationProjection {
    fun project(request: DeclarationProjectionRequest): DeclarationMappingResult
}

@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.Diagnostic
import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.SchemaId
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SourcePointer
import java.util.TreeMap

/**
 * Shared adaptation state for a single OpenAPI document: the [SourceRepository] used to resolve
 * `$ref`s, the [rootDocument] being adapted, the accumulated schema table and recursion guard, and
 * the diagnostics sink. Schema adaptation ([SchemaAdapter.kt]), operation adaptation
 * ([OperationAdapter.kt]), and JSON value conversion ([JsonValueAdapter.kt]) are implemented as
 * extension functions over this one context so state is never duplicated across the split.
 */
internal class AdaptationContext(
    internal val repository: SourceRepository,
    internal val rootDocument: SourceDocument,
) {
    val schemas = TreeMap<SchemaId, SchemaModel>()
    val diagnostics = mutableListOf<Diagnostic>()
    internal val schemasInProgress = mutableSetOf<SchemaId>()

    fun canonicalSchemaId(
        document: SourceDocument,
        pointer: String,
    ): SchemaId = SchemaId("${document.canonicalUri}#$pointer")

    fun addDiagnostic(
        code: DiagnosticCode,
        message: String,
        source: SourcePointer,
        severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
        phase: DiagnosticPhase = DiagnosticPhase.ADAPTATION,
        remediation: String = "Correct the source contract or apply an explicit overlay before retrying generation.",
    ) {
        diagnostics += Diagnostic(code, severity, phase, message, remediation, source)
    }
}

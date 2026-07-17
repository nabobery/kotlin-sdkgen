@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.nabobery.sdkgen.model.DiagnosticCode
import com.nabobery.sdkgen.model.DiagnosticPhase
import kotlin.io.path.name
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DiagnosticsTest {
    private val adapter = SemanticAdapter()

    @Test
    fun `unsupported and ambiguous constructs emit typed actionable source diagnostics`() {
        val cases =
            listOf(
                DiagnosticCase("boolean-schema.yaml", DiagnosticCode.UNSUPPORTED_BOOLEAN_SCHEMA),
                DiagnosticCase("contains.yaml", DiagnosticCode.UNSUPPORTED_SCHEMA_KEYWORD),
                DiagnosticCase("dependent-schemas.yaml", DiagnosticCode.UNSUPPORTED_SCHEMA_KEYWORD),
                DiagnosticCase("pattern-properties.yaml", DiagnosticCode.UNSUPPORTED_SCHEMA_KEYWORD),
                DiagnosticCase("ambiguous-parameter.yaml", DiagnosticCode.AMBIGUOUS_PARAMETER_SCHEMA_AND_CONTENT),
                DiagnosticCase("path-traversal.yaml", DiagnosticCode.UNRESOLVED_REFERENCE),
            )

        cases.forEach { case ->
            val fixture = ExperimentSupport.fixtureRoot.resolve("diagnostics/${case.fileName}")
            val result = adapter.adapt(fixture)
            val diagnostic = result.document.diagnostics.single { it.code == case.code }

            assertEquals(case.code, diagnostic.code, fixture.name)
            assertTrue(
                diagnostic.phase == DiagnosticPhase.ADAPTATION || diagnostic.phase == DiagnosticPhase.NORMALIZATION,
            )
            assertTrue(diagnostic.remediation.isNotBlank(), fixture.name)
            assertTrue(diagnostic.source.documentUri.endsWith(case.fileName), diagnostic.source.documentUri)
            assertTrue(diagnostic.source.location.line > 0, fixture.name)
            assertTrue(diagnostic.source.location.column > 0, fixture.name)
            assertTrue(diagnostic.source.location.byteOffset >= 0, fixture.name)
        }
    }

    @Test
    fun `corpus stress fixtures remain lossless while diagnostic coverage is active`() {
        ExperimentSupport.stressFixtures.take(5).forEach { fixture ->
            val result = adapter.adapt(fixture)

            assertEquals(0, result.metrics.silentSchemaOmissions, fixture.name)
            assertEquals(0, result.metrics.silentOperationOmissions, fixture.name)
            assertTrue(
                result.document.diagnostics.none { it.code == DiagnosticCode.UNSUPPORTED_SCHEMA_KEYWORD },
                fixture.name,
            )
        }
    }
}

private data class DiagnosticCase(
    val fileName: String,
    val code: DiagnosticCode,
)

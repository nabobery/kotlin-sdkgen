package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SourceContractCompatibilityClassifierTest {
    @Test
    fun reorderedSourceEvidenceIsUnchangedButPinnedInputChangeIsUnknown() {
        val before = evidence(sourceSha = "a".repeat(64), pointers = listOf("/paths", "/components"))
        val reordered = evidence(sourceSha = "a".repeat(64), pointers = listOf("/components", "/paths"))
        val changed = evidence(sourceSha = "b".repeat(64), pointers = listOf("/paths", "/components"))

        assertEquals(
            CompatibilityLayerOutcome.UNCHANGED,
            SourceContractCompatibilityClassifier.classify(before, reordered).layerReport.outcome,
        )
        val result = SourceContractCompatibilityClassifier.classify(before, changed)
        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
        assertEquals(CompatibilityClassification.UNKNOWN, result.changes.single().classification)
    }

    @Test
    fun changedEffectiveContractDigestWithNoPointersIsChanged() {
        val before = evidence(sourceSha = "a".repeat(64), pointers = emptyList(), effectiveSha = "e".repeat(64))
        val after = evidence(sourceSha = "a".repeat(64), pointers = emptyList(), effectiveSha = "f".repeat(64))

        val result = SourceContractCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
        assertEquals(
            "effective-contract",
            result.changes
                .single()
                .id.value
                .split(':')[2],
        )
        assertEquals(
            "effective-contract:fixture",
            result.changes
                .single()
                .summary
                .substringAfterLast(" for "),
        )
    }

    @Test
    fun invalidSourceEvidenceIdentityOrFingerprintIsUnavailable() {
        val valid = evidence("a".repeat(64), emptyList())
        val invalidIdentity = evidence("a".repeat(64), emptyList(), effectiveIdentity = "")
        val invalidComponentFingerprint = evidence("A".repeat(64), emptyList())

        assertInvalidEvidence(valid, invalidIdentity)
        assertInvalidEvidence(valid, invalidComponentFingerprint)
    }

    @Test
    fun missingSourceEvidenceIsUnavailableRatherThanCompatible() {
        val result =
            SourceContractCompatibilityClassifier.classify(null, evidence("a".repeat(64), emptyList()))

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("missing-layer-evidence", result.layerReport.unavailableReason?.code)
    }

    private fun assertInvalidEvidence(
        valid: SourceContractEvidence,
        invalid: SourceContractEvidence,
    ) {
        val result = SourceContractCompatibilityClassifier.classify(valid, invalid)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
    }

    private fun evidence(
        sourceSha: String,
        pointers: List<String>,
        effectiveIdentity: String = "fixture",
        effectiveSha: String = "e".repeat(64),
    ): SourceContractEvidence =
        SourceContractEvidence(
            effectiveContract =
                CompatibilityEvidenceReference("effective-contract", effectiveIdentity, effectiveSha),
            components =
                listOf(
                    SourceContractComponent(SourceContractComponentKind.SOURCE, "openapi/fixture.yaml", sourceSha),
                    SourceContractComponent(
                        SourceContractComponentKind.OVERLAY,
                        "overlay/fixture.yaml",
                        "c".repeat(64),
                    ),
                ),
            normalizedEffectiveContractPointers = pointers,
        )
}

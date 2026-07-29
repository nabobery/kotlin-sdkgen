package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SemanticModelCompatibilityClassifierTest {
    @Test
    fun reorderedSemanticNodesAreUnchangedAndNodeChangeIsUnknown() {
        val before = evidence(listOf(node("/operations/create"), node("/schemas/Chat")))
        val reordered = evidence(listOf(node("/schemas/Chat"), node("/operations/create")))
        val changed = evidence(listOf(node("/operations/create", "b"), node("/schemas/Chat")))

        assertEquals(
            CompatibilityLayerOutcome.UNCHANGED,
            SemanticModelCompatibilityClassifier.classify(before, reordered).layerReport.outcome,
        )
        val result = SemanticModelCompatibilityClassifier.classify(before, changed)
        assertEquals(CompatibilityClassification.UNKNOWN, result.changes.single().classification)
    }

    @Test
    fun changedSnapshotDigestWithEqualNodeListsIsUnknown() {
        val nodes = listOf(node("/operations/create"), node("/schemas/Chat"))
        val before = evidence(nodes, semanticSha = "5".repeat(64))
        val after = evidence(nodes, semanticSha = "6".repeat(64))

        val result = SemanticModelCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
        assertEquals(CompatibilityClassification.UNKNOWN, result.changes.single().classification)
        assertEquals(
            "snapshot",
            result.changes
                .single()
                .id.value
                .split(':')[2],
        )
    }

    @Test
    fun malformedSemanticEvidenceFingerprintsAreUnavailable() {
        val valid = evidence(emptyList())
        val nonHex = evidence(emptyList(), semanticSha = "g".repeat(64))
        val wrongLength = evidence(emptyList(), semanticSha = "a".repeat(63))
        val uppercase = evidence(emptyList(), semanticSha = "A".repeat(64))

        listOf(nonHex, wrongLength, uppercase).forEach { invalid ->
            val result = SemanticModelCompatibilityClassifier.classify(valid, invalid)

            assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
            assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
        }
    }

    @Test
    fun nonCanonicalNodeFingerprintIsUnavailableRatherThanChanged() {
        val before = evidence(listOf(node("/operations/create", "a")))
        val after = evidence(listOf(node("/operations/create", "A")))

        val result = SemanticModelCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
    }

    @Test
    fun absentSemanticSnapshotIsUnavailableEvenWhenDeclarationCorroborationExists() {
        val declarationOnly = evidence(emptyList())
        val result = SemanticModelCompatibilityClassifier.classify(null, declarationOnly)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("missing-layer-evidence", result.layerReport.unavailableReason?.code)
    }

    private fun evidence(
        nodes: List<SemanticModelNode>,
        semanticSha: String = "1".repeat(64),
    ): SemanticModelEvidence =
        SemanticModelEvidence(
            semanticModel = CompatibilityEvidenceReference("semantic-model", "fixture", semanticSha),
            nodes = nodes,
            declarationModel = CompatibilityEvidenceReference("declaration-projection", "fixture", "d".repeat(64)),
        )

    private fun node(
        pointer: String,
        fingerprintCharacter: String = "a",
    ): SemanticModelNode = SemanticModelNode(pointer, fingerprintCharacter.repeat(64))
}

package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class BehaviorCompatibilityClassifierTest {
    @Test
    fun parameterSerializationWireChangeIsBehaviorallyRiskyAndScenarioChangeIsUnknown() {
        val before = parameterSerializationEvidence(style = "form", explode = true)
        val wireChanged = parameterSerializationEvidence(style = "form", explode = false)
        val scenarioChanged =
            parameterSerializationEvidence(style = "form", explode = true, scenarioSha = "2".repeat(64))

        assertNotEquals(
            before.fixtures
                .single()
                .wire.sha256,
            wireChanged.fixtures
                .single()
                .wire.sha256,
        )
        assertEquals(
            CompatibilityClassification.BEHAVIORALLY_RISKY,
            BehaviorCompatibilityClassifier
                .classify(before, wireChanged)
                .changes
                .single()
                .classification,
        )
        assertEquals(
            CompatibilityClassification.UNKNOWN,
            BehaviorCompatibilityClassifier
                .classify(before, scenarioChanged)
                .changes
                .single()
                .classification,
        )
    }

    @Test
    fun emptyBehaviorEvidenceIdentityOrDigestIsUnavailable() {
        val valid = parameterSerializationEvidence(style = "form", explode = true)
        val emptyIdentity = evidence("1".repeat(64), "4".repeat(64), fixtureIdentity = "")
        val emptyDigest = evidence("1".repeat(64), "")

        listOf(emptyIdentity, emptyDigest).forEach { invalid ->
            val result = BehaviorCompatibilityClassifier.classify(valid, invalid)

            assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
            assertEquals("invalid-evidence-reference", result.layerReport.unavailableReason?.code)
        }
    }

    @Test
    fun missingT12FixtureEvidenceIsUnavailableRatherThanCompatible() {
        val result =
            BehaviorCompatibilityClassifier.classify(
                BehaviorEvidence(emptyList(), BehaviorEvidenceAvailability.Usable),
                parameterSerializationEvidence(style = "form", explode = true),
            )

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals("missing-behavior-evidence", result.layerReport.unavailableReason?.code)
    }

    private fun parameterSerializationEvidence(
        style: String,
        explode: Boolean,
        scenarioSha: String = "1".repeat(64),
    ): BehaviorEvidence =
        evidence(
            scenarioSha = scenarioSha,
            wireSha = normalizedCompatibilityFingerprint("query:limit|style=$style|explode=$explode"),
        )

    private fun evidence(
        scenarioSha: String,
        wireSha: String,
        fixtureIdentity: String = "fixture.pagination.cursor",
    ): BehaviorEvidence =
        BehaviorEvidence(
            fixtures =
                listOf(
                    BehaviorFixtureEvidence(
                        fixtureIdentity = fixtureIdentity,
                        scenario = CompatibilityEvidenceReference("parity-scenario", fixtureIdentity, scenarioSha),
                        wire = CompatibilityEvidenceReference("parity-wire", fixtureIdentity, wireSha),
                    ),
                ),
            availability = BehaviorEvidenceAvailability.Usable,
        )
}

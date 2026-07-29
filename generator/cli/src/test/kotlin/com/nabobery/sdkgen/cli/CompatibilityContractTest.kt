package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Initial compatibility-report RED contract for the typed five-layer report API.
 *
 * Expected production signatures are [CompatibilityReport.create], [CompatibilityChangeId.create],
 * [CompatibilityReportRenderer.render], and [CompatibilityExitPolicy.exitCode].
 */
internal class CompatibilityContractTest {
    @Test
    fun reportAlwaysContainsAllFiveLayersWhenEvidenceIsMissing() {
        val report = CompatibilityReport.create(layerReports = emptyList())

        assertEquals(CompatibilityLayer.entries.toSet(), report.layers.map(CompatibilityLayerReport::layer).toSet())
        assertEquals(CompatibilityLayer.entries.size, report.layers.size)
        assertEquals(
            report.layers.size,
            report.layers
                .map(CompatibilityLayerReport::layer)
                .distinct()
                .size,
        )
        assertTrue(report.layers.all { it.outcome == CompatibilityLayerOutcome.UNAVAILABLE })
        assertTrue(report.layers.all { assertNotNull(it.unavailableReason).code == "missing-layer-evidence" })
        assertEquals(CompatibilityAggregateOutcome.INCOMPLETE, report.aggregateOutcome)
    }

    @Test
    fun unavailableLayerCarriesMachineReadableReasonAndFailsClosed() {
        val report =
            CompatibilityReport.create(
                layerReports =
                    listOf(
                        CompatibilityLayerReport(
                            layer = CompatibilityLayer.SOURCE_CONTRACT,
                            outcome = CompatibilityLayerOutcome.UNAVAILABLE,
                            unavailableReason =
                                CompatibilityUnavailableReason(
                                    code = "missing-effective-contract-digest",
                                    detail = "v1alpha1 does not carry effectiveContractSha256",
                                ),
                        ),
                    ),
            )

        val sourceLayer = report.layers.single { it.layer == CompatibilityLayer.SOURCE_CONTRACT }
        assertEquals("missing-effective-contract-digest", sourceLayer.unavailableReason?.code)
        assertEquals(CompatibilityAggregateOutcome.INCOMPLETE, report.aggregateOutcome)
        assertTrue(report.aggregateOutcome != CompatibilityAggregateOutcome.COMPATIBLE)
    }

    @Test
    fun unknownClassifiedChangeMakesAllChangedEvidenceIncomplete() {
        val report =
            CompatibilityReport.create(
                layerReports = allChangedLayers(),
                changes = listOf(compatibilityChange("unclassifiable-operation", CompatibilityClassification.UNKNOWN)),
            )

        assertTrue(report.layers.all { it.outcome == CompatibilityLayerOutcome.CHANGED })
        assertTrue(
            report.changes
                .single()
                .evidence
                .isNotEmpty(),
        )
        assertEquals(CompatibilityAggregateOutcome.INCOMPLETE, report.aggregateOutcome)
    }

    @Test
    fun allUnchangedLayersWithoutChangesAreCompatibleAndExitZeroForEveryPolicy() {
        val report = CompatibilityReport.create(layerReports = allUnchangedLayers())

        assertEquals(CompatibilityAggregateOutcome.COMPATIBLE, report.aggregateOutcome)
        CompatibilityFailOn.entries.forEach { failOn ->
            assertEquals(0, CompatibilityExitPolicy.exitCode(report, failOn))
        }
    }

    @Test
    fun incompleteReportReturnsExitOneBeforeEveryThresholdIncludingNever() {
        val report =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes = listOf(compatibilityChange("unknown-change", CompatibilityClassification.UNKNOWN)),
            )

        assertEquals(CompatibilityAggregateOutcome.INCOMPLETE, report.aggregateOutcome)
        CompatibilityFailOn.entries.forEach { failOn ->
            assertEquals(1, CompatibilityExitPolicy.exitCode(report, failOn))
        }
    }

    @Test
    fun behaviorallyRiskyOnlyChangeDistinguishesBreakingAndBehaviorallyRiskyThresholds() {
        val report =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes =
                    listOf(
                        compatibilityChange(
                            "changed-wire-contract",
                            CompatibilityClassification.BEHAVIORALLY_RISKY,
                        ),
                    ),
            )

        assertEquals(0, CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BREAKING))
        assertEquals(3, CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BEHAVIORALLY_RISKY))
    }

    @Test
    fun changeIdsAreStableSeverityOrderedAndSharedByJsonAndMarkdown() {
        val lowerSeverityId =
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "property",
                canonicalSubject = "com.nabobery.sdkgen.generated.ChatResponse#requestId",
                beforeFingerprint = "a".repeat(64),
                afterFingerprint = "b".repeat(64),
            )
        val higherSeverityId =
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "parameter",
                canonicalSubject = "com.nabobery.sdkgen.generated.ChatClient#createChat(request)",
                beforeFingerprint = "c".repeat(64),
                afterFingerprint = "d".repeat(64),
            )
        val report =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes =
                    listOf(
                        CompatibilityChange(
                            id = lowerSeverityId,
                            layer = CompatibilityLayer.KOTLIN_API,
                            classification = CompatibilityClassification.ADDITIVE,
                            summary = "Add response requestId property",
                            evidence = listOf(declarationProjectionEvidence("requestId")),
                        ),
                        CompatibilityChange(
                            id = higherSeverityId,
                            layer = CompatibilityLayer.KOTLIN_API,
                            classification = CompatibilityClassification.BREAKING,
                            summary = "Change createChat parameter serialization",
                            evidence = listOf(declarationProjectionEvidence("createChat")),
                        ),
                    ),
            )

        val expectedIds = listOf(higherSeverityId.value, lowerSeverityId.value)
        assertEquals(expectedIds, report.changes.map { it.id.value })
        assertEquals(
            expectedIds,
            extractChangeIds(
                CompatibilityReportRenderer.render(
                    report,
                    CompatibilityOutputFormat.JSON,
                ),
            ),
        )
        assertEquals(
            expectedIds,
            extractChangeIds(CompatibilityReportRenderer.render(report, CompatibilityOutputFormat.MARKDOWN)),
        )
        assertEquals(
            higherSeverityId,
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "parameter",
                canonicalSubject = "com.nabobery.sdkgen.generated.ChatClient#createChat(request)",
                beforeFingerprint = "c".repeat(64),
                afterFingerprint = "d".repeat(64),
            ),
        )
    }

    @Test
    fun classificationEnumOrdersUnknownBeforeBehaviorallyRiskyAndAdditive() {
        assertEquals(
            listOf(
                CompatibilityClassification.BREAKING,
                CompatibilityClassification.UNKNOWN,
                CompatibilityClassification.BEHAVIORALLY_RISKY,
                CompatibilityClassification.ADDITIVE,
            ),
            CompatibilityClassification.entries,
        )
    }

    @Test
    fun truncationRetainsAlwaysPresentFullReportCountsAndAggregateOutcome() {
        val report =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes =
                    listOf(
                        compatibilityChange("first", CompatibilityClassification.ADDITIVE),
                        compatibilityChange("second", CompatibilityClassification.BREAKING),
                    ),
                maximumDisplayedChanges = 1,
            )

        assertEquals(1, report.changes.size)
        assertNotNull(report.truncation)
        assertEquals(2, report.totalChangeCount)
        assertEquals(
            mapOf(
                CompatibilityClassification.BREAKING to 1,
                CompatibilityClassification.ADDITIVE to 1,
            ),
            report.changeCountsByClassification,
        )
        assertEquals(CompatibilityClassification.BREAKING, report.mostSevereClassification)
        assertEquals(CompatibilityAggregateOutcome.CHANGED, report.aggregateOutcome)
    }

    @Test
    fun truncationHidingAnUnknownChangeStillProducesIncompleteAggregate() {
        val report =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes =
                    listOf(
                        compatibilityChange("removed-operation", CompatibilityClassification.BREAKING),
                        compatibilityChange("unclassifiable-operation", CompatibilityClassification.UNKNOWN),
                    ),
                maximumDisplayedChanges = 1,
            )

        assertEquals(CompatibilityClassification.BREAKING, report.changes.single().classification)
        assertEquals(2, report.totalChangeCount)
        assertEquals(CompatibilityAggregateOutcome.INCOMPLETE, report.aggregateOutcome)
    }

    @Test
    fun knownChangeIdVectorUsesSha256Utf8NulDelimitersAndAbsentFingerprintPlaceholder() {
        val id =
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "declaration",
                canonicalSubject = "com.nabobery.sdkgen.generated.ChatClient#stableOperation",
                beforeFingerprint = null,
                afterFingerprint = "a".repeat(64),
            )

        assertEquals("compat-v1:kotlinApi:declaration:ce50538eb6f77943", id.value)
    }

    @Test
    fun pureAdditionAndRemovalChangeIdsUseAbsentFingerprintsInTheirRespectivePositions() {
        val canonicalSubject = "com.nabobery.sdkgen.generated.ChatClient#operation"
        val pureAddition =
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "declaration",
                canonicalSubject = canonicalSubject,
                beforeFingerprint = null,
                afterFingerprint = "a".repeat(64),
            )
        val pureRemoval =
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "declaration",
                canonicalSubject = canonicalSubject,
                beforeFingerprint = "a".repeat(64),
                afterFingerprint = null,
            )

        assertEquals(
            pureAddition,
            CompatibilityChangeId.create(
                layer = CompatibilityLayer.KOTLIN_API,
                subjectKind = "declaration",
                canonicalSubject = canonicalSubject,
                beforeFingerprint = null,
                afterFingerprint = "a".repeat(64),
            ),
        )
        assertNotEquals(pureAddition, pureRemoval)
    }

    @Test
    fun equalSeverityChangesSortByFullChangeIdInsteadOfCallerOrder() {
        val callerOrder =
            listOf(
                compatibilityChange("first-equal-severity-change", CompatibilityClassification.ADDITIVE),
                compatibilityChange("second-equal-severity-change", CompatibilityClassification.ADDITIVE),
            ).sortedByDescending { it.id.value }
        val report =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes = callerOrder,
            )
        val expectedIds = callerOrder.map { it.id.value }.sorted()

        assertNotEquals(callerOrder[0].id, callerOrder[1].id)
        assertEquals(expectedIds.reversed(), callerOrder.map { it.id.value })
        assertEquals(expectedIds, report.changes.map { it.id.value })
    }

    @Test
    fun failOnThresholdReturnsExitThreeIndependentlyOfFormat() {
        val breakingReport =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes = listOf(compatibilityChange("removed-operation", CompatibilityClassification.BREAKING)),
            )
        val additiveReport =
            CompatibilityReport.create(
                layerReports = allUnchangedLayers(),
                changes = listOf(compatibilityChange("new-operation", CompatibilityClassification.ADDITIVE)),
            )

        CompatibilityOutputFormat.entries.forEach { format ->
            CompatibilityReportRenderer.render(breakingReport, format)
            assertEquals(3, CompatibilityExitPolicy.exitCode(breakingReport, CompatibilityFailOn.BREAKING))
            assertEquals(3, CompatibilityExitPolicy.exitCode(breakingReport, CompatibilityFailOn.BEHAVIORALLY_RISKY))
            assertEquals(3, CompatibilityExitPolicy.exitCode(breakingReport, CompatibilityFailOn.ANY_CHANGE))
            assertEquals(0, CompatibilityExitPolicy.exitCode(breakingReport, CompatibilityFailOn.NEVER))
            assertEquals(0, CompatibilityExitPolicy.exitCode(additiveReport, CompatibilityFailOn.BREAKING))
            assertEquals(0, CompatibilityExitPolicy.exitCode(additiveReport, CompatibilityFailOn.BEHAVIORALLY_RISKY))
            assertEquals(3, CompatibilityExitPolicy.exitCode(additiveReport, CompatibilityFailOn.ANY_CHANGE))
        }
    }

    private fun allUnchangedLayers(): List<CompatibilityLayerReport> =
        CompatibilityLayer.entries.map { layer ->
            CompatibilityLayerReport(
                layer = layer,
                outcome = CompatibilityLayerOutcome.UNCHANGED,
            )
        }

    private fun allChangedLayers(): List<CompatibilityLayerReport> =
        CompatibilityLayer.entries.map { layer ->
            CompatibilityLayerReport(
                layer = layer,
                outcome = CompatibilityLayerOutcome.CHANGED,
            )
        }

    private fun compatibilityChange(
        subject: String,
        classification: CompatibilityClassification,
    ): CompatibilityChange =
        CompatibilityChange(
            id =
                CompatibilityChangeId.create(
                    layer = CompatibilityLayer.KOTLIN_API,
                    subjectKind = "declaration",
                    canonicalSubject = subject,
                    beforeFingerprint = "a".repeat(64),
                    afterFingerprint = "b".repeat(64),
                ),
            layer = CompatibilityLayer.KOTLIN_API,
            classification = classification,
            summary = subject,
            evidence = listOf(declarationProjectionEvidence(subject)),
        )

    private fun declarationProjectionEvidence(subject: String): CompatibilityEvidenceReference =
        CompatibilityEvidenceReference(
            kind = "declaration-projection",
            identity = subject,
            sha256 = "e".repeat(64),
        )

    private fun extractChangeIds(rendered: String): List<String> =
        Regex("compat-v1:[a-zA-Z]+:[a-z-]+:[0-9a-f]{16}")
            .findAll(rendered)
            .map { it.value }
            .toList()
}

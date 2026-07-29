package com.nabobery.sdkgen.cli

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

/**
 * Proves the invariant ADR 0013 requires of the `compat` command: "Human, JSON, and Markdown renderers receive
 * the same typed report and cannot change its classification or exit code." The exit code must be a pure
 * function of the [CompatibilityReport] and the selected [CompatibilityFailOn]; [CompatibilityReportRenderer]
 * must never participate in that decision.
 *
 * [CompatCommandTest] wires the real `compat` command, but every report it can build from a manifest pair is
 * [CompatibilityAggregateOutcome.INCOMPLETE] today (see that file's class doc), which fixes the exit code at `1`
 * and cannot exercise the `--fail-on` axis. These tests instead build [CompatibilityReport] directly via its
 * `create` entry point -- calling, not modifying, the frozen [CompatibilityReport]/[CompatibilityExitPolicy]/
 * [CompatibilityReportRenderer] APIs -- so both axes can be varied independently:
 *
 * - format axis: the same report and the same `--fail-on` choice must yield the same exit code under every
 *   [CompatibilityOutputFormat] this command supports;
 * - fail-on axis: the same report, rendered in the same format, must yield different exit codes for at least
 *   two different [CompatibilityFailOn] values.
 */
internal class CompatibilityExitRenderIndependenceTest {
    @Test
    fun exitCodeIsIdenticalAcrossEveryRenderedFormatForTheSameReportAndFailOn() {
        val report = reportWithSingleChange(CompatibilityClassification.BREAKING)

        CompatibilityFailOn.entries.forEach { failOn ->
            val expected = CompatibilityExitPolicy.exitCode(report, failOn)

            CompatibilityOutputFormat.entries.forEach { format ->
                // Render first, exactly as CompatCommand does, so a renderer with a side channel back into the
                // exit-code computation would be caught here.
                CompatibilityReportRenderer.render(report, format)
                val actual = CompatibilityExitPolicy.exitCode(report, failOn)
                assertEquals(expected, actual, "format=$format failOn=$failOn must not change the exit code")
            }
        }
    }

    @Test
    fun exitCodeVariesByFailOnForTheSameReportAndFormatWhenABreakingChangeExists() {
        val report = reportWithSingleChange(CompatibilityClassification.BREAKING)
        CompatibilityReportRenderer.render(report, CompatibilityOutputFormat.JSON)

        val never = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.NEVER)
        val breaking = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BREAKING)
        val behaviorallyRisky = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BEHAVIORALLY_RISKY)
        val anyChange = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.ANY_CHANGE)

        assertEquals(0, never)
        assertEquals(3, breaking)
        assertEquals(3, behaviorallyRisky)
        assertEquals(3, anyChange)
        assertNotEquals(never, breaking)
    }

    @Test
    fun exitCodeVariesByFailOnForTheSameReportAndFormatWhenOnlyAnAdditiveChangeExists() {
        val report = reportWithSingleChange(CompatibilityClassification.ADDITIVE)
        CompatibilityReportRenderer.render(report, CompatibilityOutputFormat.MARKDOWN)

        val never = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.NEVER)
        val breaking = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BREAKING)
        val behaviorallyRisky = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BEHAVIORALLY_RISKY)
        val anyChange = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.ANY_CHANGE)

        assertEquals(0, never)
        assertEquals(0, breaking)
        assertEquals(0, behaviorallyRisky)
        assertEquals(3, anyChange)
        assertNotEquals(anyChange, breaking)
    }

    @Test
    fun exitCodeVariesByFailOnForTheSameReportAndFormatWhenOnlyABehaviorallyRiskyChangeExists() {
        val report = reportWithSingleChange(CompatibilityClassification.BEHAVIORALLY_RISKY)
        CompatibilityReportRenderer.render(report, CompatibilityOutputFormat.HUMAN)

        val breaking = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BREAKING)
        val behaviorallyRisky = CompatibilityExitPolicy.exitCode(report, CompatibilityFailOn.BEHAVIORALLY_RISKY)

        assertEquals(0, breaking)
        assertEquals(3, behaviorallyRisky)
        assertNotEquals(breaking, behaviorallyRisky)
    }

    private fun reportWithSingleChange(classification: CompatibilityClassification): CompatibilityReport {
        val layerReports =
            CompatibilityLayer.entries.map { layer ->
                CompatibilityLayerReport(
                    layer = layer,
                    outcome =
                        if (layer == CompatibilityLayer.KOTLIN_API) {
                            CompatibilityLayerOutcome.CHANGED
                        } else {
                            CompatibilityLayerOutcome.UNCHANGED
                        },
                )
            }
        val change =
            CompatibilityChange(
                id =
                    CompatibilityChangeId.create(
                        layer = CompatibilityLayer.KOTLIN_API,
                        subjectKind = "declaration",
                        canonicalSubject = "com.nabobery.sdkgen.generated.Widget",
                        beforeFingerprint = "before",
                        afterFingerprint = "after",
                    ),
                layer = CompatibilityLayer.KOTLIN_API,
                classification = classification,
                summary = "Change Kotlin API declaration com.nabobery.sdkgen.generated.Widget",
                evidence =
                    listOf(
                        CompatibilityEvidenceReference(
                            kind = "declaration-projection",
                            identity = "test:kotlin-api",
                            sha256 = "1".repeat(64),
                        ),
                    ),
            )
        return CompatibilityReport.create(layerReports = layerReports, changes = listOf(change))
    }
}

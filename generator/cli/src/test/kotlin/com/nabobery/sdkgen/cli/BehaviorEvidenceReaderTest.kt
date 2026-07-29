package com.nabobery.sdkgen.cli

import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.writeBytes
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * [BehaviorEvidenceReaderTest] proves [BehaviorEvidenceReader] turns a real-shaped cross-corpus parity-matrix document into
 * [BehaviorFixtureEvidence] with stable, distinct, per-fixture identities and fingerprints, and that the resulting
 * evidence actually flows through [BehaviorCompatibilityClassifier] end to end.
 *
 * Above all it proves the property the layer exists for: **a ledger that records work the parity gate never
 * performed is not behavior evidence.** Two identical all-`notRun` ledgers have identical per-row fingerprints,
 * so a comparison
 * that only diffs fingerprints reports them `unchanged` — an absence of evidence laundered into a verified
 * result. Every `...IsUnavailable...` test below fails against that implementation and passes only when the
 * layer consults the parity gate status, required-row outcomes, and commit binding before comparing anything.
 */
internal class BehaviorEvidenceReaderTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun readsOnlyBehaviorMatrixRowsKeyedByFixtureId() {
        val evidence = BehaviorEvidenceReader.read(materialize(BASELINE_RESOURCE))

        assertEquals(2, evidence.fixtures.size)
        assertEquals(
            setOf("scenario:github.pagination", "scenario:github.auth"),
            evidence.fixtures.map(BehaviorFixtureEvidence::canonicalSubject).toSet(),
        )
        evidence.fixtures.forEach { fixture ->
            assertEquals("parity-scenario", fixture.scenario.kind)
            assertEquals("parity-wire", fixture.wire.kind)
            assertEquals(fixture.fixtureIdentity, fixture.scenario.identity)
            assertEquals(fixture.fixtureIdentity, fixture.wire.identity)
        }
    }

    @Test
    fun selfComparisonOfAPassingLedgerReportsUnchangedAndAvailable() {
        val evidence = BehaviorEvidenceReader.read(materialize(PASSED_RESOURCE))

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNCHANGED, result.layerReport.outcome)
        assertTrue(result.changes.isEmpty())
    }

    @Test
    fun aRealStatusChangeIsDetectedScopedToExactlyThatFixture() {
        val before = BehaviorEvidenceReader.read(materialize(PASSED_RESOURCE))
        val after = BehaviorEvidenceReader.read(materialize(PASSED_CHANGED_RESOURCE))

        val result = BehaviorCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
        assertEquals(1, result.changes.size)
        assertEquals(
            "scenario",
            result.changes
                .single()
                .id.value
                .split(":")[2],
        )
        assertTrue(
            result.changes
                .single()
                .summary
                .contains("github.auth"),
        )
    }

    /**
     * The single most important assertion in this file. `docs/conformance/evidence/parity-matrices.json` is the
     * ledger the release gate reads, and it currently records `gateStatus: failed` with zero passed rows. Compared
     * to itself every fingerprint matches exactly, so a fingerprint-only classifier calls the behavior layer
     * `unchanged` and the aggregate report `compatible`. It must be `unavailable`, which forces `incomplete`.
     *
     * This deliberately asserts against the real file rather than a copy, so it doubles as a canary: if passing
     * evidence is ever committed, this test fails and whoever committed it has to state that decision explicitly
     * instead of letting the release gate quietly start reporting a different thing.
     */
    @Test
    fun theCommittedRedLedgerComparedToItselfIsUnavailableNotUnchanged() {
        val committed = Path.of(System.getProperty(COMMITTED_MATRIX_PROPERTY))
        val evidence = BehaviorEvidenceReader.read(committed)

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertTrue(result.changes.isEmpty())
        // The committed ledger fails the most fundamental precondition first: the parity gate says `failed`.
        // Its 12 required `notRun` rows would fail the next check too; that path is proven independently by
        // `aRequiredNotRunRowMakesTheBehaviorLayerUnavailable`, which uses a ledger whose gate does pass.
        assertEquals(
            "parity-gate-not-passed",
            result.layerReport.unavailableReason
                ?.code,
        )
    }

    @Test
    fun aLedgerWhoseGateStatusIsFailedIsRejectedEvenWhenEveryRowFingerprintMatches() {
        val evidence =
            BehaviorEvidenceReader.read(
                rewritten(PASSED_RESOURCE) { document ->
                    document.replace("\"gateStatus\": \"passed\"", "\"gateStatus\": \"failed\"")
                },
            )

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals(
            "parity-gate-not-passed",
            result.layerReport.unavailableReason
                ?.code,
        )
    }

    @Test
    fun aRequiredNotRunRowMakesTheBehaviorLayerUnavailable() {
        val evidence =
            BehaviorEvidenceReader.read(
                rewritten(PASSED_RESOURCE) { document ->
                    document
                        .replaceFirst("\"status\": \"passed\",", "\"status\": \"notRun\",")
                        .replace("\"passedRows\": 3", "\"passedRows\": 2")
                        .replace("\"notRunRows\": 1", "\"notRunRows\": 2")
                },
            )

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals(
            "parity-required-row-not-run",
            result.layerReport.unavailableReason
                ?.code,
        )
        assertTrue(
            result.layerReport.unavailableReason
                ?.detail
                .orEmpty()
                .contains("github.pagination"),
        )
    }

    @Test
    fun aLedgerReportingItsOwnInputErrorsIsRejected() {
        val evidence =
            BehaviorEvidenceReader.read(
                rewritten(PASSED_RESOURCE) { document ->
                    document.replace("\"inputErrors\": [],", "\"inputErrors\": [\"duplicate evidence row id\"],")
                },
            )

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals(
            "parity-input-errors",
            result.layerReport.unavailableReason
                ?.code,
        )
    }

    @Test
    fun rowsFromMoreThanOneCommitAreRejectedBecauseALedgerIsOneRun() {
        val evidence =
            BehaviorEvidenceReader.read(
                rewritten(PASSED_RESOURCE) { document ->
                    document.replaceFirst(
                        "\"commitSha\": \"1111111111111111111111111111111111111111\",",
                        "\"commitSha\": \"3333333333333333333333333333333333333333\",",
                    )
                },
            )

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals(
            "parity-evidence-not-commit-bound",
            result.layerReport.unavailableReason
                ?.code,
        )
    }

    @Test
    fun aPassedRowWithoutACommitShaIsRejected() {
        val evidence =
            BehaviorEvidenceReader.read(
                rewritten(PASSED_RESOURCE) { document ->
                    document.replace(
                        "\"commitSha\": \"1111111111111111111111111111111111111111\",",
                        "\"commitSha\": null,",
                    )
                },
            )

        val result = BehaviorCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNAVAILABLE, result.layerReport.outcome)
        assertEquals(
            "parity-evidence-not-commit-bound",
            result.layerReport.unavailableReason
                ?.code,
        )
    }

    @Test
    fun aStatusOutsideTheFrozenT12VocabularyFailsClosedAtReadTime() {
        val failure =
            assertFailsWith<BehaviorEvidenceInputException> {
                BehaviorEvidenceReader.read(
                    rewritten(PASSED_RESOURCE) { document ->
                        document.replaceFirst("\"status\": \"passed\",", "\"status\": \"pass\",")
                    },
                )
            }

        assertTrue(failure.message.orEmpty().contains("pass"))
    }

    @Test
    fun aLedgerWithoutASummaryFailsClosedRatherThanDefaultingToUsable() {
        val failure =
            assertFailsWith<BehaviorEvidenceInputException> {
                BehaviorEvidenceReader.read(
                    rewritten(PASSED_RESOURCE) { document ->
                        document.replace("\"gateStatus\": \"passed\"", "\"gateStatusMissing\": \"passed\"")
                    },
                )
            }

        assertTrue(failure.message.orEmpty().contains("gateStatus"))
    }

    @Test
    fun duplicateFixtureIdFailsClosedAtReadTimeRatherThanCrashingTheClassifier() {
        val failure =
            assertFailsWith<BehaviorEvidenceInputException> {
                BehaviorEvidenceReader.read(materialize(DUPLICATE_RESOURCE))
            }

        assertTrue(failure.message.orEmpty().contains("github.pagination"))
    }

    @Test
    fun missingBehaviorMatrixFailsClosed() {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-behavior-evidence", ".json")
        manifest.writeText("""{"schemaVersion":"v1alpha1","matrices":[{"matrix":"compile","rows":[]}]}""")

        val failure =
            assertFailsWith<BehaviorEvidenceInputException> {
                BehaviorEvidenceReader.read(manifest)
            }

        assertTrue(failure.message.orEmpty().contains("behavior"))
    }

    @Test
    fun missingRequirednessCannotBypassRequiredRowEnforcement() {
        val failure =
            assertFailsWith<BehaviorEvidenceInputException> {
                BehaviorEvidenceReader.read(
                    rewritten(PASSED_RESOURCE) { document ->
                        document.replaceFirst(
                            "\"requiredness\": \"required\",",
                            "\"requirednessMissing\": \"required\",",
                        )
                    },
                )
            }

        assertTrue(failure.message.orEmpty().contains("requiredness"))
    }

    @Test
    fun aSelfAttestedSummaryThatDisagreesWithItsRowsFailsClosed() {
        val failure =
            assertFailsWith<BehaviorEvidenceInputException> {
                BehaviorEvidenceReader.read(
                    rewritten(PASSED_RESOURCE) { document ->
                        document.replace("\"passedRows\": 3", "\"passedRows\": 99")
                    },
                )
            }

        assertTrue(failure.message.orEmpty().contains("passedRows"))
    }

    private fun materialize(resource: String): Path {
        val target = Files.createTempFile(temporaryDirectory, "sdkgen-behavior-evidence", ".json")
        target.writeBytes(
            requireNotNull(javaClass.getResourceAsStream(resource)) { "missing test resource: $resource" }
                .use { it.readBytes() },
        )
        return target
    }

    /** Materializes [resource] with one targeted textual mutation, so each test states exactly what it changed. */
    private fun rewritten(
        resource: String,
        mutate: (String) -> String,
    ): Path {
        val source = materialize(resource)
        val original = Files.readString(source)
        val mutated = mutate(original)
        check(mutated != original) { "mutation did not change $resource; the fixture text moved" }
        source.writeText(mutated)
        return source
    }

    private companion object {
        const val BASELINE_RESOURCE = "behavior-evidence-sample-baseline.json"
        const val DUPLICATE_RESOURCE = "behavior-evidence-sample-duplicate.json"
        const val PASSED_RESOURCE = "behavior-evidence-sample-passed.json"
        const val PASSED_CHANGED_RESOURCE = "behavior-evidence-sample-passed-changed.json"
        const val COMMITTED_MATRIX_PROPERTY = "cli.committedParityMatrix"
    }
}

package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.testing.test
import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Wires [CompatCommand] end to end through Clikt's in-process `.test()` extension: reads two compatibility
 * manifests via [CompatibilityManifestReader], compares them via [CompatibilityReport.compare], renders through
 * [CompatibilityReportRenderer], and derives the exit code solely from [CompatibilityExitPolicy].
 *
 * None of the tests in this file pass `--behavior-evidence-{from,to}` or `--abi-evidence-{from,to}` (the compatibility evidence wiring added
 * those flags; see [CompatCommandEvidenceWiringTest] for coverage of the flags themselves), so `behavior` and
 * `abi` stay `unavailable` here exactly as before: [CompatibilityReport.compare] only ever passes real evidence
 * for those two layers when a caller supplies it, and defaults to `null` otherwise, per its own KDoc. Every report
 * produced by *this* file therefore still has [CompatibilityAggregateOutcome.INCOMPLETE] and always exits `1`,
 * independent of `--fail-on`. That property is itself useful: it lets these tests prove `--format` never changes
 * the exit code using the real command, while [CompatibilityExitRenderIndependenceTest] proves the full fail-on
 * axis against [CompatibilityExitPolicy] directly.
 */
internal class CompatCommandTest {
    @Test
    fun compatReportsIncompleteEvidenceAndExitsOneAcrossEveryFormat() {
        val root = Files.createTempDirectory("sdkgen-cli-compat-format-test")
        val digest = "a".repeat(64)
        val manifest = root.resolve("manifest.json")
        manifest.writeManifest(digest)

        val human = sdkgenCommand().test("compat --from $manifest --to $manifest --format human")
        val json = sdkgenCommand().test("compat --from $manifest --to $manifest --format json")
        val markdown = sdkgenCommand().test("compat --from $manifest --to $manifest --format markdown")

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, human.statusCode, human.output)
        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, json.statusCode, json.output)
        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, markdown.statusCode, markdown.output)
        assertTrue(human.stdout.contains("incomplete"))
        assertTrue(json.stdout.contains("\"aggregateOutcome\":\"incomplete\""))
        assertTrue(markdown.stdout.contains("`incomplete`"))
    }

    @Test
    fun compatReportsIncompleteEvidenceRegardlessOfFailOn() {
        val root = Files.createTempDirectory("sdkgen-cli-compat-failon-test")
        val digest = "b".repeat(64)
        val from = root.resolve("from.json")
        val to = root.resolve("to.json")
        from.writeManifest(digest)
        to.writeManifest("c".repeat(64))

        val results =
            listOf("breaking", "behaviorally-risky", "any-change", "never").map { failOn ->
                sdkgenCommand().test("compat --from $from --to $to --format json --fail-on $failOn")
            }

        results.forEach { result -> assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output) }
    }

    /**
     * A `kotlinApiSha256` delta on its own is not evidence of an emitted-API change. The digest is computed
     * from the declaration model, upstream of emission, and stayed byte-identical across ADR 0015's regression
     * that deleted 518 emitted public symbols. This test previously asserted the opposite -- that two manifests
     * differing only in that digest produce a confident `breaking` kotlinApi change -- which is exactly the
     * defect: an absence of evidence dressed as a verdict. Emitted-API evidence is now staged and passed
     * through `--kotlin-api-from/-to`; without it the layer is `unavailable`.
     */
    @Test
    fun aKotlinApiDigestDeltaAloneIsUnavailableRatherThanBreaking() {
        val root = Files.createTempDirectory("sdkgen-cli-compat-change-test")
        val from = root.resolve("from.json")
        val to = root.resolve("to.json")
        val stableDigest = "c".repeat(64)
        from.writeManifest(stableDigest, stableDigest, kotlinApiSha256 = "d".repeat(64))
        to.writeManifest(stableDigest, stableDigest, kotlinApiSha256 = "e".repeat(64))

        val result = sdkgenCommand().test("compat --from $from --to $to --format json")

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
        assertTrue(result.stdout.contains("\"layer\":\"kotlinApi\",\"outcome\":\"unavailable\""))
        assertFalse(result.stdout.contains("\"classification\":\"breaking\""))
        assertTrue(result.stdout.contains("\"aggregateOutcome\":\"incomplete\""))
    }

    @Test
    fun compatFailsClosedOnAnUnreadableManifest() {
        val root = Files.createTempDirectory("sdkgen-cli-compat-invalid-test")
        val missing = root.resolve("does-not-exist.json")

        val result = sdkgenCommand().test("compat --from $missing --to $missing --format json")

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
        assertTrue(result.stdout.contains("\"status\":\"invalid\""))
        assertTrue(result.stdout.contains("\"command\":\"compat\""))
    }

    @Test
    fun compatDefaultsToHumanFormatAndBreakingFailOn() {
        val root = Files.createTempDirectory("sdkgen-cli-compat-defaults-test")
        val digest = "f".repeat(64)
        val manifest = root.resolve("manifest.json")
        manifest.writeManifest(digest)

        val result = sdkgenCommand().test("compat --from $manifest --to $manifest")

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
        assertTrue(result.stdout.contains("Compatibility report"))
        assertTrue(result.stdout.contains("Aggregate outcome: incomplete"))
    }
}

private fun Path.writeManifest(
    effectiveContractSha256: String,
    semanticModelSha256: String = effectiveContractSha256,
    kotlinApiSha256: String = effectiveContractSha256,
) {
    Files.writeString(
        this,
        """
        {
          "schemaVersion": "v1alpha2",
          "declarationModelSha256": "${"9".repeat(64)}",
          "effectiveContractSha256": "$effectiveContractSha256",
          "semanticModelSha256": "$semanticModelSha256",
          "kotlinApiSha256": "$kotlinApiSha256",
          "files": []
        }
        """.trimIndent(),
    )
}

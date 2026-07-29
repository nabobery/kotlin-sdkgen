package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.testing.test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.writeBytes
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Proves `compat` actually reads `--behavior-evidence-{from,to}` and `--abi-evidence-{from,to}` and passes them
 * to [CompatibilityReport.compare] (compatibility evidence wiring): with a `v1alpha2` manifest pair (three layers available) plus real
 * behavior evidence and staged ABI evidence, all five layers become available, and exit `3` becomes reachable
 * through the real installed command path -- not only through a hand-built [CompatibilityReport] in
 * [CompatibilityExitRenderIndependenceTest].
 *
 * [CompatCommandTest] remains the frozen-shape baseline for the no-evidence-flags path; this file only adds
 * coverage for the new flags and never edits that one.
 */
internal class CompatCommandEvidenceWiringTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun allFiveLayersBecomeAvailableWhenEveryEvidenceSourceIsSupplied() {
        val manifest = writeV1alpha2Manifest("a".repeat(64))
        val behaviorEvidence = materializeBehaviorFixture("behavior-evidence-sample-passed.json")
        val abiEvidence = materializeAbiFixture()
        val kotlinApi = writeKotlinApiProjection("Widget", propertyName = "id")

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--behavior-evidence-from $behaviorEvidence --behavior-evidence-to $behaviorEvidence " +
                    "--abi-evidence-from $abiEvidence --abi-evidence-to $abiEvidence " +
                    "--kotlin-api-from $kotlinApi --kotlin-api-to $kotlinApi",
            )

        assertTrue(result.stdout.contains("\"layer\":\"behavior\",\"outcome\":\"unchanged\""))
        assertTrue(result.stdout.contains("\"layer\":\"abi\",\"outcome\":\"unchanged\""))
        assertTrue(result.stdout.contains("\"layer\":\"kotlinApi\",\"outcome\":\"unchanged\""))
        assertTrue(result.stdout.contains("\"aggregateOutcome\":\"compatible\""))
        assertEquals(SDKGEN_EXIT_OK, result.statusCode, result.output)
    }

    @Test
    fun exitCodeThreeIsReachableThroughTheRealCommandWhenABreakingAbiChangeIsPresent() {
        val manifest = writeV1alpha2Manifest("b".repeat(64))
        val behaviorEvidence = materializeBehaviorFixture("behavior-evidence-sample-passed.json")
        val abiBefore = materializeAbiFixture()
        val abiAfter = materializeAbiFixtureWithRemovedMember()
        val kotlinApi = writeKotlinApiProjection("Widget", propertyName = "id")

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--behavior-evidence-from $behaviorEvidence --behavior-evidence-to $behaviorEvidence " +
                    "--abi-evidence-from $abiBefore --abi-evidence-to $abiAfter " +
                    "--kotlin-api-from $kotlinApi --kotlin-api-to $kotlinApi",
            )

        assertEquals(COMPATIBILITY_THRESHOLD_REACHED_EXIT_CODE, result.statusCode, result.output)
        assertTrue(result.stdout.contains("\"aggregateOutcome\":\"changed\""))
        assertTrue(result.stdout.contains("\"classification\":\"breaking\""))
    }

    @Test
    fun onlyOneSidedBehaviorEvidenceStaysUnavailableRatherThanCrashingOrGuessing() {
        val manifest = writeV1alpha2Manifest("c".repeat(64))
        val behaviorEvidence = materializeBehaviorFixture("behavior-evidence-sample-passed.json")

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--behavior-evidence-from $behaviorEvidence",
            )

        assertTrue(result.stdout.contains("\"layer\":\"behavior\",\"outcome\":\"unavailable\""))
        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
    }

    /**
     * The end-to-end counterpart of `BehaviorEvidenceReaderTest.theCommittedRedLedgerComparedToItselfIsUnavailable`:
     * supplying a ledger of work the parity gate never ran must not let the real command report `compatible` and exit `0`.
     */
    @Test
    fun anUnrunLedgerCannotProduceACompatibleReportThroughTheRealCommand() {
        val manifest = writeV1alpha2Manifest("e".repeat(64))
        val unrunEvidence = materializeBehaviorFixture("behavior-evidence-sample-baseline.json")

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--behavior-evidence-from $unrunEvidence --behavior-evidence-to $unrunEvidence",
            )

        assertTrue(result.stdout.contains("\"layer\":\"behavior\",\"outcome\":\"unavailable\""))
        assertTrue(result.stdout.contains("parity-gate-not-passed"))
        assertTrue(result.stdout.contains("\"aggregateOutcome\":\"incomplete\""))
        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
    }

    @Test
    fun malformedBehaviorEvidencePathFailsClosedAtExitOneNeverAsAPass() {
        val manifest = writeV1alpha2Manifest("d".repeat(64))
        val missing = temporaryDirectory.resolve("does-not-exist.json")

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--behavior-evidence-from $missing --behavior-evidence-to $missing",
            )

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
        assertTrue(result.stdout.contains("\"status\":\"invalid\""))
    }

    private fun writeV1alpha2Manifest(digest: String): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-cli-compat-evidence-manifest", ".json")
        Files.writeString(
            manifest,
            """
            {
              "schemaVersion": "v1alpha2",
              "declarationModelSha256": "${"9".repeat(64)}",
              "effectiveContractSha256": "$digest",
              "semanticModelSha256": "$digest",
              "kotlinApiSha256": "$digest",
              "files": []
            }
            """.trimIndent(),
        )
        return manifest
    }

    private fun materializeBehaviorFixture(resource: String): Path {
        val target = Files.createTempFile(temporaryDirectory, "sdkgen-cli-compat-behavior", ".json")
        target.writeBytes(resourceBytes(resource))
        return target
    }

    // JVM-only, no klibTargets: a declared-but-Unavailable KLib target always classifies as an `unknown` change
    // (AbiCompatibilityClassifier), which would make the aggregate `incomplete` even alongside a real JVM
    // change -- see AbiEvidenceReaderTest.anUnavailableKlibTargetIsUnknownRatherThanUnchangedEvenOnSelfComparison.
    // A clean `compatible`/exit-3 demonstration needs a fixture with no KLib targets in its build matrix at all.

    /**
     * A minimal staged projection in the engine's `kotlin-public-api/v2` shape. The CLI reader and the engine
     * writer share one shape deliberately, so a fixture written here is the same document `sdkgen generate
     * --kotlin-api-projection` produces.
     */
    private fun writeKotlinApiProjection(
        typeName: String,
        propertyName: String,
    ): Path {
        val projection = Files.createTempFile(temporaryDirectory, "sdkgen-cli-kotlin-api", ".json")
        projection.writeText(
            """
            {
              "schemaVersion": "kotlin-public-api/v2",
              "generation": {
                "declarationModelSha256": "${"9".repeat(64)}",
                "files": []
              },
              "declarations": [
                {
                  "qualifiedName": "com.ex.gen.$typeName",
                  "kind": "class",
                  "visibility": "public",
                  "modifiers": [],
                  "typeParameters": [],
                  "superTypes": [],
                  "properties": [
                    {
                      "name": "$propertyName",
                      "type": {
                        "packageName": "kotlin",
                        "simpleName": "String",
                        "arguments": [],
                        "nullable": false
                      },
                      "mutable": false,
                      "visibility": "public"
                    }
                  ],
                  "functions": [],
                  "enumEntries": []
                }
              ]
            }
            """.trimIndent(),
        )
        return projection
    }

    /**
     * The manifest carries `kotlinApiSha256`, but that digest is computed from the declaration model, upstream
     * of emission -- it was byte-identical across ADR 0015's regression that deleted 518 emitted public symbols
     * and across its repair. Letting it stand in for emitted-API evidence is what made this layer report a
     * confident `breaking` verdict for every digest delta. Absent a staged projection the only honest answer is
     * `unavailable`.
     */
    @Test
    fun withoutAStagedProjectionTheKotlinApiLayerIsUnavailableRatherThanAVerdict() {
        val manifest = writeV1alpha2Manifest("f".repeat(64))

        val result = sdkgenCommand().test("compat --from $manifest --to $manifest --format json")

        assertTrue(result.stdout.contains("\"layer\":\"kotlinApi\",\"outcome\":\"unavailable\""))
        assertTrue(result.stdout.contains("\"aggregateOutcome\":\"incomplete\""))
        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
    }

    /** A real removal in a staged projection must still be reported, and reported as breaking. */
    @Test
    fun aRemovedDeclarationInAStagedProjectionIsReportedAsBreaking() {
        val manifest = writeV1alpha2Manifest("9".repeat(64))
        val before = writeKotlinApiProjection("Widget", propertyName = "id")
        val after = writeKotlinApiProjection("Widget", propertyName = "identifier")

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--kotlin-api-from $before --kotlin-api-to $after",
            )

        assertTrue(result.stdout.contains("\"layer\":\"kotlinApi\",\"outcome\":\"changed\""))
        assertTrue(result.stdout.contains("\"classification\":\"breaking\""))
    }

    @Test
    fun aProjectionFromAnotherGenerationFailsClosed() {
        val manifest = writeV1alpha2Manifest("8".repeat(64))
        val projection = writeKotlinApiProjection("Widget", propertyName = "id")
        val mismatched =
            projection.also { path ->
                path.writeText(
                    Files.readString(path).replace(
                        "\"declarationModelSha256\": \"${"9".repeat(64)}\"",
                        "\"declarationModelSha256\": \"${"7".repeat(64)}\"",
                    ),
                )
            }

        val result =
            sdkgenCommand().test(
                "compat --from $manifest --to $manifest --format json " +
                    "--kotlin-api-from $mismatched --kotlin-api-to $mismatched",
            )

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.statusCode, result.output)
        assertTrue(result.stdout.contains("\"status\":\"invalid\""))
    }

    private fun materializeAbiFixture(): Path {
        val directory = Files.createTempDirectory(temporaryDirectory, "sdkgen-cli-compat-abi")
        val manifest = directory.resolve("manifest.json")
        manifest.writeBytes(resourceBytes("abi/github-fixture-jvm-only/manifest.json"))
        directory.resolve("jvm.api").writeBytes(resourceBytes("abi/github-fixture-jvm-only/jvm.api"))
        return manifest
    }

    private fun materializeAbiFixtureWithRemovedMember(): Path {
        val directory = Files.createTempDirectory(temporaryDirectory, "sdkgen-cli-compat-abi-after")
        val manifest = directory.resolve("manifest.json")
        manifest.writeText(
            """
            {
              "sdkIdentity": "github-fixture",
              "jvm": { "dumpPath": "jvm.api" }
            }
            """.trimIndent(),
        )
        directory.resolve("jvm.api").writeText(
            "public final class com/ex/gen/Widget {\n" +
                "\tpublic final fun getId ()Ljava/lang/String;\n" +
                "}\n",
        )
        return manifest
    }

    private fun resourceBytes(resource: String): ByteArray =
        requireNotNull(javaClass.getResourceAsStream(resource)) { "missing test resource: $resource" }
            .use { it.readBytes() }

    private companion object {
        // Exit 3 is CompatibilityExitPolicy's private THRESHOLD_REACHED_EXIT_CODE; duplicated here as a literal
        // the same way this file's other assertions compare against the frozen JSON shape directly.
        const val COMPATIBILITY_THRESHOLD_REACHED_EXIT_CODE = 3
    }
}

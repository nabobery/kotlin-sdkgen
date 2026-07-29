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
 * Regression coverage for the compatibility-manifest field-validation defect: [CompatibilityManifestReader] rejected every manifest
 * [com.nabobery.sdkgen.engine.output.AtomicOutputPublisher] actually writes, because it declared only five of the
 * schema's twenty-two top-level fields as known. ADR 0013 ("Unknown here means not part of the declared manifest
 * schema") corrects that: a reader may consume a subset of the declared schema, but it must declare the full
 * schema so a field it does not consume is not confused with a field that does not exist.
 *
 * [pagination-fixture-manifest.json] is a byte-for-byte copy of the real, committed
 * `conformance/pagination-fixture/consumer/src/main/kotlin/manifest.json`, the actual output of a real generation
 * run. Reading it from a fixed classpath resource (rather than a path relative to the test JVM's working
 * directory) means this test does not depend on Gradle's working-directory conventions, while still breaking if
 * the writer and reader ever diverge again — the defect this packet fixes.
 */
internal class CompatibilityManifestRealManifestFieldsTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun readsTheRealManifestTheEngineWrites() {
        val manifest = materializeRealManifest()

        val snapshot = CompatibilityManifestReader.read(manifest)

        assertEquals("v1alpha2", snapshot.schemaVersion)
        assertEquals(6, snapshot.files.size)
        assertTrue(snapshot.files.any { it.path == "com/nabobery/sdkgen/generated/Issue.kt" })
        assertEquals(
            "29f2531892657a43a9505c2b1ac38153f065e9f4b81f69878c1ca6b7dbf4e2f0",
            snapshot.declarationModelSha256,
        )
        assertEquals(
            "ac0da4229f07e40bcb9b19d468cc7be26591e0ec10283dedee2300396a66e102",
            snapshot.effectiveContractSha256,
        )
        assertEquals(
            "58f716009a7bb3b19de7d170126e17b6a17e2045c16d4f36d2101a30ae992762",
            snapshot.semanticModelSha256,
        )
        assertEquals(
            "3141a579acb38b5b8fcb16ca07f25302ac2ca49dc7e7e505f5cc70a7f2caf46b",
            snapshot.kotlinApiSha256,
        )
    }

    @Test
    fun realManifestSelfComparisonMakesExactlyItsTwoIndependentEvidenceLayersAvailable() {
        val snapshot = CompatibilityManifestReader.read(materializeRealManifest())

        val report = CompatibilityReport.compare(snapshot, snapshot)

        val expectedAvailableLayers =
            setOf(
                CompatibilityLayer.SOURCE_CONTRACT,
                CompatibilityLayer.SEMANTIC_MODEL,
            )
        assertEquals(
            expectedAvailableLayers,
            report.layers
                .filter { it.outcome != CompatibilityLayerOutcome.UNAVAILABLE }
                .map(CompatibilityLayerReport::layer)
                .toSet(),
        )
        assertEquals(
            CompatibilityLayer.entries.toSet() - expectedAvailableLayers,
            report.layers
                .filter { it.outcome == CompatibilityLayerOutcome.UNAVAILABLE }
                .map(CompatibilityLayerReport::layer)
                .toSet(),
        )
    }

    @Test
    fun stillRejectsAFieldGenuinelyOutsideTheDeclaredSchema() {
        val realManifestText = realManifestResourceText()
        val withUnknownField =
            realManifestText.replaceFirst(
                "\"schemaVersion\": \"v1alpha2\",",
                "\"schemaVersion\": \"v1alpha2\",\n    \"totallyNewField\": \"unexpected\",",
            )
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-real-manifest", ".json")
        manifest.writeText(withUnknownField)

        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }

        assertTrue(failure.message.orEmpty().contains("unknown field"))
        assertTrue(failure.message.orEmpty().contains("totallyNewField"))
    }

    private fun materializeRealManifest(): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-real-manifest", ".json")
        manifest.writeBytes(realManifestResourceBytes())
        return manifest
    }

    private fun realManifestResourceBytes(): ByteArray =
        requireNotNull(javaClass.getResourceAsStream(REAL_MANIFEST_RESOURCE)) {
            "missing test resource: $REAL_MANIFEST_RESOURCE"
        }.use { it.readBytes() }

    private fun realManifestResourceText(): String = realManifestResourceBytes().toString(Charsets.UTF_8)

    private companion object {
        const val REAL_MANIFEST_RESOURCE = "pagination-fixture-manifest.json"
    }
}

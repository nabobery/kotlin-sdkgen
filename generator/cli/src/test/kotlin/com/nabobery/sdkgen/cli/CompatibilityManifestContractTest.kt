package com.nabobery.sdkgen.cli

import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Initial compatibility-report RED contract for the versioned, bounded compatibility-manifest reader.
 *
 * Expected production signatures are [CompatibilityManifestReader.read],
 * [CompatibilityManifestInputException], and [CompatibilityReport.compare].
 */
internal class CompatibilityManifestContractTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun v1alpha1ManifestRemainsReadableButProducesIncompleteFiveLayerEvidence() {
        val manifest = writeManifest(fileCount = 1, schemaVersion = "v1alpha1")

        val snapshot = CompatibilityManifestReader.read(manifest)
        val report = CompatibilityReport.compare(snapshot, snapshot)

        assertEquals("v1alpha1", snapshot.schemaVersion)
        assertEquals(CompatibilityAggregateOutcome.INCOMPLETE, report.aggregateOutcome)
        assertEquals(CompatibilityLayer.entries.toSet(), report.layers.map(CompatibilityLayerReport::layer).toSet())
        assertEquals(CompatibilityLayer.entries.size, report.layers.size)
        assertEquals(
            report.layers.size,
            report.layers
                .map(CompatibilityLayerReport::layer)
                .distinct()
                .size,
        )
        assertTrue(report.layers.any { it.outcome == CompatibilityLayerOutcome.UNAVAILABLE })
        assertTrue(
            report.layers
                .filter { it.outcome == CompatibilityLayerOutcome.UNAVAILABLE }
                .all { it.unavailableReason != null },
        )
    }

    @Test
    fun v1alpha2DigestFixtureMakesExactlyItsTwoIndependentEvidenceLayersAvailable() {
        val digests = distinctV1alpha2Digests()
        val snapshot =
            CompatibilityManifestReader.read(
                writeManifest(
                    fileCount = 1,
                    schemaVersion = "v1alpha2",
                    v1alpha2Digests = digests,
                ),
            )
        val selfComparison = CompatibilityReport.compare(snapshot, snapshot)
        // `kotlinApi` is deliberately absent. A manifest carries `kotlinApiSha256`, but that digest is
        // computed from the declaration model, upstream of emission, so it cannot establish what the emitter
        // actually exposed -- it was byte-identical across ADR 0015's regression that deleted 518 emitted
        // public symbols. Emitted-API evidence is staged and supplied through `--kotlin-api-from/-to`, so a
        // manifest pair alone leaves the layer `unavailable`.
        val expectedAvailableLayers =
            setOf(
                CompatibilityLayer.SOURCE_CONTRACT,
                CompatibilityLayer.SEMANTIC_MODEL,
            )

        fun assertOnlyLayerChanged(
            changedDigests: V1alpha2Digests,
            expectedLayer: CompatibilityLayer,
        ) {
            val comparison = CompatibilityReport.compare(snapshot, readV1alpha2Snapshot(changedDigests))

            assertEquals(
                setOf(expectedLayer),
                comparison.layers
                    .filter { it.outcome == CompatibilityLayerOutcome.CHANGED }
                    .map(CompatibilityLayerReport::layer)
                    .toSet(),
            )
        }

        assertEquals(3, digests.values.distinct().size)
        assertEquals(
            expectedAvailableLayers,
            selfComparison.layers
                .filter { it.outcome != CompatibilityLayerOutcome.UNAVAILABLE }
                .map(CompatibilityLayerReport::layer)
                .toSet(),
        )
        assertEquals(
            CompatibilityLayer.entries.toSet() - expectedAvailableLayers,
            selfComparison.layers
                .filter { it.outcome == CompatibilityLayerOutcome.UNAVAILABLE }
                .map(CompatibilityLayerReport::layer)
                .toSet(),
        )

        assertOnlyLayerChanged(
            changedDigests = digests.copy(effectiveContractSha256 = "e".repeat(64)),
            expectedLayer = CompatibilityLayer.SOURCE_CONTRACT,
        )
        assertOnlyLayerChanged(
            changedDigests = digests.copy(semanticModelSha256 = "f".repeat(64)),
            expectedLayer = CompatibilityLayer.SEMANTIC_MODEL,
        )
        // A `kotlinApiSha256` delta must move no layer at all: it is not emitted-API evidence, and the
        // remaining two layers are keyed on their own digests.
        assertEquals(
            emptySet(),
            CompatibilityReport
                .compare(snapshot, readV1alpha2Snapshot(digests.copy(kotlinApiSha256 = "0".repeat(64))))
                .layers
                .filter { it.outcome == CompatibilityLayerOutcome.CHANGED }
                .map(CompatibilityLayerReport::layer)
                .toSet(),
        )
    }

    @Test
    fun manifestReaderAcceptsStripesTenThousandSixHundredSixteenFiles() {
        val manifest = writeManifest(fileCount = 10_616, schemaVersion = "v1alpha2")

        val snapshot = CompatibilityManifestReader.read(manifest)

        assertEquals(10_616, snapshot.files.size)
    }

    @Test
    fun manifestReaderRejectsOverCountMalformedInputBeforeUnboundedAllocationWithDeterministicFailure() {
        val manifest = writeOverCountMalformedManifest()

        val first =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }
        val second =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }

        assertEquals(first.message, second.message)
        assertTrue(first.message.orEmpty().contains("20,000"))
    }

    @Test
    fun manifestReaderRejectsOverByteMalformedInputBeforeParsingWithDeterministicFailure() {
        val manifest = writeOverByteManifest()

        val first =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }
        val second =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }

        assertEquals(first.message, second.message)
        assertTrue(first.message.orEmpty().contains("16 MiB"))
    }

    @Test
    fun manifestReaderRejectsHostileManifestPaths() {
        val hostilePaths =
            listOf(
                "/generated/absolute.kt" to "relative",
                "generated/../traversal.kt" to "traverse",
                "generated/\u0000nul.kt" to "NUL",
                "generated//non-canonical.kt" to "canonical",
                "C:\\generated\\Client.kt" to "drive",
                "C:/generated/Client.kt" to "drive",
                "" to "empty",
            )

        hostilePaths.forEach { (path, expectedMessageFragment) ->
            val failure =
                assertFailsWith<CompatibilityManifestInputException> {
                    CompatibilityManifestReader.read(
                        writeManifest(
                            fileCount = 1,
                            schemaVersion = "v1alpha2",
                            filePath = { path },
                        ),
                    )
                }

            assertTrue(failure.message.orEmpty().contains(expectedMessageFragment))
        }
    }

    /**
     * The 20,000-file cap is enforced by a counter local to `readFilesArray`, but the list it appends to lives in
     * the caller. JSON permits a repeated key, and the parse loop has no duplicate detection, so each additional
     * `files` array restarts the counter while continuing to fill the same list: N arrays admit N x 20,000
     * entries. Only the 16 MiB byte cap remains, and a minimal entry is about 85 bytes, so roughly 190,000 fit —
     * about 9.5x the bound the reader's own KDoc promises.
     *
     * This document declares 45,000 files across three arrays. It is rejected because duplicate top-level fields
     * are refused outright, which is the route that made the bypass possible; the 20,000 bound on a single array
     * is covered separately by
     * [manifestReaderRejectsOverCountMalformedInputBeforeUnboundedAllocationWithDeterministicFailure].
     */
    @Test
    fun repeatedFilesArraysCannotAccumulatePastTheGlobalFileCap() {
        val manifest = writeManifestWithRepeatedFilesArrays(arrayCount = 3, filesPerArray = 15_000)

        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }

        assertTrue(failure.message.orEmpty().contains("files"))
        assertTrue(failure.message.orEmpty().contains("more than once"))
    }

    /**
     * Last-wins on a repeated key is not merely untidy here: it is a downgrade primitive. A document whose first
     * `schemaVersion` is `v1alpha2` and whose second is `v1alpha1` carries v1alpha2 evidence fields while
     * declaring the version under which those fields are forbidden — the exact drift the strict-unknown-key rule
     * exists to catch.
     */
    @Test
    fun aRepeatedTopLevelFieldIsRejectedRatherThanSilentlyLastWins() {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-duplicate", ".json")
        manifest.writeText(
            """
            {
              "schemaVersion": "v1alpha2",
              "declarationModelSha256": "${"a".repeat(64)}",
              "effectiveContractSha256": "${"b".repeat(64)}",
              "semanticModelSha256": "${"c".repeat(64)}",
              "kotlinApiSha256": "${"d".repeat(64)}",
              "files": [],
              "schemaVersion": "v1alpha1"
            }
            """.trimIndent(),
        )

        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }

        assertTrue(failure.message.orEmpty().contains("schemaVersion"))
        assertTrue(failure.message.orEmpty().contains("more than once"))
    }

    @Test
    fun aNonStringSchemaVersionIsRejectedRatherThanCoerced() {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-nonstring", ".json")
        manifest.writeText(
            """
            {
              "schemaVersion": 2,
              "declarationModelSha256": "${"a".repeat(64)}",
              "files": []
            }
            """.trimIndent(),
        )

        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(manifest)
            }

        assertTrue(failure.message.orEmpty().contains("schemaVersion"))
    }

    private fun writeManifestWithRepeatedFilesArrays(
        arrayCount: Int,
        filesPerArray: Int,
    ): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-repeated", ".json")
        val digest = "a".repeat(64)
        Files.newOutputStream(manifest).use { output ->
            output.write("{\"schemaVersion\":\"v1alpha2\",\"declarationModelSha256\":\"$digest\"".encodeToByteArray())
            output.write(",\"effectiveContractSha256\":\"${"b".repeat(64)}\"".encodeToByteArray())
            output.write(",\"semanticModelSha256\":\"${"c".repeat(64)}\"".encodeToByteArray())
            output.write(",\"kotlinApiSha256\":\"${"d".repeat(64)}\"".encodeToByteArray())
            repeat(arrayCount) { arrayIndex ->
                output.write(",\"files\":[".encodeToByteArray())
                repeat(filesPerArray) { fileIndex ->
                    if (fileIndex > 0) output.write(",".encodeToByteArray())
                    val entry = "{\"path\":\"generated/a$arrayIndex-$fileIndex.kt\",\"sha256\":\"$digest\"}"
                    output.write(entry.encodeToByteArray())
                }
                output.write("]".encodeToByteArray())
            }
            output.write("}".encodeToByteArray())
        }
        return manifest
    }

    private data class V1alpha2Digests(
        val effectiveContractSha256: String,
        val semanticModelSha256: String,
        val kotlinApiSha256: String,
    ) {
        val values: List<String>
            get() = listOf(effectiveContractSha256, semanticModelSha256, kotlinApiSha256)
    }

    private fun distinctV1alpha2Digests(): V1alpha2Digests =
        V1alpha2Digests(
            effectiveContractSha256 = "b".repeat(64),
            semanticModelSha256 = "c".repeat(64),
            kotlinApiSha256 = "d".repeat(64),
        )

    private fun readV1alpha2Snapshot(digests: V1alpha2Digests) =
        CompatibilityManifestReader.read(
            writeManifest(
                fileCount = 1,
                schemaVersion = "v1alpha2",
                v1alpha2Digests = digests,
            ),
        )

    private fun writeManifest(
        fileCount: Int,
        schemaVersion: String,
        filePath: (Int) -> String = { index -> "generated/$index.kt" },
        v1alpha2Digests: V1alpha2Digests = distinctV1alpha2Digests(),
        trailingContent: String = "",
    ): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-manifest", ".json")
        val declarationModelSha256 = "a".repeat(64)
        val files =
            buildString {
                repeat(fileCount) { index ->
                    if (index > 0) append(',')
                    append(
                        "{\"path\":${jsonString(filePath(index))},\"sha256\":\"$declarationModelSha256\"}",
                    )
                }
            }
        val v1alpha2Fields =
            if (schemaVersion == "v1alpha2") {
                """
                "effectiveContractSha256": "${v1alpha2Digests.effectiveContractSha256}",
                "semanticModelSha256": "${v1alpha2Digests.semanticModelSha256}",
                "kotlinApiSha256": "${v1alpha2Digests.kotlinApiSha256}",
                """.trimIndent()
            } else {
                ""
            }
        manifest.writeText(
            """
            {
              "schemaVersion": "$schemaVersion",
              "declarationModelSha256": "$declarationModelSha256",
              $v1alpha2Fields"files": [$files]$trailingContent
            }
            """.trimIndent(),
        )
        return manifest
    }

    private fun writeOverCountMalformedManifest(): Path =
        writeManifest(
            fileCount = 20_001,
            schemaVersion = "v1alpha2",
            trailingContent = ", \"malformedTail\":",
        )

    private fun jsonString(value: String): String =
        buildString {
            append('"')
            value.forEach { character ->
                when (character) {
                    '\\' -> append("\\\\")
                    '"' -> append("\\\"")
                    '\u0000' -> append("\\u0000")
                    else -> append(character)
                }
            }
            append('"')
        }

    private fun writeOverByteManifest(): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-oversized", ".json")
        val byteLimit = 16 * 1024 * 1024
        Files.newOutputStream(manifest).use { output ->
            output.write("{\"schemaVersion\":\"v1alpha2\",\"padding\":\"".encodeToByteArray())
            output.write(ByteArray(byteLimit + 1) { 'x'.code.toByte() })
            output.write("\",\"malformedTail\":}".encodeToByteArray())
        }
        return manifest
    }
}

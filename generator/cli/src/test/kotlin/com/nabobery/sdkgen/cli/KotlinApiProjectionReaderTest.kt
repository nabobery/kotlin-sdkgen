package com.nabobery.sdkgen.cli

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.fileSize
import kotlin.io.path.writeText
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Direct contract tests for [KotlinApiProjectionReader]. The production-corpus projections this reader must
 * accept are far larger than toy fixtures: the GitHub corpus stages 137-164 MiB documents with ~37-44k
 * declarations, so the byte bound must not reject a document the declaration bound accepts.
 */
internal class KotlinApiProjectionReaderTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    private val manifest =
        CompatibilityManifestSnapshot(
            schemaVersion = "sdkgen-compat/v1alpha2",
            files = emptyList(),
            declarationModelSha256 = DECLARATION_MODEL_SHA,
        )

    /**
     * A projection larger than 64 MiB but well under the declaration bound must be accepted: this is the
     * GitHub-scale shape (well over 100 MiB, tens of thousands of declarations) that the previous
     * whole-buffer bound rejected.
     */
    @Test
    fun aProjectionLargerThan64MiBWithinTheDeclarationBoundIsAccepted() {
        val declarationCount = 30_000
        val projection = writeProjection(temporaryDirectory, declarationCount, padding = 2_300)
        assertTrue(projection.fileSize() > 64L * 1024 * 1024, "fixture must exceed 64 MiB to be probative")

        val evidence = KotlinApiProjectionReader.read(projection, manifest)

        assertEquals(declarationCount, evidence.projection.declarations.size)
    }

    /** The evidence fingerprint is the SHA-256 of the document bytes, byte-for-byte. */
    @Test
    fun theEvidenceFingerprintIsTheSha256OfTheDocumentBytes() {
        val projection = writeProjection(temporaryDirectory, declarationCount = 2, padding = 0)

        val evidence = KotlinApiProjectionReader.read(projection, manifest)

        val expected =
            MessageDigest
                .getInstance("SHA-256")
                .digest(Files.readAllBytes(projection))
                .joinToString("") { byte -> "%02x".format(byte) }
        assertEquals(expected, evidence.evidence.sha256)
    }

    /**
     * Generation binding is load-bearing and must not depend on physical field order: a document that lists
     * `declarations` before `generation` still fails closed when the generation does not match the manifest.
     */
    @Test
    fun generationValidationFailsClosedWhenGenerationFollowsDeclarations() {
        val projection = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json")
        projection.writeText(
            """
            {
              "schemaVersion": "kotlin-public-api/v2",
              "declarations": [${declarationJson("com.ex.gen.Widget", padding = 0)}],
              "generation": {
                "declarationModelSha256": "${"a".repeat(64)}",
                "files": []
              }
            }
            """.trimIndent(),
        )

        val failure =
            assertFailsWith<KotlinApiProjectionInputException> {
                KotlinApiProjectionReader.read(projection, manifest)
            }
        assertTrue(failure.message!!.contains("does not match its compatibility manifest"))
    }

    @Test
    fun duplicateQualifiedNamesAreRejected() {
        val projection = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json")
        projection.writeText(
            projectionDocument(
                listOf(
                    declarationJson("com.ex.gen.Widget", padding = 0),
                    declarationJson("com.ex.gen.Widget", padding = 0),
                ),
            ),
        )

        val failure =
            assertFailsWith<KotlinApiProjectionInputException> {
                KotlinApiProjectionReader.read(projection, manifest)
            }
        assertTrue(failure.message!!.contains("duplicate qualified name"))
    }

    @Test
    fun anUnknownRootFieldIsRejected() {
        val projection = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json")
        projection.writeText(
            projectionDocument(listOf(declarationJson("com.ex.gen.Widget", padding = 0)))
                .replaceFirst("{", "{\n  \"unexpected\": true,"),
        )

        val failure =
            assertFailsWith<KotlinApiProjectionInputException> {
                KotlinApiProjectionReader.read(projection, manifest)
            }
        assertTrue(failure.message!!.contains("unknown field"))
    }

    /**
     * The committed GitHub post-flip projection is the real artifact the compat gate consumes: 137 MiB
     * decompressed (stored gzip-compressed under GitHub's file-size limit) and ~36k declarations, bound to
     * the committed GitHub generation manifest. Reading it end-to-end proves the reader at
     * production-corpus scale, not just on synthetic fixtures.
     */
    @Test
    fun theCommittedGitHubScaleProjectionIsReadAgainstItsRealManifest() {
        val projection = Path.of(System.getProperty("cli.githubPostProjection"))
        val manifest = CompatibilityManifestReader.read(Path.of(System.getProperty("cli.githubGeneratedManifest")))

        val evidence = KotlinApiProjectionReader.read(projection, manifest)

        assertTrue(evidence.projection.declarations.size > 30_000, "expected GitHub-scale declaration count")
        assertEquals(64, evidence.evidence.sha256.length)
    }

    /**
     * A gzip-compressed projection is transparently decompressed, and its evidence fingerprint equals the
     * plain document's: the contract hashes the uncompressed document bytes, so storage compression (used
     * for the committed production-scale projections) never changes evidence identity.
     */
    @Test
    fun aGzipCompressedProjectionYieldsTheSameEvidenceAsThePlainDocument() {
        val plain = writeProjection(temporaryDirectory, declarationCount = 3, padding = 0)
        val compressed = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json.gz")
        java.util.zip.GZIPOutputStream(Files.newOutputStream(compressed)).use { output ->
            Files.newInputStream(plain).use { input -> input.transferTo(output) }
        }

        val plainEvidence = KotlinApiProjectionReader.read(plain, manifest)
        val compressedEvidence = KotlinApiProjectionReader.read(compressed, manifest)

        assertEquals(plainEvidence.projection, compressedEvidence.projection)
        assertEquals(plainEvidence.evidence.sha256, compressedEvidence.evidence.sha256)
    }

    /** The byte guard rail binds the decompressed size, so a small compressed bomb still fails closed. */
    @Test
    fun theByteGuardRailAppliesToTheDecompressedBytes() {
        val plain = writeProjection(temporaryDirectory, declarationCount = 40, padding = 0)
        val compressed = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json.gz")
        java.util.zip.GZIPOutputStream(Files.newOutputStream(compressed)).use { output ->
            Files.newInputStream(plain).use { input -> input.transferTo(output) }
        }
        assertTrue(Files.size(compressed) < Files.size(plain))

        val failure =
            assertFailsWith<KotlinApiProjectionInputException> {
                KotlinApiProjectionReader.read(compressed, manifest, maxProjectionBytes = Files.size(compressed))
            }
        assertTrue(failure.message!!.contains("exceeds the maximum size"))
    }

    @Test
    fun anEmptyDeclarationsArrayIsAccepted() {
        val projection = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json")
        projection.writeText(projectionDocument(emptyList()))

        val evidence = KotlinApiProjectionReader.read(projection, manifest)

        assertEquals(0, evidence.projection.declarations.size)
    }

    @Test
    fun malformedJsonInsideTheDeclarationsArrayIsRejectedAsNotWellFormed() {
        val projection = Files.createTempFile(temporaryDirectory, "sdkgen-projection", ".json")
        projection.writeText(
            projectionDocument(listOf(declarationJson("com.ex.gen.Widget", padding = 0)))
                .replace("\"enumEntries\": []", "\"enumEntries\": [,]"),
        )

        val failure =
            assertFailsWith<KotlinApiProjectionInputException> {
                KotlinApiProjectionReader.read(projection, manifest)
            }
        assertTrue(failure.message!!.contains("not well-formed JSON"))
    }

    /** The byte guard rail still fails closed; enforced mid-stream rather than by pre-buffering the file. */
    @Test
    fun aProjectionBeyondTheByteGuardRailIsRejected() {
        val projection = writeProjection(temporaryDirectory, declarationCount = 2, padding = 0)

        val failure =
            assertFailsWith<KotlinApiProjectionInputException> {
                KotlinApiProjectionReader.read(projection, manifest, maxProjectionBytes = 64)
            }
        assertTrue(failure.message!!.contains("exceeds the maximum size"))
    }

    private fun writeProjection(
        directory: Path,
        declarationCount: Int,
        padding: Int,
    ): Path {
        val projection = Files.createTempFile(directory, "sdkgen-projection", ".json")
        Files.newBufferedWriter(projection).use { writer ->
            writer.write(
                """
                {
                  "schemaVersion": "kotlin-public-api/v2",
                  "generation": {
                    "declarationModelSha256": "$DECLARATION_MODEL_SHA",
                    "files": []
                  },
                  "declarations": [
                """.trimIndent(),
            )
            repeat(declarationCount) { index ->
                if (index > 0) writer.write(",")
                writer.write(declarationJson("com.ex.gen.Declaration$index", padding))
            }
            writer.write("]}")
        }
        return projection
    }

    private fun projectionDocument(declarations: List<String>): String =
        """
        {
          "schemaVersion": "kotlin-public-api/v2",
          "generation": {
            "declarationModelSha256": "$DECLARATION_MODEL_SHA",
            "files": []
          },
          "declarations": [${declarations.joinToString(",")}]
        }
        """.trimIndent()

    private fun declarationJson(
        qualifiedName: String,
        padding: Int,
    ): String {
        val properties =
            (0 until (padding / 115)).joinToString(",") { index ->
                """
                {
                  "name": "property$index",
                  "type": {"packageName": "kotlin", "simpleName": "String", "arguments": [], "nullable": false},
                  "mutable": false,
                  "visibility": "public"
                }
                """.trimIndent()
            }
        return """
            {
              "qualifiedName": "$qualifiedName",
              "kind": "class",
              "visibility": "public",
              "modifiers": [],
              "typeParameters": [],
              "superTypes": [],
              "properties": [$properties],
              "functions": [],
              "enumEntries": []
            }
            """.trimIndent()
    }

    private companion object {
        private val DECLARATION_MODEL_SHA = "9".repeat(64)
    }
}

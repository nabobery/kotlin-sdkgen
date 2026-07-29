package com.nabobery.sdkgen.cli

import org.junit.jupiter.api.io.TempDir
import java.io.RandomAccessFile
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.writeBytes
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertTrue

/**
 * [AbiEvidenceReaderTest] proves [AbiEvidenceReader] turns a staged evidence manifest plus its referenced dump
 * files into [GeneratedSdkAbiEvidence] that flows through [AbiCompatibilityClassifier] end to end, and that a
 * KLib target named [GeneratedSdkKlibTargetState.Unavailable] in the manifest reaches the classifier as exactly
 * that state (never silently dropped, never misread as [GeneratedSdkKlibTargetState.Available]).
 */
internal class AbiEvidenceReaderTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun readsAStagedJvmDumpAndANamedUnavailableKlibTarget() {
        val evidence = AbiEvidenceReader.read(materializeFixtureWithUnavailableAppleTarget())

        assertEquals("github-fixture", evidence.sdkIdentity)
        val jvm = requireNotNull(evidence.jvm)
        assertTrue(jvm.dumpText.contains("getId"))
        assertEquals("jvm-abi-dump", jvm.evidence.kind)
        assertEquals(1, evidence.klibTargets.size)
        val iosArm64 = evidence.klibTargets.single()
        assertEquals("iosArm64", iosArm64.targetName)
        val state = assertIs<GeneratedSdkKlibTargetState.Unavailable>(iosArm64.state)
        assertEquals("apple-target-requires-macos-host", state.reasonCode)
    }

    /**
     * An unavailable target is `unknown`, never `unchanged`, even when both sides name the identical reason:
     * a target that could not be inspected cannot be asserted to be the same. `unknown` in turn makes the
     * aggregate `incomplete`, so a build cannot pass on the strength of a target nobody looked at. This is the
     * fail-closed half of the contract, and it is why the JVM-only fixture above is the one that can reach a
     * complete report.
     */
    @Test
    fun anUnavailableKlibTargetIsUnknownRatherThanUnchangedEvenOnSelfComparison() {
        val evidence = AbiEvidenceReader.read(materializeFixtureWithUnavailableAppleTarget())

        val result = AbiCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
        assertTrue(
            result.changes.any { it.classification == CompatibilityClassification.UNKNOWN },
            "an uninspectable target must surface as unknown: ${result.changes}",
        )
        assertTrue(
            result.changes.any { it.summary.contains("iosArm64") },
            "the unknown change must name the target: ${result.changes}",
        )
    }

    @Test
    fun selfComparisonReportsUnchangedAndAvailable() {
        // Deliberately the JVM-only fixture: an Unavailable KLib target always classifies as a change
        // (CompatibilityClassification.UNKNOWN) per AbiCompatibilityClassifier, even when both sides name the
        // identical reason, because "attempted but no dump could be produced" can never be read as "confirmed
        // unchanged". Proving a clean UNCHANGED self-comparison therefore needs a fixture with no declared KLib
        // targets at all.
        val evidence = AbiEvidenceReader.read(materializeJvmOnlyFixture())

        val result = AbiCompatibilityClassifier.classify(evidence, evidence)

        assertEquals(CompatibilityLayerOutcome.UNCHANGED, result.layerReport.outcome)
        assertTrue(result.changes.isEmpty())
    }

    @Test
    fun aRemovedJvmMemberIsClassifiedBreaking() {
        val before = AbiEvidenceReader.read(materializeJvmOnlyFixture())
        val afterDirectory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-after")
        val afterManifest = afterDirectory.resolve("manifest.json")
        afterManifest.writeText(
            """
            {
              "sdkIdentity": "github-fixture",
              "jvm": { "dumpPath": "jvm.api" }
            }
            """.trimIndent(),
        )
        afterDirectory.resolve("jvm.api").writeText(
            "public final class com/ex/gen/Widget {\n" +
                "\tpublic final fun getId ()Ljava/lang/String;\n" +
                "}\n",
        )
        val after = AbiEvidenceReader.read(afterManifest)

        val result = AbiCompatibilityClassifier.classify(before, after)

        assertEquals(CompatibilityLayerOutcome.CHANGED, result.layerReport.outcome)
        assertTrue(result.changes.any { it.classification == CompatibilityClassification.BREAKING })
    }

    @Test
    fun bothDumpPathAndUnavailableOnOneKlibTargetFailsClosed() {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-malformed")
        directory.resolve("manifest.json").writeText(
            """
            {
              "sdkIdentity": "malformed",
              "klibTargets": [
                {
                  "targetName": "linuxX64",
                  "dumpPath": "does-not-matter.klib.api",
                  "unavailable": { "reasonCode": "x" }
                }
              ]
            }
            """.trimIndent(),
        )

        val failure =
            assertFailsWith<AbiEvidenceInputException> {
                AbiEvidenceReader.read(directory.resolve("manifest.json"))
            }

        assertTrue(failure.message.orEmpty().contains("linuxX64"))
    }

    @Test
    fun aDumpPathEscapingTheManifestDirectoryFailsClosed() {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-escape")
        directory.resolve("manifest.json").writeText(
            """{"sdkIdentity":"escape","jvm":{"dumpPath":"../outside.api"}}""",
        )

        assertFailsWith<AbiEvidenceInputException> {
            AbiEvidenceReader.read(directory.resolve("manifest.json"))
        }
    }

    /**
     * `..` traversal is caught lexically, but a symlink is not: `Path.normalize()` collapses text without
     * touching the filesystem, and `Files.isRegularFile` follows links by default. A staged evidence directory
     * containing `leak -> /` therefore lets `leak/etc/hosts` pass containment, be read whole, and be hashed into
     * a compatibility report. Containment has to be decided on real paths.
     */
    @Test
    fun aDumpPathReachingOutsideThroughASymlinkFailsClosed() {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-symlink")
        val outside = Files.createTempDirectory(temporaryDirectory, "abi-evidence-outside")
        outside.resolve("secret.api").writeText("public final class com/secret/Leaked {\n}\n")
        Files.createSymbolicLink(directory.resolve("leak"), outside)

        directory.resolve("manifest.json").writeText(
            """{"sdkIdentity":"symlink","jvm":{"dumpPath":"leak/secret.api"}}""",
        )

        val failure =
            assertFailsWith<AbiEvidenceInputException> {
                AbiEvidenceReader.read(directory.resolve("manifest.json"))
            }

        assertTrue(failure.message.orEmpty().contains("escape"))
    }

    @Test
    fun anOversizedManifestIsRejectedBeforeParsing() {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-huge-manifest")
        val manifest = directory.resolve("manifest.json")
        // Valid JSON, just far larger than a pointer file has any reason to be.
        manifest.writeText(
            "{\"sdkIdentity\":\"huge\",\"note\":\"" +
                "a".repeat(2 * 1024 * 1024) +
                "\",\"jvm\":{\"dumpPath\":\"jvm.api\"}}",
        )

        val failure =
            assertFailsWith<AbiEvidenceInputException> { AbiEvidenceReader.read(manifest) }

        assertTrue(failure.message.orEmpty().contains("maximum size"))
    }

    @Test
    fun anOversizedDumpIsRejectedBeforeItIsReadIntoMemory() {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-huge-dump")
        directory.resolve("manifest.json").writeText(
            """{"sdkIdentity":"huge-dump","jvm":{"dumpPath":"jvm.api"}}""",
        )
        // Sparse: sets the file length without writing 200 MiB, so the test stays fast and disk-cheap.
        RandomAccessFile(directory.resolve("jvm.api").toFile(), "rw").use { file ->
            file.setLength(200L * 1024 * 1024)
        }

        val failure =
            assertFailsWith<AbiEvidenceInputException> {
                AbiEvidenceReader.read(directory.resolve("manifest.json"))
            }

        assertTrue(failure.message.orEmpty().contains("maximum size"))
    }

    @Test
    fun anImplausibleNumberOfKlibTargetsIsRejected() {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-many-targets")
        val targets =
            (1..500).joinToString(",") { index ->
                """{"targetName":"target$index","unavailable":{"reasonCode":"not-attempted"}}"""
            }
        directory.resolve("manifest.json").writeText(
            """{"sdkIdentity":"many","klibTargets":[$targets]}""",
        )

        val failure =
            assertFailsWith<AbiEvidenceInputException> {
                AbiEvidenceReader.read(directory.resolve("manifest.json"))
            }

        assertTrue(failure.message.orEmpty().contains("klibTargets"))
    }

    /**
     * The shared fixture is a JVM-only generated SDK, so it declares no `klibTargets` at all. A target this
     * SDK's build matrix never attempts is absent, which is distinct from a target that was attempted and
     * could not be dumped — see [materializeFixtureWithUnavailableAppleTarget].
     */
    private fun materializeJvmOnlyFixture(): Path {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-fixture-jvm-only")
        val manifest = directory.resolve("manifest.json")
        manifest.writeBytes(resourceBytes("abi/github-fixture-jvm-only/manifest.json"))
        directory.resolve("jvm.api").writeBytes(resourceBytes("abi/github-fixture-jvm-only/jvm.api"))
        return manifest
    }

    private fun materializeFixtureWithUnavailableAppleTarget(): Path {
        val directory = Files.createTempDirectory(temporaryDirectory, "abi-evidence-unavailable")
        val manifest = directory.resolve("manifest.json")
        manifest.writeText(
            """
            {
              "sdkIdentity": "github-fixture",
              "jvm": { "dumpPath": "jvm.api" },
              "klibTargets": [
                {
                  "targetName": "iosArm64",
                  "unavailable": {
                    "reasonCode": "apple-target-requires-macos-host",
                    "detail": "test fixture"
                  }
                }
              ]
            }
            """.trimIndent(),
        )
        directory.resolve("jvm.api").writeBytes(resourceBytes("abi/github-fixture/jvm.api"))
        return manifest
    }

    private fun resourceBytes(resource: String): ByteArray =
        requireNotNull(javaClass.getResourceAsStream(resource)) { "missing test resource: $resource" }
            .use { it.readBytes() }
}

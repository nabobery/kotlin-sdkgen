package com.nabobery.sdkgen.cli

import org.junit.jupiter.api.io.TempDir
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Focused regression coverage for [CompatibilityManifestReader] guards that the frozen
 * [CompatibilityManifestContractTest] does not exercise:
 *
 * - backslash-only and mixed-separator root traversal, and a drive-relative Windows path with no separator after
 *   the drive letter at all;
 * - a `v1alpha1` manifest carrying a `v1alpha2`-only evidence field, which must fail closed rather than silently
 *   activating a report layer that field was never meant to feed;
 * - unknown top-level and file-entry keys, under both schema versions, which must fail closed rather than be
 *   skipped;
 * - an unrecognised or empty `schemaVersion`;
 * - a non-hex or wrong-length digest, at any of the four top-level fields or a per-file `sha256`, which must fail
 *   at read time rather than being laundered into classifier evidence.
 *
 * Every assertion here checks specific message content, not merely the exception type, so a fix that rejects input
 * for the wrong reason still fails the test.
 */
internal class CompatibilityManifestPathValidationTest {
    @TempDir
    lateinit var temporaryDirectory: Path

    @Test
    fun manifestReaderRejectsBackslashOnlyRootTraversal() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(writeManifestWithPath("generated\\..\\outside.kt"))
            }

        assertTrue(failure.message.orEmpty().contains("traverse"))
    }

    @Test
    fun manifestReaderRejectsMixedSeparatorRootTraversal() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(writeManifestWithPath("generated\\../outside.kt"))
            }

        assertTrue(failure.message.orEmpty().contains("traverse"))
    }

    @Test
    fun manifestReaderRejectsDriveRelativePathWithoutSeparator() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(writeManifestWithPath("C:outside.kt"))
            }

        assertTrue(failure.message.orEmpty().contains("drive"))
    }

    @Test
    fun manifestReaderRejectsV1alpha1ManifestCarryingEffectiveContractSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "effectiveContractSha256": "$VALID_DIGEST",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("effectiveContractSha256"))
        assertTrue(failure.message.orEmpty().contains("v1alpha1"))
    }

    @Test
    fun manifestReaderRejectsV1alpha1ManifestCarryingSemanticModelSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "$VALID_DIGEST",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("semanticModelSha256"))
        assertTrue(failure.message.orEmpty().contains("v1alpha1"))
    }

    @Test
    fun manifestReaderRejectsV1alpha1ManifestCarryingKotlinApiSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "$VALID_DIGEST",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("kotlinApiSha256"))
        assertTrue(failure.message.orEmpty().contains("v1alpha1"))
    }

    @Test
    fun manifestReaderRejectsUnknownTopLevelFieldUnderV1alpha1() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "extraTopLevelField": "unexpected",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("unknown field"))
        assertTrue(failure.message.orEmpty().contains("extraTopLevelField"))
    }

    @Test
    fun manifestReaderRejectsUnknownTopLevelFieldUnderV1alpha2() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "effectiveContractSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "$VALID_DIGEST",
                          "extraTopLevelField": "unexpected",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("unknown field"))
        assertTrue(failure.message.orEmpty().contains("extraTopLevelField"))
    }

    @Test
    fun manifestReaderRejectsUnknownFileEntryField() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "files": [
                            {"path":"generated/0.kt","sha256":"$VALID_DIGEST","extraFileField":"unexpected"}
                          ]
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("file entry"))
        assertTrue(failure.message.orEmpty().contains("unknown field"))
        assertTrue(failure.message.orEmpty().contains("extraFileField"))
    }

    @Test
    fun manifestReaderRejectsUnknownFileEntryFieldUnderV1alpha2() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "effectiveContractSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "$VALID_DIGEST",
                          "files": [
                            {"path":"generated/0.kt","sha256":"$VALID_DIGEST","extraFileField":"unexpected"}
                          ]
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("file entry"))
        assertTrue(failure.message.orEmpty().contains("unknown field"))
        assertTrue(failure.message.orEmpty().contains("extraFileField"))
    }

    @Test
    fun manifestReaderRejectsUnrecognizedSchemaVersion() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha3",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("unsupported schemaVersion"))
        assertTrue(failure.message.orEmpty().contains("v1alpha3"))
    }

    @Test
    fun manifestReaderRejectsEmptySchemaVersion() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("unsupported schemaVersion"))
    }

    @Test
    fun manifestReaderRejectsShortNonHexTopLevelDigest() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "not-a-sha256",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("declarationModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyFourCharacterNonHexTopLevelDigest() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "effectiveContractSha256": "${"g".repeat(64)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("effectiveContractSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsNonHexFileDigest() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "files": [{"path":"generated/0.kt","sha256":"not-a-sha256"}]
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("files[].sha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyThreeCharacterDigest() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "${"a".repeat(63)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("declarationModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyFiveCharacterDigest() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha1",
                          "declarationModelSha256": "${"a".repeat(65)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("declarationModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsNonHexSemanticModelSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "not-a-sha256",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("semanticModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyFourCharacterNonHexSemanticModelSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "${"g".repeat(64)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("semanticModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyThreeCharacterSemanticModelSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "${"a".repeat(63)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("semanticModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyFiveCharacterSemanticModelSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "${"a".repeat(65)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("semanticModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsUppercaseSemanticModelSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "semanticModelSha256": "${"A".repeat(64)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("semanticModelSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsNonHexKotlinApiSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "not-a-sha256",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("kotlinApiSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyFourCharacterNonHexKotlinApiSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "${"g".repeat(64)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("kotlinApiSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyThreeCharacterKotlinApiSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "${"a".repeat(63)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("kotlinApiSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsSixtyFiveCharacterKotlinApiSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "${"a".repeat(65)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("kotlinApiSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    @Test
    fun manifestReaderRejectsUppercaseKotlinApiSha256() {
        val failure =
            assertFailsWith<CompatibilityManifestInputException> {
                CompatibilityManifestReader.read(
                    writeManifest(
                        """
                        {
                          "schemaVersion": "v1alpha2",
                          "declarationModelSha256": "$VALID_DIGEST",
                          "kotlinApiSha256": "${"A".repeat(64)}",
                          "files": []
                        }
                        """.trimIndent(),
                    ),
                )
            }

        assertTrue(failure.message.orEmpty().contains("kotlinApiSha256"))
        assertTrue(failure.message.orEmpty().contains("SHA-256"))
    }

    private fun writeManifestWithPath(path: String): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-path-manifest", ".json")
        val digest = "a".repeat(64)
        manifest.writeText(
            """
            {
              "schemaVersion": "v1alpha1",
              "declarationModelSha256": "$digest",
              "files": [{"path":${jsonString(path)},"sha256":"$digest"}]
            }
            """.trimIndent(),
        )
        return manifest
    }

    private fun writeManifest(json: String): Path {
        val manifest = Files.createTempFile(temporaryDirectory, "sdkgen-compatibility-guard-manifest", ".json")
        manifest.writeText(json)
        return manifest
    }

    private fun jsonString(value: String): String =
        buildString {
            append('"')
            value.forEach { character ->
                when (character) {
                    '\\' -> append("\\\\")
                    '"' -> append("\\\"")
                    else -> append(character)
                }
            }
            append('"')
        }

    private companion object {
        private val VALID_DIGEST = "a".repeat(64)
    }
}

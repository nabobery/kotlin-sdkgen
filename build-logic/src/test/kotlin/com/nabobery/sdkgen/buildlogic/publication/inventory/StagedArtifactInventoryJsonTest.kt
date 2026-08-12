package com.nabobery.sdkgen.buildlogic.publication.inventory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class StagedArtifactInventoryJsonTest {
    @Test
    fun encodesTheCurrentV2SchemaVersionWithATargetField() {
        val inventory =
            SdkgenProductStagedArtifactInventory.of(
                listOf(
                    artifact(artifactId = "kotlin-sdkgen-transport-ktor-iosarm64", target = "iosarm64"),
                ),
            )

        val encoded = SdkgenProductStagedArtifactInventoryJson.encode(inventory)

        assertTrue(encoded.contains("\"schemaVersion\": \"sdkgen-staged-artifact-inventory-v2\""))
        assertTrue(encoded.contains("\"target\": \"iosarm64\""))
    }

    @Test
    fun roundTripsAnArtifactThatHasATarget() {
        val inventory =
            SdkgenProductStagedArtifactInventory.of(
                listOf(
                    artifact(artifactId = "kotlin-sdkgen-testing-js", target = "js"),
                ),
            )

        val decoded =
            SdkgenProductStagedArtifactInventoryJson.decode(
                SdkgenProductStagedArtifactInventoryJson.encode(inventory),
            )

        assertEquals("js", decoded.artifacts.single().target)
    }

    @Test
    fun roundTripsAnArtifactThatHasNoTarget() {
        val inventory =
            SdkgenProductStagedArtifactInventory.of(
                listOf(
                    artifact(artifactId = "kotlin-sdkgen-transport-java-http", target = null),
                ),
            )

        val encoded = SdkgenProductStagedArtifactInventoryJson.encode(inventory)
        assertTrue(encoded.contains("\"target\": null"))

        val decoded = SdkgenProductStagedArtifactInventoryJson.decode(encoded)
        assertNull(decoded.artifacts.single().target)
    }

    @Test
    fun decodesALegacyV1DocumentWithNoTargetFieldAsNullTarget() {
        val legacyV1Document =
            """
            {
              "schemaVersion": "sdkgen-staged-artifact-inventory-v1",
              "artifacts": [
                {
                  "group": "io.github.nabobery",
                  "artifactId": "kotlin-sdkgen-engine",
                  "version": "1.2.3",
                  "classifier": null,
                  "extension": "jar",
                  "relativePath": "io/github/nabobery/kotlin-sdkgen-engine/1.2.3/kotlin-sdkgen-engine-1.2.3.jar",
                  "sha256": "${"a".repeat(64)}"
                }
              ]
            }
            """.trimIndent()

        val decoded = SdkgenProductStagedArtifactInventoryJson.decode(legacyV1Document)

        assertEquals(1, decoded.artifacts.size)
        assertNull(decoded.artifacts.single().target)
    }

    @Test
    fun rejectsAV1DocumentThatDeclaresATargetField() {
        val malformedV1Document =
            """
            {
              "schemaVersion": "sdkgen-staged-artifact-inventory-v1",
              "artifacts": [
                {
                  "group": "io.github.nabobery",
                  "artifactId": "kotlin-sdkgen-engine",
                  "version": "1.2.3",
                  "classifier": null,
                  "extension": "jar",
                  "target": null,
                  "relativePath": "io/github/nabobery/kotlin-sdkgen-engine/1.2.3/kotlin-sdkgen-engine-1.2.3.jar",
                  "sha256": "${"a".repeat(64)}"
                }
              ]
            }
            """.trimIndent()

        val exception =
            assertThrows(IllegalStateException::class.java) {
                SdkgenProductStagedArtifactInventoryJson.decode(malformedV1Document)
            }
        assertTrue(exception.message.orEmpty().contains("target"))
    }

    @Test
    fun rejectsAV2DocumentMissingTheTargetField() {
        val truncatedV2Document =
            """
            {
              "schemaVersion": "sdkgen-staged-artifact-inventory-v2",
              "artifacts": [
                {
                  "group": "io.github.nabobery",
                  "artifactId": "kotlin-sdkgen-engine",
                  "version": "1.2.3",
                  "classifier": null,
                  "extension": "jar",
                  "relativePath": "io/github/nabobery/kotlin-sdkgen-engine/1.2.3/kotlin-sdkgen-engine-1.2.3.jar",
                  "sha256": "${"a".repeat(64)}"
                }
              ]
            }
            """.trimIndent()

        val exception =
            assertThrows(IllegalStateException::class.java) {
                SdkgenProductStagedArtifactInventoryJson.decode(truncatedV2Document)
            }
        assertTrue(exception.message.orEmpty().contains("target"))
    }

    @Test
    fun rejectsAnUnrecognizedSchemaVersion() {
        val document =
            """
            {"schemaVersion": "sdkgen-staged-artifact-inventory-v99", "artifacts": []}
            """.trimIndent()

        val exception =
            assertThrows(IllegalStateException::class.java) {
                SdkgenProductStagedArtifactInventoryJson.decode(document)
            }
        assertTrue(exception.message.orEmpty().contains("Unsupported"))
    }

    private fun artifact(
        artifactId: String,
        target: String?,
    ): SdkgenProductStagedArtifact =
        SdkgenProductStagedArtifact(
            coordinate = SdkgenProductCoordinate("io.github.nabobery", artifactId, "1.2.3"),
            classifier = null,
            extension = "klib",
            target = target,
            relativePath = "io/github/nabobery/$artifactId/1.2.3/$artifactId-1.2.3.klib",
            sha256 = "a".repeat(64),
        )
}

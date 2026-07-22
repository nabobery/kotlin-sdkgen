package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readBytes
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class OpenRouterBlockerInventoryTest {
    @Test
    fun productionPipelineInventoriesThePreExistingOpenRouterBlockerCategories() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.openRouterFile")))
        val sourceBytes = sourcePath.readBytes()
        val sha256 = MessageDigest.getInstance("SHA-256").digest(sourceBytes).toHex()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = "sdkgen://openrouter/openapi.yaml",
                sha256 = sha256,
                contentLength = sourceBytes.size.toLong(),
            )
        val config =
            SdkgenConfigV1Alpha1(
                version = ConfigVersion.V1_ALPHA_1,
                source = SourceConfig(source.canonicalUri, sha256),
                kotlin =
                    KotlinGenerationConfig(
                        packageName = "com.nabobery.sdkgen.generated",
                        coordinates = PackageCoordinates("com.nabobery", "openrouter-generated"),
                        naming = NamingConfig(clientName = "OpenRouterClient"),
                        targets = listOf(TargetFamily.JVM, TargetFamily.JS, TargetFamily.MACOS),
                    ),
                output = OutputConfig("generated", "resources", "manifest.json"),
            )
        val pipeline = GenerationPipeline("phase3-t8")
        val validation = pipeline.validate(config, source, emptyList())

        val blockingDiagnostics = validation.diagnostics.filter { diagnostic -> diagnostic.severity.name == "ERROR" }
        assertEquals(
            mapOf(
                "SDKGEN-PROJECTION-UNREPRESENTABLE-SCHEMA" to 35,
                "SDKGEN-PROJECTION-UNREPRESENTABLE-OPERATION" to 3,
            ),
            blockingDiagnostics.groupingBy { diagnostic -> diagnostic.code }.eachCount(),
        )
        val expectedCategories =
            mapOf(
                "conflicting-allOf" to 18,
                "missing-declaration" to 18,
                "primitive-oneOf" to 1,
                "incompatible-request-media" to 1,
            )
        assertEquals(
            expectedCategories,
            blockingDiagnostics.groupingBy { diagnostic -> blockerCategory(diagnostic.message) }.eachCount(),
        )
        assertEquals(
            expectedCategories,
            validation.exclusions.groupingBy { exclusion -> blockerCategory(exclusion.reason) }.eachCount(),
        )
        val output = Path.of(requireNotNull(System.getProperty("engine.openRouterGeneratedOutput"))).resolve("current")
        val failure =
            assertFailsWith<GenerationBlockedException> { pipeline.generate(config, source, emptyList(), output) }
        assertEquals(validation, failure.validation)
    }

    private fun blockerCategory(message: String): String =
        when {
            "conflicting allOf property" in message -> "conflicting-allOf"
            "has no emitted declaration" in message -> "missing-declaration"
            "primitive oneOf branch" in message -> "primitive-oneOf"
            "incompatible request schemas" in message -> "incompatible-request-media"
            else -> error("Unexpected OpenRouter blocker: $message")
        }

    private fun ByteArray.toHex(): String = joinToString("") { byte -> "%02x".format(byte) }
}

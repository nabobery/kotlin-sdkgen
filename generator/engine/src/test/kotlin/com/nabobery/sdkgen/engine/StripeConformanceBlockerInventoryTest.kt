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
import kotlin.io.path.createDirectories
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class StripeConformanceBlockerInventoryTest {
    @Test
    fun pinnedStripeSpecFreezesTheExactPreExistingGenerationBlockers() {
        val (config, source) = inputs()
        val pipeline = GenerationPipeline("phase3-t11")
        val validation = pipeline.validate(config, source, emptyList())
        val blockingDiagnostics = validation.diagnostics.filter { diagnostic -> diagnostic.severity.name == "ERROR" }
        val expectedCategories =
            mapOf(
                "dynamic-object-keys" to 148,
                "form-composition" to 9,
            )

        assertEquals(
            mapOf("SDKGEN-PROJECTION-UNREPRESENTABLE-OPERATION" to 157),
            blockingDiagnostics.groupingBy { diagnostic -> diagnostic.code }.eachCount(),
        )
        assertEquals(
            expectedCategories,
            blockingDiagnostics
                .groupingBy { diagnostic ->
                    category(diagnostic.message)
                }.eachCount(),
        )
        assertEquals(
            expectedCategories,
            validation.exclusions
                .groupingBy { exclusion ->
                    category(exclusion.reason)
                }.eachCount(),
        )
        assertEquals(
            157,
            validation.exclusions
                .map { exclusion -> exclusion.symbolId }
                .toSet()
                .size,
        )

        val inventory = Path.of(requireNotNull(System.getProperty("engine.t11StripeBlockerInventory")))
        val expected =
            buildString {
                append("symbolId\tcategory\tjsonPointer\treason\n")
                validation.exclusions.sortedBy { exclusion -> exclusion.symbolId }.forEach { exclusion ->
                    append(exclusion.symbolId)
                    append('\t')
                    append(category(exclusion.reason))
                    append('\t')
                    append(exclusion.jsonPointer)
                    append('\t')
                    append(exclusion.reason.replace('\t', ' ').replace('\n', ' '))
                    append('\n')
                }
            }
        if (System.getenv("UPDATE_T11_STRIPE_BLOCKERS") == "1") {
            inventory.parent.createDirectories()
            inventory.writeText(expected)
        }
        assertEquals(expected, inventory.readText())

        val output = Path.of(requireNotNull(System.getProperty("engine.stripeGeneratedOutput"))).resolve("blocked")
        val failure =
            assertFailsWith<GenerationBlockedException> { pipeline.generate(config, source, emptyList(), output) }
        assertEquals(validation, failure.validation)
    }

    private fun inputs(): Pair<SdkgenConfigV1Alpha1, ResolvedSource> {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.stripeFile")))
        val sourceBytes = sourcePath.readBytes()
        val sha256 = MessageDigest.getInstance("SHA-256").digest(sourceBytes).toHex()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = "sdkgen://stripe/openapi.json",
                sha256 = sha256,
                contentLength = sourceBytes.size.toLong(),
            )
        val config =
            SdkgenConfigV1Alpha1(
                version = ConfigVersion.V1_ALPHA_1,
                source = SourceConfig(source.canonicalUri, sha256),
                kotlin =
                    KotlinGenerationConfig(
                        packageName = "com.nabobery.sdkgen.generated.stripe",
                        coordinates = PackageCoordinates("com.nabobery.sdkgen", "stripe-generated"),
                        naming = NamingConfig(clientName = "StripeClient"),
                        targets = listOf(TargetFamily.JVM, TargetFamily.JS, TargetFamily.MACOS),
                    ),
                output = OutputConfig("sources", "resources", "manifest.json"),
            )
        return config to source
    }

    private fun category(message: String): String =
        when {
            "deepObject form arrays require" in message -> "deep-object-arrays"

            "form object must declare additionalProperties: false" in message -> "dynamic-object-keys"

            "form value cannot use oneOf or anyOf composition" in message ||
                "form anyOf branches overlap by wire kind" in message -> "form-composition"

            "multipart array part" in message -> "multipart-array"

            else -> error("Unexpected Stripe conformance blocker: $message")
        }

    private fun ByteArray.toHex(): String = joinToString("") { byte -> "%02x".format(byte) }
}

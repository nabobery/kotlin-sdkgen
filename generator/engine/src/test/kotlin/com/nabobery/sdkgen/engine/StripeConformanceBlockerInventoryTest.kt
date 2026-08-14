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
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class StripeConformanceBlockerInventoryTest {
    @Test
    fun pinnedStripeSpecFreezesTheExactPreExistingGenerationBlockers() {
        val (config, source) = inputs()
        val pipeline = GenerationPipeline("sdkgen-maintainers")
        val validation = pipeline.validate(config, source, emptyList())
        val blockingDiagnostics = validation.diagnostics.filter { diagnostic -> diagnostic.severity.name == "ERROR" }
        val expectedCategories =
            mapOf(
                "form-object-no-declared-shape" to 6,
                "form-composition" to 58,
                "parameter-deep-object-nonprimitive-arrays" to 2,
                "parameter-deep-object-nonprimitive-properties" to 2,
            )

        assertEquals(
            mapOf("SDKGEN-PROJECTION-UNREPRESENTABLE-OPERATION" to 68),
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
            68,
            validation.exclusions
                .map { exclusion -> exclusion.symbolId }
                .toSet()
                .size,
        )

        val inventory = Path.of(requireNotNull(System.getProperty("engine.t11StripeBlockerInventory")))
        val historical =
            inventory
                .readText()
                .lineSequence()
                .filter(String::isNotBlank)
                .drop(1)
                .map { line ->
                    val values = line.split('\t')
                    ConformanceExclusionIdentity(values[0], values[2], values[3])
                }.toSet()
        val delta = readConformanceExclusionDelta("engine.stripeExclusionDelta")
        assertEquals(157, historical.size)

        // Before ADR-0014 the current exclusion set was asserted equal to this recorded historical-plus-parity set. That
        // equality no longer holds by design: relaxing the form-object rule reclaimed operations, and the
        // rejected states that remain carry new reason text (so new reason hashes). The historical/parity TSVs stay
        // as dated historical records and are not rewritten.
        //
        // The invariant that still matters, and is stronger than a frozen count: this change may only
        // REMOVE exclusions. If any operation that generated before is now blocked, that is a regression
        // and this assertion fails. Identity is compared on symbolId because reason text deliberately moved.
        val historicalSymbolIds =
            (historical + delta.map(ConformanceExclusionDeltaRow::identity))
                .mapTo(mutableSetOf(), ConformanceExclusionIdentity::symbolId)
        val currentSymbolIds =
            validation.exclusions.mapTo(mutableSetOf(), GenerationExclusionView::symbolId)

        assertEquals(161, historicalSymbolIds.size)
        assertEquals(
            emptySet(),
            currentSymbolIds - historicalSymbolIds,
            "ADR-0014 must not block any operation that was generatable before",
        )
        assertEquals(93, historicalSymbolIds.size - currentSymbolIds.size)

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
                        packageName = "io.github.nabobery.sdkgen.generated.stripe",
                        coordinates = PackageCoordinates("io.github.nabobery", "stripe-generated"),
                        naming = NamingConfig(clientName = "StripeClient"),
                        targets = listOf(TargetFamily.JVM, TargetFamily.JS, TargetFamily.MACOS),
                    ),
                output = OutputConfig("sources", "resources", "manifest.json"),
            )
        return config to source
    }

    private fun category(message: String): String =
        when {
            "deepObject parameter" in message && "requires primitive array item schemas" in message -> {
                "parameter-deep-object-nonprimitive-arrays"
            }

            "deepObject parameter" in message && "property" in message && "requires a primitive schema" in message -> {
                "parameter-deep-object-nonprimitive-properties"
            }

            "deepObject parameter" in message && "requires additionalProperties: false" in message -> {
                "parameter-deep-object-dynamic-keys"
            }

            "deepObject form arrays require" in message -> {
                "deep-object-arrays"
            }

            // ADR-0014 replaced the single "must declare additionalProperties: false" rejection with one
            // message per rejected state, so each is classified separately and can be waived by its own
            // reason hash.
            "form object declares no properties and omits additionalProperties" in message -> {
                "form-object-no-declared-shape"
            }

            "form object declares additionalProperties: true" in message -> {
                "form-object-free-form"
            }

            "form object mixes fixed properties with a typed additionalProperties catch-all" in message -> {
                "form-object-mixed-typed"
            }

            "form value cannot use oneOf or anyOf composition" in message ||
                "form anyOf branches overlap by wire kind" in message -> {
                "form-composition"
            }

            "multipart array part" in message -> {
                "multipart-array"
            }

            else -> {
                error("Unexpected Stripe conformance blocker: $message")
            }
        }

    private fun ByteArray.toHex(): String = joinToString("") { byte -> "%02x".format(byte) }
}

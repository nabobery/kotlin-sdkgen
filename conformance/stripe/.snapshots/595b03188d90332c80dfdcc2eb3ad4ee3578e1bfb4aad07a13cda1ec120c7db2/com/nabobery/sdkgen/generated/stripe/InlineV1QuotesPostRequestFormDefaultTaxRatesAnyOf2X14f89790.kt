package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/default_tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/default_tax_rates/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790()

    public companion object {
        public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormDefaultTaxRatesAnyOf2X14f89790,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

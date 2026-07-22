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
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/fixed_amount/properties/currency_options/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/fixed_amount/properties/currency_options/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd.Serializer::class)
public sealed class InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ShippingRatesPostRequestFormFixedAmountTaxBehaviorX3c1e2dbd,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

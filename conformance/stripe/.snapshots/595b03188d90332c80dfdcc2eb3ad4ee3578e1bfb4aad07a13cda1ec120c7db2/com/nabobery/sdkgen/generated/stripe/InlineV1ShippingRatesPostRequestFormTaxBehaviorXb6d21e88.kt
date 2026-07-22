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
 * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
 * or `unspecified`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/tax_behavior
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88.Serializer::class)
public sealed class InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88 =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ShippingRatesPostRequestFormTaxBehaviorXb6d21e88,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

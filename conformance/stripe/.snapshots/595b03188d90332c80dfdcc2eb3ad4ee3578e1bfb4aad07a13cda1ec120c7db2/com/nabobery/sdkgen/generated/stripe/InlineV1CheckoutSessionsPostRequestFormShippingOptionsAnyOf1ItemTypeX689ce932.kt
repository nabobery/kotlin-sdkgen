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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed_amount`.
     */
    public data object FixedAmount : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932() {
        public override val `value`: String = "fixed_amount"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932 =
            when (value) {
                FixedAmount.value -> FixedAmount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemTypeX689ce932,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

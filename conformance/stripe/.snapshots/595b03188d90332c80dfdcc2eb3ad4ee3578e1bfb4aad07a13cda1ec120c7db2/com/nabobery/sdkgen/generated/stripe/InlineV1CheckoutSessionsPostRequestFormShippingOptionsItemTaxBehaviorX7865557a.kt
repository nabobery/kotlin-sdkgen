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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/fixed_amount/properties/currenc
 * y_options/additionalProperties/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/fixed_amount/properties/currenc
 * y_options/additionalProperties/properties/tax_behavior
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

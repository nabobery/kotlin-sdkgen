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
 * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
 * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
 * payment method in a checkout flow. The field defaults to `unspecified`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/allow_redisplay
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `limited`.
     */
    public data object Limited : InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf() {
        public override val `value`: String = "limited"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf =
            when (value) {
                Always.value -> Always
                Limited.value -> Limited
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

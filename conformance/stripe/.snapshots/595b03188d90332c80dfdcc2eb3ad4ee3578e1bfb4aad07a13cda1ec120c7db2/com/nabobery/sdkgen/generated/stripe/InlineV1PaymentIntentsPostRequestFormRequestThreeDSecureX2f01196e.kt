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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_three_d_secure
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `any`.
     */
    public data object Any : InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e() {
        public override val `value`: String = "any"
    }

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `challenge`.
     */
    public data object Challenge : InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e() {
        public override val `value`: String = "challenge"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e =
            when (value) {
                Any.value -> Any
                Automatic.value -> Automatic
                Challenge.value -> Challenge
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormRequestThreeDSecureX2f01196e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

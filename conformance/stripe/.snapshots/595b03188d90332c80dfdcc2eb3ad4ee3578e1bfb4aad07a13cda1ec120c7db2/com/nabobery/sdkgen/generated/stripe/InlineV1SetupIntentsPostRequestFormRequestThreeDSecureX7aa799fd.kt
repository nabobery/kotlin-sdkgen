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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/request_three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/request_three_d_secure
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `any`.
     */
    public data object Any : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd() {
        public override val `value`: String = "any"
    }

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `challenge`.
     */
    public data object Challenge : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd() {
        public override val `value`: String = "challenge"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd =
            when (value) {
                Any.value -> Any
                Automatic.value -> Automatic
                Challenge.value -> Challenge
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormRequestThreeDSecureX7aa799fd,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

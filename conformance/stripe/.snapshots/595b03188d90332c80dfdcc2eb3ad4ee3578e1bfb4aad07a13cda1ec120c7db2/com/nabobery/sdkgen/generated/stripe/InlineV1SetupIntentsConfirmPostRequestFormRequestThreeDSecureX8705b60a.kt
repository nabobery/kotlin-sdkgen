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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/request_three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/request_three_d_secure
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `any`.
     */
    public data object Any : InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a() {
        public override val `value`: String = "any"
    }

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `challenge`.
     */
    public data object Challenge : InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a() {
        public override val `value`: String = "challenge"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a =
            when (value) {
                Any.value -> Any
                Automatic.value -> Automatic
                Challenge.value -> Challenge
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormRequestThreeDSecureX8705b60a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_multicapture.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_multicapture
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `if_available`.
     */
    public data object IfAvailable : InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e() {
        public override val `value`: String = "if_available"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e =
            when (value) {
                IfAvailable.value -> IfAvailable
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormRequestMulticaptureX62caec4e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

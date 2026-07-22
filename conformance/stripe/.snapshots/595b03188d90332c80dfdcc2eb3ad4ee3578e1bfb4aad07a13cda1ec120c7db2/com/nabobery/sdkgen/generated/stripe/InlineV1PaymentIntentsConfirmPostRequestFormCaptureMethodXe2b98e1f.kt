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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/revolut_pay/anyOf/0/properties/capture_method
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/revolut_pay/anyOf/0/properties/capture_method
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f =
            when (value) {
                Value.value -> Value
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXe2b98e1f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

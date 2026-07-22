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
 * ded/schema/properties/payment_method_options/properties/afterpay_clearpay/properties/capture_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/afterpay_clearpay/properties/capture_method
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX70437bee,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

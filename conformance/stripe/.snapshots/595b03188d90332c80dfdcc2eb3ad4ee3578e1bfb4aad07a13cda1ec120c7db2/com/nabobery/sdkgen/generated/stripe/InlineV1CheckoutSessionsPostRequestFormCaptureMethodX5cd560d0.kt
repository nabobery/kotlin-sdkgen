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
 * ded/schema/properties/payment_method_options/properties/card/properties/capture_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/capture_method
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX5cd560d0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

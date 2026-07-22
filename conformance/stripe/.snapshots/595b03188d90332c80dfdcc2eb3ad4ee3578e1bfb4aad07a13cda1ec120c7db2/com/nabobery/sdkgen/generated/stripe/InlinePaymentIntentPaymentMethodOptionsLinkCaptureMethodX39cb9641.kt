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
 * Controls when the funds will be captured from the customer's account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_link/properties/capture_method
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsLinkCaptureMethodX39cb9641,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/components/schemas/checkout_payco_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08.Serializer::class)
public sealed class InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

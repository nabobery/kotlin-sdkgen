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
 * sdkgen://source/openapi.json#/components/schemas/checkout_link_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04.Serializer::class)
public sealed class InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

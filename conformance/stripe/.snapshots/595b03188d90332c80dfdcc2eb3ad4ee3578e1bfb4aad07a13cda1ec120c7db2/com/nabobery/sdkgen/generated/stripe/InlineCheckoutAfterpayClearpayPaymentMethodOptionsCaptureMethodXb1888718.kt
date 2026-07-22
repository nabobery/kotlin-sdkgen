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
 * sdkgen://source/openapi.json#/components/schemas/checkout_afterpay_clearpay_payment_method_options/properties/capture
 * _method
 */
@Serializable(with = InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718.Serializer::class)
public sealed class InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718 =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutAfterpayClearpayPaymentMethodOptionsCaptureMethodXb1888718,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

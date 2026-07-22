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
 * sdkgen://source/openapi.json#/components/schemas/checkout_samsung_pay_payment_method_options/properties/capture_metho
 * d
 */
@Serializable(with = InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d.Serializer::class)
public sealed class InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d =
            when (value) {
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSamsungPayPaymentMethodOptionsCaptureMethodX71cbca3d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

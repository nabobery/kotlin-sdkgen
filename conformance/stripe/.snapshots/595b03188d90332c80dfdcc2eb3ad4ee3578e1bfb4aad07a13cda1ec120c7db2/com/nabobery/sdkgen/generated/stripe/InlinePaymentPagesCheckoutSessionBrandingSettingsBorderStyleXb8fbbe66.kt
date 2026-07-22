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
 * The border style for the Checkout Session. Must be one of `rounded`, `rectangular`, or `pill`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings/properties/border_s
 * tyle
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `pill`.
     */
    public data object Pill : InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66() {
        public override val `value`: String = "pill"
    }

    /**
     * Documented value. Wire value: `rectangular`.
     */
    public data object Rectangular : InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66() {
        public override val `value`: String = "rectangular"
    }

    /**
     * Documented value. Wire value: `rounded`.
     */
    public data object Rounded : InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66() {
        public override val `value`: String = "rounded"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66 =
            when (value) {
                Pill.value -> Pill
                Rectangular.value -> Rectangular
                Rounded.value -> Rounded
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * Enable customers to choose if they wish to save their payment method for future use. Disabled by default.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_saved_payment_method_options/properti
 * es/payment_method_save
 */
@Serializable(with = InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08.Serializer::class)
public sealed class InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

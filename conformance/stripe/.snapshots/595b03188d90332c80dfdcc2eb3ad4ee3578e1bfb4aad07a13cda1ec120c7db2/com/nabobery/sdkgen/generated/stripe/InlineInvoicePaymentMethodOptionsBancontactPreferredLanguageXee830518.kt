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
 * Preferred language of the Bancontact authorization page that the customer is redirected to.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_bancontact/properties/preferred_langu
 * age
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518() {
        public override val `value`: String = "nl"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518 =
            when (value) {
                De.value -> De
                En.value -> En
                Fr.value -> Fr
                Nl.value -> Nl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicePaymentMethodOptionsBancontactPreferredLanguageXee830518,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

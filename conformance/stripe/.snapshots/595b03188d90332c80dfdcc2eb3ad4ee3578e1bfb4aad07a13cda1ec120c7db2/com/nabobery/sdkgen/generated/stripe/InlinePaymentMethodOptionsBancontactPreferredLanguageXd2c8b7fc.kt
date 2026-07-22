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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_bancontact/properties/preferred_language
 */
@Serializable(with = InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc.Serializer::class)
public sealed class InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc() {
        public override val `value`: String = "nl"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc =
            when (value) {
                De.value -> De
                En.value -> En
                Fr.value -> Fr
                Nl.value -> Nl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * Preferred language of the Bancontact authorization page that the customer is redirected to. Can be one of `en`, `de`,
 * `fr`, or `nl`
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_bancontact/properties/preferre
 * d_language
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58.Serializer::class)
public sealed class InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58() {
        public override val `value`: String = "nl"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58 =
            when (value) {
                De.value -> De
                En.value -> En
                Fr.value -> Fr
                Nl.value -> Nl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsPaymentRecordBancontactPreferredLanguageXe4a4fd58,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

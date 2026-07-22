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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyOf/0/properties/preferre
 * d_language.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyOf/0/properties/preferre
 * d_language
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96() {
        public override val `value`: String = "nl"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96 =
            when (value) {
                De.value -> De
                En.value -> En
                Fr.value -> Fr
                Nl.value -> Nl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPreferredLanguageXdfb41e96,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

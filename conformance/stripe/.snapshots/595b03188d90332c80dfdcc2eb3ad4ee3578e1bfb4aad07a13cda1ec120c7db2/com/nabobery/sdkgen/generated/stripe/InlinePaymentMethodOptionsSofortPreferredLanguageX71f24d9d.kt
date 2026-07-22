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
 * Preferred language of the SOFORT authorization page that the customer is redirected to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_sofort/properties/preferred_language
 */
@Serializable(with = InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d.Serializer::class)
public sealed class InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `es`.
     */
    public data object Es : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "es"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `it`.
     */
    public data object It : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "it"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "nl"
    }

    /**
     * Documented value. Wire value: `pl`.
     */
    public data object Pl : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d() {
        public override val `value`: String = "pl"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d =
            when (value) {
                De.value -> De
                En.value -> En
                Es.value -> Es
                Fr.value -> Fr
                It.value -> It
                Nl.value -> Nl
                Pl.value -> Pl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

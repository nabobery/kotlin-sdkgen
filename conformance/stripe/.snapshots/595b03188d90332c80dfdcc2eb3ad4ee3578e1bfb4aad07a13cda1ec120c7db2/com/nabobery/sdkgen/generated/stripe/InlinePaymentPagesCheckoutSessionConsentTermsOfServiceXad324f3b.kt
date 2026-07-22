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
 * If `accepted`, the customer in this Checkout Session has agreed to the merchant's terms of service.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent/properties/terms_of_service
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `accepted`.
     */
    public data object Accepted : InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b() {
        public override val `value`: String = "accepted"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b =
            when (value) {
                Accepted.value -> Accepted
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

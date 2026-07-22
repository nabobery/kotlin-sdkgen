package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

@Serializable
public data class PaymentPagesCheckoutSessionConsentView(
    public val promotions: InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17? = null,
    @SerialName("terms_of_service")
    public val termsOfService: InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent
 */
@Serializable(with = PaymentPagesCheckoutSessionConsent.Serializer::class)
public class PaymentPagesCheckoutSessionConsent(
    /**
     * If `opt_in`, the customer consents to receiving promotional communications
     * from the merchant about this Checkout Session.
     */
    public val promotions: InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17? = null,
    /**
     * If `accepted`, the customer in this Checkout Session has agreed to the merchant's terms of service.
     */
    public val termsOfService: InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b? = null,
) {
    public class Builder {
        /**
         * If `opt_in`, the customer consents to receiving promotional communications
         * from the merchant about this Checkout Session.
         */
        public var promotions: InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17? = null

        /**
         * If `accepted`, the customer in this Checkout Session has agreed to the merchant's terms of service.
         */
        public var termsOfService: InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b? =
            null

        public fun build(): PaymentPagesCheckoutSessionConsent =
            PaymentPagesCheckoutSessionConsent(
                promotions = promotions,
                termsOfService = termsOfService,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionConsent = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionConsent> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionConsent {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionConsent")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionConsent must be a JSON object")
            return PaymentPagesCheckoutSessionConsent(
                promotions =
                    rawObject["promotions"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionConsentPromotionsX53836b17?>(
                                element,
                            )
                        }
                    },
                termsOfService =
                    rawObject["terms_of_service"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentPagesCheckoutSessionConsentTermsOfServiceXad324f3b?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionConsent,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionConsent")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.promotions?.let { put("promotions", json.encodeToJsonElement(it)) }
                    value.termsOfService?.let { put("terms_of_service", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionConsent(
    block: PaymentPagesCheckoutSessionConsent.Builder.() -> Unit,
): PaymentPagesCheckoutSessionConsent = PaymentPagesCheckoutSessionConsent.build(block)

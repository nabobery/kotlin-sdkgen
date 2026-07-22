package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Configure fields for the Checkout Session to gather active consent from customers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/consent_collection
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757(
    public val paymentMethodReuseAgreement:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7? = null,
    public val promotions: InlineV1CheckoutSessionsPostRequestFormConsentCollectionPromotionsX9aa28c1e? = null,
    public val termsOfService: InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf? = null,
) {
    public class Builder {
        public var paymentMethodReuseAgreement:
            InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7? = null

        public var promotions:
            InlineV1CheckoutSessionsPostRequestFormConsentCollectionPromotionsX9aa28c1e? = null

        public var termsOfService:
            InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf? = null

        public fun build(): InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757 =
            InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757(
                paymentMethodReuseAgreement = paymentMethodReuseAgreement,
                promotions = promotions,
                termsOfService = termsOfService,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757 must be a JSON object",
                    )
            return InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757(
                paymentMethodReuseAgreement =
                    rawObject["payment_method_reuse_agreement"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7>(
                                it,
                            )
                    },
                promotions =
                    rawObject["promotions"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormConsentCollectionPromotionsX9aa28c1e>(
                                it,
                            )
                    },
                termsOfService =
                    rawObject["terms_of_service"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormConsentCollectionTermsOfServiceX358d49cf>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.paymentMethodReuseAgreement?.let {
                        put(
                            "payment_method_reuse_agreement",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.promotions?.let { put("promotions", json.encodeToJsonElement(it)) }
                    value.termsOfService?.let { put("terms_of_service", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757(
    block: InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757.Builder.() -> Unit,
): InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757 =
    InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757.build(block)

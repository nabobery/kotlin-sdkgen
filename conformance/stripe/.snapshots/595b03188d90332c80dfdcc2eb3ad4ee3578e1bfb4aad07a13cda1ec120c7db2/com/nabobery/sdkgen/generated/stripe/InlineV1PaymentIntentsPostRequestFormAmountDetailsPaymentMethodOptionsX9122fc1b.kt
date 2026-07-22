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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b(
    public val card: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07? = null,
    public val cardPresent: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb? = null,
    public val klarna: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6? = null,
    public val paypal: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1PaypalX42ee9653? = null,
) {
    public class Builder {
        public var card: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07? =
            null

        public var cardPresent:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb? = null

        public var klarna:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6? = null

        public var paypal:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1PaypalX42ee9653? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b =
            InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b(
                card = card,
                cardPresent = cardPresent,
                klarna = klarna,
                paypal = paypal,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b(
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07>(
                                it,
                            )
                    },
                cardPresent =
                    rawObject["card_present"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb>(
                                it,
                            )
                    },
                klarna =
                    rawObject["klarna"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6>(
                                it,
                            )
                    },
                paypal =
                    rawObject["paypal"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1PaypalX42ee9653>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                    value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
                    value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
                    value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX9122fc1b.build(block)

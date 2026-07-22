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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b(
    public val card: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f? = null,
    public val cardPresent: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a? = null,
    public val klarna: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsKlarnaXfd904cf6? = null,
    public val paypal: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d? = null,
) {
    public class Builder {
        public var card: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f? =
            null

        public var cardPresent:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a? = null

        public var klarna:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsKlarnaXfd904cf6? = null

        public var paypal:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b =
            InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b(
                card = card,
                cardPresent = cardPresent,
                klarna = klarna,
                paypal = paypal,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b(
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f>(
                                it,
                            )
                    },
                cardPresent =
                    rawObject["card_present"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a>(
                                it,
                            )
                    },
                klarna =
                    rawObject["klarna"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsKlarnaXfd904cf6>(
                                it,
                            )
                    },
                paypal =
                    rawObject["paypal"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b",
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsPaymentMethodOptionsX32cfd15b.build(block)

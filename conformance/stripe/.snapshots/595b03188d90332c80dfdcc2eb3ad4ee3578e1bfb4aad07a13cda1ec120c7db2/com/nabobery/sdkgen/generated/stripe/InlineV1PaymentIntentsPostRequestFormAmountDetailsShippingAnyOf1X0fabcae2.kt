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
 * /schema/properties/amount_details/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2(
    public val amount: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6? = null,
    public val fromPostalCode: InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5? = null,
    public val toPostalCode: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397? = null,
) {
    public class Builder {
        public var amount:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6? = null

        public var fromPostalCode:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5? = null

        public var toPostalCode:
            InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 =
            InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2(
                amount = amount,
                fromPostalCode = fromPostalCode,
                toPostalCode = toPostalCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2(
                amount =
                    rawObject["amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6>(
                                it,
                            )
                    },
                fromPostalCode =
                    rawObject["from_postal_code"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5>(
                                it,
                            )
                    },
                toPostalCode =
                    rawObject["to_postal_code"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.fromPostalCode?.let { put("from_postal_code", json.encodeToJsonElement(it)) }
                    value.toPostalCode?.let { put("to_postal_code", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2.build(block)

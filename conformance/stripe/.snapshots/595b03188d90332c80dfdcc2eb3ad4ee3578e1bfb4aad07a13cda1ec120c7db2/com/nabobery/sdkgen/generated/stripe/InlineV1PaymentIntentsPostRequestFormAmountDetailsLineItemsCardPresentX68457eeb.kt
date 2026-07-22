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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/ca
 * rd_present.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/ca
 * rd_present
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb(
    public val commodityCode: String? = null,
) {
    public class Builder {
        public var commodityCode: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb =
            InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb(
                commodityCode = commodityCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb(
                commodityCode = rawObject["commodity_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.commodityCode?.let { put("commodity_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCardPresentX68457eeb.build(block)

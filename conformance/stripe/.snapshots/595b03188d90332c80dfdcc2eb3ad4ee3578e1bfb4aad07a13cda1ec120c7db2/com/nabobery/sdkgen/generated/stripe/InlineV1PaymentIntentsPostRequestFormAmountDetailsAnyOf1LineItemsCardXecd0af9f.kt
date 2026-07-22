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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/card
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f(
    public val commodityCode: String? = null,
) {
    public class Builder {
        public var commodityCode: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f =
            InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f(
                commodityCode = commodityCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f(
                commodityCode = rawObject["commodity_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f",
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsCardXecd0af9f.build(block)

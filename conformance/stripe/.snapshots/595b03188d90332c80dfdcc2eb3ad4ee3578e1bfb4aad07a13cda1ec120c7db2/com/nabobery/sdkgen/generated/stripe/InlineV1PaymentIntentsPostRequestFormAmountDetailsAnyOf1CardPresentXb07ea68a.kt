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
 * ions/properties/card_present.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/card_present
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a(
    public val commodityCode: String? = null,
) {
    public class Builder {
        public var commodityCode: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a =
            InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a(
                commodityCode = commodityCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a(
                commodityCode = rawObject["commodity_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a",
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a(
    block: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a =
    InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CardPresentXb07ea68a.build(block)

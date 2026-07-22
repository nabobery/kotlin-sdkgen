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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options/properties/paypal
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b(
    public val category: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088? = null,
    public val description: String? = null,
    public val soldBy: String? = null,
) {
    public class Builder {
        public var category:
            InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088? = null

        public var description: String? = null

        public var soldBy: String? = null

        public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b =
            InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b(
                category = category,
                description = description,
                soldBy = soldBy,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b must be a JSON object",
                    )
            return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b(
                category =
                    rawObject["category"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088>(
                                it,
                            )
                    },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                soldBy = rawObject["sold_by"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.category?.let { put("category", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.soldBy?.let { put("sold_by", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b(
    block: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b.Builder.() -> Unit,
): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b =
    InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b.build(block)

package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb(
    public val quantity: Int,
    public val adjustableQuantity: InlineV1PaymentLinksPostRequestFormLineItemsItemAdjustableQuantityX886fa941? = null,
    public val price: String? = null,
    public val priceData: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5? = null,
) {
    public class Builder {
        private var quantityValue: Int? = null

        public var quantity: Int
            get() = requireNotNull(quantityValue) { "quantity is required" }
            set(`value`) {
                quantityValue = value
            }

        public var adjustableQuantity:
            InlineV1PaymentLinksPostRequestFormLineItemsItemAdjustableQuantityX886fa941? = null

        public var price: String? = null

        public var priceData: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb {
            check(quantityValue != null) { "quantity is required" }
            return InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb(
                quantity = quantity,
                adjustableQuantity = adjustableQuantity,
                price = price,
                priceData = priceData,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb must be a JSON object",
                    )
            val quantity = json.decodeRequired<Int>(rawObject, "quantity")
            return InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb(
                quantity = quantity,
                adjustableQuantity =
                    rawObject["adjustable_quantity"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormLineItemsItemAdjustableQuantityX886fa941>(
                                it,
                            )
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("quantity", json.encodeToJsonElement(value.quantity))
                    value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
                    value.price?.let { put("price", it) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb(
    block: InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb =
    InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

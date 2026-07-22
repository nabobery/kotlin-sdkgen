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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/optional_items/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/optional_items/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322(
    public val price: String,
    public val quantity: Int,
    public val adjustableQuantity: InlineV1PaymentLinksPostRequestFormOptionalItemsAdjustableQuantityXd1621fdf? = null,
) {
    public class Builder {
        private var priceValue: String? = null

        public var price: String
            get() = requireNotNull(priceValue) { "price is required" }
            set(`value`) {
                priceValue = value
            }

        private var quantityValue: Int? = null

        public var quantity: Int
            get() = requireNotNull(quantityValue) { "quantity is required" }
            set(`value`) {
                quantityValue = value
            }

        public var adjustableQuantity:
            InlineV1PaymentLinksPostRequestFormOptionalItemsAdjustableQuantityXd1621fdf? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322 {
            check(priceValue != null) { "price is required" }
            check(quantityValue != null) { "quantity is required" }
            return InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322(
                price = price,
                quantity = quantity,
                adjustableQuantity = adjustableQuantity,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322 must be a JSON object",
                    )
            val price = json.decodeRequired<String>(rawObject, "price")
            val quantity = json.decodeRequired<Int>(rawObject, "quantity")
            return InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322(
                price = price,
                quantity = quantity,
                adjustableQuantity =
                    rawObject["adjustable_quantity"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormOptionalItemsAdjustableQuantityXd1621fdf>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("price", value.price)
                    put("quantity", json.encodeToJsonElement(value.quantity))
                    value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322(
    block: InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322 =
    InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormOptionalItemsAnyOf1ItemX6527b322 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

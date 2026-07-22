package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_optional_item
 */
@Serializable(with = PaymentLinksResourceOptionalItem.Serializer::class)
public class PaymentLinksResourceOptionalItem(
    public val price: String,
    public val quantity: Int,
    public val adjustableQuantity: InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3? = null,
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
            InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3? = null

        public fun build(): PaymentLinksResourceOptionalItem {
            check(priceValue != null) { "price is required" }
            check(quantityValue != null) { "quantity is required" }
            return PaymentLinksResourceOptionalItem(
                price = price,
                quantity = quantity,
                adjustableQuantity = adjustableQuantity,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentLinksResourceOptionalItem = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentLinksResourceOptionalItem> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentLinksResourceOptionalItem {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceOptionalItem")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentLinksResourceOptionalItem must be a JSON object")
            val price = json.decodeRequired<String>(rawObject, "price")
            val quantity = json.decodeRequired<Int>(rawObject, "quantity")
            return PaymentLinksResourceOptionalItem(
                price = price,
                quantity = quantity,
                adjustableQuantity =
                    rawObject["adjustable_quantity"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentLinksResourceOptionalItem,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceOptionalItem")
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

public fun paymentLinksResourceOptionalItem(
    block: PaymentLinksResourceOptionalItem.Builder.() -> Unit,
): PaymentLinksResourceOptionalItem = PaymentLinksResourceOptionalItem.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentLinksResourceOptionalItem is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

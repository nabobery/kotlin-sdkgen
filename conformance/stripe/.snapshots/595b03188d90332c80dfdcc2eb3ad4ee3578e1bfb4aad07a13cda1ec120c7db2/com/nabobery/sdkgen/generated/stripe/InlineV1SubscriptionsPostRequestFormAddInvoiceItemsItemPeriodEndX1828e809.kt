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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/period/properties/end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/period/properties/end
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809(
    public val type: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f,
    public val timestamp: Int? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f? = null

        public var type: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var timestamp: Int? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809 {
            check(typeValue != null) { "type is required" }
            return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809(
                type = type,
                timestamp = timestamp,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f>(
                    rawObject,
                    "type",
                )
            return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809(
                type = type,
                timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809(
    block: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809 =
    InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX1828e809 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

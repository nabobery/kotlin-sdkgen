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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb(
    public val interval: InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX3ea2750b,
    public val intervalCount: Int? = null,
) {
    public class Builder {
        private var intervalValue:
            InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX3ea2750b? = null

        public var interval:
            InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX3ea2750b
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var intervalCount: Int? = null

        public fun build(): InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb {
            check(intervalValue != null) { "interval is required" }
            return InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb(
                interval = interval,
                intervalCount = intervalCount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb must be a JSON object",
                    )
            val interval =
                json.decodeRequired<InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX3ea2750b>(
                    rawObject,
                    "interval",
                )
            return InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb(
                interval = interval,
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("interval", json.encodeToJsonElement(value.interval))
                    value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb(
    block: InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb =
    InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

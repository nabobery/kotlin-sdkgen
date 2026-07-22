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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031(
    public val interval: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058,
    public val intervalCount: Int? = null,
) {
    public class Builder {
        private var intervalValue:
            InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058? = null

        public var interval:
            InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var intervalCount: Int? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031 {
            check(intervalValue != null) { "interval is required" }
            return InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031(
                interval = interval,
                intervalCount = intervalCount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031 must be a JSON object",
                    )
            val interval =
                json
                    .decodeRequired<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058>(
                        rawObject,
                        "interval",
                    )
            return InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031(
                interval = interval,
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031",
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

public fun inlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031(
    block: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031 =
    InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringX86680031 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

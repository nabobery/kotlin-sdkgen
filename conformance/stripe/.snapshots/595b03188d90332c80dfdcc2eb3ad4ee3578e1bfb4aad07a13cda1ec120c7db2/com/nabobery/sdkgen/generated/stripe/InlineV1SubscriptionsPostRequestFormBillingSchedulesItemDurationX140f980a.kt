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
 * chema/properties/billing_schedules/items/properties/bill_until/properties/duration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items/properties/bill_until/properties/duration
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a(
    public val interval: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemIntervalX533f52d2,
    public val intervalCount: Int? = null,
) {
    public class Builder {
        private var intervalValue:
            InlineV1SubscriptionsPostRequestFormBillingSchedulesItemIntervalX533f52d2? = null

        public var interval: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemIntervalX533f52d2
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var intervalCount: Int? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a {
            check(intervalValue != null) { "interval is required" }
            return InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a(
                interval = interval,
                intervalCount = intervalCount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a must be a JSON object",
                    )
            val interval =
                json.decodeRequired<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemIntervalX533f52d2>(
                    rawObject,
                    "interval",
                )
            return InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a(
                interval = interval,
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a",
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

public fun inlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a(
    block: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a =
    InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormBillingSchedulesItemDurationX140f980a is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

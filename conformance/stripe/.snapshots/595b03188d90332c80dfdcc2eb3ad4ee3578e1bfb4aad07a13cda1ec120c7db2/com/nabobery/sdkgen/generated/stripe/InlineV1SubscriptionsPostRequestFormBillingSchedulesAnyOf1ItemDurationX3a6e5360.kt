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
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/bill_until/properties/duration
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/bill_until/properties/duration
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360(
    public val interval: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemIntervalXf66a7aee,
    public val intervalCount: Int? = null,
) {
    public class Builder {
        private var intervalValue:
            InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemIntervalXf66a7aee? = null

        public var interval:
            InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemIntervalXf66a7aee
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var intervalCount: Int? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360 {
            check(intervalValue != null) { "interval is required" }
            return InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360(
                interval = interval,
                intervalCount = intervalCount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360 must be a JSON object",
                    )
            val interval =
                json
                    .decodeRequired<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemIntervalXf66a7aee>(
                        rawObject,
                        "interval",
                    )
            return InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360(
                interval = interval,
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360",
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

public fun inlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360(
    block: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360 =
    InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemDurationX3a6e5360 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

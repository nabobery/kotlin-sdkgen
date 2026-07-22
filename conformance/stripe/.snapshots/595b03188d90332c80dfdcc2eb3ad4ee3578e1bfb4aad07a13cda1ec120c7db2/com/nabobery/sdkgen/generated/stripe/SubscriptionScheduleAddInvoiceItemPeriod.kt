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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_add_invoice_item_period
 */
@Serializable(with = SubscriptionScheduleAddInvoiceItemPeriod.Serializer::class)
public class SubscriptionScheduleAddInvoiceItemPeriod(
    public val end: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd,
    public val start: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart,
) {
    public class Builder {
        private var endValue: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd? = null

        public var end: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd
            get() = requireNotNull(endValue) { "end is required" }
            set(`value`) {
                endValue = value
            }

        private var startValue: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart? =
            null

        public var start: SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart
            get() = requireNotNull(startValue) { "start is required" }
            set(`value`) {
                startValue = value
            }

        public fun build(): SubscriptionScheduleAddInvoiceItemPeriod {
            check(endValue != null) { "end is required" }
            check(startValue != null) { "start is required" }
            return SubscriptionScheduleAddInvoiceItemPeriod(
                end = end,
                start = start,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionScheduleAddInvoiceItemPeriod =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionScheduleAddInvoiceItemPeriod> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionScheduleAddInvoiceItemPeriod {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionScheduleAddInvoiceItemPeriod")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SubscriptionScheduleAddInvoiceItemPeriod must be a JSON object")
            val end =
                json.decodeRequired<SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodEnd>(
                    rawObject,
                    "end",
                )
            val start =
                json.decodeRequired<SubscriptionSchedulesResourceInvoiceItemPeriodResourcePeriodStart>(
                    rawObject,
                    "start",
                )
            return SubscriptionScheduleAddInvoiceItemPeriod(
                end = end,
                start = start,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionScheduleAddInvoiceItemPeriod,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionScheduleAddInvoiceItemPeriod")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("end", json.encodeToJsonElement(value.end))
                    put("start", json.encodeToJsonElement(value.start))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionScheduleAddInvoiceItemPeriod(
    block: SubscriptionScheduleAddInvoiceItemPeriod.Builder.() -> Unit,
): SubscriptionScheduleAddInvoiceItemPeriod = SubscriptionScheduleAddInvoiceItemPeriod.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "SubscriptionScheduleAddInvoiceItemPeriod is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

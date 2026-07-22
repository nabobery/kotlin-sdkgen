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
import kotlin.collections.List

/**
 * The configuration of the usage threshold.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/usage_threshold
 */
@Serializable(with = InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5.Serializer::class)
public class InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5(
    public val gte: Int,
    public val meter: String,
    public val recurrence: InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2,
    public val filters: List<InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c>? = null,
) {
    public class Builder {
        private var gteValue: Int? = null

        public var gte: Int
            get() = requireNotNull(gteValue) { "gte is required" }
            set(`value`) {
                gteValue = value
            }

        private var meterValue: String? = null

        public var meter: String
            get() = requireNotNull(meterValue) { "meter is required" }
            set(`value`) {
                meterValue = value
            }

        private var recurrenceValue:
            InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2? = null

        public var recurrence: InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2
            get() = requireNotNull(recurrenceValue) { "recurrence is required" }
            set(`value`) {
                recurrenceValue = value
            }

        public var filters:
            List<InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c>? = null

        public fun build(): InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5 {
            check(gteValue != null) { "gte is required" }
            check(meterValue != null) { "meter is required" }
            check(recurrenceValue != null) { "recurrence is required" }
            return InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5(
                gte = gte,
                meter = meter,
                recurrence = recurrence,
                filters = filters,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5 must be a JSON object",
                    )
            val gte = json.decodeRequired<Int>(rawObject, "gte")
            val meter = json.decodeRequired<String>(rawObject, "meter")
            val recurrence =
                json.decodeRequired<InlineV1BillingAlertsPostRequestFormUsageThresholdRecurrenceX2c86a9a2>(
                    rawObject,
                    "recurrence",
                )
            return InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5(
                gte = gte,
                meter = meter,
                recurrence = recurrence,
                filters =
                    rawObject["filters"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1BillingAlertsPostRequestFormUsageThresholdFiltersItemXae51d03c>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("gte", json.encodeToJsonElement(value.gte))
                    put("meter", value.meter)
                    put("recurrence", json.encodeToJsonElement(value.recurrence))
                    value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5(
    block: InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5.Builder.() -> Unit,
): InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5 =
    InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

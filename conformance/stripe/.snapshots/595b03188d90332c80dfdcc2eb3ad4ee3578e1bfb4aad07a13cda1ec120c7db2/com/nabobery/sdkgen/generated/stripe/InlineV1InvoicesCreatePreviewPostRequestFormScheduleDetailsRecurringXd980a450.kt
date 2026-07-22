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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/price_data/pro
 * perties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/price_data/pro
 * perties/recurring
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450(
    public val interval: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXba6ce455,
    public val intervalCount: Int? = null,
) {
    public class Builder {
        private var intervalValue:
            InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXba6ce455? = null

        public var interval:
            InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXba6ce455
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var intervalCount: Int? = null

        public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450 {
            check(intervalValue != null) { "interval is required" }
            return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450(
                interval = interval,
                intervalCount = intervalCount,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450 must be a JSON object",
                    )
            val interval =
                json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXba6ce455>(
                    rawObject,
                    "interval",
                )
            return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450(
                interval = interval,
                intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450",
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

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450(
    block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450.Builder.() -> Unit,
): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450 =
    InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsRecurringXd980a450 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

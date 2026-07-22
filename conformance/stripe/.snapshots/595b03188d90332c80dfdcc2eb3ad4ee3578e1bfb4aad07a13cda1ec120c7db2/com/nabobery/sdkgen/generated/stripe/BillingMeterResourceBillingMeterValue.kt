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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_billing_meter_value
 */
@Serializable(with = BillingMeterResourceBillingMeterValue.Serializer::class)
public class BillingMeterResourceBillingMeterValue(
    /**
     * The key in the meter event payload to use as the value for this meter.
     */
    public val eventPayloadKey: String,
) {
    public class Builder {
        private var eventPayloadKeyValue: String? = null

        public var eventPayloadKey: String
            get() = requireNotNull(eventPayloadKeyValue) { "eventPayloadKey is required" }
            set(`value`) {
                eventPayloadKeyValue = value
            }

        public fun build(): BillingMeterResourceBillingMeterValue {
            check(eventPayloadKeyValue != null) { "eventPayloadKey is required" }
            return BillingMeterResourceBillingMeterValue(
                eventPayloadKey = eventPayloadKey,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingMeterResourceBillingMeterValue =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingMeterResourceBillingMeterValue> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingMeterResourceBillingMeterValue {
            val jsonDecoder = decoder.requireJsonDecoder("BillingMeterResourceBillingMeterValue")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingMeterResourceBillingMeterValue must be a JSON object")
            val eventPayloadKey = json.decodeRequired<String>(rawObject, "event_payload_key")
            return BillingMeterResourceBillingMeterValue(
                eventPayloadKey = eventPayloadKey,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingMeterResourceBillingMeterValue,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingMeterResourceBillingMeterValue")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("event_payload_key", value.eventPayloadKey)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingMeterResourceBillingMeterValue(
    block: BillingMeterResourceBillingMeterValue.Builder.() -> Unit,
): BillingMeterResourceBillingMeterValue = BillingMeterResourceBillingMeterValue.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingMeterResourceBillingMeterValue is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

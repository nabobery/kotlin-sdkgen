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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Meter events represent actions that customers take in your system. You can use meter events to bill a customer based
 * on their usage. Meter events are associated with billing meters, which define both the contents of the event’s
 * payload and how to aggregate those events.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event
 */
@Serializable(with = BillingMeterEvent.Serializer::class)
public class BillingMeterEvent(
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * The name of the meter event. Corresponds with the `event_name` field on a meter.
     */
    public val eventName: String,
    /**
     * A unique identifier for the event.
     */
    public val identifier: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineBillingMeterEventObjectValueX4458a7a9,
    /**
     * The payload of the event. This contains the fields corresponding to a meter's `customer_mapping.event_payload_key`
     * (default is `stripe_customer_id`) and `value_settings.event_payload_key` (default is `value`). Read more about the
     * [payload](https://docs.stripe.com/billing/subscriptions/usage-based/meters/configure#meter-configuration-attributes
     * ).
     */
    public val payload: Map<String, String>,
    /**
     * The timestamp passed in when creating the event. Measured in seconds since the Unix epoch.
     */
    public val timestamp: Int,
) {
    public class Builder {
        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var eventNameValue: String? = null

        public var eventName: String
            get() = requireNotNull(eventNameValue) { "eventName is required" }
            set(`value`) {
                eventNameValue = value
            }

        private var identifierValue: String? = null

        public var identifier: String
            get() = requireNotNull(identifierValue) { "identifier is required" }
            set(`value`) {
                identifierValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineBillingMeterEventObjectValueX4458a7a9? = null

        public var objectValue: InlineBillingMeterEventObjectValueX4458a7a9
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var payloadValue: Map<String, String>? = null

        public var payload: Map<String, String>
            get() = requireNotNull(payloadValue) { "payload is required" }
            set(`value`) {
                payloadValue = value
            }

        private var timestampValue: Int? = null

        public var timestamp: Int
            get() = requireNotNull(timestampValue) { "timestamp is required" }
            set(`value`) {
                timestampValue = value
            }

        public fun build(): BillingMeterEvent {
            check(createdValue != null) { "created is required" }
            check(eventNameValue != null) { "eventName is required" }
            check(identifierValue != null) { "identifier is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(payloadValue != null) { "payload is required" }
            check(timestampValue != null) { "timestamp is required" }
            return BillingMeterEvent(
                created = created,
                eventName = eventName,
                identifier = identifier,
                livemode = livemode,
                objectValue = objectValue,
                payload = payload,
                timestamp = timestamp,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingMeterEvent = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingMeterEvent> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingMeterEvent {
            val jsonDecoder = decoder.requireJsonDecoder("BillingMeterEvent")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingMeterEvent must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val eventName = json.decodeRequired<String>(rawObject, "event_name")
            val identifier = json.decodeRequired<String>(rawObject, "identifier")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineBillingMeterEventObjectValueX4458a7a9>(rawObject, "object")
            val payload = json.decodeRequired<Map<String, String>>(rawObject, "payload")
            val timestamp = json.decodeRequired<Int>(rawObject, "timestamp")
            return BillingMeterEvent(
                created = created,
                eventName = eventName,
                identifier = identifier,
                livemode = livemode,
                objectValue = objectValue,
                payload = payload,
                timestamp = timestamp,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingMeterEvent,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingMeterEvent")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("event_name", value.eventName)
                    put("identifier", value.identifier)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("payload", json.encodeToJsonElement(value.payload))
                    put("timestamp", json.encodeToJsonElement(value.timestamp))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingMeterEvent(block: BillingMeterEvent.Builder.() -> Unit): BillingMeterEvent =
    BillingMeterEvent.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("BillingMeterEvent is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A billing meter event adjustment is a resource that allows you to cancel a meter event. For example, you might create
 * a billing meter event adjustment to cancel a meter event that was created in error or attached to the wrong customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_adjustment
 */
@Serializable(with = BillingMeterEventAdjustment.Serializer::class)
public class BillingMeterEventAdjustment(
    /**
     * The name of the meter event. Corresponds with the `event_name` field on a meter.
     */
    public val eventName: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineBillingMeterEventAdjustmentObjectValueX9bd06423,
    /**
     * The meter event adjustment's status.
     */
    public val status: InlineBillingMeterEventAdjustmentStatusX0a9e79ad,
    /**
     * Specifies whether to cancel a single event or a range of events for a time period. Time period cancellation is not
     * supported yet.
     */
    public val type: InlineBillingMeterEventAdjustmentTypeX3b9f2ee3,
    /**
     * Specifies which event to cancel.
     */
    public val cancel: InlineBillingMeterEventAdjustmentCancelX908730ed? = null,
) {
    public class Builder {
        private var eventNameValue: String? = null

        public var eventName: String
            get() = requireNotNull(eventNameValue) { "eventName is required" }
            set(`value`) {
                eventNameValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineBillingMeterEventAdjustmentObjectValueX9bd06423? = null

        public var objectValue: InlineBillingMeterEventAdjustmentObjectValueX9bd06423
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: InlineBillingMeterEventAdjustmentStatusX0a9e79ad? = null

        public var status: InlineBillingMeterEventAdjustmentStatusX0a9e79ad
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var typeValue: InlineBillingMeterEventAdjustmentTypeX3b9f2ee3? = null

        public var type: InlineBillingMeterEventAdjustmentTypeX3b9f2ee3
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * Specifies which event to cancel.
         */
        public var cancel: InlineBillingMeterEventAdjustmentCancelX908730ed? = null

        public fun build(): BillingMeterEventAdjustment {
            check(eventNameValue != null) { "eventName is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            check(typeValue != null) { "type is required" }
            return BillingMeterEventAdjustment(
                eventName = eventName,
                livemode = livemode,
                objectValue = objectValue,
                status = status,
                type = type,
                cancel = cancel,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingMeterEventAdjustment = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingMeterEventAdjustment> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingMeterEventAdjustment {
            val jsonDecoder = decoder.requireJsonDecoder("BillingMeterEventAdjustment")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingMeterEventAdjustment must be a JSON object")
            val eventName = json.decodeRequired<String>(rawObject, "event_name")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue =
                json.decodeRequired<InlineBillingMeterEventAdjustmentObjectValueX9bd06423>(
                    rawObject,
                    "object",
                )
            val status = json.decodeRequired<InlineBillingMeterEventAdjustmentStatusX0a9e79ad>(rawObject, "status")
            val type = json.decodeRequired<InlineBillingMeterEventAdjustmentTypeX3b9f2ee3>(rawObject, "type")
            return BillingMeterEventAdjustment(
                eventName = eventName,
                livemode = livemode,
                objectValue = objectValue,
                status = status,
                type = type,
                cancel =
                    rawObject["cancel"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingMeterEventAdjustmentCancelX908730ed?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingMeterEventAdjustment,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingMeterEventAdjustment")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("event_name", value.eventName)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", json.encodeToJsonElement(value.status))
                    put("type", json.encodeToJsonElement(value.type))
                    value.cancel?.let { put("cancel", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingMeterEventAdjustment(
    block: BillingMeterEventAdjustment.Builder.() -> Unit,
): BillingMeterEventAdjustment = BillingMeterEventAdjustment.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("BillingMeterEventAdjustment is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

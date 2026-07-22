package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class BillingMeterView(
    public val created: Int,
    @SerialName("customer_mapping")
    public val customerMapping: BillingMeterResourceCustomerMappingSettings,
    @SerialName("default_aggregation")
    public val defaultAggregation: BillingMeterResourceAggregationSettings,
    @SerialName("display_name")
    public val displayName: String,
    @SerialName("event_name")
    public val eventName: String,
    @SerialName("event_time_window")
    public val eventTimeWindow: InlineBillingMeterEventTimeWindowX21f9c1a1? = null,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("object")
    public val objectValue: InlineBillingMeterObjectValueX4f2455fc,
    public val status: InlineBillingMeterStatusXc97e094c,
    @SerialName("status_transitions")
    public val statusTransitions: BillingMeterResourceBillingMeterStatusTransitions,
    public val updated: Int,
    @SerialName("value_settings")
    public val valueSettings: BillingMeterResourceBillingMeterValue,
)

/**
 * Meters specify how to aggregate meter events over a billing period. Meter events represent the actions that customers
 * take in your system. Meters attach to prices and form the basis of the bill.
 *
 * Related guide: [Usage based billing](https://docs.stripe.com/billing/subscriptions/usage-based)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter
 */
@Serializable(with = BillingMeter.Serializer::class)
public class BillingMeter(
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    public val customerMapping: BillingMeterResourceCustomerMappingSettings,
    public val defaultAggregation: BillingMeterResourceAggregationSettings,
    /**
     * The meter's name.
     */
    public val displayName: String,
    /**
     * The name of the meter event to record usage for. Corresponds with the `event_name` field on meter events.
     */
    public val eventName: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineBillingMeterObjectValueX4f2455fc,
    /**
     * The meter's status.
     */
    public val status: InlineBillingMeterStatusXc97e094c,
    public val statusTransitions: BillingMeterResourceBillingMeterStatusTransitions,
    /**
     * Time at which the object was last updated. Measured in seconds since the Unix epoch.
     */
    public val updated: Int,
    public val valueSettings: BillingMeterResourceBillingMeterValue,
    /**
     * The time window which meter events have been pre-aggregated for, if any.
     */
    public val eventTimeWindow: InlineBillingMeterEventTimeWindowX21f9c1a1? = null,
) {
    public class Builder {
        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var customerMappingValue: BillingMeterResourceCustomerMappingSettings? = null

        public var customerMapping: BillingMeterResourceCustomerMappingSettings
            get() = requireNotNull(customerMappingValue) { "customerMapping is required" }
            set(`value`) {
                customerMappingValue = value
            }

        private var defaultAggregationValue: BillingMeterResourceAggregationSettings? = null

        public var defaultAggregation: BillingMeterResourceAggregationSettings
            get() = requireNotNull(defaultAggregationValue) { "defaultAggregation is required" }
            set(`value`) {
                defaultAggregationValue = value
            }

        private var displayNameValue: String? = null

        public var displayName: String
            get() = requireNotNull(displayNameValue) { "displayName is required" }
            set(`value`) {
                displayNameValue = value
            }

        private var eventNameValue: String? = null

        public var eventName: String
            get() = requireNotNull(eventNameValue) { "eventName is required" }
            set(`value`) {
                eventNameValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineBillingMeterObjectValueX4f2455fc? = null

        public var objectValue: InlineBillingMeterObjectValueX4f2455fc
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: InlineBillingMeterStatusXc97e094c? = null

        public var status: InlineBillingMeterStatusXc97e094c
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var statusTransitionsValue: BillingMeterResourceBillingMeterStatusTransitions? = null

        public var statusTransitions: BillingMeterResourceBillingMeterStatusTransitions
            get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
            set(`value`) {
                statusTransitionsValue = value
            }

        private var updatedValue: Int? = null

        public var updated: Int
            get() = requireNotNull(updatedValue) { "updated is required" }
            set(`value`) {
                updatedValue = value
            }

        private var valueSettingsValue: BillingMeterResourceBillingMeterValue? = null

        public var valueSettings: BillingMeterResourceBillingMeterValue
            get() = requireNotNull(valueSettingsValue) { "valueSettings is required" }
            set(`value`) {
                valueSettingsValue = value
            }

        /**
         * The time window which meter events have been pre-aggregated for, if any.
         */
        public var eventTimeWindow: InlineBillingMeterEventTimeWindowX21f9c1a1? = null

        public fun build(): BillingMeter {
            check(createdValue != null) { "created is required" }
            check(customerMappingValue != null) { "customerMapping is required" }
            check(defaultAggregationValue != null) { "defaultAggregation is required" }
            check(displayNameValue != null) { "displayName is required" }
            check(eventNameValue != null) { "eventName is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            check(statusTransitionsValue != null) { "statusTransitions is required" }
            check(updatedValue != null) { "updated is required" }
            check(valueSettingsValue != null) { "valueSettings is required" }
            return BillingMeter(
                created = created,
                customerMapping = customerMapping,
                defaultAggregation = defaultAggregation,
                displayName = displayName,
                eventName = eventName,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                status = status,
                statusTransitions = statusTransitions,
                updated = updated,
                valueSettings = valueSettings,
                eventTimeWindow = eventTimeWindow,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingMeter = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingMeter> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingMeter {
            val jsonDecoder = decoder.requireJsonDecoder("BillingMeter")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingMeter must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val customerMapping =
                json.decodeRequired<BillingMeterResourceCustomerMappingSettings>(
                    rawObject,
                    "customer_mapping",
                )
            val defaultAggregation =
                json.decodeRequired<BillingMeterResourceAggregationSettings>(
                    rawObject,
                    "default_aggregation",
                )
            val displayName = json.decodeRequired<String>(rawObject, "display_name")
            val eventName = json.decodeRequired<String>(rawObject, "event_name")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineBillingMeterObjectValueX4f2455fc>(rawObject, "object")
            val status = json.decodeRequired<InlineBillingMeterStatusXc97e094c>(rawObject, "status")
            val statusTransitions =
                json.decodeRequired<BillingMeterResourceBillingMeterStatusTransitions>(
                    rawObject,
                    "status_transitions",
                )
            val updated = json.decodeRequired<Int>(rawObject, "updated")
            val valueSettings = json.decodeRequired<BillingMeterResourceBillingMeterValue>(rawObject, "value_settings")
            return BillingMeter(
                created = created,
                customerMapping = customerMapping,
                defaultAggregation = defaultAggregation,
                displayName = displayName,
                eventName = eventName,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                status = status,
                statusTransitions = statusTransitions,
                updated = updated,
                valueSettings = valueSettings,
                eventTimeWindow =
                    rawObject["event_time_window"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineBillingMeterEventTimeWindowX21f9c1a1?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingMeter,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingMeter")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("customer_mapping", json.encodeToJsonElement(value.customerMapping))
                    put("default_aggregation", json.encodeToJsonElement(value.defaultAggregation))
                    put("display_name", value.displayName)
                    put("event_name", value.eventName)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", json.encodeToJsonElement(value.status))
                    put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
                    put("updated", json.encodeToJsonElement(value.updated))
                    put("value_settings", json.encodeToJsonElement(value.valueSettings))
                    value.eventTimeWindow?.let { put("event_time_window", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingMeter(block: BillingMeter.Builder.() -> Unit): BillingMeter = BillingMeter.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("BillingMeter is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * The delivery of a specified quantity of carbon for an order.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate_removals_order_deliveries
 */
@Serializable(with = ClimateRemovalsOrderDeliveries.Serializer::class)
public class ClimateRemovalsOrderDeliveries(
    /**
     * Time at which the delivery occurred. Measured in seconds since the Unix epoch.
     */
    public val deliveredAt: Int,
    /**
     * Quantity of carbon removal supplied by this delivery.
     */
    public val metricTons: String,
    public val supplier: ClimateSupplier,
    /**
     * Specific location of this delivery.
     */
    public val location: InlineClimateRemovalsOrderDeliveriesLocationX4d122060? = null,
    /**
     * Once retired, a URL to the registry entry for the tons from this delivery.
     */
    public val registryUrl: String? = null,
) {
    public class Builder {
        private var deliveredAtValue: Int? = null

        public var deliveredAt: Int
            get() = requireNotNull(deliveredAtValue) { "deliveredAt is required" }
            set(`value`) {
                deliveredAtValue = value
            }

        private var metricTonsValue: String? = null

        public var metricTons: String
            get() = requireNotNull(metricTonsValue) { "metricTons is required" }
            set(`value`) {
                metricTonsValue = value
            }

        private var supplierValue: ClimateSupplier? = null

        public var supplier: ClimateSupplier
            get() = requireNotNull(supplierValue) { "supplier is required" }
            set(`value`) {
                supplierValue = value
            }

        /**
         * Specific location of this delivery.
         */
        public var location: InlineClimateRemovalsOrderDeliveriesLocationX4d122060? = null

        /**
         * Once retired, a URL to the registry entry for the tons from this delivery.
         */
        public var registryUrl: String? = null

        public fun build(): ClimateRemovalsOrderDeliveries {
            check(deliveredAtValue != null) { "deliveredAt is required" }
            check(metricTonsValue != null) { "metricTons is required" }
            check(supplierValue != null) { "supplier is required" }
            return ClimateRemovalsOrderDeliveries(
                deliveredAt = deliveredAt,
                metricTons = metricTons,
                supplier = supplier,
                location = location,
                registryUrl = registryUrl,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ClimateRemovalsOrderDeliveries = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ClimateRemovalsOrderDeliveries> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ClimateRemovalsOrderDeliveries {
            val jsonDecoder = decoder.requireJsonDecoder("ClimateRemovalsOrderDeliveries")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ClimateRemovalsOrderDeliveries must be a JSON object")
            val deliveredAt = json.decodeRequired<Int>(rawObject, "delivered_at")
            val metricTons = json.decodeRequired<String>(rawObject, "metric_tons")
            val supplier = json.decodeRequired<ClimateSupplier>(rawObject, "supplier")
            return ClimateRemovalsOrderDeliveries(
                deliveredAt = deliveredAt,
                metricTons = metricTons,
                supplier = supplier,
                location =
                    rawObject["location"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineClimateRemovalsOrderDeliveriesLocationX4d122060?>(element)
                        }
                    },
                registryUrl =
                    rawObject["registry_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ClimateRemovalsOrderDeliveries,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ClimateRemovalsOrderDeliveries")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("delivered_at", json.encodeToJsonElement(value.deliveredAt))
                    put("metric_tons", value.metricTons)
                    put("supplier", json.encodeToJsonElement(value.supplier))
                    value.location?.let { put("location", json.encodeToJsonElement(it)) }
                    value.registryUrl?.let { put("registry_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun climateRemovalsOrderDeliveries(
    block: ClimateRemovalsOrderDeliveries.Builder.() -> Unit,
): ClimateRemovalsOrderDeliveries = ClimateRemovalsOrderDeliveries.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "ClimateRemovalsOrderDeliveries is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

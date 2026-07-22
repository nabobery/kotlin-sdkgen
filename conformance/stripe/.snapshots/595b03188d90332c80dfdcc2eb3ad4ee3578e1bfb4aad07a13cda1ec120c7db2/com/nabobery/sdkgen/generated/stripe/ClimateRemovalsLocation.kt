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
import kotlin.Double
import kotlin.String
import kotlin.Unit

@Serializable
public data class ClimateRemovalsLocationView(
    public val city: String? = null,
    public val country: String,
    public val latitude: Double? = null,
    public val longitude: Double? = null,
    public val region: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate_removals_location
 */
@Serializable(with = ClimateRemovalsLocation.Serializer::class)
public class ClimateRemovalsLocation(
    /**
     * Two-letter ISO code representing the country where the supplier is located.
     */
    public val country: String,
    /**
     * The city where the supplier is located.
     */
    public val city: String? = null,
    /**
     * The geographic latitude where the supplier is located.
     */
    public val latitude: Double? = null,
    /**
     * The geographic longitude where the supplier is located.
     */
    public val longitude: Double? = null,
    /**
     * The state/county/province/region where the supplier is located.
     */
    public val region: String? = null,
) {
    public class Builder {
        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        /**
         * The city where the supplier is located.
         */
        public var city: String? = null

        /**
         * The geographic latitude where the supplier is located.
         */
        public var latitude: Double? = null

        /**
         * The geographic longitude where the supplier is located.
         */
        public var longitude: Double? = null

        /**
         * The state/county/province/region where the supplier is located.
         */
        public var region: String? = null

        public fun build(): ClimateRemovalsLocation {
            check(countryValue != null) { "country is required" }
            return ClimateRemovalsLocation(
                country = country,
                city = city,
                latitude = latitude,
                longitude = longitude,
                region = region,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ClimateRemovalsLocation = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ClimateRemovalsLocation> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ClimateRemovalsLocation {
            val jsonDecoder = decoder.requireJsonDecoder("ClimateRemovalsLocation")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ClimateRemovalsLocation must be a JSON object")
            val country = json.decodeRequired<String>(rawObject, "country")
            return ClimateRemovalsLocation(
                country = country,
                city =
                    rawObject["city"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                latitude =
                    rawObject["latitude"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Double?>(element)
                        }
                    },
                longitude =
                    rawObject["longitude"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Double?>(element)
                        }
                    },
                region =
                    rawObject["region"]?.let { element ->
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
            `value`: ClimateRemovalsLocation,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ClimateRemovalsLocation")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", value.country)
                    value.city?.let { put("city", it) }
                    value.latitude?.let { put("latitude", json.encodeToJsonElement(it)) }
                    value.longitude?.let { put("longitude", json.encodeToJsonElement(it)) }
                    value.region?.let { put("region", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun climateRemovalsLocation(block: ClimateRemovalsLocation.Builder.() -> Unit): ClimateRemovalsLocation =
    ClimateRemovalsLocation.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("ClimateRemovalsLocation is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

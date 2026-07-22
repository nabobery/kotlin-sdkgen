package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
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
import kotlin.collections.List

@Serializable
public data class IssuingTransactionFlightDataView(
    @SerialName("departure_at")
    public val departureAt: Int? = null,
    @SerialName("passenger_name")
    public val passengerName: String? = null,
    public val refundable: Boolean? = null,
    public val segments: List<IssuingTransactionFlightDataLeg>? = null,
    @SerialName("travel_agency")
    public val travelAgency: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_flight_data
 */
@Serializable(with = IssuingTransactionFlightData.Serializer::class)
public class IssuingTransactionFlightData(
    /**
     * The time that the flight departed.
     */
    public val departureAt: Int? = null,
    /**
     * The name of the passenger.
     */
    public val passengerName: String? = null,
    /**
     * Whether the ticket is refundable.
     */
    public val refundable: Boolean? = null,
    /**
     * The legs of the trip.
     */
    public val segments: List<IssuingTransactionFlightDataLeg>? = null,
    /**
     * The travel agency that issued the ticket.
     */
    public val travelAgency: String? = null,
) {
    public class Builder {
        /**
         * The time that the flight departed.
         */
        public var departureAt: Int? = null

        /**
         * The name of the passenger.
         */
        public var passengerName: String? = null

        /**
         * Whether the ticket is refundable.
         */
        public var refundable: Boolean? = null

        /**
         * The legs of the trip.
         */
        public var segments: List<IssuingTransactionFlightDataLeg>? = null

        /**
         * The travel agency that issued the ticket.
         */
        public var travelAgency: String? = null

        public fun build(): IssuingTransactionFlightData =
            IssuingTransactionFlightData(
                departureAt = departureAt,
                passengerName = passengerName,
                refundable = refundable,
                segments = segments,
                travelAgency = travelAgency,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingTransactionFlightData = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingTransactionFlightData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingTransactionFlightData {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFlightData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingTransactionFlightData must be a JSON object")
            return IssuingTransactionFlightData(
                departureAt =
                    rawObject["departure_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                passengerName =
                    rawObject["passenger_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                refundable =
                    rawObject["refundable"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
                segments =
                    rawObject["segments"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<IssuingTransactionFlightDataLeg>?>(element)
                        }
                    },
                travelAgency =
                    rawObject["travel_agency"]?.let { element ->
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
            `value`: IssuingTransactionFlightData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFlightData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.departureAt?.let { put("departure_at", json.encodeToJsonElement(it)) }
                    value.passengerName?.let { put("passenger_name", it) }
                    value.refundable?.let { put("refundable", json.encodeToJsonElement(it)) }
                    value.segments?.let { put("segments", json.encodeToJsonElement(it)) }
                    value.travelAgency?.let { put("travel_agency", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingTransactionFlightData(
    block: IssuingTransactionFlightData.Builder.() -> Unit,
): IssuingTransactionFlightData = IssuingTransactionFlightData.build(block)

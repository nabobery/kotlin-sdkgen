package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_flight_data_leg
 */
@Serializable(with = IssuingTransactionFlightDataLeg.Serializer::class)
public class IssuingTransactionFlightDataLeg(
    /**
     * The three-letter IATA airport code of the flight's destination.
     */
    public val arrivalAirportCode: String? = null,
    /**
     * The airline carrier code.
     */
    public val carrier: String? = null,
    /**
     * The three-letter IATA airport code that the flight departed from.
     */
    public val departureAirportCode: String? = null,
    /**
     * The flight number.
     */
    public val flightNumber: String? = null,
    /**
     * The flight's service class.
     */
    public val serviceClass: String? = null,
    /**
     * Whether a stopover is allowed on this flight.
     */
    public val stopoverAllowed: Boolean? = null,
) {
    public class Builder {
        /**
         * The three-letter IATA airport code of the flight's destination.
         */
        public var arrivalAirportCode: String? = null

        /**
         * The airline carrier code.
         */
        public var carrier: String? = null

        /**
         * The three-letter IATA airport code that the flight departed from.
         */
        public var departureAirportCode: String? = null

        /**
         * The flight number.
         */
        public var flightNumber: String? = null

        /**
         * The flight's service class.
         */
        public var serviceClass: String? = null

        /**
         * Whether a stopover is allowed on this flight.
         */
        public var stopoverAllowed: Boolean? = null

        public fun build(): IssuingTransactionFlightDataLeg =
            IssuingTransactionFlightDataLeg(
                arrivalAirportCode = arrivalAirportCode,
                carrier = carrier,
                departureAirportCode = departureAirportCode,
                flightNumber = flightNumber,
                serviceClass = serviceClass,
                stopoverAllowed = stopoverAllowed,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingTransactionFlightDataLeg = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingTransactionFlightDataLeg> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingTransactionFlightDataLeg {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFlightDataLeg")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingTransactionFlightDataLeg must be a JSON object")
            return IssuingTransactionFlightDataLeg(
                arrivalAirportCode =
                    rawObject["arrival_airport_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                carrier =
                    rawObject["carrier"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                departureAirportCode =
                    rawObject["departure_airport_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                flightNumber =
                    rawObject["flight_number"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                serviceClass =
                    rawObject["service_class"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                stopoverAllowed =
                    rawObject["stopover_allowed"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingTransactionFlightDataLeg,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFlightDataLeg")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.arrivalAirportCode?.let { put("arrival_airport_code", it) }
                    value.carrier?.let { put("carrier", it) }
                    value.departureAirportCode?.let { put("departure_airport_code", it) }
                    value.flightNumber?.let { put("flight_number", it) }
                    value.serviceClass?.let { put("service_class", it) }
                    value.stopoverAllowed?.let { put("stopover_allowed", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingTransactionFlightDataLeg(
    block: IssuingTransactionFlightDataLeg.Builder.() -> Unit,
): IssuingTransactionFlightDataLeg = IssuingTransactionFlightDataLeg.build(block)

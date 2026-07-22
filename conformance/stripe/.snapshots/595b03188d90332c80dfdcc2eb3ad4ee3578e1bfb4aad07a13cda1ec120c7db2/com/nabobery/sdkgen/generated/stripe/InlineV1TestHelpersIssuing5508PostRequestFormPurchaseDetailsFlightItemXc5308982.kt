package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/flight/properties/segm
 * ents/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/flight/properties/segm
 * ents/items
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982(
    public val arrivalAirportCode: String? = null,
    public val carrier: String? = null,
    public val departureAirportCode: String? = null,
    public val flightNumber: String? = null,
    public val serviceClass: String? = null,
    public val stopoverAllowed: Boolean? = null,
) {
    public class Builder {
        public var arrivalAirportCode: String? = null

        public var carrier: String? = null

        public var departureAirportCode: String? = null

        public var flightNumber: String? = null

        public var serviceClass: String? = null

        public var stopoverAllowed: Boolean? = null

        public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982 =
            InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982(
                arrivalAirportCode = arrivalAirportCode,
                carrier = carrier,
                departureAirportCode = departureAirportCode,
                flightNumber = flightNumber,
                serviceClass = serviceClass,
                stopoverAllowed = stopoverAllowed,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982 must be a JSON object",
                    )
            return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982(
                arrivalAirportCode = rawObject["arrival_airport_code"]?.let { json.decodeFromJsonElement<String>(it) },
                carrier = rawObject["carrier"]?.let { json.decodeFromJsonElement<String>(it) },
                departureAirportCode =
                    rawObject["departure_airport_code"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                flightNumber = rawObject["flight_number"]?.let { json.decodeFromJsonElement<String>(it) },
                serviceClass = rawObject["service_class"]?.let { json.decodeFromJsonElement<String>(it) },
                stopoverAllowed = rawObject["stopover_allowed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982",
                )
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

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982(
    block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982.Builder.() -> Unit,
): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982 =
    InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982.build(block)

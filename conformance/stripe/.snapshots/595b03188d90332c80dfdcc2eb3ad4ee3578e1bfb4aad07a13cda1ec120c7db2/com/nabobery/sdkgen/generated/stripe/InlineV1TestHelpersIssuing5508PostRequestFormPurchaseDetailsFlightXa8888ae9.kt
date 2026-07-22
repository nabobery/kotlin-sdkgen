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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/flight.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/flight
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9(
    public val departureAt: Int? = null,
    public val passengerName: String? = null,
    public val refundable: Boolean? = null,
    public val segments: List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982>? = null,
    public val travelAgency: String? = null,
) {
    public class Builder {
        public var departureAt: Int? = null

        public var passengerName: String? = null

        public var refundable: Boolean? = null

        public var segments:
            List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982>? =
            null

        public var travelAgency: String? = null

        public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9 =
            InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9(
                departureAt = departureAt,
                passengerName = passengerName,
                refundable = refundable,
                segments = segments,
                travelAgency = travelAgency,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9 must be a JSON object",
                    )
            return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9(
                departureAt = rawObject["departure_at"]?.let { json.decodeFromJsonElement<Int>(it) },
                passengerName = rawObject["passenger_name"]?.let { json.decodeFromJsonElement<String>(it) },
                refundable = rawObject["refundable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                segments =
                    rawObject["segments"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightItemXc5308982>>(
                                it,
                            )
                    },
                travelAgency = rawObject["travel_agency"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9",
                )
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

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9(
    block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9.Builder.() -> Unit,
): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9 =
    InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9.build(block)

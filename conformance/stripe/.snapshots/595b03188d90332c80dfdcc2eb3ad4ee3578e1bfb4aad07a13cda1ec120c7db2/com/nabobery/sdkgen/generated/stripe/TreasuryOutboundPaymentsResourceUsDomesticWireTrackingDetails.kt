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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_us_domestic_wire_tracking_detail
 * s
 */
@Serializable(with = TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails.Serializer::class)
public class TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails(
    /**
     * CHIPS System Sequence Number (SSN) of the OutboundPayment for payments sent over the `us_domestic_wire` network.
     */
    public val chips: String? = null,
    /**
     * IMAD of the OutboundPayment for payments sent over the `us_domestic_wire` network.
     */
    public val imad: String? = null,
    /**
     * OMAD of the OutboundPayment for payments sent over the `us_domestic_wire` network.
     */
    public val omad: String? = null,
) {
    public class Builder {
        /**
         * CHIPS System Sequence Number (SSN) of the OutboundPayment for payments sent over the `us_domestic_wire` network.
         */
        public var chips: String? = null

        /**
         * IMAD of the OutboundPayment for payments sent over the `us_domestic_wire` network.
         */
        public var imad: String? = null

        /**
         * OMAD of the OutboundPayment for payments sent over the `us_domestic_wire` network.
         */
        public var omad: String? = null

        public fun build(): TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails =
            TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails(
                chips = chips,
                imad = imad,
                omad = omad,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails must be a JSON object",
                    )
            return TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails(
                chips =
                    rawObject["chips"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                imad =
                    rawObject["imad"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                omad =
                    rawObject["omad"]?.let { element ->
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
            `value`: TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.chips?.let { put("chips", it) }
                    value.imad?.let { put("imad", it) }
                    value.omad?.let { put("omad", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails(
    block: TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails.Builder.() -> Unit,
): TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails =
    TreasuryOutboundPaymentsResourceUsDomesticWireTrackingDetails.build(block)

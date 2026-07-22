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
import kotlin.Int
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_outbound_payment_resource_status
 * _transitions
 */
@Serializable(with = TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions.Serializer::class)
public class TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions(
    /**
     * Timestamp describing when an OutboundPayment changed status to `canceled`.
     */
    public val canceledAt: Int? = null,
    /**
     * Timestamp describing when an OutboundPayment changed status to `failed`.
     */
    public val failedAt: Int? = null,
    /**
     * Timestamp describing when an OutboundPayment changed status to `posted`.
     */
    public val postedAt: Int? = null,
    /**
     * Timestamp describing when an OutboundPayment changed status to `returned`.
     */
    public val returnedAt: Int? = null,
) {
    public class Builder {
        /**
         * Timestamp describing when an OutboundPayment changed status to `canceled`.
         */
        public var canceledAt: Int? = null

        /**
         * Timestamp describing when an OutboundPayment changed status to `failed`.
         */
        public var failedAt: Int? = null

        /**
         * Timestamp describing when an OutboundPayment changed status to `posted`.
         */
        public var postedAt: Int? = null

        /**
         * Timestamp describing when an OutboundPayment changed status to `returned`.
         */
        public var returnedAt: Int? = null

        public fun build(): TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions =
            TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions(
                canceledAt = canceledAt,
                failedAt = failedAt,
                postedAt = postedAt,
                returnedAt = returnedAt,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions must be a JSON object",
                    )
            return TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions(
                canceledAt =
                    rawObject["canceled_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                failedAt =
                    rawObject["failed_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                postedAt =
                    rawObject["posted_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                returnedAt =
                    rawObject["returned_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
                    value.failedAt?.let { put("failed_at", json.encodeToJsonElement(it)) }
                    value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
                    value.returnedAt?.let { put("returned_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions(
    block: TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions.Builder.() -> Unit,
): TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions =
    TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions.build(block)

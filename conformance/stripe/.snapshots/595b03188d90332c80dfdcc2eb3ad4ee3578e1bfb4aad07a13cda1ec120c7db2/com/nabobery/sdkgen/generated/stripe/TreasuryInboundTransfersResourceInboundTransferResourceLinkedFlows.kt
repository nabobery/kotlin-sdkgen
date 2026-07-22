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
 * sdkgen://source/openapi.json#/components/schemas/treasury_inbound_transfers_resource_inbound_transfer_resource_linked
 * _flows
 */
@Serializable(with = TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows.Serializer::class)
public class TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows(
    /**
     * If funds for this flow were returned after the flow went to the `succeeded` state, this field contains a reference
     * to the ReceivedDebit return.
     */
    public val receivedDebit: String? = null,
) {
    public class Builder {
        /**
         * If funds for this flow were returned after the flow went to the `succeeded` state, this field contains a
         * reference to the ReceivedDebit return.
         */
        public var receivedDebit: String? = null

        public fun build(): TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows =
            TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows(
                receivedDebit = receivedDebit,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows must be a JSON object",
                    )
            return TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows(
                receivedDebit =
                    rawObject["received_debit"]?.let { element ->
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
            `value`: TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.receivedDebit?.let { put("received_debit", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryInboundTransfersResourceInboundTransferResourceLinkedFlows(
    block: TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows.Builder.() -> Unit,
): TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows =
    TreasuryInboundTransfersResourceInboundTransferResourceLinkedFlows.build(block)

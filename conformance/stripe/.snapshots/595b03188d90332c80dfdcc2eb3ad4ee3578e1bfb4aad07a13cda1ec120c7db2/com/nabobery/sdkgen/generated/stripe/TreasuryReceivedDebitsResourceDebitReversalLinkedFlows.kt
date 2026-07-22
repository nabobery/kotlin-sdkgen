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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class TreasuryReceivedDebitsResourceDebitReversalLinkedFlowsView(
    @SerialName("issuing_dispute")
    public val issuingDispute: String? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_received_debits_resource_debit_reversal_linked_flows
 */
@Serializable(with = TreasuryReceivedDebitsResourceDebitReversalLinkedFlows.Serializer::class)
public class TreasuryReceivedDebitsResourceDebitReversalLinkedFlows(
    /**
     * Set if there is an Issuing dispute associated with the DebitReversal.
     */
    public val issuingDispute: String? = null,
) {
    public class Builder {
        /**
         * Set if there is an Issuing dispute associated with the DebitReversal.
         */
        public var issuingDispute: String? = null

        public fun build(): TreasuryReceivedDebitsResourceDebitReversalLinkedFlows =
            TreasuryReceivedDebitsResourceDebitReversalLinkedFlows(
                issuingDispute = issuingDispute,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryReceivedDebitsResourceDebitReversalLinkedFlows =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryReceivedDebitsResourceDebitReversalLinkedFlows> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryReceivedDebitsResourceDebitReversalLinkedFlows {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedDebitsResourceDebitReversalLinkedFlows")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryReceivedDebitsResourceDebitReversalLinkedFlows must be a JSON object",
                    )
            return TreasuryReceivedDebitsResourceDebitReversalLinkedFlows(
                issuingDispute =
                    rawObject["issuing_dispute"]?.let { element ->
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
            `value`: TreasuryReceivedDebitsResourceDebitReversalLinkedFlows,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedDebitsResourceDebitReversalLinkedFlows")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.issuingDispute?.let { put("issuing_dispute", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryReceivedDebitsResourceDebitReversalLinkedFlows(
    block: TreasuryReceivedDebitsResourceDebitReversalLinkedFlows.Builder.() -> Unit,
): TreasuryReceivedDebitsResourceDebitReversalLinkedFlows =
    TreasuryReceivedDebitsResourceDebitReversalLinkedFlows.build(block)

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
import kotlin.Int
import kotlin.Unit

@Serializable
public data class TreasuryReceivedDebitsResourceReversalDetailsView(
    public val deadline: Int? = null,
    @SerialName("restricted_reason")
    public val restrictedReason: InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_debits_resource_reversal_details
 */
@Serializable(with = TreasuryReceivedDebitsResourceReversalDetails.Serializer::class)
public class TreasuryReceivedDebitsResourceReversalDetails(
    /**
     * Time before which a ReceivedDebit can be reversed.
     */
    public val deadline: Int? = null,
    /**
     * Set if a ReceivedDebit can't be reversed.
     */
    public val restrictedReason: InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc? = null,
) {
    public class Builder {
        /**
         * Time before which a ReceivedDebit can be reversed.
         */
        public var deadline: Int? = null

        /**
         * Set if a ReceivedDebit can't be reversed.
         */
        public var restrictedReason:
            InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc? = null

        public fun build(): TreasuryReceivedDebitsResourceReversalDetails =
            TreasuryReceivedDebitsResourceReversalDetails(
                deadline = deadline,
                restrictedReason = restrictedReason,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryReceivedDebitsResourceReversalDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryReceivedDebitsResourceReversalDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryReceivedDebitsResourceReversalDetails {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedDebitsResourceReversalDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryReceivedDebitsResourceReversalDetails must be a JSON object",
                    )
            return TreasuryReceivedDebitsResourceReversalDetails(
                deadline =
                    rawObject["deadline"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                restrictedReason =
                    rawObject["restricted_reason"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineTreasuryReceivedDebitsResourceReversalDetailsRestrictedReasonX3cfe83bc?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryReceivedDebitsResourceReversalDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedDebitsResourceReversalDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.deadline?.let { put("deadline", json.encodeToJsonElement(it)) }
                    value.restrictedReason?.let { put("restricted_reason", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryReceivedDebitsResourceReversalDetails(
    block: TreasuryReceivedDebitsResourceReversalDetails.Builder.() -> Unit,
): TreasuryReceivedDebitsResourceReversalDetails = TreasuryReceivedDebitsResourceReversalDetails.build(block)

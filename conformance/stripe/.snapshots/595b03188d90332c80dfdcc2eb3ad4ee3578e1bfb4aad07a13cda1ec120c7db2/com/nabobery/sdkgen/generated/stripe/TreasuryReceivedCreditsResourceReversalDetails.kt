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
public data class TreasuryReceivedCreditsResourceReversalDetailsView(
    public val deadline: Int? = null,
    @SerialName("restricted_reason")
    public val restrictedReason: InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_reversal_details
 */
@Serializable(with = TreasuryReceivedCreditsResourceReversalDetails.Serializer::class)
public class TreasuryReceivedCreditsResourceReversalDetails(
    /**
     * Time before which a ReceivedCredit can be reversed.
     */
    public val deadline: Int? = null,
    /**
     * Set if a ReceivedCredit cannot be reversed.
     */
    public val restrictedReason: InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab? = null,
) {
    public class Builder {
        /**
         * Time before which a ReceivedCredit can be reversed.
         */
        public var deadline: Int? = null

        /**
         * Set if a ReceivedCredit cannot be reversed.
         */
        public var restrictedReason:
            InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab? = null

        public fun build(): TreasuryReceivedCreditsResourceReversalDetails =
            TreasuryReceivedCreditsResourceReversalDetails(
                deadline = deadline,
                restrictedReason = restrictedReason,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryReceivedCreditsResourceReversalDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryReceivedCreditsResourceReversalDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryReceivedCreditsResourceReversalDetails {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedCreditsResourceReversalDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryReceivedCreditsResourceReversalDetails must be a JSON object",
                    )
            return TreasuryReceivedCreditsResourceReversalDetails(
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
                                .decodeFromJsonElement<InlineTreasuryReceivedCreditsResourceReversalDetailsRestrictedReasonXbf579fab?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryReceivedCreditsResourceReversalDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedCreditsResourceReversalDetails")
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

public fun treasuryReceivedCreditsResourceReversalDetails(
    block: TreasuryReceivedCreditsResourceReversalDetails.Builder.() -> Unit,
): TreasuryReceivedCreditsResourceReversalDetails = TreasuryReceivedCreditsResourceReversalDetails.build(block)

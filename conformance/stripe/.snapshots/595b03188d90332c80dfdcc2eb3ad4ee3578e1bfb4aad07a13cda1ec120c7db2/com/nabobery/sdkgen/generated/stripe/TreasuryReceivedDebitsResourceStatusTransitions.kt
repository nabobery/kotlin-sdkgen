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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_debits_resource_status_transitions
 */
@Serializable(with = TreasuryReceivedDebitsResourceStatusTransitions.Serializer::class)
public class TreasuryReceivedDebitsResourceStatusTransitions(
    /**
     * Timestamp describing when the DebitReversal changed status to `completed`.
     */
    public val completedAt: Int? = null,
) {
    public class Builder {
        /**
         * Timestamp describing when the DebitReversal changed status to `completed`.
         */
        public var completedAt: Int? = null

        public fun build(): TreasuryReceivedDebitsResourceStatusTransitions =
            TreasuryReceivedDebitsResourceStatusTransitions(
                completedAt = completedAt,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryReceivedDebitsResourceStatusTransitions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryReceivedDebitsResourceStatusTransitions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryReceivedDebitsResourceStatusTransitions {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedDebitsResourceStatusTransitions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryReceivedDebitsResourceStatusTransitions must be a JSON object",
                    )
            return TreasuryReceivedDebitsResourceStatusTransitions(
                completedAt =
                    rawObject["completed_at"]?.let { element ->
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
            `value`: TreasuryReceivedDebitsResourceStatusTransitions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedDebitsResourceStatusTransitions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.completedAt?.let { put("completed_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryReceivedDebitsResourceStatusTransitions(
    block: TreasuryReceivedDebitsResourceStatusTransitions.Builder.() -> Unit,
): TreasuryReceivedDebitsResourceStatusTransitions = TreasuryReceivedDebitsResourceStatusTransitions.build(block)

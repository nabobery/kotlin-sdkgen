package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class IssuingDisputeTreasuryView(
    @SerialName("debit_reversal")
    public val debitReversal: String? = null,
    @SerialName("received_debit")
    public val receivedDebit: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_treasury
 */
@Serializable(with = IssuingDisputeTreasury.Serializer::class)
public class IssuingDisputeTreasury(
    /**
     * The Treasury [ReceivedDebit](https://docs.stripe.com/api/treasury/received_debits) that is being disputed.
     */
    public val receivedDebit: String,
    /**
     * The Treasury [DebitReversal](https://docs.stripe.com/api/treasury/debit_reversals) representing this Issuing
     * dispute
     */
    public val debitReversal: String? = null,
) {
    public class Builder {
        private var receivedDebitValue: String? = null

        public var receivedDebit: String
            get() = requireNotNull(receivedDebitValue) { "receivedDebit is required" }
            set(`value`) {
                receivedDebitValue = value
            }

        /**
         * The Treasury [DebitReversal](https://docs.stripe.com/api/treasury/debit_reversals) representing this Issuing
         * dispute
         */
        public var debitReversal: String? = null

        public fun build(): IssuingDisputeTreasury {
            check(receivedDebitValue != null) { "receivedDebit is required" }
            return IssuingDisputeTreasury(
                receivedDebit = receivedDebit,
                debitReversal = debitReversal,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingDisputeTreasury = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingDisputeTreasury> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingDisputeTreasury {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingDisputeTreasury")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingDisputeTreasury must be a JSON object")
            val receivedDebit = json.decodeRequired<String>(rawObject, "received_debit")
            return IssuingDisputeTreasury(
                receivedDebit = receivedDebit,
                debitReversal =
                    rawObject["debit_reversal"]?.let { element ->
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
            `value`: IssuingDisputeTreasury,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingDisputeTreasury")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("received_debit", value.receivedDebit)
                    value.debitReversal?.let { put("debit_reversal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingDisputeTreasury(block: IssuingDisputeTreasury.Builder.() -> Unit): IssuingDisputeTreasury =
    IssuingDisputeTreasury.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingDisputeTreasury is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

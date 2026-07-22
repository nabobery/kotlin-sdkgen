package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Change to a FinancialAccount's balance
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_transactions_resource_balance_impact
 */
@Serializable(with = TreasuryTransactionsResourceBalanceImpact.Serializer::class)
public class TreasuryTransactionsResourceBalanceImpact(
    /**
     * The change made to funds the user can spend right now.
     */
    public val cash: Int,
    /**
     * The change made to funds that are not spendable yet, but will become available at a later time.
     */
    public val inboundPending: Int,
    /**
     * The change made to funds in the account, but not spendable because they are being held for pending outbound flows.
     */
    public val outboundPending: Int,
) {
    public class Builder {
        private var cashValue: Int? = null

        public var cash: Int
            get() = requireNotNull(cashValue) { "cash is required" }
            set(`value`) {
                cashValue = value
            }

        private var inboundPendingValue: Int? = null

        public var inboundPending: Int
            get() = requireNotNull(inboundPendingValue) { "inboundPending is required" }
            set(`value`) {
                inboundPendingValue = value
            }

        private var outboundPendingValue: Int? = null

        public var outboundPending: Int
            get() = requireNotNull(outboundPendingValue) { "outboundPending is required" }
            set(`value`) {
                outboundPendingValue = value
            }

        public fun build(): TreasuryTransactionsResourceBalanceImpact {
            check(cashValue != null) { "cash is required" }
            check(inboundPendingValue != null) { "inboundPending is required" }
            check(outboundPendingValue != null) { "outboundPending is required" }
            return TreasuryTransactionsResourceBalanceImpact(
                cash = cash,
                inboundPending = inboundPending,
                outboundPending = outboundPending,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryTransactionsResourceBalanceImpact =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryTransactionsResourceBalanceImpact> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryTransactionsResourceBalanceImpact {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryTransactionsResourceBalanceImpact")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasuryTransactionsResourceBalanceImpact must be a JSON object")
            val cash = json.decodeRequired<Int>(rawObject, "cash")
            val inboundPending = json.decodeRequired<Int>(rawObject, "inbound_pending")
            val outboundPending = json.decodeRequired<Int>(rawObject, "outbound_pending")
            return TreasuryTransactionsResourceBalanceImpact(
                cash = cash,
                inboundPending = inboundPending,
                outboundPending = outboundPending,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryTransactionsResourceBalanceImpact,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryTransactionsResourceBalanceImpact")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("cash", json.encodeToJsonElement(value.cash))
                    put("inbound_pending", json.encodeToJsonElement(value.inboundPending))
                    put("outbound_pending", json.encodeToJsonElement(value.outboundPending))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryTransactionsResourceBalanceImpact(
    block: TreasuryTransactionsResourceBalanceImpact.Builder.() -> Unit,
): TreasuryTransactionsResourceBalanceImpact = TreasuryTransactionsResourceBalanceImpact.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TreasuryTransactionsResourceBalanceImpact is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

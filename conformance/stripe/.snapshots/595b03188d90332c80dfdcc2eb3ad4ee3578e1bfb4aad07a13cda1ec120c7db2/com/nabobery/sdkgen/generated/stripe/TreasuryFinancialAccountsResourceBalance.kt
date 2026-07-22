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
import kotlin.collections.Map

/**
 * Balance information for the FinancialAccount
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_balance
 */
@Serializable(with = TreasuryFinancialAccountsResourceBalance.Serializer::class)
public class TreasuryFinancialAccountsResourceBalance(
    /**
     * Funds the user can spend right now.
     */
    public val cash: Map<String, Int>,
    /**
     * Funds not spendable yet, but will become available at a later time.
     */
    public val inboundPending: Map<String, Int>,
    /**
     * Funds in the account, but not spendable because they are being held for pending outbound flows.
     */
    public val outboundPending: Map<String, Int>,
) {
    public class Builder {
        private var cashValue: Map<String, Int>? = null

        public var cash: Map<String, Int>
            get() = requireNotNull(cashValue) { "cash is required" }
            set(`value`) {
                cashValue = value
            }

        private var inboundPendingValue: Map<String, Int>? = null

        public var inboundPending: Map<String, Int>
            get() = requireNotNull(inboundPendingValue) { "inboundPending is required" }
            set(`value`) {
                inboundPendingValue = value
            }

        private var outboundPendingValue: Map<String, Int>? = null

        public var outboundPending: Map<String, Int>
            get() = requireNotNull(outboundPendingValue) { "outboundPending is required" }
            set(`value`) {
                outboundPendingValue = value
            }

        public fun build(): TreasuryFinancialAccountsResourceBalance {
            check(cashValue != null) { "cash is required" }
            check(inboundPendingValue != null) { "inboundPending is required" }
            check(outboundPendingValue != null) { "outboundPending is required" }
            return TreasuryFinancialAccountsResourceBalance(
                cash = cash,
                inboundPending = inboundPending,
                outboundPending = outboundPending,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceBalance =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryFinancialAccountsResourceBalance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceBalance {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceBalance")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasuryFinancialAccountsResourceBalance must be a JSON object")
            val cash = json.decodeRequired<Map<String, Int>>(rawObject, "cash")
            val inboundPending = json.decodeRequired<Map<String, Int>>(rawObject, "inbound_pending")
            val outboundPending = json.decodeRequired<Map<String, Int>>(rawObject, "outbound_pending")
            return TreasuryFinancialAccountsResourceBalance(
                cash = cash,
                inboundPending = inboundPending,
                outboundPending = outboundPending,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryFinancialAccountsResourceBalance,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceBalance")
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

public fun treasuryFinancialAccountsResourceBalance(
    block: TreasuryFinancialAccountsResourceBalance.Builder.() -> Unit,
): TreasuryFinancialAccountsResourceBalance = TreasuryFinancialAccountsResourceBalance.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TreasuryFinancialAccountsResourceBalance is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

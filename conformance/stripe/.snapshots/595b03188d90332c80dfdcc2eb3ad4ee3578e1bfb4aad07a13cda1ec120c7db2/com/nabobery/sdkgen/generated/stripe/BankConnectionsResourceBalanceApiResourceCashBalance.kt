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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_balance_api_resource_cash_balance
 */
@Serializable(with = BankConnectionsResourceBalanceApiResourceCashBalance.Serializer::class)
public class BankConnectionsResourceBalanceApiResourceCashBalance(
    /**
     * The funds available to the account holder. Typically this is the current balance after subtracting any outbound
     * pending transactions and adding any inbound pending transactions.
     *
     * Each key is a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
     *
     * Each value is a integer amount. A positive amount indicates money owed to the account holder. A negative amount
     * indicates money owed by the account holder.
     */
    public val available: Map<String, Int>? = null,
) {
    public class Builder {
        /**
         * The funds available to the account holder. Typically this is the current balance after subtracting any outbound
         * pending transactions and adding any inbound pending transactions.
         *
         * Each key is a three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
         *
         * Each value is a integer amount. A positive amount indicates money owed to the account holder. A negative amount
         * indicates money owed by the account holder.
         */
        public var available: Map<String, Int>? = null

        public fun build(): BankConnectionsResourceBalanceApiResourceCashBalance =
            BankConnectionsResourceBalanceApiResourceCashBalance(
                available = available,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BankConnectionsResourceBalanceApiResourceCashBalance =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BankConnectionsResourceBalanceApiResourceCashBalance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BankConnectionsResourceBalanceApiResourceCashBalance {
            val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceBalanceApiResourceCashBalance")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "BankConnectionsResourceBalanceApiResourceCashBalance must be a JSON object",
                    )
            return BankConnectionsResourceBalanceApiResourceCashBalance(
                available =
                    rawObject["available"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, Int>?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BankConnectionsResourceBalanceApiResourceCashBalance,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceBalanceApiResourceCashBalance")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.available?.let { put("available", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun bankConnectionsResourceBalanceApiResourceCashBalance(
    block: BankConnectionsResourceBalanceApiResourceCashBalance.Builder.() -> Unit,
): BankConnectionsResourceBalanceApiResourceCashBalance =
    BankConnectionsResourceBalanceApiResourceCashBalance.build(block)

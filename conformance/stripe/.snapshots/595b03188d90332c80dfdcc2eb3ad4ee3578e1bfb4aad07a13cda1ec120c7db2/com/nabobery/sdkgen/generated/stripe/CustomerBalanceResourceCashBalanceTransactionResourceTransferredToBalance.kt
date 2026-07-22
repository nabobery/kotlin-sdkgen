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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_transfer
 * red_to_balance
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance(
    /**
     * The [Balance Transaction](https://docs.stripe.com/api/balance_transactions/object) that corresponds to funds
     * transferred to your Stripe balance.
     */
    public val balanceTransaction: InlineCustomerBalanceResou7c01BalanceTransactionX245622a8,
) {
    public class Builder {
        private var balanceTransactionValue: InlineCustomerBalanceResou7c01BalanceTransactionX245622a8? =
            null

        public var balanceTransaction: InlineCustomerBalanceResou7c01BalanceTransactionX245622a8
            get() = requireNotNull(balanceTransactionValue) { "balanceTransaction is required" }
            set(`value`) {
                balanceTransactionValue = value
            }

        public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance {
            check(balanceTransactionValue != null) { "balanceTransaction is required" }
            return CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance(
                balanceTransaction = balanceTransaction,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance must be a JSON object",
                    )
            val balanceTransaction =
                json.decodeRequired<InlineCustomerBalanceResou7c01BalanceTransactionX245622a8>(
                    rawObject,
                    "balance_transaction",
                )
            return CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance(
                balanceTransaction = balanceTransaction,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("balance_transaction", json.encodeToJsonElement(value.balanceTransaction))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerBalanceResourceCashBalanceTransactionResourceTransferredToBalance(
    block: CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance.Builder.() -> Unit,
): CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance =
    CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

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
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_adjusted
 * _for_overdraft
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft(
    /**
     * The [Balance Transaction](https://docs.stripe.com/api/balance_transactions/object) that corresponds to funds taken
     * out of your Stripe balance.
     */
    public val balanceTransaction: InlineCustomerBalanceResou7348BalanceTransactionX26d64799,
    /**
     * The [Cash Balance Transaction](https://docs.stripe.com/api/cash_balance_transactions/object) that brought the
     * customer balance negative, triggering the clawback of funds.
     */
    public val linkedTransaction: InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7,
) {
    public class Builder {
        private var balanceTransactionValue: InlineCustomerBalanceResou7348BalanceTransactionX26d64799? =
            null

        public var balanceTransaction: InlineCustomerBalanceResou7348BalanceTransactionX26d64799
            get() = requireNotNull(balanceTransactionValue) { "balanceTransaction is required" }
            set(`value`) {
                balanceTransactionValue = value
            }

        private var linkedTransactionValue: InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7? =
            null

        public var linkedTransaction: InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7
            get() = requireNotNull(linkedTransactionValue) { "linkedTransaction is required" }
            set(`value`) {
                linkedTransactionValue = value
            }

        public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft {
            check(balanceTransactionValue != null) { "balanceTransaction is required" }
            check(linkedTransactionValue != null) { "linkedTransaction is required" }
            return CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft(
                balanceTransaction = balanceTransaction,
                linkedTransaction = linkedTransaction,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft must be a JSON object",
                    )
            val balanceTransaction =
                json.decodeRequired<InlineCustomerBalanceResou7348BalanceTransactionX26d64799>(
                    rawObject,
                    "balance_transaction",
                )
            val linkedTransaction =
                json.decodeRequired<InlineCustomerBalanceResou7348LinkedTransactionXd7ab40d7>(
                    rawObject,
                    "linked_transaction",
                )
            return CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft(
                balanceTransaction = balanceTransaction,
                linkedTransaction = linkedTransaction,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("balance_transaction", json.encodeToJsonElement(value.balanceTransaction))
                    put("linked_transaction", json.encodeToJsonElement(value.linkedTransaction))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft(
    block: CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft.Builder.() -> Unit,
): CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft =
    CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

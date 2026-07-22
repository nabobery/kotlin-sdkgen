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
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction
 */
@Serializable(with = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction.Serializer::class)
public class CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction(
    public val bankTransfer: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer,
) {
    public class Builder {
        private var bankTransferValue:
            CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer? =
            null

        public var bankTransfer:
            CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer
            get() = requireNotNull(bankTransferValue) { "bankTransfer is required" }
            set(`value`) {
                bankTransferValue = value
            }

        public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction {
            check(bankTransferValue != null) { "bankTransfer is required" }
            return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction(
                bankTransfer = bankTransfer,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction must be a JSON object",
                    )
            val bankTransfer =
                json
                    .decodeRequired<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransfer>(
                        rawObject,
                        "bank_transfer",
                    )
            return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction(
                bankTransfer = bankTransfer,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("bank_transfer", json.encodeToJsonElement(value.bankTransfer))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerBalanceResourceCashBalanceTransactionResourceFundedTransaction(
    block: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction.Builder.() -> Unit,
): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction =
    CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

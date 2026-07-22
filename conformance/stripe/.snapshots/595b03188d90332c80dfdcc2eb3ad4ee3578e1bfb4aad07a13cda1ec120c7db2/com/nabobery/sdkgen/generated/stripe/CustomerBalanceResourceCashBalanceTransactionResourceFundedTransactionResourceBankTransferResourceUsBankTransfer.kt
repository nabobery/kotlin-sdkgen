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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction_resource_bank_transfer_resource_us_bank_transfer
 */
@Serializable(
    with = CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer.Serializer::class,
)
public class CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer(
    /**
     * The banking network used for this funding.
     */
    public val network: InlineCustomerBalanceResou92ceNetworkXf0248876? = null,
    /**
     * The full name of the sender, as supplied by the sending bank.
     */
    public val senderName: String? = null,
) {
    public class Builder {
        /**
         * The banking network used for this funding.
         */
        public var network: InlineCustomerBalanceResou92ceNetworkXf0248876? = null

        /**
         * The full name of the sender, as supplied by the sending bank.
         */
        public var senderName: String? = null

        public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer =
            CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer(
                network = network,
                senderName = senderName,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer must be a JSON object",
                    )
            return CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer(
                network =
                    rawObject["network"]?.let {
                        json
                            .decodeFromJsonElement<InlineCustomerBalanceResou92ceNetworkXf0248876>(
                                it,
                            )
                    },
                senderName =
                    rawObject["sender_name"]?.let { element ->
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
            `value`:
                CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.network?.let { put("network", json.encodeToJsonElement(it)) }
                    value.senderName?.let { put("sender_name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer(
    block:
        CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer.Builder.() -> Unit,
): CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer =
    CustomerBalanceResourceCashBalanceTransactionResourceFundedTransactionResourceBankTransferResourceUsBankTransfer
        .build(
            block,
        )

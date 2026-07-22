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
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_refunded
 * _from_payment_transaction
 */
@Serializable(
    with = CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction.Serializer::class,
)
public class CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction(
    /**
     * The [Refund](https://docs.stripe.com/api/refunds/object) that moved these funds into the customer's cash balance.
     */
    public val refund: InlineCustomerBalanceResou25beRefundX4da2b70c,
) {
    public class Builder {
        private var refundValue: InlineCustomerBalanceResou25beRefundX4da2b70c? = null

        public var refund: InlineCustomerBalanceResou25beRefundX4da2b70c
            get() = requireNotNull(refundValue) { "refund is required" }
            set(`value`) {
                refundValue = value
            }

        public fun build(): CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction {
            check(refundValue != null) { "refund is required" }
            return CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction(
                refund = refund,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction must be a JSON object",
                    )
            val refund = json.decodeRequired<InlineCustomerBalanceResou25beRefundX4da2b70c>(rawObject, "refund")
            return CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction(
                refund = refund,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("refund", json.encodeToJsonElement(value.refund))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun customerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction(
    block: CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction.Builder.() -> Unit,
): CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction =
    CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

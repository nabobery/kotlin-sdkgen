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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * A Transaction represents a real transaction that affects a Financial Connections Account balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.transaction
 */
@Serializable(with = FinancialConnectionsTransaction.Serializer::class)
public class FinancialConnectionsTransaction(
    /**
     * The ID of the Financial Connections Account this transaction belongs to.
     */
    public val account: String,
    /**
     * The amount of this transaction, in cents (or local equivalent).
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * The description of this transaction.
     */
    public val description: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineFinancialConnectionsTransactionObjectValueX76c5739e,
    /**
     * The status of the transaction.
     */
    public val status: InlineFinancialConnectionsTransactionStatusXa15a6333,
    public val statusTransitions: BankConnectionsResourceTransactionResourceStatusTransitions,
    /**
     * Time at which the transaction was transacted. Measured in seconds since the Unix epoch.
     */
    public val transactedAt: Int,
    /**
     * The token of the transaction refresh that last updated or created this transaction.
     */
    public val transactionRefresh: String,
    /**
     * Time at which the object was last updated. Measured in seconds since the Unix epoch.
     */
    public val updated: Int,
) {
    public class Builder {
        private var accountValue: String? = null

        public var account: String
            get() = requireNotNull(accountValue) { "account is required" }
            set(`value`) {
                accountValue = value
            }

        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var descriptionValue: String? = null

        public var description: String
            get() = requireNotNull(descriptionValue) { "description is required" }
            set(`value`) {
                descriptionValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineFinancialConnectionsTransactionObjectValueX76c5739e? = null

        public var objectValue: InlineFinancialConnectionsTransactionObjectValueX76c5739e
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statusValue: InlineFinancialConnectionsTransactionStatusXa15a6333? = null

        public var status: InlineFinancialConnectionsTransactionStatusXa15a6333
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var statusTransitionsValue: BankConnectionsResourceTransactionResourceStatusTransitions? =
            null

        public var statusTransitions: BankConnectionsResourceTransactionResourceStatusTransitions
            get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
            set(`value`) {
                statusTransitionsValue = value
            }

        private var transactedAtValue: Int? = null

        public var transactedAt: Int
            get() = requireNotNull(transactedAtValue) { "transactedAt is required" }
            set(`value`) {
                transactedAtValue = value
            }

        private var transactionRefreshValue: String? = null

        public var transactionRefresh: String
            get() = requireNotNull(transactionRefreshValue) { "transactionRefresh is required" }
            set(`value`) {
                transactionRefreshValue = value
            }

        private var updatedValue: Int? = null

        public var updated: Int
            get() = requireNotNull(updatedValue) { "updated is required" }
            set(`value`) {
                updatedValue = value
            }

        public fun build(): FinancialConnectionsTransaction {
            check(accountValue != null) { "account is required" }
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            check(descriptionValue != null) { "description is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statusValue != null) { "status is required" }
            check(statusTransitionsValue != null) { "statusTransitions is required" }
            check(transactedAtValue != null) { "transactedAt is required" }
            check(transactionRefreshValue != null) { "transactionRefresh is required" }
            check(updatedValue != null) { "updated is required" }
            return FinancialConnectionsTransaction(
                account = account,
                amount = amount,
                currency = currency,
                description = description,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                status = status,
                statusTransitions = statusTransitions,
                transactedAt = transactedAt,
                transactionRefresh = transactionRefresh,
                updated = updated,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): FinancialConnectionsTransaction = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<FinancialConnectionsTransaction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): FinancialConnectionsTransaction {
            val jsonDecoder = decoder.requireJsonDecoder("FinancialConnectionsTransaction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("FinancialConnectionsTransaction must be a JSON object")
            val account = json.decodeRequired<String>(rawObject, "account")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val description = json.decodeRequired<String>(rawObject, "description")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue =
                json.decodeRequired<InlineFinancialConnectionsTransactionObjectValueX76c5739e>(
                    rawObject,
                    "object",
                )
            val status = json.decodeRequired<InlineFinancialConnectionsTransactionStatusXa15a6333>(rawObject, "status")
            val statusTransitions =
                json.decodeRequired<BankConnectionsResourceTransactionResourceStatusTransitions>(
                    rawObject,
                    "status_transitions",
                )
            val transactedAt = json.decodeRequired<Int>(rawObject, "transacted_at")
            val transactionRefresh = json.decodeRequired<String>(rawObject, "transaction_refresh")
            val updated = json.decodeRequired<Int>(rawObject, "updated")
            return FinancialConnectionsTransaction(
                account = account,
                amount = amount,
                currency = currency,
                description = description,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                status = status,
                statusTransitions = statusTransitions,
                transactedAt = transactedAt,
                transactionRefresh = transactionRefresh,
                updated = updated,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: FinancialConnectionsTransaction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("FinancialConnectionsTransaction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account", value.account)
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    put("description", value.description)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("status", json.encodeToJsonElement(value.status))
                    put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
                    put("transacted_at", json.encodeToJsonElement(value.transactedAt))
                    put("transaction_refresh", value.transactionRefresh)
                    put("updated", json.encodeToJsonElement(value.updated))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun financialConnectionsTransaction(
    block: FinancialConnectionsTransaction.Builder.() -> Unit,
): FinancialConnectionsTransaction = FinancialConnectionsTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "FinancialConnectionsTransaction is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

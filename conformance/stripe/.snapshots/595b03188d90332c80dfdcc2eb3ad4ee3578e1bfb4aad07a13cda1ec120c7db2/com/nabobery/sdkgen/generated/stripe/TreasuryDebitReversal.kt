package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * You can reverse some [ReceivedDebits](https://api.stripe.com#received_debits) depending on their network and source
 * flow. Reversing a ReceivedDebit leads to the creation of a new object known as a DebitReversal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.debit_reversal
 */
@Serializable(with = TreasuryDebitReversal.Serializer::class)
public class TreasuryDebitReversal(
    /**
     * Amount (in cents) transferred.
     */
    public val amount: Int,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * The rails used to reverse the funds.
     */
    public val network: InlineTreasuryDebitReversalNetworkXcd9afabe,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineTreasuryDebitReversalObjectValueX1c7455c5,
    /**
     * The ReceivedDebit being reversed.
     */
    public val receivedDebit: String,
    /**
     * Status of the DebitReversal
     */
    public val status: InlineTreasuryDebitReversalStatusX1d772209,
    public val statusTransitions: TreasuryReceivedDebitsResourceStatusTransitions,
    /**
     * The FinancialAccount to reverse funds from.
     */
    public val financialAccount: String? = null,
    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public val hostedRegulatoryReceiptUrl: String? = null,
    /**
     * Other flows linked to a DebitReversal.
     */
    public val linkedFlows: InlineTreasuryDebitReversalLinkedFlowsX60b89939? = null,
    /**
     * The Transaction associated with this object.
     */
    public val transaction: InlineTreasuryDebitReversalTransactionX6d21296f? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
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

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var networkValue: InlineTreasuryDebitReversalNetworkXcd9afabe? = null

        public var network: InlineTreasuryDebitReversalNetworkXcd9afabe
            get() = requireNotNull(networkValue) { "network is required" }
            set(`value`) {
                networkValue = value
            }

        private var objectValueValue: InlineTreasuryDebitReversalObjectValueX1c7455c5? = null

        public var objectValue: InlineTreasuryDebitReversalObjectValueX1c7455c5
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var receivedDebitValue: String? = null

        public var receivedDebit: String
            get() = requireNotNull(receivedDebitValue) { "receivedDebit is required" }
            set(`value`) {
                receivedDebitValue = value
            }

        private var statusValue: InlineTreasuryDebitReversalStatusX1d772209? = null

        public var status: InlineTreasuryDebitReversalStatusX1d772209
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var statusTransitionsValue: TreasuryReceivedDebitsResourceStatusTransitions? = null

        public var statusTransitions: TreasuryReceivedDebitsResourceStatusTransitions
            get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
            set(`value`) {
                statusTransitionsValue = value
            }

        /**
         * The FinancialAccount to reverse funds from.
         */
        public var financialAccount: String? = null

        /**
         * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
         * provided when money movement is considered regulated under Stripe's money transmission licenses.
         */
        public var hostedRegulatoryReceiptUrl: String? = null

        /**
         * Other flows linked to a DebitReversal.
         */
        public var linkedFlows: InlineTreasuryDebitReversalLinkedFlowsX60b89939? = null

        /**
         * The Transaction associated with this object.
         */
        public var transaction: InlineTreasuryDebitReversalTransactionX6d21296f? = null

        public fun build(): TreasuryDebitReversal {
            check(amountValue != null) { "amount is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(networkValue != null) { "network is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(receivedDebitValue != null) { "receivedDebit is required" }
            check(statusValue != null) { "status is required" }
            check(statusTransitionsValue != null) { "statusTransitions is required" }
            return TreasuryDebitReversal(
                amount = amount,
                created = created,
                currency = currency,
                id = id,
                livemode = livemode,
                metadata = metadata,
                network = network,
                objectValue = objectValue,
                receivedDebit = receivedDebit,
                status = status,
                statusTransitions = statusTransitions,
                financialAccount = financialAccount,
                hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
                linkedFlows = linkedFlows,
                transaction = transaction,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryDebitReversal = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryDebitReversal> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryDebitReversal {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryDebitReversal")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasuryDebitReversal must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val network = json.decodeRequired<InlineTreasuryDebitReversalNetworkXcd9afabe>(rawObject, "network")
            val objectValue = json.decodeRequired<InlineTreasuryDebitReversalObjectValueX1c7455c5>(rawObject, "object")
            val receivedDebit = json.decodeRequired<String>(rawObject, "received_debit")
            val status = json.decodeRequired<InlineTreasuryDebitReversalStatusX1d772209>(rawObject, "status")
            val statusTransitions =
                json.decodeRequired<TreasuryReceivedDebitsResourceStatusTransitions>(
                    rawObject,
                    "status_transitions",
                )
            return TreasuryDebitReversal(
                amount = amount,
                created = created,
                currency = currency,
                id = id,
                livemode = livemode,
                metadata = metadata,
                network = network,
                objectValue = objectValue,
                receivedDebit = receivedDebit,
                status = status,
                statusTransitions = statusTransitions,
                financialAccount =
                    rawObject["financial_account"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                hostedRegulatoryReceiptUrl =
                    rawObject["hosted_regulatory_receipt_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                linkedFlows =
                    rawObject["linked_flows"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTreasuryDebitReversalLinkedFlowsX60b89939?>(element)
                        }
                    },
                transaction =
                    rawObject["transaction"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTreasuryDebitReversalTransactionX6d21296f?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryDebitReversal,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryDebitReversal")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("network", json.encodeToJsonElement(value.network))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("received_debit", value.receivedDebit)
                    put("status", json.encodeToJsonElement(value.status))
                    put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
                    value.financialAccount?.let { put("financial_account", it) }
                    value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
                    value.linkedFlows?.let { put("linked_flows", json.encodeToJsonElement(it)) }
                    value.transaction?.let { put("transaction", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryDebitReversal(block: TreasuryDebitReversal.Builder.() -> Unit): TreasuryDebitReversal =
    TreasuryDebitReversal.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("TreasuryDebitReversal is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

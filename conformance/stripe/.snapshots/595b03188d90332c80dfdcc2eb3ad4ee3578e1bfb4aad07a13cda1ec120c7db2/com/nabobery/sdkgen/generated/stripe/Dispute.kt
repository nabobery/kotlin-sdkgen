package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.collections.List
import kotlin.collections.Map

@Serializable
public data class DisputeView(
    public val amount: Int,
    @SerialName("balance_transactions")
    public val balanceTransactions: List<BalanceTransaction>,
    public val charge: InlineDisputeChargeX166bce05,
    public val created: Int,
    public val currency: String,
    @SerialName("enhanced_eligibility_types")
    public val enhancedEligibilityTypes: List<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02>,
    public val evidence: DisputeEvidence,
    @SerialName("evidence_details")
    public val evidenceDetails: DisputeEvidenceDetails,
    public val id: String,
    @SerialName("is_charge_refundable")
    public val isChargeRefundable: Boolean,
    public val livemode: Boolean,
    public val metadata: Map<String, String>,
    @SerialName("object")
    public val objectValue: InlineDisputeObjectValueX8c08bfde,
    @SerialName("payment_intent")
    public val paymentIntent: InlineDisputePaymentIntentXbb1e9cd4? = null,
    @SerialName("payment_method_details")
    public val paymentMethodDetails: DisputePaymentMethodDetails? = null,
    public val reason: String,
    public val status: InlineDisputeStatusXfc9cfb04,
)

/**
 * A dispute occurs when a customer questions your charge with their card issuer.
 * When this happens, you have the opportunity to respond to the dispute with
 * evidence that shows that the charge is legitimate.
 *
 * Related guide: [Disputes and fraud](https://docs.stripe.com/disputes)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute
 */
@Serializable(with = Dispute.Serializer::class)
public class Dispute(
    /**
     * Disputed amount. Usually the amount of the charge, but it can differ (usually because of currency fluctuation or
     * because only part of the order is disputed).
     */
    public val amount: Int,
    balanceTransactions: List<BalanceTransaction>,
    /**
     * ID of the charge that's disputed.
     */
    public val charge: InlineDisputeChargeX166bce05,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    enhancedEligibilityTypes: List<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02>,
    public val evidence: DisputeEvidence,
    public val evidenceDetails: DisputeEvidenceDetails,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If true, it's still possible to refund the disputed payment. After the payment has been fully refunded, no further
     * funds are withdrawn from your Stripe account as a result of this dispute.
     */
    public val isChargeRefundable: Boolean,
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
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineDisputeObjectValueX8c08bfde,
    /**
     * Reason given by cardholder for dispute. Possible values are `bank_cannot_process`, `check_returned`,
     * `credit_not_processed`, `customer_initiated`, `debit_not_authorized`, `duplicate`, `fraudulent`, `general`,
     * `incorrect_account_details`, `insufficient_funds`, `noncompliant`, `product_not_received`, `product_unacceptable`,
     * `subscription_canceled`, or `unrecognized`. Learn more about [dispute
     * reasons](https://docs.stripe.com/disputes/categories).
     */
    public val reason: String,
    /**
     * The current status of a dispute. Possible values include:`warning_needs_response`, `warning_under_review`,
     * `warning_closed`, `needs_response`, `under_review`, `won`, `lost`, or `prevented`.
     */
    public val status: InlineDisputeStatusXfc9cfb04,
    /**
     * ID of the PaymentIntent that's disputed.
     */
    public val paymentIntent: InlineDisputePaymentIntentXbb1e9cd4? = null,
    public val paymentMethodDetails: DisputePaymentMethodDetails? = null,
) {
    /**
     * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your Stripe account as a
     * result of this dispute.
     */
    public val balanceTransactions: List<BalanceTransaction> = balanceTransactions.toList()

    /**
     * List of eligibility types that are included in `enhanced_evidence`.
     */
    public val enhancedEligibilityTypes: List<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02> =
        enhancedEligibilityTypes.toList()

    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var balanceTransactionsValue: List<BalanceTransaction>? = null

        public var balanceTransactions: List<BalanceTransaction>
            get() = requireNotNull(balanceTransactionsValue) { "balanceTransactions is required" }
            set(`value`) {
                balanceTransactionsValue = value
            }

        private var chargeValue: InlineDisputeChargeX166bce05? = null

        public var charge: InlineDisputeChargeX166bce05
            get() = requireNotNull(chargeValue) { "charge is required" }
            set(`value`) {
                chargeValue = value
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

        private var enhancedEligibilityTypesValue:
            List<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02>? = null

        public var enhancedEligibilityTypes: List<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02>
            get() = requireNotNull(enhancedEligibilityTypesValue) { "enhancedEligibilityTypes is required" }
            set(`value`) {
                enhancedEligibilityTypesValue = value
            }

        private var evidenceValue: DisputeEvidence? = null

        public var evidence: DisputeEvidence
            get() = requireNotNull(evidenceValue) { "evidence is required" }
            set(`value`) {
                evidenceValue = value
            }

        private var evidenceDetailsValue: DisputeEvidenceDetails? = null

        public var evidenceDetails: DisputeEvidenceDetails
            get() = requireNotNull(evidenceDetailsValue) { "evidenceDetails is required" }
            set(`value`) {
                evidenceDetailsValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var isChargeRefundableValue: Boolean? = null

        public var isChargeRefundable: Boolean
            get() = requireNotNull(isChargeRefundableValue) { "isChargeRefundable is required" }
            set(`value`) {
                isChargeRefundableValue = value
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

        private var objectValueValue: InlineDisputeObjectValueX8c08bfde? = null

        public var objectValue: InlineDisputeObjectValueX8c08bfde
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var reasonValue: String? = null

        public var reason: String
            get() = requireNotNull(reasonValue) { "reason is required" }
            set(`value`) {
                reasonValue = value
            }

        private var statusValue: InlineDisputeStatusXfc9cfb04? = null

        public var status: InlineDisputeStatusXfc9cfb04
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * ID of the PaymentIntent that's disputed.
         */
        public var paymentIntent: InlineDisputePaymentIntentXbb1e9cd4? = null

        public var paymentMethodDetails: DisputePaymentMethodDetails? = null

        public fun build(): Dispute {
            check(amountValue != null) { "amount is required" }
            check(balanceTransactionsValue != null) { "balanceTransactions is required" }
            check(chargeValue != null) { "charge is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(enhancedEligibilityTypesValue != null) { "enhancedEligibilityTypes is required" }
            check(evidenceValue != null) { "evidence is required" }
            check(evidenceDetailsValue != null) { "evidenceDetails is required" }
            check(idValue != null) { "id is required" }
            check(isChargeRefundableValue != null) { "isChargeRefundable is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(reasonValue != null) { "reason is required" }
            check(statusValue != null) { "status is required" }
            return Dispute(
                amount = amount,
                balanceTransactions = balanceTransactions,
                charge = charge,
                created = created,
                currency = currency,
                enhancedEligibilityTypes = enhancedEligibilityTypes,
                evidence = evidence,
                evidenceDetails = evidenceDetails,
                id = id,
                isChargeRefundable = isChargeRefundable,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                reason = reason,
                status = status,
                paymentIntent = paymentIntent,
                paymentMethodDetails = paymentMethodDetails,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): Dispute = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<Dispute> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): Dispute {
            val jsonDecoder = decoder.requireJsonDecoder("Dispute")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("Dispute must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val balanceTransactions = json.decodeRequired<List<BalanceTransaction>>(rawObject, "balance_transactions")
            val charge = json.decodeRequired<InlineDisputeChargeX166bce05>(rawObject, "charge")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val enhancedEligibilityTypes =
                json.decodeRequired<List<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02>>(
                    rawObject,
                    "enhanced_eligibility_types",
                )
            val evidence = json.decodeRequired<DisputeEvidence>(rawObject, "evidence")
            val evidenceDetails = json.decodeRequired<DisputeEvidenceDetails>(rawObject, "evidence_details")
            val id = json.decodeRequired<String>(rawObject, "id")
            val isChargeRefundable = json.decodeRequired<Boolean>(rawObject, "is_charge_refundable")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue = json.decodeRequired<InlineDisputeObjectValueX8c08bfde>(rawObject, "object")
            val reason = json.decodeRequired<String>(rawObject, "reason")
            val status = json.decodeRequired<InlineDisputeStatusXfc9cfb04>(rawObject, "status")
            return Dispute(
                amount = amount,
                balanceTransactions = balanceTransactions,
                charge = charge,
                created = created,
                currency = currency,
                enhancedEligibilityTypes = enhancedEligibilityTypes,
                evidence = evidence,
                evidenceDetails = evidenceDetails,
                id = id,
                isChargeRefundable = isChargeRefundable,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                reason = reason,
                status = status,
                paymentIntent =
                    rawObject["payment_intent"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputePaymentIntentXbb1e9cd4?>(element)
                        }
                    },
                paymentMethodDetails =
                    rawObject["payment_method_details"]?.let {
                        json.decodeFromJsonElement<DisputePaymentMethodDetails>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: Dispute,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("Dispute")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("balance_transactions", json.encodeToJsonElement(value.balanceTransactions))
                    put("charge", json.encodeToJsonElement(value.charge))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("enhanced_eligibility_types", json.encodeToJsonElement(value.enhancedEligibilityTypes))
                    put("evidence", json.encodeToJsonElement(value.evidence))
                    put("evidence_details", json.encodeToJsonElement(value.evidenceDetails))
                    put("id", value.id)
                    put("is_charge_refundable", json.encodeToJsonElement(value.isChargeRefundable))
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("reason", value.reason)
                    put("status", json.encodeToJsonElement(value.status))
                    value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
                    value.paymentMethodDetails?.let { put("payment_method_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun dispute(block: Dispute.Builder.() -> Unit): Dispute = Dispute.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("Dispute is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

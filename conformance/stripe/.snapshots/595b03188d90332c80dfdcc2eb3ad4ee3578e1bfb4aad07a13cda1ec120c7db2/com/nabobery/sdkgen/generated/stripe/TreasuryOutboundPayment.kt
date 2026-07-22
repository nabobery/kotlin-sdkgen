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
 * Use
 * [OutboundPayments](https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-payments) to
 * send funds to another party's external bank account or [FinancialAccount](https://api.stripe.com#financial_accounts).
 * To send money to an account belonging to the same user, use an
 * [OutboundTransfer](https://api.stripe.com#outbound_transfers).
 *
 * Simulate OutboundPayment state changes with the `/v1/test_helpers/treasury/outbound_payments` endpoints. These
 * methods can only be called on test mode objects.
 *
 * Related guide: [Moving money with Treasury using OutboundPayment
 * objects](https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-payments)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment
 */
@Serializable(with = TreasuryOutboundPayment.Serializer::class)
public class TreasuryOutboundPayment(
    /**
     * Amount (in cents) transferred.
     */
    public val amount: Int,
    /**
     * Returns `true` if the object can be canceled, and `false` otherwise.
     */
    public val cancelable: Boolean,
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
     * The date when funds are expected to arrive in the destination account.
     */
    public val expectedArrivalDate: Int,
    /**
     * The FinancialAccount that funds were pulled from.
     */
    public val financialAccount: String,
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
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineTreasuryOutboundPaymentObjectValueX17c509e1,
    /**
     * The description that appears on the receiving end for an OutboundPayment (for example, bank statement for external
     * bank transfer).
     */
    public val statementDescriptor: String,
    /**
     * Current status of the OutboundPayment: `processing`, `failed`, `posted`, `returned`, `canceled`. An OutboundPayment
     * is `processing` if it has been created and is pending. The status changes to `posted` once the OutboundPayment has
     * been "confirmed" and funds have left the account, or to `failed` or `canceled`. If an OutboundPayment fails to
     * arrive at its destination, its status will change to `returned`.
     */
    public val status: InlineTreasuryOutboundPaymentStatusXbfec6c1d,
    public val statusTransitions: TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions,
    /**
     * The Transaction associated with this object.
     */
    public val transaction: InlineTreasuryOutboundPaymentTransactionXdbbd9cc7,
    /**
     * ID of the [customer](https://docs.stripe.com/api/customers) to whom an OutboundPayment is sent.
     */
    public val customer: String? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * The PaymentMethod via which an OutboundPayment is sent. This field can be empty if the OutboundPayment was created
     * using `destination_payment_method_data`.
     */
    public val destinationPaymentMethod: String? = null,
    /**
     * Details about the PaymentMethod for an OutboundPayment.
     */
    public val destinationPaymentMethodDetails:
        InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d? = null,
    /**
     * Details about the end user.
     */
    public val endUserDetails: InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf? = null,
    /**
     * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
     * provided when money movement is considered regulated under Stripe's money transmission licenses.
     */
    public val hostedRegulatoryReceiptUrl: String? = null,
    /**
     * Details about a returned OutboundPayment. Only set when the status is `returned`.
     */
    public val returnedDetails: InlineTreasuryOutboundPaymentReturnedDetailsX599a78af? = null,
    /**
     * Details about network-specific tracking information if available.
     */
    public val trackingDetails: InlineTreasuryOutboundPaymentTrackingDetailsX7d731848? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var cancelableValue: Boolean? = null

        public var cancelable: Boolean
            get() = requireNotNull(cancelableValue) { "cancelable is required" }
            set(`value`) {
                cancelableValue = value
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

        private var expectedArrivalDateValue: Int? = null

        public var expectedArrivalDate: Int
            get() = requireNotNull(expectedArrivalDateValue) { "expectedArrivalDate is required" }
            set(`value`) {
                expectedArrivalDateValue = value
            }

        private var financialAccountValue: String? = null

        public var financialAccount: String
            get() = requireNotNull(financialAccountValue) { "financialAccount is required" }
            set(`value`) {
                financialAccountValue = value
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

        private var objectValueValue: InlineTreasuryOutboundPaymentObjectValueX17c509e1? = null

        public var objectValue: InlineTreasuryOutboundPaymentObjectValueX17c509e1
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var statementDescriptorValue: String? = null

        public var statementDescriptor: String
            get() = requireNotNull(statementDescriptorValue) { "statementDescriptor is required" }
            set(`value`) {
                statementDescriptorValue = value
            }

        private var statusValue: InlineTreasuryOutboundPaymentStatusXbfec6c1d? = null

        public var status: InlineTreasuryOutboundPaymentStatusXbfec6c1d
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var statusTransitionsValue:
            TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions? = null

        public var statusTransitions:
            TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions
            get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
            set(`value`) {
                statusTransitionsValue = value
            }

        private var transactionValue: InlineTreasuryOutboundPaymentTransactionXdbbd9cc7? = null

        public var transaction: InlineTreasuryOutboundPaymentTransactionXdbbd9cc7
            get() = requireNotNull(transactionValue) { "transaction is required" }
            set(`value`) {
                transactionValue = value
            }

        /**
         * ID of the [customer](https://docs.stripe.com/api/customers) to whom an OutboundPayment is sent.
         */
        public var customer: String? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * The PaymentMethod via which an OutboundPayment is sent. This field can be empty if the OutboundPayment was
         * created using `destination_payment_method_data`.
         */
        public var destinationPaymentMethod: String? = null

        /**
         * Details about the PaymentMethod for an OutboundPayment.
         */
        public var destinationPaymentMethodDetails:
            InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d? = null

        /**
         * Details about the end user.
         */
        public var endUserDetails: InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf? = null

        /**
         * A [hosted transaction receipt](https://docs.stripe.com/treasury/moving-money/regulatory-receipts) URL that is
         * provided when money movement is considered regulated under Stripe's money transmission licenses.
         */
        public var hostedRegulatoryReceiptUrl: String? = null

        /**
         * Details about a returned OutboundPayment. Only set when the status is `returned`.
         */
        public var returnedDetails: InlineTreasuryOutboundPaymentReturnedDetailsX599a78af? = null

        /**
         * Details about network-specific tracking information if available.
         */
        public var trackingDetails: InlineTreasuryOutboundPaymentTrackingDetailsX7d731848? = null

        public fun build(): TreasuryOutboundPayment {
            check(amountValue != null) { "amount is required" }
            check(cancelableValue != null) { "cancelable is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(expectedArrivalDateValue != null) { "expectedArrivalDate is required" }
            check(financialAccountValue != null) { "financialAccount is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(statementDescriptorValue != null) { "statementDescriptor is required" }
            check(statusValue != null) { "status is required" }
            check(statusTransitionsValue != null) { "statusTransitions is required" }
            check(transactionValue != null) { "transaction is required" }
            return TreasuryOutboundPayment(
                amount = amount,
                cancelable = cancelable,
                created = created,
                currency = currency,
                expectedArrivalDate = expectedArrivalDate,
                financialAccount = financialAccount,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                statementDescriptor = statementDescriptor,
                status = status,
                statusTransitions = statusTransitions,
                transaction = transaction,
                customer = customer,
                description = description,
                destinationPaymentMethod = destinationPaymentMethod,
                destinationPaymentMethodDetails = destinationPaymentMethodDetails,
                endUserDetails = endUserDetails,
                hostedRegulatoryReceiptUrl = hostedRegulatoryReceiptUrl,
                returnedDetails = returnedDetails,
                trackingDetails = trackingDetails,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryOutboundPayment = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryOutboundPayment> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryOutboundPayment {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundPayment")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasuryOutboundPayment must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val cancelable = json.decodeRequired<Boolean>(rawObject, "cancelable")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val expectedArrivalDate = json.decodeRequired<Int>(rawObject, "expected_arrival_date")
            val financialAccount = json.decodeRequired<String>(rawObject, "financial_account")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue =
                json.decodeRequired<InlineTreasuryOutboundPaymentObjectValueX17c509e1>(
                    rawObject,
                    "object",
                )
            val statementDescriptor = json.decodeRequired<String>(rawObject, "statement_descriptor")
            val status = json.decodeRequired<InlineTreasuryOutboundPaymentStatusXbfec6c1d>(rawObject, "status")
            val statusTransitions =
                json
                    .decodeRequired<TreasuryOutboundPaymentsResourceOutboundPaymentResourceStatusTransitions>(
                        rawObject,
                        "status_transitions",
                    )
            val transaction =
                json.decodeRequired<InlineTreasuryOutboundPaymentTransactionXdbbd9cc7>(
                    rawObject,
                    "transaction",
                )
            return TreasuryOutboundPayment(
                amount = amount,
                cancelable = cancelable,
                created = created,
                currency = currency,
                expectedArrivalDate = expectedArrivalDate,
                financialAccount = financialAccount,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                statementDescriptor = statementDescriptor,
                status = status,
                statusTransitions = statusTransitions,
                transaction = transaction,
                customer =
                    rawObject["customer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                destinationPaymentMethod =
                    rawObject["destination_payment_method"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                destinationPaymentMethodDetails =
                    rawObject["destination_payment_method_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineTreasuryOutboundPaymentDestinationPaymentMethodDetailsX5cf24d5d?>(
                                    element,
                                )
                        }
                    },
                endUserDetails =
                    rawObject["end_user_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTreasuryOutboundPaymentEndUserDetailsX33dd7caf?>(element)
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
                returnedDetails =
                    rawObject["returned_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTreasuryOutboundPaymentReturnedDetailsX599a78af?>(element)
                        }
                    },
                trackingDetails =
                    rawObject["tracking_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTreasuryOutboundPaymentTrackingDetailsX7d731848?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryOutboundPayment,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundPayment")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("cancelable", json.encodeToJsonElement(value.cancelable))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("expected_arrival_date", json.encodeToJsonElement(value.expectedArrivalDate))
                    put("financial_account", value.financialAccount)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("statement_descriptor", value.statementDescriptor)
                    put("status", json.encodeToJsonElement(value.status))
                    put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
                    put("transaction", json.encodeToJsonElement(value.transaction))
                    value.customer?.let { put("customer", it) }
                    value.description?.let { put("description", it) }
                    value.destinationPaymentMethod?.let { put("destination_payment_method", it) }
                    value.destinationPaymentMethodDetails?.let {
                        put(
                            "destination_payment_method_details",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.endUserDetails?.let { put("end_user_details", json.encodeToJsonElement(it)) }
                    value.hostedRegulatoryReceiptUrl?.let { put("hosted_regulatory_receipt_url", it) }
                    value.returnedDetails?.let { put("returned_details", json.encodeToJsonElement(it)) }
                    value.trackingDetails?.let { put("tracking_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryOutboundPayment(block: TreasuryOutboundPayment.Builder.() -> Unit): TreasuryOutboundPayment =
    TreasuryOutboundPayment.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("TreasuryOutboundPayment is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

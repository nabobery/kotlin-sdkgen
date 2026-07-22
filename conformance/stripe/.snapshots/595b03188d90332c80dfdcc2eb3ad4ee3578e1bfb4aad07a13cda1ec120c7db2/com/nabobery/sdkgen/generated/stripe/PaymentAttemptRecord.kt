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
 * A Payment Attempt Record represents an individual attempt at making a payment, on or off Stripe.
 * Each payment attempt tries to collect a fixed amount of money from a fixed customer and payment
 * method. Payment Attempt Records are attached to Payment Records. Only one attempt per Payment Record
 * can have guaranteed funds.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_attempt_record
 */
@Serializable(with = PaymentAttemptRecord.Serializer::class)
public class PaymentAttemptRecord(
    public val amount: PaymentsPrimitivesPaymentRecordsResourceAmount,
    public val amountAuthorized: PaymentsPrimitivesPaymentRecordsResourceAmount,
    public val amountCanceled: PaymentsPrimitivesPaymentRecordsResourceAmount,
    public val amountFailed: PaymentsPrimitivesPaymentRecordsResourceAmount,
    public val amountGuaranteed: PaymentsPrimitivesPaymentRecordsResourceAmount,
    public val amountRefunded: PaymentsPrimitivesPaymentRecordsResourceAmount,
    public val amountRequested: PaymentsPrimitivesPaymentRecordsResourceAmount,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
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
    public val objectValue: InlinePaymentAttemptRecordObjectValueX18eafefa,
    public val processorDetails: PaymentsPrimitivesPaymentRecordsResourceProcessorDetails,
    /**
     * Indicates who reported the payment.
     */
    public val reportedBy: InlinePaymentAttemptRecordReportedByXb8d2c634,
    /**
     * ID of the Connect application that created the PaymentAttemptRecord.
     */
    public val application: String? = null,
    /**
     * Customer information for this payment.
     */
    public val customerDetails: InlinePaymentAttemptRecordCustomerDetailsXdfa20698? = null,
    /**
     * Indicates whether the customer was present in your checkout flow during this payment.
     */
    public val customerPresence: InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Information about the Payment Method debited for this payment.
     */
    public val paymentMethodDetails: InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3? = null,
    /**
     * ID of the Payment Record this Payment Attempt Record belongs to.
     */
    public val paymentRecord: String? = null,
    /**
     * Shipping information for this payment.
     */
    public val shippingDetails: InlinePaymentAttemptRecordShippingDetailsX2365fd11? = null,
) {
    public class Builder {
        private var amountValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amount: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var amountAuthorizedValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amountAuthorized: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountAuthorizedValue) { "amountAuthorized is required" }
            set(`value`) {
                amountAuthorizedValue = value
            }

        private var amountCanceledValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amountCanceled: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountCanceledValue) { "amountCanceled is required" }
            set(`value`) {
                amountCanceledValue = value
            }

        private var amountFailedValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amountFailed: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountFailedValue) { "amountFailed is required" }
            set(`value`) {
                amountFailedValue = value
            }

        private var amountGuaranteedValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amountGuaranteed: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountGuaranteedValue) { "amountGuaranteed is required" }
            set(`value`) {
                amountGuaranteedValue = value
            }

        private var amountRefundedValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amountRefunded: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountRefundedValue) { "amountRefunded is required" }
            set(`value`) {
                amountRefundedValue = value
            }

        private var amountRequestedValue: PaymentsPrimitivesPaymentRecordsResourceAmount? = null

        public var amountRequested: PaymentsPrimitivesPaymentRecordsResourceAmount
            get() = requireNotNull(amountRequestedValue) { "amountRequested is required" }
            set(`value`) {
                amountRequestedValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
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

        private var objectValueValue: InlinePaymentAttemptRecordObjectValueX18eafefa? = null

        public var objectValue: InlinePaymentAttemptRecordObjectValueX18eafefa
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var processorDetailsValue: PaymentsPrimitivesPaymentRecordsResourceProcessorDetails? =
            null

        public var processorDetails: PaymentsPrimitivesPaymentRecordsResourceProcessorDetails
            get() = requireNotNull(processorDetailsValue) { "processorDetails is required" }
            set(`value`) {
                processorDetailsValue = value
            }

        private var reportedByValue: InlinePaymentAttemptRecordReportedByXb8d2c634? = null

        public var reportedBy: InlinePaymentAttemptRecordReportedByXb8d2c634
            get() = requireNotNull(reportedByValue) { "reportedBy is required" }
            set(`value`) {
                reportedByValue = value
            }

        /**
         * ID of the Connect application that created the PaymentAttemptRecord.
         */
        public var application: String? = null

        /**
         * Customer information for this payment.
         */
        public var customerDetails: InlinePaymentAttemptRecordCustomerDetailsXdfa20698? = null

        /**
         * Indicates whether the customer was present in your checkout flow during this payment.
         */
        public var customerPresence: InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Information about the Payment Method debited for this payment.
         */
        public var paymentMethodDetails: InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3? = null

        /**
         * ID of the Payment Record this Payment Attempt Record belongs to.
         */
        public var paymentRecord: String? = null

        /**
         * Shipping information for this payment.
         */
        public var shippingDetails: InlinePaymentAttemptRecordShippingDetailsX2365fd11? = null

        public fun build(): PaymentAttemptRecord {
            check(amountValue != null) { "amount is required" }
            check(amountAuthorizedValue != null) { "amountAuthorized is required" }
            check(amountCanceledValue != null) { "amountCanceled is required" }
            check(amountFailedValue != null) { "amountFailed is required" }
            check(amountGuaranteedValue != null) { "amountGuaranteed is required" }
            check(amountRefundedValue != null) { "amountRefunded is required" }
            check(amountRequestedValue != null) { "amountRequested is required" }
            check(createdValue != null) { "created is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(processorDetailsValue != null) { "processorDetails is required" }
            check(reportedByValue != null) { "reportedBy is required" }
            return PaymentAttemptRecord(
                amount = amount,
                amountAuthorized = amountAuthorized,
                amountCanceled = amountCanceled,
                amountFailed = amountFailed,
                amountGuaranteed = amountGuaranteed,
                amountRefunded = amountRefunded,
                amountRequested = amountRequested,
                created = created,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                processorDetails = processorDetails,
                reportedBy = reportedBy,
                application = application,
                customerDetails = customerDetails,
                customerPresence = customerPresence,
                description = description,
                paymentMethodDetails = paymentMethodDetails,
                paymentRecord = paymentRecord,
                shippingDetails = shippingDetails,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentAttemptRecord = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentAttemptRecord> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentAttemptRecord {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentAttemptRecord")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentAttemptRecord must be a JSON object")
            val amount = json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(rawObject, "amount")
            val amountAuthorized =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(
                    rawObject,
                    "amount_authorized",
                )
            val amountCanceled =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(
                    rawObject,
                    "amount_canceled",
                )
            val amountFailed =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(
                    rawObject,
                    "amount_failed",
                )
            val amountGuaranteed =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(
                    rawObject,
                    "amount_guaranteed",
                )
            val amountRefunded =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(
                    rawObject,
                    "amount_refunded",
                )
            val amountRequested =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceAmount>(
                    rawObject,
                    "amount_requested",
                )
            val created = json.decodeRequired<Int>(rawObject, "created")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue = json.decodeRequired<InlinePaymentAttemptRecordObjectValueX18eafefa>(rawObject, "object")
            val processorDetails =
                json.decodeRequired<PaymentsPrimitivesPaymentRecordsResourceProcessorDetails>(
                    rawObject,
                    "processor_details",
                )
            val reportedBy =
                json.decodeRequired<InlinePaymentAttemptRecordReportedByXb8d2c634>(
                    rawObject,
                    "reported_by",
                )
            return PaymentAttemptRecord(
                amount = amount,
                amountAuthorized = amountAuthorized,
                amountCanceled = amountCanceled,
                amountFailed = amountFailed,
                amountGuaranteed = amountGuaranteed,
                amountRefunded = amountRefunded,
                amountRequested = amountRequested,
                created = created,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                processorDetails = processorDetails,
                reportedBy = reportedBy,
                application =
                    rawObject["application"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerDetails =
                    rawObject["customer_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentAttemptRecordCustomerDetailsXdfa20698?>(element)
                        }
                    },
                customerPresence =
                    rawObject["customer_presence"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentAttemptRecordCustomerPresenceX8fdd03e0?>(element)
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
                paymentMethodDetails =
                    rawObject["payment_method_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3?>(
                                element,
                            )
                        }
                    },
                paymentRecord =
                    rawObject["payment_record"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                shippingDetails =
                    rawObject["shipping_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentAttemptRecordShippingDetailsX2365fd11?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentAttemptRecord,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentAttemptRecord")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("amount_authorized", json.encodeToJsonElement(value.amountAuthorized))
                    put("amount_canceled", json.encodeToJsonElement(value.amountCanceled))
                    put("amount_failed", json.encodeToJsonElement(value.amountFailed))
                    put("amount_guaranteed", json.encodeToJsonElement(value.amountGuaranteed))
                    put("amount_refunded", json.encodeToJsonElement(value.amountRefunded))
                    put("amount_requested", json.encodeToJsonElement(value.amountRequested))
                    put("created", json.encodeToJsonElement(value.created))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("processor_details", json.encodeToJsonElement(value.processorDetails))
                    put("reported_by", json.encodeToJsonElement(value.reportedBy))
                    value.application?.let { put("application", it) }
                    value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
                    value.customerPresence?.let { put("customer_presence", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.paymentMethodDetails?.let { put("payment_method_details", json.encodeToJsonElement(it)) }
                    value.paymentRecord?.let { put("payment_record", it) }
                    value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentAttemptRecord(block: PaymentAttemptRecord.Builder.() -> Unit): PaymentAttemptRecord =
    PaymentAttemptRecord.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("PaymentAttemptRecord is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

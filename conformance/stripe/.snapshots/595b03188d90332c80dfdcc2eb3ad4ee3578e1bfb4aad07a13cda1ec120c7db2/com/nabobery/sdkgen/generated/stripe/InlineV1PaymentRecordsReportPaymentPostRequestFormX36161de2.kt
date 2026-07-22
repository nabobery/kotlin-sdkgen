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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2(
    /**
     * The amount you initially requested for this payment.
     */
    public val amountRequested: InlineV1PaymentRecordsReportPaymentPostRequestFormAmountRequestedX755a383d,
    /**
     * When the reported payment was initiated. Measured in seconds since the Unix epoch.
     */
    public val initiatedAt: Int,
    /**
     * Information about the Payment Method debited for this payment.
     */
    public val paymentMethodDetails: InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9,
    /**
     * Customer information for this payment.
     */
    public val customerDetails: InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerDetailsX724b1073? = null,
    /**
     * Indicates whether the customer was present in your checkout flow during this payment.
     */
    public val customerPresence: InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357? = null,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Information about the payment attempt failure.
     */
    public val failed: InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037? = null,
    /**
     * Information about the payment attempt guarantee.
     */
    public val guaranteed: InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded? = null,
    /**
     * The outcome of the reported payment.
     */
    public val outcome: InlineV1PaymentRecordsReportPaymentPostRequestFormOutcomeX2e14d97f? = null,
    /**
     * Processor information for this payment.
     */
    public val processorDetails: InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a? = null,
    /**
     * Shipping information for this payment.
     */
    public val shippingDetails: InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a? = null,
) {
    public class Builder {
        private var amountRequestedValue:
            InlineV1PaymentRecordsReportPaymentPostRequestFormAmountRequestedX755a383d? = null

        public var amountRequested:
            InlineV1PaymentRecordsReportPaymentPostRequestFormAmountRequestedX755a383d
            get() = requireNotNull(amountRequestedValue) { "amountRequested is required" }
            set(`value`) {
                amountRequestedValue = value
            }

        private var initiatedAtValue: Int? = null

        public var initiatedAt: Int
            get() = requireNotNull(initiatedAtValue) { "initiatedAt is required" }
            set(`value`) {
                initiatedAtValue = value
            }

        private var paymentMethodDetailsValue:
            InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9? = null

        public var paymentMethodDetails:
            InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9
            get() = requireNotNull(paymentMethodDetailsValue) { "paymentMethodDetails is required" }
            set(`value`) {
                paymentMethodDetailsValue = value
            }

        /**
         * Customer information for this payment.
         */
        public var customerDetails:
            InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerDetailsX724b1073? = null

        /**
         * Indicates whether the customer was present in your checkout flow during this payment.
         */
        public var customerPresence:
            InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357? = null

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Information about the payment attempt failure.
         */
        public var failed: InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037? = null

        /**
         * Information about the payment attempt guarantee.
         */
        public var guaranteed: InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c? =
            null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded? = null

        /**
         * The outcome of the reported payment.
         */
        public var outcome: InlineV1PaymentRecordsReportPaymentPostRequestFormOutcomeX2e14d97f? = null

        /**
         * Processor information for this payment.
         */
        public var processorDetails:
            InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a? = null

        /**
         * Shipping information for this payment.
         */
        public var shippingDetails:
            InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a? = null

        public fun build(): InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 {
            check(amountRequestedValue != null) { "amountRequested is required" }
            check(initiatedAtValue != null) { "initiatedAt is required" }
            check(paymentMethodDetailsValue != null) { "paymentMethodDetails is required" }
            return InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2(
                amountRequested = amountRequested,
                initiatedAt = initiatedAt,
                paymentMethodDetails = paymentMethodDetails,
                customerDetails = customerDetails,
                customerPresence = customerPresence,
                description = description,
                expand = expand,
                failed = failed,
                guaranteed = guaranteed,
                metadata = metadata,
                outcome = outcome,
                processorDetails = processorDetails,
                shippingDetails = shippingDetails,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 must be a JSON object",
                    )
            val amountRequested =
                json
                    .decodeRequired<InlineV1PaymentRecordsReportPaymentPostRequestFormAmountRequestedX755a383d>(
                        rawObject,
                        "amount_requested",
                    )
            val initiatedAt = json.decodeRequired<Int>(rawObject, "initiated_at")
            val paymentMethodDetails =
                json
                    .decodeRequired<InlineV1PaymentRecordsReportPaymentPostRequestFormPaymentMethodDetailsXdfe56de9>(
                        rawObject,
                        "payment_method_details",
                    )
            return InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2(
                amountRequested = amountRequested,
                initiatedAt = initiatedAt,
                paymentMethodDetails = paymentMethodDetails,
                customerDetails =
                    rawObject["customer_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerDetailsX724b1073>(
                                it,
                            )
                    },
                customerPresence =
                    rawObject["customer_presence"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357>(
                                it,
                            )
                    },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                failed =
                    rawObject["failed"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormFailedX13f3a037>(
                            it,
                        )
                    },
                guaranteed =
                    rawObject["guaranteed"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormGuaranteedXba30823c>(
                                it,
                            )
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded>(
                            it,
                        )
                    },
                outcome =
                    rawObject["outcome"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormOutcomeX2e14d97f>(
                            it,
                        )
                    },
                processorDetails =
                    rawObject["processor_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormProcessorDetailsXc4483f5a>(
                                it,
                            )
                    },
                shippingDetails =
                    rawObject["shipping_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormShippingDetailsX09ea491a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount_requested", json.encodeToJsonElement(value.amountRequested))
                    put("initiated_at", json.encodeToJsonElement(value.initiatedAt))
                    put("payment_method_details", json.encodeToJsonElement(value.paymentMethodDetails))
                    value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
                    value.customerPresence?.let { put("customer_presence", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.failed?.let { put("failed", json.encodeToJsonElement(it)) }
                    value.guaranteed?.let { put("guaranteed", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.outcome?.let { put("outcome", json.encodeToJsonElement(it)) }
                    value.processorDetails?.let { put("processor_details", json.encodeToJsonElement(it)) }
                    value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2(
    block: InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2.Builder.() -> Unit,
): InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 =
    InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence
 */
@Serializable(with = DisputeEvidence.Serializer::class)
public class DisputeEvidence(
    public val enhancedEvidence: DisputeEnhancedEvidence,
    /**
     * Any server or activity logs showing proof that the customer accessed or downloaded the purchased digital product.
     * This information should include IP addresses, corresponding timestamps, and any detailed recorded activity.
     */
    public val accessActivityLog: String? = null,
    /**
     * The billing address provided by the customer.
     */
    public val billingAddress: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription cancellation policy, as shown
     * to the customer.
     */
    public val cancellationPolicy: InlineDisputeEvidenceCancellationPolicyXcaf1ed70? = null,
    /**
     * An explanation of how and when the customer was shown your refund policy prior to purchase.
     */
    public val cancellationPolicyDisclosure: String? = null,
    /**
     * A justification for why the customer's subscription was not canceled.
     */
    public val cancellationRebuttal: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communication with the customer that you
     * feel is relevant to your case. Examples include emails proving that the customer received the product or service,
     * or demonstrating their use of or satisfaction with the product or service.
     */
    public val customerCommunication: InlineDisputeEvidenceCustomerCommunicationXdea508c4? = null,
    /**
     * The email address of the customer.
     */
    public val customerEmailAddress: String? = null,
    /**
     * The name of the customer.
     */
    public val customerName: String? = null,
    /**
     * The IP address that the customer used when making the purchase.
     */
    public val customerPurchaseIp: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or contract showing the
     * customer's signature.
     */
    public val customerSignature: InlineDisputeEvidenceCustomerSignatureX7f79c66a? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior charge that can
     * uniquely identify the charge, such as a receipt, shipping label, work order, etc. This document should be paired
     * with a similar document from the disputed payment that proves the two payments are separate.
     */
    public val duplicateChargeDocumentation: InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848? = null,
    /**
     * An explanation of the difference between the disputed charge versus the prior charge that appears to be a
     * duplicate.
     */
    public val duplicateChargeExplanation: String? = null,
    /**
     * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
     */
    public val duplicateChargeId: String? = null,
    /**
     * A description of the product or service that was sold.
     */
    public val productDescription: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent to the customer
     * notifying them of the charge.
     */
    public val receipt: InlineDisputeEvidenceReceiptXefa00443? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as shown to the customer.
     */
    public val refundPolicy: InlineDisputeEvidenceRefundPolicyX42bbd64a? = null,
    /**
     * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
     */
    public val refundPolicyDisclosure: String? = null,
    /**
     * A justification for why the customer is not entitled to a refund.
     */
    public val refundRefusalExplanation: String? = null,
    /**
     * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
     */
    public val serviceDate: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a service was
     * provided to the customer. This could include a copy of a signed contract, work order, or other form of written
     * agreement.
     */
    public val serviceDocumentation: InlineDisputeEvidenceServiceDocumentationXf2c81eae? = null,
    /**
     * The address to which a physical product was shipped. You should try to include as complete address information as
     * possible.
     */
    public val shippingAddress: String? = null,
    /**
     * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If multiple carriers were used
     * for this purchase, please separate them with commas.
     */
    public val shippingCarrier: String? = null,
    /**
     * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
     */
    public val shippingDate: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a product was
     * shipped to the customer at the same address the customer provided to you. This could include a copy of the shipment
     * receipt, shipping label, etc. It should show the customer's full shipping address, if possible.
     */
    public val shippingDocumentation: InlineDisputeEvidenceShippingDocumentationX5192d247? = null,
    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were
     * generated for this purchase, please separate them with commas.
     */
    public val shippingTrackingNumber: String? = null,
    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or statements.
     */
    public val uncategorizedFile: InlineDisputeEvidenceUncategorizedFileXd3187fc3? = null,
    /**
     * Any additional evidence or statements.
     */
    public val uncategorizedText: String? = null,
) {
    public class Builder {
        private var enhancedEvidenceValue: DisputeEnhancedEvidence? = null

        public var enhancedEvidence: DisputeEnhancedEvidence
            get() = requireNotNull(enhancedEvidenceValue) { "enhancedEvidence is required" }
            set(`value`) {
                enhancedEvidenceValue = value
            }

        /**
         * Any server or activity logs showing proof that the customer accessed or downloaded the purchased digital product.
         * This information should include IP addresses, corresponding timestamps, and any detailed recorded activity.
         */
        public var accessActivityLog: String? = null

        /**
         * The billing address provided by the customer.
         */
        public var billingAddress: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your subscription cancellation policy, as
         * shown to the customer.
         */
        public var cancellationPolicy: InlineDisputeEvidenceCancellationPolicyXcaf1ed70? = null

        /**
         * An explanation of how and when the customer was shown your refund policy prior to purchase.
         */
        public var cancellationPolicyDisclosure: String? = null

        /**
         * A justification for why the customer's subscription was not canceled.
         */
        public var cancellationRebuttal: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any communication with the customer that you
         * feel is relevant to your case. Examples include emails proving that the customer received the product or service,
         * or demonstrating their use of or satisfaction with the product or service.
         */
        public var customerCommunication: InlineDisputeEvidenceCustomerCommunicationXdea508c4? = null

        /**
         * The email address of the customer.
         */
        public var customerEmailAddress: String? = null

        /**
         * The name of the customer.
         */
        public var customerName: String? = null

        /**
         * The IP address that the customer used when making the purchase.
         */
        public var customerPurchaseIp: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A relevant document or contract showing the
         * customer's signature.
         */
        public var customerSignature: InlineDisputeEvidenceCustomerSignatureX7f79c66a? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation for the prior charge that can
         * uniquely identify the charge, such as a receipt, shipping label, work order, etc. This document should be paired
         * with a similar document from the disputed payment that proves the two payments are separate.
         */
        public var duplicateChargeDocumentation:
            InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848? = null

        /**
         * An explanation of the difference between the disputed charge versus the prior charge that appears to be a
         * duplicate.
         */
        public var duplicateChargeExplanation: String? = null

        /**
         * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
         */
        public var duplicateChargeId: String? = null

        /**
         * A description of the product or service that was sold.
         */
        public var productDescription: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent to the customer
         * notifying them of the charge.
         */
        public var receipt: InlineDisputeEvidenceReceiptXefa00443? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Your refund policy, as shown to the customer.
         */
        public var refundPolicy: InlineDisputeEvidenceRefundPolicyX42bbd64a? = null

        /**
         * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
         */
        public var refundPolicyDisclosure: String? = null

        /**
         * A justification for why the customer is not entitled to a refund.
         */
        public var refundRefusalExplanation: String? = null

        /**
         * The date on which the customer received or began receiving the purchased service, in a clear human-readable
         * format.
         */
        public var serviceDate: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a service
         * was provided to the customer. This could include a copy of a signed contract, work order, or other form of
         * written agreement.
         */
        public var serviceDocumentation: InlineDisputeEvidenceServiceDocumentationXf2c81eae? = null

        /**
         * The address to which a physical product was shipped. You should try to include as complete address information as
         * possible.
         */
        public var shippingAddress: String? = null

        /**
         * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If multiple carriers were
         * used for this purchase, please separate them with commas.
         */
        public var shippingCarrier: String? = null

        /**
         * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
         */
        public var shippingDate: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a product
         * was shipped to the customer at the same address the customer provided to you. This could include a copy of the
         * shipment receipt, shipping label, etc. It should show the customer's full shipping address, if possible.
         */
        public var shippingDocumentation: InlineDisputeEvidenceShippingDocumentationX5192d247? = null

        /**
         * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers were
         * generated for this purchase, please separate them with commas.
         */
        public var shippingTrackingNumber: String? = null

        /**
         * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any additional evidence or statements.
         */
        public var uncategorizedFile: InlineDisputeEvidenceUncategorizedFileXd3187fc3? = null

        /**
         * Any additional evidence or statements.
         */
        public var uncategorizedText: String? = null

        public fun build(): DisputeEvidence {
            check(enhancedEvidenceValue != null) { "enhancedEvidence is required" }
            return DisputeEvidence(
                enhancedEvidence = enhancedEvidence,
                accessActivityLog = accessActivityLog,
                billingAddress = billingAddress,
                cancellationPolicy = cancellationPolicy,
                cancellationPolicyDisclosure = cancellationPolicyDisclosure,
                cancellationRebuttal = cancellationRebuttal,
                customerCommunication = customerCommunication,
                customerEmailAddress = customerEmailAddress,
                customerName = customerName,
                customerPurchaseIp = customerPurchaseIp,
                customerSignature = customerSignature,
                duplicateChargeDocumentation = duplicateChargeDocumentation,
                duplicateChargeExplanation = duplicateChargeExplanation,
                duplicateChargeId = duplicateChargeId,
                productDescription = productDescription,
                receipt = receipt,
                refundPolicy = refundPolicy,
                refundPolicyDisclosure = refundPolicyDisclosure,
                refundRefusalExplanation = refundRefusalExplanation,
                serviceDate = serviceDate,
                serviceDocumentation = serviceDocumentation,
                shippingAddress = shippingAddress,
                shippingCarrier = shippingCarrier,
                shippingDate = shippingDate,
                shippingDocumentation = shippingDocumentation,
                shippingTrackingNumber = shippingTrackingNumber,
                uncategorizedFile = uncategorizedFile,
                uncategorizedText = uncategorizedText,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DisputeEvidence = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DisputeEvidence> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DisputeEvidence {
            val jsonDecoder = decoder.requireJsonDecoder("DisputeEvidence")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DisputeEvidence must be a JSON object")
            val enhancedEvidence = json.decodeRequired<DisputeEnhancedEvidence>(rawObject, "enhanced_evidence")
            return DisputeEvidence(
                enhancedEvidence = enhancedEvidence,
                accessActivityLog =
                    rawObject["access_activity_log"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                billingAddress =
                    rawObject["billing_address"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                cancellationPolicy =
                    rawObject["cancellation_policy"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeEvidenceCancellationPolicyXcaf1ed70?>(element)
                        }
                    },
                cancellationPolicyDisclosure =
                    rawObject["cancellation_policy_disclosure"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                cancellationRebuttal =
                    rawObject["cancellation_rebuttal"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerCommunication =
                    rawObject["customer_communication"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeEvidenceCustomerCommunicationXdea508c4?>(element)
                        }
                    },
                customerEmailAddress =
                    rawObject["customer_email_address"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerName =
                    rawObject["customer_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerPurchaseIp =
                    rawObject["customer_purchase_ip"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerSignature =
                    rawObject["customer_signature"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeEvidenceCustomerSignatureX7f79c66a?>(element)
                        }
                    },
                duplicateChargeDocumentation =
                    rawObject["duplicate_charge_documentation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeEvidenceDuplicateChargeDocumentationXa3255848?>(
                                element,
                            )
                        }
                    },
                duplicateChargeExplanation =
                    rawObject["duplicate_charge_explanation"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                duplicateChargeId =
                    rawObject["duplicate_charge_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                productDescription =
                    rawObject["product_description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                receipt =
                    rawObject["receipt"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeEvidenceReceiptXefa00443?>(element)
                        }
                    },
                refundPolicy =
                    rawObject["refund_policy"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeEvidenceRefundPolicyX42bbd64a?>(element)
                        }
                    },
                refundPolicyDisclosure =
                    rawObject["refund_policy_disclosure"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                refundRefusalExplanation =
                    rawObject["refund_refusal_explanation"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<String?>(element)
                            }
                        },
                serviceDate =
                    rawObject["service_date"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                serviceDocumentation =
                    rawObject["service_documentation"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<InlineDisputeEvidenceServiceDocumentationXf2c81eae?>(element)
                            }
                        },
                shippingAddress =
                    rawObject["shipping_address"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<String?>(element)
                            }
                        },
                shippingCarrier =
                    rawObject["shipping_carrier"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<String?>(element)
                            }
                        },
                shippingDate =
                    rawObject["shipping_date"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<String?>(element)
                            }
                        },
                shippingDocumentation =
                    rawObject["shipping_documentation"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<InlineDisputeEvidenceShippingDocumentationX5192d247?>(
                                    element,
                                )
                            }
                        },
                shippingTrackingNumber =
                    rawObject["shipping_tracking_number"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<String?>(element)
                            }
                        },
                uncategorizedFile =
                    rawObject["uncategorized_file"]
                        ?.let { element ->
                            if (element ==
                                JsonNull
                            ) {
                                null
                            } else {
                                json.decodeFromJsonElement<InlineDisputeEvidenceUncategorizedFileXd3187fc3?>(element)
                            }
                        },
                uncategorizedText =
                    rawObject["uncategorized_text"]
                        ?.let { element ->
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
            `value`: DisputeEvidence,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DisputeEvidence")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("enhanced_evidence", json.encodeToJsonElement(value.enhancedEvidence))
                    value.accessActivityLog?.let { put("access_activity_log", it) }
                    value.billingAddress?.let { put("billing_address", it) }
                    value.cancellationPolicy?.let { put("cancellation_policy", json.encodeToJsonElement(it)) }
                    value.cancellationPolicyDisclosure?.let { put("cancellation_policy_disclosure", it) }
                    value.cancellationRebuttal?.let { put("cancellation_rebuttal", it) }
                    value.customerCommunication?.let { put("customer_communication", json.encodeToJsonElement(it)) }
                    value.customerEmailAddress?.let { put("customer_email_address", it) }
                    value.customerName?.let { put("customer_name", it) }
                    value.customerPurchaseIp?.let { put("customer_purchase_ip", it) }
                    value.customerSignature?.let { put("customer_signature", json.encodeToJsonElement(it)) }
                    value.duplicateChargeDocumentation?.let {
                        put(
                            "duplicate_charge_documentation",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.duplicateChargeExplanation?.let { put("duplicate_charge_explanation", it) }
                    value.duplicateChargeId?.let { put("duplicate_charge_id", it) }
                    value.productDescription?.let { put("product_description", it) }
                    value.receipt?.let { put("receipt", json.encodeToJsonElement(it)) }
                    value.refundPolicy?.let { put("refund_policy", json.encodeToJsonElement(it)) }
                    value.refundPolicyDisclosure?.let { put("refund_policy_disclosure", it) }
                    value.refundRefusalExplanation?.let { put("refund_refusal_explanation", it) }
                    value.serviceDate?.let { put("service_date", it) }
                    value.serviceDocumentation?.let { put("service_documentation", json.encodeToJsonElement(it)) }
                    value.shippingAddress?.let { put("shipping_address", it) }
                    value.shippingCarrier?.let { put("shipping_carrier", it) }
                    value.shippingDate?.let { put("shipping_date", it) }
                    value.shippingDocumentation?.let { put("shipping_documentation", json.encodeToJsonElement(it)) }
                    value.shippingTrackingNumber?.let { put("shipping_tracking_number", it) }
                    value.uncategorizedFile?.let { put("uncategorized_file", json.encodeToJsonElement(it)) }
                    value.uncategorizedText?.let { put("uncategorized_text", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun disputeEvidence(block: DisputeEvidence.Builder.() -> Unit): DisputeEvidence = DisputeEvidence.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("DisputeEvidence is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

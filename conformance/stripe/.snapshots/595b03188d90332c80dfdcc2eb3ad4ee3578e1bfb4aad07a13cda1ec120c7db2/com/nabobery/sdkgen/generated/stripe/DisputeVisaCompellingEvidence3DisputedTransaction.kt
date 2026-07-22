package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class DisputeVisaCompellingEvidence3DisputedTransactionView(
    @SerialName("customer_account_id")
    public val customerAccountId: String? = null,
    @SerialName("customer_device_fingerprint")
    public val customerDeviceFingerprint: String? = null,
    @SerialName("customer_device_id")
    public val customerDeviceId: String? = null,
    @SerialName("customer_email_address")
    public val customerEmailAddress: String? = null,
    @SerialName("customer_purchase_ip")
    public val customerPurchaseIp: String? = null,
    @SerialName("merchandise_or_services")
    public val merchandiseOrServices: InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d? = null,
    @SerialName("product_description")
    public val productDescription: String? = null,
    @SerialName("shipping_address")
    public val shippingAddress: InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_visa_compelling_evidence3_disputed_transaction
 */
@Serializable(with = DisputeVisaCompellingEvidence3DisputedTransaction.Serializer::class)
public class DisputeVisaCompellingEvidence3DisputedTransaction(
    /**
     * User Account ID used to log into business platform. Must be recognizable by the user.
     */
    public val customerAccountId: String? = null,
    /**
     * Unique identifier of the cardholder’s device derived from a combination of at least two hardware and software
     * attributes. Must be at least 20 characters.
     */
    public val customerDeviceFingerprint: String? = null,
    /**
     * Unique identifier of the cardholder’s device such as a device serial number (e.g., International Mobile Equipment
     * Identity [IMEI]). Must be at least 15 characters.
     */
    public val customerDeviceId: String? = null,
    /**
     * The email address of the customer.
     */
    public val customerEmailAddress: String? = null,
    /**
     * The IP address that the customer used when making the purchase.
     */
    public val customerPurchaseIp: String? = null,
    /**
     * Categorization of disputed payment.
     */
    public val merchandiseOrServices: InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d? = null,
    /**
     * A description of the product or service that was sold.
     */
    public val productDescription: String? = null,
    /**
     * The address to which a physical product was shipped. All fields are required for Visa Compelling Evidence 3.0
     * evidence submission.
     */
    public val shippingAddress: InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb? = null,
) {
    public class Builder {
        /**
         * User Account ID used to log into business platform. Must be recognizable by the user.
         */
        public var customerAccountId: String? = null

        /**
         * Unique identifier of the cardholder’s device derived from a combination of at least two hardware and software
         * attributes. Must be at least 20 characters.
         */
        public var customerDeviceFingerprint: String? = null

        /**
         * Unique identifier of the cardholder’s device such as a device serial number (e.g., International Mobile Equipment
         * Identity [IMEI]). Must be at least 15 characters.
         */
        public var customerDeviceId: String? = null

        /**
         * The email address of the customer.
         */
        public var customerEmailAddress: String? = null

        /**
         * The IP address that the customer used when making the purchase.
         */
        public var customerPurchaseIp: String? = null

        /**
         * Categorization of disputed payment.
         */
        public var merchandiseOrServices: InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d? =
            null

        /**
         * A description of the product or service that was sold.
         */
        public var productDescription: String? = null

        /**
         * The address to which a physical product was shipped. All fields are required for Visa Compelling Evidence 3.0
         * evidence submission.
         */
        public var shippingAddress:
            InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb? = null

        public fun build(): DisputeVisaCompellingEvidence3DisputedTransaction =
            DisputeVisaCompellingEvidence3DisputedTransaction(
                customerAccountId = customerAccountId,
                customerDeviceFingerprint = customerDeviceFingerprint,
                customerDeviceId = customerDeviceId,
                customerEmailAddress = customerEmailAddress,
                customerPurchaseIp = customerPurchaseIp,
                merchandiseOrServices = merchandiseOrServices,
                productDescription = productDescription,
                shippingAddress = shippingAddress,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DisputeVisaCompellingEvidence3DisputedTransaction =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DisputeVisaCompellingEvidence3DisputedTransaction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DisputeVisaCompellingEvidence3DisputedTransaction {
            val jsonDecoder = decoder.requireJsonDecoder("DisputeVisaCompellingEvidence3DisputedTransaction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "DisputeVisaCompellingEvidence3DisputedTransaction must be a JSON object",
                    )
            return DisputeVisaCompellingEvidence3DisputedTransaction(
                customerAccountId =
                    rawObject["customer_account_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerDeviceFingerprint =
                    rawObject["customer_device_fingerprint"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerDeviceId =
                    rawObject["customer_device_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
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
                merchandiseOrServices =
                    rawObject["merchandise_or_services"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d?>(
                                element,
                            )
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
                shippingAddress =
                    rawObject["shipping_address"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DisputeVisaCompellingEvidence3DisputedTransaction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DisputeVisaCompellingEvidence3DisputedTransaction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customerAccountId?.let { put("customer_account_id", it) }
                    value.customerDeviceFingerprint?.let { put("customer_device_fingerprint", it) }
                    value.customerDeviceId?.let { put("customer_device_id", it) }
                    value.customerEmailAddress?.let { put("customer_email_address", it) }
                    value.customerPurchaseIp?.let { put("customer_purchase_ip", it) }
                    value.merchandiseOrServices?.let { put("merchandise_or_services", json.encodeToJsonElement(it)) }
                    value.productDescription?.let { put("product_description", it) }
                    value.shippingAddress?.let { put("shipping_address", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun disputeVisaCompellingEvidence3DisputedTransaction(
    block: DisputeVisaCompellingEvidence3DisputedTransaction.Builder.() -> Unit,
): DisputeVisaCompellingEvidence3DisputedTransaction = DisputeVisaCompellingEvidence3DisputedTransaction.build(block)

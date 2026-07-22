package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9(
    public val customerAccountId: InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef? = null,
    public val customerDeviceFingerprint:
        InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef? = null,
    public val customerDeviceId: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceCustomerDeviceIdX2a10541b? = null,
    public val customerEmailAddress: InlineV1DisputesPostRequestFormEvidenceCustomerEmailAddressXf41dff0b? = null,
    public val customerPurchaseIp: InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d? = null,
    public val merchandiseOrServices: InlineV1DisputesPostRequestFormEvidenceMerchandiseOrServicesXbd715b61? = null,
    public val productDescription: InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba? = null,
    public val shippingAddress: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa? = null,
) {
    public class Builder {
        public var customerAccountId: InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef? =
            null

        public var customerDeviceFingerprint:
            InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef? = null

        public var customerDeviceId:
            InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceCustomerDeviceIdX2a10541b? = null

        public var customerEmailAddress:
            InlineV1DisputesPostRequestFormEvidenceCustomerEmailAddressXf41dff0b? = null

        public var customerPurchaseIp:
            InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d? = null

        public var merchandiseOrServices:
            InlineV1DisputesPostRequestFormEvidenceMerchandiseOrServicesXbd715b61? = null

        public var productDescription:
            InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba? = null

        public var shippingAddress:
            InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa? = null

        public fun build(): InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9 =
            InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9(
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
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9 must be a JSON object",
                    )
            return InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9(
                customerAccountId =
                    rawObject["customer_account_id"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdXf2de54ef>(
                            it,
                        )
                    },
                customerDeviceFingerprint =
                    rawObject["customer_device_fingerprint"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X003f00ef>(
                                it,
                            )
                    },
                customerDeviceId =
                    rawObject["customer_device_id"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceCustomerDeviceIdX2a10541b>(
                                it,
                            )
                    },
                customerEmailAddress =
                    rawObject["customer_email_address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerEmailAddressXf41dff0b>(
                                it,
                            )
                    },
                customerPurchaseIp =
                    rawObject["customer_purchase_ip"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpX0791079d>(
                            it,
                        )
                    },
                merchandiseOrServices =
                    rawObject["merchandise_or_services"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceMerchandiseOrServicesXbd715b61>(
                                it,
                            )
                    },
                productDescription =
                    rawObject["product_description"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceProductDescriptionX5804eeba>(
                            it,
                        )
                    },
                shippingAddress =
                    rawObject["shipping_address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customerAccountId?.let { put("customer_account_id", json.encodeToJsonElement(it)) }
                    value.customerDeviceFingerprint?.let {
                        put(
                            "customer_device_fingerprint",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.customerDeviceId?.let { put("customer_device_id", json.encodeToJsonElement(it)) }
                    value.customerEmailAddress?.let { put("customer_email_address", json.encodeToJsonElement(it)) }
                    value.customerPurchaseIp?.let { put("customer_purchase_ip", json.encodeToJsonElement(it)) }
                    value.merchandiseOrServices?.let { put("merchandise_or_services", json.encodeToJsonElement(it)) }
                    value.productDescription?.let { put("product_description", json.encodeToJsonElement(it)) }
                    value.shippingAddress?.let { put("shipping_address", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9(
    block: InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9.Builder.() -> Unit,
): InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9 =
    InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9.build(block)

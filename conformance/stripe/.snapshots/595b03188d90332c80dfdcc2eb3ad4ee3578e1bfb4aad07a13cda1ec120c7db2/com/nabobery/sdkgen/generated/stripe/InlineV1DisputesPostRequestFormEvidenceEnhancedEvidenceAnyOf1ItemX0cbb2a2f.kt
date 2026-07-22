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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f(
    public val charge: String,
    public val customerAccountId: InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdX5a373434? = null,
    public val customerDeviceFingerprint:
        InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X58ed18ee? = null,
    public val customerDeviceId: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceCustomerDeviceIdXcae44be8? = null,
    public val customerEmailAddress: InlineV1DisputesPostRequestFormEvidenceCustomerEmailAddressXc51371f1? = null,
    public val customerPurchaseIp: InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566? = null,
    public val productDescription: InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772? = null,
    public val shippingAddress: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX7ccfc785? = null,
) {
    public class Builder {
        private var chargeValue: String? = null

        public var charge: String
            get() = requireNotNull(chargeValue) { "charge is required" }
            set(`value`) {
                chargeValue = value
            }

        public var customerAccountId: InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdX5a373434? =
            null

        public var customerDeviceFingerprint:
            InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X58ed18ee? = null

        public var customerDeviceId:
            InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceCustomerDeviceIdXcae44be8? = null

        public var customerEmailAddress:
            InlineV1DisputesPostRequestFormEvidenceCustomerEmailAddressXc51371f1? = null

        public var customerPurchaseIp:
            InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566? = null

        public var productDescription:
            InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772? = null

        public var shippingAddress:
            InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX7ccfc785? = null

        public fun build(): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f {
            check(chargeValue != null) { "charge is required" }
            return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f(
                charge = charge,
                customerAccountId = customerAccountId,
                customerDeviceFingerprint = customerDeviceFingerprint,
                customerDeviceId = customerDeviceId,
                customerEmailAddress = customerEmailAddress,
                customerPurchaseIp = customerPurchaseIp,
                productDescription = productDescription,
                shippingAddress = shippingAddress,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f must be a JSON object",
                    )
            val charge = json.decodeRequired<String>(rawObject, "charge")
            return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f(
                charge = charge,
                customerAccountId =
                    rawObject["customer_account_id"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerAccountIdX5a373434>(
                            it,
                        )
                    },
                customerDeviceFingerprint =
                    rawObject["customer_device_fingerprint"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerDeviceFinger9c71X58ed18ee>(
                                it,
                            )
                    },
                customerDeviceId =
                    rawObject["customer_device_id"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceCustomerDeviceIdXcae44be8>(
                                it,
                            )
                    },
                customerEmailAddress =
                    rawObject["customer_email_address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerEmailAddressXc51371f1>(
                                it,
                            )
                    },
                customerPurchaseIp =
                    rawObject["customer_purchase_ip"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceCustomerPurchaseIpXefa01566>(
                            it,
                        )
                    },
                productDescription =
                    rawObject["product_description"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceProductDescriptionXcd5f0772>(
                            it,
                        )
                    },
                shippingAddress =
                    rawObject["shipping_address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX7ccfc785>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("charge", value.charge)
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
                    value.productDescription?.let { put("product_description", json.encodeToJsonElement(it)) }
                    value.shippingAddress?.let { put("shipping_address", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f(
    block: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f.Builder.() -> Unit,
): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f =
    InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

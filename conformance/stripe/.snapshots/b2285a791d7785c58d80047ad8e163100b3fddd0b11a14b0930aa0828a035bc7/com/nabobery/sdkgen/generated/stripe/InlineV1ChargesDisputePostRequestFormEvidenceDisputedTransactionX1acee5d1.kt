package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1(
  public val customerAccountId:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerAccountIdXb6ce63d4? = null,
  public val customerDeviceFingerprint:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X9d81d65b? = null,
  public val customerDeviceId:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e? = null,
  public val customerEmailAddress:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressXe78a3141? = null,
  public val customerPurchaseIp:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerPurchaseIpX1ac28fd9? = null,
  public val merchandiseOrServices:
      InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252? = null,
  public val productDescription:
      InlineV1ChargesDisputePostRequestFormEvidenceProductDescriptionXd7c6c47e? = null,
  public val shippingAddress:
      InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802? = null,
) {
  public class Builder {
    public var customerAccountId:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerAccountIdXb6ce63d4? = null

    public var customerDeviceFingerprint:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X9d81d65b? = null

    public var customerDeviceId:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e? = null

    public var customerEmailAddress:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressXe78a3141? = null

    public var customerPurchaseIp:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerPurchaseIpX1ac28fd9? = null

    public var merchandiseOrServices:
        InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252? = null

    public var productDescription:
        InlineV1ChargesDisputePostRequestFormEvidenceProductDescriptionXd7c6c47e? = null

    public var shippingAddress:
        InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802? = null

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1 = InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1(
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
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1 must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1(
        customerAccountId = rawObject["customer_account_id"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerAccountIdXb6ce63d4>(it) },
        customerDeviceFingerprint = rawObject["customer_device_fingerprint"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X9d81d65b>(it) },
        customerDeviceId = rawObject["customer_device_id"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdXda416c4e>(it) },
        customerEmailAddress = rawObject["customer_email_address"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressXe78a3141>(it) },
        customerPurchaseIp = rawObject["customer_purchase_ip"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerPurchaseIpX1ac28fd9>(it) },
        merchandiseOrServices = rawObject["merchandise_or_services"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceProductDescriptionXd7c6c47e>(it) },
        shippingAddress = rawObject["shipping_address"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerAccountId?.let { put("customer_account_id", json.encodeToJsonElement(it)) }
        value.customerDeviceFingerprint?.let { put("customer_device_fingerprint", json.encodeToJsonElement(it)) }
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

public fun inlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1(block: InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1 = InlineV1ChargesDisputePostRequestFormEvidenceDisputedTransactionX1acee5d1.build(block)

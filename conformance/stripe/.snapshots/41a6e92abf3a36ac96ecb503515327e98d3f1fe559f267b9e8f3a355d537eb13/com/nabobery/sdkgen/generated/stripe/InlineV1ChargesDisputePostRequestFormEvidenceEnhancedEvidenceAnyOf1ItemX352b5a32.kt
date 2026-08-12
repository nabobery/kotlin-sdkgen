package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32(
  public val charge: String,
  public val customerAccountId:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerAccountIdXda9083ff? = null,
  public val customerDeviceFingerprint:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4? = null,
  public val customerDeviceId:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdX60179376? = null,
  public val customerEmailAddress:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96? = null,
  public val customerPurchaseIp:
      InlineV1ChargesDisputePostRequestFormEvidenceCustomerPurchaseIpX442a34b5? = null,
  public val productDescription:
      InlineV1ChargesDisputePostRequestFormEvidenceProductDescriptionX734f0e2c? = null,
  public val shippingAddress:
      InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f? = null,
) {
  public class Builder {
    private var chargeValue: String? = null

    public var charge: String
      get() = requireNotNull(chargeValue) { "charge is required" }
      set(`value`) {
        chargeValue = value
      }

    public var customerAccountId:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerAccountIdXda9083ff? = null

    public var customerDeviceFingerprint:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4? = null

    public var customerDeviceId:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdX60179376? = null

    public var customerEmailAddress:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96? = null

    public var customerPurchaseIp:
        InlineV1ChargesDisputePostRequestFormEvidenceCustomerPurchaseIpX442a34b5? = null

    public var productDescription:
        InlineV1ChargesDisputePostRequestFormEvidenceProductDescriptionX734f0e2c? = null

    public var shippingAddress:
        InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f? = null

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32 {
      check(chargeValue != null) { "charge is required" }
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32(
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
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32 must be a JSON object")
      val charge = json.decodeRequired<String>(rawObject, "charge")
      return InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32(
        charge = charge,
        customerAccountId = rawObject["customer_account_id"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerAccountIdXda9083ff>(it) },
        customerDeviceFingerprint = rawObject["customer_device_fingerprint"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceFinger9c71X3dc81cf4>(it) },
        customerDeviceId = rawObject["customer_device_id"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerDeviceIdX60179376>(it) },
        customerEmailAddress = rawObject["customer_email_address"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerEmailAddressX4a478d96>(it) },
        customerPurchaseIp = rawObject["customer_purchase_ip"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceCustomerPurchaseIpX442a34b5>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceProductDescriptionX734f0e2c>(it) },
        shippingAddress = rawObject["shipping_address"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("charge", value.charge)
        value.customerAccountId?.let { put("customer_account_id", json.encodeToJsonElement(it)) }
        value.customerDeviceFingerprint?.let { put("customer_device_fingerprint", json.encodeToJsonElement(it)) }
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

public fun inlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32(block: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32 = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX352b5a32 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Evidence to upload, to respond to a dispute. Updating any field in the hash will submit all fields in the hash for
 * review. The combined character count of all fields is limited to 150,000.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a(
  public val accessActivityLog: String? = null,
  public val billingAddress: String? = null,
  public val cancellationPolicy: String? = null,
  public val cancellationPolicyDisclosure: String? = null,
  public val cancellationRebuttal: String? = null,
  public val customerCommunication: String? = null,
  public val customerEmailAddress: String? = null,
  public val customerName: String? = null,
  public val customerPurchaseIp: String? = null,
  public val customerSignature: String? = null,
  public val duplicateChargeDocumentation: String? = null,
  public val duplicateChargeExplanation: String? = null,
  public val duplicateChargeId: String? = null,
  public val enhancedEvidence:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc? = null,
  public val productDescription: String? = null,
  public val receipt: String? = null,
  public val refundPolicy: String? = null,
  public val refundPolicyDisclosure: String? = null,
  public val refundRefusalExplanation: String? = null,
  public val serviceDate: String? = null,
  public val serviceDocumentation: String? = null,
  public val shippingAddress: String? = null,
  public val shippingCarrier: String? = null,
  public val shippingDate: String? = null,
  public val shippingDocumentation: String? = null,
  public val shippingTrackingNumber: String? = null,
  public val uncategorizedFile: String? = null,
  public val uncategorizedText: String? = null,
) {
  public class Builder {
    public var accessActivityLog: String? = null

    public var billingAddress: String? = null

    public var cancellationPolicy: String? = null

    public var cancellationPolicyDisclosure: String? = null

    public var cancellationRebuttal: String? = null

    public var customerCommunication: String? = null

    public var customerEmailAddress: String? = null

    public var customerName: String? = null

    public var customerPurchaseIp: String? = null

    public var customerSignature: String? = null

    public var duplicateChargeDocumentation: String? = null

    public var duplicateChargeExplanation: String? = null

    public var duplicateChargeId: String? = null

    public var enhancedEvidence:
        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc? = null

    public var productDescription: String? = null

    public var receipt: String? = null

    public var refundPolicy: String? = null

    public var refundPolicyDisclosure: String? = null

    public var refundRefusalExplanation: String? = null

    public var serviceDate: String? = null

    public var serviceDocumentation: String? = null

    public var shippingAddress: String? = null

    public var shippingCarrier: String? = null

    public var shippingDate: String? = null

    public var shippingDocumentation: String? = null

    public var shippingTrackingNumber: String? = null

    public var uncategorizedFile: String? = null

    public var uncategorizedText: String? = null

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a = InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a(
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
      enhancedEvidence = enhancedEvidence,
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

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a(
        accessActivityLog = rawObject["access_activity_log"]?.let { json.decodeFromJsonElement<String>(it) },
        billingAddress = rawObject["billing_address"]?.let { json.decodeFromJsonElement<String>(it) },
        cancellationPolicy = rawObject["cancellation_policy"]?.let { json.decodeFromJsonElement<String>(it) },
        cancellationPolicyDisclosure = rawObject["cancellation_policy_disclosure"]?.let { json.decodeFromJsonElement<String>(it) },
        cancellationRebuttal = rawObject["cancellation_rebuttal"]?.let { json.decodeFromJsonElement<String>(it) },
        customerCommunication = rawObject["customer_communication"]?.let { json.decodeFromJsonElement<String>(it) },
        customerEmailAddress = rawObject["customer_email_address"]?.let { json.decodeFromJsonElement<String>(it) },
        customerName = rawObject["customer_name"]?.let { json.decodeFromJsonElement<String>(it) },
        customerPurchaseIp = rawObject["customer_purchase_ip"]?.let { json.decodeFromJsonElement<String>(it) },
        customerSignature = rawObject["customer_signature"]?.let { json.decodeFromJsonElement<String>(it) },
        duplicateChargeDocumentation = rawObject["duplicate_charge_documentation"]?.let { json.decodeFromJsonElement<String>(it) },
        duplicateChargeExplanation = rawObject["duplicate_charge_explanation"]?.let { json.decodeFromJsonElement<String>(it) },
        duplicateChargeId = rawObject["duplicate_charge_id"]?.let { json.decodeFromJsonElement<String>(it) },
        enhancedEvidence = rawObject["enhanced_evidence"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceX65dc79fc>(it) },
        productDescription = rawObject["product_description"]?.let { json.decodeFromJsonElement<String>(it) },
        receipt = rawObject["receipt"]?.let { json.decodeFromJsonElement<String>(it) },
        refundPolicy = rawObject["refund_policy"]?.let { json.decodeFromJsonElement<String>(it) },
        refundPolicyDisclosure = rawObject["refund_policy_disclosure"]?.let { json.decodeFromJsonElement<String>(it) },
        refundRefusalExplanation = rawObject["refund_refusal_explanation"]?.let { json.decodeFromJsonElement<String>(it) },
        serviceDate = rawObject["service_date"]?.let { json.decodeFromJsonElement<String>(it) },
        serviceDocumentation = rawObject["service_documentation"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingAddress = rawObject["shipping_address"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingCarrier = rawObject["shipping_carrier"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingDate = rawObject["shipping_date"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingDocumentation = rawObject["shipping_documentation"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingTrackingNumber = rawObject["shipping_tracking_number"]?.let { json.decodeFromJsonElement<String>(it) },
        uncategorizedFile = rawObject["uncategorized_file"]?.let { json.decodeFromJsonElement<String>(it) },
        uncategorizedText = rawObject["uncategorized_text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accessActivityLog?.let { put("access_activity_log", it) }
        value.billingAddress?.let { put("billing_address", it) }
        value.cancellationPolicy?.let { put("cancellation_policy", it) }
        value.cancellationPolicyDisclosure?.let { put("cancellation_policy_disclosure", it) }
        value.cancellationRebuttal?.let { put("cancellation_rebuttal", it) }
        value.customerCommunication?.let { put("customer_communication", it) }
        value.customerEmailAddress?.let { put("customer_email_address", it) }
        value.customerName?.let { put("customer_name", it) }
        value.customerPurchaseIp?.let { put("customer_purchase_ip", it) }
        value.customerSignature?.let { put("customer_signature", it) }
        value.duplicateChargeDocumentation?.let { put("duplicate_charge_documentation", it) }
        value.duplicateChargeExplanation?.let { put("duplicate_charge_explanation", it) }
        value.duplicateChargeId?.let { put("duplicate_charge_id", it) }
        value.enhancedEvidence?.let { put("enhanced_evidence", json.encodeToJsonElement(it)) }
        value.productDescription?.let { put("product_description", it) }
        value.receipt?.let { put("receipt", it) }
        value.refundPolicy?.let { put("refund_policy", it) }
        value.refundPolicyDisclosure?.let { put("refund_policy_disclosure", it) }
        value.refundRefusalExplanation?.let { put("refund_refusal_explanation", it) }
        value.serviceDate?.let { put("service_date", it) }
        value.serviceDocumentation?.let { put("service_documentation", it) }
        value.shippingAddress?.let { put("shipping_address", it) }
        value.shippingCarrier?.let { put("shipping_carrier", it) }
        value.shippingDate?.let { put("shipping_date", it) }
        value.shippingDocumentation?.let { put("shipping_documentation", it) }
        value.shippingTrackingNumber?.let { put("shipping_tracking_number", it) }
        value.uncategorizedFile?.let { put("uncategorized_file", it) }
        value.uncategorizedText?.let { put("uncategorized_text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesDisputePostRequestFormEvidenceXbae9196a(block: InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a = InlineV1ChargesDisputePostRequestFormEvidenceXbae9196a.build(block)

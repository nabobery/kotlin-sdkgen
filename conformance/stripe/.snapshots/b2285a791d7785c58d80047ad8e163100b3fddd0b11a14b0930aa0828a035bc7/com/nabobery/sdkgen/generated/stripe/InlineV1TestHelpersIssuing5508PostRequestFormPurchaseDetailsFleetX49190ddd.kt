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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd(
  public val cardholderPromptData:
      InlineV1TestHelpersIssuing5508PostRequestFormCardholderPromptDataX3259a2f1? = null,
  public val purchaseType:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89? = null,
  public val reportedBreakdown:
      InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c? = null,
  public val serviceType:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsServiceTypeXd3ee0df3? = null,
) {
  public class Builder {
    public var cardholderPromptData:
        InlineV1TestHelpersIssuing5508PostRequestFormCardholderPromptDataX3259a2f1? = null

    public var purchaseType: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89? =
        null

    public var reportedBreakdown:
        InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c? = null

    public var serviceType:
        InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsServiceTypeXd3ee0df3? = null

    public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd(
      cardholderPromptData = cardholderPromptData,
      purchaseType = purchaseType,
      reportedBreakdown = reportedBreakdown,
      serviceType = serviceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd must be a JSON object")
      return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd(
        cardholderPromptData = rawObject["cardholder_prompt_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormCardholderPromptDataX3259a2f1>(it) },
        purchaseType = rawObject["purchase_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseTypeXc3447d89>(it) },
        reportedBreakdown = rawObject["reported_breakdown"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c>(it) },
        serviceType = rawObject["service_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsServiceTypeXd3ee0df3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardholderPromptData?.let { put("cardholder_prompt_data", json.encodeToJsonElement(it)) }
        value.purchaseType?.let { put("purchase_type", json.encodeToJsonElement(it)) }
        value.reportedBreakdown?.let { put("reported_breakdown", json.encodeToJsonElement(it)) }
        value.serviceType?.let { put("service_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd(block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd.Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd.build(block)

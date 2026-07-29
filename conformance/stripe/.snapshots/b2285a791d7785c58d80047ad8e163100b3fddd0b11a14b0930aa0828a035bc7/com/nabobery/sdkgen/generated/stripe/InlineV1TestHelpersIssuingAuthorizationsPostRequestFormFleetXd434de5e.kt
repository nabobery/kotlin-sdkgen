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
 * Fleet-specific information for authorizations using Fleet cards.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e(
  public val cardholderPromptData:
      InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42? = null,
  public val purchaseType:
      InlineV1TestHelpersIssuing214aPostRequestFormFleetPurchaseTypeX29a03281? = null,
  public val reportedBreakdown:
      InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8? = null,
  public val serviceType:
      InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetServiceTypeXd02bd97f? = null,
) {
  public class Builder {
    public var cardholderPromptData:
        InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42? = null

    public var purchaseType:
        InlineV1TestHelpersIssuing214aPostRequestFormFleetPurchaseTypeX29a03281? = null

    public var reportedBreakdown:
        InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8? = null

    public var serviceType:
        InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetServiceTypeXd02bd97f? = null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e(
      cardholderPromptData = cardholderPromptData,
      purchaseType = purchaseType,
      reportedBreakdown = reportedBreakdown,
      serviceType = serviceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e must be a JSON object")
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e(
        cardholderPromptData = rawObject["cardholder_prompt_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42>(it) },
        purchaseType = rawObject["purchase_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFleetPurchaseTypeX29a03281>(it) },
        reportedBreakdown = rawObject["reported_breakdown"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8>(it) },
        serviceType = rawObject["service_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetServiceTypeXd02bd97f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e")
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

public fun inlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e(block: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e.build(block)

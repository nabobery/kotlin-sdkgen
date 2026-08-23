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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet
 */
@Serializable(with = InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be.Serializer::class)
public class InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be(
  public val cardholderPromptData:
      InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396? = null,
  public val purchaseType:
      InlineV1TestHelpersIssuing6a15PostRequestFormFleetPurchaseTypeXcfc78d3c? = null,
  public val reportedBreakdown:
      InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3? = null,
  public val serviceType:
      InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe? = null,
) {
  public class Builder {
    public var cardholderPromptData:
        InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396? = null

    public var purchaseType:
        InlineV1TestHelpersIssuing6a15PostRequestFormFleetPurchaseTypeXcfc78d3c? = null

    public var reportedBreakdown:
        InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3? = null

    public var serviceType: InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe?
        = null

    public fun build(): InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be = InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be(
      cardholderPromptData = cardholderPromptData,
      purchaseType = purchaseType,
      reportedBreakdown = reportedBreakdown,
      serviceType = serviceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be must be a JSON object")
      return InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be(
        cardholderPromptData = rawObject["cardholder_prompt_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetCardholderPromptDataXaf379396>(it) },
        purchaseType = rawObject["purchase_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetPurchaseTypeXcfc78d3c>(it) },
        reportedBreakdown = rawObject["reported_breakdown"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3>(it) },
        serviceType = rawObject["service_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetServiceTypeX618dfafe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be")
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

public fun inlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be(block: InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be.Builder.() -> Unit): InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be = InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be.build(block)

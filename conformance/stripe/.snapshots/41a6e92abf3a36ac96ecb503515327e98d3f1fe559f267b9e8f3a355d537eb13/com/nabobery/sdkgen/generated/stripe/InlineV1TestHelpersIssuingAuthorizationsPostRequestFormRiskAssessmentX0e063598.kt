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
 * Stripe’s assessment of the fraud risk for this authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598(
  public val cardTestingRisk:
      InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9? = null,
  public val fraudRisk:
      InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff? = null,
  public val merchantDisputeRisk:
      InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c? = null,
) {
  public class Builder {
    public var cardTestingRisk:
        InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9? = null

    public var fraudRisk:
        InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff? = null

    public var merchantDisputeRisk:
        InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c? = null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598(
      cardTestingRisk = cardTestingRisk,
      fraudRisk = fraudRisk,
      merchantDisputeRisk = merchantDisputeRisk,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598 must be a JSON object")
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598(
        cardTestingRisk = rawObject["card_testing_risk"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9>(it) },
        fraudRisk = rawObject["fraud_risk"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff>(it) },
        merchantDisputeRisk = rawObject["merchant_dispute_risk"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardTestingRisk?.let { put("card_testing_risk", json.encodeToJsonElement(it)) }
        value.fraudRisk?.let { put("fraud_risk", json.encodeToJsonElement(it)) }
        value.merchantDisputeRisk?.let { put("merchant_dispute_risk", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598(block: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598.build(block)

package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/card_testing_risk.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/card_testing_risk
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9(
  public val level: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX3ba9bd81,
  public val invalidAccountNumberDeclineRatePastHour: Int? = null,
  public val invalidCredentialsDeclineRatePastHour: Int? = null,
) {
  public class Builder {
    private var levelValue:
        InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX3ba9bd81? = null

    public var level: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX3ba9bd81
      get() = requireNotNull(levelValue) { "level is required" }
      set(`value`) {
        levelValue = value
      }

    public var invalidAccountNumberDeclineRatePastHour: Int? = null

    public var invalidCredentialsDeclineRatePastHour: Int? = null

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9 {
      check(levelValue != null) { "level is required" }
      return InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9(
        level = level,
        invalidAccountNumberDeclineRatePastHour = invalidAccountNumberDeclineRatePastHour,
        invalidCredentialsDeclineRatePastHour = invalidCredentialsDeclineRatePastHour,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9 must be a JSON object")
      val level = json.decodeRequired<InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX3ba9bd81>(rawObject, "level")
      return InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9(
        level = level,
        invalidAccountNumberDeclineRatePastHour = rawObject["invalid_account_number_decline_rate_past_hour"]?.let { json.decodeFromJsonElement<Int>(it) },
        invalidCredentialsDeclineRatePastHour = rawObject["invalid_credentials_decline_rate_past_hour"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("level", json.encodeToJsonElement(value.level))
        value.invalidAccountNumberDeclineRatePastHour?.let { put("invalid_account_number_decline_rate_past_hour", json.encodeToJsonElement(it)) }
        value.invalidCredentialsDeclineRatePastHour?.let { put("invalid_credentials_decline_rate_past_hour", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9(block: InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9 = InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormCardTestingRiskX361646a9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

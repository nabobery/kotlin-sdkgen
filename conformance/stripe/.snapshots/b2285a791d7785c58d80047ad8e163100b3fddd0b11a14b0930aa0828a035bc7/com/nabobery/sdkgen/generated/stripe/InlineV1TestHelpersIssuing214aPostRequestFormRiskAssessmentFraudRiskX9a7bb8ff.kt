package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
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
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/fraud_risk.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/fraud_risk
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff(
  public val level: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelXe90f37b0,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double? = null,
) {
  public class Builder {
    private var levelValue:
        InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelXe90f37b0? = null

    public var level: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelXe90f37b0
      get() = requireNotNull(levelValue) { "level is required" }
      set(`value`) {
        levelValue = value
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var score: Double? = null

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff {
      check(levelValue != null) { "level is required" }
      return InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff(
        level = level,
        score = score,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff must be a JSON object")
      val level = json.decodeRequired<InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelXe90f37b0>(rawObject, "level")
      return InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff(
        level = level,
        score = rawObject["score"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("level", json.encodeToJsonElement(value.level))
        value.score?.let { put("score", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff(block: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff = InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentFraudRiskX9a7bb8ff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

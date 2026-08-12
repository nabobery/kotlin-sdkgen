package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
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
 * A payment evaluation signal with evaluated_at, risk_level, and score fields.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_signal_v2
 */
@Serializable(with = InsightsResourcesPaymentEvaluationSignalV2.Serializer::class)
public class InsightsResourcesPaymentEvaluationSignalV2(
  /**
   * The time when this signal was evaluated.
   */
  public val evaluatedAt: Int,
  /**
   * Risk level of this signal, based on the score.
   */
  public val riskLevel: InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb,
  /**
   * Score for this signal. Possible values for evaluated payments are between 0 and 100. The value is returned with two
   * decimal places and higher scores indicate a higher likelihood of the signal being true. A score of -1 is returned
   * when a model evaluation was not performed, such as requests from incomplete integrations.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
) {
  public class Builder {
    private var evaluatedAtValue: Int? = null

    public var evaluatedAt: Int
      get() = requireNotNull(evaluatedAtValue) { "evaluatedAt is required" }
      set(`value`) {
        evaluatedAtValue = value
      }

    private var riskLevelValue: InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb?
        = null

    public var riskLevel: InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb
      get() = requireNotNull(riskLevelValue) { "riskLevel is required" }
      set(`value`) {
        riskLevelValue = value
      }

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    public fun build(): InsightsResourcesPaymentEvaluationSignalV2 {
      check(evaluatedAtValue != null) { "evaluatedAt is required" }
      check(riskLevelValue != null) { "riskLevel is required" }
      check(scoreValue != null) { "score is required" }
      return InsightsResourcesPaymentEvaluationSignalV2(
        evaluatedAt = evaluatedAt,
        riskLevel = riskLevel,
        score = score,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationSignalV2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationSignalV2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationSignalV2 {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationSignalV2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationSignalV2 must be a JSON object")
      val evaluatedAt = json.decodeRequired<Int>(rawObject, "evaluated_at")
      val riskLevel = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb>(rawObject, "risk_level")
      val score = json.decodeRequired<Double>(rawObject, "score")
      return InsightsResourcesPaymentEvaluationSignalV2(
        evaluatedAt = evaluatedAt,
        riskLevel = riskLevel,
        score = score,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationSignalV2) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationSignalV2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("evaluated_at", json.encodeToJsonElement(value.evaluatedAt))
        put("risk_level", json.encodeToJsonElement(value.riskLevel))
        put("score", json.encodeToJsonElement(value.score))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationSignalV2(block: InsightsResourcesPaymentEvaluationSignalV2.Builder.() -> Unit): InsightsResourcesPaymentEvaluationSignalV2 = InsightsResourcesPaymentEvaluationSignalV2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationSignalV2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

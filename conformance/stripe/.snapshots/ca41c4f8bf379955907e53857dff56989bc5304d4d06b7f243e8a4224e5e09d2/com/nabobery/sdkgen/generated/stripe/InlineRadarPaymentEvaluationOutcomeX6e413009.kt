package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineRadarPaymentEvaluationOutcomeX6e413009Branch {
  InsightsResourcesPaymentEvaluationOutcome,
}

public sealed class InlineRadarPaymentEvaluationOutcomeX6e413009DecodingException(
  message: String,
) : SerializationException(message)

public class InlineRadarPaymentEvaluationOutcomeX6e413009NoMatchException(
  message: String,
) : InlineRadarPaymentEvaluationOutcomeX6e413009DecodingException(message)

internal data class InlineRadarPaymentEvaluationOutcomeX6e413009Inspection(
  public val matchesInsightsResourcesPaymentEvaluationOutcome: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInsightsResourcesPaymentEvaluationOutcome).count { it }
}

/**
 * Indicates the final outcome for the payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.payment_evaluation/properties/outcome
 */
@Serializable(with = InlineRadarPaymentEvaluationOutcomeX6e413009.Serializer::class)
public class InlineRadarPaymentEvaluationOutcomeX6e413009 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRadarPaymentEvaluationOutcomeX6e413009Inspection,
) {
  public val insightsResourcesPaymentEvaluationOutcome:
      InsightsResourcesPaymentEvaluationOutcomeView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInsightsResourcesPaymentEvaluationOutcome) json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationOutcomeView>(raw) else null }

  public val matchedBranches: Set<InlineRadarPaymentEvaluationOutcomeX6e413009Branch>
    get() = buildSet {
      if (inspection.matchesInsightsResourcesPaymentEvaluationOutcome) add(InlineRadarPaymentEvaluationOutcomeX6e413009Branch.InsightsResourcesPaymentEvaluationOutcome)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRadarPaymentEvaluationOutcomeX6e413009 {
      val inspection = inspectInlineRadarPaymentEvaluationOutcomeX6e413009(raw)
      if (inspection.matchCount == 0) {
        throw InlineRadarPaymentEvaluationOutcomeX6e413009NoMatchException("InlineRadarPaymentEvaluationOutcomeX6e413009 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRadarPaymentEvaluationOutcomeX6e413009(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineRadarPaymentEvaluationOutcomeX6e413009> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRadarPaymentEvaluationOutcomeX6e413009 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRadarPaymentEvaluationOutcomeX6e413009")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRadarPaymentEvaluationOutcomeX6e413009) {
      encoder.requireJsonEncoder("InlineRadarPaymentEvaluationOutcomeX6e413009").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRadarPaymentEvaluationOutcomeX6e413009(element: JsonElement): InlineRadarPaymentEvaluationOutcomeX6e413009Inspection {
  val raw = element as? JsonObject ?: return InlineRadarPaymentEvaluationOutcomeX6e413009Inspection(
    matchesInsightsResourcesPaymentEvaluationOutcome = false,
    failures = listOf("InsightsResourcesPaymentEvaluationOutcome: expected JSON object"),
  )
  val matchesInsightsResourcesPaymentEvaluationOutcome = raw["type"] != null
  return InlineRadarPaymentEvaluationOutcomeX6e413009Inspection(
    matchesInsightsResourcesPaymentEvaluationOutcome = matchesInsightsResourcesPaymentEvaluationOutcome,
    failures = buildList {
      if (!matchesInsightsResourcesPaymentEvaluationOutcome) add("InsightsResourcesPaymentEvaluationOutcome: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Branch {
  InsightsResourcesPaymentEvaluationMoneyMovementCard,
}

public sealed class InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496NoMatchException(
  message: String,
) : InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496DecodingException(message)

internal data class InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Inspection(
  public val matchesInsightsResourcesPaymentEvaluationMoneyMovementCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInsightsResourcesPaymentEvaluationMoneyMovementCard).count { it }
}

/**
 * Describes card money movement details for the payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_money_movement_details/propert
 * ies/card
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496.Serializer::class)
public class InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Inspection,
) {
  public val insightsResourcesPaymentEvaluationMoneyMovementCard:
      InsightsResourcesPaymentEvaluationMoneyMovementCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInsightsResourcesPaymentEvaluationMoneyMovementCard) json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationMoneyMovementCardView>(raw) else null }

  public val matchedBranches:
      Set<InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Branch>
    get() = buildSet {
      if (inspection.matchesInsightsResourcesPaymentEvaluationMoneyMovementCard) add(InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Branch.InsightsResourcesPaymentEvaluationMoneyMovementCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496 {
      val inspection = inspectInlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496(raw)
      if (inspection.matchCount == 0) {
        throw InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496NoMatchException("InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496) {
      encoder.requireJsonEncoder("InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496(element: JsonElement): InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Inspection {
  val raw = element as? JsonObject ?: return InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Inspection(
    matchesInsightsResourcesPaymentEvaluationMoneyMovementCard = false,
    failures = listOf("InsightsResourcesPaymentEvaluationMoneyMovementCard: expected JSON object"),
  )
  val matchesInsightsResourcesPaymentEvaluationMoneyMovementCard = true
  return InlineInsightsResourcesPaymentEvaluationMoneyMovementDetailsCardX52562496Inspection(
    matchesInsightsResourcesPaymentEvaluationMoneyMovementCard = matchesInsightsResourcesPaymentEvaluationMoneyMovementCard,
    failures = buildList {
      if (!matchesInsightsResourcesPaymentEvaluationMoneyMovementCard) add("InsightsResourcesPaymentEvaluationMoneyMovementCard: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

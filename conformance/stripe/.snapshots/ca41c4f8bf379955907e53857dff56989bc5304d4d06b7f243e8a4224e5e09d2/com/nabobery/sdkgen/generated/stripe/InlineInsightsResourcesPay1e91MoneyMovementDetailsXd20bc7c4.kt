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

public enum class InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Branch {
  InsightsResourcesPaymentEvaluationMoneyMovementDetails,
}

public sealed class InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4NoMatchException(
  message: String,
) : InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4DecodingException(message)

internal data class InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Inspection(
  public val matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails).count { it }
}

/**
 * Details about the payment's customer presence and type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_details/properties/mon
 * ey_movement_details
 */
@Serializable(with = InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4.Serializer::class)
public class InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Inspection,
) {
  public val insightsResourcesPaymentEvaluationMoneyMovementDetails:
      InsightsResourcesPaymentEvaluationMoneyMovementDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails) json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationMoneyMovementDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Branch>
    get() = buildSet {
      if (inspection.matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails) add(InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Branch.InsightsResourcesPaymentEvaluationMoneyMovementDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4 {
      val inspection = inspectInlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4NoMatchException("InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4) {
      encoder.requireJsonEncoder("InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4(element: JsonElement): InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Inspection {
  val raw = element as? JsonObject ?: return InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Inspection(
    matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails = false,
    failures = listOf("InsightsResourcesPaymentEvaluationMoneyMovementDetails: expected JSON object"),
  )
  val matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails = raw["money_movement_type"] != null
  return InlineInsightsResourcesPay1e91MoneyMovementDetailsXd20bc7c4Inspection(
    matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails = matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails,
    failures = buildList {
      if (!matchesInsightsResourcesPaymentEvaluationMoneyMovementDetails) add("InsightsResourcesPaymentEvaluationMoneyMovementDetails: required properties 'money_movement_type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

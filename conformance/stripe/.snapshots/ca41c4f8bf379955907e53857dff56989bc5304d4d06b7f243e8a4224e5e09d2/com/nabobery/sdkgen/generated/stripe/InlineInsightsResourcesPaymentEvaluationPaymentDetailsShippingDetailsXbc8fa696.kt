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

public enum class InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Branch {
  InsightsResourcesPaymentEvaluationShipping,
}

public sealed class InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696NoMatchException(
  message: String,
) : InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696DecodingException(message)

internal data class InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Inspection(
  public val matchesInsightsResourcesPaymentEvaluationShipping: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInsightsResourcesPaymentEvaluationShipping).count { it }
}

/**
 * Shipping details for the payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_details/properties/shi
 * pping_details
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696.Serializer::class)
public class InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Inspection,
) {
  public val insightsResourcesPaymentEvaluationShipping:
      InsightsResourcesPaymentEvaluationShippingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInsightsResourcesPaymentEvaluationShipping) json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationShippingView>(raw) else null }

  public val matchedBranches:
      Set<InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Branch>
    get() = buildSet {
      if (inspection.matchesInsightsResourcesPaymentEvaluationShipping) add(InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Branch.InsightsResourcesPaymentEvaluationShipping)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696 {
      val inspection = inspectInlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696(raw)
      if (inspection.matchCount == 0) {
        throw InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696NoMatchException("InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696) {
      encoder.requireJsonEncoder("InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696(element: JsonElement): InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Inspection {
  val raw = element as? JsonObject ?: return InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Inspection(
    matchesInsightsResourcesPaymentEvaluationShipping = false,
    failures = listOf("InsightsResourcesPaymentEvaluationShipping: expected JSON object"),
  )
  val matchesInsightsResourcesPaymentEvaluationShipping = raw["address"] != null
  return InlineInsightsResourcesPaymentEvaluationPaymentDetailsShippingDetailsXbc8fa696Inspection(
    matchesInsightsResourcesPaymentEvaluationShipping = matchesInsightsResourcesPaymentEvaluationShipping,
    failures = buildList {
      if (!matchesInsightsResourcesPaymentEvaluationShipping) add("InsightsResourcesPaymentEvaluationShipping: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

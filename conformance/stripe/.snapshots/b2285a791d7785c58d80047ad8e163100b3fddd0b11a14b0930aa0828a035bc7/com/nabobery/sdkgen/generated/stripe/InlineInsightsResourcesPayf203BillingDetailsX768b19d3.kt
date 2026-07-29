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

public enum class InlineInsightsResourcesPayf203BillingDetailsX768b19d3Branch {
  InsightsResourcesPaymentEvaluationBillingDetails,
}

public sealed class InlineInsightsResourcesPayf203BillingDetailsX768b19d3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInsightsResourcesPayf203BillingDetailsX768b19d3NoMatchException(
  message: String,
) : InlineInsightsResourcesPayf203BillingDetailsX768b19d3DecodingException(message)

internal data class InlineInsightsResourcesPayf203BillingDetailsX768b19d3Inspection(
  public val matchesInsightsResourcesPaymentEvaluationBillingDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInsightsResourcesPaymentEvaluationBillingDetails).count { it }
}

/**
 * Billing information associated with the payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_method_details/propert
 * ies/billing_details
 */
@Serializable(with = InlineInsightsResourcesPayf203BillingDetailsX768b19d3.Serializer::class)
public class InlineInsightsResourcesPayf203BillingDetailsX768b19d3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInsightsResourcesPayf203BillingDetailsX768b19d3Inspection,
) {
  public val insightsResourcesPaymentEvaluationBillingDetails:
      InsightsResourcesPaymentEvaluationBillingDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInsightsResourcesPaymentEvaluationBillingDetails) json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationBillingDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineInsightsResourcesPayf203BillingDetailsX768b19d3Branch>
    get() = buildSet {
      if (inspection.matchesInsightsResourcesPaymentEvaluationBillingDetails) add(InlineInsightsResourcesPayf203BillingDetailsX768b19d3Branch.InsightsResourcesPaymentEvaluationBillingDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInsightsResourcesPayf203BillingDetailsX768b19d3 {
      val inspection = inspectInlineInsightsResourcesPayf203BillingDetailsX768b19d3(raw)
      if (inspection.matchCount == 0) {
        throw InlineInsightsResourcesPayf203BillingDetailsX768b19d3NoMatchException("InlineInsightsResourcesPayf203BillingDetailsX768b19d3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInsightsResourcesPayf203BillingDetailsX768b19d3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInsightsResourcesPayf203BillingDetailsX768b19d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPayf203BillingDetailsX768b19d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInsightsResourcesPayf203BillingDetailsX768b19d3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPayf203BillingDetailsX768b19d3) {
      encoder.requireJsonEncoder("InlineInsightsResourcesPayf203BillingDetailsX768b19d3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInsightsResourcesPayf203BillingDetailsX768b19d3(element: JsonElement): InlineInsightsResourcesPayf203BillingDetailsX768b19d3Inspection {
  val raw = element as? JsonObject ?: return InlineInsightsResourcesPayf203BillingDetailsX768b19d3Inspection(
    matchesInsightsResourcesPaymentEvaluationBillingDetails = false,
    failures = listOf("InsightsResourcesPaymentEvaluationBillingDetails: expected JSON object"),
  )
  val matchesInsightsResourcesPaymentEvaluationBillingDetails = raw["address"] != null
  return InlineInsightsResourcesPayf203BillingDetailsX768b19d3Inspection(
    matchesInsightsResourcesPaymentEvaluationBillingDetails = matchesInsightsResourcesPaymentEvaluationBillingDetails,
    failures = buildList {
      if (!matchesInsightsResourcesPaymentEvaluationBillingDetails) add("InsightsResourcesPaymentEvaluationBillingDetails: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

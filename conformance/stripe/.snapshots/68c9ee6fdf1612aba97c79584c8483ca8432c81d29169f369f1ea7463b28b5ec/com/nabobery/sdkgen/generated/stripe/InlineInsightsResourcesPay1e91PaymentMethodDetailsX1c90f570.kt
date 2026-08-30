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

public enum class InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Branch {
  InsightsResourcesPaymentEvaluationPaymentMethodDetails,
}

public sealed class InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570NoMatchException(
  message: String,
) : InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570DecodingException(message)

internal data class InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Inspection(
  public val matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails).count { it }
}

/**
 * Details about the payment method used for the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_payment_details/properties/pay
 * ment_method_details
 */
@Serializable(with = InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570.Serializer::class)
public class InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Inspection,
) {
  public val insightsResourcesPaymentEvaluationPaymentMethodDetails:
      InsightsResourcesPaymentEvaluationPaymentMethodDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails) json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationPaymentMethodDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Branch>
    get() = buildSet {
      if (inspection.matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails) add(InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Branch.InsightsResourcesPaymentEvaluationPaymentMethodDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570 {
      val inspection = inspectInlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570(raw)
      if (inspection.matchCount == 0) {
        throw InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570NoMatchException("InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570) {
      encoder.requireJsonEncoder("InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570(element: JsonElement): InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Inspection {
  val raw = element as? JsonObject ?: return InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Inspection(
    matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails = false,
    failures = listOf("InsightsResourcesPaymentEvaluationPaymentMethodDetails: expected JSON object"),
  )
  val matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails = raw["payment_method"] != null
  return InlineInsightsResourcesPay1e91PaymentMethodDetailsX1c90f570Inspection(
    matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails = matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails,
    failures = buildList {
      if (!matchesInsightsResourcesPaymentEvaluationPaymentMethodDetails) add("InsightsResourcesPaymentEvaluationPaymentMethodDetails: required properties 'payment_method' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

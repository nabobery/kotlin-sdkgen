package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InsightsResourcesPaymentEvaluationOutcomeView(
  @SerialName("merchant_blocked")
  public val merchantBlocked: InsightsResourcesPaymentEvaluationMerchantBlocked? = null,
  @SerialName("payment_intent_id")
  public val paymentIntentId: String? = null,
  public val rejected: InsightsResourcesPaymentEvaluationRejected? = null,
  public val succeeded: InsightsResourcesPaymentEvaluationSucceeded? = null,
  public val type: InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113,
)

/**
 * Outcome details for this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_outcome
 */
@Serializable(with = InsightsResourcesPaymentEvaluationOutcome.Serializer::class)
public class InsightsResourcesPaymentEvaluationOutcome(
  /**
   * Indicates the outcome of the payment evaluation.
   */
  public val type: InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113,
  public val merchantBlocked: InsightsResourcesPaymentEvaluationMerchantBlocked? = null,
  /**
   * The PaymentIntent ID associated with the payment evaluation.
   */
  public val paymentIntentId: String? = null,
  public val rejected: InsightsResourcesPaymentEvaluationRejected? = null,
  public val succeeded: InsightsResourcesPaymentEvaluationSucceeded? = null,
) {
  public class Builder {
    private var typeValue: InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113? = null

    public var type: InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var merchantBlocked: InsightsResourcesPaymentEvaluationMerchantBlocked? = null

    /**
     * The PaymentIntent ID associated with the payment evaluation.
     */
    public var paymentIntentId: String? = null

    public var rejected: InsightsResourcesPaymentEvaluationRejected? = null

    public var succeeded: InsightsResourcesPaymentEvaluationSucceeded? = null

    public fun build(): InsightsResourcesPaymentEvaluationOutcome {
      check(typeValue != null) { "type is required" }
      return InsightsResourcesPaymentEvaluationOutcome(
        type = type,
        merchantBlocked = merchantBlocked,
        paymentIntentId = paymentIntentId,
        rejected = rejected,
        succeeded = succeeded,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationOutcome = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationOutcome> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationOutcome {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationOutcome")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationOutcome must be a JSON object")
      val type = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113>(rawObject, "type")
      return InsightsResourcesPaymentEvaluationOutcome(
        type = type,
        merchantBlocked = rawObject["merchant_blocked"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationMerchantBlocked>(it) },
        paymentIntentId = rawObject["payment_intent_id"]?.let { json.decodeFromJsonElement<String>(it) },
        rejected = rawObject["rejected"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationRejected>(it) },
        succeeded = rawObject["succeeded"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationSucceeded>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationOutcome) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationOutcome")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.merchantBlocked?.let { put("merchant_blocked", json.encodeToJsonElement(it)) }
        value.paymentIntentId?.let { put("payment_intent_id", it) }
        value.rejected?.let { put("rejected", json.encodeToJsonElement(it)) }
        value.succeeded?.let { put("succeeded", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationOutcome(block: InsightsResourcesPaymentEvaluationOutcome.Builder.() -> Unit): InsightsResourcesPaymentEvaluationOutcome = InsightsResourcesPaymentEvaluationOutcome.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationOutcome is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

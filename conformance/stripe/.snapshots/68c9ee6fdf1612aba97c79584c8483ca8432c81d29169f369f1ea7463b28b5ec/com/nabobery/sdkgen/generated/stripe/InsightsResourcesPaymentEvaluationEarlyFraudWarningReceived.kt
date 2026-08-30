package com.nabobery.sdkgen.generated.stripe

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
 * Early Fraud Warning Received event details attached to this payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_early_fraud_warning_received
 */
@Serializable(with = InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived.Serializer::class)
public class InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived(
  /**
   * The type of fraud labeled by the issuer.
   */
  public val fraudType: InlineInsightsResourcesPay340aFraudTypeX7e796c46,
) {
  public class Builder {
    private var fraudTypeValue: InlineInsightsResourcesPay340aFraudTypeX7e796c46? = null

    public var fraudType: InlineInsightsResourcesPay340aFraudTypeX7e796c46
      get() = requireNotNull(fraudTypeValue) { "fraudType is required" }
      set(`value`) {
        fraudTypeValue = value
      }

    public fun build(): InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived {
      check(fraudTypeValue != null) { "fraudType is required" }
      return InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived(
        fraudType = fraudType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived must be a JSON object")
      val fraudType = json.decodeRequired<InlineInsightsResourcesPay340aFraudTypeX7e796c46>(rawObject, "fraud_type")
      return InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived(
        fraudType = fraudType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("fraud_type", json.encodeToJsonElement(value.fraudType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationEarlyFraudWarningReceived(block: InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived.Builder.() -> Unit): InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived = InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationEarlyFraudWarningReceived is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

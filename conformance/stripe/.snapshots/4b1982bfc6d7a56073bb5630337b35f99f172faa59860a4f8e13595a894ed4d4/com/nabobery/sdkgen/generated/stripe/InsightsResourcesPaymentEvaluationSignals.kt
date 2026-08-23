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
 * Collection of signals for this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_signals
 */
@Serializable(with = InsightsResourcesPaymentEvaluationSignals.Serializer::class)
public class InsightsResourcesPaymentEvaluationSignals(
  public val fraudulentPayment: InsightsResourcesPaymentEvaluationSignalV2,
) {
  public class Builder {
    private var fraudulentPaymentValue: InsightsResourcesPaymentEvaluationSignalV2? = null

    public var fraudulentPayment: InsightsResourcesPaymentEvaluationSignalV2
      get() = requireNotNull(fraudulentPaymentValue) { "fraudulentPayment is required" }
      set(`value`) {
        fraudulentPaymentValue = value
      }

    public fun build(): InsightsResourcesPaymentEvaluationSignals {
      check(fraudulentPaymentValue != null) { "fraudulentPayment is required" }
      return InsightsResourcesPaymentEvaluationSignals(
        fraudulentPayment = fraudulentPayment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationSignals = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationSignals> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationSignals {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationSignals")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationSignals must be a JSON object")
      val fraudulentPayment = json.decodeRequired<InsightsResourcesPaymentEvaluationSignalV2>(rawObject, "fraudulent_payment")
      return InsightsResourcesPaymentEvaluationSignals(
        fraudulentPayment = fraudulentPayment,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationSignals) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationSignals")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("fraudulent_payment", json.encodeToJsonElement(value.fraudulentPayment))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationSignals(block: InsightsResourcesPaymentEvaluationSignals.Builder.() -> Unit): InsightsResourcesPaymentEvaluationSignals = InsightsResourcesPaymentEvaluationSignals.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationSignals is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

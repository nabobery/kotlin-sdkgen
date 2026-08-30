package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details of an rejected outcome attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_rejected
 */
@Serializable(with = InsightsResourcesPaymentEvaluationRejected.Serializer::class)
public class InsightsResourcesPaymentEvaluationRejected(
  public val card: InsightsResourcesPaymentEvaluationRejectedCard? = null,
) {
  public class Builder {
    public var card: InsightsResourcesPaymentEvaluationRejectedCard? = null

    public fun build(): InsightsResourcesPaymentEvaluationRejected = InsightsResourcesPaymentEvaluationRejected(
      card = card,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationRejected = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationRejected> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationRejected {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationRejected")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationRejected must be a JSON object")
      return InsightsResourcesPaymentEvaluationRejected(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationRejectedCard>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationRejected) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationRejected")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationRejected(block: InsightsResourcesPaymentEvaluationRejected.Builder.() -> Unit): InsightsResourcesPaymentEvaluationRejected = InsightsResourcesPaymentEvaluationRejected.build(block)

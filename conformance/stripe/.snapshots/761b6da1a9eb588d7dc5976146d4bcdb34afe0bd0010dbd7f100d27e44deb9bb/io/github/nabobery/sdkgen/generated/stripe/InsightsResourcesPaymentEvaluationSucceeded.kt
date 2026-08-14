package io.github.nabobery.sdkgen.generated.stripe

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
 * Details of a succeeded outcome attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_succeeded
 */
@Serializable(with = InsightsResourcesPaymentEvaluationSucceeded.Serializer::class)
public class InsightsResourcesPaymentEvaluationSucceeded(
  public val card: InsightsResourcesPaymentEvaluationSucceededCard? = null,
) {
  public class Builder {
    public var card: InsightsResourcesPaymentEvaluationSucceededCard? = null

    public fun build(): InsightsResourcesPaymentEvaluationSucceeded = InsightsResourcesPaymentEvaluationSucceeded(
      card = card,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationSucceeded = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InsightsResourcesPaymentEvaluationSucceeded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationSucceeded {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationSucceeded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationSucceeded must be a JSON object")
      return InsightsResourcesPaymentEvaluationSucceeded(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationSucceededCard>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationSucceeded) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationSucceeded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationSucceeded(block: InsightsResourcesPaymentEvaluationSucceeded.Builder.() -> Unit): InsightsResourcesPaymentEvaluationSucceeded = InsightsResourcesPaymentEvaluationSucceeded.build(block)

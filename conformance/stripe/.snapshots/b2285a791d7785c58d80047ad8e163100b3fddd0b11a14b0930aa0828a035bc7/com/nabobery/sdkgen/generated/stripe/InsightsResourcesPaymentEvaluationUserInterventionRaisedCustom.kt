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
import kotlinx.serialization.json.put

/**
 * User intervention raised custom event details attached to this payment evaluation
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_user_intervention_raised_custo
 * m
 */
@Serializable(with = InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom.Serializer::class)
public class InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom(
  /**
   * Custom type of user intervention raised. The string must use a snake case description for the type of intervention
   * performed.
   */
  public val type: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom {
      check(typeValue != null) { "type is required" }
      return InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationUserInterventionRaisedCustom(block: InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom.Builder.() -> Unit): InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom = InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

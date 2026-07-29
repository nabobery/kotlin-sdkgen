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
 * User intervention raised event details attached to this payment evaluation
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_user_intervention_raised
 */
@Serializable(with = InsightsResourcesPaymentEvaluationUserInterventionRaised.Serializer::class)
public class InsightsResourcesPaymentEvaluationUserInterventionRaised(
  /**
   * Unique identifier for the user intervention event.
   */
  public val key: String,
  /**
   * Type of user intervention raised.
   */
  public val type: InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a,
  public val custom: InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var typeValue:
        InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a? = null

    public var type: InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var custom: InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom? = null

    public fun build(): InsightsResourcesPaymentEvaluationUserInterventionRaised {
      check(keyValue != null) { "key is required" }
      check(typeValue != null) { "type is required" }
      return InsightsResourcesPaymentEvaluationUserInterventionRaised(
        key = key,
        type = type,
        custom = custom,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationUserInterventionRaised = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationUserInterventionRaised> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationUserInterventionRaised {
      val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationUserInterventionRaised")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InsightsResourcesPaymentEvaluationUserInterventionRaised must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val type = json.decodeRequired<InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a>(rawObject, "type")
      return InsightsResourcesPaymentEvaluationUserInterventionRaised(
        key = key,
        type = type,
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<InsightsResourcesPaymentEvaluationUserInterventionRaisedCustom>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InsightsResourcesPaymentEvaluationUserInterventionRaised) {
      val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationUserInterventionRaised")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("type", json.encodeToJsonElement(value.type))
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun insightsResourcesPaymentEvaluationUserInterventionRaised(block: InsightsResourcesPaymentEvaluationUserInterventionRaised.Builder.() -> Unit): InsightsResourcesPaymentEvaluationUserInterventionRaised = InsightsResourcesPaymentEvaluationUserInterventionRaised.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InsightsResourcesPaymentEvaluationUserInterventionRaised is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated

import kotlin.Double
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Breakdown of upstream inference costs
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CostDetails
 */
@Serializable(with = CostDetails.Serializer::class)
public class CostDetails(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferenceCompletionsCost: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferencePromptCost: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferenceCost: Double? = null,
) {
  public class Builder {
    private var upstreamInferenceCompletionsCostValue: Double? = null

    public var upstreamInferenceCompletionsCost: Double
      get() = requireNotNull(upstreamInferenceCompletionsCostValue) { "upstreamInferenceCompletionsCost is required" }
      set(`value`) {
        upstreamInferenceCompletionsCostValue = value
      }

    private var upstreamInferencePromptCostValue: Double? = null

    public var upstreamInferencePromptCost: Double
      get() = requireNotNull(upstreamInferencePromptCostValue) { "upstreamInferencePromptCost is required" }
      set(`value`) {
        upstreamInferencePromptCostValue = value
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var upstreamInferenceCost: Double? = null

    public fun build(): CostDetails {
      check(upstreamInferenceCompletionsCostValue != null) { "upstreamInferenceCompletionsCost is required" }
      check(upstreamInferencePromptCostValue != null) { "upstreamInferencePromptCost is required" }
      return CostDetails(
        upstreamInferenceCompletionsCost = upstreamInferenceCompletionsCost,
        upstreamInferencePromptCost = upstreamInferencePromptCost,
        upstreamInferenceCost = upstreamInferenceCost,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CostDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CostDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CostDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CostDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CostDetails must be a JSON object")
      val upstreamInferenceCompletionsCost = json.decodeRequired<Double>(rawObject, "upstream_inference_completions_cost")
      val upstreamInferencePromptCost = json.decodeRequired<Double>(rawObject, "upstream_inference_prompt_cost")
      return CostDetails(
        upstreamInferenceCompletionsCost = upstreamInferenceCompletionsCost,
        upstreamInferencePromptCost = upstreamInferencePromptCost,
        upstreamInferenceCost = rawObject["upstream_inference_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CostDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CostDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("upstream_inference_completions_cost", json.encodeToJsonElement(value.upstreamInferenceCompletionsCost))
        put("upstream_inference_prompt_cost", json.encodeToJsonElement(value.upstreamInferencePromptCost))
        value.upstreamInferenceCost?.let { put("upstream_inference_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun costDetails(block: CostDetails.Builder.() -> Unit): CostDetails = CostDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CostDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

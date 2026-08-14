package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Usage/allOf/1/properties/cost_details.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Usage/allOf/1/properties/cost_details
 */
@Serializable(with = InlineUsageAllOf2CostDetailsX08abd2be.Serializer::class)
public class InlineUsageAllOf2CostDetailsX08abd2be(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferenceInputCost: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferenceOutputCost: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferenceCost: Double? = null,
) {
  public class Builder {
    private var upstreamInferenceInputCostValue: Double? = null

    public var upstreamInferenceInputCost: Double
      get() = requireNotNull(upstreamInferenceInputCostValue) { "upstreamInferenceInputCost is required" }
      set(`value`) {
        upstreamInferenceInputCostValue = value
      }

    private var upstreamInferenceOutputCostValue: Double? = null

    public var upstreamInferenceOutputCost: Double
      get() = requireNotNull(upstreamInferenceOutputCostValue) { "upstreamInferenceOutputCost is required" }
      set(`value`) {
        upstreamInferenceOutputCostValue = value
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var upstreamInferenceCost: Double? = null

    public fun build(): InlineUsageAllOf2CostDetailsX08abd2be {
      check(upstreamInferenceInputCostValue != null) { "upstreamInferenceInputCost is required" }
      check(upstreamInferenceOutputCostValue != null) { "upstreamInferenceOutputCost is required" }
      return InlineUsageAllOf2CostDetailsX08abd2be(
        upstreamInferenceInputCost = upstreamInferenceInputCost,
        upstreamInferenceOutputCost = upstreamInferenceOutputCost,
        upstreamInferenceCost = upstreamInferenceCost,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsageAllOf2CostDetailsX08abd2be = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsageAllOf2CostDetailsX08abd2be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsageAllOf2CostDetailsX08abd2be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsageAllOf2CostDetailsX08abd2be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsageAllOf2CostDetailsX08abd2be must be a JSON object")
      val upstreamInferenceInputCost = json.decodeRequired<Double>(rawObject, "upstream_inference_input_cost")
      val upstreamInferenceOutputCost = json.decodeRequired<Double>(rawObject, "upstream_inference_output_cost")
      return InlineUsageAllOf2CostDetailsX08abd2be(
        upstreamInferenceInputCost = upstreamInferenceInputCost,
        upstreamInferenceOutputCost = upstreamInferenceOutputCost,
        upstreamInferenceCost = rawObject["upstream_inference_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsageAllOf2CostDetailsX08abd2be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsageAllOf2CostDetailsX08abd2be")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("upstream_inference_input_cost", json.encodeToJsonElement(value.upstreamInferenceInputCost))
        put("upstream_inference_output_cost", json.encodeToJsonElement(value.upstreamInferenceOutputCost))
        value.upstreamInferenceCost?.let { put("upstream_inference_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsageAllOf2CostDetailsX08abd2be(block: InlineUsageAllOf2CostDetailsX08abd2be.Builder.() -> Unit): InlineUsageAllOf2CostDetailsX08abd2be = InlineUsageAllOf2CostDetailsX08abd2be.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsageAllOf2CostDetailsX08abd2be is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

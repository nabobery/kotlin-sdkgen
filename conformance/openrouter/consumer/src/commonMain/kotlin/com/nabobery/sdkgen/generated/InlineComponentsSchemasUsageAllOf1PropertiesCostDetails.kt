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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Usage/allOf/1/properties/cost_details.
 */
@Serializable(with = InlineComponentsSchemasUsageAllOf1PropertiesCostDetails.Serializer::class)
public class InlineComponentsSchemasUsageAllOf1PropertiesCostDetails(
  public val upstreamInferenceInputCost: Double,
  public val upstreamInferenceOutputCost: Double,
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

    public var upstreamInferenceCost: Double? = null

    public fun build(): InlineComponentsSchemasUsageAllOf1PropertiesCostDetails {
      check(upstreamInferenceInputCostValue != null) { "upstreamInferenceInputCost is required" }
      check(upstreamInferenceOutputCostValue != null) { "upstreamInferenceOutputCost is required" }
      return InlineComponentsSchemasUsageAllOf1PropertiesCostDetails(
        upstreamInferenceInputCost = upstreamInferenceInputCost,
        upstreamInferenceOutputCost = upstreamInferenceOutputCost,
        upstreamInferenceCost = upstreamInferenceCost,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasUsageAllOf1PropertiesCostDetails = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUsageAllOf1PropertiesCostDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUsageAllOf1PropertiesCostDetails {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasUsageAllOf1PropertiesCostDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasUsageAllOf1PropertiesCostDetails must be a JSON object")
      val upstreamInferenceInputCost = json.decodeRequired<Double>(raw, "upstream_inference_input_cost")
      val upstreamInferenceOutputCost = json.decodeRequired<Double>(raw, "upstream_inference_output_cost")
      return InlineComponentsSchemasUsageAllOf1PropertiesCostDetails(
        upstreamInferenceInputCost = upstreamInferenceInputCost,
        upstreamInferenceOutputCost = upstreamInferenceOutputCost,
        upstreamInferenceCost = raw["upstream_inference_cost"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasUsageAllOf1PropertiesCostDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasUsageAllOf1PropertiesCostDetails")
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

public fun inlineComponentsSchemasUsageAllOf1PropertiesCostDetails(block: InlineComponentsSchemasUsageAllOf1PropertiesCostDetails.Builder.() -> Unit): InlineComponentsSchemasUsageAllOf1PropertiesCostDetails = InlineComponentsSchemasUsageAllOf1PropertiesCostDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasUsageAllOf1PropertiesCostDetails is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Stop once cumulative cost across the loop exceeds this dollar threshold.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenMaxCost
 */
@Serializable(with = StopServerToolsWhenMaxCost.Serializer::class)
public class StopServerToolsWhenMaxCost(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val maxCostInDollars: Double,
  public val type: InlineStopServerToolsWhenMaxCostTypeXb96d6305,
) {
  public class Builder {
    private var maxCostInDollarsValue: Double? = null

    public var maxCostInDollars: Double
      get() = requireNotNull(maxCostInDollarsValue) { "maxCostInDollars is required" }
      set(`value`) {
        maxCostInDollarsValue = value
      }

    private var typeValue: InlineStopServerToolsWhenMaxCostTypeXb96d6305? = null

    public var type: InlineStopServerToolsWhenMaxCostTypeXb96d6305
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): StopServerToolsWhenMaxCost {
      check(maxCostInDollarsValue != null) { "maxCostInDollars is required" }
      check(typeValue != null) { "type is required" }
      return StopServerToolsWhenMaxCost(
        maxCostInDollars = maxCostInDollars,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StopServerToolsWhenMaxCost = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StopServerToolsWhenMaxCost> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StopServerToolsWhenMaxCost {
      val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenMaxCost")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StopServerToolsWhenMaxCost must be a JSON object")
      val maxCostInDollars = json.decodeRequired<Double>(rawObject, "max_cost_in_dollars")
      val type = json.decodeRequired<InlineStopServerToolsWhenMaxCostTypeXb96d6305>(rawObject, "type")
      return StopServerToolsWhenMaxCost(
        maxCostInDollars = maxCostInDollars,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenMaxCost) {
      val jsonEncoder = encoder.requireJsonEncoder("StopServerToolsWhenMaxCost")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("max_cost_in_dollars", json.encodeToJsonElement(value.maxCostInDollars))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun stopServerToolsWhenMaxCost(block: StopServerToolsWhenMaxCost.Builder.() -> Unit): StopServerToolsWhenMaxCost = StopServerToolsWhenMaxCost.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StopServerToolsWhenMaxCost is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A parameter that accepts any value within an inclusive numeric range.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RangeCapability
 */
@Serializable(with = RangeCapability.Serializer::class)
public class RangeCapability(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val max: Double,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val min: Double,
  public val type: InlineRangeCapabilityTypeX74b77171,
) {
  public class Builder {
    private var maxValue: Double? = null

    public var max: Double
      get() = requireNotNull(maxValue) { "max is required" }
      set(`value`) {
        maxValue = value
      }

    private var minValue: Double? = null

    public var min: Double
      get() = requireNotNull(minValue) { "min is required" }
      set(`value`) {
        minValue = value
      }

    private var typeValue: InlineRangeCapabilityTypeX74b77171? = null

    public var type: InlineRangeCapabilityTypeX74b77171
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RangeCapability {
      check(maxValue != null) { "max is required" }
      check(minValue != null) { "min is required" }
      check(typeValue != null) { "type is required" }
      return RangeCapability(
        max = max,
        min = min,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RangeCapability = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RangeCapability> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RangeCapability {
      val jsonDecoder = decoder.requireJsonDecoder("RangeCapability")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RangeCapability must be a JSON object")
      val max = json.decodeRequired<Double>(rawObject, "max")
      val min = json.decodeRequired<Double>(rawObject, "min")
      val type = json.decodeRequired<InlineRangeCapabilityTypeX74b77171>(rawObject, "type")
      return RangeCapability(
        max = max,
        min = min,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RangeCapability) {
      val jsonEncoder = encoder.requireJsonEncoder("RangeCapability")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("max", json.encodeToJsonElement(value.max))
        put("min", json.encodeToJsonElement(value.min))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun rangeCapability(block: RangeCapability.Builder.() -> Unit): RangeCapability = RangeCapability.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RangeCapability is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

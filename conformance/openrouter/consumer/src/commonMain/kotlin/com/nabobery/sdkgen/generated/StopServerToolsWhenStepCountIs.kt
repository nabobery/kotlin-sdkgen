package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Stop after the agent loop has executed this many steps.
 */
@Serializable(with = StopServerToolsWhenStepCountIs.Serializer::class)
public class StopServerToolsWhenStepCountIs(
  public val stepCount: Int,
  public val type: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType,
) {
  public class Builder {
    private var stepCountValue: Int? = null

    public var stepCount: Int
      get() = requireNotNull(stepCountValue) { "stepCount is required" }
      set(`value`) {
        stepCountValue = value
      }

    private var typeValue: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType? =
        null

    public var type: InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): StopServerToolsWhenStepCountIs {
      check(stepCountValue != null) { "stepCount is required" }
      check(typeValue != null) { "type is required" }
      return StopServerToolsWhenStepCountIs(
        stepCount = stepCount,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StopServerToolsWhenStepCountIs = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<StopServerToolsWhenStepCountIs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StopServerToolsWhenStepCountIs {
      val jsonDecoder = decoder.requireJsonDecoder("StopServerToolsWhenStepCountIs")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("StopServerToolsWhenStepCountIs must be a JSON object")
      val stepCount = json.decodeRequired<Int>(raw, "step_count")
      val type = json.decodeRequired<InlineComponentsSchemasStopServerToolsWhenStepCountIsPropertiesType>(raw, "type")
      return StopServerToolsWhenStepCountIs(
        stepCount = stepCount,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StopServerToolsWhenStepCountIs) {
      val jsonEncoder = encoder.requireJsonEncoder("StopServerToolsWhenStepCountIs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("step_count", json.encodeToJsonElement(value.stepCount))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun stopServerToolsWhenStepCountIs(block: StopServerToolsWhenStepCountIs.Builder.() ->
  Unit): StopServerToolsWhenStepCountIs = StopServerToolsWhenStepCountIs.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("StopServerToolsWhenStepCountIs is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

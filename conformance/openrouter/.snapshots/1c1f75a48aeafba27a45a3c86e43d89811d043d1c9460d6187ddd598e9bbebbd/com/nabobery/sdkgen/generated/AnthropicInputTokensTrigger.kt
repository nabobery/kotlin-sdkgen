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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensTrigger.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensTrigger
 */
@Serializable(with = AnthropicInputTokensTrigger.Serializer::class)
public class AnthropicInputTokensTrigger(
  public val type: InlineAnthropicInputTokensTriggerTypeX8451559b,
  public val `value`: Int,
) {
  public class Builder {
    private var typeValue: InlineAnthropicInputTokensTriggerTypeX8451559b? = null

    public var type: InlineAnthropicInputTokensTriggerTypeX8451559b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: Int? = null

    public var `value`: Int
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): AnthropicInputTokensTrigger {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return AnthropicInputTokensTrigger(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicInputTokensTrigger = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicInputTokensTrigger> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicInputTokensTrigger {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicInputTokensTrigger")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicInputTokensTrigger must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicInputTokensTriggerTypeX8451559b>(rawObject, "type")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return AnthropicInputTokensTrigger(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicInputTokensTrigger) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicInputTokensTrigger")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicInputTokensTrigger(block: AnthropicInputTokensTrigger.Builder.() -> Unit): AnthropicInputTokensTrigger = AnthropicInputTokensTrigger.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicInputTokensTrigger is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

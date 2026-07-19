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

@Serializable
public data class AnthropicThinkingTurnsView(
  public val type: InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType,
  public val `value`: Int,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingTurns.
 */
@Serializable(with = AnthropicThinkingTurns.Serializer::class)
public class AnthropicThinkingTurns(
  public val type: InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType,
  public val `value`: Int,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType
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

    public fun build(): AnthropicThinkingTurns {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return AnthropicThinkingTurns(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicThinkingTurns = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicThinkingTurns> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicThinkingTurns {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicThinkingTurns")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicThinkingTurns must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType>(raw, "type")
      val value = json.decodeRequired<Int>(raw, "value")
      return AnthropicThinkingTurns(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicThinkingTurns) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicThinkingTurns")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicThinkingTurns(block: AnthropicThinkingTurns.Builder.() -> Unit): AnthropicThinkingTurns =
  AnthropicThinkingTurns.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicThinkingTurns is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesTrigger.
 */
@Serializable(with = AnthropicToolUsesTrigger.Serializer::class)
public class AnthropicToolUsesTrigger(
  public val type: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType,
  public val `value`: Int,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType
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

    public fun build(): AnthropicToolUsesTrigger {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return AnthropicToolUsesTrigger(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicToolUsesTrigger = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicToolUsesTrigger> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolUsesTrigger {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolUsesTrigger")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicToolUsesTrigger must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType>(raw, "type")
      val value = json.decodeRequired<Int>(raw, "value")
      return AnthropicToolUsesTrigger(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolUsesTrigger) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicToolUsesTrigger")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicToolUsesTrigger(block: AnthropicToolUsesTrigger.Builder.() -> Unit): AnthropicToolUsesTrigger =
  AnthropicToolUsesTrigger.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicToolUsesTrigger is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20260120Caller.
 */
@Serializable(with = AnthropicCodeExecution20260120Caller.Serializer::class)
public class AnthropicCodeExecution20260120Caller(
  public val toolId: String,
  public val type: InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType,
) {
  public class Builder {
    private var toolIdValue: String? = null

    public var toolId: String
      get() = requireNotNull(toolIdValue) { "toolId is required" }
      set(`value`) {
        toolIdValue = value
      }

    private var typeValue:
        InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicCodeExecution20260120Caller {
      check(toolIdValue != null) { "toolId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicCodeExecution20260120Caller(
        toolId = toolId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCodeExecution20260120Caller = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicCodeExecution20260120Caller> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCodeExecution20260120Caller {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCodeExecution20260120Caller")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicCodeExecution20260120Caller must be a JSON object")
      val toolId = json.decodeRequired<String>(raw, "tool_id")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType>(raw,
        "type")
      return AnthropicCodeExecution20260120Caller(
        toolId = toolId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCodeExecution20260120Caller) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCodeExecution20260120Caller")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_id", value.toolId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCodeExecution20260120Caller(block: AnthropicCodeExecution20260120Caller.Builder.() ->
  Unit): AnthropicCodeExecution20260120Caller = AnthropicCodeExecution20260120Caller.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicCodeExecution20260120Caller is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

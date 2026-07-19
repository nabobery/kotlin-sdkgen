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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResult.
 */
@Serializable(with = AnthropicCodeExecutionToolResult.Serializer::class)
public class AnthropicCodeExecutionToolResult(
  public val content: AnthropicCodeExecutionContent,
  public val toolUseId: String,
  public val type: InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType,
) {
  public class Builder {
    private var contentValue: AnthropicCodeExecutionContent? = null

    public var content: AnthropicCodeExecutionContent
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var toolUseIdValue: String? = null

    public var toolUseId: String
      get() = requireNotNull(toolUseIdValue) { "toolUseId is required" }
      set(`value`) {
        toolUseIdValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType? =
        null

    public var type: InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicCodeExecutionToolResult {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicCodeExecutionToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCodeExecutionToolResult = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicCodeExecutionToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCodeExecutionToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCodeExecutionToolResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicCodeExecutionToolResult must be a JSON object")
      val content = json.decodeRequired<AnthropicCodeExecutionContent>(raw, "content")
      val toolUseId = json.decodeRequired<String>(raw, "tool_use_id")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType>(raw, "type")
      return AnthropicCodeExecutionToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCodeExecutionToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCodeExecutionToolResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("tool_use_id", value.toolUseId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCodeExecutionToolResult(block: AnthropicCodeExecutionToolResult.Builder.() ->
  Unit): AnthropicCodeExecutionToolResult = AnthropicCodeExecutionToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicCodeExecutionToolResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

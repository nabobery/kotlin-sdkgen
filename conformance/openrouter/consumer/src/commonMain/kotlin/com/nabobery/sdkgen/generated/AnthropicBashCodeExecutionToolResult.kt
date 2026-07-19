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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResult.
 */
@Serializable(with = AnthropicBashCodeExecutionToolResult.Serializer::class)
public class AnthropicBashCodeExecutionToolResult(
  public val content: AnthropicBashCodeExecutionContent,
  public val toolUseId: String,
  public val type: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType,
) {
  public class Builder {
    private var contentValue: AnthropicBashCodeExecutionContent? = null

    public var content: AnthropicBashCodeExecutionContent
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

    private var typeValue:
        InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicBashCodeExecutionToolResult {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicBashCodeExecutionToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicBashCodeExecutionToolResult = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicBashCodeExecutionToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBashCodeExecutionToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBashCodeExecutionToolResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicBashCodeExecutionToolResult must be a JSON object")
      val content = json.decodeRequired<AnthropicBashCodeExecutionContent>(raw, "content")
      val toolUseId = json.decodeRequired<String>(raw, "tool_use_id")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType>(raw,
        "type")
      return AnthropicBashCodeExecutionToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBashCodeExecutionToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicBashCodeExecutionToolResult")
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

public fun anthropicBashCodeExecutionToolResult(block: AnthropicBashCodeExecutionToolResult.Builder.() ->
  Unit): AnthropicBashCodeExecutionToolResult = AnthropicBashCodeExecutionToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicBashCodeExecutionToolResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

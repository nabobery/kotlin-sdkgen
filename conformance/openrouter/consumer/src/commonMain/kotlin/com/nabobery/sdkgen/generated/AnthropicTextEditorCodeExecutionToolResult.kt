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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResult.
 */
@Serializable(with = AnthropicTextEditorCodeExecutionToolResult.Serializer::class)
public class AnthropicTextEditorCodeExecutionToolResult(
  public val content: AnthropicTextEditorCodeExecutionContent,
  public val toolUseId: String,
  public val type: InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType,
) {
  public class Builder {
    private var contentValue: AnthropicTextEditorCodeExecutionContent? = null

    public var content: AnthropicTextEditorCodeExecutionContent
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
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicTextEditorCodeExecutionToolResult {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicTextEditorCodeExecutionToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextEditorCodeExecutionToolResult = Builder().apply(block)
      .build()
  }

  public object Serializer : KSerializer<AnthropicTextEditorCodeExecutionToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextEditorCodeExecutionToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextEditorCodeExecutionToolResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicTextEditorCodeExecutionToolResult must be a JSON object")
      val content = json.decodeRequired<AnthropicTextEditorCodeExecutionContent>(raw, "content")
      val toolUseId = json.decodeRequired<String>(raw, "tool_use_id")
      val type = json
        .decodeRequired<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType>(raw, "type")
      return AnthropicTextEditorCodeExecutionToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextEditorCodeExecutionToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextEditorCodeExecutionToolResult")
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

public fun anthropicTextEditorCodeExecutionToolResult(block: AnthropicTextEditorCodeExecutionToolResult.Builder.() ->
  Unit): AnthropicTextEditorCodeExecutionToolResult = AnthropicTextEditorCodeExecutionToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicTextEditorCodeExecutionToolResult is missing required property '" + name +
      "'")
  return decodeFromJsonElement(element)
}

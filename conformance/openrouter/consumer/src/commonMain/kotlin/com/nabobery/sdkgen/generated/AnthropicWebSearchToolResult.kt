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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResult.
 */
@Serializable(with = AnthropicWebSearchToolResult.Serializer::class)
public class AnthropicWebSearchToolResult(
  public val caller: AnthropicCaller,
  public val content: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent,
  public val toolUseId: String,
  public val type: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType,
) {
  public class Builder {
    private var callerValue: AnthropicCaller? = null

    public var caller: AnthropicCaller
      get() = requireNotNull(callerValue) { "caller is required" }
      set(`value`) {
        callerValue = value
      }

    private var contentValue: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent?
        = null

    public var content: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent
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

    private var typeValue: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicWebSearchToolResult {
      check(callerValue != null) { "caller is required" }
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicWebSearchToolResult(
        caller = caller,
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebSearchToolResult = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicWebSearchToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebSearchToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebSearchToolResult")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicWebSearchToolResult must be a JSON object")
      val caller = json.decodeRequired<AnthropicCaller>(raw, "caller")
      val content = json.decodeRequired<InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesContent>(raw,
        "content")
      val toolUseId = json.decodeRequired<String>(raw, "tool_use_id")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType>(raw, "type")
      return AnthropicWebSearchToolResult(
        caller = caller,
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebSearchToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebSearchToolResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("caller", json.encodeToJsonElement(value.caller))
        put("content", json.encodeToJsonElement(value.content))
        put("tool_use_id", value.toolUseId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicWebSearchToolResult(block: AnthropicWebSearchToolResult.Builder.() ->
  Unit): AnthropicWebSearchToolResult = AnthropicWebSearchToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicWebSearchToolResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

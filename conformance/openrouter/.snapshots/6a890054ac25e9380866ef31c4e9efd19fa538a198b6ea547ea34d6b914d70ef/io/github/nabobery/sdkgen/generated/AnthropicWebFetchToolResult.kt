package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResult
 */
@Serializable(with = AnthropicWebFetchToolResult.Serializer::class)
public class AnthropicWebFetchToolResult(
  public val caller: AnthropicCaller,
  public val content: AnthropicWebFetchContent,
  public val toolUseId: String,
  public val type: InlineAnthropicWebFetchToolResultTypeX43274783,
) {
  public class Builder {
    private var callerValue: AnthropicCaller? = null

    public var caller: AnthropicCaller
      get() = requireNotNull(callerValue) { "caller is required" }
      set(`value`) {
        callerValue = value
      }

    private var contentValue: AnthropicWebFetchContent? = null

    public var content: AnthropicWebFetchContent
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

    private var typeValue: InlineAnthropicWebFetchToolResultTypeX43274783? = null

    public var type: InlineAnthropicWebFetchToolResultTypeX43274783
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicWebFetchToolResult {
      check(callerValue != null) { "caller is required" }
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicWebFetchToolResult(
        caller = caller,
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebFetchToolResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicWebFetchToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebFetchToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebFetchToolResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicWebFetchToolResult must be a JSON object")
      val caller = json.decodeRequired<AnthropicCaller>(rawObject, "caller")
      val content = json.decodeRequired<AnthropicWebFetchContent>(rawObject, "content")
      val toolUseId = json.decodeRequired<String>(rawObject, "tool_use_id")
      val type = json.decodeRequired<InlineAnthropicWebFetchToolResultTypeX43274783>(rawObject, "type")
      return AnthropicWebFetchToolResult(
        caller = caller,
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebFetchToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebFetchToolResult")
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

public fun anthropicWebFetchToolResult(block: AnthropicWebFetchToolResult.Builder.() -> Unit): AnthropicWebFetchToolResult = AnthropicWebFetchToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicWebFetchToolResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

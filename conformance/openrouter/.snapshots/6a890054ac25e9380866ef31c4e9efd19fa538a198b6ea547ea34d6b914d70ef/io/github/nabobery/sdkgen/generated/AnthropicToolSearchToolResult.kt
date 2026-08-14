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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchToolResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchToolResult
 */
@Serializable(with = AnthropicToolSearchToolResult.Serializer::class)
public class AnthropicToolSearchToolResult(
  public val content: AnthropicToolSearchContent,
  public val toolUseId: String,
  public val type: InlineAnthropicToolSearchToolResultTypeXa6009ee6,
) {
  public class Builder {
    private var contentValue: AnthropicToolSearchContent? = null

    public var content: AnthropicToolSearchContent
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

    private var typeValue: InlineAnthropicToolSearchToolResultTypeXa6009ee6? = null

    public var type: InlineAnthropicToolSearchToolResultTypeXa6009ee6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicToolSearchToolResult {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicToolSearchToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicToolSearchToolResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicToolSearchToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolSearchToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolSearchToolResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicToolSearchToolResult must be a JSON object")
      val content = json.decodeRequired<AnthropicToolSearchContent>(rawObject, "content")
      val toolUseId = json.decodeRequired<String>(rawObject, "tool_use_id")
      val type = json.decodeRequired<InlineAnthropicToolSearchToolResultTypeXa6009ee6>(rawObject, "type")
      return AnthropicToolSearchToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolSearchToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicToolSearchToolResult")
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

public fun anthropicToolSearchToolResult(block: AnthropicToolSearchToolResult.Builder.() -> Unit): AnthropicToolSearchToolResult = AnthropicToolSearchToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicToolSearchToolResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

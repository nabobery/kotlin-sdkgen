package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorToolResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorToolResult
 */
@Serializable(with = AnthropicAdvisorToolResult.Serializer::class)
public class AnthropicAdvisorToolResult(
  content: Map<String, JsonElement?>,
  public val toolUseId: String,
  public val type: InlineAnthropicAdvisorToolResultTypeXe304c700,
) {
  public val content: Map<String, JsonElement?> = content.toMap()

  public class Builder {
    private var contentValue: Map<String, JsonElement?>? = null

    public var content: Map<String, JsonElement?>
      get() = requireNotNull(contentValue) { "content is required" }.toMap()
      set(`value`) {
        contentValue = value.toMap()
      }

    private var toolUseIdValue: String? = null

    public var toolUseId: String
      get() = requireNotNull(toolUseIdValue) { "toolUseId is required" }
      set(`value`) {
        toolUseIdValue = value
      }

    private var typeValue: InlineAnthropicAdvisorToolResultTypeXe304c700? = null

    public var type: InlineAnthropicAdvisorToolResultTypeXe304c700
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicAdvisorToolResult {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicAdvisorToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicAdvisorToolResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicAdvisorToolResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicAdvisorToolResult {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicAdvisorToolResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicAdvisorToolResult must be a JSON object")
      val content = json.decodeRequired<Map<String, JsonElement?>>(rawObject, "content")
      val toolUseId = json.decodeRequired<String>(rawObject, "tool_use_id")
      val type = json.decodeRequired<InlineAnthropicAdvisorToolResultTypeXe304c700>(rawObject, "type")
      return AnthropicAdvisorToolResult(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicAdvisorToolResult) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicAdvisorToolResult")
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

public fun anthropicAdvisorToolResult(block: AnthropicAdvisorToolResult.Builder.() -> Unit): AnthropicAdvisorToolResult = AnthropicAdvisorToolResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicAdvisorToolResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

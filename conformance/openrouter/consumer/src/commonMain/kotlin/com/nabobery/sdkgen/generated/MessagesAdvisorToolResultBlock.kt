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
 * Advisor tool result from a prior assistant turn, replayed back to the model on the next turn. Mirrors the block
 * Anthropic returns in assistant content when the `advisor_20260301` tool runs.
 */
@Serializable(with = MessagesAdvisorToolResultBlock.Serializer::class)
public class MessagesAdvisorToolResultBlock(
  public val content: Map<String, JsonElement?>,
  public val toolUseId: String,
  public val type: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType,
) {
  public class Builder {
    private var contentValue: Map<String, JsonElement?>? = null

    public var content: Map<String, JsonElement?>
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

    private var typeValue: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType? =
        null

    public var type: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesAdvisorToolResultBlock {
      check(contentValue != null) { "content is required" }
      check(toolUseIdValue != null) { "toolUseId is required" }
      check(typeValue != null) { "type is required" }
      return MessagesAdvisorToolResultBlock(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesAdvisorToolResultBlock = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesAdvisorToolResultBlock> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesAdvisorToolResultBlock {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesAdvisorToolResultBlock")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesAdvisorToolResultBlock must be a JSON object")
      val content = json.decodeRequired<Map<String, JsonElement?>>(raw, "content")
      val toolUseId = json.decodeRequired<String>(raw, "tool_use_id")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType>(raw, "type")
      return MessagesAdvisorToolResultBlock(
        content = content,
        toolUseId = toolUseId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesAdvisorToolResultBlock) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesAdvisorToolResultBlock")
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

public fun messagesAdvisorToolResultBlock(block: MessagesAdvisorToolResultBlock.Builder.() ->
  Unit): MessagesAdvisorToolResultBlock = MessagesAdvisorToolResultBlock.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("MessagesAdvisorToolResultBlock is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

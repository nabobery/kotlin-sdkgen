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
 * Tool response message
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolMessage
 */
@Serializable(with = ChatToolMessage.Serializer::class)
public class ChatToolMessage(
  /**
   * Tool response content
   */
  public val content: InlineChatToolMessageContentX7f7879b5,
  public val role: InlineChatToolMessageRoleXd22779fe,
  /**
   * ID of the assistant message tool call this message responds to
   */
  public val toolCallId: String,
) {
  public class Builder {
    private var contentValue: InlineChatToolMessageContentX7f7879b5? = null

    public var content: InlineChatToolMessageContentX7f7879b5
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineChatToolMessageRoleXd22779fe? = null

    public var role: InlineChatToolMessageRoleXd22779fe
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var toolCallIdValue: String? = null

    public var toolCallId: String
      get() = requireNotNull(toolCallIdValue) { "toolCallId is required" }
      set(`value`) {
        toolCallIdValue = value
      }

    public fun build(): ChatToolMessage {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      check(toolCallIdValue != null) { "toolCallId is required" }
      return ChatToolMessage(
        content = content,
        role = role,
        toolCallId = toolCallId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatToolMessage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatToolMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatToolMessage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatToolMessage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatToolMessage must be a JSON object")
      val content = json.decodeRequired<InlineChatToolMessageContentX7f7879b5>(rawObject, "content")
      val role = json.decodeRequired<InlineChatToolMessageRoleXd22779fe>(rawObject, "role")
      val toolCallId = json.decodeRequired<String>(rawObject, "tool_call_id")
      return ChatToolMessage(
        content = content,
        role = role,
        toolCallId = toolCallId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatToolMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatToolMessage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("role", json.encodeToJsonElement(value.role))
        put("tool_call_id", value.toolCallId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatToolMessage(block: ChatToolMessage.Builder.() -> Unit): ChatToolMessage = ChatToolMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatToolMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * User message
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatUserMessage
 */
@Serializable(with = ChatUserMessage.Serializer::class)
public class ChatUserMessage(
  /**
   * User message content
   */
  public val content: InlineChatUserMessageContentX51a5516a,
  public val role: InlineChatUserMessageRoleXc7a5143a,
  /**
   * Optional name for the user
   */
  public val name: String? = null,
) {
  public class Builder {
    private var contentValue: InlineChatUserMessageContentX51a5516a? = null

    public var content: InlineChatUserMessageContentX51a5516a
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineChatUserMessageRoleXc7a5143a? = null

    public var role: InlineChatUserMessageRoleXc7a5143a
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    /**
     * Optional name for the user
     */
    public var name: String? = null

    public fun build(): ChatUserMessage {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      return ChatUserMessage(
        content = content,
        role = role,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatUserMessage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatUserMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatUserMessage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatUserMessage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatUserMessage must be a JSON object")
      val content = json.decodeRequired<InlineChatUserMessageContentX51a5516a>(rawObject, "content")
      val role = json.decodeRequired<InlineChatUserMessageRoleXc7a5143a>(rawObject, "role")
      return ChatUserMessage(
        content = content,
        role = role,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatUserMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatUserMessage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("role", json.encodeToJsonElement(value.role))
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatUserMessage(block: ChatUserMessage.Builder.() -> Unit): ChatUserMessage = ChatUserMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatUserMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

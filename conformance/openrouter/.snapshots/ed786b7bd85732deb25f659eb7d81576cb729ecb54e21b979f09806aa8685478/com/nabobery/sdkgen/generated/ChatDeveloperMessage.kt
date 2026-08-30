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
 * Developer message
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatDeveloperMessage
 */
@Serializable(with = ChatDeveloperMessage.Serializer::class)
public class ChatDeveloperMessage(
  /**
   * Developer message content
   */
  public val content: InlineChatDeveloperMessageContentX72a11979,
  public val role: InlineChatDeveloperMessageRoleXaca6c656,
  /**
   * Optional name for the developer message
   */
  public val name: String? = null,
) {
  public class Builder {
    private var contentValue: InlineChatDeveloperMessageContentX72a11979? = null

    public var content: InlineChatDeveloperMessageContentX72a11979
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineChatDeveloperMessageRoleXaca6c656? = null

    public var role: InlineChatDeveloperMessageRoleXaca6c656
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    /**
     * Optional name for the developer message
     */
    public var name: String? = null

    public fun build(): ChatDeveloperMessage {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      return ChatDeveloperMessage(
        content = content,
        role = role,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatDeveloperMessage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatDeveloperMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatDeveloperMessage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatDeveloperMessage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatDeveloperMessage must be a JSON object")
      val content = json.decodeRequired<InlineChatDeveloperMessageContentX72a11979>(rawObject, "content")
      val role = json.decodeRequired<InlineChatDeveloperMessageRoleXaca6c656>(rawObject, "role")
      return ChatDeveloperMessage(
        content = content,
        role = role,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatDeveloperMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatDeveloperMessage")
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

public fun chatDeveloperMessage(block: ChatDeveloperMessage.Builder.() -> Unit): ChatDeveloperMessage = ChatDeveloperMessage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatDeveloperMessage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

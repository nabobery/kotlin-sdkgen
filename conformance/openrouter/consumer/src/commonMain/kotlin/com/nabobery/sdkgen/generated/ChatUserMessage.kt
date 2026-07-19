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
 */
@Serializable(with = ChatUserMessage.Serializer::class)
public class ChatUserMessage(
  /**
   * User message content
   */
  public val content: InlineComponentsSchemasChatUserMessagePropertiesContent,
  public val role: InlineComponentsSchemasChatUserMessagePropertiesRole,
  /**
   * Optional name for the user
   */
  public val name: String? = null,
) {
  public class Builder {
    private var contentValue: InlineComponentsSchemasChatUserMessagePropertiesContent? = null

    public var content: InlineComponentsSchemasChatUserMessagePropertiesContent
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineComponentsSchemasChatUserMessagePropertiesRole? = null

    public var role: InlineComponentsSchemasChatUserMessagePropertiesRole
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

  public object Serializer : KSerializer<ChatUserMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatUserMessage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatUserMessage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatUserMessage must be a JSON object")
      val content = json.decodeRequired<InlineComponentsSchemasChatUserMessagePropertiesContent>(raw, "content")
      val role = json.decodeRequired<InlineComponentsSchemasChatUserMessagePropertiesRole>(raw, "role")
      return ChatUserMessage(
        content = content,
        role = role,
        name = raw["name"]?.let { json.decodeFromJsonElement<String>(it) },
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

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
 * System message for setting behavior
 */
@Serializable(with = ChatSystemMessage.Serializer::class)
public class ChatSystemMessage(
  /**
   * System message content
   */
  public val content: InlineComponentsSchemasChatSystemMessagePropertiesContent,
  public val role: InlineComponentsSchemasChatSystemMessagePropertiesRole,
  /**
   * Optional name for the system message
   */
  public val name: String? = null,
) {
  public class Builder {
    private var contentValue: InlineComponentsSchemasChatSystemMessagePropertiesContent? = null

    public var content: InlineComponentsSchemasChatSystemMessagePropertiesContent
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var roleValue: InlineComponentsSchemasChatSystemMessagePropertiesRole? = null

    public var role: InlineComponentsSchemasChatSystemMessagePropertiesRole
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    /**
     * Optional name for the system message
     */
    public var name: String? = null

    public fun build(): ChatSystemMessage {
      check(contentValue != null) { "content is required" }
      check(roleValue != null) { "role is required" }
      return ChatSystemMessage(
        content = content,
        role = role,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatSystemMessage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatSystemMessage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatSystemMessage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatSystemMessage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatSystemMessage must be a JSON object")
      val content = json.decodeRequired<InlineComponentsSchemasChatSystemMessagePropertiesContent>(raw, "content")
      val role = json.decodeRequired<InlineComponentsSchemasChatSystemMessagePropertiesRole>(raw, "role")
      return ChatSystemMessage(
        content = content,
        role = role,
        name = raw["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatSystemMessage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatSystemMessage")
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

public fun chatSystemMessage(block: ChatSystemMessage.Builder.() -> Unit): ChatSystemMessage = ChatSystemMessage
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatSystemMessage is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}

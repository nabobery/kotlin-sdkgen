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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatDelta.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatDelta
 */
@Serializable(with = ChatDelta.Serializer::class)
public class ChatDelta(
  public val content: String,
  public val id: String,
) {
  public class Builder {
    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): ChatDelta {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      return ChatDelta(
        content = content,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatDelta = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatDelta> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatDelta {
      val jsonDecoder = decoder.requireJsonDecoder("ChatDelta")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatDelta must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      val id = json.decodeRequired<String>(rawObject, "id")
      return ChatDelta(
        content = content,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatDelta) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatDelta")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatDelta(block: ChatDelta.Builder.() -> Unit): ChatDelta = ChatDelta.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatDelta is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

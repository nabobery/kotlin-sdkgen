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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatResult.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatResult
 */
@Serializable(with = ChatResult.Serializer::class)
public class ChatResult(
  public val content: String,
  public val id: String,
  public val detail: ChatResultDetail? = null,
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

    public var detail: ChatResultDetail? = null

    public fun build(): ChatResult {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      return ChatResult(
        content = content,
        id = id,
        detail = detail,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatResult {
      val jsonDecoder = decoder.requireJsonDecoder("ChatResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatResult must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      val id = json.decodeRequired<String>(rawObject, "id")
      return ChatResult(
        content = content,
        id = id,
        detail = rawObject["detail"]?.let { json.decodeFromJsonElement<ChatResultDetail>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatResult) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
        put("id", value.id)
        value.detail?.let { put("detail", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatResult(block: ChatResult.Builder.() -> Unit): ChatResult = ChatResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

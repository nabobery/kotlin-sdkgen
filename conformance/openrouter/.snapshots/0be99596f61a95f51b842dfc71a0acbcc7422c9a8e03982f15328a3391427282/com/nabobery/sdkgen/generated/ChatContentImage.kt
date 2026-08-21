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
 * Image content part for vision models
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage
 */
@Serializable(with = ChatContentImage.Serializer::class)
public class ChatContentImage(
  public val imageUrl: InlineChatContentImageImageUrlX70dc2a4c,
  public val type: InlineChatContentImageTypeXff3cc541,
) {
  public class Builder {
    private var imageUrlValue: InlineChatContentImageImageUrlX70dc2a4c? = null

    public var imageUrl: InlineChatContentImageImageUrlX70dc2a4c
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    private var typeValue: InlineChatContentImageTypeXff3cc541? = null

    public var type: InlineChatContentImageTypeXff3cc541
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatContentImage {
      check(imageUrlValue != null) { "imageUrl is required" }
      check(typeValue != null) { "type is required" }
      return ChatContentImage(
        imageUrl = imageUrl,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentImage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatContentImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentImage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatContentImage must be a JSON object")
      val imageUrl = json.decodeRequired<InlineChatContentImageImageUrlX70dc2a4c>(rawObject, "image_url")
      val type = json.decodeRequired<InlineChatContentImageTypeXff3cc541>(rawObject, "type")
      return ChatContentImage(
        imageUrl = imageUrl,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentImage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image_url", json.encodeToJsonElement(value.imageUrl))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentImage(block: ChatContentImage.Builder.() -> Unit): ChatContentImage = ChatContentImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

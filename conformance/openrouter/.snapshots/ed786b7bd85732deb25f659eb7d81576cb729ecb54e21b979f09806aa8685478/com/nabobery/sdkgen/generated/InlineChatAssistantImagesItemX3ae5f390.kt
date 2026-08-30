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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantImages/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantImages/items
 */
@Serializable(with = InlineChatAssistantImagesItemX3ae5f390.Serializer::class)
public class InlineChatAssistantImagesItemX3ae5f390(
  public val imageUrl: InlineChatAssistantImagesItemImageUrlX04b235a2,
) {
  public class Builder {
    private var imageUrlValue: InlineChatAssistantImagesItemImageUrlX04b235a2? = null

    public var imageUrl: InlineChatAssistantImagesItemImageUrlX04b235a2
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    public fun build(): InlineChatAssistantImagesItemX3ae5f390 {
      check(imageUrlValue != null) { "imageUrl is required" }
      return InlineChatAssistantImagesItemX3ae5f390(
        imageUrl = imageUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatAssistantImagesItemX3ae5f390 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatAssistantImagesItemX3ae5f390> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatAssistantImagesItemX3ae5f390 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatAssistantImagesItemX3ae5f390")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatAssistantImagesItemX3ae5f390 must be a JSON object")
      val imageUrl = json.decodeRequired<InlineChatAssistantImagesItemImageUrlX04b235a2>(rawObject, "image_url")
      return InlineChatAssistantImagesItemX3ae5f390(
        imageUrl = imageUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatAssistantImagesItemX3ae5f390) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatAssistantImagesItemX3ae5f390")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image_url", json.encodeToJsonElement(value.imageUrl))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatAssistantImagesItemX3ae5f390(block: InlineChatAssistantImagesItemX3ae5f390.Builder.() -> Unit): InlineChatAssistantImagesItemX3ae5f390 = InlineChatAssistantImagesItemX3ae5f390.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatAssistantImagesItemX3ae5f390 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

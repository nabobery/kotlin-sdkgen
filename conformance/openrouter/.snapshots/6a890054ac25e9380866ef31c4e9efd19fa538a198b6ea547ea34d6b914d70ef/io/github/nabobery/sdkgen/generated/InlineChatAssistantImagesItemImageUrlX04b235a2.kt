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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantImages/items/properties/image_url.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantImages/items/properties/image_url
 */
@Serializable(with = InlineChatAssistantImagesItemImageUrlX04b235a2.Serializer::class)
public class InlineChatAssistantImagesItemImageUrlX04b235a2(
  /**
   * URL or base64-encoded data of the generated image
   */
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineChatAssistantImagesItemImageUrlX04b235a2 {
      check(urlValue != null) { "url is required" }
      return InlineChatAssistantImagesItemImageUrlX04b235a2(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatAssistantImagesItemImageUrlX04b235a2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatAssistantImagesItemImageUrlX04b235a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatAssistantImagesItemImageUrlX04b235a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatAssistantImagesItemImageUrlX04b235a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatAssistantImagesItemImageUrlX04b235a2 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineChatAssistantImagesItemImageUrlX04b235a2(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatAssistantImagesItemImageUrlX04b235a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatAssistantImagesItemImageUrlX04b235a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatAssistantImagesItemImageUrlX04b235a2(block: InlineChatAssistantImagesItemImageUrlX04b235a2.Builder.() -> Unit): InlineChatAssistantImagesItemImageUrlX04b235a2 = InlineChatAssistantImagesItemImageUrlX04b235a2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatAssistantImagesItemImageUrlX04b235a2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

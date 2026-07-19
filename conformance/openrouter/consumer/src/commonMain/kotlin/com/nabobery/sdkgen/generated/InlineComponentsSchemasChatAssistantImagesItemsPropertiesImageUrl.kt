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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantImages/items/properties/image_url.
 */
@Serializable(with = InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl.Serializer::class)
public class InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl(
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

    public fun build(): InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl {
      check(urlValue != null) { "url is required" }
      return InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl must be a " +
          "JSON object")
      val url = json.decodeRequired<String>(raw, "url")
      return InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl(block: InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl.Builder.() -> Unit): InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl = InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}

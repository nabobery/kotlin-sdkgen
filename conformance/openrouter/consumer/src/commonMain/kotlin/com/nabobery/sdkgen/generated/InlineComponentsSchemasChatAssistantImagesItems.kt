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
 */
@Serializable(with = InlineComponentsSchemasChatAssistantImagesItems.Serializer::class)
public class InlineComponentsSchemasChatAssistantImagesItems(
  public val imageUrl: InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl,
) {
  public class Builder {
    private var imageUrlValue: InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl? =
        null

    public var imageUrl: InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    public fun build(): InlineComponentsSchemasChatAssistantImagesItems {
      check(imageUrlValue != null) { "imageUrl is required" }
      return InlineComponentsSchemasChatAssistantImagesItems(
        imageUrl = imageUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatAssistantImagesItems = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatAssistantImagesItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatAssistantImagesItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatAssistantImagesItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatAssistantImagesItems must be a JSON object")
      val imageUrl = json.decodeRequired<InlineComponentsSchemasChatAssistantImagesItemsPropertiesImageUrl>(raw,
        "image_url")
      return InlineComponentsSchemasChatAssistantImagesItems(
        imageUrl = imageUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatAssistantImagesItems) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatAssistantImagesItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image_url", json.encodeToJsonElement(value.imageUrl))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatAssistantImagesItems(block: InlineComponentsSchemasChatAssistantImagesItems
  .Builder.() -> Unit): InlineComponentsSchemasChatAssistantImagesItems =
    InlineComponentsSchemasChatAssistantImagesItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatAssistantImagesItems is missing required property '" +
      name + "'")
  return decodeFromJsonElement(element)
}

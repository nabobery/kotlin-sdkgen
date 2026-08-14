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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage
 */
@Serializable(with = ContentPartImage.Serializer::class)
public class ContentPartImage(
  public val imageUrl: InlineContentPartImageImageUrlX38ea4836,
  public val type: InlineContentPartImageTypeX4e832055,
) {
  public class Builder {
    private var imageUrlValue: InlineContentPartImageImageUrlX38ea4836? = null

    public var imageUrl: InlineContentPartImageImageUrlX38ea4836
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    private var typeValue: InlineContentPartImageTypeX4e832055? = null

    public var type: InlineContentPartImageTypeX4e832055
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContentPartImage {
      check(imageUrlValue != null) { "imageUrl is required" }
      check(typeValue != null) { "type is required" }
      return ContentPartImage(
        imageUrl = imageUrl,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentPartImage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentPartImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentPartImage {
      val jsonDecoder = decoder.requireJsonDecoder("ContentPartImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentPartImage must be a JSON object")
      val imageUrl = json.decodeRequired<InlineContentPartImageImageUrlX38ea4836>(rawObject, "image_url")
      val type = json.decodeRequired<InlineContentPartImageTypeX4e832055>(rawObject, "type")
      return ContentPartImage(
        imageUrl = imageUrl,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentPartImage) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentPartImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image_url", json.encodeToJsonElement(value.imageUrl))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentPartImage(block: ContentPartImage.Builder.() -> Unit): ContentPartImage = ContentPartImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentPartImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

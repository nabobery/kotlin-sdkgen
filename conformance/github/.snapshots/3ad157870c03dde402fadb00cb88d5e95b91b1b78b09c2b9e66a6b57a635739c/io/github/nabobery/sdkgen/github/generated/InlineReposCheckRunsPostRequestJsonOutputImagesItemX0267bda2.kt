package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/output/properties/images/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/output/properties/images/items
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2.Serializer::class)
public class InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2(
  /**
   * The alternative text for the image.
   */
  public val alt: String,
  /**
   * The full URL of the image.
   */
  public val imageUrl: String,
  /**
   * A short image description.
   */
  public val caption: String? = null,
) {
  public class Builder {
    private var altValue: String? = null

    public var alt: String
      get() = requireNotNull(altValue) { "alt is required" }
      set(`value`) {
        altValue = value
      }

    private var imageUrlValue: String? = null

    public var imageUrl: String
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    /**
     * A short image description.
     */
    public var caption: String? = null

    public fun build(): InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2 {
      check(altValue != null) { "alt is required" }
      check(imageUrlValue != null) { "imageUrl is required" }
      return InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2(
        alt = alt,
        imageUrl = imageUrl,
        caption = caption,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2 must be a JSON object")
      val alt = json.decodeRequired<String>(rawObject, "alt")
      val imageUrl = json.decodeRequired<String>(rawObject, "image_url")
      return InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2(
        alt = alt,
        imageUrl = imageUrl,
        caption = rawObject["caption"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alt", value.alt)
        put("image_url", value.imageUrl)
        value.caption?.let { put("caption", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2(block: InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2.Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2 = InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOutputImagesItemX0267bda2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

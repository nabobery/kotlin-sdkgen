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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationResponse/properties/data/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationResponse/properties/data/items
 */
@Serializable(with = InlineImageGenerationResponseDataItemXc3984636.Serializer::class)
public class InlineImageGenerationResponseDataItemXc3984636(
  /**
   * Base64-encoded image bytes
   */
  public val b64Json: String,
  /**
   * Media type (MIME type) of the image, e.g. `image/png`, `image/jpeg`, `image/webp`, `image/svg+xml`. May be omitted
   * if the format could not be determined.
   */
  public val mediaType: String? = null,
) {
  public class Builder {
    private var b64JsonValue: String? = null

    public var b64Json: String
      get() = requireNotNull(b64JsonValue) { "b64Json is required" }
      set(`value`) {
        b64JsonValue = value
      }

    /**
     * Media type (MIME type) of the image, e.g. `image/png`, `image/jpeg`, `image/webp`, `image/svg+xml`. May be
     * omitted if the format could not be determined.
     */
    public var mediaType: String? = null

    public fun build(): InlineImageGenerationResponseDataItemXc3984636 {
      check(b64JsonValue != null) { "b64Json is required" }
      return InlineImageGenerationResponseDataItemXc3984636(
        b64Json = b64Json,
        mediaType = mediaType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineImageGenerationResponseDataItemXc3984636 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineImageGenerationResponseDataItemXc3984636> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationResponseDataItemXc3984636 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationResponseDataItemXc3984636")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineImageGenerationResponseDataItemXc3984636 must be a JSON object")
      val b64Json = json.decodeRequired<String>(rawObject, "b64_json")
      return InlineImageGenerationResponseDataItemXc3984636(
        b64Json = b64Json,
        mediaType = rawObject["media_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationResponseDataItemXc3984636) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineImageGenerationResponseDataItemXc3984636")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("b64_json", value.b64Json)
        value.mediaType?.let { put("media_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineImageGenerationResponseDataItemXc3984636(block: InlineImageGenerationResponseDataItemXc3984636.Builder.() -> Unit): InlineImageGenerationResponseDataItemXc3984636 = InlineImageGenerationResponseDataItemXc3984636.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineImageGenerationResponseDataItemXc3984636 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

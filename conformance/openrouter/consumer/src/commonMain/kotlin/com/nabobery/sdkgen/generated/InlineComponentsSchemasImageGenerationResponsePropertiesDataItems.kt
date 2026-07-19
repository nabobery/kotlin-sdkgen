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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationResponse/properties/data/items.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationResponsePropertiesDataItems.Serializer::class)
public class InlineComponentsSchemasImageGenerationResponsePropertiesDataItems(
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

    public fun build(): InlineComponentsSchemasImageGenerationResponsePropertiesDataItems {
      check(b64JsonValue != null) { "b64Json is required" }
      return InlineComponentsSchemasImageGenerationResponsePropertiesDataItems(
        b64Json = b64Json,
        mediaType = mediaType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasImageGenerationResponsePropertiesDataItems =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationResponsePropertiesDataItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationResponsePropertiesDataItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasImageGenerationResponsePropertiesDataItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasImageGenerationResponsePropertiesDataItems must be a " +
          "JSON object")
      val b64Json = json.decodeRequired<String>(raw, "b64_json")
      return InlineComponentsSchemasImageGenerationResponsePropertiesDataItems(
        b64Json = b64Json,
        mediaType = raw["media_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationResponsePropertiesDataItems) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasImageGenerationResponsePropertiesDataItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("b64_json", value.b64Json)
        value.mediaType?.let { put("media_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasImageGenerationResponsePropertiesDataItems(block: InlineComponentsSchemasImageGenerationResponsePropertiesDataItems.Builder.() -> Unit): InlineComponentsSchemasImageGenerationResponsePropertiesDataItems = InlineComponentsSchemasImageGenerationResponsePropertiesDataItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasImageGenerationResponsePropertiesDataItems is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}

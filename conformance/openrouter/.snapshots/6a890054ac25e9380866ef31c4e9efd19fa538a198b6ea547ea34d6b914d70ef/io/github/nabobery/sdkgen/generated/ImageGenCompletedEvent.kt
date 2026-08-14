package io.github.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class ImageGenCompletedEventView(
  @SerialName("b64_json")
  public val b64Json: String,
  public val created: Int,
  @SerialName("media_type")
  public val mediaType: String? = null,
  public val type: InlineImageGenCompletedEventTypeXa226ef20,
  public val usage: ImageGenerationUsage? = null,
)

/**
 * Emitted when generation completes and the final image is available
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenCompletedEvent
 */
@Serializable(with = ImageGenCompletedEvent.Serializer::class)
public class ImageGenCompletedEvent(
  /**
   * Base64-encoded final image data
   */
  public val b64Json: String,
  /**
   * Unix timestamp (seconds) when the image was generated
   */
  public val created: Int,
  /**
   * The event type
   */
  public val type: InlineImageGenCompletedEventTypeXa226ef20,
  /**
   * Media type (MIME type) of the image, e.g. `image/png`, `image/jpeg`, `image/webp`, `image/svg+xml`. May be omitted
   * if the format could not be determined.
   */
  public val mediaType: String? = null,
  public val usage: ImageGenerationUsage? = null,
) {
  public class Builder {
    private var b64JsonValue: String? = null

    public var b64Json: String
      get() = requireNotNull(b64JsonValue) { "b64Json is required" }
      set(`value`) {
        b64JsonValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var typeValue: InlineImageGenCompletedEventTypeXa226ef20? = null

    public var type: InlineImageGenCompletedEventTypeXa226ef20
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Media type (MIME type) of the image, e.g. `image/png`, `image/jpeg`, `image/webp`, `image/svg+xml`. May be
     * omitted if the format could not be determined.
     */
    public var mediaType: String? = null

    public var usage: ImageGenerationUsage? = null

    public fun build(): ImageGenCompletedEvent {
      check(b64JsonValue != null) { "b64Json is required" }
      check(createdValue != null) { "created is required" }
      check(typeValue != null) { "type is required" }
      return ImageGenCompletedEvent(
        b64Json = b64Json,
        created = created,
        type = type,
        mediaType = mediaType,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenCompletedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageGenCompletedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenCompletedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenCompletedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenCompletedEvent must be a JSON object")
      val b64Json = json.decodeRequired<String>(rawObject, "b64_json")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val type = json.decodeRequired<InlineImageGenCompletedEventTypeXa226ef20>(rawObject, "type")
      return ImageGenCompletedEvent(
        b64Json = b64Json,
        created = created,
        type = type,
        mediaType = rawObject["media_type"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<ImageGenerationUsage>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenCompletedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenCompletedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("b64_json", value.b64Json)
        put("created", json.encodeToJsonElement(value.created))
        put("type", json.encodeToJsonElement(value.type))
        value.mediaType?.let { put("media_type", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenCompletedEvent(block: ImageGenCompletedEvent.Builder.() -> Unit): ImageGenCompletedEvent = ImageGenCompletedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenCompletedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

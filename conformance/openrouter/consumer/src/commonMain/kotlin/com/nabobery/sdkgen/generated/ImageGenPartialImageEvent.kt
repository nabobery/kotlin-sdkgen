package com.nabobery.sdkgen.generated

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
public data class ImageGenPartialImageEventView(
  @SerialName("b64_json")
  public val b64Json: String,
  @SerialName("partial_image_index")
  public val partialImageIndex: Int,
  public val type: InlineComponentsSchemasImageGenPartialImageEventPropertiesType,
)

/**
 * Emitted when a partial image becomes available during streaming generation
 */
@Serializable(with = ImageGenPartialImageEvent.Serializer::class)
public class ImageGenPartialImageEvent(
  /**
   * Base64-encoded partial image data
   */
  public val b64Json: String,
  /**
   * 0-based index indicating which partial image this is in the sequence
   */
  public val partialImageIndex: Int,
  /**
   * The event type
   */
  public val type: InlineComponentsSchemasImageGenPartialImageEventPropertiesType,
) {
  public class Builder {
    private var b64JsonValue: String? = null

    public var b64Json: String
      get() = requireNotNull(b64JsonValue) { "b64Json is required" }
      set(`value`) {
        b64JsonValue = value
      }

    private var partialImageIndexValue: Int? = null

    public var partialImageIndex: Int
      get() = requireNotNull(partialImageIndexValue) { "partialImageIndex is required" }
      set(`value`) {
        partialImageIndexValue = value
      }

    private var typeValue: InlineComponentsSchemasImageGenPartialImageEventPropertiesType? = null

    public var type: InlineComponentsSchemasImageGenPartialImageEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ImageGenPartialImageEvent {
      check(b64JsonValue != null) { "b64Json is required" }
      check(partialImageIndexValue != null) { "partialImageIndex is required" }
      check(typeValue != null) { "type is required" }
      return ImageGenPartialImageEvent(
        b64Json = b64Json,
        partialImageIndex = partialImageIndex,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenPartialImageEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenPartialImageEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenPartialImageEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenPartialImageEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenPartialImageEvent must be a JSON object")
      val b64Json = json.decodeRequired<String>(raw, "b64_json")
      val partialImageIndex = json.decodeRequired<Int>(raw, "partial_image_index")
      val type = json.decodeRequired<InlineComponentsSchemasImageGenPartialImageEventPropertiesType>(raw, "type")
      return ImageGenPartialImageEvent(
        b64Json = b64Json,
        partialImageIndex = partialImageIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenPartialImageEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenPartialImageEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("b64_json", value.b64Json)
        put("partial_image_index", json.encodeToJsonElement(value.partialImageIndex))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenPartialImageEvent(block: ImageGenPartialImageEvent.Builder.() -> Unit): ImageGenPartialImageEvent =
  ImageGenPartialImageEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenPartialImageEvent is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

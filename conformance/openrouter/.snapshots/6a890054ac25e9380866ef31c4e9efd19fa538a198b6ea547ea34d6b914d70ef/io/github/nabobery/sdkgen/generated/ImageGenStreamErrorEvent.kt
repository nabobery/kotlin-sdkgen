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

@Serializable
public data class ImageGenStreamErrorEventView(
  public val error: InlineImageGenStreamErrorEventErrorX040b2483,
  public val type: InlineImageGenStreamErrorEventTypeX1d113202,
)

/**
 * Emitted when streaming generation fails after the SSE response starts
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenStreamErrorEvent
 */
@Serializable(with = ImageGenStreamErrorEvent.Serializer::class)
public class ImageGenStreamErrorEvent(
  /**
   * Provider error details
   */
  public val error: InlineImageGenStreamErrorEventErrorX040b2483,
  /**
   * The event type
   */
  public val type: InlineImageGenStreamErrorEventTypeX1d113202,
) {
  public class Builder {
    private var errorValue: InlineImageGenStreamErrorEventErrorX040b2483? = null

    public var error: InlineImageGenStreamErrorEventErrorX040b2483
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var typeValue: InlineImageGenStreamErrorEventTypeX1d113202? = null

    public var type: InlineImageGenStreamErrorEventTypeX1d113202
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ImageGenStreamErrorEvent {
      check(errorValue != null) { "error is required" }
      check(typeValue != null) { "type is required" }
      return ImageGenStreamErrorEvent(
        error = error,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenStreamErrorEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageGenStreamErrorEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenStreamErrorEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenStreamErrorEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenStreamErrorEvent must be a JSON object")
      val error = json.decodeRequired<InlineImageGenStreamErrorEventErrorX040b2483>(rawObject, "error")
      val type = json.decodeRequired<InlineImageGenStreamErrorEventTypeX1d113202>(rawObject, "type")
      return ImageGenStreamErrorEvent(
        error = error,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenStreamErrorEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenStreamErrorEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", json.encodeToJsonElement(value.error))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenStreamErrorEvent(block: ImageGenStreamErrorEvent.Builder.() -> Unit): ImageGenStreamErrorEvent = ImageGenStreamErrorEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenStreamErrorEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

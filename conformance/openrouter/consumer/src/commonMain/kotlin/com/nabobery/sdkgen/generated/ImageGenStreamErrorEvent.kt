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

@Serializable
public data class ImageGenStreamErrorEventView(
  public val error: InlineComponentsSchemasImageGenStreamErrorEventPropertiesError,
  public val type: InlineComponentsSchemasImageGenStreamErrorEventPropertiesType,
)

/**
 * Emitted when streaming generation fails after the SSE response starts
 */
@Serializable(with = ImageGenStreamErrorEvent.Serializer::class)
public class ImageGenStreamErrorEvent(
  /**
   * Provider error details
   */
  public val error: InlineComponentsSchemasImageGenStreamErrorEventPropertiesError,
  /**
   * The event type
   */
  public val type: InlineComponentsSchemasImageGenStreamErrorEventPropertiesType,
) {
  public class Builder {
    private var errorValue: InlineComponentsSchemasImageGenStreamErrorEventPropertiesError? = null

    public var error: InlineComponentsSchemasImageGenStreamErrorEventPropertiesError
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var typeValue: InlineComponentsSchemasImageGenStreamErrorEventPropertiesType? = null

    public var type: InlineComponentsSchemasImageGenStreamErrorEventPropertiesType
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

  public object Serializer : KSerializer<ImageGenStreamErrorEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenStreamErrorEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenStreamErrorEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenStreamErrorEvent must be a JSON object")
      val error = json.decodeRequired<InlineComponentsSchemasImageGenStreamErrorEventPropertiesError>(raw, "error")
      val type = json.decodeRequired<InlineComponentsSchemasImageGenStreamErrorEventPropertiesType>(raw, "type")
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

public fun imageGenStreamErrorEvent(block: ImageGenStreamErrorEvent.Builder.() -> Unit): ImageGenStreamErrorEvent =
  ImageGenStreamErrorEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenStreamErrorEvent is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

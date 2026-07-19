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
public data class ImageGenTextChunkEventView(
  public val phase: InlineComponentsSchemasImageGenTextChunkEventPropertiesPhase,
  public val text: String,
  public val type: InlineComponentsSchemasImageGenTextChunkEventPropertiesType,
)

/**
 * Emitted when a text chunk becomes available during streaming generation of text-based formats (e.g. SVG)
 */
@Serializable(with = ImageGenTextChunkEvent.Serializer::class)
public class ImageGenTextChunkEvent(
  /**
   * The generation phase this chunk belongs to. `content` is the renderable output; `reasoning` and `draft` are
   * intermediate provider phases.
   */
  public val phase: InlineComponentsSchemasImageGenTextChunkEventPropertiesPhase,
  /**
   * A text fragment of the image being generated (e.g. partial SVG markup)
   */
  public val text: String,
  /**
   * The event type
   */
  public val type: InlineComponentsSchemasImageGenTextChunkEventPropertiesType,
) {
  public class Builder {
    private var phaseValue: InlineComponentsSchemasImageGenTextChunkEventPropertiesPhase? = null

    public var phase: InlineComponentsSchemasImageGenTextChunkEventPropertiesPhase
      get() = requireNotNull(phaseValue) { "phase is required" }
      set(`value`) {
        phaseValue = value
      }

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineComponentsSchemasImageGenTextChunkEventPropertiesType? = null

    public var type: InlineComponentsSchemasImageGenTextChunkEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ImageGenTextChunkEvent {
      check(phaseValue != null) { "phase is required" }
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return ImageGenTextChunkEvent(
        phase = phase,
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenTextChunkEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenTextChunkEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenTextChunkEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenTextChunkEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenTextChunkEvent must be a JSON object")
      val phase = json.decodeRequired<InlineComponentsSchemasImageGenTextChunkEventPropertiesPhase>(raw, "phase")
      val text = json.decodeRequired<String>(raw, "text")
      val type = json.decodeRequired<InlineComponentsSchemasImageGenTextChunkEventPropertiesType>(raw, "type")
      return ImageGenTextChunkEvent(
        phase = phase,
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenTextChunkEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenTextChunkEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("phase", json.encodeToJsonElement(value.phase))
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenTextChunkEvent(block: ImageGenTextChunkEvent.Builder.() -> Unit): ImageGenTextChunkEvent =
  ImageGenTextChunkEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenTextChunkEvent is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

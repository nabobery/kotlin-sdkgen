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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FrameImage/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasFrameImageAllOf1.Serializer::class)
public class InlineComponentsSchemasFrameImageAllOf1(
  /**
   * Whether this image represents the first or last frame of the video
   */
  public val frameType: InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType,
) {
  public class Builder {
    private var frameTypeValue: InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType? = null

    public var frameType: InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType
      get() = requireNotNull(frameTypeValue) { "frameType is required" }
      set(`value`) {
        frameTypeValue = value
      }

    public fun build(): InlineComponentsSchemasFrameImageAllOf1 {
      check(frameTypeValue != null) { "frameType is required" }
      return InlineComponentsSchemasFrameImageAllOf1(
        frameType = frameType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasFrameImageAllOf1 = Builder().apply(block)
      .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFrameImageAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFrameImageAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasFrameImageAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFrameImageAllOf1 must be a JSON object")
      val frameType = json.decodeRequired<InlineComponentsSchemasFrameImageAllOf1PropertiesFrameType>(raw, "frame_type")
      return InlineComponentsSchemasFrameImageAllOf1(
        frameType = frameType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFrameImageAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasFrameImageAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("frame_type", json.encodeToJsonElement(value.frameType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFrameImageAllOf1(block: InlineComponentsSchemasFrameImageAllOf1.Builder.() ->
  Unit): InlineComponentsSchemasFrameImageAllOf1 = InlineComponentsSchemasFrameImageAllOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasFrameImageAllOf1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

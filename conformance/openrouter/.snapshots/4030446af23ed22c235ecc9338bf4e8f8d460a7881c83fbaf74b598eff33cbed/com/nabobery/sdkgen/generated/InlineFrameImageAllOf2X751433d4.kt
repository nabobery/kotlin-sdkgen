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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FrameImage/allOf/1
 */
@Serializable(with = InlineFrameImageAllOf2X751433d4.Serializer::class)
public class InlineFrameImageAllOf2X751433d4(
  /**
   * Whether this image represents the first or last frame of the video
   */
  public val frameType: InlineFrameImageAllOf2FrameTypeXaf9225aa,
) {
  public class Builder {
    private var frameTypeValue: InlineFrameImageAllOf2FrameTypeXaf9225aa? = null

    public var frameType: InlineFrameImageAllOf2FrameTypeXaf9225aa
      get() = requireNotNull(frameTypeValue) { "frameType is required" }
      set(`value`) {
        frameTypeValue = value
      }

    public fun build(): InlineFrameImageAllOf2X751433d4 {
      check(frameTypeValue != null) { "frameType is required" }
      return InlineFrameImageAllOf2X751433d4(
        frameType = frameType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFrameImageAllOf2X751433d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFrameImageAllOf2X751433d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFrameImageAllOf2X751433d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFrameImageAllOf2X751433d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFrameImageAllOf2X751433d4 must be a JSON object")
      val frameType = json.decodeRequired<InlineFrameImageAllOf2FrameTypeXaf9225aa>(rawObject, "frame_type")
      return InlineFrameImageAllOf2X751433d4(
        frameType = frameType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFrameImageAllOf2X751433d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFrameImageAllOf2X751433d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("frame_type", json.encodeToJsonElement(value.frameType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFrameImageAllOf2X751433d4(block: InlineFrameImageAllOf2X751433d4.Builder.() -> Unit): InlineFrameImageAllOf2X751433d4 = InlineFrameImageAllOf2X751433d4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineFrameImageAllOf2X751433d4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

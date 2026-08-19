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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FrameImage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FrameImage
 */
@Serializable(with = FrameImage.Serializer::class)
public class FrameImage(
  /**
   * Whether this image represents the first or last frame of the video
   */
  public val frameType: InlineFrameImageAllOf2FrameTypeXaf9225aa,
  public val imageUrl: InlineContentPartImageImageUrlX38ea4836,
  public val type: InlineContentPartImageTypeX4e832055,
) {
  public class Builder {
    private var frameTypeValue: InlineFrameImageAllOf2FrameTypeXaf9225aa? = null

    public var frameType: InlineFrameImageAllOf2FrameTypeXaf9225aa
      get() = requireNotNull(frameTypeValue) { "frameType is required" }
      set(`value`) {
        frameTypeValue = value
      }

    private var imageUrlValue: InlineContentPartImageImageUrlX38ea4836? = null

    public var imageUrl: InlineContentPartImageImageUrlX38ea4836
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    private var typeValue: InlineContentPartImageTypeX4e832055? = null

    public var type: InlineContentPartImageTypeX4e832055
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FrameImage {
      check(frameTypeValue != null) { "frameType is required" }
      check(imageUrlValue != null) { "imageUrl is required" }
      check(typeValue != null) { "type is required" }
      return FrameImage(
        frameType = frameType,
        imageUrl = imageUrl,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FrameImage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FrameImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FrameImage {
      val jsonDecoder = decoder.requireJsonDecoder("FrameImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FrameImage must be a JSON object")
      val frameType = json.decodeRequired<InlineFrameImageAllOf2FrameTypeXaf9225aa>(rawObject, "frame_type")
      val imageUrl = json.decodeRequired<InlineContentPartImageImageUrlX38ea4836>(rawObject, "image_url")
      val type = json.decodeRequired<InlineContentPartImageTypeX4e832055>(rawObject, "type")
      return FrameImage(
        frameType = frameType,
        imageUrl = imageUrl,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FrameImage) {
      val jsonEncoder = encoder.requireJsonEncoder("FrameImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("frame_type", json.encodeToJsonElement(value.frameType))
        put("image_url", json.encodeToJsonElement(value.imageUrl))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun frameImage(block: FrameImage.Builder.() -> Unit): FrameImage = FrameImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FrameImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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

/**
 * Video input content item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputVideo
 */
@Serializable(with = InputVideo.Serializer::class)
public class InputVideo(
  public val type: InlineInputVideoTypeX11ff9998,
  /**
   * A base64 data URL or remote URL that resolves to a video file
   */
  public val videoUrl: String,
) {
  public class Builder {
    private var typeValue: InlineInputVideoTypeX11ff9998? = null

    public var type: InlineInputVideoTypeX11ff9998
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var videoUrlValue: String? = null

    public var videoUrl: String
      get() = requireNotNull(videoUrlValue) { "videoUrl is required" }
      set(`value`) {
        videoUrlValue = value
      }

    public fun build(): InputVideo {
      check(typeValue != null) { "type is required" }
      check(videoUrlValue != null) { "videoUrl is required" }
      return InputVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InputVideo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InputVideo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputVideo {
      val jsonDecoder = decoder.requireJsonDecoder("InputVideo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InputVideo must be a JSON object")
      val type = json.decodeRequired<InlineInputVideoTypeX11ff9998>(rawObject, "type")
      val videoUrl = json.decodeRequired<String>(rawObject, "video_url")
      return InputVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InputVideo) {
      val jsonEncoder = encoder.requireJsonEncoder("InputVideo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("video_url", value.videoUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inputVideo(block: InputVideo.Builder.() -> Unit): InputVideo = InputVideo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InputVideo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

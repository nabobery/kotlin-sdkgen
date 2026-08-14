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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo
 */
@Serializable(with = ContentPartVideo.Serializer::class)
public class ContentPartVideo(
  public val type: InlineContentPartVideoTypeX92f6d672,
  public val videoUrl: InlineContentPartVideoVideoUrlX710bc07a,
) {
  public class Builder {
    private var typeValue: InlineContentPartVideoTypeX92f6d672? = null

    public var type: InlineContentPartVideoTypeX92f6d672
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var videoUrlValue: InlineContentPartVideoVideoUrlX710bc07a? = null

    public var videoUrl: InlineContentPartVideoVideoUrlX710bc07a
      get() = requireNotNull(videoUrlValue) { "videoUrl is required" }
      set(`value`) {
        videoUrlValue = value
      }

    public fun build(): ContentPartVideo {
      check(typeValue != null) { "type is required" }
      check(videoUrlValue != null) { "videoUrl is required" }
      return ContentPartVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentPartVideo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentPartVideo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentPartVideo {
      val jsonDecoder = decoder.requireJsonDecoder("ContentPartVideo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentPartVideo must be a JSON object")
      val type = json.decodeRequired<InlineContentPartVideoTypeX92f6d672>(rawObject, "type")
      val videoUrl = json.decodeRequired<InlineContentPartVideoVideoUrlX710bc07a>(rawObject, "video_url")
      return ContentPartVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentPartVideo) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentPartVideo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("video_url", json.encodeToJsonElement(value.videoUrl))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentPartVideo(block: ContentPartVideo.Builder.() -> Unit): ContentPartVideo = ContentPartVideo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentPartVideo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

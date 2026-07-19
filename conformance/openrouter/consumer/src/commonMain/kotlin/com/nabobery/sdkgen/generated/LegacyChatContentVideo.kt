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
 * Video input content part (legacy format - deprecated)
 */
@Serializable(with = LegacyChatContentVideo.Serializer::class)
public class LegacyChatContentVideo(
  public val type: InlineComponentsSchemasLegacyChatContentVideoPropertiesType,
  public val videoUrl: LegacyChatContentVideoInput,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasLegacyChatContentVideoPropertiesType? = null

    public var type: InlineComponentsSchemasLegacyChatContentVideoPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var videoUrlValue: LegacyChatContentVideoInput? = null

    public var videoUrl: LegacyChatContentVideoInput
      get() = requireNotNull(videoUrlValue) { "videoUrl is required" }
      set(`value`) {
        videoUrlValue = value
      }

    public fun build(): LegacyChatContentVideo {
      check(typeValue != null) { "type is required" }
      check(videoUrlValue != null) { "videoUrl is required" }
      return LegacyChatContentVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegacyChatContentVideo = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LegacyChatContentVideo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegacyChatContentVideo {
      val jsonDecoder = decoder.requireJsonDecoder("LegacyChatContentVideo")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("LegacyChatContentVideo must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasLegacyChatContentVideoPropertiesType>(raw, "type")
      val videoUrl = json.decodeRequired<LegacyChatContentVideoInput>(raw, "video_url")
      return LegacyChatContentVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegacyChatContentVideo) {
      val jsonEncoder = encoder.requireJsonEncoder("LegacyChatContentVideo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("video_url", json.encodeToJsonElement(value.videoUrl))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun legacyChatContentVideo(block: LegacyChatContentVideo.Builder.() -> Unit): LegacyChatContentVideo =
  LegacyChatContentVideo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LegacyChatContentVideo is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

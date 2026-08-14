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
 * Video input content part
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentVideo
 */
@Serializable(with = ChatContentVideo.Serializer::class)
public class ChatContentVideo(
  public val type: InlineChatContentVideoTypeXd2a2f632,
  public val videoUrl: ChatContentVideoInput,
) {
  public class Builder {
    private var typeValue: InlineChatContentVideoTypeXd2a2f632? = null

    public var type: InlineChatContentVideoTypeXd2a2f632
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var videoUrlValue: ChatContentVideoInput? = null

    public var videoUrl: ChatContentVideoInput
      get() = requireNotNull(videoUrlValue) { "videoUrl is required" }
      set(`value`) {
        videoUrlValue = value
      }

    public fun build(): ChatContentVideo {
      check(typeValue != null) { "type is required" }
      check(videoUrlValue != null) { "videoUrl is required" }
      return ChatContentVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentVideo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatContentVideo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentVideo {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentVideo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatContentVideo must be a JSON object")
      val type = json.decodeRequired<InlineChatContentVideoTypeXd2a2f632>(rawObject, "type")
      val videoUrl = json.decodeRequired<ChatContentVideoInput>(rawObject, "video_url")
      return ChatContentVideo(
        type = type,
        videoUrl = videoUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentVideo) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentVideo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("video_url", json.encodeToJsonElement(value.videoUrl))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentVideo(block: ChatContentVideo.Builder.() -> Unit): ChatContentVideo = ChatContentVideo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentVideo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

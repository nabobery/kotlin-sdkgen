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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio
 */
@Serializable(with = ContentPartAudio.Serializer::class)
public class ContentPartAudio(
  public val audioUrl: InlineContentPartAudioAudioUrlXede97f70,
  public val type: InlineContentPartAudioTypeX8c9ba0d6,
) {
  public class Builder {
    private var audioUrlValue: InlineContentPartAudioAudioUrlXede97f70? = null

    public var audioUrl: InlineContentPartAudioAudioUrlXede97f70
      get() = requireNotNull(audioUrlValue) { "audioUrl is required" }
      set(`value`) {
        audioUrlValue = value
      }

    private var typeValue: InlineContentPartAudioTypeX8c9ba0d6? = null

    public var type: InlineContentPartAudioTypeX8c9ba0d6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContentPartAudio {
      check(audioUrlValue != null) { "audioUrl is required" }
      check(typeValue != null) { "type is required" }
      return ContentPartAudio(
        audioUrl = audioUrl,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentPartAudio = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContentPartAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentPartAudio {
      val jsonDecoder = decoder.requireJsonDecoder("ContentPartAudio")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContentPartAudio must be a JSON object")
      val audioUrl = json.decodeRequired<InlineContentPartAudioAudioUrlXede97f70>(rawObject, "audio_url")
      val type = json.decodeRequired<InlineContentPartAudioTypeX8c9ba0d6>(rawObject, "type")
      return ContentPartAudio(
        audioUrl = audioUrl,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentPartAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentPartAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("audio_url", json.encodeToJsonElement(value.audioUrl))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentPartAudio(block: ContentPartAudio.Builder.() -> Unit): ContentPartAudio = ContentPartAudio.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentPartAudio is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

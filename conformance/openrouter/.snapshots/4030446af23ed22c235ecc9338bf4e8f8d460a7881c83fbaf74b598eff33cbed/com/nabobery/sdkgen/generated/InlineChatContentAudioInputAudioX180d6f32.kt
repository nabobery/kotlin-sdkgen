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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatContentAudio/properties/input_audio.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentAudio/properties/input_audio
 */
@Serializable(with = InlineChatContentAudioInputAudioX180d6f32.Serializer::class)
public class InlineChatContentAudioInputAudioX180d6f32(
  /**
   * Base64 encoded audio data
   */
  public val `data`: String,
  /**
   * Audio format (e.g., wav, mp3, flac, m4a, ogg, aiff, aac, pcm16, pcm24). Supported formats vary by provider.
   */
  public val format: String,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var formatValue: String? = null

    public var format: String
      get() = requireNotNull(formatValue) { "format is required" }
      set(`value`) {
        formatValue = value
      }

    public fun build(): InlineChatContentAudioInputAudioX180d6f32 {
      check(dataValue != null) { "data is required" }
      check(formatValue != null) { "format is required" }
      return InlineChatContentAudioInputAudioX180d6f32(
        data = data,
        format = format,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatContentAudioInputAudioX180d6f32 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatContentAudioInputAudioX180d6f32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatContentAudioInputAudioX180d6f32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatContentAudioInputAudioX180d6f32")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatContentAudioInputAudioX180d6f32 must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val format = json.decodeRequired<String>(rawObject, "format")
      return InlineChatContentAudioInputAudioX180d6f32(
        data = data,
        format = format,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatContentAudioInputAudioX180d6f32) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatContentAudioInputAudioX180d6f32")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("format", value.format)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatContentAudioInputAudioX180d6f32(block: InlineChatContentAudioInputAudioX180d6f32.Builder.() -> Unit): InlineChatContentAudioInputAudioX180d6f32 = InlineChatContentAudioInputAudioX180d6f32.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatContentAudioInputAudioX180d6f32 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

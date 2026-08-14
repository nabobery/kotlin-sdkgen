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
import kotlinx.serialization.json.put

/**
 * Base64-encoded audio to transcribe
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/STTInputAudio
 */
@Serializable(with = SttInputAudio.Serializer::class)
public class SttInputAudio(
  /**
   * Base64-encoded audio data (raw bytes, not a data URI)
   */
  public val `data`: String,
  /**
   * Audio format (e.g., wav, mp3, flac, m4a, ogg, webm, aac). Supported formats vary by provider.
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

    public fun build(): SttInputAudio {
      check(dataValue != null) { "data is required" }
      check(formatValue != null) { "format is required" }
      return SttInputAudio(
        data = data,
        format = format,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SttInputAudio = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SttInputAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SttInputAudio {
      val jsonDecoder = decoder.requireJsonDecoder("SttInputAudio")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SttInputAudio must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val format = json.decodeRequired<String>(rawObject, "format")
      return SttInputAudio(
        data = data,
        format = format,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SttInputAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("SttInputAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("format", value.format)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sttInputAudio(block: SttInputAudio.Builder.() -> Unit): SttInputAudio = SttInputAudio.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SttInputAudio is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

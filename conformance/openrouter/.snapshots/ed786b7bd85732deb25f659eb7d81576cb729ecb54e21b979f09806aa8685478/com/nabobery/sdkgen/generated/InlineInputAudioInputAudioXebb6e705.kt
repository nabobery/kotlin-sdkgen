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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/input_audio.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/input_audio
 */
@Serializable(with = InlineInputAudioInputAudioXebb6e705.Serializer::class)
public class InlineInputAudioInputAudioXebb6e705(
  public val `data`: String,
  public val format: InlineInputAudioInputAudioFormatX012c7ca6,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var formatValue: InlineInputAudioInputAudioFormatX012c7ca6? = null

    public var format: InlineInputAudioInputAudioFormatX012c7ca6
      get() = requireNotNull(formatValue) { "format is required" }
      set(`value`) {
        formatValue = value
      }

    public fun build(): InlineInputAudioInputAudioXebb6e705 {
      check(dataValue != null) { "data is required" }
      check(formatValue != null) { "format is required" }
      return InlineInputAudioInputAudioXebb6e705(
        data = data,
        format = format,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInputAudioInputAudioXebb6e705 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineInputAudioInputAudioXebb6e705> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputAudioInputAudioXebb6e705 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputAudioInputAudioXebb6e705")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInputAudioInputAudioXebb6e705 must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val format = json.decodeRequired<InlineInputAudioInputAudioFormatX012c7ca6>(rawObject, "format")
      return InlineInputAudioInputAudioXebb6e705(
        data = data,
        format = format,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputAudioInputAudioXebb6e705) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInputAudioInputAudioXebb6e705")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("format", json.encodeToJsonElement(value.format))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineInputAudioInputAudioXebb6e705(block: InlineInputAudioInputAudioXebb6e705.Builder.() -> Unit): InlineInputAudioInputAudioXebb6e705 = InlineInputAudioInputAudioXebb6e705.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineInputAudioInputAudioXebb6e705 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * Audio input content item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputAudio
 */
@Serializable(with = InputAudio.Serializer::class)
public class InputAudio(
  public val inputAudio: InlineInputAudioInputAudioXebb6e705,
  public val type: InlineInputAudioTypeX70820ed8,
) {
  public class Builder {
    private var inputAudioValue: InlineInputAudioInputAudioXebb6e705? = null

    public var inputAudio: InlineInputAudioInputAudioXebb6e705
      get() = requireNotNull(inputAudioValue) { "inputAudio is required" }
      set(`value`) {
        inputAudioValue = value
      }

    private var typeValue: InlineInputAudioTypeX70820ed8? = null

    public var type: InlineInputAudioTypeX70820ed8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InputAudio {
      check(inputAudioValue != null) { "inputAudio is required" }
      check(typeValue != null) { "type is required" }
      return InputAudio(
        inputAudio = inputAudio,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InputAudio = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InputAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputAudio {
      val jsonDecoder = decoder.requireJsonDecoder("InputAudio")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InputAudio must be a JSON object")
      val inputAudio = json.decodeRequired<InlineInputAudioInputAudioXebb6e705>(rawObject, "input_audio")
      val type = json.decodeRequired<InlineInputAudioTypeX70820ed8>(rawObject, "type")
      return InputAudio(
        inputAudio = inputAudio,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InputAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("InputAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_audio", json.encodeToJsonElement(value.inputAudio))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inputAudio(block: InputAudio.Builder.() -> Unit): InputAudio = InputAudio.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InputAudio is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

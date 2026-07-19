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
 */
@Serializable(with = InputAudio.Serializer::class)
public class InputAudio(
  public val inputAudio: InlineComponentsSchemasInputAudioPropertiesInputAudio,
  public val type: InlineComponentsSchemasInputAudioPropertiesType,
) {
  public class Builder {
    private var inputAudioValue: InlineComponentsSchemasInputAudioPropertiesInputAudio? = null

    public var inputAudio: InlineComponentsSchemasInputAudioPropertiesInputAudio
      get() = requireNotNull(inputAudioValue) { "inputAudio is required" }
      set(`value`) {
        inputAudioValue = value
      }

    private var typeValue: InlineComponentsSchemasInputAudioPropertiesType? = null

    public var type: InlineComponentsSchemasInputAudioPropertiesType
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

  public object Serializer : KSerializer<InputAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputAudio {
      val jsonDecoder = decoder.requireJsonDecoder("InputAudio")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InputAudio must be a JSON object")
      val inputAudio = json.decodeRequired<InlineComponentsSchemasInputAudioPropertiesInputAudio>(raw, "input_audio")
      val type = json.decodeRequired<InlineComponentsSchemasInputAudioPropertiesType>(raw, "type")
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

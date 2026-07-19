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
 * Audio input content part. Supported audio formats vary by provider.
 */
@Serializable(with = ChatContentAudio.Serializer::class)
public class ChatContentAudio(
  public val inputAudio: InlineComponentsSchemasChatContentAudioPropertiesInputAudio,
  public val type: InlineComponentsSchemasChatContentAudioPropertiesType,
) {
  public class Builder {
    private var inputAudioValue: InlineComponentsSchemasChatContentAudioPropertiesInputAudio? = null

    public var inputAudio: InlineComponentsSchemasChatContentAudioPropertiesInputAudio
      get() = requireNotNull(inputAudioValue) { "inputAudio is required" }
      set(`value`) {
        inputAudioValue = value
      }

    private var typeValue: InlineComponentsSchemasChatContentAudioPropertiesType? = null

    public var type: InlineComponentsSchemasChatContentAudioPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatContentAudio {
      check(inputAudioValue != null) { "inputAudio is required" }
      check(typeValue != null) { "type is required" }
      return ChatContentAudio(
        inputAudio = inputAudio,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentAudio = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatContentAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentAudio {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentAudio")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatContentAudio must be a JSON object")
      val inputAudio = json.decodeRequired<InlineComponentsSchemasChatContentAudioPropertiesInputAudio>(raw,
        "input_audio")
      val type = json.decodeRequired<InlineComponentsSchemasChatContentAudioPropertiesType>(raw, "type")
      return ChatContentAudio(
        inputAudio = inputAudio,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_audio", json.encodeToJsonElement(value.inputAudio))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentAudio(block: ChatContentAudio.Builder.() -> Unit): ChatContentAudio = ChatContentAudio
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentAudio is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}

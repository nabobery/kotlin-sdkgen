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
 * Audio input content part. Supported audio formats vary by provider.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentAudio
 */
@Serializable(with = ChatContentAudio.Serializer::class)
public class ChatContentAudio(
  public val inputAudio: InlineChatContentAudioInputAudioX180d6f32,
  public val type: InlineChatContentAudioTypeXb902f56b,
) {
  public class Builder {
    private var inputAudioValue: InlineChatContentAudioInputAudioX180d6f32? = null

    public var inputAudio: InlineChatContentAudioInputAudioX180d6f32
      get() = requireNotNull(inputAudioValue) { "inputAudio is required" }
      set(`value`) {
        inputAudioValue = value
      }

    private var typeValue: InlineChatContentAudioTypeXb902f56b? = null

    public var type: InlineChatContentAudioTypeXb902f56b
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

  internal object Serializer : KSerializer<ChatContentAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentAudio {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentAudio")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatContentAudio must be a JSON object")
      val inputAudio = json.decodeRequired<InlineChatContentAudioInputAudioX180d6f32>(rawObject, "input_audio")
      val type = json.decodeRequired<InlineChatContentAudioTypeXb902f56b>(rawObject, "type")
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

public fun chatContentAudio(block: ChatContentAudio.Builder.() -> Unit): ChatContentAudio = ChatContentAudio.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentAudio is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

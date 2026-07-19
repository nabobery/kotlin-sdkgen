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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputAudio.
 */
@Serializable(with = ContentPartInputAudio.Serializer::class)
public class ContentPartInputAudio(
  public val inputAudio: MultimodalMedia,
  public val type: InlineComponentsSchemasContentPartInputAudioPropertiesType,
) {
  public class Builder {
    private var inputAudioValue: MultimodalMedia? = null

    public var inputAudio: MultimodalMedia
      get() = requireNotNull(inputAudioValue) { "inputAudio is required" }
      set(`value`) {
        inputAudioValue = value
      }

    private var typeValue: InlineComponentsSchemasContentPartInputAudioPropertiesType? = null

    public var type: InlineComponentsSchemasContentPartInputAudioPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContentPartInputAudio {
      check(inputAudioValue != null) { "inputAudio is required" }
      check(typeValue != null) { "type is required" }
      return ContentPartInputAudio(
        inputAudio = inputAudio,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentPartInputAudio = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContentPartInputAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentPartInputAudio {
      val jsonDecoder = decoder.requireJsonDecoder("ContentPartInputAudio")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ContentPartInputAudio must be a JSON object")
      val inputAudio = json.decodeRequired<MultimodalMedia>(raw, "input_audio")
      val type = json.decodeRequired<InlineComponentsSchemasContentPartInputAudioPropertiesType>(raw, "type")
      return ContentPartInputAudio(
        inputAudio = inputAudio,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentPartInputAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentPartInputAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_audio", json.encodeToJsonElement(value.inputAudio))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentPartInputAudio(block: ContentPartInputAudio.Builder.() -> Unit): ContentPartInputAudio =
  ContentPartInputAudio.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentPartInputAudio is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

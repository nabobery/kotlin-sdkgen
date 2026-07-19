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
 */
@Serializable(with = InlineComponentsSchemasInputAudioPropertiesInputAudio.Serializer::class)
public class InlineComponentsSchemasInputAudioPropertiesInputAudio(
  public val `data`: String,
  public val format: InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var formatValue: InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat?
        = null

    public var format: InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat
      get() = requireNotNull(formatValue) { "format is required" }
      set(`value`) {
        formatValue = value
      }

    public fun build(): InlineComponentsSchemasInputAudioPropertiesInputAudio {
      check(dataValue != null) { "data is required" }
      check(formatValue != null) { "format is required" }
      return InlineComponentsSchemasInputAudioPropertiesInputAudio(
        data = data,
        format = format,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasInputAudioPropertiesInputAudio = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputAudioPropertiesInputAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputAudioPropertiesInputAudio {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasInputAudioPropertiesInputAudio")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasInputAudioPropertiesInputAudio must be a JSON object")
      val data = json.decodeRequired<String>(raw, "data")
      val format = json.decodeRequired<InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat>(raw,
        "format")
      return InlineComponentsSchemasInputAudioPropertiesInputAudio(
        data = data,
        format = format,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputAudioPropertiesInputAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasInputAudioPropertiesInputAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("format", json.encodeToJsonElement(value.format))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasInputAudioPropertiesInputAudio(block: InlineComponentsSchemasInputAudioPropertiesInputAudio.Builder.() -> Unit): InlineComponentsSchemasInputAudioPropertiesInputAudio = InlineComponentsSchemasInputAudioPropertiesInputAudio.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasInputAudioPropertiesInputAudio is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}

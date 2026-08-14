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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio/properties/audio_url.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio/properties/audio_url
 */
@Serializable(with = InlineContentPartAudioAudioUrlXede97f70.Serializer::class)
public class InlineContentPartAudioAudioUrlXede97f70(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineContentPartAudioAudioUrlXede97f70 {
      check(urlValue != null) { "url is required" }
      return InlineContentPartAudioAudioUrlXede97f70(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentPartAudioAudioUrlXede97f70 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentPartAudioAudioUrlXede97f70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentPartAudioAudioUrlXede97f70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentPartAudioAudioUrlXede97f70")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentPartAudioAudioUrlXede97f70 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineContentPartAudioAudioUrlXede97f70(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentPartAudioAudioUrlXede97f70) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentPartAudioAudioUrlXede97f70")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentPartAudioAudioUrlXede97f70(block: InlineContentPartAudioAudioUrlXede97f70.Builder.() -> Unit): InlineContentPartAudioAudioUrlXede97f70 = InlineContentPartAudioAudioUrlXede97f70.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineContentPartAudioAudioUrlXede97f70 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

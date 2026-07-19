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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo/properties/video_url.
 */
@Serializable(with = InlineComponentsSchemasContentPartVideoPropertiesVideoUrl.Serializer::class)
public class InlineComponentsSchemasContentPartVideoPropertiesVideoUrl(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineComponentsSchemasContentPartVideoPropertiesVideoUrl {
      check(urlValue != null) { "url is required" }
      return InlineComponentsSchemasContentPartVideoPropertiesVideoUrl(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasContentPartVideoPropertiesVideoUrl = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartVideoPropertiesVideoUrl> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartVideoPropertiesVideoUrl {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasContentPartVideoPropertiesVideoUrl")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasContentPartVideoPropertiesVideoUrl must be a JSON object")
      val url = json.decodeRequired<String>(raw, "url")
      return InlineComponentsSchemasContentPartVideoPropertiesVideoUrl(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartVideoPropertiesVideoUrl) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasContentPartVideoPropertiesVideoUrl")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasContentPartVideoPropertiesVideoUrl(block: InlineComponentsSchemasContentPartVideoPropertiesVideoUrl.Builder.() -> Unit): InlineComponentsSchemasContentPartVideoPropertiesVideoUrl = InlineComponentsSchemasContentPartVideoPropertiesVideoUrl.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasContentPartVideoPropertiesVideoUrl is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}

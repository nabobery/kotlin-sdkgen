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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo/properties/video_url
 */
@Serializable(with = InlineContentPartVideoVideoUrlX710bc07a.Serializer::class)
public class InlineContentPartVideoVideoUrlX710bc07a(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineContentPartVideoVideoUrlX710bc07a {
      check(urlValue != null) { "url is required" }
      return InlineContentPartVideoVideoUrlX710bc07a(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentPartVideoVideoUrlX710bc07a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentPartVideoVideoUrlX710bc07a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentPartVideoVideoUrlX710bc07a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentPartVideoVideoUrlX710bc07a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentPartVideoVideoUrlX710bc07a must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineContentPartVideoVideoUrlX710bc07a(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentPartVideoVideoUrlX710bc07a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentPartVideoVideoUrlX710bc07a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentPartVideoVideoUrlX710bc07a(block: InlineContentPartVideoVideoUrlX710bc07a.Builder.() -> Unit): InlineContentPartVideoVideoUrlX710bc07a = InlineContentPartVideoVideoUrlX710bc07a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineContentPartVideoVideoUrlX710bc07a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

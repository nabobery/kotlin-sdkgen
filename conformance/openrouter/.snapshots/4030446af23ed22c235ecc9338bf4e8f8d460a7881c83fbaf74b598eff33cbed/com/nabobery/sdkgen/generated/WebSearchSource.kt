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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/WebSearchSource.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchSource
 */
@Serializable(with = WebSearchSource.Serializer::class)
public class WebSearchSource(
  public val type: InlineWebSearchSourceTypeX50e6d83b,
  public val url: String,
) {
  public class Builder {
    private var typeValue: InlineWebSearchSourceTypeX50e6d83b? = null

    public var type: InlineWebSearchSourceTypeX50e6d83b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): WebSearchSource {
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return WebSearchSource(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebSearchSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebSearchSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchSource {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebSearchSource must be a JSON object")
      val type = json.decodeRequired<InlineWebSearchSourceTypeX50e6d83b>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return WebSearchSource(
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchSource) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webSearchSource(block: WebSearchSource.Builder.() -> Unit): WebSearchSource = WebSearchSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebSearchSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

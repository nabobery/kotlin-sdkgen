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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlPdfSource.
 */
@Serializable(with = AnthropicUrlPdfSource.Serializer::class)
public class AnthropicUrlPdfSource(
  public val type: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType,
  public val url: String,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType
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

    public fun build(): AnthropicUrlPdfSource {
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return AnthropicUrlPdfSource(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicUrlPdfSource = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicUrlPdfSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicUrlPdfSource {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicUrlPdfSource")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicUrlPdfSource must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType>(raw, "type")
      val url = json.decodeRequired<String>(raw, "url")
      return AnthropicUrlPdfSource(
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicUrlPdfSource) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicUrlPdfSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicUrlPdfSource(block: AnthropicUrlPdfSource.Builder.() -> Unit): AnthropicUrlPdfSource =
  AnthropicUrlPdfSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicUrlPdfSource is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

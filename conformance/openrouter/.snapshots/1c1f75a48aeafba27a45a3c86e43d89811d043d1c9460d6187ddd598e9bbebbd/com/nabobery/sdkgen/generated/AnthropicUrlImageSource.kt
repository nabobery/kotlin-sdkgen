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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlImageSource.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUrlImageSource
 */
@Serializable(with = AnthropicUrlImageSource.Serializer::class)
public class AnthropicUrlImageSource(
  public val type: InlineAnthropicUrlImageSourceTypeX75f6b6ca,
  public val url: String,
) {
  public class Builder {
    private var typeValue: InlineAnthropicUrlImageSourceTypeX75f6b6ca? = null

    public var type: InlineAnthropicUrlImageSourceTypeX75f6b6ca
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

    public fun build(): AnthropicUrlImageSource {
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return AnthropicUrlImageSource(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicUrlImageSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicUrlImageSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicUrlImageSource {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicUrlImageSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicUrlImageSource must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicUrlImageSourceTypeX75f6b6ca>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return AnthropicUrlImageSource(
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicUrlImageSource) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicUrlImageSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicUrlImageSource(block: AnthropicUrlImageSource.Builder.() -> Unit): AnthropicUrlImageSource = AnthropicUrlImageSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicUrlImageSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

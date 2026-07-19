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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64ImageSource.
 */
@Serializable(with = AnthropicBase64ImageSource.Serializer::class)
public class AnthropicBase64ImageSource(
  public val `data`: String,
  public val mediaType: AnthropicImageMimeType,
  public val type: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var mediaTypeValue: AnthropicImageMimeType? = null

    public var mediaType: AnthropicImageMimeType
      get() = requireNotNull(mediaTypeValue) { "mediaType is required" }
      set(`value`) {
        mediaTypeValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicBase64ImageSource {
      check(dataValue != null) { "data is required" }
      check(mediaTypeValue != null) { "mediaType is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicBase64ImageSource(
        data = data,
        mediaType = mediaType,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicBase64ImageSource = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicBase64ImageSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBase64ImageSource {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBase64ImageSource")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicBase64ImageSource must be a JSON object")
      val data = json.decodeRequired<String>(raw, "data")
      val mediaType = json.decodeRequired<AnthropicImageMimeType>(raw, "media_type")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType>(raw, "type")
      return AnthropicBase64ImageSource(
        data = data,
        mediaType = mediaType,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBase64ImageSource) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicBase64ImageSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("media_type", json.encodeToJsonElement(value.mediaType))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicBase64ImageSource(block: AnthropicBase64ImageSource.Builder.() ->
  Unit): AnthropicBase64ImageSource = AnthropicBase64ImageSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicBase64ImageSource is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class AnthropicPlainTextSourceView(
  public val `data`: String,
  @SerialName("media_type")
  public val mediaType: InlineAnthropicPlainTextSourceMediaTypeXdcddf07d,
  public val type: InlineAnthropicPlainTextSourceTypeX95eafc8e,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource
 */
@Serializable(with = AnthropicPlainTextSource.Serializer::class)
public class AnthropicPlainTextSource(
  public val `data`: String,
  public val mediaType: InlineAnthropicPlainTextSourceMediaTypeXdcddf07d,
  public val type: InlineAnthropicPlainTextSourceTypeX95eafc8e,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var mediaTypeValue: InlineAnthropicPlainTextSourceMediaTypeXdcddf07d? = null

    public var mediaType: InlineAnthropicPlainTextSourceMediaTypeXdcddf07d
      get() = requireNotNull(mediaTypeValue) { "mediaType is required" }
      set(`value`) {
        mediaTypeValue = value
      }

    private var typeValue: InlineAnthropicPlainTextSourceTypeX95eafc8e? = null

    public var type: InlineAnthropicPlainTextSourceTypeX95eafc8e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicPlainTextSource {
      check(dataValue != null) { "data is required" }
      check(mediaTypeValue != null) { "mediaType is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicPlainTextSource(
        data = data,
        mediaType = mediaType,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicPlainTextSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicPlainTextSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicPlainTextSource {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicPlainTextSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicPlainTextSource must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val mediaType = json.decodeRequired<InlineAnthropicPlainTextSourceMediaTypeXdcddf07d>(rawObject, "media_type")
      val type = json.decodeRequired<InlineAnthropicPlainTextSourceTypeX95eafc8e>(rawObject, "type")
      return AnthropicPlainTextSource(
        data = data,
        mediaType = mediaType,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicPlainTextSource) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicPlainTextSource")
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

public fun anthropicPlainTextSource(block: AnthropicPlainTextSource.Builder.() -> Unit): AnthropicPlainTextSource = AnthropicPlainTextSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicPlainTextSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

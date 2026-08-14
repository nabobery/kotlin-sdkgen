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
public data class AnthropicBase64PdfSourceView(
  public val `data`: String,
  @SerialName("media_type")
  public val mediaType: InlineAnthropicBase64PdfSourceMediaTypeX2a71058d,
  public val type: InlineAnthropicBase64PdfSourceTypeX3689578d,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64PdfSource.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64PdfSource
 */
@Serializable(with = AnthropicBase64PdfSource.Serializer::class)
public class AnthropicBase64PdfSource(
  public val `data`: String,
  public val mediaType: InlineAnthropicBase64PdfSourceMediaTypeX2a71058d,
  public val type: InlineAnthropicBase64PdfSourceTypeX3689578d,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var mediaTypeValue: InlineAnthropicBase64PdfSourceMediaTypeX2a71058d? = null

    public var mediaType: InlineAnthropicBase64PdfSourceMediaTypeX2a71058d
      get() = requireNotNull(mediaTypeValue) { "mediaType is required" }
      set(`value`) {
        mediaTypeValue = value
      }

    private var typeValue: InlineAnthropicBase64PdfSourceTypeX3689578d? = null

    public var type: InlineAnthropicBase64PdfSourceTypeX3689578d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicBase64PdfSource {
      check(dataValue != null) { "data is required" }
      check(mediaTypeValue != null) { "mediaType is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicBase64PdfSource(
        data = data,
        mediaType = mediaType,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicBase64PdfSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicBase64PdfSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBase64PdfSource {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBase64PdfSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicBase64PdfSource must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val mediaType = json.decodeRequired<InlineAnthropicBase64PdfSourceMediaTypeX2a71058d>(rawObject, "media_type")
      val type = json.decodeRequired<InlineAnthropicBase64PdfSourceTypeX3689578d>(rawObject, "type")
      return AnthropicBase64PdfSource(
        data = data,
        mediaType = mediaType,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBase64PdfSource) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicBase64PdfSource")
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

public fun anthropicBase64PdfSource(block: AnthropicBase64PdfSource.Builder.() -> Unit): AnthropicBase64PdfSource = AnthropicBase64PdfSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicBase64PdfSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

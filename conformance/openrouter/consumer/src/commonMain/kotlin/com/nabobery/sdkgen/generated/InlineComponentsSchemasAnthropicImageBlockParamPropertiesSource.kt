package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceNoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceDecodingException(message)

public class InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceAmbiguityException(
  message: String,
) : InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageBlockParam/properties/source.
 */
@Serializable(with = InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource.Serializer::class)
public sealed interface InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicBase64ImageSource internal constructor(
    public val `data`: String,
    public val mediaType: AnthropicImageMimeType,
    public val type: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        `data`: String,
        mediaType: AnthropicImageMimeType,
        type: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType,
      ): AnthropicBase64ImageSource = AnthropicBase64ImageSource(
        data = data,
        mediaType = mediaType,
        type = type,
        raw = buildJsonObject {
          put("data", data)
          put("media_type", SdkJson.encodeToJsonElement(mediaType))
          put("type", "base64")
        },
      )
    }
  }

  public class AnthropicUrlImageSource internal constructor(
    public val type: InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType,
        url: String): AnthropicUrlImageSource = AnthropicUrlImageSource(
        type = type,
        url = url,
        raw = buildJsonObject {
          put("type", "url")
          put("url", url)
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceNoMatchException("InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasAnthropicImageBlockParamPropertiesSource(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceNoMatchException("InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceAmbiguityException("InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.dataDecoded && matches.mediaTypeDecoded ->
          AnthropicBase64ImageSource(data = requireNotNull(matches.data), mediaType = requireNotNull(matches
            .mediaType), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Matches && matches.urlDecoded -> AnthropicUrlImageSource(type = requireNotNull(matches
          .typeState2), url = requireNotNull(matches.url), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource) {
      encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceInspection(
  public val typeState1: InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val `data`: String?,
  public val dataDecoded: Boolean,
  public val mediaType: AnthropicImageMimeType?,
  public val mediaTypeDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches && dataDecoded && mediaTypeDecoded) add("AnthropicBase64ImageSource")
      if (typeState2Matches && urlDecoded) add("AnthropicUrlImageSource")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasAnthropicImageBlockParamPropertiesSource(raw: JsonObject): InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicBase64ImageSourcePropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "base64" && typeState1Decoded
  val dataResult = raw["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val mediaTypeResult = raw["media_type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<AnthropicImageMimeType>(element) } }
  val mediaType = mediaTypeResult?.getOrNull()
  val mediaTypeDecoded = mediaTypeResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicUrlImageSourcePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "url" && typeState2Decoded
  val urlResult = raw["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  return InlineComponentsSchemasAnthropicImageBlockParamPropertiesSourceInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    data = data,
    dataDecoded = dataDecoded,
    mediaType = mediaType,
    mediaTypeDecoded = mediaTypeDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    url = url,
    urlDecoded = urlDecoded,
    failures = buildList {
      if (!typeState1Matches || !dataDecoded ||
        !mediaTypeDecoded) add("AnthropicBase64ImageSource: required properties 'type' and 'data' and 'media_type' do " +
          "not match their declared types")
      if (!typeState2Matches ||
        !urlDecoded) add("AnthropicUrlImageSource: required properties 'type' and 'url' do not match their declared " +
          "types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

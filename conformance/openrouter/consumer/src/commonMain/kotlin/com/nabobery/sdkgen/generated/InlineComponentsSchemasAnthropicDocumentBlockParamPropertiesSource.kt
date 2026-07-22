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

public sealed class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceNoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceDecodingException(message)

public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceAmbiguityException(
  message: String,
) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource.Serializer::class)
public sealed interface InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicBase64PdfSource internal constructor(
    public val `data`: String,
    public val mediaType: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType,
    public val type: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        `data`: String,
        mediaType: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType,
        type: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType,
      ): AnthropicBase64PdfSource = AnthropicBase64PdfSource(
        data = data,
        mediaType = mediaType,
        type = type,
        raw = buildJsonObject {
          put("data", data)
          put("media_type", SdkJson.encodeToJsonElement(mediaType))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class AnthropicPlainTextSource internal constructor(
    public val `data`: String,
    public val mediaType: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType,
    public val type: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        `data`: String,
        mediaType: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType,
        type: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesType,
      ): AnthropicPlainTextSource = AnthropicPlainTextSource(
        data = data,
        mediaType = mediaType,
        type = type,
        raw = buildJsonObject {
          put("data", data)
          put("media_type", SdkJson.encodeToJsonElement(mediaType))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 internal constructor(
    public val content:
        InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent,
    public val type:
        InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent,
        type: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2 = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2(
        content = content,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class AnthropicUrlPdfSource internal constructor(
    public val type: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType,
        url: String): AnthropicUrlPdfSource = AnthropicUrlPdfSource(
        type = type,
        url = url,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
          put("url", url)
        },
      )
    }
  }

  public class AnthropicFileDocumentSource internal constructor(
    public val fileId: String,
    public val type: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(fileId: String,
        type: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType): AnthropicFileDocumentSource =
          AnthropicFileDocumentSource(
        fileId = fileId,
        type = type,
        raw = buildJsonObject {
          put("file_id", fileId)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceNoMatchException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceNoMatchException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceAmbiguityException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.dataDecoded && matches.mediaTypeState1Decoded && matches.typeState1Decoded ->
          AnthropicBase64PdfSource(data = requireNotNull(matches.data), mediaType = requireNotNull(matches
            .mediaTypeState1), type = requireNotNull(matches.typeState1), raw = raw)
        matches.dataDecoded && matches.mediaTypeState2Decoded && matches.typeState4Decoded ->
          AnthropicPlainTextSource(data = requireNotNull(matches.data), mediaType = requireNotNull(matches
            .mediaTypeState2), type = requireNotNull(matches.typeState4), raw = raw)
        matches.contentDecoded && matches.typeState2Decoded ->
          InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2(content = requireNotNull(matches
            .content), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState5Decoded && matches.urlDecoded -> AnthropicUrlPdfSource(type = requireNotNull(matches
          .typeState5), url = requireNotNull(matches.url), raw = raw)
        matches.fileIdDecoded && matches.typeState3Decoded -> AnthropicFileDocumentSource(fileId =
          requireNotNull(matches.fileId), type = requireNotNull(matches.typeState3), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource) {
      encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceInspection(
  public val `data`: String?,
  public val dataDecoded: Boolean,
  public val mediaTypeState1: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType?,
  public val mediaTypeState1Decoded: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType?,
  public val typeState1Decoded: Boolean,
  public val mediaTypeState2: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType?,
  public val mediaTypeState2Decoded: Boolean,
  public val typeState4: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesType?,
  public val typeState4Decoded: Boolean,
  public val content:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent?,
  public val contentDecoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState5: InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType?,
  public val typeState5Decoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val fileId: String?,
  public val fileIdDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType?,
  public val typeState3Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (dataDecoded && mediaTypeState1Decoded && typeState1Decoded) add("AnthropicBase64PdfSource")
      if (dataDecoded && mediaTypeState2Decoded && typeState4Decoded) add("AnthropicPlainTextSource")
      if (contentDecoded &&
        typeState2Decoded) add("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2")
      if (typeState5Decoded && urlDecoded) add("AnthropicUrlPdfSource")
      if (fileIdDecoded && typeState3Decoded) add("AnthropicFileDocumentSource")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource(raw: JsonObject): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceInspection {
  val dataResult = raw["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val mediaTypeState1Result = raw["media_type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesMediaType>(element) } }
  val mediaTypeState1 = mediaTypeState1Result?.getOrNull()
  val mediaTypeState1Decoded = mediaTypeState1Result?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicBase64PdfSourcePropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val mediaTypeState2Result = raw["media_type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType>(element) } }
  val mediaTypeState2 = mediaTypeState2Result?.getOrNull()
  val mediaTypeState2Decoded = mediaTypeState2Result?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicPlainTextSourcePropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesContent>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2PropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicUrlPdfSourcePropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val urlResult = raw["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  val fileIdResult = raw["file_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val fileId = fileIdResult?.getOrNull()
  val fileIdDecoded = fileIdResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceInspection(
    data = data,
    dataDecoded = dataDecoded,
    mediaTypeState1 = mediaTypeState1,
    mediaTypeState1Decoded = mediaTypeState1Decoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    mediaTypeState2 = mediaTypeState2,
    mediaTypeState2Decoded = mediaTypeState2Decoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    content = content,
    contentDecoded = contentDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    url = url,
    urlDecoded = urlDecoded,
    fileId = fileId,
    fileIdDecoded = fileIdDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    failures = buildList {
      if (!dataDecoded || !mediaTypeState1Decoded ||
        !typeState1Decoded) add("AnthropicBase64PdfSource: required properties 'data' and 'media_type' and 'type' do " +
          "not match their declared types")
      if (!dataDecoded || !mediaTypeState2Decoded ||
        !typeState4Decoded) add("AnthropicPlainTextSource: required properties 'data' and 'media_type' and 'type' do " +
          "not match their declared types")
      if (!contentDecoded ||
        !typeState2Decoded) add("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2: required " +
          "properties 'content' and 'type' do not match their declared types")
      if (!typeState5Decoded ||
        !urlDecoded) add("AnthropicUrlPdfSource: required properties 'type' and 'url' do not match their declared " +
          "types")
      if (!fileIdDecoded ||
        !typeState3Decoded) add("AnthropicFileDocumentSource: required properties 'file_id' and 'type' do not match " +
          "their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

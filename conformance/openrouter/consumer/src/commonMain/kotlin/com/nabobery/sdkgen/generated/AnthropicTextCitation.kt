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

public sealed class AnthropicTextCitationDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicTextCitationNoMatchException(
  message: String,
) : AnthropicTextCitationDecodingException(message)

public class AnthropicTextCitationAmbiguityException(
  message: String,
) : AnthropicTextCitationDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextCitation.
 */
@Serializable(with = AnthropicTextCitation.Serializer::class)
public sealed interface AnthropicTextCitation {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicCitationCharLocation internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endCharIndex: Int,
    public val fileId: String?,
    public val startCharIndex: Int,
    public val type: InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextCitation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        documentIndex: Int,
        documentTitle: String?,
        endCharIndex: Int,
        fileId: String?,
        startCharIndex: Int,
        type: InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType,
      ): AnthropicCitationCharLocation = AnthropicCitationCharLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endCharIndex = endCharIndex,
        fileId = fileId,
        startCharIndex = startCharIndex,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_char_index", SdkJson.encodeToJsonElement(endCharIndex))
          put("file_id", fileId)
          put("start_char_index", SdkJson.encodeToJsonElement(startCharIndex))
          put("type", "char_location")
        },
      )
    }
  }

  public class AnthropicCitationPageLocation internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endPageNumber: Int,
    public val fileId: String?,
    public val startPageNumber: Int,
    public val type: InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextCitation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        documentIndex: Int,
        documentTitle: String?,
        endPageNumber: Int,
        fileId: String?,
        startPageNumber: Int,
        type: InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType,
      ): AnthropicCitationPageLocation = AnthropicCitationPageLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endPageNumber = endPageNumber,
        fileId = fileId,
        startPageNumber = startPageNumber,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_page_number", SdkJson.encodeToJsonElement(endPageNumber))
          put("file_id", fileId)
          put("start_page_number", SdkJson.encodeToJsonElement(startPageNumber))
          put("type", "page_location")
        },
      )
    }
  }

  public class AnthropicCitationContentBlockLocation internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endBlockIndex: Int,
    public val fileId: String?,
    public val startBlockIndex: Int,
    public val type: InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextCitation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        documentIndex: Int,
        documentTitle: String?,
        endBlockIndex: Int,
        fileId: String?,
        startBlockIndex: Int,
        type: InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType,
      ): AnthropicCitationContentBlockLocation = AnthropicCitationContentBlockLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endBlockIndex = endBlockIndex,
        fileId = fileId,
        startBlockIndex = startBlockIndex,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_block_index", SdkJson.encodeToJsonElement(endBlockIndex))
          put("file_id", fileId)
          put("start_block_index", SdkJson.encodeToJsonElement(startBlockIndex))
          put("type", "content_block_location")
        },
      )
    }
  }

  public class AnthropicCitationWebSearchResultLocation internal constructor(
    public val citedText: String,
    public val encryptedIndex: String,
    public val title: String?,
    public val type: InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextCitation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        encryptedIndex: String,
        title: String?,
        type: InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType,
        url: String,
      ): AnthropicCitationWebSearchResultLocation = AnthropicCitationWebSearchResultLocation(
        citedText = citedText,
        encryptedIndex = encryptedIndex,
        title = title,
        type = type,
        url = url,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("encrypted_index", encryptedIndex)
          put("title", title)
          put("type", "web_search_result_location")
          put("url", url)
        },
      )
    }
  }

  public class AnthropicCitationSearchResultLocation internal constructor(
    public val citedText: String,
    public val endBlockIndex: Int,
    public val searchResultIndex: Int,
    public val source: String,
    public val startBlockIndex: Int,
    public val title: String?,
    public val type: InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicTextCitation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        endBlockIndex: Int,
        searchResultIndex: Int,
        source: String,
        startBlockIndex: Int,
        title: String?,
        type: InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType,
      ): AnthropicCitationSearchResultLocation = AnthropicCitationSearchResultLocation(
        citedText = citedText,
        endBlockIndex = endBlockIndex,
        searchResultIndex = searchResultIndex,
        source = source,
        startBlockIndex = startBlockIndex,
        title = title,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("end_block_index", SdkJson.encodeToJsonElement(endBlockIndex))
          put("search_result_index", SdkJson.encodeToJsonElement(searchResultIndex))
          put("source", source)
          put("start_block_index", SdkJson.encodeToJsonElement(startBlockIndex))
          put("title", title)
          put("type", "search_result_location")
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicTextCitation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextCitation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextCitation")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: expected JSON object")
      val matches = inspectAnthropicTextCitation(raw)
      if (matches.size == 0) {
        throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.citedTextDecoded && matches.documentIndexDecoded && matches
          .documentTitlePresent && matches.documentTitleDecoded && matches.endCharIndexDecoded && matches
            .fileIdPresent && matches.fileIdDecoded && matches.startCharIndexDecoded ->
              AnthropicCitationCharLocation(citedText = requireNotNull(matches.citedText), documentIndex =
                requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle, endCharIndex =
                  requireNotNull(matches.endCharIndex), fileId = matches.fileId, startCharIndex =
                    requireNotNull(matches.startCharIndex), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState3Matches && matches.citedTextDecoded && matches.documentIndexDecoded && matches
          .documentTitlePresent && matches.documentTitleDecoded && matches.endPageNumberDecoded && matches
            .fileIdPresent && matches.fileIdDecoded && matches.startPageNumberDecoded ->
              AnthropicCitationPageLocation(citedText = requireNotNull(matches.citedText), documentIndex =
                requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle, endPageNumber =
                  requireNotNull(matches.endPageNumber), fileId = matches.fileId, startPageNumber =
                    requireNotNull(matches.startPageNumber), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState2Matches && matches.citedTextDecoded && matches.documentIndexDecoded && matches
          .documentTitlePresent && matches.documentTitleDecoded && matches.endBlockIndexDecoded && matches
            .fileIdPresent && matches.fileIdDecoded && matches.startBlockIndexDecoded ->
              AnthropicCitationContentBlockLocation(citedText = requireNotNull(matches.citedText), documentIndex =
                requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle, endBlockIndex =
                  requireNotNull(matches.endBlockIndex), fileId = matches.fileId, startBlockIndex =
                    requireNotNull(matches.startBlockIndex), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState5Matches && matches.citedTextDecoded && matches.encryptedIndexDecoded && matches
          .titlePresent && matches.titleDecoded && matches.urlDecoded ->
            AnthropicCitationWebSearchResultLocation(citedText = requireNotNull(matches.citedText), encryptedIndex =
              requireNotNull(matches.encryptedIndex), title = matches.title, type = requireNotNull(matches.typeState5),
                url = requireNotNull(matches.url), raw = raw)
        matches.typeState4Matches && matches.citedTextDecoded && matches.endBlockIndexDecoded && matches
          .searchResultIndexDecoded && matches.sourceDecoded && matches.startBlockIndexDecoded && matches
            .titlePresent && matches.titleDecoded -> AnthropicCitationSearchResultLocation(citedText =
              requireNotNull(matches.citedText), endBlockIndex = requireNotNull(matches.endBlockIndex),
                searchResultIndex = requireNotNull(matches.searchResultIndex), source = requireNotNull(matches.source),
                  startBlockIndex = requireNotNull(matches.startBlockIndex), title = matches.title, type =
                    requireNotNull(matches.typeState4), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextCitation) {
      encoder.requireJsonEncoder("AnthropicTextCitation").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicTextCitationInspection(
  public val typeState1: InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val citedText: String?,
  public val citedTextDecoded: Boolean,
  public val documentIndex: Int?,
  public val documentIndexDecoded: Boolean,
  public val documentTitle: String?,
  public val documentTitlePresent: Boolean,
  public val documentTitleDecoded: Boolean,
  public val endCharIndex: Int?,
  public val endCharIndexDecoded: Boolean,
  public val fileId: String?,
  public val fileIdPresent: Boolean,
  public val fileIdDecoded: Boolean,
  public val startCharIndex: Int?,
  public val startCharIndexDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val endPageNumber: Int?,
  public val endPageNumberDecoded: Boolean,
  public val startPageNumber: Int?,
  public val startPageNumberDecoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val endBlockIndex: Int?,
  public val endBlockIndexDecoded: Boolean,
  public val startBlockIndex: Int?,
  public val startBlockIndexDecoded: Boolean,
  public val typeState5:
      InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val encryptedIndex: String?,
  public val encryptedIndexDecoded: Boolean,
  public val title: String?,
  public val titlePresent: Boolean,
  public val titleDecoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val typeState4:
      InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val searchResultIndex: Int?,
  public val searchResultIndexDecoded: Boolean,
  public val source: String?,
  public val sourceDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches && citedTextDecoded && documentIndexDecoded && documentTitlePresent &&
        documentTitleDecoded && endCharIndexDecoded && fileIdPresent && fileIdDecoded &&
          startCharIndexDecoded) add("AnthropicCitationCharLocation")
      if (typeState3Matches && citedTextDecoded && documentIndexDecoded && documentTitlePresent &&
        documentTitleDecoded && endPageNumberDecoded && fileIdPresent && fileIdDecoded &&
          startPageNumberDecoded) add("AnthropicCitationPageLocation")
      if (typeState2Matches && citedTextDecoded && documentIndexDecoded && documentTitlePresent &&
        documentTitleDecoded && endBlockIndexDecoded && fileIdPresent && fileIdDecoded &&
          startBlockIndexDecoded) add("AnthropicCitationContentBlockLocation")
      if (typeState5Matches && citedTextDecoded && encryptedIndexDecoded && titlePresent && titleDecoded &&
        urlDecoded) add("AnthropicCitationWebSearchResultLocation")
      if (typeState4Matches && citedTextDecoded && endBlockIndexDecoded && searchResultIndexDecoded && sourceDecoded &&
        startBlockIndexDecoded && titlePresent && titleDecoded) add("AnthropicCitationSearchResultLocation")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicTextCitation(raw: JsonObject): AnthropicTextCitationInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationCharLocationPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "char_location" && typeState1Decoded
  val citedTextResult = raw["cited_text"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val citedText = citedTextResult?.getOrNull()
  val citedTextDecoded = citedTextResult?.isSuccess == true
  val documentIndexResult = raw["document_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val documentIndex = documentIndexResult?.getOrNull()
  val documentIndexDecoded = documentIndexResult?.isSuccess == true
  val documentTitleResult = raw["document_title"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String?>(element) } }
  val documentTitle = documentTitleResult?.getOrNull()
  val documentTitlePresent = raw.containsKey("document_title")
  val documentTitleDecoded = documentTitleResult?.isSuccess == true
  val endCharIndexResult = raw["end_char_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val endCharIndex = endCharIndexResult?.getOrNull()
  val endCharIndexDecoded = endCharIndexResult?.isSuccess == true
  val fileIdResult = raw["file_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val fileId = fileIdResult?.getOrNull()
  val fileIdPresent = raw.containsKey("file_id")
  val fileIdDecoded = fileIdResult?.isSuccess == true
  val startCharIndexResult = raw["start_char_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val startCharIndex = startCharIndexResult?.getOrNull()
  val startCharIndexDecoded = startCharIndexResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationPageLocationPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "page_location" && typeState3Decoded
  val endPageNumberResult = raw["end_page_number"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val endPageNumber = endPageNumberResult?.getOrNull()
  val endPageNumberDecoded = endPageNumberResult?.isSuccess == true
  val startPageNumberResult = raw["start_page_number"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val startPageNumber = startPageNumberResult?.getOrNull()
  val startPageNumberDecoded = startPageNumberResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationContentBlockLocationPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "content_block_location" && typeState2Decoded
  val endBlockIndexResult = raw["end_block_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val endBlockIndex = endBlockIndexResult?.getOrNull()
  val endBlockIndexDecoded = endBlockIndexResult?.isSuccess == true
  val startBlockIndexResult = raw["start_block_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val startBlockIndex = startBlockIndexResult?.getOrNull()
  val startBlockIndexDecoded = startBlockIndexResult?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationWebSearchResultLocationPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = raw.stringValue("type") == "web_search_result_location" && typeState5Decoded
  val encryptedIndexResult = raw["encrypted_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val encryptedIndex = encryptedIndexResult?.getOrNull()
  val encryptedIndexDecoded = encryptedIndexResult?.isSuccess == true
  val titleResult = raw["title"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val title = titleResult?.getOrNull()
  val titlePresent = raw.containsKey("title")
  val titleDecoded = titleResult?.isSuccess == true
  val urlResult = raw["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationSearchResultLocationPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "search_result_location" && typeState4Decoded
  val searchResultIndexResult = raw["search_result_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val searchResultIndex = searchResultIndexResult?.getOrNull()
  val searchResultIndexDecoded = searchResultIndexResult?.isSuccess == true
  val sourceResult = raw["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val source = sourceResult?.getOrNull()
  val sourceDecoded = sourceResult?.isSuccess == true
  return AnthropicTextCitationInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    citedText = citedText,
    citedTextDecoded = citedTextDecoded,
    documentIndex = documentIndex,
    documentIndexDecoded = documentIndexDecoded,
    documentTitle = documentTitle,
    documentTitlePresent = documentTitlePresent,
    documentTitleDecoded = documentTitleDecoded,
    endCharIndex = endCharIndex,
    endCharIndexDecoded = endCharIndexDecoded,
    fileId = fileId,
    fileIdPresent = fileIdPresent,
    fileIdDecoded = fileIdDecoded,
    startCharIndex = startCharIndex,
    startCharIndexDecoded = startCharIndexDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    endPageNumber = endPageNumber,
    endPageNumberDecoded = endPageNumberDecoded,
    startPageNumber = startPageNumber,
    startPageNumberDecoded = startPageNumberDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    endBlockIndex = endBlockIndex,
    endBlockIndexDecoded = endBlockIndexDecoded,
    startBlockIndex = startBlockIndex,
    startBlockIndexDecoded = startBlockIndexDecoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    encryptedIndex = encryptedIndex,
    encryptedIndexDecoded = encryptedIndexDecoded,
    title = title,
    titlePresent = titlePresent,
    titleDecoded = titleDecoded,
    url = url,
    urlDecoded = urlDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    searchResultIndex = searchResultIndex,
    searchResultIndexDecoded = searchResultIndexDecoded,
    source = source,
    sourceDecoded = sourceDecoded,
    failures = buildList {
      if (!typeState1Matches || !citedTextDecoded || !documentIndexDecoded || !documentTitlePresent ||
        !documentTitleDecoded || !endCharIndexDecoded || !fileIdPresent || !fileIdDecoded ||
          !startCharIndexDecoded) add("AnthropicCitationCharLocation: required properties 'type' and 'cited_text' and " +
            "'document_index' and 'document_title' and 'end_char_index' and 'file_id' and 'start_char_index' do not " +
            "match their declared types")
      if (!typeState3Matches || !citedTextDecoded || !documentIndexDecoded || !documentTitlePresent ||
        !documentTitleDecoded || !endPageNumberDecoded || !fileIdPresent || !fileIdDecoded ||
          !startPageNumberDecoded) add("AnthropicCitationPageLocation: required properties 'type' and 'cited_text' " +
            "and 'document_index' and 'document_title' and 'end_page_number' and 'file_id' and 'start_page_number' do " +
            "not match their declared types")
      if (!typeState2Matches || !citedTextDecoded || !documentIndexDecoded || !documentTitlePresent ||
        !documentTitleDecoded || !endBlockIndexDecoded || !fileIdPresent || !fileIdDecoded ||
          !startBlockIndexDecoded) add("AnthropicCitationContentBlockLocation: required properties 'type' and " +
            "'cited_text' and 'document_index' and 'document_title' and 'end_block_index' and 'file_id' and " +
            "'start_block_index' do not match their declared types")
      if (!typeState5Matches || !citedTextDecoded || !encryptedIndexDecoded || !titlePresent || !titleDecoded ||
        !urlDecoded) add("AnthropicCitationWebSearchResultLocation: required properties 'type' and 'cited_text' and " +
          "'encrypted_index' and 'title' and 'url' do not match their declared types")
      if (!typeState4Matches || !citedTextDecoded || !endBlockIndexDecoded || !searchResultIndexDecoded ||
        !sourceDecoded || !startBlockIndexDecoded || !titlePresent ||
          !titleDecoded) add("AnthropicCitationSearchResultLocation: required properties 'type' and 'cited_text' and " +
            "'end_block_index' and 'search_result_index' and 'source' and 'start_block_index' and 'title' do not " +
            "match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

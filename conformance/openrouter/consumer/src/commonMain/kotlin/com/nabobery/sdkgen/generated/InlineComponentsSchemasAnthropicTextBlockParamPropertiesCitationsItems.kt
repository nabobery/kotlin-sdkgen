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

public sealed class InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsDecodingException(message)

public class InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextBlockParam/properties/citations/items.
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems.Serializer::class)
public sealed interface InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicCitationCharLocationParam internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endCharIndex: Int,
    public val startCharIndex: Int,
    public val type: InlineComponentsSchemasAnthropicCitationCharLocationParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        documentIndex: Int,
        documentTitle: String?,
        endCharIndex: Int,
        startCharIndex: Int,
        type: InlineComponentsSchemasAnthropicCitationCharLocationParamPropertiesType,
      ): AnthropicCitationCharLocationParam = AnthropicCitationCharLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endCharIndex = endCharIndex,
        startCharIndex = startCharIndex,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_char_index", SdkJson.encodeToJsonElement(endCharIndex))
          put("start_char_index", SdkJson.encodeToJsonElement(startCharIndex))
          put("type", "char_location")
        },
      )
    }
  }

  public class AnthropicCitationPageLocationParam internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endPageNumber: Int,
    public val startPageNumber: Int,
    public val type: InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        documentIndex: Int,
        documentTitle: String?,
        endPageNumber: Int,
        startPageNumber: Int,
        type: InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType,
      ): AnthropicCitationPageLocationParam = AnthropicCitationPageLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endPageNumber = endPageNumber,
        startPageNumber = startPageNumber,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_page_number", SdkJson.encodeToJsonElement(endPageNumber))
          put("start_page_number", SdkJson.encodeToJsonElement(startPageNumber))
          put("type", "page_location")
        },
      )
    }
  }

  public class AnthropicCitationContentBlockLocationParam internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endBlockIndex: Int,
    public val startBlockIndex: Int,
    public val type:
        InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        documentIndex: Int,
        documentTitle: String?,
        endBlockIndex: Int,
        startBlockIndex: Int,
        type: InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType,
      ): AnthropicCitationContentBlockLocationParam = AnthropicCitationContentBlockLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endBlockIndex = endBlockIndex,
        startBlockIndex = startBlockIndex,
        type = type,
        raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_block_index", SdkJson.encodeToJsonElement(endBlockIndex))
          put("start_block_index", SdkJson.encodeToJsonElement(startBlockIndex))
          put("type", "content_block_location")
        },
      )
    }
  }

  public class AnthropicCitationWebSearchResultLocationParam internal constructor(
    public val citedText: String,
    public val encryptedIndex: String,
    public val title: String?,
    public val type:
        InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citedText: String,
        encryptedIndex: String,
        title: String?,
        type: InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType,
        url: String,
      ): AnthropicCitationWebSearchResultLocationParam = AnthropicCitationWebSearchResultLocationParam(
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

  public class AnthropicCitationSearchResultLocationParam internal constructor(
    public val citedText: String,
    public val endBlockIndex: Int,
    public val searchResultIndex: Int,
    public val source: String,
    public val startBlockIndex: Int,
    public val title: String?,
    public val type:
        InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
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
        type: InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType,
      ): AnthropicCitationSearchResultLocationParam = AnthropicCitationSearchResultLocationParam(
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

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsNoMatchException("InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsNoMatchException("InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsAmbiguityException("InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.citedTextDecoded && matches.documentIndexDecoded && matches
          .documentTitlePresent && matches.documentTitleDecoded && matches.endCharIndexDecoded && matches
            .startCharIndexDecoded -> AnthropicCitationCharLocationParam(citedText = requireNotNull(matches.citedText),
              documentIndex = requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle,
                endCharIndex = requireNotNull(matches.endCharIndex), startCharIndex = requireNotNull(matches
                  .startCharIndex), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState3Matches && matches.citedTextDecoded && matches.documentIndexDecoded && matches
          .documentTitlePresent && matches.documentTitleDecoded && matches.endPageNumberDecoded && matches
            .startPageNumberDecoded -> AnthropicCitationPageLocationParam(citedText = requireNotNull(matches
              .citedText), documentIndex = requireNotNull(matches.documentIndex), documentTitle = matches
                .documentTitle, endPageNumber = requireNotNull(matches.endPageNumber), startPageNumber =
                  requireNotNull(matches.startPageNumber), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState2Matches && matches.citedTextDecoded && matches.documentIndexDecoded && matches
          .documentTitlePresent && matches.documentTitleDecoded && matches.endBlockIndexDecoded && matches
            .startBlockIndexDecoded -> AnthropicCitationContentBlockLocationParam(citedText = requireNotNull(matches
              .citedText), documentIndex = requireNotNull(matches.documentIndex), documentTitle = matches
                .documentTitle, endBlockIndex = requireNotNull(matches.endBlockIndex), startBlockIndex =
                  requireNotNull(matches.startBlockIndex), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState5Matches && matches.citedTextDecoded && matches.encryptedIndexDecoded && matches
          .titlePresent && matches.titleDecoded && matches.urlDecoded ->
            AnthropicCitationWebSearchResultLocationParam(citedText = requireNotNull(matches.citedText),
              encryptedIndex = requireNotNull(matches.encryptedIndex), title = matches.title, type =
                requireNotNull(matches.typeState5), url = requireNotNull(matches.url), raw = raw)
        matches.typeState4Matches && matches.citedTextDecoded && matches.endBlockIndexDecoded && matches
          .searchResultIndexDecoded && matches.sourceDecoded && matches.startBlockIndexDecoded && matches
            .titlePresent && matches.titleDecoded -> AnthropicCitationSearchResultLocationParam(citedText =
              requireNotNull(matches.citedText), endBlockIndex = requireNotNull(matches.endBlockIndex),
                searchResultIndex = requireNotNull(matches.searchResultIndex), source = requireNotNull(matches.source),
                  startBlockIndex = requireNotNull(matches.startBlockIndex), title = matches.title, type =
                    requireNotNull(matches.typeState4), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsInspection(
  public val typeState1: InlineComponentsSchemasAnthropicCitationCharLocationParamPropertiesType?,
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
  public val startCharIndex: Int?,
  public val startCharIndexDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val endPageNumber: Int?,
  public val endPageNumberDecoded: Boolean,
  public val startPageNumber: Int?,
  public val startPageNumberDecoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val endBlockIndex: Int?,
  public val endBlockIndexDecoded: Boolean,
  public val startBlockIndex: Int?,
  public val startBlockIndexDecoded: Boolean,
  public val typeState5:
      InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType?,
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
      InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType?,
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
        documentTitleDecoded && endCharIndexDecoded && startCharIndexDecoded) add("AnthropicCitationCharLocationParam")
      if (typeState3Matches && citedTextDecoded && documentIndexDecoded && documentTitlePresent &&
        documentTitleDecoded && endPageNumberDecoded &&
          startPageNumberDecoded) add("AnthropicCitationPageLocationParam")
      if (typeState2Matches && citedTextDecoded && documentIndexDecoded && documentTitlePresent &&
        documentTitleDecoded && endBlockIndexDecoded &&
          startBlockIndexDecoded) add("AnthropicCitationContentBlockLocationParam")
      if (typeState5Matches && citedTextDecoded && encryptedIndexDecoded && titlePresent && titleDecoded &&
        urlDecoded) add("AnthropicCitationWebSearchResultLocationParam")
      if (typeState4Matches && citedTextDecoded && endBlockIndexDecoded && searchResultIndexDecoded && sourceDecoded &&
        startBlockIndexDecoded && titlePresent && titleDecoded) add("AnthropicCitationSearchResultLocationParam")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItems(raw: JsonObject): InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationCharLocationParamPropertiesType>(element) } }
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
  val startCharIndexResult = raw["start_char_index"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val startCharIndex = startCharIndexResult?.getOrNull()
  val startCharIndexDecoded = startCharIndexResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationPageLocationParamPropertiesType>(element) } }
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
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType>(element) } }
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
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationWebSearchResultLocationParamPropertiesType>(element) } }
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
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCitationSearchResultLocationParamPropertiesType>(element) } }
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
  return InlineComponentsSchemasAnthropicTextBlockParamPropertiesCitationsItemsInspection(
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
        !documentTitleDecoded || !endCharIndexDecoded ||
          !startCharIndexDecoded) add("AnthropicCitationCharLocationParam: required properties 'type' and " +
            "'cited_text' and 'document_index' and 'document_title' and 'end_char_index' and 'start_char_index' do " +
            "not match their declared types")
      if (!typeState3Matches || !citedTextDecoded || !documentIndexDecoded || !documentTitlePresent ||
        !documentTitleDecoded || !endPageNumberDecoded ||
          !startPageNumberDecoded) add("AnthropicCitationPageLocationParam: required properties 'type' and " +
            "'cited_text' and 'document_index' and 'document_title' and 'end_page_number' and 'start_page_number' do " +
            "not match their declared types")
      if (!typeState2Matches || !citedTextDecoded || !documentIndexDecoded || !documentTitlePresent ||
        !documentTitleDecoded || !endBlockIndexDecoded ||
          !startBlockIndexDecoded) add("AnthropicCitationContentBlockLocationParam: required properties 'type' and " +
            "'cited_text' and 'document_index' and 'document_title' and 'end_block_index' and 'start_block_index' do " +
            "not match their declared types")
      if (!typeState5Matches || !citedTextDecoded || !encryptedIndexDecoded || !titlePresent || !titleDecoded ||
        !urlDecoded) add("AnthropicCitationWebSearchResultLocationParam: required properties 'type' and 'cited_text' " +
          "and 'encrypted_index' and 'title' and 'url' do not match their declared types")
      if (!typeState4Matches || !citedTextDecoded || !endBlockIndexDecoded || !searchResultIndexDecoded ||
        !sourceDecoded || !startBlockIndexDecoded || !titlePresent ||
          !titleDecoded) add("AnthropicCitationSearchResultLocationParam: required properties 'type' and 'cited_text' " +
            "and 'end_block_index' and 'search_result_index' and 'source' and 'start_block_index' and 'title' do not " +
            "match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

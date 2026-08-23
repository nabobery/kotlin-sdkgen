package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
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

public class AnthropicTextCitationBranchValidationException(
  message: String,
) : AnthropicTextCitationDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextCitation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextCitation
 */
@Serializable(with = AnthropicTextCitationSerializer::class)
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
    public val type: InlineAnthropicCitationCharLocationTypeX3be71257,
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
        type: InlineAnthropicCitationCharLocationTypeX3be71257,
      ): AnthropicCitationCharLocation {
        val raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_char_index", SdkJson.encodeToJsonElement(endCharIndex))
          put("file_id", fileId)
          put("start_char_index", SdkJson.encodeToJsonElement(startCharIndex))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectAnthropicTextCitation(raw)
        if (inspection.size == 0) {
          throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCitationCharLocationMatches) {
          throw AnthropicTextCitationBranchValidationException("AnthropicCitationCharLocation factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCitationCharLocation(
          citedText = citedText,
          documentIndex = documentIndex,
          documentTitle = documentTitle,
          endCharIndex = endCharIndex,
          fileId = fileId,
          startCharIndex = startCharIndex,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicCitationPageLocation internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endPageNumber: Int,
    public val fileId: String?,
    public val startPageNumber: Int,
    public val type: InlineAnthropicCitationPageLocationTypeXdb1d2570,
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
        type: InlineAnthropicCitationPageLocationTypeXdb1d2570,
      ): AnthropicCitationPageLocation {
        val raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_page_number", SdkJson.encodeToJsonElement(endPageNumber))
          put("file_id", fileId)
          put("start_page_number", SdkJson.encodeToJsonElement(startPageNumber))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectAnthropicTextCitation(raw)
        if (inspection.size == 0) {
          throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCitationPageLocationMatches) {
          throw AnthropicTextCitationBranchValidationException("AnthropicCitationPageLocation factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCitationPageLocation(
          citedText = citedText,
          documentIndex = documentIndex,
          documentTitle = documentTitle,
          endPageNumber = endPageNumber,
          fileId = fileId,
          startPageNumber = startPageNumber,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicCitationContentBlockLocation internal constructor(
    public val citedText: String,
    public val documentIndex: Int,
    public val documentTitle: String?,
    public val endBlockIndex: Int,
    public val fileId: String?,
    public val startBlockIndex: Int,
    public val type: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c,
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
        type: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c,
      ): AnthropicCitationContentBlockLocation {
        val raw = buildJsonObject {
          put("cited_text", citedText)
          put("document_index", SdkJson.encodeToJsonElement(documentIndex))
          put("document_title", documentTitle)
          put("end_block_index", SdkJson.encodeToJsonElement(endBlockIndex))
          put("file_id", fileId)
          put("start_block_index", SdkJson.encodeToJsonElement(startBlockIndex))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectAnthropicTextCitation(raw)
        if (inspection.size == 0) {
          throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCitationContentBlockLocationMatches) {
          throw AnthropicTextCitationBranchValidationException("AnthropicCitationContentBlockLocation factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCitationContentBlockLocation(
          citedText = citedText,
          documentIndex = documentIndex,
          documentTitle = documentTitle,
          endBlockIndex = endBlockIndex,
          fileId = fileId,
          startBlockIndex = startBlockIndex,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicCitationWebSearchResultLocation internal constructor(
    public val citedText: String,
    public val encryptedIndex: String,
    public val title: String?,
    public val type: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2,
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
        type: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2,
        url: String,
      ): AnthropicCitationWebSearchResultLocation {
        val raw = buildJsonObject {
          put("cited_text", citedText)
          put("encrypted_index", encryptedIndex)
          put("title", title)
          put("type", SdkJson.encodeToJsonElement(type))
          put("url", url)
        }
        val inspection = inspectAnthropicTextCitation(raw)
        if (inspection.size == 0) {
          throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCitationWebSearchResultLocationMatches) {
          throw AnthropicTextCitationBranchValidationException("AnthropicCitationWebSearchResultLocation factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCitationWebSearchResultLocation(
          citedText = citedText,
          encryptedIndex = encryptedIndex,
          title = title,
          type = type,
          url = url,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicCitationSearchResultLocation internal constructor(
    public val citedText: String,
    public val endBlockIndex: Int,
    public val searchResultIndex: Int,
    public val source: String,
    public val startBlockIndex: Int,
    public val title: String?,
    public val type: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9,
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
        type: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9,
      ): AnthropicCitationSearchResultLocation {
        val raw = buildJsonObject {
          put("cited_text", citedText)
          put("end_block_index", SdkJson.encodeToJsonElement(endBlockIndex))
          put("search_result_index", SdkJson.encodeToJsonElement(searchResultIndex))
          put("source", source)
          put("start_block_index", SdkJson.encodeToJsonElement(startBlockIndex))
          put("title", title)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectAnthropicTextCitation(raw)
        if (inspection.size == 0) {
          throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCitationSearchResultLocationMatches) {
          throw AnthropicTextCitationBranchValidationException("AnthropicCitationSearchResultLocation factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCitationSearchResultLocation(
          citedText = citedText,
          endBlockIndex = endBlockIndex,
          searchResultIndex = searchResultIndex,
          source = source,
          startBlockIndex = startBlockIndex,
          title = title,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object AnthropicTextCitationSerializer : KSerializer<AnthropicTextCitation> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): AnthropicTextCitation {
    val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextCitation")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: expected JSON object")
    val matches = inspectAnthropicTextCitation(rawObject)
    if (matches.size == 0) {
      throw AnthropicTextCitationNoMatchException("AnthropicTextCitation matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw AnthropicTextCitationAmbiguityException("AnthropicTextCitation matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.anthropicCitationCharLocationMatches -> AnthropicTextCitation.AnthropicCitationCharLocation(citedText = requireNotNull(matches.citedText), documentIndex = requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle, endCharIndex = requireNotNull(matches.endCharIndex), fileId = matches.fileId, startCharIndex = requireNotNull(matches.startCharIndex), type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.anthropicCitationPageLocationMatches -> AnthropicTextCitation.AnthropicCitationPageLocation(citedText = requireNotNull(matches.citedText), documentIndex = requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle, endPageNumber = requireNotNull(matches.endPageNumber), fileId = matches.fileId, startPageNumber = requireNotNull(matches.startPageNumber), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.anthropicCitationContentBlockLocationMatches -> AnthropicTextCitation.AnthropicCitationContentBlockLocation(citedText = requireNotNull(matches.citedText), documentIndex = requireNotNull(matches.documentIndex), documentTitle = matches.documentTitle, endBlockIndex = requireNotNull(matches.endBlockIndex), fileId = matches.fileId, startBlockIndex = requireNotNull(matches.startBlockIndex), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.anthropicCitationWebSearchResultLocationMatches -> AnthropicTextCitation.AnthropicCitationWebSearchResultLocation(citedText = requireNotNull(matches.citedText), encryptedIndex = requireNotNull(matches.encryptedIndex), title = matches.title, type = requireNotNull(matches.typeState9), url = requireNotNull(matches.url), raw = rawObject)
      matches.anthropicCitationSearchResultLocationMatches -> AnthropicTextCitation.AnthropicCitationSearchResultLocation(citedText = requireNotNull(matches.citedText), endBlockIndex = requireNotNull(matches.endBlockIndex), searchResultIndex = requireNotNull(matches.searchResultIndex), source = requireNotNull(matches.source), startBlockIndex = requireNotNull(matches.startBlockIndex), title = matches.title, type = requireNotNull(matches.typeState7), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: AnthropicTextCitation) {
    encoder.requireJsonEncoder("AnthropicTextCitation").encodeJsonElement(value.raw)
  }
}

internal data class AnthropicTextCitationInspection(
  public val typeState1: InlineAnthropicCitationCharLocationTypeX3be71257?,
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
  public val typeState2: InlineAnthropicCitationCharLocationTypeX3be71257?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val typeState5: InlineAnthropicCitationPageLocationTypeXdb1d2570?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val endPageNumber: Int?,
  public val endPageNumberDecoded: Boolean,
  public val startPageNumber: Int?,
  public val startPageNumberDecoded: Boolean,
  public val typeState6: InlineAnthropicCitationPageLocationTypeXdb1d2570?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState3: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val endBlockIndex: Int?,
  public val endBlockIndexDecoded: Boolean,
  public val startBlockIndex: Int?,
  public val startBlockIndexDecoded: Boolean,
  public val typeState4: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState9: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val encryptedIndex: String?,
  public val encryptedIndexDecoded: Boolean,
  public val title: String?,
  public val titlePresent: Boolean,
  public val titleDecoded: Boolean,
  public val typeState10: InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val typeState7: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val searchResultIndex: Int?,
  public val searchResultIndexDecoded: Boolean,
  public val source: String?,
  public val sourceDecoded: Boolean,
  public val typeState8: InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val anthropicCitationCharLocationMatches: Boolean,
  public val anthropicCitationPageLocationMatches: Boolean,
  public val anthropicCitationContentBlockLocationMatches: Boolean,
  public val anthropicCitationWebSearchResultLocationMatches: Boolean,
  public val anthropicCitationSearchResultLocationMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (anthropicCitationCharLocationMatches) add("AnthropicCitationCharLocation")
      if (anthropicCitationPageLocationMatches) add("AnthropicCitationPageLocation")
      if (anthropicCitationContentBlockLocationMatches) add("AnthropicCitationContentBlockLocation")
      if (anthropicCitationWebSearchResultLocationMatches) add("AnthropicCitationWebSearchResultLocation")
      if (anthropicCitationSearchResultLocationMatches) add("AnthropicCitationSearchResultLocation")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicTextCitation(rawObject: JsonObject): AnthropicTextCitationInspection {
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationCharLocationTypeX3be71257>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "char_location") && typeState1Decoded
  val citedTextResult = rawObject["cited_text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val citedText = citedTextResult?.getOrNull()
  val citedTextDecoded = citedTextResult?.isSuccess == true
  val documentIndexResult = rawObject["document_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val documentIndex = documentIndexResult?.getOrNull()
  val documentIndexDecoded = documentIndexResult?.isSuccess == true
  val documentTitleResult = rawObject["document_title"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val documentTitle = documentTitleResult?.getOrNull()
  val documentTitlePresent = rawObject.containsKey("document_title")
  val documentTitleDecoded = documentTitleResult?.isSuccess == true
  val endCharIndexResult = rawObject["end_char_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val endCharIndex = endCharIndexResult?.getOrNull()
  val endCharIndexDecoded = endCharIndexResult?.isSuccess == true
  val fileIdResult = rawObject["file_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val fileId = fileIdResult?.getOrNull()
  val fileIdPresent = rawObject.containsKey("file_id")
  val fileIdDecoded = fileIdResult?.isSuccess == true
  val startCharIndexResult = rawObject["start_char_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val startCharIndex = startCharIndexResult?.getOrNull()
  val startCharIndexDecoded = startCharIndexResult?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationCharLocationTypeX3be71257>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "char_location") && typeState2Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationPageLocationTypeXdb1d2570>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "page_location") && typeState5Decoded
  val endPageNumberResult = rawObject["end_page_number"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val endPageNumber = endPageNumberResult?.getOrNull()
  val endPageNumberDecoded = endPageNumberResult?.isSuccess == true
  val startPageNumberResult = rawObject["start_page_number"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val startPageNumber = startPageNumberResult?.getOrNull()
  val startPageNumberDecoded = startPageNumberResult?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationPageLocationTypeXdb1d2570>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "page_location") && typeState6Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "content_block_location") && typeState3Decoded
  val endBlockIndexResult = rawObject["end_block_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val endBlockIndex = endBlockIndexResult?.getOrNull()
  val endBlockIndexDecoded = endBlockIndexResult?.isSuccess == true
  val startBlockIndexResult = rawObject["start_block_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val startBlockIndex = startBlockIndexResult?.getOrNull()
  val startBlockIndexDecoded = startBlockIndexResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "content_block_location") && typeState4Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "web_search_result_location") && typeState9Decoded
  val encryptedIndexResult = rawObject["encrypted_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val encryptedIndex = encryptedIndexResult?.getOrNull()
  val encryptedIndexDecoded = encryptedIndexResult?.isSuccess == true
  val titleResult = rawObject["title"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val title = titleResult?.getOrNull()
  val titlePresent = rawObject.containsKey("title")
  val titleDecoded = titleResult?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationWebSearchResultLocationTypeXd965afd2>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "web_search_result_location") && typeState10Decoded
  val urlResult = rawObject["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "search_result_location") && typeState7Decoded
  val searchResultIndexResult = rawObject["search_result_index"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val searchResultIndex = searchResultIndexResult?.getOrNull()
  val searchResultIndexDecoded = searchResultIndexResult?.isSuccess == true
  val sourceResult = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val source = sourceResult?.getOrNull()
  val sourceDecoded = sourceResult?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCitationSearchResultLocationTypeX2a3f09a9>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "search_result_location") && typeState8Decoded
  val rawEmpty = rawObject.isEmpty()
  val anthropicCitationCharLocationMatches = matchesAnthropicTextCitationAnthropicCitationCharLocationBranch(rawObject) && (typeState1Matches)
  val anthropicCitationPageLocationMatches = matchesAnthropicTextCitationAnthropicCitationPageLocationBranch(rawObject) && (typeState5Matches)
  val anthropicCitationContentBlockLocationMatches = matchesAnthropicTextCitationAnthropicCitationContentBlockLocationBranch(rawObject) && (typeState3Matches)
  val anthropicCitationWebSearchResultLocationMatches = matchesAnthropicTextCitationAnthropicCitationWebSearchResultLocationBranch(rawObject) && (typeState9Matches)
  val anthropicCitationSearchResultLocationMatches = matchesAnthropicTextCitationAnthropicCitationSearchResultLocationBranch(rawObject) && (typeState7Matches)
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
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    endPageNumber = endPageNumber,
    endPageNumberDecoded = endPageNumberDecoded,
    startPageNumber = startPageNumber,
    startPageNumberDecoded = startPageNumberDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    endBlockIndex = endBlockIndex,
    endBlockIndexDecoded = endBlockIndexDecoded,
    startBlockIndex = startBlockIndex,
    startBlockIndexDecoded = startBlockIndexDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    encryptedIndex = encryptedIndex,
    encryptedIndexDecoded = encryptedIndexDecoded,
    title = title,
    titlePresent = titlePresent,
    titleDecoded = titleDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    url = url,
    urlDecoded = urlDecoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    searchResultIndex = searchResultIndex,
    searchResultIndexDecoded = searchResultIndexDecoded,
    source = source,
    sourceDecoded = sourceDecoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    anthropicCitationCharLocationMatches = anthropicCitationCharLocationMatches,
    anthropicCitationPageLocationMatches = anthropicCitationPageLocationMatches,
    anthropicCitationContentBlockLocationMatches = anthropicCitationContentBlockLocationMatches,
    anthropicCitationWebSearchResultLocationMatches = anthropicCitationWebSearchResultLocationMatches,
    anthropicCitationSearchResultLocationMatches = anthropicCitationSearchResultLocationMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!anthropicCitationCharLocationMatches) add("AnthropicCitationCharLocation: branch predicate did not match properties 'type'")
      if (!anthropicCitationPageLocationMatches) add("AnthropicCitationPageLocation: branch predicate did not match properties 'type'")
      if (!anthropicCitationContentBlockLocationMatches) add("AnthropicCitationContentBlockLocation: branch predicate did not match properties 'type'")
      if (!anthropicCitationWebSearchResultLocationMatches) add("AnthropicCitationWebSearchResultLocation: branch predicate did not match properties 'type'")
      if (!anthropicCitationSearchResultLocationMatches) add("AnthropicCitationSearchResultLocation: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesAnthropicTextCitationAnthropicCitationCharLocationBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("cited_text") && (rawObject as JsonObject).containsKey("document_index") && (rawObject as JsonObject).containsKey("document_title") && (rawObject as JsonObject).containsKey("end_char_index") && (rawObject as JsonObject).containsKey("file_id") && (rawObject as JsonObject).containsKey("start_char_index") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cited_text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["document_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["document_title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["end_char_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["start_char_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"char_location\"")))) } ?: true))))

private fun matchesAnthropicTextCitationAnthropicCitationPageLocationBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("cited_text") && (rawObject as JsonObject).containsKey("document_index") && (rawObject as JsonObject).containsKey("document_title") && (rawObject as JsonObject).containsKey("end_page_number") && (rawObject as JsonObject).containsKey("file_id") && (rawObject as JsonObject).containsKey("start_page_number") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cited_text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["document_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["document_title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["end_page_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["start_page_number"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"page_location\"")))) } ?: true))))

private fun matchesAnthropicTextCitationAnthropicCitationContentBlockLocationBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("cited_text") && (rawObject as JsonObject).containsKey("document_index") && (rawObject as JsonObject).containsKey("document_title") && (rawObject as JsonObject).containsKey("end_block_index") && (rawObject as JsonObject).containsKey("file_id") && (rawObject as JsonObject).containsKey("start_block_index") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cited_text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["document_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["document_title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["end_block_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["start_block_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"content_block_location\"")))) } ?: true))))

private fun matchesAnthropicTextCitationAnthropicCitationWebSearchResultLocationBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("cited_text") && (rawObject as JsonObject).containsKey("encrypted_index") && (rawObject as JsonObject).containsKey("title") && (rawObject as JsonObject).containsKey("type") && (rawObject as JsonObject).containsKey("url") && ((rawObject as JsonObject)["cited_text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["encrypted_index"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web_search_result_location\"")))) } ?: true) && ((rawObject as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))))

private fun matchesAnthropicTextCitationAnthropicCitationSearchResultLocationBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("cited_text") && (rawObject as JsonObject).containsKey("end_block_index") && (rawObject as JsonObject).containsKey("search_result_index") && (rawObject as JsonObject).containsKey("source") && (rawObject as JsonObject).containsKey("start_block_index") && (rawObject as JsonObject).containsKey("title") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cited_text"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["end_block_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["search_result_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["source"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["start_block_index"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"search_result_location\"")))) } ?: true))))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

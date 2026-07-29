package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineSearchIssuesGetResponse200JsonX88eab09b.Serializer::class)
public class InlineSearchIssuesGetResponse200JsonX88eab09b(
  public val incompleteResults: Boolean,
  items: List<IssueSearchResultItem>,
  /**
   * The type of search that was performed. Possible values are `lexical`, `semantic`, or `hybrid`.
   */
  public val searchType: InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c,
  public val totalCount: Int,
  lexicalFallbackReason: List<InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6>? = null,
) {
  public val items: List<IssueSearchResultItem> = items.toList()

  /**
   * When a semantic or hybrid search falls back to lexical search, this field contains the reasons for the fallback.
   * Only present when a fallback occurred.
   */
  public val lexicalFallbackReason:
      List<InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6>? =
      lexicalFallbackReason?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var incompleteResultsValue: Boolean? = null

    public var incompleteResults: Boolean
      get() = requireNotNull(incompleteResultsValue) { "incompleteResults is required" }
      set(`value`) {
        incompleteResultsValue = value
      }

    private var itemsValue: List<IssueSearchResultItem>? = null

    public var items: List<IssueSearchResultItem>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    private var searchTypeValue: InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c? = null

    public var searchType: InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c
      get() = requireNotNull(searchTypeValue) { "searchType is required" }
      set(`value`) {
        searchTypeValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var lexicalFallbackReasonValue:
        List<InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6>? = null

    /**
     * When a semantic or hybrid search falls back to lexical search, this field contains the reasons for the fallback.
     * Only present when a fallback occurred.
     */
    public var lexicalFallbackReason:
        List<InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6>?
      get() = lexicalFallbackReasonValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lexicalFallbackReasonValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineSearchIssuesGetResponse200JsonX88eab09b {
      check(incompleteResultsValue != null) { "incompleteResults is required" }
      check(itemsValue != null) { "items is required" }
      check(searchTypeValue != null) { "searchType is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineSearchIssuesGetResponse200JsonX88eab09b(
        incompleteResults = incompleteResults,
        items = items,
        searchType = searchType,
        totalCount = totalCount,
        lexicalFallbackReason = lexicalFallbackReason,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchIssuesGetResponse200JsonX88eab09b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSearchIssuesGetResponse200JsonX88eab09b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchIssuesGetResponse200JsonX88eab09b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchIssuesGetResponse200JsonX88eab09b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchIssuesGetResponse200JsonX88eab09b must be a JSON object")
      val incompleteResults = json.decodeRequired<Boolean>(rawObject, "incomplete_results")
      val items = json.decodeRequired<List<IssueSearchResultItem>>(rawObject, "items")
      val searchType = json.decodeRequired<InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c>(rawObject, "search_type")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineSearchIssuesGetResponse200JsonX88eab09b(
        incompleteResults = incompleteResults,
        items = items,
        searchType = searchType,
        totalCount = totalCount,
        lexicalFallbackReason = rawObject["lexical_fallback_reason"]?.let { json.decodeFromJsonElement<List<InlineSearchIssuesGetResponse200JsonLexicalFallbackReasonItemXbe2101d6>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchIssuesGetResponse200JsonX88eab09b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchIssuesGetResponse200JsonX88eab09b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("incomplete_results", json.encodeToJsonElement(value.incompleteResults))
        put("items", json.encodeToJsonElement(value.items))
        put("search_type", json.encodeToJsonElement(value.searchType))
        put("total_count", json.encodeToJsonElement(value.totalCount))
        value.lexicalFallbackReason?.let { put("lexical_fallback_reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSearchIssuesGetResponse200JsonX88eab09b(block: InlineSearchIssuesGetResponse200JsonX88eab09b.Builder.() -> Unit): InlineSearchIssuesGetResponse200JsonX88eab09b = InlineSearchIssuesGetResponse200JsonX88eab09b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSearchIssuesGetResponse200JsonX88eab09b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

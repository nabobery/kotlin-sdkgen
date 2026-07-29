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
 * sdkgen://source/openapi.yaml#/paths/~1search~1commits/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1commits/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineSearchCommitsGetResponse200JsonX5c0af761.Serializer::class)
public class InlineSearchCommitsGetResponse200JsonX5c0af761(
  public val incompleteResults: Boolean,
  items: List<CommitSearchResultItem>,
  public val totalCount: Int,
) {
  public val items: List<CommitSearchResultItem> = items.toList()

  public class Builder {
    private var incompleteResultsValue: Boolean? = null

    public var incompleteResults: Boolean
      get() = requireNotNull(incompleteResultsValue) { "incompleteResults is required" }
      set(`value`) {
        incompleteResultsValue = value
      }

    private var itemsValue: List<CommitSearchResultItem>? = null

    public var items: List<CommitSearchResultItem>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineSearchCommitsGetResponse200JsonX5c0af761 {
      check(incompleteResultsValue != null) { "incompleteResults is required" }
      check(itemsValue != null) { "items is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineSearchCommitsGetResponse200JsonX5c0af761(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchCommitsGetResponse200JsonX5c0af761 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSearchCommitsGetResponse200JsonX5c0af761> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchCommitsGetResponse200JsonX5c0af761 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchCommitsGetResponse200JsonX5c0af761")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchCommitsGetResponse200JsonX5c0af761 must be a JSON object")
      val incompleteResults = json.decodeRequired<Boolean>(rawObject, "incomplete_results")
      val items = json.decodeRequired<List<CommitSearchResultItem>>(rawObject, "items")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineSearchCommitsGetResponse200JsonX5c0af761(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchCommitsGetResponse200JsonX5c0af761) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchCommitsGetResponse200JsonX5c0af761")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("incomplete_results", json.encodeToJsonElement(value.incompleteResults))
        put("items", json.encodeToJsonElement(value.items))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSearchCommitsGetResponse200JsonX5c0af761(block: InlineSearchCommitsGetResponse200JsonX5c0af761.Builder.() -> Unit): InlineSearchCommitsGetResponse200JsonX5c0af761 = InlineSearchCommitsGetResponse200JsonX5c0af761.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSearchCommitsGetResponse200JsonX5c0af761 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

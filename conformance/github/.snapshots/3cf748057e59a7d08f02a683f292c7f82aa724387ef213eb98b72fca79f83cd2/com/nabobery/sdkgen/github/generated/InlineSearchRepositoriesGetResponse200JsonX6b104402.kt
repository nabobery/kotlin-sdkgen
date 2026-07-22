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
 * sdkgen://source/openapi.yaml#/paths/~1search~1repositories/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1repositories/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineSearchRepositoriesGetResponse200JsonX6b104402.Serializer::class)
public class InlineSearchRepositoriesGetResponse200JsonX6b104402(
  public val incompleteResults: Boolean,
  items: List<RepoSearchResultItem>,
  public val totalCount: Int,
) {
  public val items: List<RepoSearchResultItem> = items.toList()

  public class Builder {
    private var incompleteResultsValue: Boolean? = null

    public var incompleteResults: Boolean
      get() = requireNotNull(incompleteResultsValue) { "incompleteResults is required" }
      set(`value`) {
        incompleteResultsValue = value
      }

    private var itemsValue: List<RepoSearchResultItem>? = null

    public var items: List<RepoSearchResultItem>
      get() = requireNotNull(itemsValue) { "items is required" }
      set(`value`) {
        itemsValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineSearchRepositoriesGetResponse200JsonX6b104402 {
      check(incompleteResultsValue != null) { "incompleteResults is required" }
      check(itemsValue != null) { "items is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineSearchRepositoriesGetResponse200JsonX6b104402(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchRepositoriesGetResponse200JsonX6b104402 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSearchRepositoriesGetResponse200JsonX6b104402> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchRepositoriesGetResponse200JsonX6b104402 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchRepositoriesGetResponse200JsonX6b104402")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchRepositoriesGetResponse200JsonX6b104402 must be a JSON object")
      val incompleteResults = json.decodeRequired<Boolean>(rawObject, "incomplete_results")
      val items = json.decodeRequired<List<RepoSearchResultItem>>(rawObject, "items")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineSearchRepositoriesGetResponse200JsonX6b104402(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchRepositoriesGetResponse200JsonX6b104402) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchRepositoriesGetResponse200JsonX6b104402")
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

public fun inlineSearchRepositoriesGetResponse200JsonX6b104402(block: InlineSearchRepositoriesGetResponse200JsonX6b104402.Builder.() -> Unit): InlineSearchRepositoriesGetResponse200JsonX6b104402 = InlineSearchRepositoriesGetResponse200JsonX6b104402.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSearchRepositoriesGetResponse200JsonX6b104402 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

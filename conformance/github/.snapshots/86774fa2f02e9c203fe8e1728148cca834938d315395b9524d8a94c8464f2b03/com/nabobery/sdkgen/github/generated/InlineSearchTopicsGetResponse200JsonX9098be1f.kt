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
 * sdkgen://source/openapi.yaml#/paths/~1search~1topics/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1topics/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineSearchTopicsGetResponse200JsonX9098be1f.Serializer::class)
public class InlineSearchTopicsGetResponse200JsonX9098be1f(
  public val incompleteResults: Boolean,
  items: List<TopicSearchResultItem>,
  public val totalCount: Int,
) {
  public val items: List<TopicSearchResultItem> = items.toList()

  public class Builder {
    private var incompleteResultsValue: Boolean? = null

    public var incompleteResults: Boolean
      get() = requireNotNull(incompleteResultsValue) { "incompleteResults is required" }
      set(`value`) {
        incompleteResultsValue = value
      }

    private var itemsValue: List<TopicSearchResultItem>? = null

    public var items: List<TopicSearchResultItem>
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

    public fun build(): InlineSearchTopicsGetResponse200JsonX9098be1f {
      check(incompleteResultsValue != null) { "incompleteResults is required" }
      check(itemsValue != null) { "items is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineSearchTopicsGetResponse200JsonX9098be1f(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchTopicsGetResponse200JsonX9098be1f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSearchTopicsGetResponse200JsonX9098be1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchTopicsGetResponse200JsonX9098be1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchTopicsGetResponse200JsonX9098be1f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchTopicsGetResponse200JsonX9098be1f must be a JSON object")
      val incompleteResults = json.decodeRequired<Boolean>(rawObject, "incomplete_results")
      val items = json.decodeRequired<List<TopicSearchResultItem>>(rawObject, "items")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineSearchTopicsGetResponse200JsonX9098be1f(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchTopicsGetResponse200JsonX9098be1f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchTopicsGetResponse200JsonX9098be1f")
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

public fun inlineSearchTopicsGetResponse200JsonX9098be1f(block: InlineSearchTopicsGetResponse200JsonX9098be1f.Builder.() -> Unit): InlineSearchTopicsGetResponse200JsonX9098be1f = InlineSearchTopicsGetResponse200JsonX9098be1f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSearchTopicsGetResponse200JsonX9098be1f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

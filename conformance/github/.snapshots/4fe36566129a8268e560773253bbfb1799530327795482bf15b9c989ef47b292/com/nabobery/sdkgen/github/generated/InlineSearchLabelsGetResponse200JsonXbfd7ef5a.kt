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
 * sdkgen://source/openapi.yaml#/paths/~1search~1labels/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1labels/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineSearchLabelsGetResponse200JsonXbfd7ef5a.Serializer::class)
public class InlineSearchLabelsGetResponse200JsonXbfd7ef5a(
  public val incompleteResults: Boolean,
  items: List<LabelSearchResultItem>,
  public val totalCount: Int,
) {
  public val items: List<LabelSearchResultItem> = items.toList()

  public class Builder {
    private var incompleteResultsValue: Boolean? = null

    public var incompleteResults: Boolean
      get() = requireNotNull(incompleteResultsValue) { "incompleteResults is required" }
      set(`value`) {
        incompleteResultsValue = value
      }

    private var itemsValue: List<LabelSearchResultItem>? = null

    public var items: List<LabelSearchResultItem>
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

    public fun build(): InlineSearchLabelsGetResponse200JsonXbfd7ef5a {
      check(incompleteResultsValue != null) { "incompleteResults is required" }
      check(itemsValue != null) { "items is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineSearchLabelsGetResponse200JsonXbfd7ef5a(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchLabelsGetResponse200JsonXbfd7ef5a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSearchLabelsGetResponse200JsonXbfd7ef5a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchLabelsGetResponse200JsonXbfd7ef5a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchLabelsGetResponse200JsonXbfd7ef5a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchLabelsGetResponse200JsonXbfd7ef5a must be a JSON object")
      val incompleteResults = json.decodeRequired<Boolean>(rawObject, "incomplete_results")
      val items = json.decodeRequired<List<LabelSearchResultItem>>(rawObject, "items")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineSearchLabelsGetResponse200JsonXbfd7ef5a(
        incompleteResults = incompleteResults,
        items = items,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchLabelsGetResponse200JsonXbfd7ef5a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchLabelsGetResponse200JsonXbfd7ef5a")
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

public fun inlineSearchLabelsGetResponse200JsonXbfd7ef5a(block: InlineSearchLabelsGetResponse200JsonXbfd7ef5a.Builder.() -> Unit): InlineSearchLabelsGetResponse200JsonXbfd7ef5a = InlineSearchLabelsGetResponse200JsonXbfd7ef5a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSearchLabelsGetResponse200JsonXbfd7ef5a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

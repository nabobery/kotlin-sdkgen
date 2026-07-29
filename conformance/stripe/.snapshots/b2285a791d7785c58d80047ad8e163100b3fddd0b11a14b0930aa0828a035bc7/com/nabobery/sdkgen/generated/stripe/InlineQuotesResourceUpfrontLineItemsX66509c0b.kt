package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * The line items that will appear on the next invoice after this quote is accepted. This does not include pending
 * invoice items that exist on the customer but may still be included in the next invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_upfront/properties/line_items
 */
@Serializable(with = InlineQuotesResourceUpfrontLineItemsX66509c0b.Serializer::class)
public class InlineQuotesResourceUpfrontLineItemsX66509c0b(
  `data`: List<Item>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineQuotesResourceUpfrontLineItemsObjectValueXa78ccfd7,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<Item> = data.toList()

  public class Builder {
    private var dataValue: List<Item>? = null

    public var `data`: List<Item>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlineQuotesResourceUpfrontLineItemsObjectValueXa78ccfd7? = null

    public var objectValue: InlineQuotesResourceUpfrontLineItemsObjectValueXa78ccfd7
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineQuotesResourceUpfrontLineItemsX66509c0b {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineQuotesResourceUpfrontLineItemsX66509c0b(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineQuotesResourceUpfrontLineItemsX66509c0b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineQuotesResourceUpfrontLineItemsX66509c0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuotesResourceUpfrontLineItemsX66509c0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuotesResourceUpfrontLineItemsX66509c0b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineQuotesResourceUpfrontLineItemsX66509c0b must be a JSON object")
      val data = json.decodeRequired<List<Item>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineQuotesResourceUpfrontLineItemsObjectValueXa78ccfd7>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineQuotesResourceUpfrontLineItemsX66509c0b(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuotesResourceUpfrontLineItemsX66509c0b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineQuotesResourceUpfrontLineItemsX66509c0b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineQuotesResourceUpfrontLineItemsX66509c0b(block: InlineQuotesResourceUpfrontLineItemsX66509c0b.Builder.() -> Unit): InlineQuotesResourceUpfrontLineItemsX66509c0b = InlineQuotesResourceUpfrontLineItemsX66509c0b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineQuotesResourceUpfrontLineItemsX66509c0b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

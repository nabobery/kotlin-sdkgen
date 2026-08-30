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
 * A list of items the customer is being quoted for.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/line_items
 */
@Serializable(with = InlineQuoteLineItemsX6064fea4.Serializer::class)
public class InlineQuoteLineItemsX6064fea4(
  `data`: List<Item>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineQuoteLineItemsObjectValueXb79c2b29,
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

    private var objectValueValue: InlineQuoteLineItemsObjectValueXb79c2b29? = null

    public var objectValue: InlineQuoteLineItemsObjectValueXb79c2b29
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

    public fun build(): InlineQuoteLineItemsX6064fea4 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineQuoteLineItemsX6064fea4(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineQuoteLineItemsX6064fea4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineQuoteLineItemsX6064fea4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineQuoteLineItemsX6064fea4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteLineItemsX6064fea4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineQuoteLineItemsX6064fea4 must be a JSON object")
      val data = json.decodeRequired<List<Item>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineQuoteLineItemsObjectValueXb79c2b29>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineQuoteLineItemsX6064fea4(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineQuoteLineItemsX6064fea4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineQuoteLineItemsX6064fea4")
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

public fun inlineQuoteLineItemsX6064fea4(block: InlineQuoteLineItemsX6064fea4.Builder.() -> Unit): InlineQuoteLineItemsX6064fea4 = InlineQuoteLineItemsX6064fea4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineQuoteLineItemsX6064fea4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

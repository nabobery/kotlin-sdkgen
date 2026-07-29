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
 * The list of items the customer is purchasing.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation/properties/line_items
 */
@Serializable(with = InlineTaxCalculationLineItemsX2767aa54.Serializer::class)
public class InlineTaxCalculationLineItemsX2767aa54(
  `data`: List<TaxCalculationLineItem>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineTaxCalculationLineItemsObjectValueXb2e215da,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<TaxCalculationLineItem> = data.toList()

  public class Builder {
    private var dataValue: List<TaxCalculationLineItem>? = null

    public var `data`: List<TaxCalculationLineItem>
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

    private var objectValueValue: InlineTaxCalculationLineItemsObjectValueXb2e215da? = null

    public var objectValue: InlineTaxCalculationLineItemsObjectValueXb2e215da
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

    public fun build(): InlineTaxCalculationLineItemsX2767aa54 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineTaxCalculationLineItemsX2767aa54(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTaxCalculationLineItemsX2767aa54 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTaxCalculationLineItemsX2767aa54> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxCalculationLineItemsX2767aa54 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxCalculationLineItemsX2767aa54")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTaxCalculationLineItemsX2767aa54 must be a JSON object")
      val data = json.decodeRequired<List<TaxCalculationLineItem>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineTaxCalculationLineItemsObjectValueXb2e215da>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineTaxCalculationLineItemsX2767aa54(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxCalculationLineItemsX2767aa54) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTaxCalculationLineItemsX2767aa54")
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

public fun inlineTaxCalculationLineItemsX2767aa54(block: InlineTaxCalculationLineItemsX2767aa54.Builder.() -> Unit): InlineTaxCalculationLineItemsX2767aa54 = InlineTaxCalculationLineItemsX2767aa54.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTaxCalculationLineItemsX2767aa54 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

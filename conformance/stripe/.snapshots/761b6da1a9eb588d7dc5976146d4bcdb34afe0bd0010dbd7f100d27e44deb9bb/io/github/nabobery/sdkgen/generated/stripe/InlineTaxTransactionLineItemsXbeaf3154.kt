package io.github.nabobery.sdkgen.generated.stripe

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
 * The tax collected or refunded, by line item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/line_items
 */
@Serializable(with = InlineTaxTransactionLineItemsXbeaf3154.Serializer::class)
public class InlineTaxTransactionLineItemsXbeaf3154(
  `data`: List<TaxTransactionLineItem>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineTaxTransactionLineItemsObjectValueXc5879958,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<TaxTransactionLineItem> = data.toList()

  public class Builder {
    private var dataValue: List<TaxTransactionLineItem>? = null

    public var `data`: List<TaxTransactionLineItem>
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

    private var objectValueValue: InlineTaxTransactionLineItemsObjectValueXc5879958? = null

    public var objectValue: InlineTaxTransactionLineItemsObjectValueXc5879958
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

    public fun build(): InlineTaxTransactionLineItemsXbeaf3154 {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineTaxTransactionLineItemsXbeaf3154(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTaxTransactionLineItemsXbeaf3154 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTaxTransactionLineItemsXbeaf3154> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxTransactionLineItemsXbeaf3154 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxTransactionLineItemsXbeaf3154")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTaxTransactionLineItemsXbeaf3154 must be a JSON object")
      val data = json.decodeRequired<List<TaxTransactionLineItem>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineTaxTransactionLineItemsObjectValueXc5879958>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineTaxTransactionLineItemsXbeaf3154(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxTransactionLineItemsXbeaf3154) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTaxTransactionLineItemsXbeaf3154")
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

public fun inlineTaxTransactionLineItemsXbeaf3154(block: InlineTaxTransactionLineItemsXbeaf3154.Builder.() -> Unit): InlineTaxTransactionLineItemsXbeaf3154 = InlineTaxTransactionLineItemsXbeaf3154.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTaxTransactionLineItemsXbeaf3154 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

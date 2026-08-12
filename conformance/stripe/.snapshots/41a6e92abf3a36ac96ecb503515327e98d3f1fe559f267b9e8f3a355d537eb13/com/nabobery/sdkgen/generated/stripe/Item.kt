package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A line item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/item
 */
@Serializable(with = Item.Serializer::class)
public class Item(
  /**
   * Total discount amount applied. If no discounts were applied, defaults to 0.
   */
  public val amountDiscount: Int,
  /**
   * Total before any discounts or taxes are applied.
   */
  public val amountSubtotal: Int,
  /**
   * Total tax amount applied. If no tax was applied, defaults to 0.
   */
  public val amountTax: Int,
  /**
   * Total after discounts and taxes.
   */
  public val amountTotal: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineItemObjectValueX7a9b1e2e,
  public val adjustableQuantity: InlineItemAdjustableQuantityXcf27880b? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Defaults to product name.
   */
  public val description: String? = null,
  discounts: List<LineItemsDiscountAmount>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The price used to generate the line item.
   */
  public val price: InlineItemPriceXbaa2d9e5? = null,
  /**
   * The quantity of products being purchased.
   */
  public val quantity: Int? = null,
  taxes: List<LineItemsTaxAmount>? = null,
) {
  /**
   * The discounts applied to the line item.
   */
  public val discounts: List<LineItemsDiscountAmount>? =
      discounts?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The taxes applied to the line item.
   */
  public val taxes: List<LineItemsTaxAmount>? = taxes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountDiscountValue: Int? = null

    public var amountDiscount: Int
      get() = requireNotNull(amountDiscountValue) { "amountDiscount is required" }
      set(`value`) {
        amountDiscountValue = value
      }

    private var amountSubtotalValue: Int? = null

    public var amountSubtotal: Int
      get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
      set(`value`) {
        amountSubtotalValue = value
      }

    private var amountTaxValue: Int? = null

    public var amountTax: Int
      get() = requireNotNull(amountTaxValue) { "amountTax is required" }
      set(`value`) {
        amountTaxValue = value
      }

    private var amountTotalValue: Int? = null

    public var amountTotal: Int
      get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
      set(`value`) {
        amountTotalValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineItemObjectValueX7a9b1e2e? = null

    public var objectValue: InlineItemObjectValueX7a9b1e2e
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var adjustableQuantity: InlineItemAdjustableQuantityXcf27880b? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. Defaults to product name.
     */
    public var description: String? = null

    private var discountsValue: List<LineItemsDiscountAmount>? = null

    /**
     * The discounts applied to the line item.
     */
    public var discounts: List<LineItemsDiscountAmount>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The price used to generate the line item.
     */
    public var price: InlineItemPriceXbaa2d9e5? = null

    /**
     * The quantity of products being purchased.
     */
    public var quantity: Int? = null

    private var taxesValue: List<LineItemsTaxAmount>? = null

    /**
     * The taxes applied to the line item.
     */
    public var taxes: List<LineItemsTaxAmount>?
      get() = taxesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): Item {
      check(amountDiscountValue != null) { "amountDiscount is required" }
      check(amountSubtotalValue != null) { "amountSubtotal is required" }
      check(amountTaxValue != null) { "amountTax is required" }
      check(amountTotalValue != null) { "amountTotal is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return Item(
        amountDiscount = amountDiscount,
        amountSubtotal = amountSubtotal,
        amountTax = amountTax,
        amountTotal = amountTotal,
        currency = currency,
        id = id,
        objectValue = objectValue,
        adjustableQuantity = adjustableQuantity,
        description = description,
        discounts = discounts,
        metadata = metadata,
        price = price,
        quantity = quantity,
        taxes = taxes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Item = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Item> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Item {
      val jsonDecoder = decoder.requireJsonDecoder("Item")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Item must be a JSON object")
      val amountDiscount = json.decodeRequired<Int>(rawObject, "amount_discount")
      val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
      val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineItemObjectValueX7a9b1e2e>(rawObject, "object")
      return Item(
        amountDiscount = amountDiscount,
        amountSubtotal = amountSubtotal,
        amountTax = amountTax,
        amountTotal = amountTotal,
        currency = currency,
        id = id,
        objectValue = objectValue,
        adjustableQuantity = rawObject["adjustable_quantity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineItemAdjustableQuantityXcf27880b?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<List<LineItemsDiscountAmount>>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        price = rawObject["price"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineItemPriceXbaa2d9e5?>(element) },
        quantity = rawObject["quantity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        taxes = rawObject["taxes"]?.let { json.decodeFromJsonElement<List<LineItemsTaxAmount>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Item) {
      val jsonEncoder = encoder.requireJsonEncoder("Item")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_discount", json.encodeToJsonElement(value.amountDiscount))
        put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
        put("amount_tax", json.encodeToJsonElement(value.amountTax))
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
        put("currency", value.currency)
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxes?.let { put("taxes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun item(block: Item.Builder.() -> Unit): Item = Item.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Item is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

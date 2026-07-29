package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation_line_item
 */
@Serializable(with = TaxCalculationLineItem.Serializer::class)
public class TaxCalculationLineItem(
  /**
   * The line item amount in the [smallest currency unit](https://docs.stripe.com/currencies#minor-units). If
   * `tax_behavior=inclusive`, then this amount includes taxes. Otherwise, taxes were calculated on top of this amount.
   */
  public val amount: Int,
  /**
   * The amount of tax calculated for this line item, in the [smallest currency
   * unit](https://docs.stripe.com/currencies#minor-units).
   */
  public val amountTax: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxCalculationLineItemObjectValueXcf121042,
  /**
   * The number of units of the item being purchased. For reversals, this is the quantity reversed.
   */
  public val quantity: Int,
  /**
   * A custom identifier for this line item.
   */
  public val reference: String,
  /**
   * Specifies whether the `amount` includes taxes. If `tax_behavior=inclusive`, then the amount includes taxes.
   */
  public val taxBehavior: InlineTaxCalculationLineItemTaxBehaviorX254c641f,
  /**
   * The [tax code](https://docs.stripe.com/tax/tax-categories) ID used for this resource.
   */
  public val taxCode: String,
  metadata: Map<String, String>? = null,
  /**
   * The ID of an existing [Product](https://docs.stripe.com/api/products/object).
   */
  public val product: String? = null,
  taxBreakdown: List<TaxProductResourceLineItemTaxBreakdown>? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * Detailed account of taxes relevant to this line item.
   */
  public val taxBreakdown: List<TaxProductResourceLineItemTaxBreakdown>? =
      taxBreakdown?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountTaxValue: Int? = null

    public var amountTax: Int
      get() = requireNotNull(amountTaxValue) { "amountTax is required" }
      set(`value`) {
        amountTaxValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTaxCalculationLineItemObjectValueXcf121042? = null

    public var objectValue: InlineTaxCalculationLineItemObjectValueXcf121042
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var quantityValue: Int? = null

    public var quantity: Int
      get() = requireNotNull(quantityValue) { "quantity is required" }
      set(`value`) {
        quantityValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    private var taxBehaviorValue: InlineTaxCalculationLineItemTaxBehaviorX254c641f? = null

    public var taxBehavior: InlineTaxCalculationLineItemTaxBehaviorX254c641f
      get() = requireNotNull(taxBehaviorValue) { "taxBehavior is required" }
      set(`value`) {
        taxBehaviorValue = value
      }

    private var taxCodeValue: String? = null

    public var taxCode: String
      get() = requireNotNull(taxCodeValue) { "taxCode is required" }
      set(`value`) {
        taxCodeValue = value
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
     * The ID of an existing [Product](https://docs.stripe.com/api/products/object).
     */
    public var product: String? = null

    private var taxBreakdownValue: List<TaxProductResourceLineItemTaxBreakdown>? = null

    /**
     * Detailed account of taxes relevant to this line item.
     */
    public var taxBreakdown: List<TaxProductResourceLineItemTaxBreakdown>?
      get() = taxBreakdownValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxBreakdownValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TaxCalculationLineItem {
      check(amountValue != null) { "amount is required" }
      check(amountTaxValue != null) { "amountTax is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(quantityValue != null) { "quantity is required" }
      check(referenceValue != null) { "reference is required" }
      check(taxBehaviorValue != null) { "taxBehavior is required" }
      check(taxCodeValue != null) { "taxCode is required" }
      return TaxCalculationLineItem(
        amount = amount,
        amountTax = amountTax,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        quantity = quantity,
        reference = reference,
        taxBehavior = taxBehavior,
        taxCode = taxCode,
        metadata = metadata,
        product = product,
        taxBreakdown = taxBreakdown,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxCalculationLineItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxCalculationLineItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxCalculationLineItem {
      val jsonDecoder = decoder.requireJsonDecoder("TaxCalculationLineItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxCalculationLineItem must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxCalculationLineItemObjectValueXcf121042>(rawObject, "object")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      val taxBehavior = json.decodeRequired<InlineTaxCalculationLineItemTaxBehaviorX254c641f>(rawObject, "tax_behavior")
      val taxCode = json.decodeRequired<String>(rawObject, "tax_code")
      return TaxCalculationLineItem(
        amount = amount,
        amountTax = amountTax,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        quantity = quantity,
        reference = reference,
        taxBehavior = taxBehavior,
        taxCode = taxCode,
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        product = rawObject["product"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxBreakdown = rawObject["tax_breakdown"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxProductResourceLineItemTaxBreakdown>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxCalculationLineItem) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxCalculationLineItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_tax", json.encodeToJsonElement(value.amountTax))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("quantity", json.encodeToJsonElement(value.quantity))
        put("reference", value.reference)
        put("tax_behavior", json.encodeToJsonElement(value.taxBehavior))
        put("tax_code", value.taxCode)
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.product?.let { put("product", it) }
        value.taxBreakdown?.let { put("tax_breakdown", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxCalculationLineItem(block: TaxCalculationLineItem.Builder.() -> Unit): TaxCalculationLineItem = TaxCalculationLineItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxCalculationLineItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

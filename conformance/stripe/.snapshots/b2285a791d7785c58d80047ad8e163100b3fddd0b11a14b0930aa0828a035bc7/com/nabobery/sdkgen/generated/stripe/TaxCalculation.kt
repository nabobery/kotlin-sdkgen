package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A Tax Calculation allows you to calculate the tax to collect from your customer.
 *
 * Related guide: [Calculate tax in your custom payment flow](https://docs.stripe.com/tax/custom)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation
 */
@Serializable(with = TaxCalculation.Serializer::class)
public class TaxCalculation(
  /**
   * Total amount after taxes in the [smallest currency unit](https://docs.stripe.com/currencies#minor-units).
   */
  public val amountTotal: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String,
  public val customerDetails: TaxProductResourceCustomerDetails,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxCalculationObjectValueX7f5df0b7,
  /**
   * The amount of tax to be collected on top of the line item prices.
   */
  public val taxAmountExclusive: Int,
  /**
   * The amount of tax already included in the line item prices.
   */
  public val taxAmountInclusive: Int,
  taxBreakdown: List<TaxProductResourceTaxBreakdown>,
  /**
   * The calculation uses the tax rules and rates that are in effect at this timestamp. You can use a date up to 31 days
   * in the past or up to 31 days in the future. If you use a future date, Stripe doesn't guarantee that the expected
   * tax rules and rate being used match the actual rules and rate that will be in effect on that date. We deploy tax
   * changes before their effective date, but not within a fixed window.
   */
  public val taxDate: Int,
  /**
   * The ID of an existing [Customer](https://docs.stripe.com/api/customers/object) used for the resource.
   */
  public val customer: String? = null,
  /**
   * Timestamp of date at which the tax calculation will expire.
   */
  public val expiresAt: Int? = null,
  /**
   * Unique identifier for the calculation.
   */
  public val id: String? = null,
  /**
   * The list of items the customer is purchasing.
   */
  public val lineItems: InlineTaxCalculationLineItemsX2767aa54? = null,
  /**
   * The details of the ship from location, such as the address.
   */
  public val shipFromDetails: InlineTaxCalculationShipFromDetailsX621a3c3e? = null,
  /**
   * The shipping cost details for the calculation.
   */
  public val shippingCost: InlineTaxCalculationShippingCostXdd462a1a? = null,
) {
  /**
   * Breakdown of individual tax amounts that add up to the total.
   */
  public val taxBreakdown: List<TaxProductResourceTaxBreakdown> = taxBreakdown.toList()

  public class Builder {
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

    private var customerDetailsValue: TaxProductResourceCustomerDetails? = null

    public var customerDetails: TaxProductResourceCustomerDetails
      get() = requireNotNull(customerDetailsValue) { "customerDetails is required" }
      set(`value`) {
        customerDetailsValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTaxCalculationObjectValueX7f5df0b7? = null

    public var objectValue: InlineTaxCalculationObjectValueX7f5df0b7
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var taxAmountExclusiveValue: Int? = null

    public var taxAmountExclusive: Int
      get() = requireNotNull(taxAmountExclusiveValue) { "taxAmountExclusive is required" }
      set(`value`) {
        taxAmountExclusiveValue = value
      }

    private var taxAmountInclusiveValue: Int? = null

    public var taxAmountInclusive: Int
      get() = requireNotNull(taxAmountInclusiveValue) { "taxAmountInclusive is required" }
      set(`value`) {
        taxAmountInclusiveValue = value
      }

    private var taxBreakdownValue: List<TaxProductResourceTaxBreakdown>? = null

    public var taxBreakdown: List<TaxProductResourceTaxBreakdown>
      get() = requireNotNull(taxBreakdownValue) { "taxBreakdown is required" }.toList()
      set(`value`) {
        taxBreakdownValue = value.toList()
      }

    private var taxDateValue: Int? = null

    public var taxDate: Int
      get() = requireNotNull(taxDateValue) { "taxDate is required" }
      set(`value`) {
        taxDateValue = value
      }

    /**
     * The ID of an existing [Customer](https://docs.stripe.com/api/customers/object) used for the resource.
     */
    public var customer: String? = null

    /**
     * Timestamp of date at which the tax calculation will expire.
     */
    public var expiresAt: Int? = null

    /**
     * Unique identifier for the calculation.
     */
    public var id: String? = null

    /**
     * The list of items the customer is purchasing.
     */
    public var lineItems: InlineTaxCalculationLineItemsX2767aa54? = null

    /**
     * The details of the ship from location, such as the address.
     */
    public var shipFromDetails: InlineTaxCalculationShipFromDetailsX621a3c3e? = null

    /**
     * The shipping cost details for the calculation.
     */
    public var shippingCost: InlineTaxCalculationShippingCostXdd462a1a? = null

    public fun build(): TaxCalculation {
      check(amountTotalValue != null) { "amountTotal is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerDetailsValue != null) { "customerDetails is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(taxAmountExclusiveValue != null) { "taxAmountExclusive is required" }
      check(taxAmountInclusiveValue != null) { "taxAmountInclusive is required" }
      check(taxBreakdownValue != null) { "taxBreakdown is required" }
      check(taxDateValue != null) { "taxDate is required" }
      return TaxCalculation(
        amountTotal = amountTotal,
        currency = currency,
        customerDetails = customerDetails,
        livemode = livemode,
        objectValue = objectValue,
        taxAmountExclusive = taxAmountExclusive,
        taxAmountInclusive = taxAmountInclusive,
        taxBreakdown = taxBreakdown,
        taxDate = taxDate,
        customer = customer,
        expiresAt = expiresAt,
        id = id,
        lineItems = lineItems,
        shipFromDetails = shipFromDetails,
        shippingCost = shippingCost,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxCalculation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxCalculation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxCalculation {
      val jsonDecoder = decoder.requireJsonDecoder("TaxCalculation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxCalculation must be a JSON object")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customerDetails = json.decodeRequired<TaxProductResourceCustomerDetails>(rawObject, "customer_details")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxCalculationObjectValueX7f5df0b7>(rawObject, "object")
      val taxAmountExclusive = json.decodeRequired<Int>(rawObject, "tax_amount_exclusive")
      val taxAmountInclusive = json.decodeRequired<Int>(rawObject, "tax_amount_inclusive")
      val taxBreakdown = json.decodeRequired<List<TaxProductResourceTaxBreakdown>>(rawObject, "tax_breakdown")
      val taxDate = json.decodeRequired<Int>(rawObject, "tax_date")
      return TaxCalculation(
        amountTotal = amountTotal,
        currency = currency,
        customerDetails = customerDetails,
        livemode = livemode,
        objectValue = objectValue,
        taxAmountExclusive = taxAmountExclusive,
        taxAmountInclusive = taxAmountInclusive,
        taxBreakdown = taxBreakdown,
        taxDate = taxDate,
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lineItems = rawObject["line_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxCalculationLineItemsX2767aa54?>(element) },
        shipFromDetails = rawObject["ship_from_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxCalculationShipFromDetailsX621a3c3e?>(element) },
        shippingCost = rawObject["shipping_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxCalculationShippingCostXdd462a1a?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxCalculation) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxCalculation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
        put("currency", value.currency)
        put("customer_details", json.encodeToJsonElement(value.customerDetails))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("tax_amount_exclusive", json.encodeToJsonElement(value.taxAmountExclusive))
        put("tax_amount_inclusive", json.encodeToJsonElement(value.taxAmountInclusive))
        put("tax_breakdown", json.encodeToJsonElement(value.taxBreakdown))
        put("tax_date", json.encodeToJsonElement(value.taxDate))
        value.customer?.let { put("customer", it) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.shipFromDetails?.let { put("ship_from_details", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxCalculation(block: TaxCalculation.Builder.() -> Unit): TaxCalculation = TaxCalculation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxCalculation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

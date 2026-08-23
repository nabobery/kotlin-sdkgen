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
 * Invoice Items represent the component lines of an [invoice](https://docs.stripe.com/api/invoices). When you create an
 * invoice item with an `invoice` field, it is attached to the specified invoice and included as [an invoice line
 * item](https://docs.stripe.com/api/invoices/line_item) within
 * [invoice.lines](https://docs.stripe.com/api/invoices/object#invoice_object-lines).
 *
 * Invoice Items can be created before you are ready to actually send the invoice. This can be particularly useful when
 * combined
 * with a [subscription](https://docs.stripe.com/api/subscriptions). Sometimes you want to add a charge or credit to a
 * customer, but actually charge
 * or credit the customer's card only at the end of a regular billing cycle. This is useful for combining several
 * charges
 * (to minimize per-transaction fees), or for having Stripe tabulate your usage-based billing totals.
 *
 * Related guides: [Integrate with the Invoicing API](https://docs.stripe.com/invoicing/integration), [Subscription
 * Invoices](https://docs.stripe.com/billing/invoices/subscription#adding-upcoming-invoice-items).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem
 */
@Serializable(with = Invoiceitem.Serializer::class)
public class Invoiceitem(
  /**
   * Amount (in the `currency` specified) of the invoice item. This should always be equal to `unit_amount * quantity`.
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The ID of the customer to bill for this invoice item.
   */
  public val customer: InlineInvoiceitemCustomerXb5ff6454,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val date: Int,
  /**
   * If true, discounts will apply to this invoice item. Always false for prorations.
   */
  public val discountable: Boolean,
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
  public val objectValue: InlineInvoiceitemObjectValueX2ce8a156,
  public val period: InvoiceLineItemPeriod,
  /**
   * Whether the invoice item was created automatically as a proration adjustment when the customer switched plans.
   */
  public val proration: Boolean,
  /**
   * Quantity of units for the invoice item in integer format, with any decimal precision truncated. For the item's
   * full-precision decimal quantity, use `quantity_decimal`. This field will be deprecated in favor of
   * `quantity_decimal` in a future version. If the invoice item is a proration, the quantity of the subscription that
   * the proration was computed for.
   */
  public val quantity: Int,
  /**
   * Non-negative decimal with at most 12 decimal places. The quantity of units for the invoice item.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String,
  /**
   * The ID of the account to bill for this invoice item.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  discounts: List<InlineInvoiceitemDiscountsItemXc729a9a7>? = null,
  /**
   * The ID of the invoice this invoice item belongs to.
   */
  public val invoice: InlineInvoiceitemInvoiceX2a82d179? = null,
  metadata: Map<String, String>? = null,
  /**
   * The amount after discounts, but before credits and taxes. This field is `null` for `discountable=true` items.
   */
  public val netAmount: Int? = null,
  /**
   * The parent that generated this invoice item.
   */
  public val parent: InlineInvoiceitemParentX5d8eb470? = null,
  /**
   * The pricing information of the invoice item.
   */
  public val pricing: InlineInvoiceitemPricingXc20095ad? = null,
  public val prorationDetails: ProrationDetails? = null,
  taxRates: List<TaxRate>? = null,
  /**
   * ID of the test clock this invoice item belongs to.
   */
  public val testClock: InlineInvoiceitemTestClockXdd357cbe? = null,
) {
  /**
   * The discounts which apply to the invoice item. Item discounts are applied before invoice discounts. Use
   * `expand[]=discounts` to expand each discount.
   */
  public val discounts: List<InlineInvoiceitemDiscountsItemXc729a9a7>? =
      discounts?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to
   * this invoice item.
   */
  public val taxRates: List<TaxRate>? = taxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var customerValue: InlineInvoiceitemCustomerXb5ff6454? = null

    public var customer: InlineInvoiceitemCustomerXb5ff6454
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var dateValue: Int? = null

    public var date: Int
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var discountableValue: Boolean? = null

    public var discountable: Boolean
      get() = requireNotNull(discountableValue) { "discountable is required" }
      set(`value`) {
        discountableValue = value
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

    private var objectValueValue: InlineInvoiceitemObjectValueX2ce8a156? = null

    public var objectValue: InlineInvoiceitemObjectValueX2ce8a156
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var periodValue: InvoiceLineItemPeriod? = null

    public var period: InvoiceLineItemPeriod
      get() = requireNotNull(periodValue) { "period is required" }
      set(`value`) {
        periodValue = value
      }

    private var prorationValue: Boolean? = null

    public var proration: Boolean
      get() = requireNotNull(prorationValue) { "proration is required" }
      set(`value`) {
        prorationValue = value
      }

    private var quantityValue: Int? = null

    public var quantity: Int
      get() = requireNotNull(quantityValue) { "quantity is required" }
      set(`value`) {
        quantityValue = value
      }

    private var quantityDecimalValue: String? = null

    public var quantityDecimal: String
      get() = requireNotNull(quantityDecimalValue) { "quantityDecimal is required" }
      set(`value`) {
        quantityDecimalValue = value
      }

    /**
     * The ID of the account to bill for this invoice item.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    private var discountsValue: List<InlineInvoiceitemDiscountsItemXc729a9a7>? = null

    /**
     * The discounts which apply to the invoice item. Item discounts are applied before invoice discounts. Use
     * `expand[]=discounts` to expand each discount.
     */
    public var discounts: List<InlineInvoiceitemDiscountsItemXc729a9a7>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The ID of the invoice this invoice item belongs to.
     */
    public var invoice: InlineInvoiceitemInvoiceX2a82d179? = null

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
     * The amount after discounts, but before credits and taxes. This field is `null` for `discountable=true` items.
     */
    public var netAmount: Int? = null

    /**
     * The parent that generated this invoice item.
     */
    public var parent: InlineInvoiceitemParentX5d8eb470? = null

    /**
     * The pricing information of the invoice item.
     */
    public var pricing: InlineInvoiceitemPricingXc20095ad? = null

    public var prorationDetails: ProrationDetails? = null

    private var taxRatesValue: List<TaxRate>? = null

    /**
     * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to
     * this invoice item.
     */
    public var taxRates: List<TaxRate>?
      get() = taxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * ID of the test clock this invoice item belongs to.
     */
    public var testClock: InlineInvoiceitemTestClockXdd357cbe? = null

    public fun build(): Invoiceitem {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerValue != null) { "customer is required" }
      check(dateValue != null) { "date is required" }
      check(discountableValue != null) { "discountable is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(periodValue != null) { "period is required" }
      check(prorationValue != null) { "proration is required" }
      check(quantityValue != null) { "quantity is required" }
      check(quantityDecimalValue != null) { "quantityDecimal is required" }
      return Invoiceitem(
        amount = amount,
        currency = currency,
        customer = customer,
        date = date,
        discountable = discountable,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        period = period,
        proration = proration,
        quantity = quantity,
        quantityDecimal = quantityDecimal,
        customerAccount = customerAccount,
        description = description,
        discounts = discounts,
        invoice = invoice,
        metadata = metadata,
        netAmount = netAmount,
        parent = parent,
        pricing = pricing,
        prorationDetails = prorationDetails,
        taxRates = taxRates,
        testClock = testClock,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Invoiceitem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Invoiceitem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Invoiceitem {
      val jsonDecoder = decoder.requireJsonDecoder("Invoiceitem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Invoiceitem must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customer = json.decodeRequired<InlineInvoiceitemCustomerXb5ff6454>(rawObject, "customer")
      val date = json.decodeRequired<Int>(rawObject, "date")
      val discountable = json.decodeRequired<Boolean>(rawObject, "discountable")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineInvoiceitemObjectValueX2ce8a156>(rawObject, "object")
      val period = json.decodeRequired<InvoiceLineItemPeriod>(rawObject, "period")
      val proration = json.decodeRequired<Boolean>(rawObject, "proration")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      val quantityDecimal = json.decodeRequired<String>(rawObject, "quantity_decimal")
      return Invoiceitem(
        amount = amount,
        currency = currency,
        customer = customer,
        date = date,
        discountable = discountable,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        period = period,
        proration = proration,
        quantity = quantity,
        quantityDecimal = quantityDecimal,
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        discounts = rawObject["discounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineInvoiceitemDiscountsItemXc729a9a7>?>(element) },
        invoice = rawObject["invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceitemInvoiceX2a82d179?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        netAmount = rawObject["net_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceitemParentX5d8eb470?>(element) },
        pricing = rawObject["pricing"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceitemPricingXc20095ad?>(element) },
        prorationDetails = rawObject["proration_details"]?.let { json.decodeFromJsonElement<ProrationDetails>(it) },
        taxRates = rawObject["tax_rates"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxRate>?>(element) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceitemTestClockXdd357cbe?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Invoiceitem) {
      val jsonEncoder = encoder.requireJsonEncoder("Invoiceitem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("customer", json.encodeToJsonElement(value.customer))
        put("date", json.encodeToJsonElement(value.date))
        put("discountable", json.encodeToJsonElement(value.discountable))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("period", json.encodeToJsonElement(value.period))
        put("proration", json.encodeToJsonElement(value.proration))
        put("quantity", json.encodeToJsonElement(value.quantity))
        put("quantity_decimal", value.quantityDecimal)
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.invoice?.let { put("invoice", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.netAmount?.let { put("net_amount", json.encodeToJsonElement(it)) }
        value.parent?.let { put("parent", json.encodeToJsonElement(it)) }
        value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
        value.prorationDetails?.let { put("proration_details", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceitem(block: Invoiceitem.Builder.() -> Unit): Invoiceitem = Invoiceitem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Invoiceitem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

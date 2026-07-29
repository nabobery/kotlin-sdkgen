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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormX1d0b460f.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormX1d0b460f(
  /**
   * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. Passing in a
   * negative `amount` will reduce the `amount_due` on the invoice.
   */
  public val amount: Int? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * The ID of the customer to bill for this invoice item.
   */
  public val customer: String? = null,
  /**
   * The ID of the account representing the customer to bill for this invoice item.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy
   * tracking.
   */
  public val description: String? = null,
  /**
   * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items,
   * and true for all other invoice items.
   */
  public val discountable: Boolean? = null,
  /**
   * The coupons and promotion codes to redeem into discounts for the invoice item or invoice line item.
   */
  public val discounts: InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66? = null,
  expand: List<String>? = null,
  /**
   * The ID of an existing invoice to add this invoice item to. For subscription invoices, when left blank, the invoice
   * item will be added to the next upcoming scheduled invoice. For standalone invoices, the invoice item won't be
   * automatically added unless you pass `pending_invoice_item_behavior: 'include'` when creating the invoice. This is
   * useful when adding invoice items in response to an invoice.created webhook. You can only add invoice items to draft
   * invoices and there is a maximum of 250 items per invoice.
   */
  public val invoice: String? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f? = null,
  /**
   * The period associated with this invoice item. When set to different values, the period will be rendered on the
   * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the period
   * will be used to recognize and defer revenue. See the [Revenue Recognition
   * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
   */
  public val period: InlineV1InvoiceitemsPostRequestFormPeriodX750c3864? = null,
  /**
   * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
   */
  public val priceData: InlineV1InvoiceitemsPostRequestFormPriceDataX837b5eed? = null,
  /**
   * The pricing information for the invoice item.
   */
  public val pricing: InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2? = null,
  /**
   * Non-negative integer. The quantity of units for the invoice item. Use `quantity_decimal` instead to provide decimal
   * precision. This field will be deprecated in favor of `quantity_decimal` in a future version.
   */
  public val quantity: Int? = null,
  /**
   * Non-negative decimal with at most 12 decimal places. The quantity of units for the invoice item.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  /**
   * The ID of a subscription to add this invoice item to. When left blank, the invoice item is added to the next
   * upcoming scheduled invoice. When set, scheduled invoices for subscriptions other than the specified subscription
   * will ignore the invoice item. Use this when you want to express that an invoice item has been accrued within the
   * context of a particular subscription.
   */
  public val subscription: String? = null,
  /**
   * Only required if a [default tax
   * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(r
   * ecommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of
   * taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
   * `inclusive` or `exclusive`, it cannot be changed.
   */
  public val taxBehavior: InlineV1InvoiceitemsPostRequestFormTaxBehaviorX161ea3df? = null,
  /**
   * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
   */
  public val taxCode: InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c? = null,
  taxRates: List<String>? = null,
  /**
   * The decimal unit amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. This
   * `unit_amount_decimal` will be multiplied by the quantity to get the full amount. Passing in a negative
   * `unit_amount_decimal` will reduce the `amount_due` on the invoice. Accepts at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to
   * this invoice item.
   */
  public val taxRates: List<String>? = taxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. Passing in
     * a negative `amount` will reduce the `amount_due` on the invoice.
     */
    public var amount: Int? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * The ID of the customer to bill for this invoice item.
     */
    public var customer: String? = null

    /**
     * The ID of the account representing the customer to bill for this invoice item.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for
     * easy tracking.
     */
    public var description: String? = null

    /**
     * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice
     * items, and true for all other invoice items.
     */
    public var discountable: Boolean? = null

    /**
     * The coupons and promotion codes to redeem into discounts for the invoice item or invoice line item.
     */
    public var discounts: InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The ID of an existing invoice to add this invoice item to. For subscription invoices, when left blank, the
     * invoice item will be added to the next upcoming scheduled invoice. For standalone invoices, the invoice item
     * won't be automatically added unless you pass `pending_invoice_item_behavior: 'include'` when creating the
     * invoice. This is useful when adding invoice items in response to an invoice.created webhook. You can only add
     * invoice items to draft invoices and there is a maximum of 250 items per invoice.
     */
    public var invoice: String? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f? = null

    /**
     * The period associated with this invoice item. When set to different values, the period will be rendered on the
     * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the
     * period will be used to recognize and defer revenue. See the [Revenue Recognition
     * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
     */
    public var period: InlineV1InvoiceitemsPostRequestFormPeriodX750c3864? = null

    /**
     * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
     */
    public var priceData: InlineV1InvoiceitemsPostRequestFormPriceDataX837b5eed? = null

    /**
     * The pricing information for the invoice item.
     */
    public var pricing: InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2? = null

    /**
     * Non-negative integer. The quantity of units for the invoice item. Use `quantity_decimal` instead to provide
     * decimal precision. This field will be deprecated in favor of `quantity_decimal` in a future version.
     */
    public var quantity: Int? = null

    /**
     * Non-negative decimal with at most 12 decimal places. The quantity of units for the invoice item.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    /**
     * The ID of a subscription to add this invoice item to. When left blank, the invoice item is added to the next
     * upcoming scheduled invoice. When set, scheduled invoices for subscriptions other than the specified subscription
     * will ignore the invoice item. Use this when you want to express that an invoice item has been accrued within the
     * context of a particular subscription.
     */
    public var subscription: String? = null

    /**
     * Only required if a [default tax
     * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-
     * (recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive
     * of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
     * `inclusive` or `exclusive`, it cannot be changed.
     */
    public var taxBehavior: InlineV1InvoiceitemsPostRequestFormTaxBehaviorX161ea3df? = null

    /**
     * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
     */
    public var taxCode: InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c? = null

    private var taxRatesValue: List<String>? = null

    /**
     * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to
     * this invoice item.
     */
    public var taxRates: List<String>?
      get() = taxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The decimal unit amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. This
     * `unit_amount_decimal` will be multiplied by the quantity to get the full amount. Passing in a negative
     * `unit_amount_decimal` will reduce the `amount_due` on the invoice. Accepts at most 12 decimal places.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1InvoiceitemsPostRequestFormX1d0b460f = InlineV1InvoiceitemsPostRequestFormX1d0b460f(
      amount = amount,
      currency = currency,
      customer = customer,
      customerAccount = customerAccount,
      description = description,
      discountable = discountable,
      discounts = discounts,
      expand = expand,
      invoice = invoice,
      metadata = metadata,
      period = period,
      priceData = priceData,
      pricing = pricing,
      quantity = quantity,
      quantityDecimal = quantityDecimal,
      subscription = subscription,
      taxBehavior = taxBehavior,
      taxCode = taxCode,
      taxRates = taxRates,
      unitAmountDecimal = unitAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormX1d0b460f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormX1d0b460f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormX1d0b460f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormX1d0b460f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoiceitemsPostRequestFormX1d0b460f must be a JSON object")
      return InlineV1InvoiceitemsPostRequestFormX1d0b460f(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormDiscountsX8fe1ac66>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        invoice = rawObject["invoice"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPeriodX750c3864>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPriceDataX837b5eed>(it) },
        pricing = rawObject["pricing"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        subscription = rawObject["subscription"]?.let { json.decodeFromJsonElement<String>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxBehaviorX161ea3df>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxCodeX2112798c>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormX1d0b460f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormX1d0b460f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.invoice?.let { put("invoice", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.period?.let { put("period", json.encodeToJsonElement(it)) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.subscription?.let { put("subscription", it) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoiceitemsPostRequestFormX1d0b460f(block: InlineV1InvoiceitemsPostRequestFormX1d0b460f.Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormX1d0b460f = InlineV1InvoiceitemsPostRequestFormX1d0b460f.build(block)

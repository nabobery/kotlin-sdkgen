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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormXeff471a0.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormXeff471a0(
  /**
   * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. If you want
   * to apply a credit to the customer's account, pass a negative amount.
   */
  public val amount: Int? = null,
  /**
   * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy
   * tracking.
   */
  public val description: String? = null,
  /**
   * Controls whether discounts apply to this line item. Defaults to false for prorations or negative line items, and
   * true for all other line items. Cannot be set to true for prorations.
   */
  public val discountable: Boolean? = null,
  /**
   * The coupons, promotion codes & existing discounts which apply to the line item. Item discounts are applied before
   * invoice discounts. Pass an empty string to remove previously-defined discounts.
   */
  public val discounts: InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`. For
   * [type=subscription](/api/invoices/line_item) line items, the incoming metadata specified on the request is directly
   * used to set this value, in contrast to [type=invoiceitem](/api/invoices/line_item) line items, where any existing
   * metadata on the invoice line is merged with the incoming data.
   */
  public val metadata: InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d? = null,
  /**
   * The period associated with this invoice item. When set to different values, the period will be rendered on the
   * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the period
   * will be used to recognize and defer revenue. See the [Revenue Recognition
   * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
   */
  public val period: InlineV1InvoicesLinesPostRequestFormPeriodXad9d6069? = null,
  /**
   * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
   */
  public val priceData: InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265? = null,
  /**
   * The pricing information for the invoice item.
   */
  public val pricing: InlineV1InvoicesLinesPostRequestFormPricingXf532832b? = null,
  /**
   * Non-negative integer. The quantity of units for the line item. Use `quantity_decimal` instead to provide decimal
   * precision. This field will be deprecated in favor of `quantity_decimal` in a future version.
   */
  public val quantity: Int? = null,
  /**
   * Non-negative decimal with at most 12 decimal places. The quantity of units for the line item.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  /**
   * A list of up to 20 tax amounts for this line item. This can be useful if you calculate taxes on your own or use a
   * third-party to calculate them. You cannot set tax amounts if any line item has
   * [tax_rates](https://docs.stripe.com/api/invoices/line_item#invoice_line_item_object-tax_rates) or if the invoice
   * has [default_tax_rates](https://docs.stripe.com/api/invoices/object#invoice_object-default_tax_rates) or uses
   * [automatic tax](https://docs.stripe.com/tax/invoicing). Pass an empty string to remove previously defined tax
   * amounts.
   */
  public val taxAmounts: InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d? = null,
  /**
   * The tax rates which apply to the line item. When set, the `default_tax_rates` on the invoice do not apply to this
   * line item. Pass an empty string to remove previously-defined tax rates.
   */
  public val taxRates: InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. If you
     * want to apply a credit to the customer's account, pass a negative amount.
     */
    public var amount: Int? = null

    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for
     * easy tracking.
     */
    public var description: String? = null

    /**
     * Controls whether discounts apply to this line item. Defaults to false for prorations or negative line items, and
     * true for all other line items. Cannot be set to true for prorations.
     */
    public var discountable: Boolean? = null

    /**
     * The coupons, promotion codes & existing discounts which apply to the line item. Item discounts are applied before
     * invoice discounts. Pass an empty string to remove previously-defined discounts.
     */
    public var discounts: InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e? = null

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`. For
     * [type=subscription](/api/invoices/line_item) line items, the incoming metadata specified on the request is
     * directly used to set this value, in contrast to [type=invoiceitem](/api/invoices/line_item) line items, where any
     * existing metadata on the invoice line is merged with the incoming data.
     */
    public var metadata: InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d? = null

    /**
     * The period associated with this invoice item. When set to different values, the period will be rendered on the
     * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the
     * period will be used to recognize and defer revenue. See the [Revenue Recognition
     * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
     */
    public var period: InlineV1InvoicesLinesPostRequestFormPeriodXad9d6069? = null

    /**
     * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
     */
    public var priceData: InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265? = null

    /**
     * The pricing information for the invoice item.
     */
    public var pricing: InlineV1InvoicesLinesPostRequestFormPricingXf532832b? = null

    /**
     * Non-negative integer. The quantity of units for the line item. Use `quantity_decimal` instead to provide decimal
     * precision. This field will be deprecated in favor of `quantity_decimal` in a future version.
     */
    public var quantity: Int? = null

    /**
     * Non-negative decimal with at most 12 decimal places. The quantity of units for the line item.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    /**
     * A list of up to 20 tax amounts for this line item. This can be useful if you calculate taxes on your own or use a
     * third-party to calculate them. You cannot set tax amounts if any line item has
     * [tax_rates](https://docs.stripe.com/api/invoices/line_item#invoice_line_item_object-tax_rates) or if the invoice
     * has [default_tax_rates](https://docs.stripe.com/api/invoices/object#invoice_object-default_tax_rates) or uses
     * [automatic tax](https://docs.stripe.com/tax/invoicing). Pass an empty string to remove previously defined tax
     * amounts.
     */
    public var taxAmounts: InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d? = null

    /**
     * The tax rates which apply to the line item. When set, the `default_tax_rates` on the invoice do not apply to this
     * line item. Pass an empty string to remove previously-defined tax rates.
     */
    public var taxRates: InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146? = null

    public fun build(): InlineV1InvoicesLinesPostRequestFormXeff471a0 = InlineV1InvoicesLinesPostRequestFormXeff471a0(
      amount = amount,
      description = description,
      discountable = discountable,
      discounts = discounts,
      expand = expand,
      metadata = metadata,
      period = period,
      priceData = priceData,
      pricing = pricing,
      quantity = quantity,
      quantityDecimal = quantityDecimal,
      taxAmounts = taxAmounts,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormXeff471a0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormXeff471a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormXeff471a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormXeff471a0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesLinesPostRequestFormXeff471a0 must be a JSON object")
      return InlineV1InvoicesLinesPostRequestFormXeff471a0(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormDiscountsXc325813e>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormPeriodXad9d6069>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265>(it) },
        pricing = rawObject["pricing"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormPricingXf532832b>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        taxAmounts = rawObject["tax_amounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormTaxAmountsX248c846d>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormTaxRatesX07874146>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormXeff471a0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesLinesPostRequestFormXeff471a0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.period?.let { put("period", json.encodeToJsonElement(it)) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.taxAmounts?.let { put("tax_amounts", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesLinesPostRequestFormXeff471a0(block: InlineV1InvoicesLinesPostRequestFormXeff471a0.Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormXeff471a0 = InlineV1InvoicesLinesPostRequestFormXeff471a0.build(block)

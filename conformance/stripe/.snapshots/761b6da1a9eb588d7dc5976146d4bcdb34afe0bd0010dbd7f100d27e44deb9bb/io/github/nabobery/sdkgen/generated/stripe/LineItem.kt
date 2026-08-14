package io.github.nabobery.sdkgen.generated.stripe

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
 * Invoice Line Items represent the individual lines within an [invoice](https://docs.stripe.com/api/invoices) and only
 * exist within the context of an invoice.
 *
 * Each line item is backed by either an [invoice item](https://docs.stripe.com/api/invoiceitems) or a [subscription
 * item](https://docs.stripe.com/api/subscription_items).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_item
 */
@Serializable(with = LineItem.Serializer::class)
public class LineItem(
  /**
   * The amount, in cents (or local equivalent).
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
   * If true, discounts will apply to this line item. Always false for prorations.
   */
  public val discountable: Boolean,
  discounts: List<InlineLineItemDiscountsItemX6313e0c2>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineLineItemObjectValueX8aaad4ae,
  public val period: InvoiceLineItemPeriod,
  /**
   * The subtotal of the line item, in cents (or local equivalent), before any discounts or taxes.
   */
  public val subtotal: Int,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  discountAmounts: List<DiscountsResourceDiscountAmount>? = null,
  /**
   * The ID of the invoice that contains this line item.
   */
  public val invoice: String? = null,
  /**
   * The parent that generated this line item.
   */
  public val parent: InlineLineItemParentX36380c91? = null,
  pretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>? = null,
  /**
   * The pricing information of the line item.
   */
  public val pricing: InlineLineItemPricingX2cc3399a? = null,
  /**
   * Quantity of units for the invoice line item in integer format, with any decimal precision truncated. For the line
   * item's full-precision decimal quantity, use `quantity_decimal`. This field will be deprecated in favor of
   * `quantity_decimal` in a future version. If the line item is a proration or subscription, the quantity of the
   * subscription that the proration was computed for.
   */
  public val quantity: Int? = null,
  /**
   * Non-negative decimal with at most 12 decimal places. The quantity of units for the line item.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  public val subscription: InlineLineItemSubscriptionX73f0eb42? = null,
  taxes: List<BillingBillResourceInvoicingTaxesTax>? = null,
) {
  /**
   * The discounts applied to the invoice line item. Line item discounts are applied before invoice discounts. Use
   * `expand[]=discounts` to expand each discount.
   */
  public val discounts: List<InlineLineItemDiscountsItemX6313e0c2> = discounts.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Note that for line items with
   * `type=subscription`, `metadata` reflects the current metadata from the subscription associated with the line item,
   * unless the invoice line was directly updated with different metadata after creation.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * The amount of discount calculated per discount for this line item.
   */
  public val discountAmounts: List<DiscountsResourceDiscountAmount>? =
      discountAmounts?.let { collection0 -> collection0.toList() }

  /**
   * Contains pretax credit amounts (ex: discount, credit grants, etc) that apply to this line item.
   */
  public val pretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>? =
      pretaxCreditAmounts?.let { collection0 -> collection0.toList() }

  /**
   * The tax information of the line item.
   */
  public val taxes: List<BillingBillResourceInvoicingTaxesTax>? =
      taxes?.let { collection0 -> collection0.toList() }

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

    private var discountableValue: Boolean? = null

    public var discountable: Boolean
      get() = requireNotNull(discountableValue) { "discountable is required" }
      set(`value`) {
        discountableValue = value
      }

    private var discountsValue: List<InlineLineItemDiscountsItemX6313e0c2>? = null

    public var discounts: List<InlineLineItemDiscountsItemX6313e0c2>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
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

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineLineItemObjectValueX8aaad4ae? = null

    public var objectValue: InlineLineItemObjectValueX8aaad4ae
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

    private var subtotalValue: Int? = null

    public var subtotal: Int
      get() = requireNotNull(subtotalValue) { "subtotal is required" }
      set(`value`) {
        subtotalValue = value
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    private var discountAmountsValue: List<DiscountsResourceDiscountAmount>? = null

    /**
     * The amount of discount calculated per discount for this line item.
     */
    public var discountAmounts: List<DiscountsResourceDiscountAmount>?
      get() = discountAmountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountAmountsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The ID of the invoice that contains this line item.
     */
    public var invoice: String? = null

    /**
     * The parent that generated this line item.
     */
    public var parent: InlineLineItemParentX36380c91? = null

    private var pretaxCreditAmountsValue: List<InvoicesResourcePretaxCreditAmount>? = null

    /**
     * Contains pretax credit amounts (ex: discount, credit grants, etc) that apply to this line item.
     */
    public var pretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>?
      get() = pretaxCreditAmountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pretaxCreditAmountsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The pricing information of the line item.
     */
    public var pricing: InlineLineItemPricingX2cc3399a? = null

    /**
     * Quantity of units for the invoice line item in integer format, with any decimal precision truncated. For the line
     * item's full-precision decimal quantity, use `quantity_decimal`. This field will be deprecated in favor of
     * `quantity_decimal` in a future version. If the line item is a proration or subscription, the quantity of the
     * subscription that the proration was computed for.
     */
    public var quantity: Int? = null

    /**
     * Non-negative decimal with at most 12 decimal places. The quantity of units for the line item.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    public var subscription: InlineLineItemSubscriptionX73f0eb42? = null

    private var taxesValue: List<BillingBillResourceInvoicingTaxesTax>? = null

    /**
     * The tax information of the line item.
     */
    public var taxes: List<BillingBillResourceInvoicingTaxesTax>?
      get() = taxesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): LineItem {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(discountableValue != null) { "discountable is required" }
      check(discountsValue != null) { "discounts is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(periodValue != null) { "period is required" }
      check(subtotalValue != null) { "subtotal is required" }
      return LineItem(
        amount = amount,
        currency = currency,
        discountable = discountable,
        discounts = discounts,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        period = period,
        subtotal = subtotal,
        description = description,
        discountAmounts = discountAmounts,
        invoice = invoice,
        parent = parent,
        pretaxCreditAmounts = pretaxCreditAmounts,
        pricing = pricing,
        quantity = quantity,
        quantityDecimal = quantityDecimal,
        subscription = subscription,
        taxes = taxes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LineItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LineItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LineItem {
      val jsonDecoder = decoder.requireJsonDecoder("LineItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LineItem must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val discountable = json.decodeRequired<Boolean>(rawObject, "discountable")
      val discounts = json.decodeRequired<List<InlineLineItemDiscountsItemX6313e0c2>>(rawObject, "discounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineLineItemObjectValueX8aaad4ae>(rawObject, "object")
      val period = json.decodeRequired<InvoiceLineItemPeriod>(rawObject, "period")
      val subtotal = json.decodeRequired<Int>(rawObject, "subtotal")
      return LineItem(
        amount = amount,
        currency = currency,
        discountable = discountable,
        discounts = discounts,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        period = period,
        subtotal = subtotal,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        discountAmounts = rawObject["discount_amounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<DiscountsResourceDiscountAmount>?>(element) },
        invoice = rawObject["invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLineItemParentX36380c91?>(element) },
        pretaxCreditAmounts = rawObject["pretax_credit_amounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InvoicesResourcePretaxCreditAmount>?>(element) },
        pricing = rawObject["pricing"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLineItemPricingX2cc3399a?>(element) },
        quantity = rawObject["quantity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLineItemSubscriptionX73f0eb42?>(element) },
        taxes = rawObject["taxes"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<BillingBillResourceInvoicingTaxesTax>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LineItem) {
      val jsonEncoder = encoder.requireJsonEncoder("LineItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("discountable", json.encodeToJsonElement(value.discountable))
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("period", json.encodeToJsonElement(value.period))
        put("subtotal", json.encodeToJsonElement(value.subtotal))
        value.description?.let { put("description", it) }
        value.discountAmounts?.let { put("discount_amounts", json.encodeToJsonElement(it)) }
        value.invoice?.let { put("invoice", it) }
        value.parent?.let { put("parent", json.encodeToJsonElement(it)) }
        value.pretaxCreditAmounts?.let { put("pretax_credit_amounts", json.encodeToJsonElement(it)) }
        value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.subscription?.let { put("subscription", json.encodeToJsonElement(it)) }
        value.taxes?.let { put("taxes", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun lineItem(block: LineItem.Builder.() -> Unit): LineItem = LineItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LineItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

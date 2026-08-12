package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class CreditNoteView internal constructor(
  public val amount: Int,
  @SerialName("amount_shipping")
  public val amountShipping: Int,
  public val created: Int,
  public val currency: String,
  public val customer: InlineCreditNoteCustomerX5db14bea,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("customer_balance_transaction")
  public val customerBalanceTransaction:
      InlineCreditNoteCustomerBalanceTransactionX7d3546fb? = null,
  @SerialName("discount_amount")
  public val discountAmount: Int,
  @SerialName("discount_amounts")
  public val discountAmounts: List<DiscountsResourceDiscountAmount>,
  @SerialName("effective_at")
  public val effectiveAt: Int? = null,
  public val id: String,
  public val invoice: InlineCreditNoteInvoiceX902a6092,
  public val lines: InlineCreditNoteLinesXb749c3c9,
  public val livemode: Boolean,
  public val memo: String? = null,
  public val metadata: Map<String, String>? = null,
  public val number: String,
  @SerialName("object")
  public val objectValue: InlineCreditNoteObjectValueX288d9931,
  @SerialName("out_of_band_amount")
  public val outOfBandAmount: Int? = null,
  public val pdf: String,
  @SerialName("post_payment_amount")
  public val postPaymentAmount: Int,
  @SerialName("pre_payment_amount")
  public val prePaymentAmount: Int,
  @SerialName("pretax_credit_amounts")
  public val pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount>,
  public val reason: InlineCreditNoteReasonX7a4479ce? = null,
  public val refunds: List<CreditNoteRefund>,
  @SerialName("shipping_cost")
  public val shippingCost: InlineCreditNoteShippingCostX7ab82b42? = null,
  public val status: InlineCreditNoteStatusX047deaee,
  public val subtotal: Int,
  @SerialName("subtotal_excluding_tax")
  public val subtotalExcludingTax: Int? = null,
  public val total: Int,
  @SerialName("total_excluding_tax")
  public val totalExcludingTax: Int? = null,
  @SerialName("total_taxes")
  public val totalTaxes: List<BillingBillResourceInvoicingTaxesTax>? = null,
  public val type: InlineCreditNoteTypeX53cc7c94,
  @SerialName("voided_at")
  public val voidedAt: Int? = null,
)

/**
 * Issue a credit note to adjust an invoice's amount after the invoice is finalized.
 *
 * Related guide: [Credit notes](https://docs.stripe.com/billing/invoices/credit-notes)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note
 */
@Serializable(with = CreditNote.Serializer::class)
public class CreditNote(
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit note, including tax.
   */
  public val amount: Int,
  /**
   * This is the sum of all the shipping amounts.
   */
  public val amountShipping: Int,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * ID of the customer.
   */
  public val customer: InlineCreditNoteCustomerX5db14bea,
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of discount that was credited.
   */
  public val discountAmount: Int,
  discountAmounts: List<DiscountsResourceDiscountAmount>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * ID of the invoice.
   */
  public val invoice: InlineCreditNoteInvoiceX902a6092,
  /**
   * Line items that make up the credit note
   */
  public val lines: InlineCreditNoteLinesXb749c3c9,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * A unique number that identifies this particular credit note and appears on the PDF of the credit note and its
   * associated invoice.
   */
  public val number: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCreditNoteObjectValueX288d9931,
  /**
   * The link to download the PDF of the credit note.
   */
  public val pdf: String,
  /**
   * The amount of the credit note that was refunded to the customer, credited to the customer's balance, credited
   * outside of Stripe, or any combination thereof.
   */
  public val postPaymentAmount: Int,
  /**
   * The amount of the credit note by which the invoice's `amount_remaining` and `amount_due` were reduced.
   */
  public val prePaymentAmount: Int,
  pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount>,
  refunds: List<CreditNoteRefund>,
  /**
   * Status of this credit note, one of `issued` or `void`. Learn more about [voiding credit
   * notes](https://docs.stripe.com/billing/invoices/credit-notes#voiding).
   */
  public val status: InlineCreditNoteStatusX047deaee,
  /**
   * The integer amount in cents (or local equivalent) representing the amount of the credit note, excluding exclusive
   * tax and invoice level discounts.
   */
  public val subtotal: Int,
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit note, including tax
   * and all discount.
   */
  public val total: Int,
  /**
   * Type of this credit note, one of `pre_payment` or `post_payment`. A `pre_payment` credit note means it was issued
   * when the invoice was open. A `post_payment` credit note means it was issued when the invoice was paid.
   */
  public val type: InlineCreditNoteTypeX53cc7c94,
  /**
   * ID of the account representing the customer.
   */
  public val customerAccount: String? = null,
  /**
   * Customer balance transaction related to this credit note.
   */
  public val customerBalanceTransaction:
      InlineCreditNoteCustomerBalanceTransactionX7d3546fb? = null,
  /**
   * The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value
   * replaces the system-generated 'Date of issue' printed on the credit note PDF.
   */
  public val effectiveAt: Int? = null,
  /**
   * Customer-facing text that appears on the credit note PDF.
   */
  public val memo: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * Amount that was credited outside of Stripe.
   */
  public val outOfBandAmount: Int? = null,
  /**
   * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
   */
  public val reason: InlineCreditNoteReasonX7a4479ce? = null,
  /**
   * The details of the cost of shipping, including the ShippingRate applied to the invoice.
   */
  public val shippingCost: InlineCreditNoteShippingCostX7ab82b42? = null,
  /**
   * The integer amount in cents (or local equivalent) representing the amount of the credit note, excluding all tax and
   * invoice level discounts.
   */
  public val subtotalExcludingTax: Int? = null,
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the credit note, excluding tax,
   * but including discounts.
   */
  public val totalExcludingTax: Int? = null,
  totalTaxes: List<BillingBillResourceInvoicingTaxesTax>? = null,
  /**
   * The time that the credit note was voided.
   */
  public val voidedAt: Int? = null,
) {
  /**
   * The aggregate amounts calculated per discount for all line items.
   */
  public val discountAmounts: List<DiscountsResourceDiscountAmount> = discountAmounts.toList()

  /**
   * The pretax credit amounts (ex: discount, credit grants, etc) for all line items.
   */
  public val pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount> = pretaxCreditAmounts.toList()

  /**
   * Refunds related to this credit note.
   */
  public val refunds: List<CreditNoteRefund> = refunds.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The aggregate tax information for all line items.
   */
  public val totalTaxes: List<BillingBillResourceInvoicingTaxesTax>? =
      totalTaxes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountShippingValue: Int? = null

    public var amountShipping: Int
      get() = requireNotNull(amountShippingValue) { "amountShipping is required" }
      set(`value`) {
        amountShippingValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var customerValue: InlineCreditNoteCustomerX5db14bea? = null

    public var customer: InlineCreditNoteCustomerX5db14bea
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var discountAmountValue: Int? = null

    public var discountAmount: Int
      get() = requireNotNull(discountAmountValue) { "discountAmount is required" }
      set(`value`) {
        discountAmountValue = value
      }

    private var discountAmountsValue: List<DiscountsResourceDiscountAmount>? = null

    public var discountAmounts: List<DiscountsResourceDiscountAmount>
      get() = requireNotNull(discountAmountsValue) { "discountAmounts is required" }.toList()
      set(`value`) {
        discountAmountsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var invoiceValue: InlineCreditNoteInvoiceX902a6092? = null

    public var invoice: InlineCreditNoteInvoiceX902a6092
      get() = requireNotNull(invoiceValue) { "invoice is required" }
      set(`value`) {
        invoiceValue = value
      }

    private var linesValue: InlineCreditNoteLinesXb749c3c9? = null

    public var lines: InlineCreditNoteLinesXb749c3c9
      get() = requireNotNull(linesValue) { "lines is required" }
      set(`value`) {
        linesValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var numberValue: String? = null

    public var number: String
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var objectValueValue: InlineCreditNoteObjectValueX288d9931? = null

    public var objectValue: InlineCreditNoteObjectValueX288d9931
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var pdfValue: String? = null

    public var pdf: String
      get() = requireNotNull(pdfValue) { "pdf is required" }
      set(`value`) {
        pdfValue = value
      }

    private var postPaymentAmountValue: Int? = null

    public var postPaymentAmount: Int
      get() = requireNotNull(postPaymentAmountValue) { "postPaymentAmount is required" }
      set(`value`) {
        postPaymentAmountValue = value
      }

    private var prePaymentAmountValue: Int? = null

    public var prePaymentAmount: Int
      get() = requireNotNull(prePaymentAmountValue) { "prePaymentAmount is required" }
      set(`value`) {
        prePaymentAmountValue = value
      }

    private var pretaxCreditAmountsValue: List<CreditNotesPretaxCreditAmount>? = null

    public var pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount>
      get() = requireNotNull(pretaxCreditAmountsValue) { "pretaxCreditAmounts is required" }.toList()
      set(`value`) {
        pretaxCreditAmountsValue = value.toList()
      }

    private var refundsValue: List<CreditNoteRefund>? = null

    public var refunds: List<CreditNoteRefund>
      get() = requireNotNull(refundsValue) { "refunds is required" }.toList()
      set(`value`) {
        refundsValue = value.toList()
      }

    private var statusValue: InlineCreditNoteStatusX047deaee? = null

    public var status: InlineCreditNoteStatusX047deaee
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var subtotalValue: Int? = null

    public var subtotal: Int
      get() = requireNotNull(subtotalValue) { "subtotal is required" }
      set(`value`) {
        subtotalValue = value
      }

    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    private var typeValue: InlineCreditNoteTypeX53cc7c94? = null

    public var type: InlineCreditNoteTypeX53cc7c94
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * ID of the account representing the customer.
     */
    public var customerAccount: String? = null

    /**
     * Customer balance transaction related to this credit note.
     */
    public var customerBalanceTransaction: InlineCreditNoteCustomerBalanceTransactionX7d3546fb? =
        null

    /**
     * The date when this credit note is in effect. Same as `created` unless overwritten. When defined, this value
     * replaces the system-generated 'Date of issue' printed on the credit note PDF.
     */
    public var effectiveAt: Int? = null

    /**
     * Customer-facing text that appears on the credit note PDF.
     */
    public var memo: String? = null

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
     * Amount that was credited outside of Stripe.
     */
    public var outOfBandAmount: Int? = null

    /**
     * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or
     * `product_unsatisfactory`
     */
    public var reason: InlineCreditNoteReasonX7a4479ce? = null

    /**
     * The details of the cost of shipping, including the ShippingRate applied to the invoice.
     */
    public var shippingCost: InlineCreditNoteShippingCostX7ab82b42? = null

    /**
     * The integer amount in cents (or local equivalent) representing the amount of the credit note, excluding all tax
     * and invoice level discounts.
     */
    public var subtotalExcludingTax: Int? = null

    /**
     * The integer amount in cents (or local equivalent) representing the total amount of the credit note, excluding
     * tax, but including discounts.
     */
    public var totalExcludingTax: Int? = null

    private var totalTaxesValue: List<BillingBillResourceInvoicingTaxesTax>? = null

    /**
     * The aggregate tax information for all line items.
     */
    public var totalTaxes: List<BillingBillResourceInvoicingTaxesTax>?
      get() = totalTaxesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        totalTaxesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The time that the credit note was voided.
     */
    public var voidedAt: Int? = null

    public fun build(): CreditNote {
      check(amountValue != null) { "amount is required" }
      check(amountShippingValue != null) { "amountShipping is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerValue != null) { "customer is required" }
      check(discountAmountValue != null) { "discountAmount is required" }
      check(discountAmountsValue != null) { "discountAmounts is required" }
      check(idValue != null) { "id is required" }
      check(invoiceValue != null) { "invoice is required" }
      check(linesValue != null) { "lines is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(numberValue != null) { "number is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(pdfValue != null) { "pdf is required" }
      check(postPaymentAmountValue != null) { "postPaymentAmount is required" }
      check(prePaymentAmountValue != null) { "prePaymentAmount is required" }
      check(pretaxCreditAmountsValue != null) { "pretaxCreditAmounts is required" }
      check(refundsValue != null) { "refunds is required" }
      check(statusValue != null) { "status is required" }
      check(subtotalValue != null) { "subtotal is required" }
      check(totalValue != null) { "total is required" }
      check(typeValue != null) { "type is required" }
      return CreditNote(
        amount = amount,
        amountShipping = amountShipping,
        created = created,
        currency = currency,
        customer = customer,
        discountAmount = discountAmount,
        discountAmounts = discountAmounts,
        id = id,
        invoice = invoice,
        lines = lines,
        livemode = livemode,
        number = number,
        objectValue = objectValue,
        pdf = pdf,
        postPaymentAmount = postPaymentAmount,
        prePaymentAmount = prePaymentAmount,
        pretaxCreditAmounts = pretaxCreditAmounts,
        refunds = refunds,
        status = status,
        subtotal = subtotal,
        total = total,
        type = type,
        customerAccount = customerAccount,
        customerBalanceTransaction = customerBalanceTransaction,
        effectiveAt = effectiveAt,
        memo = memo,
        metadata = metadata,
        outOfBandAmount = outOfBandAmount,
        reason = reason,
        shippingCost = shippingCost,
        subtotalExcludingTax = subtotalExcludingTax,
        totalExcludingTax = totalExcludingTax,
        totalTaxes = totalTaxes,
        voidedAt = voidedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreditNote = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreditNote> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreditNote {
      val jsonDecoder = decoder.requireJsonDecoder("CreditNote")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreditNote must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountShipping = json.decodeRequired<Int>(rawObject, "amount_shipping")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customer = json.decodeRequired<InlineCreditNoteCustomerX5db14bea>(rawObject, "customer")
      val discountAmount = json.decodeRequired<Int>(rawObject, "discount_amount")
      val discountAmounts = json.decodeRequired<List<DiscountsResourceDiscountAmount>>(rawObject, "discount_amounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val invoice = json.decodeRequired<InlineCreditNoteInvoiceX902a6092>(rawObject, "invoice")
      val lines = json.decodeRequired<InlineCreditNoteLinesXb749c3c9>(rawObject, "lines")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val number = json.decodeRequired<String>(rawObject, "number")
      val objectValue = json.decodeRequired<InlineCreditNoteObjectValueX288d9931>(rawObject, "object")
      val pdf = json.decodeRequired<String>(rawObject, "pdf")
      val postPaymentAmount = json.decodeRequired<Int>(rawObject, "post_payment_amount")
      val prePaymentAmount = json.decodeRequired<Int>(rawObject, "pre_payment_amount")
      val pretaxCreditAmounts = json.decodeRequired<List<CreditNotesPretaxCreditAmount>>(rawObject, "pretax_credit_amounts")
      val refunds = json.decodeRequired<List<CreditNoteRefund>>(rawObject, "refunds")
      val status = json.decodeRequired<InlineCreditNoteStatusX047deaee>(rawObject, "status")
      val subtotal = json.decodeRequired<Int>(rawObject, "subtotal")
      val total = json.decodeRequired<Int>(rawObject, "total")
      val type = json.decodeRequired<InlineCreditNoteTypeX53cc7c94>(rawObject, "type")
      return CreditNote(
        amount = amount,
        amountShipping = amountShipping,
        created = created,
        currency = currency,
        customer = customer,
        discountAmount = discountAmount,
        discountAmounts = discountAmounts,
        id = id,
        invoice = invoice,
        lines = lines,
        livemode = livemode,
        number = number,
        objectValue = objectValue,
        pdf = pdf,
        postPaymentAmount = postPaymentAmount,
        prePaymentAmount = prePaymentAmount,
        pretaxCreditAmounts = pretaxCreditAmounts,
        refunds = refunds,
        status = status,
        subtotal = subtotal,
        total = total,
        type = type,
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerBalanceTransaction = rawObject["customer_balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCreditNoteCustomerBalanceTransactionX7d3546fb?>(element) },
        effectiveAt = rawObject["effective_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        memo = rawObject["memo"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        outOfBandAmount = rawObject["out_of_band_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCreditNoteReasonX7a4479ce?>(element) },
        shippingCost = rawObject["shipping_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCreditNoteShippingCostX7ab82b42?>(element) },
        subtotalExcludingTax = rawObject["subtotal_excluding_tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        totalExcludingTax = rawObject["total_excluding_tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        totalTaxes = rawObject["total_taxes"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<BillingBillResourceInvoicingTaxesTax>?>(element) },
        voidedAt = rawObject["voided_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreditNote) {
      val jsonEncoder = encoder.requireJsonEncoder("CreditNote")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_shipping", json.encodeToJsonElement(value.amountShipping))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("customer", json.encodeToJsonElement(value.customer))
        put("discount_amount", json.encodeToJsonElement(value.discountAmount))
        put("discount_amounts", json.encodeToJsonElement(value.discountAmounts))
        put("id", value.id)
        put("invoice", json.encodeToJsonElement(value.invoice))
        put("lines", json.encodeToJsonElement(value.lines))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("number", value.number)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("pdf", value.pdf)
        put("post_payment_amount", json.encodeToJsonElement(value.postPaymentAmount))
        put("pre_payment_amount", json.encodeToJsonElement(value.prePaymentAmount))
        put("pretax_credit_amounts", json.encodeToJsonElement(value.pretaxCreditAmounts))
        put("refunds", json.encodeToJsonElement(value.refunds))
        put("status", json.encodeToJsonElement(value.status))
        put("subtotal", json.encodeToJsonElement(value.subtotal))
        put("total", json.encodeToJsonElement(value.total))
        put("type", json.encodeToJsonElement(value.type))
        value.customerAccount?.let { put("customer_account", it) }
        value.customerBalanceTransaction?.let { put("customer_balance_transaction", json.encodeToJsonElement(it)) }
        value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
        value.memo?.let { put("memo", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.outOfBandAmount?.let { put("out_of_band_amount", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
        value.subtotalExcludingTax?.let { put("subtotal_excluding_tax", json.encodeToJsonElement(it)) }
        value.totalExcludingTax?.let { put("total_excluding_tax", json.encodeToJsonElement(it)) }
        value.totalTaxes?.let { put("total_taxes", json.encodeToJsonElement(it)) }
        value.voidedAt?.let { put("voided_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun creditNote(block: CreditNote.Builder.() -> Unit): CreditNote = CreditNote.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreditNote is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

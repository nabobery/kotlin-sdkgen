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
public data class InvoiceView internal constructor(
  @SerialName("account_country")
  public val accountCountry: String? = null,
  @SerialName("account_name")
  public val accountName: String? = null,
  @SerialName("account_tax_ids")
  public val accountTaxIds: List<InlineInvoiceAccountTaxIdsItemX1551760a>? = null,
  @SerialName("amount_due")
  public val amountDue: Int,
  @SerialName("amount_overpaid")
  public val amountOverpaid: Int,
  @SerialName("amount_paid")
  public val amountPaid: Int,
  @SerialName("amount_paid_off_stripe")
  public val amountPaidOffStripe: Int,
  @SerialName("amount_remaining")
  public val amountRemaining: Int,
  @SerialName("amount_shipping")
  public val amountShipping: Int,
  public val application: InlineInvoiceApplicationXa23803cc? = null,
  @SerialName("attempt_count")
  public val attemptCount: Int,
  public val attempted: Boolean,
  @SerialName("auto_advance")
  public val autoAdvance: Boolean,
  @SerialName("automatic_tax")
  public val automaticTax: AutomaticTax,
  @SerialName("automatically_finalizes_at")
  public val automaticallyFinalizesAt: Int? = null,
  @SerialName("billing_reason")
  public val billingReason: InlineInvoiceBillingReasonX80b9bb9a? = null,
  @SerialName("collection_method")
  public val collectionMethod: InlineInvoiceCollectionMethodX6027ccc9,
  @SerialName("confirmation_secret")
  public val confirmationSecret: InlineInvoiceConfirmationSecretXf5c1d047? = null,
  public val created: Int,
  public val currency: String,
  @SerialName("custom_fields")
  public val customFields: List<InvoiceSettingCustomField>? = null,
  public val customer: InlineInvoiceCustomerX09737939,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("customer_address")
  public val customerAddress: InlineInvoiceCustomerAddressXd90d3b3c? = null,
  @SerialName("customer_email")
  public val customerEmail: String? = null,
  @SerialName("customer_name")
  public val customerName: String? = null,
  @SerialName("customer_phone")
  public val customerPhone: String? = null,
  @SerialName("customer_shipping")
  public val customerShipping: InlineInvoiceCustomerShippingX637aa4fd? = null,
  @SerialName("customer_tax_exempt")
  public val customerTaxExempt: InlineInvoiceCustomerTaxExemptX99293270? = null,
  @SerialName("customer_tax_ids")
  public val customerTaxIds: List<InvoicesResourceInvoiceTaxId>? = null,
  @SerialName("default_payment_method")
  public val defaultPaymentMethod: InlineInvoiceDefaultPaymentMethodX0987464e? = null,
  @SerialName("default_source")
  public val defaultSource: InlineInvoiceDefaultSourceXee93951e? = null,
  @SerialName("default_tax_rates")
  public val defaultTaxRates: List<TaxRate>,
  public val description: String? = null,
  public val discounts: List<InlineInvoiceDiscountsItemX330b63da>,
  @SerialName("due_date")
  public val dueDate: Int? = null,
  @SerialName("effective_at")
  public val effectiveAt: Int? = null,
  @SerialName("ending_balance")
  public val endingBalance: Int? = null,
  public val footer: String? = null,
  @SerialName("from_invoice")
  public val fromInvoice: InlineInvoiceFromInvoiceX9a820e87? = null,
  @SerialName("hosted_invoice_url")
  public val hostedInvoiceUrl: String? = null,
  public val id: String,
  @SerialName("invoice_pdf")
  public val invoicePdf: String? = null,
  public val issuer: ConnectAccountReference,
  @SerialName("last_finalization_error")
  public val lastFinalizationError: InlineInvoiceLastFinalizationErrorX40488156? = null,
  @SerialName("latest_revision")
  public val latestRevision: InlineInvoiceLatestRevisionX60f0e9cc? = null,
  public val lines: InlineInvoiceLinesXd6c4ba46,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  @SerialName("next_payment_attempt")
  public val nextPaymentAttempt: Int? = null,
  public val number: String? = null,
  @SerialName("object")
  public val objectValue: InlineInvoiceObjectValueX73192cfd,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlineInvoiceOnBehalfOfX7ed9f131? = null,
  public val parent: InlineInvoiceParentX8edc2487? = null,
  @SerialName("payment_settings")
  public val paymentSettings: InvoicesPaymentSettings,
  public val payments: InlineInvoicePaymentsX14523dba? = null,
  @SerialName("period_end")
  public val periodEnd: Int,
  @SerialName("period_start")
  public val periodStart: Int,
  @SerialName("post_payment_credit_notes_amount")
  public val postPaymentCreditNotesAmount: Int,
  @SerialName("pre_payment_credit_notes_amount")
  public val prePaymentCreditNotesAmount: Int,
  @SerialName("receipt_number")
  public val receiptNumber: String? = null,
  public val rendering: InlineInvoiceRenderingXdc55f306? = null,
  @SerialName("shipping_cost")
  public val shippingCost: InlineInvoiceShippingCostX6b71ee6d? = null,
  @SerialName("shipping_details")
  public val shippingDetails: InlineInvoiceShippingDetailsX786d6124? = null,
  @SerialName("starting_balance")
  public val startingBalance: Int,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  public val status: InlineInvoiceStatusXe812c730? = null,
  @SerialName("status_transitions")
  public val statusTransitions: InvoicesResourceStatusTransitions,
  public val subtotal: Int,
  @SerialName("subtotal_excluding_tax")
  public val subtotalExcludingTax: Int? = null,
  @SerialName("test_clock")
  public val testClock: InlineInvoiceTestClockXd1c185be? = null,
  @SerialName("threshold_reason")
  public val thresholdReason: InvoiceThresholdReason? = null,
  public val total: Int,
  @SerialName("total_discount_amounts")
  public val totalDiscountAmounts: List<DiscountsResourceDiscountAmount>? = null,
  @SerialName("total_excluding_tax")
  public val totalExcludingTax: Int? = null,
  @SerialName("total_pretax_credit_amounts")
  public val totalPretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>? = null,
  @SerialName("total_taxes")
  public val totalTaxes: List<BillingBillResourceInvoicingTaxesTax>? = null,
  @SerialName("webhooks_delivered_at")
  public val webhooksDeliveredAt: Int? = null,
)

/**
 * Invoices are statements of amounts owed by a customer, and are either
 * generated one-off, or generated periodically from a subscription.
 *
 * They contain [invoice items](https://api.stripe.com#invoiceitems), and proration adjustments
 * that may be caused by subscription upgrades/downgrades (if necessary).
 *
 * If your invoice is configured to be billed through automatic charges,
 * Stripe automatically finalizes your invoice and attempts payment. Note
 * that finalizing the invoice,
 * [when automatic](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection), does
 * not happen immediately as the invoice is created. Stripe waits
 * until one hour after the last webhook was successfully sent (or the last
 * webhook timed out after failing). If you (and the platforms you may have
 * connected to) have no webhooks configured, Stripe waits one hour after
 * creation to finalize the invoice.
 *
 * If your invoice is configured to be billed by sending an email, then based on your
 * [email settings](https://dashboard.stripe.com/account/billing/automatic),
 * Stripe will email the invoice to your customer and await payment. These
 * emails can contain a link to a hosted page to pay the invoice.
 *
 * Stripe applies any customer credit on the account before determining the
 * amount due for the invoice (i.e., the amount that will be actually
 * charged). If the amount due for the invoice is less than Stripe's [minimum allowed charge
 * per currency](/docs/currencies#minimum-and-maximum-charge-amounts), the
 * invoice is automatically marked paid, and we add the amount due to the
 * customer's credit balance which is applied to the next invoice.
 *
 * More details on the customer's credit balance are
 * [here](https://docs.stripe.com/billing/customer/balance).
 *
 * Related guide: [Send invoices to customers](https://docs.stripe.com/billing/invoices/sending)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice
 */
@Serializable(with = Invoice.Serializer::class)
public class Invoice(
  /**
   * Final amount due at this time for this invoice. If the invoice's total is smaller than the minimum charge amount,
   * for example, or if there is account credit that can be applied to the invoice, the `amount_due` may be 0. If there
   * is a positive `starting_balance` for the invoice (the customer owes money), the `amount_due` will also take that
   * into account. The charge that gets generated for the invoice will be for the amount specified in `amount_due`.
   */
  public val amountDue: Int,
  /**
   * Amount that was overpaid on the invoice. The amount overpaid is credited to the customer's credit balance.
   */
  public val amountOverpaid: Int,
  /**
   * The amount, in cents (or local equivalent), that was paid.
   */
  public val amountPaid: Int,
  /**
   * Amount, in cents (or local equivalent), that was paid on the invoice outside of Stripe.
   */
  public val amountPaidOffStripe: Int,
  /**
   * The difference between amount_due and amount_paid, in cents (or local equivalent).
   */
  public val amountRemaining: Int,
  /**
   * This is the sum of all the shipping amounts.
   */
  public val amountShipping: Int,
  /**
   * Number of payment attempts made for this invoice, from the perspective of the payment retry schedule. Any payment
   * attempt counts as the first attempt, and subsequently only automatic retries increment the attempt count. In other
   * words, manual payment attempts after the first attempt do not affect the retry schedule. If a failure is returned
   * with a non-retryable return code, the invoice can no longer be retried unless a new payment method is obtained.
   * Retries will continue to be scheduled, and attempt_count will continue to increment, but retries will only be
   * executed if a new payment method is obtained.
   */
  public val attemptCount: Int,
  /**
   * Whether an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour after the
   * `invoice.created` webhook, for example, so you might not want to display that invoice as unpaid to your users.
   */
  public val attempted: Boolean,
  /**
   * Controls whether Stripe performs [automatic
   * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice. If
   * `false`, the invoice's state doesn't automatically advance without an explicit action.
   */
  public val autoAdvance: Boolean,
  public val automaticTax: AutomaticTax,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
   * invoice using the default source attached to the customer. When sending an invoice, Stripe will email this invoice
   * to the customer with payment instructions.
   */
  public val collectionMethod: InlineInvoiceCollectionMethodX6027ccc9,
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
   * The ID of the customer to bill.
   */
  public val customer: InlineInvoiceCustomerX09737939,
  defaultTaxRates: List<TaxRate>,
  discounts: List<InlineInvoiceDiscountsItemX330b63da>,
  /**
   * Unique identifier for the object. For preview invoices created using the [create
   * preview](https://stripe.com/docs/api/invoices/create_preview) endpoint, this id will be prefixed with
   * `upcoming_in`.
   */
  public val id: String,
  public val issuer: ConnectAccountReference,
  /**
   * The individual line items that make up the invoice. `lines` is sorted as follows: (1) pending invoice items
   * (including prorations) in reverse chronological order, (2) subscription items in reverse chronological order, and
   * (3) invoice items added after invoice creation in chronological order.
   */
  public val lines: InlineInvoiceLinesXd6c4ba46,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineInvoiceObjectValueX73192cfd,
  public val paymentSettings: InvoicesPaymentSettings,
  /**
   * The latest timestamp at which invoice items can be associated with this invoice. Use the [line item
   * period](/api/invoices/line_item#invoice_line_item_object-period) to get the service period for each price.
   */
  public val periodEnd: Int,
  /**
   * The earliest timestamp at which invoice items can be associated with this invoice. Use the [line item
   * period](/api/invoices/line_item#invoice_line_item_object-period) to get the service period for each price.
   */
  public val periodStart: Int,
  /**
   * Total amount of all post-payment credit notes issued for this invoice.
   */
  public val postPaymentCreditNotesAmount: Int,
  /**
   * Total amount of all pre-payment credit notes issued for this invoice.
   */
  public val prePaymentCreditNotesAmount: Int,
  /**
   * Starting customer balance before the invoice is finalized. If the invoice has not been finalized yet, this will be
   * the current customer balance. For revision invoices, this also includes any customer balance that was applied to
   * the original invoice.
   */
  public val startingBalance: Int,
  public val statusTransitions: InvoicesResourceStatusTransitions,
  /**
   * Total of all subscriptions, invoice items, and prorations on the invoice before any invoice level discount or
   * exclusive tax is applied. Item discounts are already incorporated
   */
  public val subtotal: Int,
  /**
   * Total after discounts and taxes.
   */
  public val total: Int,
  /**
   * The country of the business associated with this invoice, most often the business creating the invoice.
   */
  public val accountCountry: String? = null,
  /**
   * The public name of the business associated with this invoice, most often the business creating the invoice.
   */
  public val accountName: String? = null,
  accountTaxIds: List<InlineInvoiceAccountTaxIdsItemX1551760a>? = null,
  /**
   * ID of the Connect Application that created the invoice.
   */
  public val application: InlineInvoiceApplicationXa23803cc? = null,
  /**
   * The time when this invoice is currently scheduled to be automatically finalized. The field will be `null` if the
   * invoice is not scheduled to finalize in the future. If the invoice is not in the draft state, this field will
   * always be `null` - see `finalized_at` for the time when an already-finalized invoice was finalized.
   */
  public val automaticallyFinalizesAt: Int? = null,
  /**
   * Indicates the reason why the invoice was created.
   *
   * * `manual`: Unrelated to a subscription, for example, created via the invoice editor.
   * * `subscription`: No longer in use. Applies to subscriptions from before May 2018 where no distinction was made
   * between updates, cycles, and thresholds.
   * * `subscription_create`: A new subscription was created.
   * * `subscription_cycle`: A subscription advanced into a new period.
   * * `subscription_threshold`: A subscription reached a billing threshold.
   * * `subscription_update`: A subscription was updated.
   * * `upcoming`: Reserved for upcoming invoices created through the Create Preview Invoice API or when an
   * `invoice.upcoming` event is generated for an upcoming invoice on a subscription.
   */
  public val billingReason: InlineInvoiceBillingReasonX80b9bb9a? = null,
  /**
   * The confirmation secret associated with this invoice. Currently, this contains the client_secret of the
   * PaymentIntent that Stripe creates during invoice finalization.
   */
  public val confirmationSecret: InlineInvoiceConfirmationSecretXf5c1d047? = null,
  customFields: List<InvoiceSettingCustomField>? = null,
  /**
   * The ID of the account representing the customer to bill.
   */
  public val customerAccount: String? = null,
  /**
   * The customer's address. Until the invoice is finalized, this field will equal `customer.address`. Once the invoice
   * is finalized, this field will no longer be updated.
   */
  public val customerAddress: InlineInvoiceCustomerAddressXd90d3b3c? = null,
  /**
   * The customer's email. Until the invoice is finalized, this field will equal `customer.email`. Once the invoice is
   * finalized, this field will no longer be updated.
   */
  public val customerEmail: String? = null,
  /**
   * The customer's name. Until the invoice is finalized, this field will equal `customer.name`. Once the invoice is
   * finalized, this field will no longer be updated.
   */
  public val customerName: String? = null,
  /**
   * The customer's phone number. Until the invoice is finalized, this field will equal `customer.phone`. Once the
   * invoice is finalized, this field will no longer be updated.
   */
  public val customerPhone: String? = null,
  /**
   * The customer's shipping information. Until the invoice is finalized, this field will equal `customer.shipping`.
   * Once the invoice is finalized, this field will no longer be updated.
   */
  public val customerShipping: InlineInvoiceCustomerShippingX637aa4fd? = null,
  /**
   * The customer's tax exempt status. Until the invoice is finalized, this field will equal `customer.tax_exempt`. Once
   * the invoice is finalized, this field will no longer be updated.
   */
  public val customerTaxExempt: InlineInvoiceCustomerTaxExemptX99293270? = null,
  customerTaxIds: List<InvoicesResourceInvoiceTaxId>? = null,
  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice. If
   * not set, defaults to the subscription's default payment method, if any, or to the default payment method in the
   * customer's invoice settings.
   */
  public val defaultPaymentMethod: InlineInvoiceDefaultPaymentMethodX0987464e? = null,
  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and be
   * in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's
   * default source.
   */
  public val defaultSource: InlineInvoiceDefaultSourceXee93951e? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the
   * Dashboard.
   */
  public val description: String? = null,
  /**
   * The date on which payment for this invoice is due. This value will be `null` for invoices where
   * `collection_method=charge_automatically`.
   */
  public val dueDate: Int? = null,
  /**
   * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value
   * replaces the system-generated 'Date of issue' printed on the invoice PDF and receipt.
   */
  public val effectiveAt: Int? = null,
  /**
   * Ending customer balance after the invoice is finalized. Invoices are finalized approximately an hour after
   * successful webhook delivery or when payment collection is attempted for the invoice. If the invoice has not been
   * finalized yet, this will be null.
   */
  public val endingBalance: Int? = null,
  /**
   * Footer displayed on the invoice.
   */
  public val footer: String? = null,
  /**
   * Details of the invoice that was cloned. See the [revision
   * documentation](https://docs.stripe.com/invoicing/invoice-revisions) for more details.
   */
  public val fromInvoice: InlineInvoiceFromInvoiceX9a820e87? = null,
  /**
   * The URL for the hosted invoice page, which allows customers to view and pay an invoice. If the invoice has not been
   * finalized yet, this will be null.
   */
  public val hostedInvoiceUrl: String? = null,
  /**
   * The link to download the PDF for the invoice. If the invoice has not been finalized yet, this will be null.
   */
  public val invoicePdf: String? = null,
  /**
   * The error encountered during the previous attempt to finalize the invoice. This field is cleared when the invoice
   * is successfully finalized.
   */
  public val lastFinalizationError: InlineInvoiceLastFinalizationErrorX40488156? = null,
  /**
   * The ID of the most recent non-draft revision of this invoice
   */
  public val latestRevision: InlineInvoiceLatestRevisionX60f0e9cc? = null,
  metadata: Map<String, String>? = null,
  /**
   * The time at which payment will next be attempted. This value will be `null` for invoices where
   * `collection_method=send_invoice`.
   */
  public val nextPaymentAttempt: Int? = null,
  /**
   * A unique, identifying string that appears on emails sent to the customer for this invoice. This starts with the
   * customer's unique invoice_prefix if it is specified.
   */
  public val number: String? = null,
  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
   * with the branding and support information of the specified account. See the [Invoices with
   * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
   */
  public val onBehalfOf: InlineInvoiceOnBehalfOfX7ed9f131? = null,
  /**
   * The parent that generated this invoice
   */
  public val parent: InlineInvoiceParentX8edc2487? = null,
  /**
   * Payments for this invoice. Use [invoice payment](/api/invoice-payment) to get more details.
   */
  public val payments: InlineInvoicePaymentsX14523dba? = null,
  /**
   * This is the transaction number that appears on email receipts sent for this invoice.
   */
  public val receiptNumber: String? = null,
  /**
   * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF
   * and Hosted Invoice Page.
   */
  public val rendering: InlineInvoiceRenderingXdc55f306? = null,
  /**
   * The details of the cost of shipping, including the ShippingRate applied on the invoice.
   */
  public val shippingCost: InlineInvoiceShippingCostX6b71ee6d? = null,
  /**
   * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the
   * PDF will render the shipping address from the customer.
   */
  public val shippingDetails: InlineInvoiceShippingDetailsX786d6124? = null,
  /**
   * Extra information about an invoice for the customer's credit card statement.
   */
  public val statementDescriptor: String? = null,
  /**
   * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn
   * more](https://docs.stripe.com/billing/invoices/workflow#workflow-overview)
   */
  public val status: InlineInvoiceStatusXe812c730? = null,
  /**
   * The integer amount in cents (or local equivalent) representing the subtotal of the invoice before any invoice level
   * discount or tax is applied. Item discounts are already incorporated
   */
  public val subtotalExcludingTax: Int? = null,
  /**
   * ID of the test clock this invoice belongs to.
   */
  public val testClock: InlineInvoiceTestClockXd1c185be? = null,
  public val thresholdReason: InvoiceThresholdReason? = null,
  totalDiscountAmounts: List<DiscountsResourceDiscountAmount>? = null,
  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the invoice including all
   * discounts but excluding all tax.
   */
  public val totalExcludingTax: Int? = null,
  totalPretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>? = null,
  totalTaxes: List<BillingBillResourceInvoicingTaxesTax>? = null,
  /**
   * Invoices are automatically paid or sent 1 hour after webhooks are delivered, or until all webhook delivery attempts
   * have [been exhausted](https://docs.stripe.com/billing/webhooks#understand). This field tracks the time when
   * webhooks for this invoice were successfully delivered. If the invoice had no webhooks to deliver, this will be set
   * while the invoice is being created.
   */
  public val webhooksDeliveredAt: Int? = null,
) {
  /**
   * The tax rates applied to this invoice, if any.
   */
  public val defaultTaxRates: List<TaxRate> = defaultTaxRates.toList()

  /**
   * The discounts applied to the invoice. Line item discounts are applied before invoice discounts. Use
   * `expand[]=discounts` to expand each discount.
   */
  public val discounts: List<InlineInvoiceDiscountsItemX330b63da> = discounts.toList()

  /**
   * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
   */
  public val accountTaxIds: List<InlineInvoiceAccountTaxIdsItemX1551760a>? =
      accountTaxIds?.let { collection0 -> collection0.toList() }

  /**
   * Custom fields displayed on the invoice.
   */
  public val customFields: List<InvoiceSettingCustomField>? =
      customFields?.let { collection0 -> collection0.toList() }

  /**
   * The customer's tax IDs. Until the invoice is finalized, this field will contain the same tax IDs as
   * `customer.tax_ids`. Once the invoice is finalized, this field will no longer be updated.
   */
  public val customerTaxIds: List<InvoicesResourceInvoiceTaxId>? =
      customerTaxIds?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The aggregate amounts calculated per discount across all line items.
   */
  public val totalDiscountAmounts: List<DiscountsResourceDiscountAmount>? =
      totalDiscountAmounts?.let { collection0 -> collection0.toList() }

  /**
   * Contains pretax credit amounts (ex: discount, credit grants, etc) that apply to this invoice. This is a combined
   * list of total_pretax_credit_amounts across all invoice line items.
   */
  public val totalPretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>? =
      totalPretaxCreditAmounts?.let { collection0 -> collection0.toList() }

  /**
   * The aggregate tax information of all line items.
   */
  public val totalTaxes: List<BillingBillResourceInvoicingTaxesTax>? =
      totalTaxes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountDueValue: Int? = null

    public var amountDue: Int
      get() = requireNotNull(amountDueValue) { "amountDue is required" }
      set(`value`) {
        amountDueValue = value
      }

    private var amountOverpaidValue: Int? = null

    public var amountOverpaid: Int
      get() = requireNotNull(amountOverpaidValue) { "amountOverpaid is required" }
      set(`value`) {
        amountOverpaidValue = value
      }

    private var amountPaidValue: Int? = null

    public var amountPaid: Int
      get() = requireNotNull(amountPaidValue) { "amountPaid is required" }
      set(`value`) {
        amountPaidValue = value
      }

    private var amountPaidOffStripeValue: Int? = null

    public var amountPaidOffStripe: Int
      get() = requireNotNull(amountPaidOffStripeValue) { "amountPaidOffStripe is required" }
      set(`value`) {
        amountPaidOffStripeValue = value
      }

    private var amountRemainingValue: Int? = null

    public var amountRemaining: Int
      get() = requireNotNull(amountRemainingValue) { "amountRemaining is required" }
      set(`value`) {
        amountRemainingValue = value
      }

    private var amountShippingValue: Int? = null

    public var amountShipping: Int
      get() = requireNotNull(amountShippingValue) { "amountShipping is required" }
      set(`value`) {
        amountShippingValue = value
      }

    private var attemptCountValue: Int? = null

    public var attemptCount: Int
      get() = requireNotNull(attemptCountValue) { "attemptCount is required" }
      set(`value`) {
        attemptCountValue = value
      }

    private var attemptedValue: Boolean? = null

    public var attempted: Boolean
      get() = requireNotNull(attemptedValue) { "attempted is required" }
      set(`value`) {
        attemptedValue = value
      }

    private var autoAdvanceValue: Boolean? = null

    public var autoAdvance: Boolean
      get() = requireNotNull(autoAdvanceValue) { "autoAdvance is required" }
      set(`value`) {
        autoAdvanceValue = value
      }

    private var automaticTaxValue: AutomaticTax? = null

    public var automaticTax: AutomaticTax
      get() = requireNotNull(automaticTaxValue) { "automaticTax is required" }
      set(`value`) {
        automaticTaxValue = value
      }

    private var collectionMethodValue: InlineInvoiceCollectionMethodX6027ccc9? = null

    public var collectionMethod: InlineInvoiceCollectionMethodX6027ccc9
      get() = requireNotNull(collectionMethodValue) { "collectionMethod is required" }
      set(`value`) {
        collectionMethodValue = value
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

    private var customerValue: InlineInvoiceCustomerX09737939? = null

    public var customer: InlineInvoiceCustomerX09737939
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var defaultTaxRatesValue: List<TaxRate>? = null

    public var defaultTaxRates: List<TaxRate>
      get() = requireNotNull(defaultTaxRatesValue) { "defaultTaxRates is required" }.toList()
      set(`value`) {
        defaultTaxRatesValue = value.toList()
      }

    private var discountsValue: List<InlineInvoiceDiscountsItemX330b63da>? = null

    public var discounts: List<InlineInvoiceDiscountsItemX330b63da>
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

    private var issuerValue: ConnectAccountReference? = null

    public var issuer: ConnectAccountReference
      get() = requireNotNull(issuerValue) { "issuer is required" }
      set(`value`) {
        issuerValue = value
      }

    private var linesValue: InlineInvoiceLinesXd6c4ba46? = null

    public var lines: InlineInvoiceLinesXd6c4ba46
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

    private var objectValueValue: InlineInvoiceObjectValueX73192cfd? = null

    public var objectValue: InlineInvoiceObjectValueX73192cfd
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentSettingsValue: InvoicesPaymentSettings? = null

    public var paymentSettings: InvoicesPaymentSettings
      get() = requireNotNull(paymentSettingsValue) { "paymentSettings is required" }
      set(`value`) {
        paymentSettingsValue = value
      }

    private var periodEndValue: Int? = null

    public var periodEnd: Int
      get() = requireNotNull(periodEndValue) { "periodEnd is required" }
      set(`value`) {
        periodEndValue = value
      }

    private var periodStartValue: Int? = null

    public var periodStart: Int
      get() = requireNotNull(periodStartValue) { "periodStart is required" }
      set(`value`) {
        periodStartValue = value
      }

    private var postPaymentCreditNotesAmountValue: Int? = null

    public var postPaymentCreditNotesAmount: Int
      get() = requireNotNull(postPaymentCreditNotesAmountValue) { "postPaymentCreditNotesAmount is required" }
      set(`value`) {
        postPaymentCreditNotesAmountValue = value
      }

    private var prePaymentCreditNotesAmountValue: Int? = null

    public var prePaymentCreditNotesAmount: Int
      get() = requireNotNull(prePaymentCreditNotesAmountValue) { "prePaymentCreditNotesAmount is required" }
      set(`value`) {
        prePaymentCreditNotesAmountValue = value
      }

    private var startingBalanceValue: Int? = null

    public var startingBalance: Int
      get() = requireNotNull(startingBalanceValue) { "startingBalance is required" }
      set(`value`) {
        startingBalanceValue = value
      }

    private var statusTransitionsValue: InvoicesResourceStatusTransitions? = null

    public var statusTransitions: InvoicesResourceStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
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

    /**
     * The country of the business associated with this invoice, most often the business creating the invoice.
     */
    public var accountCountry: String? = null

    /**
     * The public name of the business associated with this invoice, most often the business creating the invoice.
     */
    public var accountName: String? = null

    private var accountTaxIdsValue: List<InlineInvoiceAccountTaxIdsItemX1551760a>? = null

    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public var accountTaxIds: List<InlineInvoiceAccountTaxIdsItemX1551760a>?
      get() = accountTaxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountTaxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * ID of the Connect Application that created the invoice.
     */
    public var application: InlineInvoiceApplicationXa23803cc? = null

    /**
     * The time when this invoice is currently scheduled to be automatically finalized. The field will be `null` if the
     * invoice is not scheduled to finalize in the future. If the invoice is not in the draft state, this field will
     * always be `null` - see `finalized_at` for the time when an already-finalized invoice was finalized.
     */
    public var automaticallyFinalizesAt: Int? = null

    /**
     * Indicates the reason why the invoice was created.
     *
     * * `manual`: Unrelated to a subscription, for example, created via the invoice editor.
     * * `subscription`: No longer in use. Applies to subscriptions from before May 2018 where no distinction was made
     * between updates, cycles, and thresholds.
     * * `subscription_create`: A new subscription was created.
     * * `subscription_cycle`: A subscription advanced into a new period.
     * * `subscription_threshold`: A subscription reached a billing threshold.
     * * `subscription_update`: A subscription was updated.
     * * `upcoming`: Reserved for upcoming invoices created through the Create Preview Invoice API or when an
     * `invoice.upcoming` event is generated for an upcoming invoice on a subscription.
     */
    public var billingReason: InlineInvoiceBillingReasonX80b9bb9a? = null

    /**
     * The confirmation secret associated with this invoice. Currently, this contains the client_secret of the
     * PaymentIntent that Stripe creates during invoice finalization.
     */
    public var confirmationSecret: InlineInvoiceConfirmationSecretXf5c1d047? = null

    private var customFieldsValue: List<InvoiceSettingCustomField>? = null

    /**
     * Custom fields displayed on the invoice.
     */
    public var customFields: List<InvoiceSettingCustomField>?
      get() = customFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The ID of the account representing the customer to bill.
     */
    public var customerAccount: String? = null

    /**
     * The customer's address. Until the invoice is finalized, this field will equal `customer.address`. Once the
     * invoice is finalized, this field will no longer be updated.
     */
    public var customerAddress: InlineInvoiceCustomerAddressXd90d3b3c? = null

    /**
     * The customer's email. Until the invoice is finalized, this field will equal `customer.email`. Once the invoice is
     * finalized, this field will no longer be updated.
     */
    public var customerEmail: String? = null

    /**
     * The customer's name. Until the invoice is finalized, this field will equal `customer.name`. Once the invoice is
     * finalized, this field will no longer be updated.
     */
    public var customerName: String? = null

    /**
     * The customer's phone number. Until the invoice is finalized, this field will equal `customer.phone`. Once the
     * invoice is finalized, this field will no longer be updated.
     */
    public var customerPhone: String? = null

    /**
     * The customer's shipping information. Until the invoice is finalized, this field will equal `customer.shipping`.
     * Once the invoice is finalized, this field will no longer be updated.
     */
    public var customerShipping: InlineInvoiceCustomerShippingX637aa4fd? = null

    /**
     * The customer's tax exempt status. Until the invoice is finalized, this field will equal `customer.tax_exempt`.
     * Once the invoice is finalized, this field will no longer be updated.
     */
    public var customerTaxExempt: InlineInvoiceCustomerTaxExemptX99293270? = null

    private var customerTaxIdsValue: List<InvoicesResourceInvoiceTaxId>? = null

    /**
     * The customer's tax IDs. Until the invoice is finalized, this field will contain the same tax IDs as
     * `customer.tax_ids`. Once the invoice is finalized, this field will no longer be updated.
     */
    public var customerTaxIds: List<InvoicesResourceInvoiceTaxId>?
      get() = customerTaxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customerTaxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice. If
     * not set, defaults to the subscription's default payment method, if any, or to the default payment method in the
     * customer's invoice settings.
     */
    public var defaultPaymentMethod: InlineInvoiceDefaultPaymentMethodX0987464e? = null

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and
     * be in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's
     * default source.
     */
    public var defaultSource: InlineInvoiceDefaultSourceXee93951e? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the
     * Dashboard.
     */
    public var description: String? = null

    /**
     * The date on which payment for this invoice is due. This value will be `null` for invoices where
     * `collection_method=charge_automatically`.
     */
    public var dueDate: Int? = null

    /**
     * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value
     * replaces the system-generated 'Date of issue' printed on the invoice PDF and receipt.
     */
    public var effectiveAt: Int? = null

    /**
     * Ending customer balance after the invoice is finalized. Invoices are finalized approximately an hour after
     * successful webhook delivery or when payment collection is attempted for the invoice. If the invoice has not been
     * finalized yet, this will be null.
     */
    public var endingBalance: Int? = null

    /**
     * Footer displayed on the invoice.
     */
    public var footer: String? = null

    /**
     * Details of the invoice that was cloned. See the [revision
     * documentation](https://docs.stripe.com/invoicing/invoice-revisions) for more details.
     */
    public var fromInvoice: InlineInvoiceFromInvoiceX9a820e87? = null

    /**
     * The URL for the hosted invoice page, which allows customers to view and pay an invoice. If the invoice has not
     * been finalized yet, this will be null.
     */
    public var hostedInvoiceUrl: String? = null

    /**
     * The link to download the PDF for the invoice. If the invoice has not been finalized yet, this will be null.
     */
    public var invoicePdf: String? = null

    /**
     * The error encountered during the previous attempt to finalize the invoice. This field is cleared when the invoice
     * is successfully finalized.
     */
    public var lastFinalizationError: InlineInvoiceLastFinalizationErrorX40488156? = null

    /**
     * The ID of the most recent non-draft revision of this invoice
     */
    public var latestRevision: InlineInvoiceLatestRevisionX60f0e9cc? = null

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
     * The time at which payment will next be attempted. This value will be `null` for invoices where
     * `collection_method=send_invoice`.
     */
    public var nextPaymentAttempt: Int? = null

    /**
     * A unique, identifying string that appears on emails sent to the customer for this invoice. This starts with the
     * customer's unique invoice_prefix if it is specified.
     */
    public var number: String? = null

    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be
     * presented with the branding and support information of the specified account. See the [Invoices with
     * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
     */
    public var onBehalfOf: InlineInvoiceOnBehalfOfX7ed9f131? = null

    /**
     * The parent that generated this invoice
     */
    public var parent: InlineInvoiceParentX8edc2487? = null

    /**
     * Payments for this invoice. Use [invoice payment](/api/invoice-payment) to get more details.
     */
    public var payments: InlineInvoicePaymentsX14523dba? = null

    /**
     * This is the transaction number that appears on email receipts sent for this invoice.
     */
    public var receiptNumber: String? = null

    /**
     * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF
     * and Hosted Invoice Page.
     */
    public var rendering: InlineInvoiceRenderingXdc55f306? = null

    /**
     * The details of the cost of shipping, including the ShippingRate applied on the invoice.
     */
    public var shippingCost: InlineInvoiceShippingCostX6b71ee6d? = null

    /**
     * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise
     * the PDF will render the shipping address from the customer.
     */
    public var shippingDetails: InlineInvoiceShippingDetailsX786d6124? = null

    /**
     * Extra information about an invoice for the customer's credit card statement.
     */
    public var statementDescriptor: String? = null

    /**
     * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn
     * more](https://docs.stripe.com/billing/invoices/workflow#workflow-overview)
     */
    public var status: InlineInvoiceStatusXe812c730? = null

    /**
     * The integer amount in cents (or local equivalent) representing the subtotal of the invoice before any invoice
     * level discount or tax is applied. Item discounts are already incorporated
     */
    public var subtotalExcludingTax: Int? = null

    /**
     * ID of the test clock this invoice belongs to.
     */
    public var testClock: InlineInvoiceTestClockXd1c185be? = null

    public var thresholdReason: InvoiceThresholdReason? = null

    private var totalDiscountAmountsValue: List<DiscountsResourceDiscountAmount>? = null

    /**
     * The aggregate amounts calculated per discount across all line items.
     */
    public var totalDiscountAmounts: List<DiscountsResourceDiscountAmount>?
      get() = totalDiscountAmountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        totalDiscountAmountsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The integer amount in cents (or local equivalent) representing the total amount of the invoice including all
     * discounts but excluding all tax.
     */
    public var totalExcludingTax: Int? = null

    private var totalPretaxCreditAmountsValue: List<InvoicesResourcePretaxCreditAmount>? = null

    /**
     * Contains pretax credit amounts (ex: discount, credit grants, etc) that apply to this invoice. This is a combined
     * list of total_pretax_credit_amounts across all invoice line items.
     */
    public var totalPretaxCreditAmounts: List<InvoicesResourcePretaxCreditAmount>?
      get() = totalPretaxCreditAmountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        totalPretaxCreditAmountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var totalTaxesValue: List<BillingBillResourceInvoicingTaxesTax>? = null

    /**
     * The aggregate tax information of all line items.
     */
    public var totalTaxes: List<BillingBillResourceInvoicingTaxesTax>?
      get() = totalTaxesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        totalTaxesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Invoices are automatically paid or sent 1 hour after webhooks are delivered, or until all webhook delivery
     * attempts have [been exhausted](https://docs.stripe.com/billing/webhooks#understand). This field tracks the time
     * when webhooks for this invoice were successfully delivered. If the invoice had no webhooks to deliver, this will
     * be set while the invoice is being created.
     */
    public var webhooksDeliveredAt: Int? = null

    public fun build(): Invoice {
      check(amountDueValue != null) { "amountDue is required" }
      check(amountOverpaidValue != null) { "amountOverpaid is required" }
      check(amountPaidValue != null) { "amountPaid is required" }
      check(amountPaidOffStripeValue != null) { "amountPaidOffStripe is required" }
      check(amountRemainingValue != null) { "amountRemaining is required" }
      check(amountShippingValue != null) { "amountShipping is required" }
      check(attemptCountValue != null) { "attemptCount is required" }
      check(attemptedValue != null) { "attempted is required" }
      check(autoAdvanceValue != null) { "autoAdvance is required" }
      check(automaticTaxValue != null) { "automaticTax is required" }
      check(collectionMethodValue != null) { "collectionMethod is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerValue != null) { "customer is required" }
      check(defaultTaxRatesValue != null) { "defaultTaxRates is required" }
      check(discountsValue != null) { "discounts is required" }
      check(idValue != null) { "id is required" }
      check(issuerValue != null) { "issuer is required" }
      check(linesValue != null) { "lines is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentSettingsValue != null) { "paymentSettings is required" }
      check(periodEndValue != null) { "periodEnd is required" }
      check(periodStartValue != null) { "periodStart is required" }
      check(postPaymentCreditNotesAmountValue != null) { "postPaymentCreditNotesAmount is required" }
      check(prePaymentCreditNotesAmountValue != null) { "prePaymentCreditNotesAmount is required" }
      check(startingBalanceValue != null) { "startingBalance is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      check(subtotalValue != null) { "subtotal is required" }
      check(totalValue != null) { "total is required" }
      return Invoice(
        amountDue = amountDue,
        amountOverpaid = amountOverpaid,
        amountPaid = amountPaid,
        amountPaidOffStripe = amountPaidOffStripe,
        amountRemaining = amountRemaining,
        amountShipping = amountShipping,
        attemptCount = attemptCount,
        attempted = attempted,
        autoAdvance = autoAdvance,
        automaticTax = automaticTax,
        collectionMethod = collectionMethod,
        created = created,
        currency = currency,
        customer = customer,
        defaultTaxRates = defaultTaxRates,
        discounts = discounts,
        id = id,
        issuer = issuer,
        lines = lines,
        livemode = livemode,
        objectValue = objectValue,
        paymentSettings = paymentSettings,
        periodEnd = periodEnd,
        periodStart = periodStart,
        postPaymentCreditNotesAmount = postPaymentCreditNotesAmount,
        prePaymentCreditNotesAmount = prePaymentCreditNotesAmount,
        startingBalance = startingBalance,
        statusTransitions = statusTransitions,
        subtotal = subtotal,
        total = total,
        accountCountry = accountCountry,
        accountName = accountName,
        accountTaxIds = accountTaxIds,
        application = application,
        automaticallyFinalizesAt = automaticallyFinalizesAt,
        billingReason = billingReason,
        confirmationSecret = confirmationSecret,
        customFields = customFields,
        customerAccount = customerAccount,
        customerAddress = customerAddress,
        customerEmail = customerEmail,
        customerName = customerName,
        customerPhone = customerPhone,
        customerShipping = customerShipping,
        customerTaxExempt = customerTaxExempt,
        customerTaxIds = customerTaxIds,
        defaultPaymentMethod = defaultPaymentMethod,
        defaultSource = defaultSource,
        description = description,
        dueDate = dueDate,
        effectiveAt = effectiveAt,
        endingBalance = endingBalance,
        footer = footer,
        fromInvoice = fromInvoice,
        hostedInvoiceUrl = hostedInvoiceUrl,
        invoicePdf = invoicePdf,
        lastFinalizationError = lastFinalizationError,
        latestRevision = latestRevision,
        metadata = metadata,
        nextPaymentAttempt = nextPaymentAttempt,
        number = number,
        onBehalfOf = onBehalfOf,
        parent = parent,
        payments = payments,
        receiptNumber = receiptNumber,
        rendering = rendering,
        shippingCost = shippingCost,
        shippingDetails = shippingDetails,
        statementDescriptor = statementDescriptor,
        status = status,
        subtotalExcludingTax = subtotalExcludingTax,
        testClock = testClock,
        thresholdReason = thresholdReason,
        totalDiscountAmounts = totalDiscountAmounts,
        totalExcludingTax = totalExcludingTax,
        totalPretaxCreditAmounts = totalPretaxCreditAmounts,
        totalTaxes = totalTaxes,
        webhooksDeliveredAt = webhooksDeliveredAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Invoice = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Invoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Invoice {
      val jsonDecoder = decoder.requireJsonDecoder("Invoice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Invoice must be a JSON object")
      val amountDue = json.decodeRequired<Int>(rawObject, "amount_due")
      val amountOverpaid = json.decodeRequired<Int>(rawObject, "amount_overpaid")
      val amountPaid = json.decodeRequired<Int>(rawObject, "amount_paid")
      val amountPaidOffStripe = json.decodeRequired<Int>(rawObject, "amount_paid_off_stripe")
      val amountRemaining = json.decodeRequired<Int>(rawObject, "amount_remaining")
      val amountShipping = json.decodeRequired<Int>(rawObject, "amount_shipping")
      val attemptCount = json.decodeRequired<Int>(rawObject, "attempt_count")
      val attempted = json.decodeRequired<Boolean>(rawObject, "attempted")
      val autoAdvance = json.decodeRequired<Boolean>(rawObject, "auto_advance")
      val automaticTax = json.decodeRequired<AutomaticTax>(rawObject, "automatic_tax")
      val collectionMethod = json.decodeRequired<InlineInvoiceCollectionMethodX6027ccc9>(rawObject, "collection_method")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customer = json.decodeRequired<InlineInvoiceCustomerX09737939>(rawObject, "customer")
      val defaultTaxRates = json.decodeRequired<List<TaxRate>>(rawObject, "default_tax_rates")
      val discounts = json.decodeRequired<List<InlineInvoiceDiscountsItemX330b63da>>(rawObject, "discounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val issuer = json.decodeRequired<ConnectAccountReference>(rawObject, "issuer")
      val lines = json.decodeRequired<InlineInvoiceLinesXd6c4ba46>(rawObject, "lines")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineInvoiceObjectValueX73192cfd>(rawObject, "object")
      val paymentSettings = json.decodeRequired<InvoicesPaymentSettings>(rawObject, "payment_settings")
      val periodEnd = json.decodeRequired<Int>(rawObject, "period_end")
      val periodStart = json.decodeRequired<Int>(rawObject, "period_start")
      val postPaymentCreditNotesAmount = json.decodeRequired<Int>(rawObject, "post_payment_credit_notes_amount")
      val prePaymentCreditNotesAmount = json.decodeRequired<Int>(rawObject, "pre_payment_credit_notes_amount")
      val startingBalance = json.decodeRequired<Int>(rawObject, "starting_balance")
      val statusTransitions = json.decodeRequired<InvoicesResourceStatusTransitions>(rawObject, "status_transitions")
      val subtotal = json.decodeRequired<Int>(rawObject, "subtotal")
      val total = json.decodeRequired<Int>(rawObject, "total")
      return Invoice(
        amountDue = amountDue,
        amountOverpaid = amountOverpaid,
        amountPaid = amountPaid,
        amountPaidOffStripe = amountPaidOffStripe,
        amountRemaining = amountRemaining,
        amountShipping = amountShipping,
        attemptCount = attemptCount,
        attempted = attempted,
        autoAdvance = autoAdvance,
        automaticTax = automaticTax,
        collectionMethod = collectionMethod,
        created = created,
        currency = currency,
        customer = customer,
        defaultTaxRates = defaultTaxRates,
        discounts = discounts,
        id = id,
        issuer = issuer,
        lines = lines,
        livemode = livemode,
        objectValue = objectValue,
        paymentSettings = paymentSettings,
        periodEnd = periodEnd,
        periodStart = periodStart,
        postPaymentCreditNotesAmount = postPaymentCreditNotesAmount,
        prePaymentCreditNotesAmount = prePaymentCreditNotesAmount,
        startingBalance = startingBalance,
        statusTransitions = statusTransitions,
        subtotal = subtotal,
        total = total,
        accountCountry = rawObject["account_country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        accountName = rawObject["account_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        accountTaxIds = rawObject["account_tax_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineInvoiceAccountTaxIdsItemX1551760a>?>(element) },
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceApplicationXa23803cc?>(element) },
        automaticallyFinalizesAt = rawObject["automatically_finalizes_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        billingReason = rawObject["billing_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceBillingReasonX80b9bb9a?>(element) },
        confirmationSecret = rawObject["confirmation_secret"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceConfirmationSecretXf5c1d047?>(element) },
        customFields = rawObject["custom_fields"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InvoiceSettingCustomField>?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerAddress = rawObject["customer_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceCustomerAddressXd90d3b3c?>(element) },
        customerEmail = rawObject["customer_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerName = rawObject["customer_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerPhone = rawObject["customer_phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerShipping = rawObject["customer_shipping"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceCustomerShippingX637aa4fd?>(element) },
        customerTaxExempt = rawObject["customer_tax_exempt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceCustomerTaxExemptX99293270?>(element) },
        customerTaxIds = rawObject["customer_tax_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InvoicesResourceInvoiceTaxId>?>(element) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceDefaultPaymentMethodX0987464e?>(element) },
        defaultSource = rawObject["default_source"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceDefaultSourceXee93951e?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        dueDate = rawObject["due_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        effectiveAt = rawObject["effective_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        endingBalance = rawObject["ending_balance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        footer = rawObject["footer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fromInvoice = rawObject["from_invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceFromInvoiceX9a820e87?>(element) },
        hostedInvoiceUrl = rawObject["hosted_invoice_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoicePdf = rawObject["invoice_pdf"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastFinalizationError = rawObject["last_finalization_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceLastFinalizationErrorX40488156?>(element) },
        latestRevision = rawObject["latest_revision"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceLatestRevisionX60f0e9cc?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        nextPaymentAttempt = rawObject["next_payment_attempt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        number = rawObject["number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceOnBehalfOfX7ed9f131?>(element) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceParentX8edc2487?>(element) },
        payments = rawObject["payments"]?.let { json.decodeFromJsonElement<InlineInvoicePaymentsX14523dba>(it) },
        receiptNumber = rawObject["receipt_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        rendering = rawObject["rendering"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceRenderingXdc55f306?>(element) },
        shippingCost = rawObject["shipping_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceShippingCostX6b71ee6d?>(element) },
        shippingDetails = rawObject["shipping_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceShippingDetailsX786d6124?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceStatusXe812c730?>(element) },
        subtotalExcludingTax = rawObject["subtotal_excluding_tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoiceTestClockXd1c185be?>(element) },
        thresholdReason = rawObject["threshold_reason"]?.let { json.decodeFromJsonElement<InvoiceThresholdReason>(it) },
        totalDiscountAmounts = rawObject["total_discount_amounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<DiscountsResourceDiscountAmount>?>(element) },
        totalExcludingTax = rawObject["total_excluding_tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        totalPretaxCreditAmounts = rawObject["total_pretax_credit_amounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InvoicesResourcePretaxCreditAmount>?>(element) },
        totalTaxes = rawObject["total_taxes"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<BillingBillResourceInvoicingTaxesTax>?>(element) },
        webhooksDeliveredAt = rawObject["webhooks_delivered_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Invoice) {
      val jsonEncoder = encoder.requireJsonEncoder("Invoice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_due", json.encodeToJsonElement(value.amountDue))
        put("amount_overpaid", json.encodeToJsonElement(value.amountOverpaid))
        put("amount_paid", json.encodeToJsonElement(value.amountPaid))
        put("amount_paid_off_stripe", json.encodeToJsonElement(value.amountPaidOffStripe))
        put("amount_remaining", json.encodeToJsonElement(value.amountRemaining))
        put("amount_shipping", json.encodeToJsonElement(value.amountShipping))
        put("attempt_count", json.encodeToJsonElement(value.attemptCount))
        put("attempted", json.encodeToJsonElement(value.attempted))
        put("auto_advance", json.encodeToJsonElement(value.autoAdvance))
        put("automatic_tax", json.encodeToJsonElement(value.automaticTax))
        put("collection_method", json.encodeToJsonElement(value.collectionMethod))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("customer", json.encodeToJsonElement(value.customer))
        put("default_tax_rates", json.encodeToJsonElement(value.defaultTaxRates))
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("id", value.id)
        put("issuer", json.encodeToJsonElement(value.issuer))
        put("lines", json.encodeToJsonElement(value.lines))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment_settings", json.encodeToJsonElement(value.paymentSettings))
        put("period_end", json.encodeToJsonElement(value.periodEnd))
        put("period_start", json.encodeToJsonElement(value.periodStart))
        put("post_payment_credit_notes_amount", json.encodeToJsonElement(value.postPaymentCreditNotesAmount))
        put("pre_payment_credit_notes_amount", json.encodeToJsonElement(value.prePaymentCreditNotesAmount))
        put("starting_balance", json.encodeToJsonElement(value.startingBalance))
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        put("subtotal", json.encodeToJsonElement(value.subtotal))
        put("total", json.encodeToJsonElement(value.total))
        value.accountCountry?.let { put("account_country", it) }
        value.accountName?.let { put("account_name", it) }
        value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.automaticallyFinalizesAt?.let { put("automatically_finalizes_at", json.encodeToJsonElement(it)) }
        value.billingReason?.let { put("billing_reason", json.encodeToJsonElement(it)) }
        value.confirmationSecret?.let { put("confirmation_secret", json.encodeToJsonElement(it)) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.customerAddress?.let { put("customer_address", json.encodeToJsonElement(it)) }
        value.customerEmail?.let { put("customer_email", it) }
        value.customerName?.let { put("customer_name", it) }
        value.customerPhone?.let { put("customer_phone", it) }
        value.customerShipping?.let { put("customer_shipping", json.encodeToJsonElement(it)) }
        value.customerTaxExempt?.let { put("customer_tax_exempt", json.encodeToJsonElement(it)) }
        value.customerTaxIds?.let { put("customer_tax_ids", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", json.encodeToJsonElement(it)) }
        value.defaultSource?.let { put("default_source", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.dueDate?.let { put("due_date", json.encodeToJsonElement(it)) }
        value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
        value.endingBalance?.let { put("ending_balance", json.encodeToJsonElement(it)) }
        value.footer?.let { put("footer", it) }
        value.fromInvoice?.let { put("from_invoice", json.encodeToJsonElement(it)) }
        value.hostedInvoiceUrl?.let { put("hosted_invoice_url", it) }
        value.invoicePdf?.let { put("invoice_pdf", it) }
        value.lastFinalizationError?.let { put("last_finalization_error", json.encodeToJsonElement(it)) }
        value.latestRevision?.let { put("latest_revision", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nextPaymentAttempt?.let { put("next_payment_attempt", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", it) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.parent?.let { put("parent", json.encodeToJsonElement(it)) }
        value.payments?.let { put("payments", json.encodeToJsonElement(it)) }
        value.receiptNumber?.let { put("receipt_number", it) }
        value.rendering?.let { put("rendering", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.subtotalExcludingTax?.let { put("subtotal_excluding_tax", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
        value.thresholdReason?.let { put("threshold_reason", json.encodeToJsonElement(it)) }
        value.totalDiscountAmounts?.let { put("total_discount_amounts", json.encodeToJsonElement(it)) }
        value.totalExcludingTax?.let { put("total_excluding_tax", json.encodeToJsonElement(it)) }
        value.totalPretaxCreditAmounts?.let { put("total_pretax_credit_amounts", json.encodeToJsonElement(it)) }
        value.totalTaxes?.let { put("total_taxes", json.encodeToJsonElement(it)) }
        value.webhooksDeliveredAt?.let { put("webhooks_delivered_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoice(block: Invoice.Builder.() -> Unit): Invoice = Invoice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Invoice is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

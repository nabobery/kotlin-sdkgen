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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1InvoicesPostRequestFormXb417d116.Serializer::class)
public class InlineV1InvoicesPostRequestFormXb417d116(
  /**
   * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
   */
  public val accountTaxIds: InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b? = null,
  /**
   * A fee in cents (or local equivalent) that will be applied to the invoice and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in order to take an
   * application fee. For more information, see the application fees
   * [documentation](https://docs.stripe.com/billing/invoices/connect#collecting-fees).
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * Controls whether Stripe performs [automatic
   * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice. If
   * `false`, the invoice's state doesn't automatically advance without an explicit action. Defaults to false.
   */
  public val autoAdvance: Boolean? = null,
  /**
   * Settings for automatic tax lookup for this invoice.
   */
  public val automaticTax: InlineV1InvoicesPostRequestFormAutomaticTaxX6ee84378? = null,
  /**
   * The time when this invoice should be scheduled to finalize (up to 5 years in the future). The invoice is finalized
   * at this time if it's still in draft state.
   */
  public val automaticallyFinalizesAt: Int? = null,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
   * invoice using the default source attached to the customer. When sending an invoice, Stripe will email this invoice
   * to the customer with payment instructions. Defaults to `charge_automatically`.
   */
  public val collectionMethod: InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee? = null,
  /**
   * The currency to create this invoice in. Defaults to that of `customer` if not specified.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * A list of up to 4 custom fields to be displayed on the invoice.
   */
  public val customFields: InlineV1InvoicesPostRequestFormCustomFieldsX0b703902? = null,
  /**
   * The ID of the customer to bill.
   */
  public val customer: String? = null,
  /**
   * The ID of the account to bill.
   */
  public val customerAccount: String? = null,
  /**
   * The number of days from when the invoice is created until it is due. Valid only for invoices where
   * `collection_method=send_invoice`.
   */
  public val daysUntilDue: Int? = null,
  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice. If
   * not set, defaults to the subscription's default payment method, if any, or to the default payment method in the
   * customer's invoice settings.
   */
  public val defaultPaymentMethod: String? = null,
  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and be
   * in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's
   * default source.
   */
  public val defaultSource: String? = null,
  defaultTaxRates: List<String>? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the
   * Dashboard.
   */
  public val description: String? = null,
  /**
   * The coupons and promotion codes to redeem into discounts for the invoice. If not specified, inherits the discount
   * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
   */
  public val discounts: InlineV1InvoicesPostRequestFormDiscountsXf910c8f0? = null,
  /**
   * The date on which payment for this invoice is due. Valid only for invoices where `collection_method=send_invoice`.
   */
  public val dueDate: Int? = null,
  /**
   * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value
   * replaces the system-generated 'Date of issue' printed on the invoice PDF and receipt.
   */
  public val effectiveAt: Int? = null,
  expand: List<String>? = null,
  /**
   * Footer to be displayed on the invoice.
   */
  public val footer: String? = null,
  /**
   * Revise an existing invoice. The new invoice will be created in `status=draft`. See the [revision
   * documentation](https://docs.stripe.com/invoicing/invoice-revisions) for more details.
   */
  public val fromInvoice: InlineV1InvoicesPostRequestFormFromInvoiceX08e77076? = null,
  /**
   * The connected account that issues the invoice. The invoice is presented with the branding and support information
   * of the specified account.
   */
  public val issuer: InlineV1InvoicesPostRequestFormIssuerXbd5c59bd? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1InvoicesPostRequestFormMetadataXb27b75dd? = null,
  /**
   * Set the number for this invoice. If no number is present then a number will be assigned automatically when the
   * invoice is finalized. In many markets, regulations require invoices to be unique, sequential and / or gapless. You
   * are responsible for ensuring this is true across all your different invoicing systems in the event that you edit
   * the invoice number using our API. If you use only Stripe for your invoices and do not change invoice numbers,
   * Stripe handles this aspect of compliance for you automatically.
   */
  public val number: String? = null,
  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
   * with the branding and support information of the specified account. See the [Invoices with
   * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
   */
  public val onBehalfOf: String? = null,
  /**
   * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
   */
  public val paymentSettings: InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c? = null,
  /**
   * How to handle pending invoice items on invoice creation. Defaults to `exclude` if the parameter is omitted.
   */
  public val pendingInvoiceItemsBehavior:
      InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86? = null,
  /**
   * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF
   * and Hosted Invoice Page.
   */
  public val rendering: InlineV1InvoicesPostRequestFormRenderingX071c5877? = null,
  /**
   * Settings for the cost of shipping for this invoice.
   */
  public val shippingCost: InlineV1InvoicesPostRequestFormShippingCostX8f940f66? = null,
  /**
   * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the
   * PDF will render the shipping address from the customer.
   */
  public val shippingDetails: InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1? = null,
  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at least one letter. If
   * not specified and this invoice is part of a subscription, the default `statement_descriptor` will be set to the
   * first subscription item's product's `statement_descriptor`.
   */
  public val statementDescriptor: String? = null,
  /**
   * The ID of the subscription to invoice, if any. If set, the created invoice will only include pending invoice items
   * for that subscription. The subscription's billing cycle and regular subscription events won't be affected.
   */
  public val subscription: String? = null,
  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of the resulting
   * transfer will be found on the invoice's charge.
   */
  public val transferData: InlineV1InvoicesPostRequestFormTransferDataXea589c39? = null,
) {
  /**
   * The tax rates that will apply to any line item that does not have `tax_rates` set.
   */
  public val defaultTaxRates: List<String>? =
      defaultTaxRates?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public var accountTaxIds: InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b? = null

    /**
     * A fee in cents (or local equivalent) that will be applied to the invoice and transferred to the application
     * owner's Stripe account. The request must be made with an OAuth key or the Stripe-Account header in order to take
     * an application fee. For more information, see the application fees
     * [documentation](https://docs.stripe.com/billing/invoices/connect#collecting-fees).
     */
    public var applicationFeeAmount: Int? = null

    /**
     * Controls whether Stripe performs [automatic
     * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice. If
     * `false`, the invoice's state doesn't automatically advance without an explicit action. Defaults to false.
     */
    public var autoAdvance: Boolean? = null

    /**
     * Settings for automatic tax lookup for this invoice.
     */
    public var automaticTax: InlineV1InvoicesPostRequestFormAutomaticTaxX6ee84378? = null

    /**
     * The time when this invoice should be scheduled to finalize (up to 5 years in the future). The invoice is
     * finalized at this time if it's still in draft state.
     */
    public var automaticallyFinalizesAt: Int? = null

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
     * invoice using the default source attached to the customer. When sending an invoice, Stripe will email this
     * invoice to the customer with payment instructions. Defaults to `charge_automatically`.
     */
    public var collectionMethod: InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee? = null

    /**
     * The currency to create this invoice in. Defaults to that of `customer` if not specified.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * A list of up to 4 custom fields to be displayed on the invoice.
     */
    public var customFields: InlineV1InvoicesPostRequestFormCustomFieldsX0b703902? = null

    /**
     * The ID of the customer to bill.
     */
    public var customer: String? = null

    /**
     * The ID of the account to bill.
     */
    public var customerAccount: String? = null

    /**
     * The number of days from when the invoice is created until it is due. Valid only for invoices where
     * `collection_method=send_invoice`.
     */
    public var daysUntilDue: Int? = null

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice. If
     * not set, defaults to the subscription's default payment method, if any, or to the default payment method in the
     * customer's invoice settings.
     */
    public var defaultPaymentMethod: String? = null

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and
     * be in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's
     * default source.
     */
    public var defaultSource: String? = null

    private var defaultTaxRatesValue: List<String>? = null

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set.
     */
    public var defaultTaxRates: List<String>?
      get() = defaultTaxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultTaxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the
     * Dashboard.
     */
    public var description: String? = null

    /**
     * The coupons and promotion codes to redeem into discounts for the invoice. If not specified, inherits the discount
     * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
     */
    public var discounts: InlineV1InvoicesPostRequestFormDiscountsXf910c8f0? = null

    /**
     * The date on which payment for this invoice is due. Valid only for invoices where
     * `collection_method=send_invoice`.
     */
    public var dueDate: Int? = null

    /**
     * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value
     * replaces the system-generated 'Date of issue' printed on the invoice PDF and receipt.
     */
    public var effectiveAt: Int? = null

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
     * Footer to be displayed on the invoice.
     */
    public var footer: String? = null

    /**
     * Revise an existing invoice. The new invoice will be created in `status=draft`. See the [revision
     * documentation](https://docs.stripe.com/invoicing/invoice-revisions) for more details.
     */
    public var fromInvoice: InlineV1InvoicesPostRequestFormFromInvoiceX08e77076? = null

    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and support information
     * of the specified account.
     */
    public var issuer: InlineV1InvoicesPostRequestFormIssuerXbd5c59bd? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1InvoicesPostRequestFormMetadataXb27b75dd? = null

    /**
     * Set the number for this invoice. If no number is present then a number will be assigned automatically when the
     * invoice is finalized. In many markets, regulations require invoices to be unique, sequential and / or gapless.
     * You are responsible for ensuring this is true across all your different invoicing systems in the event that you
     * edit the invoice number using our API. If you use only Stripe for your invoices and do not change invoice
     * numbers, Stripe handles this aspect of compliance for you automatically.
     */
    public var number: String? = null

    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be
     * presented with the branding and support information of the specified account. See the [Invoices with
     * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
     */
    public var onBehalfOf: String? = null

    /**
     * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
     */
    public var paymentSettings: InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c? = null

    /**
     * How to handle pending invoice items on invoice creation. Defaults to `exclude` if the parameter is omitted.
     */
    public var pendingInvoiceItemsBehavior:
        InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86? = null

    /**
     * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF
     * and Hosted Invoice Page.
     */
    public var rendering: InlineV1InvoicesPostRequestFormRenderingX071c5877? = null

    /**
     * Settings for the cost of shipping for this invoice.
     */
    public var shippingCost: InlineV1InvoicesPostRequestFormShippingCostX8f940f66? = null

    /**
     * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise
     * the PDF will render the shipping address from the customer.
     */
    public var shippingDetails: InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1? = null

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at least one letter.
     * If not specified and this invoice is part of a subscription, the default `statement_descriptor` will be set to
     * the first subscription item's product's `statement_descriptor`.
     */
    public var statementDescriptor: String? = null

    /**
     * The ID of the subscription to invoice, if any. If set, the created invoice will only include pending invoice
     * items for that subscription. The subscription's billing cycle and regular subscription events won't be affected.
     */
    public var subscription: String? = null

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of the resulting
     * transfer will be found on the invoice's charge.
     */
    public var transferData: InlineV1InvoicesPostRequestFormTransferDataXea589c39? = null

    public fun build(): InlineV1InvoicesPostRequestFormXb417d116 = InlineV1InvoicesPostRequestFormXb417d116(
      accountTaxIds = accountTaxIds,
      applicationFeeAmount = applicationFeeAmount,
      autoAdvance = autoAdvance,
      automaticTax = automaticTax,
      automaticallyFinalizesAt = automaticallyFinalizesAt,
      collectionMethod = collectionMethod,
      currency = currency,
      customFields = customFields,
      customer = customer,
      customerAccount = customerAccount,
      daysUntilDue = daysUntilDue,
      defaultPaymentMethod = defaultPaymentMethod,
      defaultSource = defaultSource,
      defaultTaxRates = defaultTaxRates,
      description = description,
      discounts = discounts,
      dueDate = dueDate,
      effectiveAt = effectiveAt,
      expand = expand,
      footer = footer,
      fromInvoice = fromInvoice,
      issuer = issuer,
      metadata = metadata,
      number = number,
      onBehalfOf = onBehalfOf,
      paymentSettings = paymentSettings,
      pendingInvoiceItemsBehavior = pendingInvoiceItemsBehavior,
      rendering = rendering,
      shippingCost = shippingCost,
      shippingDetails = shippingDetails,
      statementDescriptor = statementDescriptor,
      subscription = subscription,
      transferData = transferData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormXb417d116 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormXb417d116> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormXb417d116 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormXb417d116")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormXb417d116 must be a JSON object")
      return InlineV1InvoicesPostRequestFormXb417d116(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        autoAdvance = rawObject["auto_advance"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormAutomaticTaxX6ee84378>(it) },
        automaticallyFinalizesAt = rawObject["automatically_finalizes_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormCollectionMethodX6930c6ee>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormCustomFieldsX0b703902>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultSource = rawObject["default_source"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDiscountsXf910c8f0>(it) },
        dueDate = rawObject["due_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        effectiveAt = rawObject["effective_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        fromInvoice = rawObject["from_invoice"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormFromInvoiceX08e77076>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormIssuerXbd5c59bd>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormMetadataXb27b75dd>(it) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<String>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSettings = rawObject["payment_settings"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsX9261382c>(it) },
        pendingInvoiceItemsBehavior = rawObject["pending_invoice_items_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86>(it) },
        rendering = rawObject["rendering"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingX071c5877>(it) },
        shippingCost = rawObject["shipping_cost"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostX8f940f66>(it) },
        shippingDetails = rawObject["shipping_details"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingDetailsX61db64a1>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        subscription = rawObject["subscription"]?.let { json.decodeFromJsonElement<String>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormTransferDataXea589c39>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormXb417d116) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormXb417d116")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.autoAdvance?.let { put("auto_advance", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.automaticallyFinalizesAt?.let { put("automatically_finalizes_at", json.encodeToJsonElement(it)) }
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", it) }
        value.defaultSource?.let { put("default_source", it) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.dueDate?.let { put("due_date", json.encodeToJsonElement(it)) }
        value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.footer?.let { put("footer", it) }
        value.fromInvoice?.let { put("from_invoice", json.encodeToJsonElement(it)) }
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", it) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.paymentSettings?.let { put("payment_settings", json.encodeToJsonElement(it)) }
        value.pendingInvoiceItemsBehavior?.let { put("pending_invoice_items_behavior", json.encodeToJsonElement(it)) }
        value.rendering?.let { put("rendering", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.subscription?.let { put("subscription", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormXb417d116(block: InlineV1InvoicesPostRequestFormXb417d116.Builder.() -> Unit): InlineV1InvoicesPostRequestFormXb417d116 = InlineV1InvoicesPostRequestFormXb417d116.build(block)

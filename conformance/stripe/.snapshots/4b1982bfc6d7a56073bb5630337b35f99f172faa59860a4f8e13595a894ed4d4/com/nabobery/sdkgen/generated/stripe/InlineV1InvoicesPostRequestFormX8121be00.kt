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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema
 */
@Serializable(with = InlineV1InvoicesPostRequestFormX8121be00.Serializer::class)
public class InlineV1InvoicesPostRequestFormX8121be00(
  /**
   * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
   */
  public val accountTaxIds: InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec? = null,
  /**
   * A fee in cents (or local equivalent) that will be applied to the invoice and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in order to take an
   * application fee. For more information, see the application fees
   * [documentation](https://docs.stripe.com/billing/invoices/connect#collecting-fees).
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * Controls whether Stripe performs [automatic
   * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice.
   */
  public val autoAdvance: Boolean? = null,
  /**
   * Settings for automatic tax lookup for this invoice.
   */
  public val automaticTax: InlineV1InvoicesPostRequestFormAutomaticTaxX3e4475da? = null,
  /**
   * The time when this invoice should be scheduled to finalize (up to 5 years in the future). The invoice is finalized
   * at this time if it's still in draft state. To turn off automatic finalization, set `auto_advance` to false.
   */
  public val automaticallyFinalizesAt: Int? = null,
  /**
   * Either `charge_automatically` or `send_invoice`. This field can be updated only on `draft` invoices.
   */
  public val collectionMethod: InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c? = null,
  /**
   * A list of up to 4 custom fields to be displayed on the invoice. If a value for `custom_fields` is specified, the
   * list specified will replace the existing custom field list on this invoice. Pass an empty string to remove
   * previously-defined fields.
   */
  public val customFields: InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3? = null,
  /**
   * The number of days from which the invoice is created until it is due. Only valid for invoices where
   * `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
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
  public val defaultSource: InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167? = null,
  /**
   * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an empty string to remove
   * previously-defined tax rates.
   */
  public val defaultTaxRates: InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the
   * Dashboard.
   */
  public val description: String? = null,
  /**
   * The discounts that will apply to the invoice. Pass an empty string to remove previously-defined discounts.
   */
  public val discounts: InlineV1InvoicesPostRequestFormDiscountsX67d747e8? = null,
  /**
   * The date on which payment for this invoice is due. Only valid for invoices where `collection_method=send_invoice`.
   * This field can only be updated on `draft` invoices.
   */
  public val dueDate: Int? = null,
  /**
   * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value
   * replaces the system-generated 'Date of issue' printed on the invoice PDF and receipt.
   */
  public val effectiveAt: InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a? = null,
  expand: List<String>? = null,
  /**
   * Footer to be displayed on the invoice.
   */
  public val footer: String? = null,
  /**
   * The connected account that issues the invoice. The invoice is presented with the branding and support information
   * of the specified account.
   */
  public val issuer: InlineV1InvoicesPostRequestFormIssuerX2300e4e9? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1InvoicesPostRequestFormMetadataX518c174b? = null,
  /**
   * Set the number for this invoice. If no number is present then a number will be assigned automatically when the
   * invoice is finalized. In many markets, regulations require invoices to be unique, sequential and / or gapless. You
   * are responsible for ensuring this is true across all your different invoicing systems in the event that you edit
   * the invoice number using our API. If you use only Stripe for your invoices and do not change invoice numbers,
   * Stripe handles this aspect of compliance for you automatically.
   */
  public val number: InlineV1InvoicesPostRequestFormNumberXbadb140d? = null,
  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
   * with the branding and support information of the specified account. See the [Invoices with
   * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
   */
  public val onBehalfOf: InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039? = null,
  /**
   * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
   */
  public val paymentSettings: InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde? = null,
  /**
   * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF
   * and Hosted Invoice Page.
   */
  public val rendering: InlineV1InvoicesPostRequestFormRenderingXf3022a61? = null,
  /**
   * Settings for the cost of shipping for this invoice.
   */
  public val shippingCost: InlineV1InvoicesPostRequestFormShippingCostX10650005? = null,
  /**
   * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the
   * PDF will render the shipping address from the customer.
   */
  public val shippingDetails: InlineV1InvoicesPostRequestFormShippingDetailsX130e758a? = null,
  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at least one letter. If
   * not specified and this invoice is part of a subscription, the default `statement_descriptor` will be set to the
   * first subscription item's product's `statement_descriptor`.
   */
  public val statementDescriptor: String? = null,
  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of the resulting
   * transfer will be found on the invoice's charge. This will be unset if you POST an empty value.
   */
  public val transferData: InlineV1InvoicesPostRequestFormTransferDataXbe331fcc? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public var accountTaxIds: InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec? = null

    /**
     * A fee in cents (or local equivalent) that will be applied to the invoice and transferred to the application
     * owner's Stripe account. The request must be made with an OAuth key or the Stripe-Account header in order to take
     * an application fee. For more information, see the application fees
     * [documentation](https://docs.stripe.com/billing/invoices/connect#collecting-fees).
     */
    public var applicationFeeAmount: Int? = null

    /**
     * Controls whether Stripe performs [automatic
     * collection](https://docs.stripe.com/invoicing/integration/automatic-advancement-collection) of the invoice.
     */
    public var autoAdvance: Boolean? = null

    /**
     * Settings for automatic tax lookup for this invoice.
     */
    public var automaticTax: InlineV1InvoicesPostRequestFormAutomaticTaxX3e4475da? = null

    /**
     * The time when this invoice should be scheduled to finalize (up to 5 years in the future). The invoice is
     * finalized at this time if it's still in draft state. To turn off automatic finalization, set `auto_advance` to
     * false.
     */
    public var automaticallyFinalizesAt: Int? = null

    /**
     * Either `charge_automatically` or `send_invoice`. This field can be updated only on `draft` invoices.
     */
    public var collectionMethod: InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c? = null

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for `custom_fields` is specified, the
     * list specified will replace the existing custom field list on this invoice. Pass an empty string to remove
     * previously-defined fields.
     */
    public var customFields: InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3? = null

    /**
     * The number of days from which the invoice is created until it is due. Only valid for invoices where
     * `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
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
    public var defaultSource: InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167? = null

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set. Pass an empty string to remove
     * previously-defined tax rates.
     */
    public var defaultTaxRates: InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as 'memo' in the
     * Dashboard.
     */
    public var description: String? = null

    /**
     * The discounts that will apply to the invoice. Pass an empty string to remove previously-defined discounts.
     */
    public var discounts: InlineV1InvoicesPostRequestFormDiscountsX67d747e8? = null

    /**
     * The date on which payment for this invoice is due. Only valid for invoices where
     * `collection_method=send_invoice`. This field can only be updated on `draft` invoices.
     */
    public var dueDate: Int? = null

    /**
     * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value
     * replaces the system-generated 'Date of issue' printed on the invoice PDF and receipt.
     */
    public var effectiveAt: InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a? = null

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
     * The connected account that issues the invoice. The invoice is presented with the branding and support information
     * of the specified account.
     */
    public var issuer: InlineV1InvoicesPostRequestFormIssuerX2300e4e9? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1InvoicesPostRequestFormMetadataX518c174b? = null

    /**
     * Set the number for this invoice. If no number is present then a number will be assigned automatically when the
     * invoice is finalized. In many markets, regulations require invoices to be unique, sequential and / or gapless.
     * You are responsible for ensuring this is true across all your different invoicing systems in the event that you
     * edit the invoice number using our API. If you use only Stripe for your invoices and do not change invoice
     * numbers, Stripe handles this aspect of compliance for you automatically.
     */
    public var number: InlineV1InvoicesPostRequestFormNumberXbadb140d? = null

    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be
     * presented with the branding and support information of the specified account. See the [Invoices with
     * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
     */
    public var onBehalfOf: InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039? = null

    /**
     * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
     */
    public var paymentSettings: InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde? = null

    /**
     * The rendering-related settings that control how the invoice is displayed on customer-facing surfaces such as PDF
     * and Hosted Invoice Page.
     */
    public var rendering: InlineV1InvoicesPostRequestFormRenderingXf3022a61? = null

    /**
     * Settings for the cost of shipping for this invoice.
     */
    public var shippingCost: InlineV1InvoicesPostRequestFormShippingCostX10650005? = null

    /**
     * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise
     * the PDF will render the shipping address from the customer.
     */
    public var shippingDetails: InlineV1InvoicesPostRequestFormShippingDetailsX130e758a? = null

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at least one letter.
     * If not specified and this invoice is part of a subscription, the default `statement_descriptor` will be set to
     * the first subscription item's product's `statement_descriptor`.
     */
    public var statementDescriptor: String? = null

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of the resulting
     * transfer will be found on the invoice's charge. This will be unset if you POST an empty value.
     */
    public var transferData: InlineV1InvoicesPostRequestFormTransferDataXbe331fcc? = null

    public fun build(): InlineV1InvoicesPostRequestFormX8121be00 = InlineV1InvoicesPostRequestFormX8121be00(
      accountTaxIds = accountTaxIds,
      applicationFeeAmount = applicationFeeAmount,
      autoAdvance = autoAdvance,
      automaticTax = automaticTax,
      automaticallyFinalizesAt = automaticallyFinalizesAt,
      collectionMethod = collectionMethod,
      customFields = customFields,
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
      issuer = issuer,
      metadata = metadata,
      number = number,
      onBehalfOf = onBehalfOf,
      paymentSettings = paymentSettings,
      rendering = rendering,
      shippingCost = shippingCost,
      shippingDetails = shippingDetails,
      statementDescriptor = statementDescriptor,
      transferData = transferData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormX8121be00 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormX8121be00> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormX8121be00 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormX8121be00")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormX8121be00 must be a JSON object")
      return InlineV1InvoicesPostRequestFormX8121be00(
        accountTaxIds = rawObject["account_tax_ids"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        autoAdvance = rawObject["auto_advance"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormAutomaticTaxX3e4475da>(it) },
        automaticallyFinalizesAt = rawObject["automatically_finalizes_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormCollectionMethodX8a25856c>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3>(it) },
        daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultSource = rawObject["default_source"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDefaultTaxRatesX322b90af>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDiscountsX67d747e8>(it) },
        dueDate = rawObject["due_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        effectiveAt = rawObject["effective_at"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<String>(it) },
        issuer = rawObject["issuer"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormIssuerX2300e4e9>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormMetadataX518c174b>(it) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormNumberXbadb140d>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039>(it) },
        paymentSettings = rawObject["payment_settings"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsX16586dde>(it) },
        rendering = rawObject["rendering"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingXf3022a61>(it) },
        shippingCost = rawObject["shipping_cost"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostX10650005>(it) },
        shippingDetails = rawObject["shipping_details"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingDetailsX130e758a>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormTransferDataXbe331fcc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormX8121be00) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormX8121be00")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountTaxIds?.let { put("account_tax_ids", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.autoAdvance?.let { put("auto_advance", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.automaticallyFinalizesAt?.let { put("automatically_finalizes_at", json.encodeToJsonElement(it)) }
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", it) }
        value.defaultSource?.let { put("default_source", json.encodeToJsonElement(it)) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.dueDate?.let { put("due_date", json.encodeToJsonElement(it)) }
        value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.footer?.let { put("footer", it) }
        value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.paymentSettings?.let { put("payment_settings", json.encodeToJsonElement(it)) }
        value.rendering?.let { put("rendering", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormX8121be00(block: InlineV1InvoicesPostRequestFormX8121be00.Builder.() -> Unit): InlineV1InvoicesPostRequestFormX8121be00 = InlineV1InvoicesPostRequestFormX8121be00.build(block)

package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1QuotesPostRequestFormXad338ec6.Serializer::class)
public class InlineV1QuotesPostRequestFormXad338ec6(
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account. There cannot be any line items with recurring prices when using this field.
   */
  public val applicationFeeAmount:
      InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f? = null,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at
   * least 1 line item with a recurring price to use this field.
   */
  public val applicationFeePercent:
      InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9? = null,
  /**
   * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
   */
  public val automaticTax: InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e? = null,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay invoices
   * at the end of the subscription cycle or at invoice finalization using the default payment method attached to the
   * subscription or customer. When sending an invoice, Stripe will email your customer an invoice with payment
   * instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
   */
  public val collectionMethod: InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8? = null,
  /**
   * The customer for which this quote belongs to. A customer is required before finalizing the quote. Once specified,
   * it cannot be changed.
   */
  public val customer: String? = null,
  /**
   * The account for which this quote belongs to. A customer or account is required before finalizing the quote. Once
   * specified, it cannot be changed.
   */
  public val customerAccount: String? = null,
  /**
   * The tax rates that will apply to any line item that does not have `tax_rates` set.
   */
  public val defaultTaxRates: InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3? = null,
  /**
   * A description that will be displayed on the quote PDF.
   */
  public val description: InlineV1QuotesPostRequestFormDescriptionX33a47f56? = null,
  /**
   * The discounts applied to the quote.
   */
  public val discounts: InlineV1QuotesPostRequestFormDiscountsX5b9be60d? = null,
  expand: List<String>? = null,
  /**
   * A future timestamp on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since
   * the Unix epoch.
   */
  public val expiresAt: Int? = null,
  /**
   * A footer that will be displayed on the quote PDF.
   */
  public val footer: InlineV1QuotesPostRequestFormFooterX89825b93? = null,
  /**
   * A header that will be displayed on the quote PDF.
   */
  public val `header`: InlineV1QuotesPostRequestFormHeaderXb8a866fb? = null,
  /**
   * All invoices will be billed using the specified settings.
   */
  public val invoiceSettings: InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8? = null,
  lineItems: List<InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The account on behalf of which to charge.
   */
  public val onBehalfOf: InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50? = null,
  /**
   * When creating a subscription or subscription schedule, the specified configuration data will be used. There must be
   * at least one line item with a recurring price for a subscription or subscription schedule to be created. A
   * subscription schedule is created if `subscription_data[effective_date]` is present and in the future, otherwise a
   * subscription is created.
   */
  public val subscriptionData: InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df? = null,
  /**
   * The data with which to automatically create a Transfer for each of the invoices.
   */
  public val transferData: InlineV1QuotesPostRequestFormTransferDataXa5f9394f? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * A list of line items the customer is being quoted for. Each line item includes information about the product, the
   * quantity, and the resulting cost.
   */
  public val lineItems: List<InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb>? =
      lineItems?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. There cannot be any line items with recurring prices when using this
     * field.
     */
    public var applicationFeeAmount: InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f? =
        null

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at
     * least 1 line item with a recurring price to use this field.
     */
    public var applicationFeePercent: InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9? =
        null

    /**
     * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
     */
    public var automaticTax: InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e? = null

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay
     * invoices at the end of the subscription cycle or at invoice finalization using the default payment method
     * attached to the subscription or customer. When sending an invoice, Stripe will email your customer an invoice
     * with payment instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
     */
    public var collectionMethod: InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8? = null

    /**
     * The customer for which this quote belongs to. A customer is required before finalizing the quote. Once specified,
     * it cannot be changed.
     */
    public var customer: String? = null

    /**
     * The account for which this quote belongs to. A customer or account is required before finalizing the quote. Once
     * specified, it cannot be changed.
     */
    public var customerAccount: String? = null

    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set.
     */
    public var defaultTaxRates: InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3? = null

    /**
     * A description that will be displayed on the quote PDF.
     */
    public var description: InlineV1QuotesPostRequestFormDescriptionX33a47f56? = null

    /**
     * The discounts applied to the quote.
     */
    public var discounts: InlineV1QuotesPostRequestFormDiscountsX5b9be60d? = null

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
     * A future timestamp on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since
     * the Unix epoch.
     */
    public var expiresAt: Int? = null

    /**
     * A footer that will be displayed on the quote PDF.
     */
    public var footer: InlineV1QuotesPostRequestFormFooterX89825b93? = null

    /**
     * A header that will be displayed on the quote PDF.
     */
    public var `header`: InlineV1QuotesPostRequestFormHeaderXb8a866fb? = null

    /**
     * All invoices will be billed using the specified settings.
     */
    public var invoiceSettings: InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8? = null

    private var lineItemsValue: List<InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb>? = null

    /**
     * A list of line items the customer is being quoted for. Each line item includes information about the product, the
     * quantity, and the resulting cost.
     */
    public var lineItems: List<InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb>?
      get() = lineItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lineItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The account on behalf of which to charge.
     */
    public var onBehalfOf: InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50? = null

    /**
     * When creating a subscription or subscription schedule, the specified configuration data will be used. There must
     * be at least one line item with a recurring price for a subscription or subscription schedule to be created. A
     * subscription schedule is created if `subscription_data[effective_date]` is present and in the future, otherwise a
     * subscription is created.
     */
    public var subscriptionData: InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df? = null

    /**
     * The data with which to automatically create a Transfer for each of the invoices.
     */
    public var transferData: InlineV1QuotesPostRequestFormTransferDataXa5f9394f? = null

    public fun build(): InlineV1QuotesPostRequestFormXad338ec6 = InlineV1QuotesPostRequestFormXad338ec6(
      applicationFeeAmount = applicationFeeAmount,
      applicationFeePercent = applicationFeePercent,
      automaticTax = automaticTax,
      collectionMethod = collectionMethod,
      customer = customer,
      customerAccount = customerAccount,
      defaultTaxRates = defaultTaxRates,
      description = description,
      discounts = discounts,
      expand = expand,
      expiresAt = expiresAt,
      footer = footer,
      header = header,
      invoiceSettings = invoiceSettings,
      lineItems = lineItems,
      metadata = metadata,
      onBehalfOf = onBehalfOf,
      subscriptionData = subscriptionData,
      transferData = transferData,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormXad338ec6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormXad338ec6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormXad338ec6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormXad338ec6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormXad338ec6 must be a JSON object")
      return InlineV1QuotesPostRequestFormXad338ec6(
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeeAmountX2e2ac96f>(it) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeePercentXc14ccae9>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormAutomaticTaxX8aae679e>(it) },
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormCollectionMethodX4ace09d8>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDefaultTaxRatesX59ccf9f3>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDescriptionX33a47f56>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDiscountsX5b9be60d>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        footer = rawObject["footer"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormFooterX89825b93>(it) },
        header = rawObject["header"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormHeaderXb8a866fb>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormInvoiceSettingsX5c5f38e8>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<List<InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50>(it) },
        subscriptionData = rawObject["subscription_data"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataXafbc88df>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormTransferDataXa5f9394f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormXad338ec6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormXad338ec6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.footer?.let { put("footer", json.encodeToJsonElement(it)) }
        value.header?.let { put("header", json.encodeToJsonElement(it)) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.subscriptionData?.let { put("subscription_data", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormXad338ec6(block: InlineV1QuotesPostRequestFormXad338ec6.Builder.() -> Unit): InlineV1QuotesPostRequestFormXad338ec6 = InlineV1QuotesPostRequestFormXad338ec6.build(block)

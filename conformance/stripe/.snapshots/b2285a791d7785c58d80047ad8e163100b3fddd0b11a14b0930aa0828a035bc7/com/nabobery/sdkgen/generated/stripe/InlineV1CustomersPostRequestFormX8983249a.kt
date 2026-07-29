package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema
 */
@Serializable(with = InlineV1CustomersPostRequestFormX8983249a.Serializer::class)
public class InlineV1CustomersPostRequestFormX8983249a(
  /**
   * The customer's address. Learn about [country-specific requirements for calculating
   * tax](https://docs.stripe.com/invoicing/taxes?dashboard-or-api=dashboard#set-up-customer).
   */
  public val address: InlineV1CustomersPostRequestFormAddressXea1a2b6f? = null,
  /**
   * An integer amount in cents (or local equivalent) that represents the customer's current balance, which affect the
   * customer's future invoices. A negative amount represents a credit that decreases the amount due on an invoice; a
   * positive amount increases the amount due on an invoice.
   */
  public val balance: Int? = null,
  /**
   * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
   * user's bank account details.
   */
  public val bankAccount: InlineV1CustomersPostRequestFormBankAccountX4958274f? = null,
  /**
   * The customer's business name. This may be up to *150 characters*.
   */
  public val businessName: InlineV1CustomersPostRequestFormBusinessNameX3abf1513? = null,
  /**
   * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
   */
  public val card: InlineV1CustomersPostRequestFormCardXe833a08a? = null,
  /**
   * Balance information and default balance settings for this customer.
   */
  public val cashBalance: InlineV1CustomersPostRequestFormCashBalanceX43728c16? = null,
  /**
   * ID of Alipay account to make the customer's new default for invoice payments.
   */
  public val defaultAlipayAccount: String? = null,
  /**
   * ID of bank account to make the customer's new default for invoice payments.
   */
  public val defaultBankAccount: String? = null,
  /**
   * ID of card to make the customer's new default for invoice payments.
   */
  public val defaultCard: String? = null,
  /**
   * If you are using payment methods created via the PaymentMethods API, see the
   * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/update#update_customer-invoice_sett
   * ings-default_payment_method) parameter.
   *
   * Provide the ID of a payment source already attached to this customer to make it this customer's default payment
   * source.
   *
   * If you want to add a new payment source and make it the default, see the
   * [source](https://docs.stripe.com/api/customers/update#update_customer-source) property.
   */
  public val defaultSource: String? = null,
  /**
   * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the
   * dashboard.
   */
  public val description: String? = null,
  /**
   * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching
   * and tracking. This may be up to *512 characters*.
   */
  public val email: String? = null,
  expand: List<String>? = null,
  /**
   * The customer's full name. This may be up to *150 characters*.
   */
  public val individualName: InlineV1CustomersPostRequestFormIndividualNameXec453fc2? = null,
  /**
   * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
   */
  public val invoicePrefix: String? = null,
  /**
   * Default invoice settings for this customer.
   */
  public val invoiceSettings: InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CustomersPostRequestFormMetadataX4ae4881c? = null,
  /**
   * The customer's full name or business name.
   */
  public val name: String? = null,
  /**
   * The sequence to be used on the customer's next invoice. Defaults to 1.
   */
  public val nextInvoiceSequence: Int? = null,
  /**
   * The customer's phone number.
   */
  public val phone: String? = null,
  preferredLocales: List<String>? = null,
  /**
   * The customer's shipping information. Appears on invoices emailed to this customer.
   */
  public val shipping: InlineV1CustomersPostRequestFormShippingX0292b6b4? = null,
  public val source: String? = null,
  /**
   * Tax details about the customer.
   */
  public val tax: InlineV1CustomersPostRequestFormTaxX76fca852? = null,
  /**
   * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
   */
  public val taxExempt: InlineV1CustomersPostRequestFormTaxExemptX70f74070? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Customer's preferred languages, ordered by preference.
   */
  public val preferredLocales: List<String>? =
      preferredLocales?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The customer's address. Learn about [country-specific requirements for calculating
     * tax](https://docs.stripe.com/invoicing/taxes?dashboard-or-api=dashboard#set-up-customer).
     */
    public var address: InlineV1CustomersPostRequestFormAddressXea1a2b6f? = null

    /**
     * An integer amount in cents (or local equivalent) that represents the customer's current balance, which affect the
     * customer's future invoices. A negative amount represents a credit that decreases the amount due on an invoice; a
     * positive amount increases the amount due on an invoice.
     */
    public var balance: Int? = null

    /**
     * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
     * user's bank account details.
     */
    public var bankAccount: InlineV1CustomersPostRequestFormBankAccountX4958274f? = null

    /**
     * The customer's business name. This may be up to *150 characters*.
     */
    public var businessName: InlineV1CustomersPostRequestFormBusinessNameX3abf1513? = null

    /**
     * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
     */
    public var card: InlineV1CustomersPostRequestFormCardXe833a08a? = null

    /**
     * Balance information and default balance settings for this customer.
     */
    public var cashBalance: InlineV1CustomersPostRequestFormCashBalanceX43728c16? = null

    /**
     * ID of Alipay account to make the customer's new default for invoice payments.
     */
    public var defaultAlipayAccount: String? = null

    /**
     * ID of bank account to make the customer's new default for invoice payments.
     */
    public var defaultBankAccount: String? = null

    /**
     * ID of card to make the customer's new default for invoice payments.
     */
    public var defaultCard: String? = null

    /**
     * If you are using payment methods created via the PaymentMethods API, see the
     * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/update#update_customer-invoice_se
     * ttings-default_payment_method) parameter.
     *
     * Provide the ID of a payment source already attached to this customer to make it this customer's default payment
     * source.
     *
     * If you want to add a new payment source and make it the default, see the
     * [source](https://docs.stripe.com/api/customers/update#update_customer-source) property.
     */
    public var defaultSource: String? = null

    /**
     * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the
     * dashboard.
     */
    public var description: String? = null

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching
     * and tracking. This may be up to *512 characters*.
     */
    public var email: String? = null

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
     * The customer's full name. This may be up to *150 characters*.
     */
    public var individualName: InlineV1CustomersPostRequestFormIndividualNameXec453fc2? = null

    /**
     * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
     */
    public var invoicePrefix: String? = null

    /**
     * Default invoice settings for this customer.
     */
    public var invoiceSettings: InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1CustomersPostRequestFormMetadataX4ae4881c? = null

    /**
     * The customer's full name or business name.
     */
    public var name: String? = null

    /**
     * The sequence to be used on the customer's next invoice. Defaults to 1.
     */
    public var nextInvoiceSequence: Int? = null

    /**
     * The customer's phone number.
     */
    public var phone: String? = null

    private var preferredLocalesValue: List<String>? = null

    /**
     * Customer's preferred languages, ordered by preference.
     */
    public var preferredLocales: List<String>?
      get() = preferredLocalesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        preferredLocalesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The customer's shipping information. Appears on invoices emailed to this customer.
     */
    public var shipping: InlineV1CustomersPostRequestFormShippingX0292b6b4? = null

    public var source: String? = null

    /**
     * Tax details about the customer.
     */
    public var tax: InlineV1CustomersPostRequestFormTaxX76fca852? = null

    /**
     * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
     */
    public var taxExempt: InlineV1CustomersPostRequestFormTaxExemptX70f74070? = null

    public fun build(): InlineV1CustomersPostRequestFormX8983249a = InlineV1CustomersPostRequestFormX8983249a(
      address = address,
      balance = balance,
      bankAccount = bankAccount,
      businessName = businessName,
      card = card,
      cashBalance = cashBalance,
      defaultAlipayAccount = defaultAlipayAccount,
      defaultBankAccount = defaultBankAccount,
      defaultCard = defaultCard,
      defaultSource = defaultSource,
      description = description,
      email = email,
      expand = expand,
      individualName = individualName,
      invoicePrefix = invoicePrefix,
      invoiceSettings = invoiceSettings,
      metadata = metadata,
      name = name,
      nextInvoiceSequence = nextInvoiceSequence,
      phone = phone,
      preferredLocales = preferredLocales,
      shipping = shipping,
      source = source,
      tax = tax,
      taxExempt = taxExempt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormX8983249a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormX8983249a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormX8983249a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormX8983249a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormX8983249a must be a JSON object")
      return InlineV1CustomersPostRequestFormX8983249a(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormAddressXea1a2b6f>(it) },
        balance = rawObject["balance"]?.let { json.decodeFromJsonElement<Int>(it) },
        bankAccount = rawObject["bank_account"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormBankAccountX4958274f>(it) },
        businessName = rawObject["business_name"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormBusinessNameX3abf1513>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCardXe833a08a>(it) },
        cashBalance = rawObject["cash_balance"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCashBalanceX43728c16>(it) },
        defaultAlipayAccount = rawObject["default_alipay_account"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultBankAccount = rawObject["default_bank_account"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultCard = rawObject["default_card"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultSource = rawObject["default_source"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        individualName = rawObject["individual_name"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormIndividualNameXec453fc2>(it) },
        invoicePrefix = rawObject["invoice_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsX8b4aa88c>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormMetadataX4ae4881c>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nextInvoiceSequence = rawObject["next_invoice_sequence"]?.let { json.decodeFromJsonElement<Int>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        preferredLocales = rawObject["preferred_locales"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormShippingX0292b6b4>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxX76fca852>(it) },
        taxExempt = rawObject["tax_exempt"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxExemptX70f74070>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormX8983249a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormX8983249a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.balance?.let { put("balance", json.encodeToJsonElement(it)) }
        value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
        value.businessName?.let { put("business_name", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cashBalance?.let { put("cash_balance", json.encodeToJsonElement(it)) }
        value.defaultAlipayAccount?.let { put("default_alipay_account", it) }
        value.defaultBankAccount?.let { put("default_bank_account", it) }
        value.defaultCard?.let { put("default_card", it) }
        value.defaultSource?.let { put("default_source", it) }
        value.description?.let { put("description", it) }
        value.email?.let { put("email", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.individualName?.let { put("individual_name", json.encodeToJsonElement(it)) }
        value.invoicePrefix?.let { put("invoice_prefix", it) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nextInvoiceSequence?.let { put("next_invoice_sequence", json.encodeToJsonElement(it)) }
        value.phone?.let { put("phone", it) }
        value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.source?.let { put("source", it) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
        value.taxExempt?.let { put("tax_exempt", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormX8983249a(block: InlineV1CustomersPostRequestFormX8983249a.Builder.() -> Unit): InlineV1CustomersPostRequestFormX8983249a = InlineV1CustomersPostRequestFormX8983249a.build(block)

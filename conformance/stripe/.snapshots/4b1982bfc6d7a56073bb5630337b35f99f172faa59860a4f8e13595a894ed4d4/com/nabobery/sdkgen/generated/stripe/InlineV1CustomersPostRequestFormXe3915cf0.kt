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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a
 */
@Serializable(with = InlineV1CustomersPostRequestFormXe3915cf0.Serializer::class)
public class InlineV1CustomersPostRequestFormXe3915cf0(
  /**
   * The customer's address. Learn about [country-specific requirements for calculating
   * tax](https://docs.stripe.com/invoicing/taxes?dashboard-or-api=dashboard#set-up-customer).
   */
  public val address: InlineV1CustomersPostRequestFormAddressX54fa48b0? = null,
  /**
   * An integer amount in cents (or local equivalent) that represents the customer's current balance, which affect the
   * customer's future invoices. A negative amount represents a credit that decreases the amount due on an invoice; a
   * positive amount increases the amount due on an invoice.
   */
  public val balance: Int? = null,
  /**
   * The customer's business name. This may be up to *150 characters*.
   */
  public val businessName: InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7? = null,
  /**
   * Balance information and default balance settings for this customer.
   */
  public val cashBalance: InlineV1CustomersPostRequestFormCashBalanceXab2050d3? = null,
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
  public val individualName: InlineV1CustomersPostRequestFormIndividualNameX7e854e90? = null,
  /**
   * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
   */
  public val invoicePrefix: String? = null,
  /**
   * Default invoice settings for this customer.
   */
  public val invoiceSettings: InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CustomersPostRequestFormMetadataXc4710090? = null,
  /**
   * The customer's full name or business name.
   */
  public val name: String? = null,
  /**
   * The sequence to be used on the customer's next invoice. Defaults to 1.
   */
  public val nextInvoiceSequence: Int? = null,
  public val paymentMethod: String? = null,
  /**
   * The customer's phone number.
   */
  public val phone: String? = null,
  preferredLocales: List<String>? = null,
  /**
   * The customer's shipping information. Appears on invoices emailed to this customer.
   */
  public val shipping: InlineV1CustomersPostRequestFormShippingX3a4d1b73? = null,
  public val source: String? = null,
  /**
   * Tax details about the customer.
   */
  public val tax: InlineV1CustomersPostRequestFormTaxX65e900f4? = null,
  /**
   * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
   */
  public val taxExempt: InlineV1CustomersPostRequestFormTaxExemptX72a48ffa? = null,
  taxIdData: List<InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532>? = null,
  /**
   * ID of the test clock to attach to the customer.
   */
  public val testClock: String? = null,
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

  /**
   * The customer's tax IDs.
   */
  public val taxIdData: List<InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532>? =
      taxIdData?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The customer's address. Learn about [country-specific requirements for calculating
     * tax](https://docs.stripe.com/invoicing/taxes?dashboard-or-api=dashboard#set-up-customer).
     */
    public var address: InlineV1CustomersPostRequestFormAddressX54fa48b0? = null

    /**
     * An integer amount in cents (or local equivalent) that represents the customer's current balance, which affect the
     * customer's future invoices. A negative amount represents a credit that decreases the amount due on an invoice; a
     * positive amount increases the amount due on an invoice.
     */
    public var balance: Int? = null

    /**
     * The customer's business name. This may be up to *150 characters*.
     */
    public var businessName: InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7? = null

    /**
     * Balance information and default balance settings for this customer.
     */
    public var cashBalance: InlineV1CustomersPostRequestFormCashBalanceXab2050d3? = null

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
    public var individualName: InlineV1CustomersPostRequestFormIndividualNameX7e854e90? = null

    /**
     * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
     */
    public var invoicePrefix: String? = null

    /**
     * Default invoice settings for this customer.
     */
    public var invoiceSettings: InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1CustomersPostRequestFormMetadataXc4710090? = null

    /**
     * The customer's full name or business name.
     */
    public var name: String? = null

    /**
     * The sequence to be used on the customer's next invoice. Defaults to 1.
     */
    public var nextInvoiceSequence: Int? = null

    public var paymentMethod: String? = null

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
    public var shipping: InlineV1CustomersPostRequestFormShippingX3a4d1b73? = null

    public var source: String? = null

    /**
     * Tax details about the customer.
     */
    public var tax: InlineV1CustomersPostRequestFormTaxX65e900f4? = null

    /**
     * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
     */
    public var taxExempt: InlineV1CustomersPostRequestFormTaxExemptX72a48ffa? = null

    private var taxIdDataValue: List<InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532>? = null

    /**
     * The customer's tax IDs.
     */
    public var taxIdData: List<InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532>?
      get() = taxIdDataValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxIdDataValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * ID of the test clock to attach to the customer.
     */
    public var testClock: String? = null

    public fun build(): InlineV1CustomersPostRequestFormXe3915cf0 = InlineV1CustomersPostRequestFormXe3915cf0(
      address = address,
      balance = balance,
      businessName = businessName,
      cashBalance = cashBalance,
      description = description,
      email = email,
      expand = expand,
      individualName = individualName,
      invoicePrefix = invoicePrefix,
      invoiceSettings = invoiceSettings,
      metadata = metadata,
      name = name,
      nextInvoiceSequence = nextInvoiceSequence,
      paymentMethod = paymentMethod,
      phone = phone,
      preferredLocales = preferredLocales,
      shipping = shipping,
      source = source,
      tax = tax,
      taxExempt = taxExempt,
      taxIdData = taxIdData,
      testClock = testClock,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormXe3915cf0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormXe3915cf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormXe3915cf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormXe3915cf0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormXe3915cf0 must be a JSON object")
      return InlineV1CustomersPostRequestFormXe3915cf0(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormAddressX54fa48b0>(it) },
        balance = rawObject["balance"]?.let { json.decodeFromJsonElement<Int>(it) },
        businessName = rawObject["business_name"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormBusinessNameX3b2c85e7>(it) },
        cashBalance = rawObject["cash_balance"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCashBalanceXab2050d3>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        individualName = rawObject["individual_name"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormIndividualNameX7e854e90>(it) },
        invoicePrefix = rawObject["invoice_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormInvoiceSettingsX99c0a3df>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormMetadataXc4710090>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nextInvoiceSequence = rawObject["next_invoice_sequence"]?.let { json.decodeFromJsonElement<Int>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        preferredLocales = rawObject["preferred_locales"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormShippingX3a4d1b73>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxX65e900f4>(it) },
        taxExempt = rawObject["tax_exempt"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxExemptX72a48ffa>(it) },
        taxIdData = rawObject["tax_id_data"]?.let { json.decodeFromJsonElement<List<InlineV1CustomersPostRequestFormTaxIdDataItemXa5c9f532>>(it) },
        testClock = rawObject["test_clock"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormXe3915cf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormXe3915cf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.balance?.let { put("balance", json.encodeToJsonElement(it)) }
        value.businessName?.let { put("business_name", json.encodeToJsonElement(it)) }
        value.cashBalance?.let { put("cash_balance", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.email?.let { put("email", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.individualName?.let { put("individual_name", json.encodeToJsonElement(it)) }
        value.invoicePrefix?.let { put("invoice_prefix", it) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nextInvoiceSequence?.let { put("next_invoice_sequence", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.phone?.let { put("phone", it) }
        value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.source?.let { put("source", it) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
        value.taxExempt?.let { put("tax_exempt", json.encodeToJsonElement(it)) }
        value.taxIdData?.let { put("tax_id_data", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormXe3915cf0(block: InlineV1CustomersPostRequestFormXe3915cf0.Builder.() -> Unit): InlineV1CustomersPostRequestFormXe3915cf0 = InlineV1CustomersPostRequestFormXe3915cf0.build(block)

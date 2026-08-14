package io.github.nabobery.sdkgen.generated.stripe

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
public data class CustomerView internal constructor(
  public val address: InlineCustomerAddressX3f7817b0? = null,
  public val balance: Int? = null,
  @SerialName("business_name")
  public val businessName: String? = null,
  @SerialName("cash_balance")
  public val cashBalance: InlineCustomerCashBalanceXe45dcf30? = null,
  public val created: Int,
  public val currency: String? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("default_source")
  public val defaultSource: InlineCustomerDefaultSourceXa03c4ae9? = null,
  public val delinquent: Boolean? = null,
  public val description: String? = null,
  public val discount: InlineCustomerDiscountXa4928a5b? = null,
  public val email: String? = null,
  public val id: String,
  @SerialName("individual_name")
  public val individualName: String? = null,
  @SerialName("invoice_credit_balance")
  public val invoiceCreditBalance: Map<String, Int>? = null,
  @SerialName("invoice_prefix")
  public val invoicePrefix: String? = null,
  @SerialName("invoice_settings")
  public val invoiceSettings: InvoiceSettingCustomerSetting? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  public val name: String? = null,
  @SerialName("next_invoice_sequence")
  public val nextInvoiceSequence: Int? = null,
  @SerialName("object")
  public val objectValue: InlineCustomerObjectValueX7e79ec29,
  public val phone: String? = null,
  @SerialName("preferred_locales")
  public val preferredLocales: List<String>? = null,
  public val shipping: InlineCustomerShippingXa88b4f3f? = null,
  public val sources: InlineCustomerSourcesX68a9816b? = null,
  public val subscriptions: InlineCustomerSubscriptionsX194943c7? = null,
  public val tax: CustomerTax? = null,
  @SerialName("tax_exempt")
  public val taxExempt: InlineCustomerTaxExemptX8cad7368? = null,
  @SerialName("tax_ids")
  public val taxIds: InlineCustomerTaxIdsXf0fe9b40? = null,
  @SerialName("test_clock")
  public val testClock: InlineCustomerTestClockX4aeba957? = null,
)

/**
 * This object represents a customer of your business. Use it to [create recurring
 * charges](https://docs.stripe.com/invoicing/customer), [save
 * payment](https://docs.stripe.com/payments/save-during-payment) and contact information,
 * and track payments that belong to the same customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer
 */
@Serializable(with = Customer.Serializer::class)
public class Customer(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCustomerObjectValueX7e79ec29,
  /**
   * The customer's address.
   */
  public val address: InlineCustomerAddressX3f7817b0? = null,
  /**
   * The current balance, if any, that's stored on the customer in their default currency. If negative, the customer has
   * credit to apply to their next invoice. If positive, the customer has an amount owed that's added to their next
   * invoice. The balance only considers amounts that Stripe hasn't successfully applied to any invoice. It doesn't
   * reflect unpaid invoices. This balance is only taken into account after invoices finalize. For multi-currency
   * balances, see
   * [invoice_credit_balance](https://docs.stripe.com/api/customers/object#customer_object-invoice_credit_balance).
   */
  public val balance: Int? = null,
  /**
   * The customer's business name.
   */
  public val businessName: String? = null,
  /**
   * The current funds being held by Stripe on behalf of the customer. You can apply these funds towards payment intents
   * when the source is "cash_balance". The `settings[reconciliation_mode]` field describes if these funds apply to
   * these payment intents manually or automatically.
   */
  public val cashBalance: InlineCustomerCashBalanceXe45dcf30? = null,
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) the customer can be charged in for
   * recurring billing purposes.
   */
  public val currency: String? = null,
  /**
   * The ID of an Account representing a customer. You can use this ID with any v1 API that accepts a customer_account
   * parameter.
   */
  public val customerAccount: String? = null,
  /**
   * ID of the default payment source for the customer.
   *
   * If you use payment methods created through the PaymentMethods API, see the
   * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_sett
   * ings-default_payment_method) field instead.
   */
  public val defaultSource: InlineCustomerDefaultSourceXa03c4ae9? = null,
  /**
   * Tracks the most recent state change on any invoice belonging to the customer. Paying an invoice or marking it
   * uncollectible via the API will set this field to false. An automatic payment failure or passing the
   * `invoice.due_date` will set this field to `true`.
   *
   * If an invoice becomes uncollectible by [dunning](https://docs.stripe.com/billing/automatic-collection),
   * `delinquent` doesn't reset to `false`.
   *
   * If you care whether the customer has paid their most recent subscription invoice, use `subscription.status`
   * instead. Paying or marking uncollectible any customer invoice regardless of whether it is the latest invoice for a
   * subscription will always set this field to `false`.
   */
  public val delinquent: Boolean? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * Describes the current discount active on the customer, if there is one.
   */
  public val discount: InlineCustomerDiscountXa4928a5b? = null,
  /**
   * The customer's email address.
   */
  public val email: String? = null,
  /**
   * The customer's individual name.
   */
  public val individualName: String? = null,
  invoiceCreditBalance: Map<String, Int>? = null,
  /**
   * The prefix for the customer used to generate unique invoice numbers.
   */
  public val invoicePrefix: String? = null,
  public val invoiceSettings: InvoiceSettingCustomerSetting? = null,
  metadata: Map<String, String>? = null,
  /**
   * The customer's full name or business name.
   */
  public val name: String? = null,
  /**
   * The suffix of the customer's next invoice number (for example, 0001). When the account uses account level
   * sequencing, this parameter is ignored in API requests and the field omitted in API responses.
   */
  public val nextInvoiceSequence: Int? = null,
  /**
   * The customer's phone number.
   */
  public val phone: String? = null,
  preferredLocales: List<String>? = null,
  /**
   * Mailing and shipping address for the customer. Appears on invoices emailed to this customer.
   */
  public val shipping: InlineCustomerShippingXa88b4f3f? = null,
  /**
   * The customer's payment sources, if any.
   */
  public val sources: InlineCustomerSourcesX68a9816b? = null,
  /**
   * The customer's current subscriptions, if any.
   */
  public val subscriptions: InlineCustomerSubscriptionsX194943c7? = null,
  public val tax: CustomerTax? = null,
  /**
   * Describes the customer's tax exemption status, which is `none`, `exempt`, or `reverse`. When set to `reverse`,
   * invoice and receipt PDFs include the following text: **"Reverse charge"**.
   */
  public val taxExempt: InlineCustomerTaxExemptX8cad7368? = null,
  /**
   * The customer's tax IDs.
   */
  public val taxIds: InlineCustomerTaxIdsXf0fe9b40? = null,
  /**
   * ID of the test clock that this customer belongs to.
   */
  public val testClock: InlineCustomerTestClockX4aeba957? = null,
) {
  /**
   * The current multi-currency balances, if any, that's stored on the customer. If positive in a currency, the customer
   * has a credit to apply to their next invoice denominated in that currency. If negative, the customer has an amount
   * owed that's added to their next invoice denominated in that currency. These balances don't apply to unpaid
   * invoices. They solely track amounts that Stripe hasn't successfully applied to any invoice. Stripe only applies a
   * balance in a specific currency to an invoice after that invoice (which is in the same currency) finalizes.
   */
  public val invoiceCreditBalance: Map<String, Int>? =
      invoiceCreditBalance?.let { collection0 -> collection0.toMap() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The customer's preferred locales (languages), ordered by preference.
   */
  public val preferredLocales: List<String>? =
      preferredLocales?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
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

    private var objectValueValue: InlineCustomerObjectValueX7e79ec29? = null

    public var objectValue: InlineCustomerObjectValueX7e79ec29
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * The customer's address.
     */
    public var address: InlineCustomerAddressX3f7817b0? = null

    /**
     * The current balance, if any, that's stored on the customer in their default currency. If negative, the customer
     * has credit to apply to their next invoice. If positive, the customer has an amount owed that's added to their
     * next invoice. The balance only considers amounts that Stripe hasn't successfully applied to any invoice. It
     * doesn't reflect unpaid invoices. This balance is only taken into account after invoices finalize. For
     * multi-currency balances, see
     * [invoice_credit_balance](https://docs.stripe.com/api/customers/object#customer_object-invoice_credit_balance).
     */
    public var balance: Int? = null

    /**
     * The customer's business name.
     */
    public var businessName: String? = null

    /**
     * The current funds being held by Stripe on behalf of the customer. You can apply these funds towards payment
     * intents when the source is "cash_balance". The `settings[reconciliation_mode]` field describes if these funds
     * apply to these payment intents manually or automatically.
     */
    public var cashBalance: InlineCustomerCashBalanceXe45dcf30? = null

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) the customer can be charged in for
     * recurring billing purposes.
     */
    public var currency: String? = null

    /**
     * The ID of an Account representing a customer. You can use this ID with any v1 API that accepts a customer_account
     * parameter.
     */
    public var customerAccount: String? = null

    /**
     * ID of the default payment source for the customer.
     *
     * If you use payment methods created through the PaymentMethods API, see the
     * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_se
     * ttings-default_payment_method) field instead.
     */
    public var defaultSource: InlineCustomerDefaultSourceXa03c4ae9? = null

    /**
     * Tracks the most recent state change on any invoice belonging to the customer. Paying an invoice or marking it
     * uncollectible via the API will set this field to false. An automatic payment failure or passing the
     * `invoice.due_date` will set this field to `true`.
     *
     * If an invoice becomes uncollectible by [dunning](https://docs.stripe.com/billing/automatic-collection),
     * `delinquent` doesn't reset to `false`.
     *
     * If you care whether the customer has paid their most recent subscription invoice, use `subscription.status`
     * instead. Paying or marking uncollectible any customer invoice regardless of whether it is the latest invoice for
     * a subscription will always set this field to `false`.
     */
    public var delinquent: Boolean? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * Describes the current discount active on the customer, if there is one.
     */
    public var discount: InlineCustomerDiscountXa4928a5b? = null

    /**
     * The customer's email address.
     */
    public var email: String? = null

    /**
     * The customer's individual name.
     */
    public var individualName: String? = null

    private var invoiceCreditBalanceValue: Map<String, Int>? = null

    /**
     * The current multi-currency balances, if any, that's stored on the customer. If positive in a currency, the
     * customer has a credit to apply to their next invoice denominated in that currency. If negative, the customer has
     * an amount owed that's added to their next invoice denominated in that currency. These balances don't apply to
     * unpaid invoices. They solely track amounts that Stripe hasn't successfully applied to any invoice. Stripe only
     * applies a balance in a specific currency to an invoice after that invoice (which is in the same currency)
     * finalizes.
     */
    public var invoiceCreditBalance: Map<String, Int>?
      get() = invoiceCreditBalanceValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        invoiceCreditBalanceValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The prefix for the customer used to generate unique invoice numbers.
     */
    public var invoicePrefix: String? = null

    public var invoiceSettings: InvoiceSettingCustomerSetting? = null

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
     * The customer's full name or business name.
     */
    public var name: String? = null

    /**
     * The suffix of the customer's next invoice number (for example, 0001). When the account uses account level
     * sequencing, this parameter is ignored in API requests and the field omitted in API responses.
     */
    public var nextInvoiceSequence: Int? = null

    /**
     * The customer's phone number.
     */
    public var phone: String? = null

    private var preferredLocalesValue: List<String>? = null

    /**
     * The customer's preferred locales (languages), ordered by preference.
     */
    public var preferredLocales: List<String>?
      get() = preferredLocalesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        preferredLocalesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Mailing and shipping address for the customer. Appears on invoices emailed to this customer.
     */
    public var shipping: InlineCustomerShippingXa88b4f3f? = null

    /**
     * The customer's payment sources, if any.
     */
    public var sources: InlineCustomerSourcesX68a9816b? = null

    /**
     * The customer's current subscriptions, if any.
     */
    public var subscriptions: InlineCustomerSubscriptionsX194943c7? = null

    public var tax: CustomerTax? = null

    /**
     * Describes the customer's tax exemption status, which is `none`, `exempt`, or `reverse`. When set to `reverse`,
     * invoice and receipt PDFs include the following text: **"Reverse charge"**.
     */
    public var taxExempt: InlineCustomerTaxExemptX8cad7368? = null

    /**
     * The customer's tax IDs.
     */
    public var taxIds: InlineCustomerTaxIdsXf0fe9b40? = null

    /**
     * ID of the test clock that this customer belongs to.
     */
    public var testClock: InlineCustomerTestClockX4aeba957? = null

    public fun build(): Customer {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return Customer(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        address = address,
        balance = balance,
        businessName = businessName,
        cashBalance = cashBalance,
        currency = currency,
        customerAccount = customerAccount,
        defaultSource = defaultSource,
        delinquent = delinquent,
        description = description,
        discount = discount,
        email = email,
        individualName = individualName,
        invoiceCreditBalance = invoiceCreditBalance,
        invoicePrefix = invoicePrefix,
        invoiceSettings = invoiceSettings,
        metadata = metadata,
        name = name,
        nextInvoiceSequence = nextInvoiceSequence,
        phone = phone,
        preferredLocales = preferredLocales,
        shipping = shipping,
        sources = sources,
        subscriptions = subscriptions,
        tax = tax,
        taxExempt = taxExempt,
        taxIds = taxIds,
        testClock = testClock,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Customer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Customer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Customer {
      val jsonDecoder = decoder.requireJsonDecoder("Customer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Customer must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineCustomerObjectValueX7e79ec29>(rawObject, "object")
      return Customer(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerAddressX3f7817b0?>(element) },
        balance = rawObject["balance"]?.let { json.decodeFromJsonElement<Int>(it) },
        businessName = rawObject["business_name"]?.let { json.decodeFromJsonElement<String>(it) },
        cashBalance = rawObject["cash_balance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerCashBalanceXe45dcf30?>(element) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        defaultSource = rawObject["default_source"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerDefaultSourceXa03c4ae9?>(element) },
        delinquent = rawObject["delinquent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        discount = rawObject["discount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerDiscountXa4928a5b?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        individualName = rawObject["individual_name"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceCreditBalance = rawObject["invoice_credit_balance"]?.let { json.decodeFromJsonElement<Map<String, Int>>(it) },
        invoicePrefix = rawObject["invoice_prefix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InvoiceSettingCustomerSetting>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nextInvoiceSequence = rawObject["next_invoice_sequence"]?.let { json.decodeFromJsonElement<Int>(it) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        preferredLocales = rawObject["preferred_locales"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        shipping = rawObject["shipping"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerShippingXa88b4f3f?>(element) },
        sources = rawObject["sources"]?.let { json.decodeFromJsonElement<InlineCustomerSourcesX68a9816b>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineCustomerSubscriptionsX194943c7>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<CustomerTax>(it) },
        taxExempt = rawObject["tax_exempt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerTaxExemptX8cad7368?>(element) },
        taxIds = rawObject["tax_ids"]?.let { json.decodeFromJsonElement<InlineCustomerTaxIdsXf0fe9b40>(it) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerTestClockX4aeba957?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Customer) {
      val jsonEncoder = encoder.requireJsonEncoder("Customer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.balance?.let { put("balance", json.encodeToJsonElement(it)) }
        value.businessName?.let { put("business_name", it) }
        value.cashBalance?.let { put("cash_balance", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.defaultSource?.let { put("default_source", json.encodeToJsonElement(it)) }
        value.delinquent?.let { put("delinquent", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discount?.let { put("discount", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.individualName?.let { put("individual_name", it) }
        value.invoiceCreditBalance?.let { put("invoice_credit_balance", json.encodeToJsonElement(it)) }
        value.invoicePrefix?.let { put("invoice_prefix", it) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nextInvoiceSequence?.let { put("next_invoice_sequence", json.encodeToJsonElement(it)) }
        value.phone?.let { put("phone", it) }
        value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.sources?.let { put("sources", json.encodeToJsonElement(it)) }
        value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
        value.taxExempt?.let { put("tax_exempt", json.encodeToJsonElement(it)) }
        value.taxIds?.let { put("tax_ids", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customer(block: Customer.Builder.() -> Unit): Customer = Customer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Customer is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

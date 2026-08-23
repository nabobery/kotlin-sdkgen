package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Double
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
public data class QuoteView internal constructor(
  @SerialName("amount_subtotal")
  public val amountSubtotal: Int,
  @SerialName("amount_total")
  public val amountTotal: Int,
  public val application: InlineQuoteApplicationX6159df96? = null,
  @SerialName("application_fee_amount")
  public val applicationFeeAmount: Int? = null,
  @SerialName("application_fee_percent")
  public val applicationFeePercent: Double? = null,
  @SerialName("automatic_tax")
  public val automaticTax: QuotesResourceAutomaticTax,
  @SerialName("collection_method")
  public val collectionMethod: InlineQuoteCollectionMethodXc934a75e,
  public val computed: QuotesResourceComputed,
  public val created: Int,
  public val currency: String? = null,
  public val customer: InlineQuoteCustomerX40ae4996? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("default_tax_rates")
  public val defaultTaxRates: List<InlineQuoteDefaultTaxRatesItemXd99c0405>? = null,
  public val description: String? = null,
  public val discounts: List<InlineQuoteDiscountsItemX7f4b5eb5>,
  @SerialName("expires_at")
  public val expiresAt: Int,
  public val footer: String? = null,
  @SerialName("from_quote")
  public val fromQuote: InlineQuoteFromQuoteX86014e8c? = null,
  public val `header`: String? = null,
  public val id: String,
  public val invoice: InlineQuoteInvoiceX5bd1d2d6? = null,
  @SerialName("invoice_settings")
  public val invoiceSettings: InvoiceSettingQuoteSetting,
  @SerialName("line_items")
  public val lineItems: InlineQuoteLineItemsX6064fea4? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  public val number: String? = null,
  @SerialName("object")
  public val objectValue: InlineQuoteObjectValueX36b1fc7b,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlineQuoteOnBehalfOfXcdb50ea5? = null,
  public val status: InlineQuoteStatusX90d749ee,
  @SerialName("status_transitions")
  public val statusTransitions: QuotesResourceStatusTransitions,
  public val subscription: InlineQuoteSubscriptionX578bf401? = null,
  @SerialName("subscription_data")
  public val subscriptionData: QuotesResourceSubscriptionDataSubscriptionData,
  @SerialName("subscription_schedule")
  public val subscriptionSchedule: InlineQuoteSubscriptionScheduleX0c498016? = null,
  @SerialName("test_clock")
  public val testClock: InlineQuoteTestClockXf70c6291? = null,
  @SerialName("total_details")
  public val totalDetails: QuotesResourceTotalDetails,
  @SerialName("transfer_data")
  public val transferData: InlineQuoteTransferDataX81cc6d49? = null,
)

/**
 * A Quote is a way to model prices that you'd like to provide to a customer.
 * Once accepted, it will automatically create an invoice, subscription or subscription schedule.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote
 */
@Serializable(with = Quote.Serializer::class)
public class Quote(
  /**
   * Total before any discounts or taxes are applied.
   */
  public val amountSubtotal: Int,
  /**
   * Total after discounts and taxes are applied.
   */
  public val amountTotal: Int,
  public val automaticTax: QuotesResourceAutomaticTax,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay invoices
   * at the end of the subscription cycle or on finalization using the default payment method attached to the
   * subscription or customer. When sending an invoice, Stripe will email your customer an invoice with payment
   * instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
   */
  public val collectionMethod: InlineQuoteCollectionMethodXc934a75e,
  public val computed: QuotesResourceComputed,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  discounts: List<InlineQuoteDiscountsItemX7f4b5eb5>,
  /**
   * The date on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since the Unix
   * epoch.
   */
  public val expiresAt: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  public val invoiceSettings: InvoiceSettingQuoteSetting,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineQuoteObjectValueX36b1fc7b,
  /**
   * The status of the quote.
   */
  public val status: InlineQuoteStatusX90d749ee,
  public val statusTransitions: QuotesResourceStatusTransitions,
  public val subscriptionData: QuotesResourceSubscriptionDataSubscriptionData,
  public val totalDetails: QuotesResourceTotalDetails,
  /**
   * ID of the Connect Application that created the quote.
   */
  public val application: InlineQuoteApplicationX6159df96? = null,
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account. Only applicable if there are no line items with recurring prices on the
   * quote.
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the application owner's Stripe account. Only applicable if
   * there are line items with recurring prices on the quote.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String? = null,
  /**
   * The customer who received this quote. A customer is required to finalize the quote. Once specified, you can't
   * change it.
   */
  public val customer: InlineQuoteCustomerX40ae4996? = null,
  /**
   * The account representing the customer who received this quote. A customer or account is required to finalize the
   * quote. Once specified, you can't change it.
   */
  public val customerAccount: String? = null,
  defaultTaxRates: List<InlineQuoteDefaultTaxRatesItemXd99c0405>? = null,
  /**
   * A description that will be displayed on the quote PDF.
   */
  public val description: String? = null,
  /**
   * A footer that will be displayed on the quote PDF.
   */
  public val footer: String? = null,
  /**
   * Details of the quote that was cloned. See the [cloning documentation](https://docs.stripe.com/quotes/clone) for
   * more details.
   */
  public val fromQuote: InlineQuoteFromQuoteX86014e8c? = null,
  /**
   * A header that will be displayed on the quote PDF.
   */
  public val `header`: String? = null,
  /**
   * The invoice that was created from this quote.
   */
  public val invoice: InlineQuoteInvoiceX5bd1d2d6? = null,
  /**
   * A list of items the customer is being quoted for.
   */
  public val lineItems: InlineQuoteLineItemsX6064fea4? = null,
  /**
   * A unique number that identifies this particular quote. This number is assigned once the quote is
   * [finalized](https://docs.stripe.com/quotes/overview#finalize).
   */
  public val number: String? = null,
  /**
   * The account on behalf of which to charge. See the [Connect
   * documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for details.
   */
  public val onBehalfOf: InlineQuoteOnBehalfOfXcdb50ea5? = null,
  /**
   * The subscription that was created or updated from this quote.
   */
  public val subscription: InlineQuoteSubscriptionX578bf401? = null,
  /**
   * The subscription schedule that was created or updated from this quote.
   */
  public val subscriptionSchedule: InlineQuoteSubscriptionScheduleX0c498016? = null,
  /**
   * ID of the test clock this quote belongs to.
   */
  public val testClock: InlineQuoteTestClockXf70c6291? = null,
  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will
   * be transferred to for each of the invoices.
   */
  public val transferData: InlineQuoteTransferDataX81cc6d49? = null,
) {
  /**
   * The discounts applied to this quote.
   */
  public val discounts: List<InlineQuoteDiscountsItemX7f4b5eb5> = discounts.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * The tax rates applied to this quote.
   */
  public val defaultTaxRates: List<InlineQuoteDefaultTaxRatesItemXd99c0405>? =
      defaultTaxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountSubtotalValue: Int? = null

    public var amountSubtotal: Int
      get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
      set(`value`) {
        amountSubtotalValue = value
      }

    private var amountTotalValue: Int? = null

    public var amountTotal: Int
      get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
      set(`value`) {
        amountTotalValue = value
      }

    private var automaticTaxValue: QuotesResourceAutomaticTax? = null

    public var automaticTax: QuotesResourceAutomaticTax
      get() = requireNotNull(automaticTaxValue) { "automaticTax is required" }
      set(`value`) {
        automaticTaxValue = value
      }

    private var collectionMethodValue: InlineQuoteCollectionMethodXc934a75e? = null

    public var collectionMethod: InlineQuoteCollectionMethodXc934a75e
      get() = requireNotNull(collectionMethodValue) { "collectionMethod is required" }
      set(`value`) {
        collectionMethodValue = value
      }

    private var computedValue: QuotesResourceComputed? = null

    public var computed: QuotesResourceComputed
      get() = requireNotNull(computedValue) { "computed is required" }
      set(`value`) {
        computedValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var discountsValue: List<InlineQuoteDiscountsItemX7f4b5eb5>? = null

    public var discounts: List<InlineQuoteDiscountsItemX7f4b5eb5>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
      }

    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var invoiceSettingsValue: InvoiceSettingQuoteSetting? = null

    public var invoiceSettings: InvoiceSettingQuoteSetting
      get() = requireNotNull(invoiceSettingsValue) { "invoiceSettings is required" }
      set(`value`) {
        invoiceSettingsValue = value
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

    private var objectValueValue: InlineQuoteObjectValueX36b1fc7b? = null

    public var objectValue: InlineQuoteObjectValueX36b1fc7b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineQuoteStatusX90d749ee? = null

    public var status: InlineQuoteStatusX90d749ee
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusTransitionsValue: QuotesResourceStatusTransitions? = null

    public var statusTransitions: QuotesResourceStatusTransitions
      get() = requireNotNull(statusTransitionsValue) { "statusTransitions is required" }
      set(`value`) {
        statusTransitionsValue = value
      }

    private var subscriptionDataValue: QuotesResourceSubscriptionDataSubscriptionData? = null

    public var subscriptionData: QuotesResourceSubscriptionDataSubscriptionData
      get() = requireNotNull(subscriptionDataValue) { "subscriptionData is required" }
      set(`value`) {
        subscriptionDataValue = value
      }

    private var totalDetailsValue: QuotesResourceTotalDetails? = null

    public var totalDetails: QuotesResourceTotalDetails
      get() = requireNotNull(totalDetailsValue) { "totalDetails is required" }
      set(`value`) {
        totalDetailsValue = value
      }

    /**
     * ID of the Connect Application that created the quote.
     */
    public var application: InlineQuoteApplicationX6159df96? = null

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. Only applicable if there are no line items with recurring prices on the
     * quote.
     */
    public var applicationFeeAmount: Int? = null

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account. Only applicable if
     * there are line items with recurring prices on the quote.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public var currency: String? = null

    /**
     * The customer who received this quote. A customer is required to finalize the quote. Once specified, you can't
     * change it.
     */
    public var customer: InlineQuoteCustomerX40ae4996? = null

    /**
     * The account representing the customer who received this quote. A customer or account is required to finalize the
     * quote. Once specified, you can't change it.
     */
    public var customerAccount: String? = null

    private var defaultTaxRatesValue: List<InlineQuoteDefaultTaxRatesItemXd99c0405>? = null

    /**
     * The tax rates applied to this quote.
     */
    public var defaultTaxRates: List<InlineQuoteDefaultTaxRatesItemXd99c0405>?
      get() = defaultTaxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultTaxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A description that will be displayed on the quote PDF.
     */
    public var description: String? = null

    /**
     * A footer that will be displayed on the quote PDF.
     */
    public var footer: String? = null

    /**
     * Details of the quote that was cloned. See the [cloning documentation](https://docs.stripe.com/quotes/clone) for
     * more details.
     */
    public var fromQuote: InlineQuoteFromQuoteX86014e8c? = null

    /**
     * A header that will be displayed on the quote PDF.
     */
    public var `header`: String? = null

    /**
     * The invoice that was created from this quote.
     */
    public var invoice: InlineQuoteInvoiceX5bd1d2d6? = null

    /**
     * A list of items the customer is being quoted for.
     */
    public var lineItems: InlineQuoteLineItemsX6064fea4? = null

    /**
     * A unique number that identifies this particular quote. This number is assigned once the quote is
     * [finalized](https://docs.stripe.com/quotes/overview#finalize).
     */
    public var number: String? = null

    /**
     * The account on behalf of which to charge. See the [Connect
     * documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for
     * details.
     */
    public var onBehalfOf: InlineQuoteOnBehalfOfXcdb50ea5? = null

    /**
     * The subscription that was created or updated from this quote.
     */
    public var subscription: InlineQuoteSubscriptionX578bf401? = null

    /**
     * The subscription schedule that was created or updated from this quote.
     */
    public var subscriptionSchedule: InlineQuoteSubscriptionScheduleX0c498016? = null

    /**
     * ID of the test clock this quote belongs to.
     */
    public var testClock: InlineQuoteTestClockXf70c6291? = null

    /**
     * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will
     * be transferred to for each of the invoices.
     */
    public var transferData: InlineQuoteTransferDataX81cc6d49? = null

    public fun build(): Quote {
      check(amountSubtotalValue != null) { "amountSubtotal is required" }
      check(amountTotalValue != null) { "amountTotal is required" }
      check(automaticTaxValue != null) { "automaticTax is required" }
      check(collectionMethodValue != null) { "collectionMethod is required" }
      check(computedValue != null) { "computed is required" }
      check(createdValue != null) { "created is required" }
      check(discountsValue != null) { "discounts is required" }
      check(expiresAtValue != null) { "expiresAt is required" }
      check(idValue != null) { "id is required" }
      check(invoiceSettingsValue != null) { "invoiceSettings is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(statusTransitionsValue != null) { "statusTransitions is required" }
      check(subscriptionDataValue != null) { "subscriptionData is required" }
      check(totalDetailsValue != null) { "totalDetails is required" }
      return Quote(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        automaticTax = automaticTax,
        collectionMethod = collectionMethod,
        computed = computed,
        created = created,
        discounts = discounts,
        expiresAt = expiresAt,
        id = id,
        invoiceSettings = invoiceSettings,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        statusTransitions = statusTransitions,
        subscriptionData = subscriptionData,
        totalDetails = totalDetails,
        application = application,
        applicationFeeAmount = applicationFeeAmount,
        applicationFeePercent = applicationFeePercent,
        currency = currency,
        customer = customer,
        customerAccount = customerAccount,
        defaultTaxRates = defaultTaxRates,
        description = description,
        footer = footer,
        fromQuote = fromQuote,
        header = header,
        invoice = invoice,
        lineItems = lineItems,
        number = number,
        onBehalfOf = onBehalfOf,
        subscription = subscription,
        subscriptionSchedule = subscriptionSchedule,
        testClock = testClock,
        transferData = transferData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Quote = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Quote> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Quote {
      val jsonDecoder = decoder.requireJsonDecoder("Quote")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Quote must be a JSON object")
      val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
      val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
      val automaticTax = json.decodeRequired<QuotesResourceAutomaticTax>(rawObject, "automatic_tax")
      val collectionMethod = json.decodeRequired<InlineQuoteCollectionMethodXc934a75e>(rawObject, "collection_method")
      val computed = json.decodeRequired<QuotesResourceComputed>(rawObject, "computed")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val discounts = json.decodeRequired<List<InlineQuoteDiscountsItemX7f4b5eb5>>(rawObject, "discounts")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val invoiceSettings = json.decodeRequired<InvoiceSettingQuoteSetting>(rawObject, "invoice_settings")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineQuoteObjectValueX36b1fc7b>(rawObject, "object")
      val status = json.decodeRequired<InlineQuoteStatusX90d749ee>(rawObject, "status")
      val statusTransitions = json.decodeRequired<QuotesResourceStatusTransitions>(rawObject, "status_transitions")
      val subscriptionData = json.decodeRequired<QuotesResourceSubscriptionDataSubscriptionData>(rawObject, "subscription_data")
      val totalDetails = json.decodeRequired<QuotesResourceTotalDetails>(rawObject, "total_details")
      return Quote(
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        automaticTax = automaticTax,
        collectionMethod = collectionMethod,
        computed = computed,
        created = created,
        discounts = discounts,
        expiresAt = expiresAt,
        id = id,
        invoiceSettings = invoiceSettings,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        status = status,
        statusTransitions = statusTransitions,
        subscriptionData = subscriptionData,
        totalDetails = totalDetails,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteApplicationX6159df96?>(element) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteCustomerX40ae4996?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<List<InlineQuoteDefaultTaxRatesItemXd99c0405>>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        footer = rawObject["footer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fromQuote = rawObject["from_quote"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteFromQuoteX86014e8c?>(element) },
        header = rawObject["header"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoice = rawObject["invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteInvoiceX5bd1d2d6?>(element) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineQuoteLineItemsX6064fea4>(it) },
        number = rawObject["number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteOnBehalfOfXcdb50ea5?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteSubscriptionX578bf401?>(element) },
        subscriptionSchedule = rawObject["subscription_schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteSubscriptionScheduleX0c498016?>(element) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteTestClockXf70c6291?>(element) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineQuoteTransferDataX81cc6d49?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Quote) {
      val jsonEncoder = encoder.requireJsonEncoder("Quote")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
        put("amount_total", json.encodeToJsonElement(value.amountTotal))
        put("automatic_tax", json.encodeToJsonElement(value.automaticTax))
        put("collection_method", json.encodeToJsonElement(value.collectionMethod))
        put("computed", json.encodeToJsonElement(value.computed))
        put("created", json.encodeToJsonElement(value.created))
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("id", value.id)
        put("invoice_settings", json.encodeToJsonElement(value.invoiceSettings))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("status_transitions", json.encodeToJsonElement(value.statusTransitions))
        put("subscription_data", json.encodeToJsonElement(value.subscriptionData))
        put("total_details", json.encodeToJsonElement(value.totalDetails))
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.footer?.let { put("footer", it) }
        value.fromQuote?.let { put("from_quote", json.encodeToJsonElement(it)) }
        value.header?.let { put("header", it) }
        value.invoice?.let { put("invoice", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", it) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.subscription?.let { put("subscription", json.encodeToJsonElement(it)) }
        value.subscriptionSchedule?.let { put("subscription_schedule", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quote(block: Quote.Builder.() -> Unit): Quote = Quote.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Quote is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

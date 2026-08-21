package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
public data class CustomerBalanceTransactionView internal constructor(
  public val amount: Int,
  @SerialName("checkout_session")
  public val checkoutSession: InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c? = null,
  public val created: Int,
  @SerialName("credit_note")
  public val creditNote: InlineCustomerBalanceTransactionCreditNoteX36733346? = null,
  public val currency: String,
  public val customer: InlineCustomerBalanceTransactionCustomerX6a99f473,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val description: String? = null,
  @SerialName("ending_balance")
  public val endingBalance: Int,
  public val id: String,
  public val invoice: InlineCustomerBalanceTransactionInvoiceXa74b01e8? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  @SerialName("object")
  public val objectValue: InlineCustomerBalanceTransactionObjectValueXfd80c0ef,
  public val type: InlineCustomerBalanceTransactionTypeXd0405a14,
)

/**
 * Each customer has a [Balance](https://docs.stripe.com/api/customers/object#customer_object-balance) value,
 * which denotes a debit or credit that's automatically applied to their next invoice upon finalization.
 * You may modify the value directly by using the [update customer API](https://docs.stripe.com/api/customers/update),
 * or by creating a Customer Balance Transaction, which increments or decrements the customer's `balance` by the
 * specified `amount`.
 *
 * Related guide: [Customer balance](https://docs.stripe.com/billing/customer/balance)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction
 */
@Serializable(with = CustomerBalanceTransaction.Serializer::class)
public class CustomerBalanceTransaction(
  /**
   * The amount of the transaction. A negative value is a credit for the customer's balance, and a positive value is a
   * debit to the customer's `balance`.
   */
  public val amount: Int,
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
   * The ID of the customer the transaction belongs to.
   */
  public val customer: InlineCustomerBalanceTransactionCustomerX6a99f473,
  /**
   * The customer's `balance` after the transaction was applied. A negative value decreases the amount due on the
   * customer's next invoice. A positive value increases the amount due on the customer's next invoice.
   */
  public val endingBalance: Int,
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
  public val objectValue: InlineCustomerBalanceTransactionObjectValueXfd80c0ef,
  /**
   * Transaction type: `adjustment`, `applied_to_invoice`, `credit_note`, `initial`, `invoice_overpaid`,
   * `invoice_too_large`, `invoice_too_small`, `unspent_receiver_credit`, `unapplied_from_invoice`,
   * `checkout_session_subscription_payment`, or `checkout_session_subscription_payment_canceled`. See the [Customer
   * Balance page](https://docs.stripe.com/billing/customer/balance#types) to learn more about transaction types.
   */
  public val type: InlineCustomerBalanceTransactionTypeXd0405a14,
  /**
   * The ID of the checkout session (if any) that created the transaction.
   */
  public val checkoutSession: InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c? = null,
  /**
   * The ID of the credit note (if any) related to the transaction.
   */
  public val creditNote: InlineCustomerBalanceTransactionCreditNoteX36733346? = null,
  /**
   * The ID of an Account representing a customer that the transaction belongs to.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * The ID of the invoice (if any) related to the transaction.
   */
  public val invoice: InlineCustomerBalanceTransactionInvoiceXa74b01e8? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
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

    private var customerValue: InlineCustomerBalanceTransactionCustomerX6a99f473? = null

    public var customer: InlineCustomerBalanceTransactionCustomerX6a99f473
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var endingBalanceValue: Int? = null

    public var endingBalance: Int
      get() = requireNotNull(endingBalanceValue) { "endingBalance is required" }
      set(`value`) {
        endingBalanceValue = value
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

    private var objectValueValue: InlineCustomerBalanceTransactionObjectValueXfd80c0ef? = null

    public var objectValue: InlineCustomerBalanceTransactionObjectValueXfd80c0ef
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: InlineCustomerBalanceTransactionTypeXd0405a14? = null

    public var type: InlineCustomerBalanceTransactionTypeXd0405a14
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The ID of the checkout session (if any) that created the transaction.
     */
    public var checkoutSession: InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c? = null

    /**
     * The ID of the credit note (if any) related to the transaction.
     */
    public var creditNote: InlineCustomerBalanceTransactionCreditNoteX36733346? = null

    /**
     * The ID of an Account representing a customer that the transaction belongs to.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * The ID of the invoice (if any) related to the transaction.
     */
    public var invoice: InlineCustomerBalanceTransactionInvoiceXa74b01e8? = null

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

    public fun build(): CustomerBalanceTransaction {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerValue != null) { "customer is required" }
      check(endingBalanceValue != null) { "endingBalance is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      return CustomerBalanceTransaction(
        amount = amount,
        created = created,
        currency = currency,
        customer = customer,
        endingBalance = endingBalance,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        checkoutSession = checkoutSession,
        creditNote = creditNote,
        customerAccount = customerAccount,
        description = description,
        invoice = invoice,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerBalanceTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceTransaction must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customer = json.decodeRequired<InlineCustomerBalanceTransactionCustomerX6a99f473>(rawObject, "customer")
      val endingBalance = json.decodeRequired<Int>(rawObject, "ending_balance")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineCustomerBalanceTransactionObjectValueXfd80c0ef>(rawObject, "object")
      val type = json.decodeRequired<InlineCustomerBalanceTransactionTypeXd0405a14>(rawObject, "type")
      return CustomerBalanceTransaction(
        amount = amount,
        created = created,
        currency = currency,
        customer = customer,
        endingBalance = endingBalance,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        checkoutSession = rawObject["checkout_session"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerBalanceTransactionCheckoutSessionX2b2ae84c?>(element) },
        creditNote = rawObject["credit_note"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerBalanceTransactionCreditNoteX36733346?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoice = rawObject["invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerBalanceTransactionInvoiceXa74b01e8?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("customer", json.encodeToJsonElement(value.customer))
        put("ending_balance", json.encodeToJsonElement(value.endingBalance))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", json.encodeToJsonElement(value.type))
        value.checkoutSession?.let { put("checkout_session", json.encodeToJsonElement(it)) }
        value.creditNote?.let { put("credit_note", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.invoice?.let { put("invoice", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceTransaction(block: CustomerBalanceTransaction.Builder.() -> Unit): CustomerBalanceTransaction = CustomerBalanceTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerBalanceTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

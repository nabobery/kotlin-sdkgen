package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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

@Serializable
public data class CustomerCashBalanceTransactionView(
  @SerialName("adjusted_for_overdraft")
  public val adjustedForOverdraft:
      CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft? = null,
  @SerialName("applied_to_payment")
  public val appliedToPayment:
      CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction? = null,
  public val created: Int,
  public val currency: String,
  public val customer: InlineCustomerCashBalanceTransactionCustomerXaefbb309,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("ending_balance")
  public val endingBalance: Int,
  public val funded: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("net_amount")
  public val netAmount: Int,
  @SerialName("object")
  public val objectValue: InlineCustomerCashBalanceTransactionObjectValueXeb412635,
  @SerialName("refunded_from_payment")
  public val refundedFromPayment:
      CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction? = null,
  @SerialName("transferred_to_balance")
  public val transferredToBalance:
      CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance? = null,
  public val type: InlineCustomerCashBalanceTransactionTypeXef586d00,
  @SerialName("unapplied_from_payment")
  public val unappliedFromPayment:
      CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction? = null,
)

/**
 * Customers with certain payments enabled have a cash balance, representing funds that were paid
 * by the customer to a merchant, but have not yet been allocated to a payment. Cash Balance Transactions
 * represent when funds are moved into or out of this balance. This includes funding by the customer, allocation
 * to payments, and refunds to the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_cash_balance_transaction
 */
@Serializable(with = CustomerCashBalanceTransaction.Serializer::class)
public class CustomerCashBalanceTransaction(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String,
  /**
   * The customer whose available cash balance changed as a result of this transaction.
   */
  public val customer: InlineCustomerCashBalanceTransactionCustomerXaefbb309,
  /**
   * The total available cash balance for the specified currency after this transaction was applied. Represented in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
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
   * The amount by which the cash balance changed, represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). A positive value represents funds being added to the cash
   * balance, a negative value represents funds being removed from the cash balance.
   */
  public val netAmount: Int,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCustomerCashBalanceTransactionObjectValueXeb412635,
  /**
   * The type of the cash balance transaction. New types may be added in future. See [Customer
   * Balance](https://docs.stripe.com/payments/customer-balance#types) to learn more about these types.
   */
  public val type: InlineCustomerCashBalanceTransactionTypeXef586d00,
  public val adjustedForOverdraft:
      CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft? = null,
  public val appliedToPayment:
      CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction? = null,
  /**
   * The ID of an Account representing a customer whose available cash balance changed as a result of this transaction.
   */
  public val customerAccount: String? = null,
  public val funded: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction? = null,
  public val refundedFromPayment:
      CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction? = null,
  public val transferredToBalance:
      CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance? = null,
  public val unappliedFromPayment:
      CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction? = null,
) {
  public class Builder {
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

    private var customerValue: InlineCustomerCashBalanceTransactionCustomerXaefbb309? = null

    public var customer: InlineCustomerCashBalanceTransactionCustomerXaefbb309
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

    private var netAmountValue: Int? = null

    public var netAmount: Int
      get() = requireNotNull(netAmountValue) { "netAmount is required" }
      set(`value`) {
        netAmountValue = value
      }

    private var objectValueValue: InlineCustomerCashBalanceTransactionObjectValueXeb412635? = null

    public var objectValue: InlineCustomerCashBalanceTransactionObjectValueXeb412635
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: InlineCustomerCashBalanceTransactionTypeXef586d00? = null

    public var type: InlineCustomerCashBalanceTransactionTypeXef586d00
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var adjustedForOverdraft:
        CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft? = null

    public var appliedToPayment:
        CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction? = null

    /**
     * The ID of an Account representing a customer whose available cash balance changed as a result of this
     * transaction.
     */
    public var customerAccount: String? = null

    public var funded: CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction? =
        null

    public var refundedFromPayment:
        CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction? = null

    public var transferredToBalance:
        CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance? = null

    public var unappliedFromPayment:
        CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction? = null

    public fun build(): CustomerCashBalanceTransaction {
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerValue != null) { "customer is required" }
      check(endingBalanceValue != null) { "endingBalance is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(netAmountValue != null) { "netAmount is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      return CustomerCashBalanceTransaction(
        created = created,
        currency = currency,
        customer = customer,
        endingBalance = endingBalance,
        id = id,
        livemode = livemode,
        netAmount = netAmount,
        objectValue = objectValue,
        type = type,
        adjustedForOverdraft = adjustedForOverdraft,
        appliedToPayment = appliedToPayment,
        customerAccount = customerAccount,
        funded = funded,
        refundedFromPayment = refundedFromPayment,
        transferredToBalance = transferredToBalance,
        unappliedFromPayment = unappliedFromPayment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerCashBalanceTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerCashBalanceTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerCashBalanceTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerCashBalanceTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerCashBalanceTransaction must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customer = json.decodeRequired<InlineCustomerCashBalanceTransactionCustomerXaefbb309>(rawObject, "customer")
      val endingBalance = json.decodeRequired<Int>(rawObject, "ending_balance")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val netAmount = json.decodeRequired<Int>(rawObject, "net_amount")
      val objectValue = json.decodeRequired<InlineCustomerCashBalanceTransactionObjectValueXeb412635>(rawObject, "object")
      val type = json.decodeRequired<InlineCustomerCashBalanceTransactionTypeXef586d00>(rawObject, "type")
      return CustomerCashBalanceTransaction(
        created = created,
        currency = currency,
        customer = customer,
        endingBalance = endingBalance,
        id = id,
        livemode = livemode,
        netAmount = netAmount,
        objectValue = objectValue,
        type = type,
        adjustedForOverdraft = rawObject["adjusted_for_overdraft"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceAdjustedForOverdraft>(it) },
        appliedToPayment = rawObject["applied_to_payment"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceAppliedToPaymentTransaction>(it) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        funded = rawObject["funded"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceFundedTransaction>(it) },
        refundedFromPayment = rawObject["refunded_from_payment"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceRefundedFromPaymentTransaction>(it) },
        transferredToBalance = rawObject["transferred_to_balance"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceTransferredToBalance>(it) },
        unappliedFromPayment = rawObject["unapplied_from_payment"]?.let { json.decodeFromJsonElement<CustomerBalanceResourceCashBalanceTransactionResourceUnappliedFromPaymentTransaction>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerCashBalanceTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerCashBalanceTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("customer", json.encodeToJsonElement(value.customer))
        put("ending_balance", json.encodeToJsonElement(value.endingBalance))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("net_amount", json.encodeToJsonElement(value.netAmount))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", json.encodeToJsonElement(value.type))
        value.adjustedForOverdraft?.let { put("adjusted_for_overdraft", json.encodeToJsonElement(it)) }
        value.appliedToPayment?.let { put("applied_to_payment", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.funded?.let { put("funded", json.encodeToJsonElement(it)) }
        value.refundedFromPayment?.let { put("refunded_from_payment", json.encodeToJsonElement(it)) }
        value.transferredToBalance?.let { put("transferred_to_balance", json.encodeToJsonElement(it)) }
        value.unappliedFromPayment?.let { put("unapplied_from_payment", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerCashBalanceTransaction(block: CustomerCashBalanceTransaction.Builder.() -> Unit): CustomerCashBalanceTransaction = CustomerCashBalanceTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerCashBalanceTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

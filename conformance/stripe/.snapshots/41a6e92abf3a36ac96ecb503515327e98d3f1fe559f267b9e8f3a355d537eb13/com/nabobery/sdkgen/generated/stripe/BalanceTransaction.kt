package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
public data class BalanceTransactionView internal constructor(
  public val amount: Int,
  @SerialName("available_on")
  public val availableOn: Int,
  @SerialName("balance_type")
  public val balanceType: InlineBalanceTransactionBalanceTypeXc7269442,
  public val created: Int,
  public val currency: String,
  public val description: String? = null,
  @SerialName("exchange_rate")
  public val exchangeRate: Double? = null,
  public val fee: Int,
  @SerialName("fee_details")
  public val feeDetails: List<Fee>,
  public val id: String,
  public val net: Int,
  @SerialName("object")
  public val objectValue: InlineBalanceTransactionObjectValueXa73ccb52,
  @SerialName("reporting_category")
  public val reportingCategory: String,
  public val source: InlineBalanceTransactionSourceX72d51cf4? = null,
  public val status: String,
  public val type: InlineBalanceTransactionTypeXf875c7aa,
)

/**
 * Balance transactions represent funds moving through your Stripe account.
 * Stripe creates them for every type of transaction that enters or leaves your Stripe account balance.
 *
 * Related guide: [Balance transaction types](https://docs.stripe.com/reports/balance-transaction-types)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_transaction
 */
@Serializable(with = BalanceTransaction.Serializer::class)
public class BalanceTransaction(
  /**
   * Gross amount of this transaction (in cents (or local equivalent)). A positive value represents funds charged to
   * another party, and a negative value represents funds sent to another party.
   */
  public val amount: Int,
  /**
   * The date that the transaction's net funds become available in the Stripe balance.
   */
  public val availableOn: Int,
  /**
   * The balance that this transaction impacts.
   */
  public val balanceType: InlineBalanceTransactionBalanceTypeXc7269442,
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
   * Fees (in cents (or local equivalent)) paid for this transaction. Represented as a positive integer when assessed.
   */
  public val fee: Int,
  feeDetails: List<Fee>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * Net impact to a Stripe balance (in cents (or local equivalent)). A positive value represents incrementing a Stripe
   * balance, and a negative value decrementing a Stripe balance. You can calculate the net impact of a transaction on a
   * balance by `amount` - `fee`
   */
  public val net: Int,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineBalanceTransactionObjectValueXa73ccb52,
  /**
   * Learn more about how [reporting categories](https://stripe.com/docs/reports/reporting-categories) can help you
   * understand balance transactions from an accounting perspective.
   */
  public val reportingCategory: String,
  /**
   * The transaction's net funds status in the Stripe balance, which are either `available` or `pending`.
   */
  public val status: String,
  /**
   * Transaction type: `tax_fund`, `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`,
   * `application_fee`, `application_fee_refund`, `charge`, `climate_order_purchase`, `climate_order_refund`,
   * `connect_collection_transfer`, `contribution`, `inbound_transfer`, `inbound_transfer_reversal`,
   * `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`,
   * `obligation_outbound`, `obligation_reversal_inbound`, `payment`, `payment_failure_refund`,
   * `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`, `payment_reversal`,
   * `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`, `payout_minimum_balance_hold`,
   * `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`,
   * `reserve_hold`, `reserve_release`, `stripe_fee`, `stripe_fx_fee`, `stripe_balance_payment_debit`,
   * `stripe_balance_payment_debit_reversal`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`,
   * `transfer_failure`, `transfer_refund`, or `fee_credit_funding`. Learn more about [balance transaction types and
   * what they represent](https://stripe.com/docs/reports/balance-transaction-types). To classify transactions for
   * accounting purposes, consider `reporting_category` instead.
   */
  public val type: InlineBalanceTransactionTypeXf875c7aa,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * If applicable, this transaction uses an exchange rate. If money converts from currency A to currency B, then the
   * `amount` in currency A, multipled by the `exchange_rate`, equals the `amount` in currency B. For example, if you
   * charge a customer 10.00 EUR, the PaymentIntent's `amount` is `1000` and `currency` is `eur`. If this converts to
   * 12.34 USD in your Stripe account, the BalanceTransaction's `amount` is `1234`, its `currency` is `usd`, and the
   * `exchange_rate` is `1.234`.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val exchangeRate: Double? = null,
  /**
   * This transaction relates to the Stripe object.
   */
  public val source: InlineBalanceTransactionSourceX72d51cf4? = null,
) {
  /**
   * Detailed breakdown of fees (in cents (or local equivalent)) paid for this transaction.
   */
  public val feeDetails: List<Fee> = feeDetails.toList()

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var availableOnValue: Int? = null

    public var availableOn: Int
      get() = requireNotNull(availableOnValue) { "availableOn is required" }
      set(`value`) {
        availableOnValue = value
      }

    private var balanceTypeValue: InlineBalanceTransactionBalanceTypeXc7269442? = null

    public var balanceType: InlineBalanceTransactionBalanceTypeXc7269442
      get() = requireNotNull(balanceTypeValue) { "balanceType is required" }
      set(`value`) {
        balanceTypeValue = value
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

    private var feeValue: Int? = null

    public var fee: Int
      get() = requireNotNull(feeValue) { "fee is required" }
      set(`value`) {
        feeValue = value
      }

    private var feeDetailsValue: List<Fee>? = null

    public var feeDetails: List<Fee>
      get() = requireNotNull(feeDetailsValue) { "feeDetails is required" }.toList()
      set(`value`) {
        feeDetailsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var netValue: Int? = null

    public var net: Int
      get() = requireNotNull(netValue) { "net is required" }
      set(`value`) {
        netValue = value
      }

    private var objectValueValue: InlineBalanceTransactionObjectValueXa73ccb52? = null

    public var objectValue: InlineBalanceTransactionObjectValueXa73ccb52
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var reportingCategoryValue: String? = null

    public var reportingCategory: String
      get() = requireNotNull(reportingCategoryValue) { "reportingCategory is required" }
      set(`value`) {
        reportingCategoryValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineBalanceTransactionTypeXf875c7aa? = null

    public var type: InlineBalanceTransactionTypeXf875c7aa
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * If applicable, this transaction uses an exchange rate. If money converts from currency A to currency B, then the
     * `amount` in currency A, multipled by the `exchange_rate`, equals the `amount` in currency B. For example, if you
     * charge a customer 10.00 EUR, the PaymentIntent's `amount` is `1000` and `currency` is `eur`. If this converts to
     * 12.34 USD in your Stripe account, the BalanceTransaction's `amount` is `1234`, its `currency` is `usd`, and the
     * `exchange_rate` is `1.234`.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var exchangeRate: Double? = null

    /**
     * This transaction relates to the Stripe object.
     */
    public var source: InlineBalanceTransactionSourceX72d51cf4? = null

    public fun build(): BalanceTransaction {
      check(amountValue != null) { "amount is required" }
      check(availableOnValue != null) { "availableOn is required" }
      check(balanceTypeValue != null) { "balanceType is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(feeValue != null) { "fee is required" }
      check(feeDetailsValue != null) { "feeDetails is required" }
      check(idValue != null) { "id is required" }
      check(netValue != null) { "net is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(reportingCategoryValue != null) { "reportingCategory is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return BalanceTransaction(
        amount = amount,
        availableOn = availableOn,
        balanceType = balanceType,
        created = created,
        currency = currency,
        fee = fee,
        feeDetails = feeDetails,
        id = id,
        net = net,
        objectValue = objectValue,
        reportingCategory = reportingCategory,
        status = status,
        type = type,
        description = description,
        exchangeRate = exchangeRate,
        source = source,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BalanceTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceTransaction must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val availableOn = json.decodeRequired<Int>(rawObject, "available_on")
      val balanceType = json.decodeRequired<InlineBalanceTransactionBalanceTypeXc7269442>(rawObject, "balance_type")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val fee = json.decodeRequired<Int>(rawObject, "fee")
      val feeDetails = json.decodeRequired<List<Fee>>(rawObject, "fee_details")
      val id = json.decodeRequired<String>(rawObject, "id")
      val net = json.decodeRequired<Int>(rawObject, "net")
      val objectValue = json.decodeRequired<InlineBalanceTransactionObjectValueXa73ccb52>(rawObject, "object")
      val reportingCategory = json.decodeRequired<String>(rawObject, "reporting_category")
      val status = json.decodeRequired<String>(rawObject, "status")
      val type = json.decodeRequired<InlineBalanceTransactionTypeXf875c7aa>(rawObject, "type")
      return BalanceTransaction(
        amount = amount,
        availableOn = availableOn,
        balanceType = balanceType,
        created = created,
        currency = currency,
        fee = fee,
        feeDetails = feeDetails,
        id = id,
        net = net,
        objectValue = objectValue,
        reportingCategory = reportingCategory,
        status = status,
        type = type,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        exchangeRate = rawObject["exchange_rate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        source = rawObject["source"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBalanceTransactionSourceX72d51cf4?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("available_on", json.encodeToJsonElement(value.availableOn))
        put("balance_type", json.encodeToJsonElement(value.balanceType))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("fee", json.encodeToJsonElement(value.fee))
        put("fee_details", json.encodeToJsonElement(value.feeDetails))
        put("id", value.id)
        put("net", json.encodeToJsonElement(value.net))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("reporting_category", value.reportingCategory)
        put("status", value.status)
        put("type", json.encodeToJsonElement(value.type))
        value.description?.let { put("description", it) }
        value.exchangeRate?.let { put("exchange_rate", json.encodeToJsonElement(it)) }
        value.source?.let { put("source", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceTransaction(block: BalanceTransaction.Builder.() -> Unit): BalanceTransaction = BalanceTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

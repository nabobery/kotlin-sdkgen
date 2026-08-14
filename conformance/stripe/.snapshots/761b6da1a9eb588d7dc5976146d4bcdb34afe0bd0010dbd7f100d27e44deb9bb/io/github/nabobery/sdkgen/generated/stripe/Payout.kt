package io.github.nabobery.sdkgen.generated.stripe

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
public data class PayoutView internal constructor(
  public val amount: Int,
  @SerialName("application_fee")
  public val applicationFee: InlinePayoutApplicationFeeX54ffd315? = null,
  @SerialName("application_fee_amount")
  public val applicationFeeAmount: Int? = null,
  @SerialName("arrival_date")
  public val arrivalDate: Int,
  public val automatic: Boolean,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlinePayoutBalanceTransactionX644e86fe? = null,
  public val created: Int,
  public val currency: String,
  public val description: String? = null,
  public val destination: InlinePayoutDestinationXa1b3c2cf? = null,
  @SerialName("failure_balance_transaction")
  public val failureBalanceTransaction: InlinePayoutFailureBalanceTransactionX38dfbc94? = null,
  @SerialName("failure_code")
  public val failureCode: String? = null,
  @SerialName("failure_message")
  public val failureMessage: String? = null,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  public val method: String,
  @SerialName("object")
  public val objectValue: InlinePayoutObjectValueXe5591f79,
  @SerialName("original_payout")
  public val originalPayout: InlinePayoutOriginalPayoutX84c88c4d? = null,
  @SerialName("payout_method")
  public val payoutMethod: String? = null,
  @SerialName("reconciliation_status")
  public val reconciliationStatus: InlinePayoutReconciliationStatusX2b08164f,
  @SerialName("reversed_by")
  public val reversedBy: InlinePayoutReversedByX25442278? = null,
  @SerialName("source_type")
  public val sourceType: String,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  public val status: String,
  @SerialName("trace_id")
  public val traceId: InlinePayoutTraceIdXd4dacdb0? = null,
  public val type: InlinePayoutTypeX1e2cc1d0,
)

/**
 * A `Payout` object is created when you receive funds from Stripe, or when you
 * initiate a payout to either a bank account or debit card of a [connected
 * Stripe account](/docs/connect/bank-debit-card-payouts). You can retrieve individual payouts,
 * and list all payouts. Payouts are made on [varying
 * schedules](/docs/connect/manage-payout-schedule), depending on your country and
 * industry.
 *
 * Related guide: [Receiving payouts](https://docs.stripe.com/payouts)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout
 */
@Serializable(with = Payout.Serializer::class)
public class Payout(
  /**
   * The amount (in cents (or local equivalent)) that transfers to your bank account or debit card.
   */
  public val amount: Int,
  /**
   * Date that you can expect the payout to arrive in the bank. This factors in delays to account for weekends or bank
   * holidays.
   */
  public val arrivalDate: Int,
  /**
   * Returns `true` if the payout is created by an [automated payout
   * schedule](https://docs.stripe.com/payouts#payout-schedule) and `false` if it's [requested
   * manually](https://stripe.com/docs/payouts#manual-payouts).
   */
  public val automatic: Boolean,
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
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The method used to send this payout, which can be `standard` or `instant`. `instant` is supported for payouts to
   * debit cards and bank accounts in certain countries. Learn more about [bank support for Instant
   * Payouts](https://stripe.com/docs/payouts/instant-payouts-banks).
   */
  public val method: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePayoutObjectValueXe5591f79,
  /**
   * If `completed`, you can use the [Balance Transactions
   * API](https://docs.stripe.com/api/balance_transactions/list#balance_transaction_list-payout) to list all balance
   * transactions that are paid out in this payout.
   */
  public val reconciliationStatus: InlinePayoutReconciliationStatusX2b08164f,
  /**
   * The source balance this payout came from, which can be one of the following: `card`, `fpx`, or `bank_account`.
   */
  public val sourceType: String,
  /**
   * Current status of the payout: `paid`, `pending`, `in_transit`, `canceled` or `failed`. A payout is `pending` until
   * it's submitted to the bank, when it becomes `in_transit`. The status changes to `paid` if the transaction succeeds,
   * or to `failed` or `canceled` (within 5 business days). Some payouts that fail might initially show as `paid`, then
   * change to `failed`.
   */
  public val status: String,
  /**
   * Can be `bank_account` or `card`.
   */
  public val type: InlinePayoutTypeX1e2cc1d0,
  /**
   * The application fee (if any) for the payout. [See the Connect
   * documentation](https://docs.stripe.com/connect/instant-payouts#monetization-and-fees) for details.
   */
  public val applicationFee: InlinePayoutApplicationFeeX54ffd315? = null,
  /**
   * The amount of the application fee (if any) requested for the payout. [See the Connect
   * documentation](https://docs.stripe.com/connect/instant-payouts#monetization-and-fees) for details.
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * ID of the balance transaction that describes the impact of this payout on your account balance.
   */
  public val balanceTransaction: InlinePayoutBalanceTransactionX644e86fe? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * ID of the bank account or card the payout is sent to.
   */
  public val destination: InlinePayoutDestinationXa1b3c2cf? = null,
  /**
   * If the payout fails or cancels, this is the ID of the balance transaction that reverses the initial balance
   * transaction and returns the funds from the failed payout back in your balance.
   */
  public val failureBalanceTransaction: InlinePayoutFailureBalanceTransactionX38dfbc94? = null,
  /**
   * Error code that provides a reason for a payout failure, if available. View our [list of failure
   * codes](https://docs.stripe.com/api#payout_failures).
   */
  public val failureCode: String? = null,
  /**
   * Message that provides the reason for a payout failure, if available.
   */
  public val failureMessage: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * If the payout reverses another, this is the ID of the original payout.
   */
  public val originalPayout: InlinePayoutOriginalPayoutX84c88c4d? = null,
  /**
   * ID of the v2 FinancialAccount the funds are sent to.
   */
  public val payoutMethod: String? = null,
  /**
   * If the payout reverses, this is the ID of the payout that reverses this payout.
   */
  public val reversedBy: InlinePayoutReversedByX25442278? = null,
  /**
   * Extra information about a payout that displays on the user's bank statement.
   */
  public val statementDescriptor: String? = null,
  /**
   * A value that generates from the beneficiary's bank that allows users to track payouts with their bank. Banks might
   * call this a "reference number" or something similar.
   */
  public val traceId: InlinePayoutTraceIdXd4dacdb0? = null,
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

    private var arrivalDateValue: Int? = null

    public var arrivalDate: Int
      get() = requireNotNull(arrivalDateValue) { "arrivalDate is required" }
      set(`value`) {
        arrivalDateValue = value
      }

    private var automaticValue: Boolean? = null

    public var automatic: Boolean
      get() = requireNotNull(automaticValue) { "automatic is required" }
      set(`value`) {
        automaticValue = value
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

    private var methodValue: String? = null

    public var method: String
      get() = requireNotNull(methodValue) { "method is required" }
      set(`value`) {
        methodValue = value
      }

    private var objectValueValue: InlinePayoutObjectValueXe5591f79? = null

    public var objectValue: InlinePayoutObjectValueXe5591f79
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var reconciliationStatusValue: InlinePayoutReconciliationStatusX2b08164f? = null

    public var reconciliationStatus: InlinePayoutReconciliationStatusX2b08164f
      get() = requireNotNull(reconciliationStatusValue) { "reconciliationStatus is required" }
      set(`value`) {
        reconciliationStatusValue = value
      }

    private var sourceTypeValue: String? = null

    public var sourceType: String
      get() = requireNotNull(sourceTypeValue) { "sourceType is required" }
      set(`value`) {
        sourceTypeValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlinePayoutTypeX1e2cc1d0? = null

    public var type: InlinePayoutTypeX1e2cc1d0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The application fee (if any) for the payout. [See the Connect
     * documentation](https://docs.stripe.com/connect/instant-payouts#monetization-and-fees) for details.
     */
    public var applicationFee: InlinePayoutApplicationFeeX54ffd315? = null

    /**
     * The amount of the application fee (if any) requested for the payout. [See the Connect
     * documentation](https://docs.stripe.com/connect/instant-payouts#monetization-and-fees) for details.
     */
    public var applicationFeeAmount: Int? = null

    /**
     * ID of the balance transaction that describes the impact of this payout on your account balance.
     */
    public var balanceTransaction: InlinePayoutBalanceTransactionX644e86fe? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * ID of the bank account or card the payout is sent to.
     */
    public var destination: InlinePayoutDestinationXa1b3c2cf? = null

    /**
     * If the payout fails or cancels, this is the ID of the balance transaction that reverses the initial balance
     * transaction and returns the funds from the failed payout back in your balance.
     */
    public var failureBalanceTransaction: InlinePayoutFailureBalanceTransactionX38dfbc94? = null

    /**
     * Error code that provides a reason for a payout failure, if available. View our [list of failure
     * codes](https://docs.stripe.com/api#payout_failures).
     */
    public var failureCode: String? = null

    /**
     * Message that provides the reason for a payout failure, if available.
     */
    public var failureMessage: String? = null

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
     * If the payout reverses another, this is the ID of the original payout.
     */
    public var originalPayout: InlinePayoutOriginalPayoutX84c88c4d? = null

    /**
     * ID of the v2 FinancialAccount the funds are sent to.
     */
    public var payoutMethod: String? = null

    /**
     * If the payout reverses, this is the ID of the payout that reverses this payout.
     */
    public var reversedBy: InlinePayoutReversedByX25442278? = null

    /**
     * Extra information about a payout that displays on the user's bank statement.
     */
    public var statementDescriptor: String? = null

    /**
     * A value that generates from the beneficiary's bank that allows users to track payouts with their bank. Banks
     * might call this a "reference number" or something similar.
     */
    public var traceId: InlinePayoutTraceIdXd4dacdb0? = null

    public fun build(): Payout {
      check(amountValue != null) { "amount is required" }
      check(arrivalDateValue != null) { "arrivalDate is required" }
      check(automaticValue != null) { "automatic is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(methodValue != null) { "method is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(reconciliationStatusValue != null) { "reconciliationStatus is required" }
      check(sourceTypeValue != null) { "sourceType is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return Payout(
        amount = amount,
        arrivalDate = arrivalDate,
        automatic = automatic,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        method = method,
        objectValue = objectValue,
        reconciliationStatus = reconciliationStatus,
        sourceType = sourceType,
        status = status,
        type = type,
        applicationFee = applicationFee,
        applicationFeeAmount = applicationFeeAmount,
        balanceTransaction = balanceTransaction,
        description = description,
        destination = destination,
        failureBalanceTransaction = failureBalanceTransaction,
        failureCode = failureCode,
        failureMessage = failureMessage,
        metadata = metadata,
        originalPayout = originalPayout,
        payoutMethod = payoutMethod,
        reversedBy = reversedBy,
        statementDescriptor = statementDescriptor,
        traceId = traceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Payout = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Payout> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Payout {
      val jsonDecoder = decoder.requireJsonDecoder("Payout")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Payout must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val arrivalDate = json.decodeRequired<Int>(rawObject, "arrival_date")
      val automatic = json.decodeRequired<Boolean>(rawObject, "automatic")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val method = json.decodeRequired<String>(rawObject, "method")
      val objectValue = json.decodeRequired<InlinePayoutObjectValueXe5591f79>(rawObject, "object")
      val reconciliationStatus = json.decodeRequired<InlinePayoutReconciliationStatusX2b08164f>(rawObject, "reconciliation_status")
      val sourceType = json.decodeRequired<String>(rawObject, "source_type")
      val status = json.decodeRequired<String>(rawObject, "status")
      val type = json.decodeRequired<InlinePayoutTypeX1e2cc1d0>(rawObject, "type")
      return Payout(
        amount = amount,
        arrivalDate = arrivalDate,
        automatic = automatic,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        method = method,
        objectValue = objectValue,
        reconciliationStatus = reconciliationStatus,
        sourceType = sourceType,
        status = status,
        type = type,
        applicationFee = rawObject["application_fee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutApplicationFeeX54ffd315?>(element) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutBalanceTransactionX644e86fe?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        destination = rawObject["destination"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutDestinationXa1b3c2cf?>(element) },
        failureBalanceTransaction = rawObject["failure_balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutFailureBalanceTransactionX38dfbc94?>(element) },
        failureCode = rawObject["failure_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        failureMessage = rawObject["failure_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        originalPayout = rawObject["original_payout"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutOriginalPayoutX84c88c4d?>(element) },
        payoutMethod = rawObject["payout_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reversedBy = rawObject["reversed_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutReversedByX25442278?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        traceId = rawObject["trace_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePayoutTraceIdXd4dacdb0?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Payout) {
      val jsonEncoder = encoder.requireJsonEncoder("Payout")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("arrival_date", json.encodeToJsonElement(value.arrivalDate))
        put("automatic", json.encodeToJsonElement(value.automatic))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("method", value.method)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("reconciliation_status", json.encodeToJsonElement(value.reconciliationStatus))
        put("source_type", value.sourceType)
        put("status", value.status)
        put("type", json.encodeToJsonElement(value.type))
        value.applicationFee?.let { put("application_fee", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.destination?.let { put("destination", json.encodeToJsonElement(it)) }
        value.failureBalanceTransaction?.let { put("failure_balance_transaction", json.encodeToJsonElement(it)) }
        value.failureCode?.let { put("failure_code", it) }
        value.failureMessage?.let { put("failure_message", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.originalPayout?.let { put("original_payout", json.encodeToJsonElement(it)) }
        value.payoutMethod?.let { put("payout_method", it) }
        value.reversedBy?.let { put("reversed_by", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.traceId?.let { put("trace_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun payout(block: Payout.Builder.() -> Unit): Payout = Payout.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Payout is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

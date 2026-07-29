package com.nabobery.sdkgen.generated.stripe

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
public data class RefundView internal constructor(
  public val amount: Int,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlineRefundBalanceTransactionX2601d96f? = null,
  public val charge: InlineRefundChargeX53a8a3db? = null,
  public val created: Int,
  public val currency: String,
  public val description: String? = null,
  @SerialName("destination_details")
  public val destinationDetails: RefundDestinationDetails? = null,
  @SerialName("failure_balance_transaction")
  public val failureBalanceTransaction: InlineRefundFailureBalanceTransactionX88292ff3? = null,
  @SerialName("failure_reason")
  public val failureReason: String? = null,
  public val id: String,
  @SerialName("instructions_email")
  public val instructionsEmail: String? = null,
  public val metadata: Map<String, String>? = null,
  @SerialName("next_action")
  public val nextAction: RefundNextAction? = null,
  @SerialName("object")
  public val objectValue: InlineRefundObjectValueX88f924f8,
  @SerialName("payment_intent")
  public val paymentIntent: InlineRefundPaymentIntentX781629cd? = null,
  @SerialName("pending_reason")
  public val pendingReason: InlineRefundPendingReasonX2f7bc196? = null,
  @SerialName("presentment_details")
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  public val reason: InlineRefundReasonXe77231eb? = null,
  @SerialName("receipt_number")
  public val receiptNumber: String? = null,
  @SerialName("source_transfer_reversal")
  public val sourceTransferReversal: InlineRefundSourceTransferReversalX9b844182? = null,
  public val status: String? = null,
  @SerialName("transfer_reversal")
  public val transferReversal: InlineRefundTransferReversalX400a6508? = null,
)

/**
 * Refund objects allow you to refund a previously created charge that isn't
 * refunded yet. Funds are refunded to the credit or debit card that's
 * initially charged.
 *
 * Related guide: [Refunds](https://docs.stripe.com/refunds)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund
 */
@Serializable(with = Refund.Serializer::class)
public class Refund(
  /**
   * Amount, in cents (or local equivalent).
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
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineRefundObjectValueX88f924f8,
  /**
   * Balance transaction that describes the impact on your account balance.
   */
  public val balanceTransaction: InlineRefundBalanceTransactionX2601d96f? = null,
  /**
   * ID of the charge that's refunded.
   */
  public val charge: InlineRefundChargeX53a8a3db? = null,
  /**
   * An arbitrary string attached to the object. You can use this for displaying to users (available on non-card refunds
   * only).
   */
  public val description: String? = null,
  public val destinationDetails: RefundDestinationDetails? = null,
  /**
   * After the refund fails, this balance transaction describes the adjustment made on your account balance that
   * reverses the initial balance transaction.
   */
  public val failureBalanceTransaction: InlineRefundFailureBalanceTransactionX88292ff3? = null,
  /**
   * Provides the reason for the refund failure. Possible values are: `lost_or_stolen_card`, `expired_or_canceled_card`,
   * `charge_for_pending_refund_disputed`, `insufficient_funds`, `declined`, `merchant_request`, or `unknown`.
   */
  public val failureReason: String? = null,
  /**
   * For payment methods without native refund support (for example, Konbini, PromptPay), provide an email address for
   * the customer to receive refund instructions.
   */
  public val instructionsEmail: String? = null,
  metadata: Map<String, String>? = null,
  public val nextAction: RefundNextAction? = null,
  /**
   * ID of the PaymentIntent that's refunded.
   */
  public val paymentIntent: InlineRefundPaymentIntentX781629cd? = null,
  /**
   * Provides the reason for why the refund is pending. Possible values are: `processing`, `insufficient_funds`, or
   * `charge_pending`.
   */
  public val pendingReason: InlineRefundPendingReasonX2f7bc196? = null,
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  /**
   * Reason for the refund, which is either user-provided (`duplicate`, `fraudulent`, or `requested_by_customer`) or
   * generated by Stripe internally (`expired_uncaptured_charge`).
   */
  public val reason: InlineRefundReasonXe77231eb? = null,
  /**
   * This is the transaction number that appears on email receipts sent for this refund.
   */
  public val receiptNumber: String? = null,
  /**
   * The transfer reversal that's associated with the refund. Only present if the charge came from another Stripe
   * account.
   */
  public val sourceTransferReversal: InlineRefundSourceTransferReversalX9b844182? = null,
  /**
   * Status of the refund. This can be `pending`, `requires_action`, `succeeded`, `failed`, or `canceled`. Learn more
   * about [failed refunds](https://docs.stripe.com/refunds#failed-refunds).
   */
  public val status: String? = null,
  /**
   * This refers to the transfer reversal object if the accompanying transfer reverses. This is only applicable if the
   * charge was created using the destination parameter.
   */
  public val transferReversal: InlineRefundTransferReversalX400a6508? = null,
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

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineRefundObjectValueX88f924f8? = null

    public var objectValue: InlineRefundObjectValueX88f924f8
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Balance transaction that describes the impact on your account balance.
     */
    public var balanceTransaction: InlineRefundBalanceTransactionX2601d96f? = null

    /**
     * ID of the charge that's refunded.
     */
    public var charge: InlineRefundChargeX53a8a3db? = null

    /**
     * An arbitrary string attached to the object. You can use this for displaying to users (available on non-card
     * refunds only).
     */
    public var description: String? = null

    public var destinationDetails: RefundDestinationDetails? = null

    /**
     * After the refund fails, this balance transaction describes the adjustment made on your account balance that
     * reverses the initial balance transaction.
     */
    public var failureBalanceTransaction: InlineRefundFailureBalanceTransactionX88292ff3? = null

    /**
     * Provides the reason for the refund failure. Possible values are: `lost_or_stolen_card`,
     * `expired_or_canceled_card`, `charge_for_pending_refund_disputed`, `insufficient_funds`, `declined`,
     * `merchant_request`, or `unknown`.
     */
    public var failureReason: String? = null

    /**
     * For payment methods without native refund support (for example, Konbini, PromptPay), provide an email address for
     * the customer to receive refund instructions.
     */
    public var instructionsEmail: String? = null

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

    public var nextAction: RefundNextAction? = null

    /**
     * ID of the PaymentIntent that's refunded.
     */
    public var paymentIntent: InlineRefundPaymentIntentX781629cd? = null

    /**
     * Provides the reason for why the refund is pending. Possible values are: `processing`, `insufficient_funds`, or
     * `charge_pending`.
     */
    public var pendingReason: InlineRefundPendingReasonX2f7bc196? = null

    public var presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null

    /**
     * Reason for the refund, which is either user-provided (`duplicate`, `fraudulent`, or `requested_by_customer`) or
     * generated by Stripe internally (`expired_uncaptured_charge`).
     */
    public var reason: InlineRefundReasonXe77231eb? = null

    /**
     * This is the transaction number that appears on email receipts sent for this refund.
     */
    public var receiptNumber: String? = null

    /**
     * The transfer reversal that's associated with the refund. Only present if the charge came from another Stripe
     * account.
     */
    public var sourceTransferReversal: InlineRefundSourceTransferReversalX9b844182? = null

    /**
     * Status of the refund. This can be `pending`, `requires_action`, `succeeded`, `failed`, or `canceled`. Learn more
     * about [failed refunds](https://docs.stripe.com/refunds#failed-refunds).
     */
    public var status: String? = null

    /**
     * This refers to the transfer reversal object if the accompanying transfer reverses. This is only applicable if the
     * charge was created using the destination parameter.
     */
    public var transferReversal: InlineRefundTransferReversalX400a6508? = null

    public fun build(): Refund {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return Refund(
        amount = amount,
        created = created,
        currency = currency,
        id = id,
        objectValue = objectValue,
        balanceTransaction = balanceTransaction,
        charge = charge,
        description = description,
        destinationDetails = destinationDetails,
        failureBalanceTransaction = failureBalanceTransaction,
        failureReason = failureReason,
        instructionsEmail = instructionsEmail,
        metadata = metadata,
        nextAction = nextAction,
        paymentIntent = paymentIntent,
        pendingReason = pendingReason,
        presentmentDetails = presentmentDetails,
        reason = reason,
        receiptNumber = receiptNumber,
        sourceTransferReversal = sourceTransferReversal,
        status = status,
        transferReversal = transferReversal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Refund = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Refund> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Refund {
      val jsonDecoder = decoder.requireJsonDecoder("Refund")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Refund must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineRefundObjectValueX88f924f8>(rawObject, "object")
      return Refund(
        amount = amount,
        created = created,
        currency = currency,
        id = id,
        objectValue = objectValue,
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRefundBalanceTransactionX2601d96f?>(element) },
        charge = rawObject["charge"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRefundChargeX53a8a3db?>(element) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        destinationDetails = rawObject["destination_details"]?.let { json.decodeFromJsonElement<RefundDestinationDetails>(it) },
        failureBalanceTransaction = rawObject["failure_balance_transaction"]?.let { json.decodeFromJsonElement<InlineRefundFailureBalanceTransactionX88292ff3>(it) },
        failureReason = rawObject["failure_reason"]?.let { json.decodeFromJsonElement<String>(it) },
        instructionsEmail = rawObject["instructions_email"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        nextAction = rawObject["next_action"]?.let { json.decodeFromJsonElement<RefundNextAction>(it) },
        paymentIntent = rawObject["payment_intent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRefundPaymentIntentX781629cd?>(element) },
        pendingReason = rawObject["pending_reason"]?.let { json.decodeFromJsonElement<InlineRefundPendingReasonX2f7bc196>(it) },
        presentmentDetails = rawObject["presentment_details"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentIntentPresentmentDetails>(it) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRefundReasonXe77231eb?>(element) },
        receiptNumber = rawObject["receipt_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sourceTransferReversal = rawObject["source_transfer_reversal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRefundSourceTransferReversalX9b844182?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transferReversal = rawObject["transfer_reversal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRefundTransferReversalX400a6508?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Refund) {
      val jsonEncoder = encoder.requireJsonEncoder("Refund")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.charge?.let { put("charge", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.destinationDetails?.let { put("destination_details", json.encodeToJsonElement(it)) }
        value.failureBalanceTransaction?.let { put("failure_balance_transaction", json.encodeToJsonElement(it)) }
        value.failureReason?.let { put("failure_reason", it) }
        value.instructionsEmail?.let { put("instructions_email", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nextAction?.let { put("next_action", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
        value.pendingReason?.let { put("pending_reason", json.encodeToJsonElement(it)) }
        value.presentmentDetails?.let { put("presentment_details", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.receiptNumber?.let { put("receipt_number", it) }
        value.sourceTransferReversal?.let { put("source_transfer_reversal", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", it) }
        value.transferReversal?.let { put("transfer_reversal", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refund(block: Refund.Builder.() -> Unit): Refund = Refund.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Refund is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
public data class ChargeView internal constructor(
  public val amount: Int,
  @SerialName("amount_captured")
  public val amountCaptured: Int,
  @SerialName("amount_refunded")
  public val amountRefunded: Int,
  public val application: InlineChargeApplicationX08556321? = null,
  @SerialName("application_fee")
  public val applicationFee: InlineChargeApplicationFeeX9fc79449? = null,
  @SerialName("application_fee_amount")
  public val applicationFeeAmount: Int? = null,
  @SerialName("balance_transaction")
  public val balanceTransaction: InlineChargeBalanceTransactionX1a715a0c? = null,
  @SerialName("billing_details")
  public val billingDetails: BillingDetails,
  @SerialName("calculated_statement_descriptor")
  public val calculatedStatementDescriptor: String? = null,
  public val captured: Boolean,
  public val created: Int,
  public val currency: String,
  public val customer: InlineChargeCustomerXaca36065? = null,
  public val description: String? = null,
  public val disputed: Boolean,
  @SerialName("failure_balance_transaction")
  public val failureBalanceTransaction: InlineChargeFailureBalanceTransactionXac287bb7? = null,
  @SerialName("failure_code")
  public val failureCode: String? = null,
  @SerialName("failure_message")
  public val failureMessage: String? = null,
  @SerialName("fraud_details")
  public val fraudDetails: InlineChargeFraudDetailsX7b862bff? = null,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  @SerialName("object")
  public val objectValue: InlineChargeObjectValueX4f045e0d,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlineChargeOnBehalfOfXa14b2bb1? = null,
  public val outcome: InlineChargeOutcomeXd5852e19? = null,
  public val paid: Boolean,
  @SerialName("payment_intent")
  public val paymentIntent: InlineChargePaymentIntentX8b049512? = null,
  @SerialName("payment_method")
  public val paymentMethod: String? = null,
  @SerialName("payment_method_details")
  public val paymentMethodDetails: InlineChargePaymentMethodDetailsXaabd978e? = null,
  @SerialName("presentment_details")
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  @SerialName("radar_options")
  public val radarOptions: RadarRadarOptions? = null,
  @SerialName("receipt_email")
  public val receiptEmail: String? = null,
  @SerialName("receipt_number")
  public val receiptNumber: String? = null,
  @SerialName("receipt_url")
  public val receiptUrl: String? = null,
  public val refunded: Boolean,
  public val refunds: InlineChargeRefundsX8d7dd526? = null,
  public val review: InlineChargeReviewXd3d4b3a3? = null,
  public val shipping: InlineChargeShippingX04f101e2? = null,
  @SerialName("source_transfer")
  public val sourceTransfer: InlineChargeSourceTransferX8ea76f8f? = null,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  @SerialName("statement_descriptor_suffix")
  public val statementDescriptorSuffix: String? = null,
  public val status: InlineChargeStatusXbcbc93cd,
  public val transfer: InlineChargeTransferX1843c71d? = null,
  @SerialName("transfer_data")
  public val transferData: InlineChargeTransferDataX5f87055e? = null,
  @SerialName("transfer_group")
  public val transferGroup: String? = null,
)

/**
 * The `Charge` object represents a single attempt to move money into your Stripe account.
 * PaymentIntent confirmation is the most common way to create Charges, but [Account
 * Debits](https://docs.stripe.com/connect/account-debits) may also create Charges.
 * Some legacy payment flows create Charges directly, which is not recommended for new integrations.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge
 */
@Serializable(with = Charge.Serializer::class)
public class Charge(
  /**
   * Amount intended to be collected by this payment. A positive integer representing how much to charge in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
   * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
   * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
   * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  public val amount: Int,
  /**
   * Amount in cents (or local equivalent) captured (can be less than the amount attribute on the charge if a partial
   * capture was made).
   */
  public val amountCaptured: Int,
  /**
   * Amount in cents (or local equivalent) refunded (can be less than the amount attribute on the charge if a partial
   * refund was issued).
   */
  public val amountRefunded: Int,
  public val billingDetails: BillingDetails,
  /**
   * If the charge was created without capturing, this Boolean represents whether it is still uncaptured or has since
   * been captured.
   */
  public val captured: Boolean,
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
   * Whether the charge has been disputed.
   */
  public val disputed: Boolean,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineChargeObjectValueX4f045e0d,
  /**
   * `true` if the charge succeeded, or was successfully authorized for later capture.
   */
  public val paid: Boolean,
  /**
   * Whether the charge has been fully refunded. If the charge is only partially refunded, this attribute will still be
   * false.
   */
  public val refunded: Boolean,
  /**
   * The status of the payment is either `succeeded`, `pending`, or `failed`.
   */
  public val status: InlineChargeStatusXbcbc93cd,
  /**
   * ID of the Connect application that created the charge.
   */
  public val application: InlineChargeApplicationX08556321? = null,
  /**
   * The application fee (if any) for the charge. [See the Connect
   * documentation](https://docs.stripe.com/connect/direct-charges#collect-fees) for details.
   */
  public val applicationFee: InlineChargeApplicationFeeX9fc79449? = null,
  /**
   * The amount of the application fee (if any) requested for the charge. [See the Connect
   * documentation](https://docs.stripe.com/connect/direct-charges#collect-fees) for details.
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * ID of the balance transaction that describes the impact of this charge on your account balance (not including
   * refunds or disputes).
   */
  public val balanceTransaction: InlineChargeBalanceTransactionX1a715a0c? = null,
  /**
   * The full statement descriptor that is passed to card networks, and that is displayed on your customers' credit card
   * and bank statements. Allows you to see what the statement descriptor looks like after the static and dynamic
   * portions are combined. This value only exists for card payments.
   */
  public val calculatedStatementDescriptor: String? = null,
  /**
   * ID of the customer this charge is for if one exists.
   */
  public val customer: InlineChargeCustomerXaca36065? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * ID of the balance transaction that describes the reversal of the balance on your account due to payment failure.
   */
  public val failureBalanceTransaction: InlineChargeFailureBalanceTransactionXac287bb7? = null,
  /**
   * Error code explaining reason for charge failure if available (see [the errors
   * section](https://docs.stripe.com/error-codes) for a list of codes).
   */
  public val failureCode: String? = null,
  /**
   * Message to user further explaining reason for charge failure if available.
   */
  public val failureMessage: String? = null,
  /**
   * Information on fraud assessments for the charge.
   */
  public val fraudDetails: InlineChargeFraudDetailsX7b862bff? = null,
  /**
   * The account (if any) the charge was made on behalf of without triggering an automatic transfer. See the [Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers) for details.
   */
  public val onBehalfOf: InlineChargeOnBehalfOfXa14b2bb1? = null,
  /**
   * Details about whether the payment was accepted, and why. See [understanding
   * declines](https://docs.stripe.com/declines) for details.
   */
  public val outcome: InlineChargeOutcomeXd5852e19? = null,
  /**
   * ID of the PaymentIntent associated with this charge, if one exists.
   */
  public val paymentIntent: InlineChargePaymentIntentX8b049512? = null,
  /**
   * ID of the payment method used in this charge.
   */
  public val paymentMethod: String? = null,
  /**
   * Details about the payment method at the time of the transaction.
   */
  public val paymentMethodDetails: InlineChargePaymentMethodDetailsXaabd978e? = null,
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  public val radarOptions: RadarRadarOptions? = null,
  /**
   * This is the email address that the receipt for this charge was sent to.
   */
  public val receiptEmail: String? = null,
  /**
   * This is the transaction number that appears on email receipts sent for this charge. This attribute will be `null`
   * until a receipt has been sent.
   */
  public val receiptNumber: String? = null,
  /**
   * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the latest state of the
   * charge, including any refunds. If the charge is for an Invoice, the receipt will be stylized as an Invoice receipt.
   */
  public val receiptUrl: String? = null,
  /**
   * A list of refunds that have been applied to the charge.
   */
  public val refunds: InlineChargeRefundsX8d7dd526? = null,
  /**
   * ID of the review associated with this charge if one exists.
   */
  public val review: InlineChargeReviewXd3d4b3a3? = null,
  /**
   * Shipping information for the charge.
   */
  public val shipping: InlineChargeShippingX04f101e2? = null,
  /**
   * The transfer ID which created this charge. Only present if the charge came from another Stripe account. [See the
   * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
   */
  public val sourceTransfer: InlineChargeSourceTransferX8ea76f8f? = null,
  /**
   * For a non-card charge, text that appears on the customer's statement as the statement descriptor. This value
   * overrides the account's default statement descriptor. For information about requirements, including the
   * 22-character limit, see [the Statement Descriptor
   * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
   *
   * For a card charge, this value is ignored unless you don't specify a `statement_descriptor_suffix`, in which case
   * this value is used as the suffix.
   */
  public val statementDescriptor: String? = null,
  /**
   * Provides information about a card charge. Concatenated to the account's [statement descriptor
   * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
   * descriptor that appears on the customer's statement. If the account has no prefix value, the suffix is concatenated
   * to the account's statement descriptor.
   */
  public val statementDescriptorSuffix: String? = null,
  /**
   * ID of the transfer to the `destination` account (only applicable if the charge was created using the `destination`
   * parameter).
   */
  public val transfer: InlineChargeTransferX1843c71d? = null,
  /**
   * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the
   * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
   */
  public val transferData: InlineChargeTransferDataX5f87055e? = null,
  /**
   * A string that identifies this transaction as part of a group. See the [Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
   */
  public val transferGroup: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountCapturedValue: Int? = null

    public var amountCaptured: Int
      get() = requireNotNull(amountCapturedValue) { "amountCaptured is required" }
      set(`value`) {
        amountCapturedValue = value
      }

    private var amountRefundedValue: Int? = null

    public var amountRefunded: Int
      get() = requireNotNull(amountRefundedValue) { "amountRefunded is required" }
      set(`value`) {
        amountRefundedValue = value
      }

    private var billingDetailsValue: BillingDetails? = null

    public var billingDetails: BillingDetails
      get() = requireNotNull(billingDetailsValue) { "billingDetails is required" }
      set(`value`) {
        billingDetailsValue = value
      }

    private var capturedValue: Boolean? = null

    public var captured: Boolean
      get() = requireNotNull(capturedValue) { "captured is required" }
      set(`value`) {
        capturedValue = value
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

    private var disputedValue: Boolean? = null

    public var disputed: Boolean
      get() = requireNotNull(disputedValue) { "disputed is required" }
      set(`value`) {
        disputedValue = value
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

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineChargeObjectValueX4f045e0d? = null

    public var objectValue: InlineChargeObjectValueX4f045e0d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paidValue: Boolean? = null

    public var paid: Boolean
      get() = requireNotNull(paidValue) { "paid is required" }
      set(`value`) {
        paidValue = value
      }

    private var refundedValue: Boolean? = null

    public var refunded: Boolean
      get() = requireNotNull(refundedValue) { "refunded is required" }
      set(`value`) {
        refundedValue = value
      }

    private var statusValue: InlineChargeStatusXbcbc93cd? = null

    public var status: InlineChargeStatusXbcbc93cd
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * ID of the Connect application that created the charge.
     */
    public var application: InlineChargeApplicationX08556321? = null

    /**
     * The application fee (if any) for the charge. [See the Connect
     * documentation](https://docs.stripe.com/connect/direct-charges#collect-fees) for details.
     */
    public var applicationFee: InlineChargeApplicationFeeX9fc79449? = null

    /**
     * The amount of the application fee (if any) requested for the charge. [See the Connect
     * documentation](https://docs.stripe.com/connect/direct-charges#collect-fees) for details.
     */
    public var applicationFeeAmount: Int? = null

    /**
     * ID of the balance transaction that describes the impact of this charge on your account balance (not including
     * refunds or disputes).
     */
    public var balanceTransaction: InlineChargeBalanceTransactionX1a715a0c? = null

    /**
     * The full statement descriptor that is passed to card networks, and that is displayed on your customers' credit
     * card and bank statements. Allows you to see what the statement descriptor looks like after the static and dynamic
     * portions are combined. This value only exists for card payments.
     */
    public var calculatedStatementDescriptor: String? = null

    /**
     * ID of the customer this charge is for if one exists.
     */
    public var customer: InlineChargeCustomerXaca36065? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * ID of the balance transaction that describes the reversal of the balance on your account due to payment failure.
     */
    public var failureBalanceTransaction: InlineChargeFailureBalanceTransactionXac287bb7? = null

    /**
     * Error code explaining reason for charge failure if available (see [the errors
     * section](https://docs.stripe.com/error-codes) for a list of codes).
     */
    public var failureCode: String? = null

    /**
     * Message to user further explaining reason for charge failure if available.
     */
    public var failureMessage: String? = null

    /**
     * Information on fraud assessments for the charge.
     */
    public var fraudDetails: InlineChargeFraudDetailsX7b862bff? = null

    /**
     * The account (if any) the charge was made on behalf of without triggering an automatic transfer. See the [Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers) for details.
     */
    public var onBehalfOf: InlineChargeOnBehalfOfXa14b2bb1? = null

    /**
     * Details about whether the payment was accepted, and why. See [understanding
     * declines](https://docs.stripe.com/declines) for details.
     */
    public var outcome: InlineChargeOutcomeXd5852e19? = null

    /**
     * ID of the PaymentIntent associated with this charge, if one exists.
     */
    public var paymentIntent: InlineChargePaymentIntentX8b049512? = null

    /**
     * ID of the payment method used in this charge.
     */
    public var paymentMethod: String? = null

    /**
     * Details about the payment method at the time of the transaction.
     */
    public var paymentMethodDetails: InlineChargePaymentMethodDetailsXaabd978e? = null

    public var presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null

    public var radarOptions: RadarRadarOptions? = null

    /**
     * This is the email address that the receipt for this charge was sent to.
     */
    public var receiptEmail: String? = null

    /**
     * This is the transaction number that appears on email receipts sent for this charge. This attribute will be `null`
     * until a receipt has been sent.
     */
    public var receiptNumber: String? = null

    /**
     * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the latest state of the
     * charge, including any refunds. If the charge is for an Invoice, the receipt will be stylized as an Invoice
     * receipt.
     */
    public var receiptUrl: String? = null

    /**
     * A list of refunds that have been applied to the charge.
     */
    public var refunds: InlineChargeRefundsX8d7dd526? = null

    /**
     * ID of the review associated with this charge if one exists.
     */
    public var review: InlineChargeReviewXd3d4b3a3? = null

    /**
     * Shipping information for the charge.
     */
    public var shipping: InlineChargeShippingX04f101e2? = null

    /**
     * The transfer ID which created this charge. Only present if the charge came from another Stripe account. [See the
     * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
     */
    public var sourceTransfer: InlineChargeSourceTransferX8ea76f8f? = null

    /**
     * For a non-card charge, text that appears on the customer's statement as the statement descriptor. This value
     * overrides the account's default statement descriptor. For information about requirements, including the
     * 22-character limit, see [the Statement Descriptor
     * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
     *
     * For a card charge, this value is ignored unless you don't specify a `statement_descriptor_suffix`, in which case
     * this value is used as the suffix.
     */
    public var statementDescriptor: String? = null

    /**
     * Provides information about a card charge. Concatenated to the account's [statement descriptor
     * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
     * descriptor that appears on the customer's statement. If the account has no prefix value, the suffix is
     * concatenated to the account's statement descriptor.
     */
    public var statementDescriptorSuffix: String? = null

    /**
     * ID of the transfer to the `destination` account (only applicable if the charge was created using the
     * `destination` parameter).
     */
    public var transfer: InlineChargeTransferX1843c71d? = null

    /**
     * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See
     * the Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
     */
    public var transferData: InlineChargeTransferDataX5f87055e? = null

    /**
     * A string that identifies this transaction as part of a group. See the [Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
     */
    public var transferGroup: String? = null

    public fun build(): Charge {
      check(amountValue != null) { "amount is required" }
      check(amountCapturedValue != null) { "amountCaptured is required" }
      check(amountRefundedValue != null) { "amountRefunded is required" }
      check(billingDetailsValue != null) { "billingDetails is required" }
      check(capturedValue != null) { "captured is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(disputedValue != null) { "disputed is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paidValue != null) { "paid is required" }
      check(refundedValue != null) { "refunded is required" }
      check(statusValue != null) { "status is required" }
      return Charge(
        amount = amount,
        amountCaptured = amountCaptured,
        amountRefunded = amountRefunded,
        billingDetails = billingDetails,
        captured = captured,
        created = created,
        currency = currency,
        disputed = disputed,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        paid = paid,
        refunded = refunded,
        status = status,
        application = application,
        applicationFee = applicationFee,
        applicationFeeAmount = applicationFeeAmount,
        balanceTransaction = balanceTransaction,
        calculatedStatementDescriptor = calculatedStatementDescriptor,
        customer = customer,
        description = description,
        failureBalanceTransaction = failureBalanceTransaction,
        failureCode = failureCode,
        failureMessage = failureMessage,
        fraudDetails = fraudDetails,
        onBehalfOf = onBehalfOf,
        outcome = outcome,
        paymentIntent = paymentIntent,
        paymentMethod = paymentMethod,
        paymentMethodDetails = paymentMethodDetails,
        presentmentDetails = presentmentDetails,
        radarOptions = radarOptions,
        receiptEmail = receiptEmail,
        receiptNumber = receiptNumber,
        receiptUrl = receiptUrl,
        refunds = refunds,
        review = review,
        shipping = shipping,
        sourceTransfer = sourceTransfer,
        statementDescriptor = statementDescriptor,
        statementDescriptorSuffix = statementDescriptorSuffix,
        transfer = transfer,
        transferData = transferData,
        transferGroup = transferGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Charge = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Charge> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Charge {
      val jsonDecoder = decoder.requireJsonDecoder("Charge")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Charge must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountCaptured = json.decodeRequired<Int>(rawObject, "amount_captured")
      val amountRefunded = json.decodeRequired<Int>(rawObject, "amount_refunded")
      val billingDetails = json.decodeRequired<BillingDetails>(rawObject, "billing_details")
      val captured = json.decodeRequired<Boolean>(rawObject, "captured")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val disputed = json.decodeRequired<Boolean>(rawObject, "disputed")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineChargeObjectValueX4f045e0d>(rawObject, "object")
      val paid = json.decodeRequired<Boolean>(rawObject, "paid")
      val refunded = json.decodeRequired<Boolean>(rawObject, "refunded")
      val status = json.decodeRequired<InlineChargeStatusXbcbc93cd>(rawObject, "status")
      return Charge(
        amount = amount,
        amountCaptured = amountCaptured,
        amountRefunded = amountRefunded,
        billingDetails = billingDetails,
        captured = captured,
        created = created,
        currency = currency,
        disputed = disputed,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        paid = paid,
        refunded = refunded,
        status = status,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeApplicationX08556321?>(element) },
        applicationFee = rawObject["application_fee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeApplicationFeeX9fc79449?>(element) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        balanceTransaction = rawObject["balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeBalanceTransactionX1a715a0c?>(element) },
        calculatedStatementDescriptor = rawObject["calculated_statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeCustomerXaca36065?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        failureBalanceTransaction = rawObject["failure_balance_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeFailureBalanceTransactionXac287bb7?>(element) },
        failureCode = rawObject["failure_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        failureMessage = rawObject["failure_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fraudDetails = rawObject["fraud_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeFraudDetailsX7b862bff?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeOnBehalfOfXa14b2bb1?>(element) },
        outcome = rawObject["outcome"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeOutcomeXd5852e19?>(element) },
        paymentIntent = rawObject["payment_intent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargePaymentIntentX8b049512?>(element) },
        paymentMethod = rawObject["payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentMethodDetails = rawObject["payment_method_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargePaymentMethodDetailsXaabd978e?>(element) },
        presentmentDetails = rawObject["presentment_details"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentIntentPresentmentDetails>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<RadarRadarOptions>(it) },
        receiptEmail = rawObject["receipt_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        receiptNumber = rawObject["receipt_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        receiptUrl = rawObject["receipt_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refunds = rawObject["refunds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeRefundsX8d7dd526?>(element) },
        review = rawObject["review"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeReviewXd3d4b3a3?>(element) },
        shipping = rawObject["shipping"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeShippingX04f101e2?>(element) },
        sourceTransfer = rawObject["source_transfer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeSourceTransferX8ea76f8f?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transfer = rawObject["transfer"]?.let { json.decodeFromJsonElement<InlineChargeTransferX1843c71d>(it) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeTransferDataX5f87055e?>(element) },
        transferGroup = rawObject["transfer_group"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Charge) {
      val jsonEncoder = encoder.requireJsonEncoder("Charge")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_captured", json.encodeToJsonElement(value.amountCaptured))
        put("amount_refunded", json.encodeToJsonElement(value.amountRefunded))
        put("billing_details", json.encodeToJsonElement(value.billingDetails))
        put("captured", json.encodeToJsonElement(value.captured))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("disputed", json.encodeToJsonElement(value.disputed))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("paid", json.encodeToJsonElement(value.paid))
        put("refunded", json.encodeToJsonElement(value.refunded))
        put("status", json.encodeToJsonElement(value.status))
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.applicationFee?.let { put("application_fee", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
        value.calculatedStatementDescriptor?.let { put("calculated_statement_descriptor", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.failureBalanceTransaction?.let { put("failure_balance_transaction", json.encodeToJsonElement(it)) }
        value.failureCode?.let { put("failure_code", it) }
        value.failureMessage?.let { put("failure_message", it) }
        value.fraudDetails?.let { put("fraud_details", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.outcome?.let { put("outcome", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodDetails?.let { put("payment_method_details", json.encodeToJsonElement(it)) }
        value.presentmentDetails?.let { put("presentment_details", json.encodeToJsonElement(it)) }
        value.radarOptions?.let { put("radar_options", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", it) }
        value.receiptNumber?.let { put("receipt_number", it) }
        value.receiptUrl?.let { put("receipt_url", it) }
        value.refunds?.let { put("refunds", json.encodeToJsonElement(it)) }
        value.review?.let { put("review", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.sourceTransfer?.let { put("source_transfer", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transfer?.let { put("transfer", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun charge(block: Charge.Builder.() -> Unit): Charge = Charge.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Charge is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

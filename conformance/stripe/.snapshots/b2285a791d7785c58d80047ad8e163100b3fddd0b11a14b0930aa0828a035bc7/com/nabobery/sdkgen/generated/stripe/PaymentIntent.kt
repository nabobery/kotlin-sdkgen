package com.nabobery.sdkgen.generated.stripe

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
public data class PaymentIntentView internal constructor(
  public val amount: Int? = null,
  @SerialName("amount_capturable")
  public val amountCapturable: Int? = null,
  @SerialName("amount_details")
  public val amountDetails: InlinePaymentIntentAmountDetailsX0fe9fd24? = null,
  @SerialName("amount_received")
  public val amountReceived: Int? = null,
  public val application: InlinePaymentIntentApplicationX852c1de7? = null,
  @SerialName("application_fee_amount")
  public val applicationFeeAmount: Int? = null,
  @SerialName("automatic_payment_methods")
  public val automaticPaymentMethods: InlinePaymentIntentAutomaticPaymentMethodsX68be6956? = null,
  @SerialName("canceled_at")
  public val canceledAt: Int? = null,
  @SerialName("cancellation_reason")
  public val cancellationReason: InlinePaymentIntentCancellationReasonXa99846ea? = null,
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentIntentCaptureMethodX7c24a00f? = null,
  @SerialName("client_secret")
  public val clientSecret: String? = null,
  @SerialName("confirmation_method")
  public val confirmationMethod: InlinePaymentIntentConfirmationMethodX048d5232? = null,
  public val created: Int,
  public val currency: String? = null,
  public val customer: InlinePaymentIntentCustomerX0992ed81? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val description: String? = null,
  @SerialName("excluded_payment_method_types")
  public val excludedPaymentMethodTypes:
      List<InlinePaymentIntentExcludedPaymentMethodTypesItemX2ad3d6e8>? = null,
  public val hooks: PaymentFlowsPaymentIntentAsyncWorkflows? = null,
  public val id: String,
  @SerialName("last_payment_error")
  public val lastPaymentError: InlinePaymentIntentLastPaymentErrorXae7d80fa? = null,
  @SerialName("latest_charge")
  public val latestCharge: InlinePaymentIntentLatestChargeXddbf3551? = null,
  public val livemode: Boolean,
  @SerialName("managed_payments")
  public val managedPayments: InlinePaymentIntentManagedPaymentsX593f2137? = null,
  public val metadata: Map<String, String>? = null,
  @SerialName("next_action")
  public val nextAction: InlinePaymentIntentNextActionXf46d948f? = null,
  @SerialName("object")
  public val objectValue: InlinePaymentIntentObjectValueX7c59329b,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlinePaymentIntentOnBehalfOfXf11f3a8f? = null,
  @SerialName("payment_details")
  public val paymentDetails: PaymentFlowsPaymentDetails? = null,
  @SerialName("payment_method")
  public val paymentMethod: InlinePaymentIntentPaymentMethodX9670d419? = null,
  @SerialName("payment_method_configuration_details")
  public val paymentMethodConfigurationDetails:
      InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1? = null,
  @SerialName("payment_method_options")
  public val paymentMethodOptions: InlinePaymentIntentPaymentMethodOptionsX8c4198d2? = null,
  @SerialName("payment_method_types")
  public val paymentMethodTypes: List<String>? = null,
  @SerialName("presentment_details")
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  public val processing: InlinePaymentIntentProcessingX5a7361cd? = null,
  @SerialName("receipt_email")
  public val receiptEmail: String? = null,
  public val review: InlinePaymentIntentReviewX626eb3f1? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage: InlinePaymentIntentSetupFutureUsageX44bafcda? = null,
  public val shipping: InlinePaymentIntentShippingXd9b79a0a? = null,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  @SerialName("statement_descriptor_suffix")
  public val statementDescriptorSuffix: String? = null,
  public val status: InlinePaymentIntentStatusX12dfd3e5,
  @SerialName("transfer_data")
  public val transferData: InlinePaymentIntentTransferDataX3979a94c? = null,
  @SerialName("transfer_group")
  public val transferGroup: String? = null,
)

/**
 * A PaymentIntent guides you through the process of collecting a payment from your customer.
 * We recommend that you create exactly one PaymentIntent for each order or
 * customer session in your system. You can reference the PaymentIntent later to
 * see the history of payment attempts for a particular session.
 *
 * A PaymentIntent transitions through
 * [multiple statuses](/payments/paymentintents/lifecycle)
 * throughout its lifetime as it interfaces with Stripe.js to perform
 * authentication flows and ultimately creates at most one successful charge.
 *
 * Related guide: [Payment Intents API](https://docs.stripe.com/payments/payment-intents)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent
 */
@Serializable(with = PaymentIntent.Serializer::class)
public class PaymentIntent(
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
  public val objectValue: InlinePaymentIntentObjectValueX7c59329b,
  /**
   * Status of this PaymentIntent, one of `requires_payment_method`, `requires_confirmation`, `requires_action`,
   * `processing`, `requires_capture`, `canceled`, or `succeeded`. Read more about each PaymentIntent
   * [status](https://docs.stripe.com/payments/intents#intent-statuses).
   */
  public val status: InlinePaymentIntentStatusX12dfd3e5,
  /**
   * Amount intended to be collected by this PaymentIntent. A positive integer representing how much to charge in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
   * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
   * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
   * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  public val amount: Int? = null,
  /**
   * Amount that can be captured from this PaymentIntent.
   */
  public val amountCapturable: Int? = null,
  public val amountDetails: InlinePaymentIntentAmountDetailsX0fe9fd24? = null,
  /**
   * Amount that this PaymentIntent collects.
   */
  public val amountReceived: Int? = null,
  /**
   * ID of the Connect application that created the PaymentIntent.
   */
  public val application: InlinePaymentIntentApplicationX852c1de7? = null,
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
   * amount captured. For more information, see the PaymentIntents [use case for connected
   * accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * Settings to configure compatible payment methods from the [Stripe
   * Dashboard](https://dashboard.stripe.com/settings/payment_methods)
   */
  public val automaticPaymentMethods: InlinePaymentIntentAutomaticPaymentMethodsX68be6956? = null,
  /**
   * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled. Measured in
   * seconds since the Unix epoch.
   */
  public val canceledAt: Int? = null,
  /**
   * Reason for cancellation of this PaymentIntent, either user-provided (`duplicate`, `fraudulent`,
   * `requested_by_customer`, or `abandoned`) or generated by Stripe internally (`failed_invoice`, `void_invoice`,
   * `automatic`, or `expired`).
   */
  public val cancellationReason: InlinePaymentIntentCancellationReasonXa99846ea? = null,
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentIntentCaptureMethodX7c24a00f? = null,
  /**
   * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key.
   *
   * The client secret can be used to complete a payment from your frontend. It should not be stored, logged, or exposed
   * to anyone other than the customer. Make sure that you have TLS enabled on any page that includes the client secret.
   *
   * Refer to our docs to [accept a payment](https://docs.stripe.com/payments/accept-a-payment?ui=elements) and learn
   * about how `client_secret` should be handled.
   */
  public val clientSecret: String? = null,
  /**
   * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer action to confirm the
   * payment.
   */
  public val confirmationMethod: InlinePaymentIntentConfirmationMethodX048d5232? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * ID of the Customer this PaymentIntent belongs to, if one exists.
   *
   * Payment methods attached to other Customers cannot be used with this PaymentIntent.
   *
   * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
   * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Customer after the
   * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
   * `card_present` and isn't a digital wallet, then a
   * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gener
   * ated_card) payment method representing the card is created and attached to the Customer instead.
   */
  public val customer: InlinePaymentIntentCustomerX0992ed81? = null,
  /**
   * ID of the Account representing the customer that this PaymentIntent belongs to, if one exists.
   *
   * Payment methods attached to other Accounts cannot be used with this PaymentIntent.
   *
   * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
   * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Account after the
   * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
   * `card_present` and isn't a digital wallet, then a
   * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gener
   * ated_card) payment method representing the card is created and attached to the Account instead.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  excludedPaymentMethodTypes: List<InlinePaymentIntentExcludedPaymentMethodTypesItemX2ad3d6e8>? = null,
  public val hooks: PaymentFlowsPaymentIntentAsyncWorkflows? = null,
  /**
   * The payment error encountered in the previous PaymentIntent confirmation. It will be cleared if the PaymentIntent
   * is later updated for any reason.
   */
  public val lastPaymentError: InlinePaymentIntentLastPaymentErrorXae7d80fa? = null,
  /**
   * ID of the latest [Charge object](https://docs.stripe.com/api/charges) created by this PaymentIntent. This property
   * is `null` until PaymentIntent confirmation is attempted.
   */
  public val latestCharge: InlinePaymentIntentLatestChargeXddbf3551? = null,
  /**
   * Settings for Managed Payments.
   */
  public val managedPayments: InlinePaymentIntentManagedPaymentsX593f2137? = null,
  metadata: Map<String, String>? = null,
  /**
   * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment
   * using the provided source.
   */
  public val nextAction: InlinePaymentIntentNextActionXf46d948f? = null,
  /**
   * You can specify the settlement merchant as the
   * connected account using the `on_behalf_of` attribute on the charge. See the PaymentIntents [use case for connected
   * accounts](/payments/connected-accounts) for details.
   */
  public val onBehalfOf: InlinePaymentIntentOnBehalfOfXf11f3a8f? = null,
  public val paymentDetails: PaymentFlowsPaymentDetails? = null,
  /**
   * ID of the payment method used in this PaymentIntent.
   */
  public val paymentMethod: InlinePaymentIntentPaymentMethodX9670d419? = null,
  /**
   * Information about the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations)
   * used for this PaymentIntent.
   */
  public val paymentMethodConfigurationDetails:
      InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1? = null,
  /**
   * Payment-method-specific configuration for this PaymentIntent.
   */
  public val paymentMethodOptions: InlinePaymentIntentPaymentMethodOptionsX8c4198d2? = null,
  paymentMethodTypes: List<String>? = null,
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  /**
   * If present, this property tells you about the processing state of the payment.
   */
  public val processing: InlinePaymentIntentProcessingX5a7361cd? = null,
  /**
   * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
   * payment in live mode, a receipt will be sent regardless of your [email
   * settings](https://dashboard.stripe.com/account/emails).
   */
  public val receiptEmail: String? = null,
  /**
   * ID of the review associated with this PaymentIntent, if any.
   */
  public val review: InlinePaymentIntentReviewX626eb3f1? = null,
  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
   * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
   * completes any required actions. If you don't provide a Customer, you can still
   * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
   *
   * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
   * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
   * method representing the card to the Customer instead.
   *
   * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
   * network rules, such as [SCA](/strong-customer-authentication).
   */
  public val setupFutureUsage: InlinePaymentIntentSetupFutureUsageX44bafcda? = null,
  /**
   * Shipping information for this PaymentIntent.
   */
  public val shipping: InlinePaymentIntentShippingXd9b79a0a? = null,
  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card charge. This value
   * overrides the account's default statement descriptor. For information about requirements, including the
   * 22-character limit, see [the Statement Descriptor
   * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
   *
   * Setting this value for a card charge returns an error. For card charges, set the
   * [statement_descriptor_suffix](https://docs.stripe.com/get-started/account/statement-descriptors#dynamic) instead.
   */
  public val statementDescriptor: String? = null,
  /**
   * Provides information about a card charge. Concatenated to the account's [statement descriptor
   * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
   * descriptor that appears on the customer's statement.
   */
  public val statementDescriptorSuffix: String? = null,
  /**
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about the [use case for
   * connected accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val transferData: InlinePaymentIntentTransferDataX3979a94c? = null,
  /**
   * A string that identifies the resulting payment as part of a group. Learn more about the [use case for connected
   * accounts](https://docs.stripe.com/connect/separate-charges-and-transfers).
   */
  public val transferGroup: String? = null,
) {
  /**
   * The list of payment method types to exclude from use with this payment.
   */
  public val excludedPaymentMethodTypes:
      List<InlinePaymentIntentExcludedPaymentMethodTypesItemX2ad3d6e8>? =
      excludedPaymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Learn more about [storing information
   * in
   * metadata](https://docs.stripe.com/payments/payment-intents/creating-payment-intents#storing-information-in-metadata
   * ).
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. A comprehensive list of
   * valid payment method types can be found
   * [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
   */
  public val paymentMethodTypes: List<String>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

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

    private var objectValueValue: InlinePaymentIntentObjectValueX7c59329b? = null

    public var objectValue: InlinePaymentIntentObjectValueX7c59329b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlinePaymentIntentStatusX12dfd3e5? = null

    public var status: InlinePaymentIntentStatusX12dfd3e5
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Amount intended to be collected by this PaymentIntent. A positive integer representing how much to charge in the
     * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
     * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
     * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
     * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
     */
    public var amount: Int? = null

    /**
     * Amount that can be captured from this PaymentIntent.
     */
    public var amountCapturable: Int? = null

    public var amountDetails: InlinePaymentIntentAmountDetailsX0fe9fd24? = null

    /**
     * Amount that this PaymentIntent collects.
     */
    public var amountReceived: Int? = null

    /**
     * ID of the Connect application that created the PaymentIntent.
     */
    public var application: InlinePaymentIntentApplicationX852c1de7? = null

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
     * amount captured. For more information, see the PaymentIntents [use case for connected
     * accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var applicationFeeAmount: Int? = null

    /**
     * Settings to configure compatible payment methods from the [Stripe
     * Dashboard](https://dashboard.stripe.com/settings/payment_methods)
     */
    public var automaticPaymentMethods: InlinePaymentIntentAutomaticPaymentMethodsX68be6956? = null

    /**
     * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled. Measured in
     * seconds since the Unix epoch.
     */
    public var canceledAt: Int? = null

    /**
     * Reason for cancellation of this PaymentIntent, either user-provided (`duplicate`, `fraudulent`,
     * `requested_by_customer`, or `abandoned`) or generated by Stripe internally (`failed_invoice`, `void_invoice`,
     * `automatic`, or `expired`).
     */
    public var cancellationReason: InlinePaymentIntentCancellationReasonXa99846ea? = null

    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentIntentCaptureMethodX7c24a00f? = null

    /**
     * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key.
     *
     * The client secret can be used to complete a payment from your frontend. It should not be stored, logged, or
     * exposed to anyone other than the customer. Make sure that you have TLS enabled on any page that includes the
     * client secret.
     *
     * Refer to our docs to [accept a payment](https://docs.stripe.com/payments/accept-a-payment?ui=elements) and learn
     * about how `client_secret` should be handled.
     */
    public var clientSecret: String? = null

    /**
     * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer action to confirm
     * the payment.
     */
    public var confirmationMethod: InlinePaymentIntentConfirmationMethodX048d5232? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * Payment methods attached to other Customers cannot be used with this PaymentIntent.
     *
     * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
     * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Customer after the
     * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
     * `card_present` and isn't a digital wallet, then a
     * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gen
     * erated_card) payment method representing the card is created and attached to the Customer instead.
     */
    public var customer: InlinePaymentIntentCustomerX0992ed81? = null

    /**
     * ID of the Account representing the customer that this PaymentIntent belongs to, if one exists.
     *
     * Payment methods attached to other Accounts cannot be used with this PaymentIntent.
     *
     * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
     * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Account after the
     * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
     * `card_present` and isn't a digital wallet, then a
     * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-gen
     * erated_card) payment method representing the card is created and attached to the Account instead.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    private var excludedPaymentMethodTypesValue:
        List<InlinePaymentIntentExcludedPaymentMethodTypesItemX2ad3d6e8>? = null

    /**
     * The list of payment method types to exclude from use with this payment.
     */
    public var excludedPaymentMethodTypes:
        List<InlinePaymentIntentExcludedPaymentMethodTypesItemX2ad3d6e8>?
      get() = excludedPaymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludedPaymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var hooks: PaymentFlowsPaymentIntentAsyncWorkflows? = null

    /**
     * The payment error encountered in the previous PaymentIntent confirmation. It will be cleared if the PaymentIntent
     * is later updated for any reason.
     */
    public var lastPaymentError: InlinePaymentIntentLastPaymentErrorXae7d80fa? = null

    /**
     * ID of the latest [Charge object](https://docs.stripe.com/api/charges) created by this PaymentIntent. This
     * property is `null` until PaymentIntent confirmation is attempted.
     */
    public var latestCharge: InlinePaymentIntentLatestChargeXddbf3551? = null

    /**
     * Settings for Managed Payments.
     */
    public var managedPayments: InlinePaymentIntentManagedPaymentsX593f2137? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Learn more about [storing
     * information in
     * metadata](https://docs.stripe.com/payments/payment-intents/creating-payment-intents#storing-information-in-metada
     * ta).
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment
     * using the provided source.
     */
    public var nextAction: InlinePaymentIntentNextActionXf46d948f? = null

    /**
     * You can specify the settlement merchant as the
     * connected account using the `on_behalf_of` attribute on the charge. See the PaymentIntents [use case for
     * connected accounts](/payments/connected-accounts) for details.
     */
    public var onBehalfOf: InlinePaymentIntentOnBehalfOfXf11f3a8f? = null

    public var paymentDetails: PaymentFlowsPaymentDetails? = null

    /**
     * ID of the payment method used in this PaymentIntent.
     */
    public var paymentMethod: InlinePaymentIntentPaymentMethodX9670d419? = null

    /**
     * Information about the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations)
     * used for this PaymentIntent.
     */
    public var paymentMethodConfigurationDetails:
        InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1? = null

    /**
     * Payment-method-specific configuration for this PaymentIntent.
     */
    public var paymentMethodOptions: InlinePaymentIntentPaymentMethodOptionsX8c4198d2? = null

    private var paymentMethodTypesValue: List<String>? = null

    /**
     * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. A comprehensive list of
     * valid payment method types can be found
     * [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
     */
    public var paymentMethodTypes: List<String>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null

    /**
     * If present, this property tells you about the processing state of the payment.
     */
    public var processing: InlinePaymentIntentProcessingX5a7361cd? = null

    /**
     * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
     * payment in live mode, a receipt will be sent regardless of your [email
     * settings](https://dashboard.stripe.com/account/emails).
     */
    public var receiptEmail: String? = null

    /**
     * ID of the review associated with this PaymentIntent, if any.
     */
    public var review: InlinePaymentIntentReviewX626eb3f1? = null

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
     * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
     * completes any required actions. If you don't provide a Customer, you can still
     * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
     *
     * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
     * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
     * method representing the card to the Customer instead.
     *
     * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
     * network rules, such as [SCA](/strong-customer-authentication).
     */
    public var setupFutureUsage: InlinePaymentIntentSetupFutureUsageX44bafcda? = null

    /**
     * Shipping information for this PaymentIntent.
     */
    public var shipping: InlinePaymentIntentShippingXd9b79a0a? = null

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card charge. This value
     * overrides the account's default statement descriptor. For information about requirements, including the
     * 22-character limit, see [the Statement Descriptor
     * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
     *
     * Setting this value for a card charge returns an error. For card charges, set the
     * [statement_descriptor_suffix](https://docs.stripe.com/get-started/account/statement-descriptors#dynamic) instead.
     */
    public var statementDescriptor: String? = null

    /**
     * Provides information about a card charge. Concatenated to the account's [statement descriptor
     * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
     * descriptor that appears on the customer's statement.
     */
    public var statementDescriptorSuffix: String? = null

    /**
     * The data that automatically creates a Transfer after the payment finalizes. Learn more about the [use case for
     * connected accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var transferData: InlinePaymentIntentTransferDataX3979a94c? = null

    /**
     * A string that identifies the resulting payment as part of a group. Learn more about the [use case for connected
     * accounts](https://docs.stripe.com/connect/separate-charges-and-transfers).
     */
    public var transferGroup: String? = null

    public fun build(): PaymentIntent {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      return PaymentIntent(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        amount = amount,
        amountCapturable = amountCapturable,
        amountDetails = amountDetails,
        amountReceived = amountReceived,
        application = application,
        applicationFeeAmount = applicationFeeAmount,
        automaticPaymentMethods = automaticPaymentMethods,
        canceledAt = canceledAt,
        cancellationReason = cancellationReason,
        captureMethod = captureMethod,
        clientSecret = clientSecret,
        confirmationMethod = confirmationMethod,
        currency = currency,
        customer = customer,
        customerAccount = customerAccount,
        description = description,
        excludedPaymentMethodTypes = excludedPaymentMethodTypes,
        hooks = hooks,
        lastPaymentError = lastPaymentError,
        latestCharge = latestCharge,
        managedPayments = managedPayments,
        metadata = metadata,
        nextAction = nextAction,
        onBehalfOf = onBehalfOf,
        paymentDetails = paymentDetails,
        paymentMethod = paymentMethod,
        paymentMethodConfigurationDetails = paymentMethodConfigurationDetails,
        paymentMethodOptions = paymentMethodOptions,
        paymentMethodTypes = paymentMethodTypes,
        presentmentDetails = presentmentDetails,
        processing = processing,
        receiptEmail = receiptEmail,
        review = review,
        setupFutureUsage = setupFutureUsage,
        shipping = shipping,
        statementDescriptor = statementDescriptor,
        statementDescriptorSuffix = statementDescriptorSuffix,
        transferData = transferData,
        transferGroup = transferGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentIntent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntent {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntent must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlinePaymentIntentObjectValueX7c59329b>(rawObject, "object")
      val status = json.decodeRequired<InlinePaymentIntentStatusX12dfd3e5>(rawObject, "status")
      return PaymentIntent(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountCapturable = rawObject["amount_capturable"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountDetails = rawObject["amount_details"]?.let { json.decodeFromJsonElement<InlinePaymentIntentAmountDetailsX0fe9fd24>(it) },
        amountReceived = rawObject["amount_received"]?.let { json.decodeFromJsonElement<Int>(it) },
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentApplicationX852c1de7?>(element) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        automaticPaymentMethods = rawObject["automatic_payment_methods"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentAutomaticPaymentMethodsX68be6956?>(element) },
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        cancellationReason = rawObject["cancellation_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentCancellationReasonXa99846ea?>(element) },
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentIntentCaptureMethodX7c24a00f>(it) },
        clientSecret = rawObject["client_secret"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        confirmationMethod = rawObject["confirmation_method"]?.let { json.decodeFromJsonElement<InlinePaymentIntentConfirmationMethodX048d5232>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentCustomerX0992ed81?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlinePaymentIntentExcludedPaymentMethodTypesItemX2ad3d6e8>?>(element) },
        hooks = rawObject["hooks"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentIntentAsyncWorkflows>(it) },
        lastPaymentError = rawObject["last_payment_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentLastPaymentErrorXae7d80fa?>(element) },
        latestCharge = rawObject["latest_charge"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentLatestChargeXddbf3551?>(element) },
        managedPayments = rawObject["managed_payments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentManagedPaymentsX593f2137?>(element) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        nextAction = rawObject["next_action"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentNextActionXf46d948f?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentOnBehalfOfXf11f3a8f?>(element) },
        paymentDetails = rawObject["payment_details"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentDetails>(it) },
        paymentMethod = rawObject["payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodX9670d419?>(element) },
        paymentMethodConfigurationDetails = rawObject["payment_method_configuration_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1?>(element) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsX8c4198d2?>(element) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        presentmentDetails = rawObject["presentment_details"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentIntentPresentmentDetails>(it) },
        processing = rawObject["processing"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentProcessingX5a7361cd?>(element) },
        receiptEmail = rawObject["receipt_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        review = rawObject["review"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentReviewX626eb3f1?>(element) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentSetupFutureUsageX44bafcda?>(element) },
        shipping = rawObject["shipping"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentShippingXd9b79a0a?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentTransferDataX3979a94c?>(element) },
        transferGroup = rawObject["transfer_group"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntent) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountCapturable?.let { put("amount_capturable", json.encodeToJsonElement(it)) }
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.amountReceived?.let { put("amount_received", json.encodeToJsonElement(it)) }
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.automaticPaymentMethods?.let { put("automatic_payment_methods", json.encodeToJsonElement(it)) }
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.clientSecret?.let { put("client_secret", it) }
        value.confirmationMethod?.let { put("confirmation_method", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.hooks?.let { put("hooks", json.encodeToJsonElement(it)) }
        value.lastPaymentError?.let { put("last_payment_error", json.encodeToJsonElement(it)) }
        value.latestCharge?.let { put("latest_charge", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nextAction?.let { put("next_action", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", json.encodeToJsonElement(it)) }
        value.paymentMethodConfigurationDetails?.let { put("payment_method_configuration_details", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.presentmentDetails?.let { put("presentment_details", json.encodeToJsonElement(it)) }
        value.processing?.let { put("processing", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", it) }
        value.review?.let { put("review", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntent(block: PaymentIntent.Builder.() -> Unit): PaymentIntent = PaymentIntent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

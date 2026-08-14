package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormXef9c8e87.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormXef9c8e87(
  /**
   * Amount intended to be collected by this PaymentIntent. A positive integer representing how much to charge in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or 100
   * to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent in charge
   * currency](https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts). The amount value supports up to
   * eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * Provides industry-specific information about the amount.
   */
  public val amountDetails: InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f? = null,
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
   * amount captured. For more information, see the PaymentIntents [use case for connected
   * accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * When you enable this parameter, this PaymentIntent accepts payment methods that you enable in the Dashboard and
   * that are compatible with this PaymentIntent's other parameters.
   */
  public val automaticPaymentMethods:
      InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa? = null,
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb? = null,
  /**
   * Set to `true` to attempt to [confirm this PaymentIntent](https://docs.stripe.com/api/payment_intents/confirm)
   * immediately. This parameter defaults to `false`. When creating and confirming a PaymentIntent at the same time, you
   * can also provide the parameters available in the [Confirm
   * API](https://docs.stripe.com/api/payment_intents/confirm).
   */
  public val confirm: Boolean? = null,
  /**
   * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer action to confirm the
   * payment.
   */
  public val confirmationMethod:
      InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9? = null,
  /**
   * ID of the ConfirmationToken used to confirm this PaymentIntent.
   *
   * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
   * `payment_method`, then the values in this request will take precedence.
   */
  public val confirmationToken: String? = null,
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
  public val customer: String? = null,
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
  /**
   * Set to `true` to fail the payment attempt if the PaymentIntent transitions into `requires_action`. Use this
   * parameter for simpler integrations that don't handle customer actions, such as [saving cards without
   * authentication](https://docs.stripe.com/payments/save-card-without-authentication). This parameter can only be used
   * with [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
   */
  public val errorOnRequiresAction: Boolean? = null,
  excludedPaymentMethodTypes: List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesItemXf1ab07e0>? = null,
  expand: List<String>? = null,
  /**
   * Automations to be run during the PaymentIntent lifecycle
   */
  public val hooks: InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e? = null,
  /**
   * ID of the mandate that's used for this payment. This parameter can only be used with
   * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
   */
  public val mandate: String? = null,
  /**
   * This hash contains details about the Mandate to create. This parameter can only be used with
   * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
   */
  public val mandateData: InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0? = null,
  metadata: Map<String, String>? = null,
  /**
   * Set to `true` to indicate that the customer isn't in your checkout flow during this payment attempt and can't
   * authenticate. Use this parameter in scenarios where you collect payment method details and [charge them
   * later](https://docs.stripe.com/payments/save-during-payment). This parameter can only be used with
   * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
   */
  public val offSession: InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec? = null,
  /**
   * The Stripe account ID that these funds are intended for. Learn more about the [use case for connected
   * accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val onBehalfOf: String? = null,
  /**
   * Provides industry-specific information about the charge.
   */
  public val paymentDetails: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e? = null,
  /**
   * ID of the payment method (a PaymentMethod, Card, or [compatible
   * Source](https://docs.stripe.com/payments/payment-methods/transitioning#compatibility) object) to attach to this
   * PaymentIntent.
   *
   * If you omit this parameter with `confirm=true`, `customer.default_source` attaches as this PaymentIntent's payment
   * instrument to improve migration for users of the Charges API. We recommend that you explicitly provide the
   * `payment_method` moving forward.
   * If the payment method is attached to a Customer, you must also provide the ID of that Customer as the
   * [customer](https://api.stripe.com#create_payment_intent-customer) parameter of this PaymentIntent.
   */
  public val paymentMethod: String? = null,
  /**
   * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use with
   * this PaymentIntent.
   */
  public val paymentMethodConfiguration: String? = null,
  /**
   * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
   * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
   * property on the PaymentIntent.
   */
  public val paymentMethodData:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba? = null,
  /**
   * Payment method-specific configuration for this PaymentIntent.
   */
  public val paymentMethodOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737? = null,
  paymentMethodTypes: List<String>? = null,
  /**
   * Options to configure Radar. Learn more about [Radar Sessions](https://docs.stripe.com/radar/radar-session).
   */
  public val radarOptions: InlineV1PaymentIntentsPostRequestFormRadarOptionsX70579f0c? = null,
  /**
   * Email address to send the receipt to. If you specify `receipt_email` for a payment in live mode, you send a receipt
   * regardless of your [email settings](https://dashboard.stripe.com/account/emails).
   */
  public val receiptEmail: String? = null,
  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method's
   * app or site. If you'd prefer to redirect to a mobile application, you can alternatively supply an application URI
   * scheme. This parameter can only be used with
   * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
   */
  public val returnUrl: String? = null,
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
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXa88d9e73? = null,
  /**
   * Shipping information for this PaymentIntent.
   */
  public val shipping: InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6? = null,
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
   * The parameters that you can use to automatically create a Transfer.
   * Learn more about the [use case for connected accounts](https://docs.stripe.com/payments/connected-accounts).
   */
  public val transferData: InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d? = null,
  /**
   * A string that identifies the resulting payment as part of a group. Learn more about the [use case for connected
   * accounts](https://docs.stripe.com/connect/separate-charges-and-transfers).
   */
  public val transferGroup: String? = null,
  /**
   * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the next
   * actions.
   */
  public val useStripeSdk: Boolean? = null,
) {
  /**
   * The list of payment method types to exclude from use with this payment.
   */
  public val excludedPaymentMethodTypes:
      List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesItemXf1ab07e0>? =
      excludedPaymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The list of payment method types (for example, a card) that this PaymentIntent can use. If you don't provide this,
   * Stripe will dynamically show relevant payment methods from your [payment method
   * settings](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be found
   * [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
   */
  public val paymentMethodTypes: List<String>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    /**
     * Provides industry-specific information about the amount.
     */
    public var amountDetails: InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f? = null

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. The amount of the application fee collected will be capped at the total
     * amount captured. For more information, see the PaymentIntents [use case for connected
     * accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var applicationFeeAmount: Int? = null

    /**
     * When you enable this parameter, this PaymentIntent accepts payment methods that you enable in the Dashboard and
     * that are compatible with this PaymentIntent's other parameters.
     */
    public var automaticPaymentMethods:
        InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa? = null

    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb? = null

    /**
     * Set to `true` to attempt to [confirm this PaymentIntent](https://docs.stripe.com/api/payment_intents/confirm)
     * immediately. This parameter defaults to `false`. When creating and confirming a PaymentIntent at the same time,
     * you can also provide the parameters available in the [Confirm
     * API](https://docs.stripe.com/api/payment_intents/confirm).
     */
    public var confirm: Boolean? = null

    /**
     * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer action to confirm
     * the payment.
     */
    public var confirmationMethod: InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9?
        = null

    /**
     * ID of the ConfirmationToken used to confirm this PaymentIntent.
     *
     * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
     * `payment_method`, then the values in this request will take precedence.
     */
    public var confirmationToken: String? = null

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
    public var customer: String? = null

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

    /**
     * Set to `true` to fail the payment attempt if the PaymentIntent transitions into `requires_action`. Use this
     * parameter for simpler integrations that don't handle customer actions, such as [saving cards without
     * authentication](https://docs.stripe.com/payments/save-card-without-authentication). This parameter can only be
     * used with [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
     */
    public var errorOnRequiresAction: Boolean? = null

    private var excludedPaymentMethodTypesValue:
        List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesItemXf1ab07e0>? = null

    /**
     * The list of payment method types to exclude from use with this payment.
     */
    public var excludedPaymentMethodTypes:
        List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesItemXf1ab07e0>?
      get() = excludedPaymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludedPaymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

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
     * Automations to be run during the PaymentIntent lifecycle
     */
    public var hooks: InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e? = null

    /**
     * ID of the mandate that's used for this payment. This parameter can only be used with
     * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
     */
    public var mandate: String? = null

    /**
     * This hash contains details about the Mandate to create. This parameter can only be used with
     * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
     */
    public var mandateData: InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Set to `true` to indicate that the customer isn't in your checkout flow during this payment attempt and can't
     * authenticate. Use this parameter in scenarios where you collect payment method details and [charge them
     * later](https://docs.stripe.com/payments/save-during-payment). This parameter can only be used with
     * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
     */
    public var offSession: InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec? = null

    /**
     * The Stripe account ID that these funds are intended for. Learn more about the [use case for connected
     * accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var onBehalfOf: String? = null

    /**
     * Provides industry-specific information about the charge.
     */
    public var paymentDetails: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e? = null

    /**
     * ID of the payment method (a PaymentMethod, Card, or [compatible
     * Source](https://docs.stripe.com/payments/payment-methods/transitioning#compatibility) object) to attach to this
     * PaymentIntent.
     *
     * If you omit this parameter with `confirm=true`, `customer.default_source` attaches as this PaymentIntent's
     * payment instrument to improve migration for users of the Charges API. We recommend that you explicitly provide
     * the `payment_method` moving forward.
     * If the payment method is attached to a Customer, you must also provide the ID of that Customer as the
     * [customer](https://api.stripe.com#create_payment_intent-customer) parameter of this PaymentIntent.
     */
    public var paymentMethod: String? = null

    /**
     * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use
     * with this PaymentIntent.
     */
    public var paymentMethodConfiguration: String? = null

    /**
     * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
     * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
     * property on the PaymentIntent.
     */
    public var paymentMethodData: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba? =
        null

    /**
     * Payment method-specific configuration for this PaymentIntent.
     */
    public var paymentMethodOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737? = null

    private var paymentMethodTypesValue: List<String>? = null

    /**
     * The list of payment method types (for example, a card) that this PaymentIntent can use. If you don't provide
     * this, Stripe will dynamically show relevant payment methods from your [payment method
     * settings](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
     * found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
     */
    public var paymentMethodTypes: List<String>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Options to configure Radar. Learn more about [Radar Sessions](https://docs.stripe.com/radar/radar-session).
     */
    public var radarOptions: InlineV1PaymentIntentsPostRequestFormRadarOptionsX70579f0c? = null

    /**
     * Email address to send the receipt to. If you specify `receipt_email` for a payment in live mode, you send a
     * receipt regardless of your [email settings](https://dashboard.stripe.com/account/emails).
     */
    public var receiptEmail: String? = null

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method's
     * app or site. If you'd prefer to redirect to a mobile application, you can alternatively supply an application URI
     * scheme. This parameter can only be used with
     * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
     */
    public var returnUrl: String? = null

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
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXa88d9e73? =
        null

    /**
     * Shipping information for this PaymentIntent.
     */
    public var shipping: InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6? = null

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
     * The parameters that you can use to automatically create a Transfer.
     * Learn more about the [use case for connected accounts](https://docs.stripe.com/payments/connected-accounts).
     */
    public var transferData: InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d? = null

    /**
     * A string that identifies the resulting payment as part of a group. Learn more about the [use case for connected
     * accounts](https://docs.stripe.com/connect/separate-charges-and-transfers).
     */
    public var transferGroup: String? = null

    /**
     * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the
     * next actions.
     */
    public var useStripeSdk: Boolean? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormXef9c8e87 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1PaymentIntentsPostRequestFormXef9c8e87(
        amount = amount,
        currency = currency,
        amountDetails = amountDetails,
        applicationFeeAmount = applicationFeeAmount,
        automaticPaymentMethods = automaticPaymentMethods,
        captureMethod = captureMethod,
        confirm = confirm,
        confirmationMethod = confirmationMethod,
        confirmationToken = confirmationToken,
        customer = customer,
        customerAccount = customerAccount,
        description = description,
        errorOnRequiresAction = errorOnRequiresAction,
        excludedPaymentMethodTypes = excludedPaymentMethodTypes,
        expand = expand,
        hooks = hooks,
        mandate = mandate,
        mandateData = mandateData,
        metadata = metadata,
        offSession = offSession,
        onBehalfOf = onBehalfOf,
        paymentDetails = paymentDetails,
        paymentMethod = paymentMethod,
        paymentMethodConfiguration = paymentMethodConfiguration,
        paymentMethodData = paymentMethodData,
        paymentMethodOptions = paymentMethodOptions,
        paymentMethodTypes = paymentMethodTypes,
        radarOptions = radarOptions,
        receiptEmail = receiptEmail,
        returnUrl = returnUrl,
        setupFutureUsage = setupFutureUsage,
        shipping = shipping,
        statementDescriptor = statementDescriptor,
        statementDescriptorSuffix = statementDescriptorSuffix,
        transferData = transferData,
        transferGroup = transferGroup,
        useStripeSdk = useStripeSdk,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormXef9c8e87 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormXef9c8e87> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormXef9c8e87 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormXef9c8e87")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormXef9c8e87 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1PaymentIntentsPostRequestFormXef9c8e87(
        amount = amount,
        currency = currency,
        amountDetails = rawObject["amount_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        automaticPaymentMethods = rawObject["automatic_payment_methods"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAutomaticPaymentMethodsX4e38aeaa>(it) },
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb>(it) },
        confirm = rawObject["confirm"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        confirmationMethod = rawObject["confirmation_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9>(it) },
        confirmationToken = rawObject["confirmation_token"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        errorOnRequiresAction = rawObject["error_on_requires_action"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormExcludedPaymentMethodTypesItemXf1ab07e0>>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        hooks = rawObject["hooks"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksXfe0c1a5e>(it) },
        mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<String>(it) },
        mandateData = rawObject["mandate_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        offSession = rawObject["off_session"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentDetails = rawObject["payment_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodConfiguration = rawObject["payment_method_configuration"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRadarOptionsX70579f0c>(it) },
        receiptEmail = rawObject["receipt_email"]?.let { json.decodeFromJsonElement<String>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXa88d9e73>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormShippingXbf0817a6>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { json.decodeFromJsonElement<String>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
        useStripeSdk = rawObject["use_stripe_sdk"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormXef9c8e87) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormXef9c8e87")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.automaticPaymentMethods?.let { put("automatic_payment_methods", json.encodeToJsonElement(it)) }
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.confirm?.let { put("confirm", json.encodeToJsonElement(it)) }
        value.confirmationMethod?.let { put("confirmation_method", json.encodeToJsonElement(it)) }
        value.confirmationToken?.let { put("confirmation_token", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.errorOnRequiresAction?.let { put("error_on_requires_action", json.encodeToJsonElement(it)) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.hooks?.let { put("hooks", json.encodeToJsonElement(it)) }
        value.mandate?.let { put("mandate", it) }
        value.mandateData?.let { put("mandate_data", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.offSession?.let { put("off_session", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodConfiguration?.let { put("payment_method_configuration", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.radarOptions?.let { put("radar_options", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", it) }
        value.returnUrl?.let { put("return_url", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
        value.useStripeSdk?.let { put("use_stripe_sdk", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormXef9c8e87(block: InlineV1PaymentIntentsPostRequestFormXef9c8e87.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormXef9c8e87 = InlineV1PaymentIntentsPostRequestFormXef9c8e87.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormXef9c8e87 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

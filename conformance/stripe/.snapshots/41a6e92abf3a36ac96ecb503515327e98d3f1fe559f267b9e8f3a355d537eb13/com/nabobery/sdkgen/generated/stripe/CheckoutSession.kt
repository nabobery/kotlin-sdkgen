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
public data class CheckoutSessionView internal constructor(
  @SerialName("adaptive_pricing")
  public val adaptivePricing: InlineCheckoutSessionAdaptivePricingX9958aa95? = null,
  @SerialName("after_expiration")
  public val afterExpiration: InlineCheckoutSessionAfterExpirationXdb3c322f? = null,
  @SerialName("allow_promotion_codes")
  public val allowPromotionCodes: Boolean? = null,
  @SerialName("amount_subtotal")
  public val amountSubtotal: Int? = null,
  @SerialName("amount_total")
  public val amountTotal: Int? = null,
  @SerialName("automatic_tax")
  public val automaticTax: PaymentPagesCheckoutSessionAutomaticTax,
  @SerialName("billing_address_collection")
  public val billingAddressCollection:
      InlineCheckoutSessionBillingAddressCollectionXd15fab78? = null,
  @SerialName("branding_settings")
  public val brandingSettings: PaymentPagesCheckoutSessionBrandingSettings? = null,
  @SerialName("cancel_url")
  public val cancelUrl: String? = null,
  @SerialName("client_reference_id")
  public val clientReferenceId: String? = null,
  @SerialName("client_secret")
  public val clientSecret: String? = null,
  @SerialName("collected_information")
  public val collectedInformation: InlineCheckoutSessionCollectedInformationXf8be28b1? = null,
  public val consent: InlineCheckoutSessionConsentXd40e04a6? = null,
  @SerialName("consent_collection")
  public val consentCollection: InlineCheckoutSessionConsentCollectionX71c17f32? = null,
  public val created: Int,
  public val currency: String? = null,
  @SerialName("currency_conversion")
  public val currencyConversion: InlineCheckoutSessionCurrencyConversionXbada3ad5? = null,
  @SerialName("custom_fields")
  public val customFields: List<PaymentPagesCheckoutSessionCustomFields>,
  @SerialName("custom_text")
  public val customText: PaymentPagesCheckoutSessionCustomText,
  public val customer: InlineCheckoutSessionCustomerXff9e59c9? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("customer_creation")
  public val customerCreation: InlineCheckoutSessionCustomerCreationX45f89ff8? = null,
  @SerialName("customer_details")
  public val customerDetails: InlineCheckoutSessionCustomerDetailsX1b41d011? = null,
  @SerialName("customer_email")
  public val customerEmail: String? = null,
  public val discounts: List<PaymentPagesCheckoutSessionDiscount>? = null,
  @SerialName("excluded_payment_method_types")
  public val excludedPaymentMethodTypes: List<String>? = null,
  @SerialName("expires_at")
  public val expiresAt: Int,
  public val id: String,
  @SerialName("integration_identifier")
  public val integrationIdentifier: String? = null,
  public val invoice: InlineCheckoutSessionInvoiceX33315f78? = null,
  @SerialName("invoice_creation")
  public val invoiceCreation: InlineCheckoutSessionInvoiceCreationX174def90? = null,
  @SerialName("line_items")
  public val lineItems: InlineCheckoutSessionLineItemsX4b81212f? = null,
  public val livemode: Boolean,
  public val locale: InlineCheckoutSessionLocaleX143da667? = null,
  @SerialName("managed_payments")
  public val managedPayments: InlineCheckoutSessionManagedPaymentsX6579696b? = null,
  public val metadata: Map<String, String>? = null,
  public val mode: InlineCheckoutSessionModeXf4d293a1,
  @SerialName("name_collection")
  public val nameCollection: PaymentPagesCheckoutSessionNameCollection? = null,
  @SerialName("object")
  public val objectValue: InlineCheckoutSessionObjectValueX29ceafae,
  @SerialName("optional_items")
  public val optionalItems: List<PaymentPagesCheckoutSessionOptionalItem>? = null,
  @SerialName("origin_context")
  public val originContext: InlineCheckoutSessionOriginContextX589615b9? = null,
  @SerialName("payment_intent")
  public val paymentIntent: InlineCheckoutSessionPaymentIntentXd92b065b? = null,
  @SerialName("payment_link")
  public val paymentLink: InlineCheckoutSessionPaymentLinkX45e1bc7c? = null,
  @SerialName("payment_method_collection")
  public val paymentMethodCollection: InlineCheckoutSessionPaymentMethodCollectionX18402ff1? = null,
  @SerialName("payment_method_configuration_details")
  public val paymentMethodConfigurationDetails:
      InlineCheckoutSessionPaymentMethodConfigurationDetailsXb9b22770? = null,
  @SerialName("payment_method_options")
  public val paymentMethodOptions: InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e? = null,
  @SerialName("payment_method_types")
  public val paymentMethodTypes: List<String>,
  @SerialName("payment_status")
  public val paymentStatus: InlineCheckoutSessionPaymentStatusX0c3c2c7c,
  public val permissions: InlineCheckoutSessionPermissionsXffe1cf3c? = null,
  @SerialName("phone_number_collection")
  public val phoneNumberCollection: PaymentPagesCheckoutSessionPhoneNumberCollection? = null,
  @SerialName("presentment_details")
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  @SerialName("recovered_from")
  public val recoveredFrom: String? = null,
  @SerialName("redirect_on_completion")
  public val redirectOnCompletion: InlineCheckoutSessionRedirectOnCompletionX80a8a619? = null,
  @SerialName("return_url")
  public val returnUrl: String? = null,
  @SerialName("saved_payment_method_options")
  public val savedPaymentMethodOptions:
      InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be? = null,
  @SerialName("setup_intent")
  public val setupIntent: InlineCheckoutSessionSetupIntentX831b441e? = null,
  @SerialName("shipping_address_collection")
  public val shippingAddressCollection:
      InlineCheckoutSessionShippingAddressCollectionX2994b953? = null,
  @SerialName("shipping_cost")
  public val shippingCost: InlineCheckoutSessionShippingCostXd1d434da? = null,
  @SerialName("shipping_options")
  public val shippingOptions: List<PaymentPagesCheckoutSessionShippingOption>,
  public val status: InlineCheckoutSessionStatusX6a7fc5ac? = null,
  @SerialName("submit_type")
  public val submitType: InlineCheckoutSessionSubmitTypeXfbbcc564? = null,
  public val subscription: InlineCheckoutSessionSubscriptionXd0282245? = null,
  @SerialName("success_url")
  public val successUrl: String? = null,
  @SerialName("tax_id_collection")
  public val taxIdCollection: PaymentPagesCheckoutSessionTaxIdCollection? = null,
  @SerialName("total_details")
  public val totalDetails: InlineCheckoutSessionTotalDetailsXcd1469e3? = null,
  @SerialName("ui_mode")
  public val uiMode: InlineCheckoutSessionUiModeX63ec77c4? = null,
  public val url: String? = null,
  @SerialName("wallet_options")
  public val walletOptions: InlineCheckoutSessionWalletOptionsX747ecc26? = null,
)

/**
 * A Checkout Session represents your customer's session as they pay for
 * one-time purchases or subscriptions through [Checkout](https://docs.stripe.com/payments/checkout)
 * or [Payment Links](https://docs.stripe.com/payments/payment-links). We recommend creating a
 * new Session each time your customer attempts to pay.
 *
 * Once payment is successful, the Checkout Session will contain a reference
 * to the [Customer](https://docs.stripe.com/api/customers), and either the successful
 * [PaymentIntent](https://docs.stripe.com/api/payment_intents) or an active
 * [Subscription](https://docs.stripe.com/api/subscriptions).
 *
 * You can create a Checkout Session on your server and redirect to its URL
 * to begin Checkout.
 *
 * Related guide: [Checkout quickstart](https://docs.stripe.com/checkout/quickstart)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session
 */
@Serializable(with = CheckoutSession.Serializer::class)
public class CheckoutSession(
  public val automaticTax: PaymentPagesCheckoutSessionAutomaticTax,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  customFields: List<PaymentPagesCheckoutSessionCustomFields>,
  public val customText: PaymentPagesCheckoutSessionCustomText,
  /**
   * The timestamp at which the Checkout Session will expire.
   */
  public val expiresAt: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The mode of the Checkout Session.
   */
  public val mode: InlineCheckoutSessionModeXf4d293a1,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCheckoutSessionObjectValueX29ceafae,
  paymentMethodTypes: List<String>,
  /**
   * The payment status of the Checkout Session, one of `paid`, `unpaid`, or `no_payment_required`.
   * You can use this value to decide when to fulfill your customer's order.
   */
  public val paymentStatus: InlineCheckoutSessionPaymentStatusX0c3c2c7c,
  shippingOptions: List<PaymentPagesCheckoutSessionShippingOption>,
  /**
   * Settings for price localization with [Adaptive
   * Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing).
   */
  public val adaptivePricing: InlineCheckoutSessionAdaptivePricingX9958aa95? = null,
  /**
   * When set, provides configuration for actions to take if this Checkout Session expires.
   */
  public val afterExpiration: InlineCheckoutSessionAfterExpirationXdb3c322f? = null,
  /**
   * Enables user redeemable promotion codes.
   */
  public val allowPromotionCodes: Boolean? = null,
  /**
   * Total of all items before discounts or taxes are applied.
   */
  public val amountSubtotal: Int? = null,
  /**
   * Total of all items after discounts and taxes are applied.
   */
  public val amountTotal: Int? = null,
  /**
   * Describes whether Checkout should collect the customer's billing address. Defaults to `auto`.
   */
  public val billingAddressCollection:
      InlineCheckoutSessionBillingAddressCollectionXd15fab78? = null,
  public val brandingSettings: PaymentPagesCheckoutSessionBrandingSettings? = null,
  /**
   * If set, Checkout displays a back button and customers will be directed to this URL if they decide to cancel payment
   * and return to your website.
   */
  public val cancelUrl: String? = null,
  /**
   * A unique string to reference the Checkout Session. This can be a
   * customer ID, a cart ID, or similar, and can be used to reconcile the
   * Session with your internal systems.
   */
  public val clientReferenceId: String? = null,
  /**
   * The client secret of your Checkout Session. Applies to Checkout Sessions with `ui_mode: embedded_page` or `ui_mode:
   * elements`. For `ui_mode: embedded_page`, the client secret is to be used when initializing Stripe.js embedded
   * checkout.
   * For `ui_mode: elements`, use the client secret with [initCheckout](https://docs.stripe.com/js/custom_checkout/init)
   * on your front end.
   */
  public val clientSecret: String? = null,
  /**
   * Information about the customer collected within the Checkout Session.
   */
  public val collectedInformation: InlineCheckoutSessionCollectedInformationXf8be28b1? = null,
  /**
   * Results of `consent_collection` for this session.
   */
  public val consent: InlineCheckoutSessionConsentXd40e04a6? = null,
  /**
   * When set, provides configuration for the Checkout Session to gather active consent from customers.
   */
  public val consentCollection: InlineCheckoutSessionConsentCollectionX71c17f32? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * Currency conversion details for [Adaptive Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing)
   * sessions created before 2025-03-31.
   */
  public val currencyConversion: InlineCheckoutSessionCurrencyConversionXbada3ad5? = null,
  /**
   * The ID of the customer for this Session.
   * For Checkout Sessions in `subscription` mode or Checkout Sessions with `customer_creation` set as `always` in
   * `payment` mode, Checkout
   * will create a new customer object based on information provided
   * during the payment flow unless an existing customer was provided when
   * the Session was created.
   */
  public val customer: InlineCheckoutSessionCustomerXff9e59c9? = null,
  /**
   * The ID of the account for this Session.
   */
  public val customerAccount: String? = null,
  /**
   * Configure whether a Checkout Session creates a Customer when the Checkout Session completes.
   */
  public val customerCreation: InlineCheckoutSessionCustomerCreationX45f89ff8? = null,
  /**
   * The customer details including the customer's tax exempt status and the customer's tax IDs. Customer's address
   * details are not present on Sessions in `setup` mode.
   */
  public val customerDetails: InlineCheckoutSessionCustomerDetailsX1b41d011? = null,
  /**
   * If provided, this value will be used when the Customer object is created.
   * If not provided, customers will be asked to enter their email address.
   * Use this parameter to prefill customer data if you already have an email
   * on file. To access information about the customer once the payment flow is
   * complete, use the `customer` attribute.
   */
  public val customerEmail: String? = null,
  discounts: List<PaymentPagesCheckoutSessionDiscount>? = null,
  excludedPaymentMethodTypes: List<String>? = null,
  /**
   * The integration identifier for this Checkout Session. Multiple Checkout Sessions can have the same integration
   * identifier.
   */
  public val integrationIdentifier: String? = null,
  /**
   * ID of the invoice created by the Checkout Session, if it exists.
   */
  public val invoice: InlineCheckoutSessionInvoiceX33315f78? = null,
  /**
   * Details on the state of invoice creation for the Checkout Session.
   */
  public val invoiceCreation: InlineCheckoutSessionInvoiceCreationX174def90? = null,
  /**
   * The line items purchased by the customer.
   */
  public val lineItems: InlineCheckoutSessionLineItemsX4b81212f? = null,
  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
   */
  public val locale: InlineCheckoutSessionLocaleX143da667? = null,
  /**
   * Settings for Managed Payments for this Checkout Session and resulting
   * [PaymentIntents](/api/payment_intents/object), [Invoices](/api/invoices/object), and
   * [Subscriptions](/api/subscriptions/object).
   */
  public val managedPayments: InlineCheckoutSessionManagedPaymentsX6579696b? = null,
  metadata: Map<String, String>? = null,
  public val nameCollection: PaymentPagesCheckoutSessionNameCollection? = null,
  optionalItems: List<PaymentPagesCheckoutSessionOptionalItem>? = null,
  /**
   * Where the user is coming from. This informs the optimizations that are applied to the session.
   */
  public val originContext: InlineCheckoutSessionOriginContextX589615b9? = null,
  /**
   * The ID of the PaymentIntent for Checkout Sessions in `payment` mode. You can't confirm or cancel the PaymentIntent
   * for a Checkout Session. To cancel, [expire the Checkout
   * Session](https://docs.stripe.com/api/checkout/sessions/expire) instead.
   */
  public val paymentIntent: InlineCheckoutSessionPaymentIntentXd92b065b? = null,
  /**
   * The ID of the Payment Link that created this Session.
   */
  public val paymentLink: InlineCheckoutSessionPaymentLinkX45e1bc7c? = null,
  /**
   * Configure whether a Checkout Session should collect a payment method. Defaults to `always`.
   */
  public val paymentMethodCollection: InlineCheckoutSessionPaymentMethodCollectionX18402ff1? = null,
  /**
   * Information about the payment method configuration used for this Checkout session if using dynamic payment methods.
   */
  public val paymentMethodConfigurationDetails:
      InlineCheckoutSessionPaymentMethodConfigurationDetailsXb9b22770? = null,
  /**
   * Payment-method-specific configuration for the PaymentIntent or SetupIntent of this CheckoutSession.
   */
  public val paymentMethodOptions: InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e? = null,
  /**
   * This property is used to set up permissions for various actions (e.g., update) on the CheckoutSession object.
   *
   * For specific permissions, please refer to their dedicated subsections, such as
   * `permissions.update_shipping_details`.
   */
  public val permissions: InlineCheckoutSessionPermissionsXffe1cf3c? = null,
  public val phoneNumberCollection: PaymentPagesCheckoutSessionPhoneNumberCollection? = null,
  public val presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null,
  /**
   * The ID of the original expired Checkout Session that triggered the recovery flow.
   */
  public val recoveredFrom: String? = null,
  /**
   * This parameter applies to `ui_mode: embedded_page`. Learn more about the [redirect
   * behavior](https://docs.stripe.com/payments/checkout/custom-success-page?payment-ui=embedded-form) of embedded
   * sessions. Defaults to `always`.
   */
  public val redirectOnCompletion: InlineCheckoutSessionRedirectOnCompletionX80a8a619? = null,
  /**
   * Applies to Checkout Sessions with `ui_mode: embedded_page` or `ui_mode: elements`. The URL to redirect your
   * customer back to after they authenticate or cancel their payment on the payment method's app or site.
   */
  public val returnUrl: String? = null,
  /**
   * Controls saved payment method settings for the session. Only available in `payment` and `subscription` mode.
   */
  public val savedPaymentMethodOptions:
      InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be? = null,
  /**
   * The ID of the SetupIntent for Checkout Sessions in `setup` mode. You can't confirm or cancel the SetupIntent for a
   * Checkout Session. To cancel, [expire the Checkout Session](https://docs.stripe.com/api/checkout/sessions/expire)
   * instead.
   */
  public val setupIntent: InlineCheckoutSessionSetupIntentX831b441e? = null,
  /**
   * When set, provides configuration for Checkout to collect a shipping address from a customer.
   */
  public val shippingAddressCollection:
      InlineCheckoutSessionShippingAddressCollectionX2994b953? = null,
  /**
   * The details of the customer cost of shipping, including the customer chosen ShippingRate.
   */
  public val shippingCost: InlineCheckoutSessionShippingCostXd1d434da? = null,
  /**
   * The status of the Checkout Session, one of `open`, `complete`, or `expired`.
   */
  public val status: InlineCheckoutSessionStatusX6a7fc5ac? = null,
  /**
   * Describes the type of transaction being performed by Checkout in order to customize
   * relevant text on the page, such as the submit button. `submit_type` can only be
   * specified on Checkout Sessions in `payment` mode. If blank or `auto`, `pay` is used.
   */
  public val submitType: InlineCheckoutSessionSubmitTypeXfbbcc564? = null,
  /**
   * The ID of the [Subscription](https://docs.stripe.com/api/subscriptions) for Checkout Sessions in `subscription`
   * mode.
   */
  public val subscription: InlineCheckoutSessionSubscriptionXd0282245? = null,
  /**
   * The URL the customer will be directed to after the payment or
   * subscription creation is successful.
   */
  public val successUrl: String? = null,
  public val taxIdCollection: PaymentPagesCheckoutSessionTaxIdCollection? = null,
  /**
   * Tax and discount details for the computed total amount.
   */
  public val totalDetails: InlineCheckoutSessionTotalDetailsXcd1469e3? = null,
  /**
   * The UI mode of the Session. Defaults to `hosted_page`.
   */
  public val uiMode: InlineCheckoutSessionUiModeX63ec77c4? = null,
  /**
   * The URL to the Checkout Session. Applies to Checkout Sessions with `ui_mode: hosted_page`. Redirect customers to
   * this URL to take them to Checkout. If you’re using [Custom
   * Domains](https://docs.stripe.com/payments/checkout/custom-domains), the URL will use your subdomain. Otherwise,
   * it’ll use `checkout.stripe.com.`
   * This value is only present when the session is active.
   */
  public val url: String? = null,
  /**
   * Wallet-specific configuration for this Checkout Session.
   */
  public val walletOptions: InlineCheckoutSessionWalletOptionsX747ecc26? = null,
) {
  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't set
   * this parameter if `ui_mode` is `custom`.
   */
  public val customFields: List<PaymentPagesCheckoutSessionCustomFields> = customFields.toList()

  /**
   * A list of the types of payment methods (e.g. card) this Checkout
   * Session is allowed to accept.
   */
  public val paymentMethodTypes: List<String> = paymentMethodTypes.toList()

  /**
   * The shipping rate options applied to this Session.
   */
  public val shippingOptions: List<PaymentPagesCheckoutSessionShippingOption> =
      shippingOptions.toList()

  /**
   * List of coupons and promotion codes attached to the Checkout Session.
   */
  public val discounts: List<PaymentPagesCheckoutSessionDiscount>? =
      discounts?.let { collection0 -> collection0.toList() }

  /**
   * A list of the types of payment methods (e.g., `card`) that should be excluded from this Checkout Session. This
   * should only be used when payment methods for this Checkout Session are managed through the [Stripe
   * Dashboard](https://dashboard.stripe.com/settings/payment_methods).
   */
  public val excludedPaymentMethodTypes: List<String>? =
      excludedPaymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The optional items presented to the customer at checkout.
   */
  public val optionalItems: List<PaymentPagesCheckoutSessionOptionalItem>? =
      optionalItems?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var automaticTaxValue: PaymentPagesCheckoutSessionAutomaticTax? = null

    public var automaticTax: PaymentPagesCheckoutSessionAutomaticTax
      get() = requireNotNull(automaticTaxValue) { "automaticTax is required" }
      set(`value`) {
        automaticTaxValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var customFieldsValue: List<PaymentPagesCheckoutSessionCustomFields>? = null

    public var customFields: List<PaymentPagesCheckoutSessionCustomFields>
      get() = requireNotNull(customFieldsValue) { "customFields is required" }.toList()
      set(`value`) {
        customFieldsValue = value.toList()
      }

    private var customTextValue: PaymentPagesCheckoutSessionCustomText? = null

    public var customText: PaymentPagesCheckoutSessionCustomText
      get() = requireNotNull(customTextValue) { "customText is required" }
      set(`value`) {
        customTextValue = value
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

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var modeValue: InlineCheckoutSessionModeXf4d293a1? = null

    public var mode: InlineCheckoutSessionModeXf4d293a1
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    private var objectValueValue: InlineCheckoutSessionObjectValueX29ceafae? = null

    public var objectValue: InlineCheckoutSessionObjectValueX29ceafae
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentMethodTypesValue: List<String>? = null

    public var paymentMethodTypes: List<String>
      get() = requireNotNull(paymentMethodTypesValue) { "paymentMethodTypes is required" }.toList()
      set(`value`) {
        paymentMethodTypesValue = value.toList()
      }

    private var paymentStatusValue: InlineCheckoutSessionPaymentStatusX0c3c2c7c? = null

    public var paymentStatus: InlineCheckoutSessionPaymentStatusX0c3c2c7c
      get() = requireNotNull(paymentStatusValue) { "paymentStatus is required" }
      set(`value`) {
        paymentStatusValue = value
      }

    private var shippingOptionsValue: List<PaymentPagesCheckoutSessionShippingOption>? = null

    public var shippingOptions: List<PaymentPagesCheckoutSessionShippingOption>
      get() = requireNotNull(shippingOptionsValue) { "shippingOptions is required" }.toList()
      set(`value`) {
        shippingOptionsValue = value.toList()
      }

    /**
     * Settings for price localization with [Adaptive
     * Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing).
     */
    public var adaptivePricing: InlineCheckoutSessionAdaptivePricingX9958aa95? = null

    /**
     * When set, provides configuration for actions to take if this Checkout Session expires.
     */
    public var afterExpiration: InlineCheckoutSessionAfterExpirationXdb3c322f? = null

    /**
     * Enables user redeemable promotion codes.
     */
    public var allowPromotionCodes: Boolean? = null

    /**
     * Total of all items before discounts or taxes are applied.
     */
    public var amountSubtotal: Int? = null

    /**
     * Total of all items after discounts and taxes are applied.
     */
    public var amountTotal: Int? = null

    /**
     * Describes whether Checkout should collect the customer's billing address. Defaults to `auto`.
     */
    public var billingAddressCollection: InlineCheckoutSessionBillingAddressCollectionXd15fab78? =
        null

    public var brandingSettings: PaymentPagesCheckoutSessionBrandingSettings? = null

    /**
     * If set, Checkout displays a back button and customers will be directed to this URL if they decide to cancel
     * payment and return to your website.
     */
    public var cancelUrl: String? = null

    /**
     * A unique string to reference the Checkout Session. This can be a
     * customer ID, a cart ID, or similar, and can be used to reconcile the
     * Session with your internal systems.
     */
    public var clientReferenceId: String? = null

    /**
     * The client secret of your Checkout Session. Applies to Checkout Sessions with `ui_mode: embedded_page` or
     * `ui_mode: elements`. For `ui_mode: embedded_page`, the client secret is to be used when initializing Stripe.js
     * embedded checkout.
     * For `ui_mode: elements`, use the client secret with
     * [initCheckout](https://docs.stripe.com/js/custom_checkout/init) on your front end.
     */
    public var clientSecret: String? = null

    /**
     * Information about the customer collected within the Checkout Session.
     */
    public var collectedInformation: InlineCheckoutSessionCollectedInformationXf8be28b1? = null

    /**
     * Results of `consent_collection` for this session.
     */
    public var consent: InlineCheckoutSessionConsentXd40e04a6? = null

    /**
     * When set, provides configuration for the Checkout Session to gather active consent from customers.
     */
    public var consentCollection: InlineCheckoutSessionConsentCollectionX71c17f32? = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * Currency conversion details for [Adaptive Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing)
     * sessions created before 2025-03-31.
     */
    public var currencyConversion: InlineCheckoutSessionCurrencyConversionXbada3ad5? = null

    /**
     * The ID of the customer for this Session.
     * For Checkout Sessions in `subscription` mode or Checkout Sessions with `customer_creation` set as `always` in
     * `payment` mode, Checkout
     * will create a new customer object based on information provided
     * during the payment flow unless an existing customer was provided when
     * the Session was created.
     */
    public var customer: InlineCheckoutSessionCustomerXff9e59c9? = null

    /**
     * The ID of the account for this Session.
     */
    public var customerAccount: String? = null

    /**
     * Configure whether a Checkout Session creates a Customer when the Checkout Session completes.
     */
    public var customerCreation: InlineCheckoutSessionCustomerCreationX45f89ff8? = null

    /**
     * The customer details including the customer's tax exempt status and the customer's tax IDs. Customer's address
     * details are not present on Sessions in `setup` mode.
     */
    public var customerDetails: InlineCheckoutSessionCustomerDetailsX1b41d011? = null

    /**
     * If provided, this value will be used when the Customer object is created.
     * If not provided, customers will be asked to enter their email address.
     * Use this parameter to prefill customer data if you already have an email
     * on file. To access information about the customer once the payment flow is
     * complete, use the `customer` attribute.
     */
    public var customerEmail: String? = null

    private var discountsValue: List<PaymentPagesCheckoutSessionDiscount>? = null

    /**
     * List of coupons and promotion codes attached to the Checkout Session.
     */
    public var discounts: List<PaymentPagesCheckoutSessionDiscount>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var excludedPaymentMethodTypesValue: List<String>? = null

    /**
     * A list of the types of payment methods (e.g., `card`) that should be excluded from this Checkout Session. This
     * should only be used when payment methods for this Checkout Session are managed through the [Stripe
     * Dashboard](https://dashboard.stripe.com/settings/payment_methods).
     */
    public var excludedPaymentMethodTypes: List<String>?
      get() = excludedPaymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludedPaymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The integration identifier for this Checkout Session. Multiple Checkout Sessions can have the same integration
     * identifier.
     */
    public var integrationIdentifier: String? = null

    /**
     * ID of the invoice created by the Checkout Session, if it exists.
     */
    public var invoice: InlineCheckoutSessionInvoiceX33315f78? = null

    /**
     * Details on the state of invoice creation for the Checkout Session.
     */
    public var invoiceCreation: InlineCheckoutSessionInvoiceCreationX174def90? = null

    /**
     * The line items purchased by the customer.
     */
    public var lineItems: InlineCheckoutSessionLineItemsX4b81212f? = null

    /**
     * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
     */
    public var locale: InlineCheckoutSessionLocaleX143da667? = null

    /**
     * Settings for Managed Payments for this Checkout Session and resulting
     * [PaymentIntents](/api/payment_intents/object), [Invoices](/api/invoices/object), and
     * [Subscriptions](/api/subscriptions/object).
     */
    public var managedPayments: InlineCheckoutSessionManagedPaymentsX6579696b? = null

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

    public var nameCollection: PaymentPagesCheckoutSessionNameCollection? = null

    private var optionalItemsValue: List<PaymentPagesCheckoutSessionOptionalItem>? = null

    /**
     * The optional items presented to the customer at checkout.
     */
    public var optionalItems: List<PaymentPagesCheckoutSessionOptionalItem>?
      get() = optionalItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionalItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Where the user is coming from. This informs the optimizations that are applied to the session.
     */
    public var originContext: InlineCheckoutSessionOriginContextX589615b9? = null

    /**
     * The ID of the PaymentIntent for Checkout Sessions in `payment` mode. You can't confirm or cancel the
     * PaymentIntent for a Checkout Session. To cancel, [expire the Checkout
     * Session](https://docs.stripe.com/api/checkout/sessions/expire) instead.
     */
    public var paymentIntent: InlineCheckoutSessionPaymentIntentXd92b065b? = null

    /**
     * The ID of the Payment Link that created this Session.
     */
    public var paymentLink: InlineCheckoutSessionPaymentLinkX45e1bc7c? = null

    /**
     * Configure whether a Checkout Session should collect a payment method. Defaults to `always`.
     */
    public var paymentMethodCollection: InlineCheckoutSessionPaymentMethodCollectionX18402ff1? =
        null

    /**
     * Information about the payment method configuration used for this Checkout session if using dynamic payment
     * methods.
     */
    public var paymentMethodConfigurationDetails:
        InlineCheckoutSessionPaymentMethodConfigurationDetailsXb9b22770? = null

    /**
     * Payment-method-specific configuration for the PaymentIntent or SetupIntent of this CheckoutSession.
     */
    public var paymentMethodOptions: InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e? = null

    /**
     * This property is used to set up permissions for various actions (e.g., update) on the CheckoutSession object.
     *
     * For specific permissions, please refer to their dedicated subsections, such as
     * `permissions.update_shipping_details`.
     */
    public var permissions: InlineCheckoutSessionPermissionsXffe1cf3c? = null

    public var phoneNumberCollection: PaymentPagesCheckoutSessionPhoneNumberCollection? = null

    public var presentmentDetails: PaymentFlowsPaymentIntentPresentmentDetails? = null

    /**
     * The ID of the original expired Checkout Session that triggered the recovery flow.
     */
    public var recoveredFrom: String? = null

    /**
     * This parameter applies to `ui_mode: embedded_page`. Learn more about the [redirect
     * behavior](https://docs.stripe.com/payments/checkout/custom-success-page?payment-ui=embedded-form) of embedded
     * sessions. Defaults to `always`.
     */
    public var redirectOnCompletion: InlineCheckoutSessionRedirectOnCompletionX80a8a619? = null

    /**
     * Applies to Checkout Sessions with `ui_mode: embedded_page` or `ui_mode: elements`. The URL to redirect your
     * customer back to after they authenticate or cancel their payment on the payment method's app or site.
     */
    public var returnUrl: String? = null

    /**
     * Controls saved payment method settings for the session. Only available in `payment` and `subscription` mode.
     */
    public var savedPaymentMethodOptions: InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be? =
        null

    /**
     * The ID of the SetupIntent for Checkout Sessions in `setup` mode. You can't confirm or cancel the SetupIntent for
     * a Checkout Session. To cancel, [expire the Checkout
     * Session](https://docs.stripe.com/api/checkout/sessions/expire) instead.
     */
    public var setupIntent: InlineCheckoutSessionSetupIntentX831b441e? = null

    /**
     * When set, provides configuration for Checkout to collect a shipping address from a customer.
     */
    public var shippingAddressCollection: InlineCheckoutSessionShippingAddressCollectionX2994b953? =
        null

    /**
     * The details of the customer cost of shipping, including the customer chosen ShippingRate.
     */
    public var shippingCost: InlineCheckoutSessionShippingCostXd1d434da? = null

    /**
     * The status of the Checkout Session, one of `open`, `complete`, or `expired`.
     */
    public var status: InlineCheckoutSessionStatusX6a7fc5ac? = null

    /**
     * Describes the type of transaction being performed by Checkout in order to customize
     * relevant text on the page, such as the submit button. `submit_type` can only be
     * specified on Checkout Sessions in `payment` mode. If blank or `auto`, `pay` is used.
     */
    public var submitType: InlineCheckoutSessionSubmitTypeXfbbcc564? = null

    /**
     * The ID of the [Subscription](https://docs.stripe.com/api/subscriptions) for Checkout Sessions in `subscription`
     * mode.
     */
    public var subscription: InlineCheckoutSessionSubscriptionXd0282245? = null

    /**
     * The URL the customer will be directed to after the payment or
     * subscription creation is successful.
     */
    public var successUrl: String? = null

    public var taxIdCollection: PaymentPagesCheckoutSessionTaxIdCollection? = null

    /**
     * Tax and discount details for the computed total amount.
     */
    public var totalDetails: InlineCheckoutSessionTotalDetailsXcd1469e3? = null

    /**
     * The UI mode of the Session. Defaults to `hosted_page`.
     */
    public var uiMode: InlineCheckoutSessionUiModeX63ec77c4? = null

    /**
     * The URL to the Checkout Session. Applies to Checkout Sessions with `ui_mode: hosted_page`. Redirect customers to
     * this URL to take them to Checkout. If you’re using [Custom
     * Domains](https://docs.stripe.com/payments/checkout/custom-domains), the URL will use your subdomain. Otherwise,
     * it’ll use `checkout.stripe.com.`
     * This value is only present when the session is active.
     */
    public var url: String? = null

    /**
     * Wallet-specific configuration for this Checkout Session.
     */
    public var walletOptions: InlineCheckoutSessionWalletOptionsX747ecc26? = null

    public fun build(): CheckoutSession {
      check(automaticTaxValue != null) { "automaticTax is required" }
      check(createdValue != null) { "created is required" }
      check(customFieldsValue != null) { "customFields is required" }
      check(customTextValue != null) { "customText is required" }
      check(expiresAtValue != null) { "expiresAt is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(modeValue != null) { "mode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentMethodTypesValue != null) { "paymentMethodTypes is required" }
      check(paymentStatusValue != null) { "paymentStatus is required" }
      check(shippingOptionsValue != null) { "shippingOptions is required" }
      return CheckoutSession(
        automaticTax = automaticTax,
        created = created,
        customFields = customFields,
        customText = customText,
        expiresAt = expiresAt,
        id = id,
        livemode = livemode,
        mode = mode,
        objectValue = objectValue,
        paymentMethodTypes = paymentMethodTypes,
        paymentStatus = paymentStatus,
        shippingOptions = shippingOptions,
        adaptivePricing = adaptivePricing,
        afterExpiration = afterExpiration,
        allowPromotionCodes = allowPromotionCodes,
        amountSubtotal = amountSubtotal,
        amountTotal = amountTotal,
        billingAddressCollection = billingAddressCollection,
        brandingSettings = brandingSettings,
        cancelUrl = cancelUrl,
        clientReferenceId = clientReferenceId,
        clientSecret = clientSecret,
        collectedInformation = collectedInformation,
        consent = consent,
        consentCollection = consentCollection,
        currency = currency,
        currencyConversion = currencyConversion,
        customer = customer,
        customerAccount = customerAccount,
        customerCreation = customerCreation,
        customerDetails = customerDetails,
        customerEmail = customerEmail,
        discounts = discounts,
        excludedPaymentMethodTypes = excludedPaymentMethodTypes,
        integrationIdentifier = integrationIdentifier,
        invoice = invoice,
        invoiceCreation = invoiceCreation,
        lineItems = lineItems,
        locale = locale,
        managedPayments = managedPayments,
        metadata = metadata,
        nameCollection = nameCollection,
        optionalItems = optionalItems,
        originContext = originContext,
        paymentIntent = paymentIntent,
        paymentLink = paymentLink,
        paymentMethodCollection = paymentMethodCollection,
        paymentMethodConfigurationDetails = paymentMethodConfigurationDetails,
        paymentMethodOptions = paymentMethodOptions,
        permissions = permissions,
        phoneNumberCollection = phoneNumberCollection,
        presentmentDetails = presentmentDetails,
        recoveredFrom = recoveredFrom,
        redirectOnCompletion = redirectOnCompletion,
        returnUrl = returnUrl,
        savedPaymentMethodOptions = savedPaymentMethodOptions,
        setupIntent = setupIntent,
        shippingAddressCollection = shippingAddressCollection,
        shippingCost = shippingCost,
        status = status,
        submitType = submitType,
        subscription = subscription,
        successUrl = successUrl,
        taxIdCollection = taxIdCollection,
        totalDetails = totalDetails,
        uiMode = uiMode,
        url = url,
        walletOptions = walletOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutSession = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutSession> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutSession {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutSession")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutSession must be a JSON object")
      val automaticTax = json.decodeRequired<PaymentPagesCheckoutSessionAutomaticTax>(rawObject, "automatic_tax")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val customFields = json.decodeRequired<List<PaymentPagesCheckoutSessionCustomFields>>(rawObject, "custom_fields")
      val customText = json.decodeRequired<PaymentPagesCheckoutSessionCustomText>(rawObject, "custom_text")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val mode = json.decodeRequired<InlineCheckoutSessionModeXf4d293a1>(rawObject, "mode")
      val objectValue = json.decodeRequired<InlineCheckoutSessionObjectValueX29ceafae>(rawObject, "object")
      val paymentMethodTypes = json.decodeRequired<List<String>>(rawObject, "payment_method_types")
      val paymentStatus = json.decodeRequired<InlineCheckoutSessionPaymentStatusX0c3c2c7c>(rawObject, "payment_status")
      val shippingOptions = json.decodeRequired<List<PaymentPagesCheckoutSessionShippingOption>>(rawObject, "shipping_options")
      return CheckoutSession(
        automaticTax = automaticTax,
        created = created,
        customFields = customFields,
        customText = customText,
        expiresAt = expiresAt,
        id = id,
        livemode = livemode,
        mode = mode,
        objectValue = objectValue,
        paymentMethodTypes = paymentMethodTypes,
        paymentStatus = paymentStatus,
        shippingOptions = shippingOptions,
        adaptivePricing = rawObject["adaptive_pricing"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionAdaptivePricingX9958aa95?>(element) },
        afterExpiration = rawObject["after_expiration"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionAfterExpirationXdb3c322f?>(element) },
        allowPromotionCodes = rawObject["allow_promotion_codes"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        amountSubtotal = rawObject["amount_subtotal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountTotal = rawObject["amount_total"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        billingAddressCollection = rawObject["billing_address_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionBillingAddressCollectionXd15fab78?>(element) },
        brandingSettings = rawObject["branding_settings"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionBrandingSettings>(it) },
        cancelUrl = rawObject["cancel_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        clientReferenceId = rawObject["client_reference_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        clientSecret = rawObject["client_secret"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        collectedInformation = rawObject["collected_information"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionCollectedInformationXf8be28b1?>(element) },
        consent = rawObject["consent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionConsentXd40e04a6?>(element) },
        consentCollection = rawObject["consent_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionConsentCollectionX71c17f32?>(element) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        currencyConversion = rawObject["currency_conversion"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionCurrencyConversionXbada3ad5?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionCustomerXff9e59c9?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerCreation = rawObject["customer_creation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionCustomerCreationX45f89ff8?>(element) },
        customerDetails = rawObject["customer_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionCustomerDetailsX1b41d011?>(element) },
        customerEmail = rawObject["customer_email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        discounts = rawObject["discounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PaymentPagesCheckoutSessionDiscount>?>(element) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        integrationIdentifier = rawObject["integration_identifier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoice = rawObject["invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionInvoiceX33315f78?>(element) },
        invoiceCreation = rawObject["invoice_creation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionInvoiceCreationX174def90?>(element) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineCheckoutSessionLineItemsX4b81212f>(it) },
        locale = rawObject["locale"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionLocaleX143da667?>(element) },
        managedPayments = rawObject["managed_payments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionManagedPaymentsX6579696b?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        nameCollection = rawObject["name_collection"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionNameCollection>(it) },
        optionalItems = rawObject["optional_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PaymentPagesCheckoutSessionOptionalItem>?>(element) },
        originContext = rawObject["origin_context"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionOriginContextX589615b9?>(element) },
        paymentIntent = rawObject["payment_intent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionPaymentIntentXd92b065b?>(element) },
        paymentLink = rawObject["payment_link"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionPaymentLinkX45e1bc7c?>(element) },
        paymentMethodCollection = rawObject["payment_method_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionPaymentMethodCollectionX18402ff1?>(element) },
        paymentMethodConfigurationDetails = rawObject["payment_method_configuration_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionPaymentMethodConfigurationDetailsXb9b22770?>(element) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e?>(element) },
        permissions = rawObject["permissions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionPermissionsXffe1cf3c?>(element) },
        phoneNumberCollection = rawObject["phone_number_collection"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionPhoneNumberCollection>(it) },
        presentmentDetails = rawObject["presentment_details"]?.let { json.decodeFromJsonElement<PaymentFlowsPaymentIntentPresentmentDetails>(it) },
        recoveredFrom = rawObject["recovered_from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        redirectOnCompletion = rawObject["redirect_on_completion"]?.let { json.decodeFromJsonElement<InlineCheckoutSessionRedirectOnCompletionX80a8a619>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        savedPaymentMethodOptions = rawObject["saved_payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionSavedPaymentMethodOptionsX80dae6be?>(element) },
        setupIntent = rawObject["setup_intent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionSetupIntentX831b441e?>(element) },
        shippingAddressCollection = rawObject["shipping_address_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionShippingAddressCollectionX2994b953?>(element) },
        shippingCost = rawObject["shipping_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionShippingCostXd1d434da?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionStatusX6a7fc5ac?>(element) },
        submitType = rawObject["submit_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionSubmitTypeXfbbcc564?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionSubscriptionXd0282245?>(element) },
        successUrl = rawObject["success_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxIdCollection = rawObject["tax_id_collection"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionTaxIdCollection>(it) },
        totalDetails = rawObject["total_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionTotalDetailsXcd1469e3?>(element) },
        uiMode = rawObject["ui_mode"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionUiModeX63ec77c4?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        walletOptions = rawObject["wallet_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckoutSessionWalletOptionsX747ecc26?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutSession) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutSession")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("automatic_tax", json.encodeToJsonElement(value.automaticTax))
        put("created", json.encodeToJsonElement(value.created))
        put("custom_fields", json.encodeToJsonElement(value.customFields))
        put("custom_text", json.encodeToJsonElement(value.customText))
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("mode", json.encodeToJsonElement(value.mode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment_method_types", json.encodeToJsonElement(value.paymentMethodTypes))
        put("payment_status", json.encodeToJsonElement(value.paymentStatus))
        put("shipping_options", json.encodeToJsonElement(value.shippingOptions))
        value.adaptivePricing?.let { put("adaptive_pricing", json.encodeToJsonElement(it)) }
        value.afterExpiration?.let { put("after_expiration", json.encodeToJsonElement(it)) }
        value.allowPromotionCodes?.let { put("allow_promotion_codes", json.encodeToJsonElement(it)) }
        value.amountSubtotal?.let { put("amount_subtotal", json.encodeToJsonElement(it)) }
        value.amountTotal?.let { put("amount_total", json.encodeToJsonElement(it)) }
        value.billingAddressCollection?.let { put("billing_address_collection", json.encodeToJsonElement(it)) }
        value.brandingSettings?.let { put("branding_settings", json.encodeToJsonElement(it)) }
        value.cancelUrl?.let { put("cancel_url", it) }
        value.clientReferenceId?.let { put("client_reference_id", it) }
        value.clientSecret?.let { put("client_secret", it) }
        value.collectedInformation?.let { put("collected_information", json.encodeToJsonElement(it)) }
        value.consent?.let { put("consent", json.encodeToJsonElement(it)) }
        value.consentCollection?.let { put("consent_collection", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.currencyConversion?.let { put("currency_conversion", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.customerCreation?.let { put("customer_creation", json.encodeToJsonElement(it)) }
        value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
        value.customerEmail?.let { put("customer_email", it) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.integrationIdentifier?.let { put("integration_identifier", it) }
        value.invoice?.let { put("invoice", json.encodeToJsonElement(it)) }
        value.invoiceCreation?.let { put("invoice_creation", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.locale?.let { put("locale", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nameCollection?.let { put("name_collection", json.encodeToJsonElement(it)) }
        value.optionalItems?.let { put("optional_items", json.encodeToJsonElement(it)) }
        value.originContext?.let { put("origin_context", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
        value.paymentLink?.let { put("payment_link", json.encodeToJsonElement(it)) }
        value.paymentMethodCollection?.let { put("payment_method_collection", json.encodeToJsonElement(it)) }
        value.paymentMethodConfigurationDetails?.let { put("payment_method_configuration_details", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.phoneNumberCollection?.let { put("phone_number_collection", json.encodeToJsonElement(it)) }
        value.presentmentDetails?.let { put("presentment_details", json.encodeToJsonElement(it)) }
        value.recoveredFrom?.let { put("recovered_from", it) }
        value.redirectOnCompletion?.let { put("redirect_on_completion", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.savedPaymentMethodOptions?.let { put("saved_payment_method_options", json.encodeToJsonElement(it)) }
        value.setupIntent?.let { put("setup_intent", json.encodeToJsonElement(it)) }
        value.shippingAddressCollection?.let { put("shipping_address_collection", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.submitType?.let { put("submit_type", json.encodeToJsonElement(it)) }
        value.subscription?.let { put("subscription", json.encodeToJsonElement(it)) }
        value.successUrl?.let { put("success_url", it) }
        value.taxIdCollection?.let { put("tax_id_collection", json.encodeToJsonElement(it)) }
        value.totalDetails?.let { put("total_details", json.encodeToJsonElement(it)) }
        value.uiMode?.let { put("ui_mode", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
        value.walletOptions?.let { put("wallet_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutSession(block: CheckoutSession.Builder.() -> Unit): CheckoutSession = CheckoutSession.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckoutSession is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

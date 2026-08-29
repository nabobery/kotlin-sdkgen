package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormXfec7f1b1.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormXfec7f1b1(
  /**
   * Settings for price localization with [Adaptive
   * Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing).
   */
  public val adaptivePricing:
      InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2? = null,
  /**
   * Configure actions after a Checkout Session has expired. You can't set this parameter if `ui_mode` is `elements`.
   */
  public val afterExpiration:
      InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057? = null,
  /**
   * Enables user redeemable promotion codes.
   */
  public val allowPromotionCodes: Boolean? = null,
  /**
   * Settings for automatic tax lookup for this session and resulting payments, invoices, and subscriptions.
   */
  public val automaticTax: InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4? = null,
  /**
   * Specify whether Checkout should collect the customer's billing address. Defaults to `auto`.
   */
  public val billingAddressCollection:
      InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e? = null,
  /**
   * The branding settings for the Checkout Session. This parameter is not allowed if ui_mode is `elements`.
   */
  public val brandingSettings:
      InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02? = null,
  /**
   * If set, Checkout displays a back button and customers will be directed to this URL if they decide to cancel payment
   * and return to your website. This parameter is not allowed if ui_mode is `embedded_page` or `elements`.
   */
  public val cancelUrl: String? = null,
  /**
   * A unique string to reference the Checkout Session. This can be a
   * customer ID, a cart ID, or similar, and can be used to reconcile the
   * session with your internal systems.
   */
  public val clientReferenceId: String? = null,
  /**
   * Configure fields for the Checkout Session to gather active consent from customers.
   */
  public val consentCollection:
      InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies). Required in `setup` mode when `payment_method_types` is
   * not set.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  customFields: List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05>? = null,
  /**
   * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is
   * `custom`.
   */
  public val customText: InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c? = null,
  /**
   * ID of an existing Customer, if one exists. In `payment` mode, the customer’s most recently saved card
   * payment method will be used to prefill the email, name, card details, and billing address
   * on the Checkout page. In `subscription` mode, the customer’s [default payment
   * method](https://docs.stripe.com/api/customers/update#update_customer-invoice_settings-default_payment_method)
   * will be used if it’s a card, otherwise the most recently saved card will be used. A valid billing address, billing
   * name and billing email are required on the payment method for Checkout to prefill the customer's card details.
   *
   * If the Customer already has a valid [email](https://docs.stripe.com/api/customers/object#customer_object-email)
   * set, the email will be prefilled and not editable in Checkout.
   * If the Customer does not have a valid `email`, Checkout will set the email entered during the session on the
   * Customer.
   *
   * If blank for Checkout Sessions in `subscription` mode or with `customer_creation` set as `always` in `payment`
   * mode, Checkout will create a new Customer object based on information provided during the payment flow.
   *
   * You can set
   * [`payment_intent_data.setup_future_usage`](https://docs.stripe.com/api/checkout/sessions/create#create_checkout_ses
   * sion-payment_intent_data-setup_future_usage) to have Checkout automatically attach the payment method to the
   * Customer you pass in for future reuse.
   */
  public val customer: String? = null,
  /**
   * ID of an existing Account, if one exists. Has the same behavior as `customer`.
   */
  public val customerAccount: String? = null,
  /**
   * Configure whether a Checkout Session creates a [Customer](https://docs.stripe.com/api/customers) during Session
   * confirmation.
   *
   * When a Customer is not created, you can still retrieve email, address, and other customer data entered in Checkout
   * with
   * [customer_details](https://docs.stripe.com/api/checkout/sessions/object#checkout_session_object-customer_details).
   *
   * Sessions that don't create Customers instead are grouped by [guest
   * customers](https://docs.stripe.com/payments/checkout/guest-customers)
   * in the Dashboard. Promotion codes limited to first time customers will return invalid for these Sessions.
   *
   * Can only be set in `payment` and `setup` mode.
   */
  public val customerCreation:
      InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406? = null,
  /**
   * If provided, this value will be used when the Customer object is created.
   * If not provided, customers will be asked to enter their email address.
   * Use this parameter to prefill customer data if you already have an email
   * on file. To access information about the customer once a session is
   * complete, use the `customer` field.
   */
  public val customerEmail: String? = null,
  /**
   * Controls what fields on Customer can be updated by the Checkout Session. Can only be provided when `customer` is
   * provided.
   */
  public val customerUpdate: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0? = null,
  discounts: List<InlineV1CheckoutSessionsPostRequestFormDiscountsItemX84449925>? = null,
  excludedPaymentMethodTypes: List<InlineV1CheckoutSessionsPostRequestFormExcludedPaymentMethodTypesItemX41500b9c>? = null,
  expand: List<String>? = null,
  /**
   * The Epoch time in seconds at which the Checkout Session will expire. It can be anywhere from 30 minutes to 24 hours
   * after Checkout Session creation. By default, this value is 24 hours from creation.
   */
  public val expiresAt: Int? = null,
  /**
   * The integration identifier for this Checkout Session. Multiple Checkout Sessions can have the same integration
   * identifier.
   */
  public val integrationIdentifier: String? = null,
  /**
   * Generate a post-purchase Invoice for one-time payments.
   */
  public val invoiceCreation:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd? = null,
  lineItems: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3>? = null,
  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
   */
  public val locale: InlineV1CheckoutSessionsPostRequestFormLocaleXc67a5bfc? = null,
  /**
   * Settings for Managed Payments for this Checkout Session and resulting
   * [PaymentIntents](/api/payment_intents/object), [Invoices](/api/invoices/object), and
   * [Subscriptions](/api/subscriptions/object).
   */
  public val managedPayments:
      InlineV1CheckoutSessionsPostRequestFormManagedPaymentsX28369c5b? = null,
  metadata: Map<String, String>? = null,
  /**
   * The mode of the Checkout Session. Pass `subscription` if the Checkout Session includes at least one recurring item.
   */
  public val mode: InlineV1CheckoutSessionsPostRequestFormModeX4d491c23? = null,
  /**
   * Controls name collection settings for the session.
   *
   * You can configure Checkout to collect your customers' business names, individual names, or both. Each name field
   * can be either required or optional.
   *
   * If a [Customer](https://docs.stripe.com/api/customers) is created or provided, the names can be saved to the
   * Customer object as well.
   */
  public val nameCollection: InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63? = null,
  optionalItems: List<InlineV1CheckoutSessionsPostRequestFormOptionalItemsItemX9e5ceb0b>? = null,
  /**
   * Where the user is coming from. This informs the optimizations that are applied to the session. You can't set this
   * parameter if `ui_mode` is `elements`.
   */
  public val originContext: InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b? = null,
  /**
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
   */
  public val paymentIntentData:
      InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b? = null,
  /**
   * Specify whether Checkout should collect a payment method. When set to `if_required`, Checkout will not collect a
   * payment method when the total due for the session is 0.
   * This may occur if the Checkout Session includes a free trial or a discount.
   *
   * Can only be set in `subscription` mode. Defaults to `always`.
   *
   * If you'd like information on how to collect a payment method outside of Checkout, read the guide on configuring
   * [subscriptions with a free trial](https://docs.stripe.com/payments/checkout/free-trials).
   */
  public val paymentMethodCollection:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodCollectionX43f11047? = null,
  /**
   * The ID of the payment method configuration to use with this Checkout session.
   */
  public val paymentMethodConfiguration: String? = null,
  /**
   * This parameter allows you to set some attributes on the payment method created during a Checkout session.
   */
  public val paymentMethodData:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232? = null,
  /**
   * Payment-method-specific configuration.
   */
  public val paymentMethodOptions:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f? = null,
  paymentMethodTypes: List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodTypesItemX121556da>? = null,
  /**
   * This property is used to set up permissions for various actions (e.g., update) on the CheckoutSession object. Can
   * only be set when creating `embedded` or `custom` sessions.
   *
   * For specific permissions, please refer to their dedicated subsections, such as
   * `permissions.update_shipping_details`.
   */
  public val permissions: InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c? = null,
  /**
   * Controls phone number collection settings for the session.
   *
   * We recommend that you review your privacy policy and check with your legal contacts
   * before using this feature. Learn more about [collecting phone numbers with
   * Checkout](https://docs.stripe.com/payments/checkout/phone-numbers).
   */
  public val phoneNumberCollection:
      InlineV1CheckoutSessionsPostRequestFormPhoneNumberCollectionX61835e05? = null,
  /**
   * This parameter applies to `ui_mode: embedded_page`. Learn more about the [redirect
   * behavior](https://docs.stripe.com/payments/checkout/custom-success-page?payment-ui=embedded-form) of embedded
   * sessions. Defaults to `always`.
   */
  public val redirectOnCompletion:
      InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404? = null,
  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on the
   * payment method's app or site. This parameter is required if `ui_mode` is `embedded_page` or `elements`
   * and redirect-based payment methods are enabled on the session.
   */
  public val returnUrl: String? = null,
  /**
   * Controls saved payment method settings for the session. Only available in `payment` and `subscription` mode.
   */
  public val savedPaymentMethodOptions:
      InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3? = null,
  /**
   * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in `setup` mode.
   */
  public val setupIntentData:
      InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d? = null,
  /**
   * When set, provides configuration for Checkout to collect a shipping address from a customer.
   */
  public val shippingAddressCollection:
      InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb? = null,
  shippingOptions: List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845>? = null,
  /**
   * Describes the type of transaction being performed by Checkout in order
   * to customize relevant text on the page, such as the submit button.
   * `submit_type` can only be specified on Checkout Sessions in
   * `payment` or `subscription` mode. If blank or `auto`, `pay` is used.
   * You can't set this parameter if `ui_mode` is `elements`.
   */
  public val submitType: InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8? = null,
  /**
   * A subset of parameters to be passed to subscription creation for Checkout Sessions in `subscription` mode.
   */
  public val subscriptionData:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5? = null,
  /**
   * The URL to which Stripe should send customers when payment or setup
   * is complete.
   * This parameter is not allowed if ui_mode is `embedded_page` or `elements`. If you'd like to use
   * information from the successful Checkout Session on your page, read the
   * guide on [customizing your success page](https://docs.stripe.com/payments/checkout/custom-success-page).
   */
  public val successUrl: String? = null,
  /**
   * Controls tax ID collection during checkout.
   */
  public val taxIdCollection:
      InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8? = null,
  /**
   * The UI mode of the Session. Defaults to `hosted_page`.
   */
  public val uiMode: InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d? = null,
  /**
   * Wallet-specific configuration.
   */
  public val walletOptions: InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24? = null,
) {
  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't set
   * this parameter if `ui_mode` is `custom`.
   */
  public val customFields: List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05>? =
      customFields?.let { collection0 -> collection0.toList() }

  /**
   * The coupon or promotion code to apply to this Session. Currently, only up to one may be specified.
   */
  public val discounts: List<InlineV1CheckoutSessionsPostRequestFormDiscountsItemX84449925>? =
      discounts?.let { collection0 -> collection0.toList() }

  /**
   * A list of the types of payment methods (e.g., `card`) that should be excluded from this Checkout Session. This
   * should only be used when payment methods for this Checkout Session are managed through the [Stripe
   * Dashboard](https://dashboard.stripe.com/settings/payment_methods).
   */
  public val excludedPaymentMethodTypes:
      List<InlineV1CheckoutSessionsPostRequestFormExcludedPaymentMethodTypesItemX41500b9c>? =
      excludedPaymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * A list of items the customer is purchasing. Use this parameter to pass one-time or recurring
   * [Prices](https://docs.stripe.com/api/prices). The parameter is required for `payment` and `subscription` mode.
   *
   * For `payment` mode, there is a maximum of 100 line items, however it is recommended to consolidate line items if
   * there are more than a few dozen.
   *
   * For `subscription` mode, there is a maximum of 20 line items with recurring Prices and 20 line items with one-time
   * Prices. Line items with one-time Prices will be on the initial invoice only.
   */
  public val lineItems: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3>? =
      lineItems?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
   * recurring [Prices](https://docs.stripe.com/api/prices).
   *
   * There is a maximum of 10 optional items allowed on a Checkout Session, and the existing limits on the number of
   * line items allowed on a Checkout Session apply to the combined number of line items and optional items.
   *
   * For `payment` mode, there is a maximum of 100 combined line items and optional items, however it is recommended to
   * consolidate items if there are more than a few dozen.
   *
   * For `subscription` mode, there is a maximum of 20 line items and optional items with recurring Prices and 20 line
   * items and optional items with one-time Prices.
   *
   * You can't set this parameter if `ui_mode` is `custom`.
   */
  public val optionalItems: List<InlineV1CheckoutSessionsPostRequestFormOptionalItemsItemX9e5ceb0b>?
      = optionalItems?.let { collection0 -> collection0.toList() }

  /**
   * A list of the types of payment methods (e.g., `card`) this Checkout Session can accept.
   *
   * You can omit this attribute to manage your payment methods from the [Stripe
   * Dashboard](https://dashboard.stripe.com/settings/payment_methods).
   * See [Dynamic Payment
   * Methods](https://docs.stripe.com/payments/payment-methods/integration-options#using-dynamic-payment-methods) for
   * more details.
   *
   * Read more about the supported payment methods and their requirements in our [payment
   * method details guide](/docs/payments/checkout/payment-methods).
   *
   * If multiple payment methods are passed, Checkout will dynamically reorder them to
   * prioritize the most relevant payment methods based on the customer's location and
   * other characteristics.
   */
  public val paymentMethodTypes:
      List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodTypesItemX121556da>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * The shipping rate options to apply to this Session. Up to a maximum of 5.
   */
  public val shippingOptions:
      List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845>? =
      shippingOptions?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Settings for price localization with [Adaptive
     * Pricing](https://docs.stripe.com/payments/checkout/adaptive-pricing).
     */
    public var adaptivePricing: InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2? =
        null

    /**
     * Configure actions after a Checkout Session has expired. You can't set this parameter if `ui_mode` is `elements`.
     */
    public var afterExpiration: InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057? =
        null

    /**
     * Enables user redeemable promotion codes.
     */
    public var allowPromotionCodes: Boolean? = null

    /**
     * Settings for automatic tax lookup for this session and resulting payments, invoices, and subscriptions.
     */
    public var automaticTax: InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4? = null

    /**
     * Specify whether Checkout should collect the customer's billing address. Defaults to `auto`.
     */
    public var billingAddressCollection:
        InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e? = null

    /**
     * The branding settings for the Checkout Session. This parameter is not allowed if ui_mode is `elements`.
     */
    public var brandingSettings: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02? =
        null

    /**
     * If set, Checkout displays a back button and customers will be directed to this URL if they decide to cancel
     * payment and return to your website. This parameter is not allowed if ui_mode is `embedded_page` or `elements`.
     */
    public var cancelUrl: String? = null

    /**
     * A unique string to reference the Checkout Session. This can be a
     * customer ID, a cart ID, or similar, and can be used to reconcile the
     * session with your internal systems.
     */
    public var clientReferenceId: String? = null

    /**
     * Configure fields for the Checkout Session to gather active consent from customers.
     */
    public var consentCollection: InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757?
        = null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies). Required in `setup` mode when `payment_method_types` is
     * not set.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    private var customFieldsValue:
        List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05>? = null

    /**
     * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't
     * set this parameter if `ui_mode` is `custom`.
     */
    public var customFields: List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05>?
      get() = customFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is
     * `custom`.
     */
    public var customText: InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c? = null

    /**
     * ID of an existing Customer, if one exists. In `payment` mode, the customer’s most recently saved card
     * payment method will be used to prefill the email, name, card details, and billing address
     * on the Checkout page. In `subscription` mode, the customer’s [default payment
     * method](https://docs.stripe.com/api/customers/update#update_customer-invoice_settings-default_payment_method)
     * will be used if it’s a card, otherwise the most recently saved card will be used. A valid billing address,
     * billing name and billing email are required on the payment method for Checkout to prefill the customer's card
     * details.
     *
     * If the Customer already has a valid [email](https://docs.stripe.com/api/customers/object#customer_object-email)
     * set, the email will be prefilled and not editable in Checkout.
     * If the Customer does not have a valid `email`, Checkout will set the email entered during the session on the
     * Customer.
     *
     * If blank for Checkout Sessions in `subscription` mode or with `customer_creation` set as `always` in `payment`
     * mode, Checkout will create a new Customer object based on information provided during the payment flow.
     *
     * You can set
     * [`payment_intent_data.setup_future_usage`](https://docs.stripe.com/api/checkout/sessions/create#create_checkout_s
     * ession-payment_intent_data-setup_future_usage) to have Checkout automatically attach the payment method to the
     * Customer you pass in for future reuse.
     */
    public var customer: String? = null

    /**
     * ID of an existing Account, if one exists. Has the same behavior as `customer`.
     */
    public var customerAccount: String? = null

    /**
     * Configure whether a Checkout Session creates a [Customer](https://docs.stripe.com/api/customers) during Session
     * confirmation.
     *
     * When a Customer is not created, you can still retrieve email, address, and other customer data entered in
     * Checkout
     * with
     * [customer_details](https://docs.stripe.com/api/checkout/sessions/object#checkout_session_object-customer_details)
     * .
     *
     * Sessions that don't create Customers instead are grouped by [guest
     * customers](https://docs.stripe.com/payments/checkout/guest-customers)
     * in the Dashboard. Promotion codes limited to first time customers will return invalid for these Sessions.
     *
     * Can only be set in `payment` and `setup` mode.
     */
    public var customerCreation: InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406? =
        null

    /**
     * If provided, this value will be used when the Customer object is created.
     * If not provided, customers will be asked to enter their email address.
     * Use this parameter to prefill customer data if you already have an email
     * on file. To access information about the customer once a session is
     * complete, use the `customer` field.
     */
    public var customerEmail: String? = null

    /**
     * Controls what fields on Customer can be updated by the Checkout Session. Can only be provided when `customer` is
     * provided.
     */
    public var customerUpdate: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0? =
        null

    private var discountsValue: List<InlineV1CheckoutSessionsPostRequestFormDiscountsItemX84449925>?
        = null

    /**
     * The coupon or promotion code to apply to this Session. Currently, only up to one may be specified.
     */
    public var discounts: List<InlineV1CheckoutSessionsPostRequestFormDiscountsItemX84449925>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var excludedPaymentMethodTypesValue:
        List<InlineV1CheckoutSessionsPostRequestFormExcludedPaymentMethodTypesItemX41500b9c>? = null

    /**
     * A list of the types of payment methods (e.g., `card`) that should be excluded from this Checkout Session. This
     * should only be used when payment methods for this Checkout Session are managed through the [Stripe
     * Dashboard](https://dashboard.stripe.com/settings/payment_methods).
     */
    public var excludedPaymentMethodTypes:
        List<InlineV1CheckoutSessionsPostRequestFormExcludedPaymentMethodTypesItemX41500b9c>?
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
     * The Epoch time in seconds at which the Checkout Session will expire. It can be anywhere from 30 minutes to 24
     * hours after Checkout Session creation. By default, this value is 24 hours from creation.
     */
    public var expiresAt: Int? = null

    /**
     * The integration identifier for this Checkout Session. Multiple Checkout Sessions can have the same integration
     * identifier.
     */
    public var integrationIdentifier: String? = null

    /**
     * Generate a post-purchase Invoice for one-time payments.
     */
    public var invoiceCreation: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd? =
        null

    private var lineItemsValue: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3>?
        = null

    /**
     * A list of items the customer is purchasing. Use this parameter to pass one-time or recurring
     * [Prices](https://docs.stripe.com/api/prices). The parameter is required for `payment` and `subscription` mode.
     *
     * For `payment` mode, there is a maximum of 100 line items, however it is recommended to consolidate line items if
     * there are more than a few dozen.
     *
     * For `subscription` mode, there is a maximum of 20 line items with recurring Prices and 20 line items with
     * one-time Prices. Line items with one-time Prices will be on the initial invoice only.
     */
    public var lineItems: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3>?
      get() = lineItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lineItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
     */
    public var locale: InlineV1CheckoutSessionsPostRequestFormLocaleXc67a5bfc? = null

    /**
     * Settings for Managed Payments for this Checkout Session and resulting
     * [PaymentIntents](/api/payment_intents/object), [Invoices](/api/invoices/object), and
     * [Subscriptions](/api/subscriptions/object).
     */
    public var managedPayments: InlineV1CheckoutSessionsPostRequestFormManagedPaymentsX28369c5b? =
        null

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
     * The mode of the Checkout Session. Pass `subscription` if the Checkout Session includes at least one recurring
     * item.
     */
    public var mode: InlineV1CheckoutSessionsPostRequestFormModeX4d491c23? = null

    /**
     * Controls name collection settings for the session.
     *
     * You can configure Checkout to collect your customers' business names, individual names, or both. Each name field
     * can be either required or optional.
     *
     * If a [Customer](https://docs.stripe.com/api/customers) is created or provided, the names can be saved to the
     * Customer object as well.
     */
    public var nameCollection: InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63? =
        null

    private var optionalItemsValue:
        List<InlineV1CheckoutSessionsPostRequestFormOptionalItemsItemX9e5ceb0b>? = null

    /**
     * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
     * recurring [Prices](https://docs.stripe.com/api/prices).
     *
     * There is a maximum of 10 optional items allowed on a Checkout Session, and the existing limits on the number of
     * line items allowed on a Checkout Session apply to the combined number of line items and optional items.
     *
     * For `payment` mode, there is a maximum of 100 combined line items and optional items, however it is recommended
     * to consolidate items if there are more than a few dozen.
     *
     * For `subscription` mode, there is a maximum of 20 line items and optional items with recurring Prices and 20 line
     * items and optional items with one-time Prices.
     *
     * You can't set this parameter if `ui_mode` is `custom`.
     */
    public var optionalItems:
        List<InlineV1CheckoutSessionsPostRequestFormOptionalItemsItemX9e5ceb0b>?
      get() = optionalItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionalItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Where the user is coming from. This informs the optimizations that are applied to the session. You can't set this
     * parameter if `ui_mode` is `elements`.
     */
    public var originContext: InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b? = null

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
     */
    public var paymentIntentData: InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b?
        = null

    /**
     * Specify whether Checkout should collect a payment method. When set to `if_required`, Checkout will not collect a
     * payment method when the total due for the session is 0.
     * This may occur if the Checkout Session includes a free trial or a discount.
     *
     * Can only be set in `subscription` mode. Defaults to `always`.
     *
     * If you'd like information on how to collect a payment method outside of Checkout, read the guide on configuring
     * [subscriptions with a free trial](https://docs.stripe.com/payments/checkout/free-trials).
     */
    public var paymentMethodCollection:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodCollectionX43f11047? = null

    /**
     * The ID of the payment method configuration to use with this Checkout session.
     */
    public var paymentMethodConfiguration: String? = null

    /**
     * This parameter allows you to set some attributes on the payment method created during a Checkout session.
     */
    public var paymentMethodData: InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232?
        = null

    /**
     * Payment-method-specific configuration.
     */
    public var paymentMethodOptions:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f? = null

    private var paymentMethodTypesValue:
        List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodTypesItemX121556da>? = null

    /**
     * A list of the types of payment methods (e.g., `card`) this Checkout Session can accept.
     *
     * You can omit this attribute to manage your payment methods from the [Stripe
     * Dashboard](https://dashboard.stripe.com/settings/payment_methods).
     * See [Dynamic Payment
     * Methods](https://docs.stripe.com/payments/payment-methods/integration-options#using-dynamic-payment-methods) for
     * more details.
     *
     * Read more about the supported payment methods and their requirements in our [payment
     * method details guide](/docs/payments/checkout/payment-methods).
     *
     * If multiple payment methods are passed, Checkout will dynamically reorder them to
     * prioritize the most relevant payment methods based on the customer's location and
     * other characteristics.
     */
    public var paymentMethodTypes:
        List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodTypesItemX121556da>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * This property is used to set up permissions for various actions (e.g., update) on the CheckoutSession object. Can
     * only be set when creating `embedded` or `custom` sessions.
     *
     * For specific permissions, please refer to their dedicated subsections, such as
     * `permissions.update_shipping_details`.
     */
    public var permissions: InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c? = null

    /**
     * Controls phone number collection settings for the session.
     *
     * We recommend that you review your privacy policy and check with your legal contacts
     * before using this feature. Learn more about [collecting phone numbers with
     * Checkout](https://docs.stripe.com/payments/checkout/phone-numbers).
     */
    public var phoneNumberCollection:
        InlineV1CheckoutSessionsPostRequestFormPhoneNumberCollectionX61835e05? = null

    /**
     * This parameter applies to `ui_mode: embedded_page`. Learn more about the [redirect
     * behavior](https://docs.stripe.com/payments/checkout/custom-success-page?payment-ui=embedded-form) of embedded
     * sessions. Defaults to `always`.
     */
    public var redirectOnCompletion:
        InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404? = null

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on the
     * payment method's app or site. This parameter is required if `ui_mode` is `embedded_page` or `elements`
     * and redirect-based payment methods are enabled on the session.
     */
    public var returnUrl: String? = null

    /**
     * Controls saved payment method settings for the session. Only available in `payment` and `subscription` mode.
     */
    public var savedPaymentMethodOptions:
        InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3? = null

    /**
     * A subset of parameters to be passed to SetupIntent creation for Checkout Sessions in `setup` mode.
     */
    public var setupIntentData: InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d? =
        null

    /**
     * When set, provides configuration for Checkout to collect a shipping address from a customer.
     */
    public var shippingAddressCollection:
        InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb? = null

    private var shippingOptionsValue:
        List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845>? = null

    /**
     * The shipping rate options to apply to this Session. Up to a maximum of 5.
     */
    public var shippingOptions:
        List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845>?
      get() = shippingOptionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        shippingOptionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Describes the type of transaction being performed by Checkout in order
     * to customize relevant text on the page, such as the submit button.
     * `submit_type` can only be specified on Checkout Sessions in
     * `payment` or `subscription` mode. If blank or `auto`, `pay` is used.
     * You can't set this parameter if `ui_mode` is `elements`.
     */
    public var submitType: InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8? = null

    /**
     * A subset of parameters to be passed to subscription creation for Checkout Sessions in `subscription` mode.
     */
    public var subscriptionData: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5? =
        null

    /**
     * The URL to which Stripe should send customers when payment or setup
     * is complete.
     * This parameter is not allowed if ui_mode is `embedded_page` or `elements`. If you'd like to use
     * information from the successful Checkout Session on your page, read the
     * guide on [customizing your success page](https://docs.stripe.com/payments/checkout/custom-success-page).
     */
    public var successUrl: String? = null

    /**
     * Controls tax ID collection during checkout.
     */
    public var taxIdCollection: InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8? =
        null

    /**
     * The UI mode of the Session. Defaults to `hosted_page`.
     */
    public var uiMode: InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d? = null

    /**
     * Wallet-specific configuration.
     */
    public var walletOptions: InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormXfec7f1b1 = InlineV1CheckoutSessionsPostRequestFormXfec7f1b1(
      adaptivePricing = adaptivePricing,
      afterExpiration = afterExpiration,
      allowPromotionCodes = allowPromotionCodes,
      automaticTax = automaticTax,
      billingAddressCollection = billingAddressCollection,
      brandingSettings = brandingSettings,
      cancelUrl = cancelUrl,
      clientReferenceId = clientReferenceId,
      consentCollection = consentCollection,
      currency = currency,
      customFields = customFields,
      customText = customText,
      customer = customer,
      customerAccount = customerAccount,
      customerCreation = customerCreation,
      customerEmail = customerEmail,
      customerUpdate = customerUpdate,
      discounts = discounts,
      excludedPaymentMethodTypes = excludedPaymentMethodTypes,
      expand = expand,
      expiresAt = expiresAt,
      integrationIdentifier = integrationIdentifier,
      invoiceCreation = invoiceCreation,
      lineItems = lineItems,
      locale = locale,
      managedPayments = managedPayments,
      metadata = metadata,
      mode = mode,
      nameCollection = nameCollection,
      optionalItems = optionalItems,
      originContext = originContext,
      paymentIntentData = paymentIntentData,
      paymentMethodCollection = paymentMethodCollection,
      paymentMethodConfiguration = paymentMethodConfiguration,
      paymentMethodData = paymentMethodData,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      permissions = permissions,
      phoneNumberCollection = phoneNumberCollection,
      redirectOnCompletion = redirectOnCompletion,
      returnUrl = returnUrl,
      savedPaymentMethodOptions = savedPaymentMethodOptions,
      setupIntentData = setupIntentData,
      shippingAddressCollection = shippingAddressCollection,
      shippingOptions = shippingOptions,
      submitType = submitType,
      subscriptionData = subscriptionData,
      successUrl = successUrl,
      taxIdCollection = taxIdCollection,
      uiMode = uiMode,
      walletOptions = walletOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormXfec7f1b1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormXfec7f1b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormXfec7f1b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormXfec7f1b1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormXfec7f1b1 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormXfec7f1b1(
        adaptivePricing = rawObject["adaptive_pricing"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAdaptivePricingX5d1e82e2>(it) },
        afterExpiration = rawObject["after_expiration"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAfterExpirationX7ea5f057>(it) },
        allowPromotionCodes = rawObject["allow_promotion_codes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4>(it) },
        billingAddressCollection = rawObject["billing_address_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBillingAddressCollectionX37212d9e>(it) },
        brandingSettings = rawObject["branding_settings"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsX3b77ee02>(it) },
        cancelUrl = rawObject["cancel_url"]?.let { json.decodeFromJsonElement<String>(it) },
        clientReferenceId = rawObject["client_reference_id"]?.let { json.decodeFromJsonElement<String>(it) },
        consentCollection = rawObject["consent_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormConsentCollectionX6ac5d757>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemX590b8a05>>(it) },
        customText = rawObject["custom_text"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        customerCreation = rawObject["customer_creation"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406>(it) },
        customerEmail = rawObject["customer_email"]?.let { json.decodeFromJsonElement<String>(it) },
        customerUpdate = rawObject["customer_update"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateX6b07f2a0>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormDiscountsItemX84449925>>(it) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormExcludedPaymentMethodTypesItemX41500b9c>>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        integrationIdentifier = rawObject["integration_identifier"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceCreation = rawObject["invoice_creation"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationXe7ab14dd>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3>>(it) },
        locale = rawObject["locale"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLocaleXc67a5bfc>(it) },
        managedPayments = rawObject["managed_payments"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormManagedPaymentsX28369c5b>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormModeX4d491c23>(it) },
        nameCollection = rawObject["name_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63>(it) },
        optionalItems = rawObject["optional_items"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormOptionalItemsItemX9e5ceb0b>>(it) },
        originContext = rawObject["origin_context"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b>(it) },
        paymentIntentData = rawObject["payment_intent_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentIntentDataXcfe9f51b>(it) },
        paymentMethodCollection = rawObject["payment_method_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodCollectionX43f11047>(it) },
        paymentMethodConfiguration = rawObject["payment_method_configuration"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodDataX3301b232>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodTypesItemX121556da>>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPermissionsX7c93388c>(it) },
        phoneNumberCollection = rawObject["phone_number_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPhoneNumberCollectionX61835e05>(it) },
        redirectOnCompletion = rawObject["redirect_on_completion"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormRedirectOnCompletionX42846404>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        savedPaymentMethodOptions = rawObject["saved_payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOptionsX79a210d3>(it) },
        setupIntentData = rawObject["setup_intent_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupIntentDataX67888f5d>(it) },
        shippingAddressCollection = rawObject["shipping_address_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingAddressCollectionX9637aeeb>(it) },
        shippingOptions = rawObject["shipping_options"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemXe60b9845>>(it) },
        submitType = rawObject["submit_type"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubmitTypeXa86e74d8>(it) },
        subscriptionData = rawObject["subscription_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5>(it) },
        successUrl = rawObject["success_url"]?.let { json.decodeFromJsonElement<String>(it) },
        taxIdCollection = rawObject["tax_id_collection"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormTaxIdCollectionX56a0acb8>(it) },
        uiMode = rawObject["ui_mode"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d>(it) },
        walletOptions = rawObject["wallet_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormWalletOptionsX76a7ca24>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormXfec7f1b1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormXfec7f1b1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.adaptivePricing?.let { put("adaptive_pricing", json.encodeToJsonElement(it)) }
        value.afterExpiration?.let { put("after_expiration", json.encodeToJsonElement(it)) }
        value.allowPromotionCodes?.let { put("allow_promotion_codes", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.billingAddressCollection?.let { put("billing_address_collection", json.encodeToJsonElement(it)) }
        value.brandingSettings?.let { put("branding_settings", json.encodeToJsonElement(it)) }
        value.cancelUrl?.let { put("cancel_url", it) }
        value.clientReferenceId?.let { put("client_reference_id", it) }
        value.consentCollection?.let { put("consent_collection", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.customText?.let { put("custom_text", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.customerCreation?.let { put("customer_creation", json.encodeToJsonElement(it)) }
        value.customerEmail?.let { put("customer_email", it) }
        value.customerUpdate?.let { put("customer_update", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.integrationIdentifier?.let { put("integration_identifier", it) }
        value.invoiceCreation?.let { put("invoice_creation", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.locale?.let { put("locale", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
        value.nameCollection?.let { put("name_collection", json.encodeToJsonElement(it)) }
        value.optionalItems?.let { put("optional_items", json.encodeToJsonElement(it)) }
        value.originContext?.let { put("origin_context", json.encodeToJsonElement(it)) }
        value.paymentIntentData?.let { put("payment_intent_data", json.encodeToJsonElement(it)) }
        value.paymentMethodCollection?.let { put("payment_method_collection", json.encodeToJsonElement(it)) }
        value.paymentMethodConfiguration?.let { put("payment_method_configuration", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.phoneNumberCollection?.let { put("phone_number_collection", json.encodeToJsonElement(it)) }
        value.redirectOnCompletion?.let { put("redirect_on_completion", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.savedPaymentMethodOptions?.let { put("saved_payment_method_options", json.encodeToJsonElement(it)) }
        value.setupIntentData?.let { put("setup_intent_data", json.encodeToJsonElement(it)) }
        value.shippingAddressCollection?.let { put("shipping_address_collection", json.encodeToJsonElement(it)) }
        value.shippingOptions?.let { put("shipping_options", json.encodeToJsonElement(it)) }
        value.submitType?.let { put("submit_type", json.encodeToJsonElement(it)) }
        value.subscriptionData?.let { put("subscription_data", json.encodeToJsonElement(it)) }
        value.successUrl?.let { put("success_url", it) }
        value.taxIdCollection?.let { put("tax_id_collection", json.encodeToJsonElement(it)) }
        value.uiMode?.let { put("ui_mode", json.encodeToJsonElement(it)) }
        value.walletOptions?.let { put("wallet_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormXfec7f1b1(block: InlineV1CheckoutSessionsPostRequestFormXfec7f1b1.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormXfec7f1b1 = InlineV1CheckoutSessionsPostRequestFormXfec7f1b1.build(block)

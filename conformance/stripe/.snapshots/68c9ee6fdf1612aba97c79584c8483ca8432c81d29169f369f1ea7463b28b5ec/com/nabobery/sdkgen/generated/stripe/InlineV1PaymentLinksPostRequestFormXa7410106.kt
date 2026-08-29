package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormXa7410106.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormXa7410106(
  lineItems: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb>,
  /**
   * Behavior after the purchase is complete.
   */
  public val afterCompletion: InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4? = null,
  /**
   * Enables user redeemable promotion codes.
   */
  public val allowPromotionCodes: Boolean? = null,
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account. Can only be applied when there are no line items with recurring prices.
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at
   * least 1 line item with a recurring price to use this field.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  /**
   * Configuration for automatic tax collection.
   */
  public val automaticTax: InlineV1PaymentLinksPostRequestFormAutomaticTaxXb1487bd2? = null,
  /**
   * Configuration for collecting the customer's billing address. Defaults to `auto`.
   */
  public val billingAddressCollection:
      InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX582cdf31? = null,
  /**
   * Configure fields to gather active consent from customers.
   */
  public val consentCollection:
      InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e? = null,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies) and supported by each line item's price.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  customFields: List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174>? = null,
  /**
   * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is
   * `custom`.
   */
  public val customText: InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93? = null,
  /**
   * Configures whether [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment link
   * create a [Customer](https://docs.stripe.com/api/customers).
   */
  public val customerCreation: InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af? = null,
  expand: List<String>? = null,
  /**
   * The custom message to be displayed to a customer when a payment link is no longer active.
   */
  public val inactiveMessage: String? = null,
  /**
   * Generate a post-purchase Invoice for one-time payments.
   */
  public val invoiceCreation: InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b? = null,
  /**
   * Settings for Managed Payments for this Payment Link and resulting
   * [CheckoutSessions](/api/checkout/sessions/object), [PaymentIntents](/api/payment_intents/object),
   * [Invoices](/api/invoices/object), and [Subscriptions](/api/subscriptions/object).
   */
  public val managedPayments: InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755? = null,
  metadata: Map<String, String>? = null,
  /**
   * Controls settings applied for collecting the customer's name.
   */
  public val nameCollection: InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5? = null,
  /**
   * The account on behalf of which to charge.
   */
  public val onBehalfOf: String? = null,
  optionalItems: List<InlineV1PaymentLinksPostRequestFormOptionalItemsItemXda6a0f48>? = null,
  /**
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
   */
  public val paymentIntentData:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7? = null,
  /**
   * Specify whether Checkout should collect a payment method. When set to `if_required`, Checkout will not collect a
   * payment method when the total due for the session is 0.This may occur if the Checkout Session includes a free trial
   * or a discount.
   *
   * Can only be set in `subscription` mode. Defaults to `always`.
   *
   * If you'd like information on how to collect a payment method outside of Checkout, read the guide on [configuring
   * subscriptions with a free trial](https://docs.stripe.com/payments/checkout/free-trials).
   */
  public val paymentMethodCollection:
      InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6? = null,
  /**
   * Payment-method-specific configuration.
   */
  public val paymentMethodOptions:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30? = null,
  paymentMethodTypes: List<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesItemX9cf40edc>? = null,
  /**
   * Controls phone number collection settings during checkout.
   *
   * We recommend that you review your privacy policy and check with your legal contacts.
   */
  public val phoneNumberCollection:
      InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3? = null,
  /**
   * Settings that restrict the usage of a payment link.
   */
  public val restrictions: InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b? = null,
  /**
   * Configuration for collecting the customer's shipping address.
   */
  public val shippingAddressCollection:
      InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2? = null,
  shippingOptions: List<InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6>? = null,
  /**
   * Describes the type of transaction being performed in order to customize relevant text on the page, such as the
   * submit button. Changing this value will also affect the hostname in the
   * [url](https://docs.stripe.com/api/payment_links/payment_links/object#url) property (example: `donate.stripe.com`).
   */
  public val submitType: InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9? = null,
  /**
   * When creating a subscription, the specified configuration data will be used. There must be at least one line item
   * with a recurring price to use `subscription_data`.
   */
  public val subscriptionData: InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383? = null,
  /**
   * Controls tax ID collection during checkout.
   */
  public val taxIdCollection: InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91? = null,
  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will
   * be transferred to.
   */
  public val transferData: InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb? = null,
) {
  /**
   * The line items representing what is being sold. Each line item represents an item being sold. Up to 20 line items
   * are supported.
   */
  public val lineItems: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb> =
      lineItems.toList()

  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't set
   * this parameter if `ui_mode` is `custom`.
   */
  public val customFields: List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174>? =
      customFields?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`. Metadata associated with
   * this Payment Link will automatically be copied to [checkout
   * sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment link.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
   * recurring [Prices](https://docs.stripe.com/api/prices).
   * There is a maximum of 10 optional items allowed on a payment link, and the existing limits on the number of line
   * items allowed on a payment link apply to the combined number of line items and optional items.
   * There is a maximum of 20 combined line items and optional items.
   */
  public val optionalItems: List<InlineV1PaymentLinksPostRequestFormOptionalItemsItemXda6a0f48>? =
      optionalItems?.let { collection0 -> collection0.toList() }

  /**
   * The list of payment method types that customers can use. If no value is passed, Stripe will dynamically show
   * relevant payment methods from your [payment method settings](https://dashboard.stripe.com/settings/payment_methods)
   * (20+ payment methods
   * [supported](https://docs.stripe.com/payments/payment-methods/integration-options#payment-method-product-support)).
   */
  public val paymentMethodTypes:
      List<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesItemX9cf40edc>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * The shipping rate options to apply to [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created by
   * this payment link.
   */
  public val shippingOptions: List<InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6>?
      = shippingOptions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var lineItemsValue: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb>? =
        null

    public var lineItems: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb>
      get() = requireNotNull(lineItemsValue) { "lineItems is required" }.toList()
      set(`value`) {
        lineItemsValue = value.toList()
      }

    /**
     * Behavior after the purchase is complete.
     */
    public var afterCompletion: InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4? = null

    /**
     * Enables user redeemable promotion codes.
     */
    public var allowPromotionCodes: Boolean? = null

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. Can only be applied when there are no line items with recurring prices.
     */
    public var applicationFeeAmount: Int? = null

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at
     * least 1 line item with a recurring price to use this field.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    /**
     * Configuration for automatic tax collection.
     */
    public var automaticTax: InlineV1PaymentLinksPostRequestFormAutomaticTaxXb1487bd2? = null

    /**
     * Configuration for collecting the customer's billing address. Defaults to `auto`.
     */
    public var billingAddressCollection:
        InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX582cdf31? = null

    /**
     * Configure fields to gather active consent from customers.
     */
    public var consentCollection: InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e? =
        null

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies) and supported by each line item's price.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    private var customFieldsValue:
        List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174>? = null

    /**
     * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't
     * set this parameter if `ui_mode` is `custom`.
     */
    public var customFields: List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174>?
      get() = customFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is
     * `custom`.
     */
    public var customText: InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93? = null

    /**
     * Configures whether [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment
     * link create a [Customer](https://docs.stripe.com/api/customers).
     */
    public var customerCreation: InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af? =
        null

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
     * The custom message to be displayed to a customer when a payment link is no longer active.
     */
    public var inactiveMessage: String? = null

    /**
     * Generate a post-purchase Invoice for one-time payments.
     */
    public var invoiceCreation: InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b? = null

    /**
     * Settings for Managed Payments for this Payment Link and resulting
     * [CheckoutSessions](/api/checkout/sessions/object), [PaymentIntents](/api/payment_intents/object),
     * [Invoices](/api/invoices/object), and [Subscriptions](/api/subscriptions/object).
     */
    public var managedPayments: InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`. Metadata
     * associated with this Payment Link will automatically be copied to [checkout
     * sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment link.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Controls settings applied for collecting the customer's name.
     */
    public var nameCollection: InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5? = null

    /**
     * The account on behalf of which to charge.
     */
    public var onBehalfOf: String? = null

    private var optionalItemsValue:
        List<InlineV1PaymentLinksPostRequestFormOptionalItemsItemXda6a0f48>? = null

    /**
     * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
     * recurring [Prices](https://docs.stripe.com/api/prices).
     * There is a maximum of 10 optional items allowed on a payment link, and the existing limits on the number of line
     * items allowed on a payment link apply to the combined number of line items and optional items.
     * There is a maximum of 20 combined line items and optional items.
     */
    public var optionalItems: List<InlineV1PaymentLinksPostRequestFormOptionalItemsItemXda6a0f48>?
      get() = optionalItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionalItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
     */
    public var paymentIntentData: InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7? =
        null

    /**
     * Specify whether Checkout should collect a payment method. When set to `if_required`, Checkout will not collect a
     * payment method when the total due for the session is 0.This may occur if the Checkout Session includes a free
     * trial or a discount.
     *
     * Can only be set in `subscription` mode. Defaults to `always`.
     *
     * If you'd like information on how to collect a payment method outside of Checkout, read the guide on [configuring
     * subscriptions with a free trial](https://docs.stripe.com/payments/checkout/free-trials).
     */
    public var paymentMethodCollection:
        InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6? = null

    /**
     * Payment-method-specific configuration.
     */
    public var paymentMethodOptions:
        InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30? = null

    private var paymentMethodTypesValue:
        List<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesItemX9cf40edc>? = null

    /**
     * The list of payment method types that customers can use. If no value is passed, Stripe will dynamically show
     * relevant payment methods from your [payment method
     * settings](https://dashboard.stripe.com/settings/payment_methods) (20+ payment methods
     * [supported](https://docs.stripe.com/payments/payment-methods/integration-options#payment-method-product-support))
     * .
     */
    public var paymentMethodTypes:
        List<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesItemX9cf40edc>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Controls phone number collection settings during checkout.
     *
     * We recommend that you review your privacy policy and check with your legal contacts.
     */
    public var phoneNumberCollection:
        InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3? = null

    /**
     * Settings that restrict the usage of a payment link.
     */
    public var restrictions: InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b? = null

    /**
     * Configuration for collecting the customer's shipping address.
     */
    public var shippingAddressCollection:
        InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2? = null

    private var shippingOptionsValue:
        List<InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6>? = null

    /**
     * The shipping rate options to apply to [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created
     * by this payment link.
     */
    public var shippingOptions:
        List<InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6>?
      get() = shippingOptionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        shippingOptionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Describes the type of transaction being performed in order to customize relevant text on the page, such as the
     * submit button. Changing this value will also affect the hostname in the
     * [url](https://docs.stripe.com/api/payment_links/payment_links/object#url) property (example:
     * `donate.stripe.com`).
     */
    public var submitType: InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9? = null

    /**
     * When creating a subscription, the specified configuration data will be used. There must be at least one line item
     * with a recurring price to use `subscription_data`.
     */
    public var subscriptionData: InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383? =
        null

    /**
     * Controls tax ID collection during checkout.
     */
    public var taxIdCollection: InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91? = null

    /**
     * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will
     * be transferred to.
     */
    public var transferData: InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormXa7410106 {
      check(lineItemsValue != null) { "lineItems is required" }
      return InlineV1PaymentLinksPostRequestFormXa7410106(
        lineItems = lineItems,
        afterCompletion = afterCompletion,
        allowPromotionCodes = allowPromotionCodes,
        applicationFeeAmount = applicationFeeAmount,
        applicationFeePercent = applicationFeePercent,
        automaticTax = automaticTax,
        billingAddressCollection = billingAddressCollection,
        consentCollection = consentCollection,
        currency = currency,
        customFields = customFields,
        customText = customText,
        customerCreation = customerCreation,
        expand = expand,
        inactiveMessage = inactiveMessage,
        invoiceCreation = invoiceCreation,
        managedPayments = managedPayments,
        metadata = metadata,
        nameCollection = nameCollection,
        onBehalfOf = onBehalfOf,
        optionalItems = optionalItems,
        paymentIntentData = paymentIntentData,
        paymentMethodCollection = paymentMethodCollection,
        paymentMethodOptions = paymentMethodOptions,
        paymentMethodTypes = paymentMethodTypes,
        phoneNumberCollection = phoneNumberCollection,
        restrictions = restrictions,
        shippingAddressCollection = shippingAddressCollection,
        shippingOptions = shippingOptions,
        submitType = submitType,
        subscriptionData = subscriptionData,
        taxIdCollection = taxIdCollection,
        transferData = transferData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormXa7410106 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormXa7410106> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormXa7410106 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormXa7410106")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormXa7410106 must be a JSON object")
      val lineItems = json.decodeRequired<List<InlineV1PaymentLinksPostRequestFormLineItemsItemX40b508bb>>(rawObject, "line_items")
      return InlineV1PaymentLinksPostRequestFormXa7410106(
        lineItems = lineItems,
        afterCompletion = rawObject["after_completion"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAfterCompletionX204f7da4>(it) },
        allowPromotionCodes = rawObject["allow_promotion_codes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAutomaticTaxXb1487bd2>(it) },
        billingAddressCollection = rawObject["billing_address_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX582cdf31>(it) },
        consentCollection = rawObject["consent_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormConsentCollectionXcd7e867e>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormCustomFieldsItemX30e6a174>>(it) },
        customText = rawObject["custom_text"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93>(it) },
        customerCreation = rawObject["customer_creation"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        inactiveMessage = rawObject["inactive_message"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceCreation = rawObject["invoice_creation"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationX7108721b>(it) },
        managedPayments = rawObject["managed_payments"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormManagedPaymentsXb1167755>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        nameCollection = rawObject["name_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        optionalItems = rawObject["optional_items"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormOptionalItemsItemXda6a0f48>>(it) },
        paymentIntentData = rawObject["payment_intent_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7>(it) },
        paymentMethodCollection = rawObject["payment_method_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsX46c17a30>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesItemX9cf40edc>>(it) },
        phoneNumberCollection = rawObject["phone_number_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormRestrictionsX5f21586b>(it) },
        shippingAddressCollection = rawObject["shipping_address_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX247f9cc2>(it) },
        shippingOptions = rawObject["shipping_options"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormShippingOptionsItemX093d17e6>>(it) },
        submitType = rawObject["submit_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubmitTypeXdb2280b9>(it) },
        subscriptionData = rawObject["subscription_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383>(it) },
        taxIdCollection = rawObject["tax_id_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormTransferDataXa5942deb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormXa7410106) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormXa7410106")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("line_items", json.encodeToJsonElement(value.lineItems))
        value.afterCompletion?.let { put("after_completion", json.encodeToJsonElement(it)) }
        value.allowPromotionCodes?.let { put("allow_promotion_codes", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.billingAddressCollection?.let { put("billing_address_collection", json.encodeToJsonElement(it)) }
        value.consentCollection?.let { put("consent_collection", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.customText?.let { put("custom_text", json.encodeToJsonElement(it)) }
        value.customerCreation?.let { put("customer_creation", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.inactiveMessage?.let { put("inactive_message", it) }
        value.invoiceCreation?.let { put("invoice_creation", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nameCollection?.let { put("name_collection", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.optionalItems?.let { put("optional_items", json.encodeToJsonElement(it)) }
        value.paymentIntentData?.let { put("payment_intent_data", json.encodeToJsonElement(it)) }
        value.paymentMethodCollection?.let { put("payment_method_collection", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.phoneNumberCollection?.let { put("phone_number_collection", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
        value.shippingAddressCollection?.let { put("shipping_address_collection", json.encodeToJsonElement(it)) }
        value.shippingOptions?.let { put("shipping_options", json.encodeToJsonElement(it)) }
        value.submitType?.let { put("submit_type", json.encodeToJsonElement(it)) }
        value.subscriptionData?.let { put("subscription_data", json.encodeToJsonElement(it)) }
        value.taxIdCollection?.let { put("tax_id_collection", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormXa7410106(block: InlineV1PaymentLinksPostRequestFormXa7410106.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormXa7410106 = InlineV1PaymentLinksPostRequestFormXa7410106.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormXa7410106 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

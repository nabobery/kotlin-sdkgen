package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Double
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
public data class PaymentLinkView internal constructor(
  public val active: Boolean,
  @SerialName("after_completion")
  public val afterCompletion: PaymentLinksResourceAfterCompletion,
  @SerialName("allow_promotion_codes")
  public val allowPromotionCodes: Boolean,
  public val application: InlinePaymentLinkApplicationX5a0c3952? = null,
  @SerialName("application_fee_amount")
  public val applicationFeeAmount: Int? = null,
  @SerialName("application_fee_percent")
  public val applicationFeePercent: Double? = null,
  @SerialName("automatic_tax")
  public val automaticTax: PaymentLinksResourceAutomaticTax,
  @SerialName("billing_address_collection")
  public val billingAddressCollection: InlinePaymentLinkBillingAddressCollectionX8c0d649d,
  @SerialName("consent_collection")
  public val consentCollection: InlinePaymentLinkConsentCollectionX2d71e575? = null,
  public val currency: String,
  @SerialName("custom_fields")
  public val customFields: List<PaymentLinksResourceCustomFields>,
  @SerialName("custom_text")
  public val customText: PaymentLinksResourceCustomText,
  @SerialName("customer_creation")
  public val customerCreation: InlinePaymentLinkCustomerCreationX2f367cb7,
  public val id: String,
  @SerialName("inactive_message")
  public val inactiveMessage: String? = null,
  @SerialName("invoice_creation")
  public val invoiceCreation: InlinePaymentLinkInvoiceCreationX9a83f095? = null,
  @SerialName("line_items")
  public val lineItems: InlinePaymentLinkLineItemsX48a608a0? = null,
  public val livemode: Boolean,
  @SerialName("managed_payments")
  public val managedPayments: InlinePaymentLinkManagedPaymentsXfb502a66? = null,
  public val metadata: Map<String, String>,
  @SerialName("name_collection")
  public val nameCollection: PaymentLinksResourceNameCollection? = null,
  @SerialName("object")
  public val objectValue: InlinePaymentLinkObjectValueXc98ca785,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlinePaymentLinkOnBehalfOfX640a3de7? = null,
  @SerialName("optional_items")
  public val optionalItems: List<PaymentLinksResourceOptionalItem>? = null,
  @SerialName("payment_intent_data")
  public val paymentIntentData: InlinePaymentLinkPaymentIntentDataX8866930d? = null,
  @SerialName("payment_method_collection")
  public val paymentMethodCollection: InlinePaymentLinkPaymentMethodCollectionX19b2f8b5,
  @SerialName("payment_method_options")
  public val paymentMethodOptions: InlinePaymentLinkPaymentMethodOptionsX4990ce45? = null,
  @SerialName("payment_method_types")
  public val paymentMethodTypes: List<InlinePaymentLinkPaymentMethodTypesItemX5b36364b>? = null,
  @SerialName("phone_number_collection")
  public val phoneNumberCollection: PaymentLinksResourcePhoneNumberCollection,
  public val restrictions: InlinePaymentLinkRestrictionsXaf818cc6? = null,
  @SerialName("shipping_address_collection")
  public val shippingAddressCollection: InlinePaymentLinkShippingAddressCollectionXeac79dd6? = null,
  @SerialName("shipping_options")
  public val shippingOptions: List<PaymentLinksResourceShippingOption>,
  @SerialName("submit_type")
  public val submitType: InlinePaymentLinkSubmitTypeXa03c3bfc,
  @SerialName("subscription_data")
  public val subscriptionData: InlinePaymentLinkSubscriptionDataXc04bdbec? = null,
  @SerialName("tax_id_collection")
  public val taxIdCollection: PaymentLinksResourceTaxIdCollection,
  @SerialName("transfer_data")
  public val transferData: InlinePaymentLinkTransferDataX31f4137c? = null,
  public val url: String,
)

/**
 * A payment link is a shareable URL that will take your customers to a hosted payment page. A payment link can be
 * shared and used multiple times.
 *
 * When a customer opens a payment link it will open a new [checkout
 * session](https://docs.stripe.com/api/checkout/sessions) to render the payment page. You can use [checkout session
 * events](https://docs.stripe.com/api/events/types#event_types-checkout.session.completed) to track payments through
 * payment links.
 *
 * Related guide: [Payment Links API](https://docs.stripe.com/payment-links)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link
 */
@Serializable(with = PaymentLink.Serializer::class)
public class PaymentLink(
  /**
   * Whether the payment link's `url` is active. If `false`, customers visiting the URL will be shown a page saying that
   * the link has been deactivated.
   */
  public val active: Boolean,
  public val afterCompletion: PaymentLinksResourceAfterCompletion,
  /**
   * Whether user redeemable promotion codes are enabled.
   */
  public val allowPromotionCodes: Boolean,
  public val automaticTax: PaymentLinksResourceAutomaticTax,
  /**
   * Configuration for collecting the customer's billing address. Defaults to `auto`.
   */
  public val billingAddressCollection: InlinePaymentLinkBillingAddressCollectionX8c0d649d,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  customFields: List<PaymentLinksResourceCustomFields>,
  public val customText: PaymentLinksResourceCustomText,
  /**
   * Configuration for Customer creation during checkout.
   */
  public val customerCreation: InlinePaymentLinkCustomerCreationX2f367cb7,
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
  public val objectValue: InlinePaymentLinkObjectValueXc98ca785,
  /**
   * Configuration for collecting a payment method during checkout. Defaults to `always`.
   */
  public val paymentMethodCollection: InlinePaymentLinkPaymentMethodCollectionX19b2f8b5,
  public val phoneNumberCollection: PaymentLinksResourcePhoneNumberCollection,
  shippingOptions: List<PaymentLinksResourceShippingOption>,
  /**
   * Indicates the type of transaction being performed which customizes relevant text on the page, such as the submit
   * button.
   */
  public val submitType: InlinePaymentLinkSubmitTypeXa03c3bfc,
  public val taxIdCollection: PaymentLinksResourceTaxIdCollection,
  /**
   * The public URL that can be shared with customers.
   */
  public val url: String,
  /**
   * The ID of the Connect application that created the Payment Link.
   */
  public val application: InlinePaymentLinkApplicationX5a0c3952? = null,
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
   * the application owner's Stripe account.
   */
  public val applicationFeeAmount: Int? = null,
  /**
   * This represents the percentage of the subscription invoice total that will be transferred to the application
   * owner's Stripe account.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  /**
   * When set, provides configuration to gather active consent from customers.
   */
  public val consentCollection: InlinePaymentLinkConsentCollectionX2d71e575? = null,
  /**
   * The custom message to be displayed to a customer when a payment link is no longer active.
   */
  public val inactiveMessage: String? = null,
  /**
   * Configuration for creating invoice for payment mode payment links.
   */
  public val invoiceCreation: InlinePaymentLinkInvoiceCreationX9a83f095? = null,
  /**
   * The line items representing what is being sold.
   */
  public val lineItems: InlinePaymentLinkLineItemsX48a608a0? = null,
  /**
   * Settings for Managed Payments for this Payment Link and resulting
   * [CheckoutSessions](/api/checkout/sessions/object), [PaymentIntents](/api/payment_intents/object),
   * [Invoices](/api/invoices/object), and [Subscriptions](/api/subscriptions/object).
   */
  public val managedPayments: InlinePaymentLinkManagedPaymentsXfb502a66? = null,
  public val nameCollection: PaymentLinksResourceNameCollection? = null,
  /**
   * The account on behalf of which to charge. See the [Connect
   * documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for details.
   */
  public val onBehalfOf: InlinePaymentLinkOnBehalfOfX640a3de7? = null,
  optionalItems: List<PaymentLinksResourceOptionalItem>? = null,
  /**
   * Indicates the parameters to be passed to PaymentIntent creation during checkout.
   */
  public val paymentIntentData: InlinePaymentLinkPaymentIntentDataX8866930d? = null,
  /**
   * Payment-method-specific configuration.
   */
  public val paymentMethodOptions: InlinePaymentLinkPaymentMethodOptionsX4990ce45? = null,
  paymentMethodTypes: List<InlinePaymentLinkPaymentMethodTypesItemX5b36364b>? = null,
  /**
   * Settings that restrict the usage of a payment link.
   */
  public val restrictions: InlinePaymentLinkRestrictionsXaf818cc6? = null,
  /**
   * Configuration for collecting the customer's shipping address.
   */
  public val shippingAddressCollection: InlinePaymentLinkShippingAddressCollectionXeac79dd6? = null,
  /**
   * When creating a subscription, the specified configuration data will be used. There must be at least one line item
   * with a recurring price to use `subscription_data`.
   */
  public val subscriptionData: InlinePaymentLinkSubscriptionDataXc04bdbec? = null,
  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will
   * be transferred to.
   */
  public val transferData: InlinePaymentLinkTransferDataX31f4137c? = null,
) {
  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't set
   * this parameter if `ui_mode` is `custom`.
   */
  public val customFields: List<PaymentLinksResourceCustomFields> = customFields.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * The shipping rate options applied to the session.
   */
  public val shippingOptions: List<PaymentLinksResourceShippingOption> = shippingOptions.toList()

  /**
   * The optional items presented to the customer at checkout.
   */
  public val optionalItems: List<PaymentLinksResourceOptionalItem>? =
      optionalItems?.let { collection0 -> collection0.toList() }

  /**
   * The list of payment method types that customers can use. When `null`, Stripe will dynamically show relevant payment
   * methods you've enabled in your [payment method settings](https://dashboard.stripe.com/settings/payment_methods).
   */
  public val paymentMethodTypes: List<InlinePaymentLinkPaymentMethodTypesItemX5b36364b>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var afterCompletionValue: PaymentLinksResourceAfterCompletion? = null

    public var afterCompletion: PaymentLinksResourceAfterCompletion
      get() = requireNotNull(afterCompletionValue) { "afterCompletion is required" }
      set(`value`) {
        afterCompletionValue = value
      }

    private var allowPromotionCodesValue: Boolean? = null

    public var allowPromotionCodes: Boolean
      get() = requireNotNull(allowPromotionCodesValue) { "allowPromotionCodes is required" }
      set(`value`) {
        allowPromotionCodesValue = value
      }

    private var automaticTaxValue: PaymentLinksResourceAutomaticTax? = null

    public var automaticTax: PaymentLinksResourceAutomaticTax
      get() = requireNotNull(automaticTaxValue) { "automaticTax is required" }
      set(`value`) {
        automaticTaxValue = value
      }

    private var billingAddressCollectionValue: InlinePaymentLinkBillingAddressCollectionX8c0d649d? =
        null

    public var billingAddressCollection: InlinePaymentLinkBillingAddressCollectionX8c0d649d
      get() = requireNotNull(billingAddressCollectionValue) { "billingAddressCollection is required" }
      set(`value`) {
        billingAddressCollectionValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var customFieldsValue: List<PaymentLinksResourceCustomFields>? = null

    public var customFields: List<PaymentLinksResourceCustomFields>
      get() = requireNotNull(customFieldsValue) { "customFields is required" }.toList()
      set(`value`) {
        customFieldsValue = value.toList()
      }

    private var customTextValue: PaymentLinksResourceCustomText? = null

    public var customText: PaymentLinksResourceCustomText
      get() = requireNotNull(customTextValue) { "customText is required" }
      set(`value`) {
        customTextValue = value
      }

    private var customerCreationValue: InlinePaymentLinkCustomerCreationX2f367cb7? = null

    public var customerCreation: InlinePaymentLinkCustomerCreationX2f367cb7
      get() = requireNotNull(customerCreationValue) { "customerCreation is required" }
      set(`value`) {
        customerCreationValue = value
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

    private var objectValueValue: InlinePaymentLinkObjectValueXc98ca785? = null

    public var objectValue: InlinePaymentLinkObjectValueXc98ca785
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentMethodCollectionValue: InlinePaymentLinkPaymentMethodCollectionX19b2f8b5? =
        null

    public var paymentMethodCollection: InlinePaymentLinkPaymentMethodCollectionX19b2f8b5
      get() = requireNotNull(paymentMethodCollectionValue) { "paymentMethodCollection is required" }
      set(`value`) {
        paymentMethodCollectionValue = value
      }

    private var phoneNumberCollectionValue: PaymentLinksResourcePhoneNumberCollection? = null

    public var phoneNumberCollection: PaymentLinksResourcePhoneNumberCollection
      get() = requireNotNull(phoneNumberCollectionValue) { "phoneNumberCollection is required" }
      set(`value`) {
        phoneNumberCollectionValue = value
      }

    private var shippingOptionsValue: List<PaymentLinksResourceShippingOption>? = null

    public var shippingOptions: List<PaymentLinksResourceShippingOption>
      get() = requireNotNull(shippingOptionsValue) { "shippingOptions is required" }.toList()
      set(`value`) {
        shippingOptionsValue = value.toList()
      }

    private var submitTypeValue: InlinePaymentLinkSubmitTypeXa03c3bfc? = null

    public var submitType: InlinePaymentLinkSubmitTypeXa03c3bfc
      get() = requireNotNull(submitTypeValue) { "submitType is required" }
      set(`value`) {
        submitTypeValue = value
      }

    private var taxIdCollectionValue: PaymentLinksResourceTaxIdCollection? = null

    public var taxIdCollection: PaymentLinksResourceTaxIdCollection
      get() = requireNotNull(taxIdCollectionValue) { "taxIdCollection is required" }
      set(`value`) {
        taxIdCollectionValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * The ID of the Connect application that created the Payment Link.
     */
    public var application: InlinePaymentLinkApplicationX5a0c3952? = null

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account.
     */
    public var applicationFeeAmount: Int? = null

    /**
     * This represents the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    /**
     * When set, provides configuration to gather active consent from customers.
     */
    public var consentCollection: InlinePaymentLinkConsentCollectionX2d71e575? = null

    /**
     * The custom message to be displayed to a customer when a payment link is no longer active.
     */
    public var inactiveMessage: String? = null

    /**
     * Configuration for creating invoice for payment mode payment links.
     */
    public var invoiceCreation: InlinePaymentLinkInvoiceCreationX9a83f095? = null

    /**
     * The line items representing what is being sold.
     */
    public var lineItems: InlinePaymentLinkLineItemsX48a608a0? = null

    /**
     * Settings for Managed Payments for this Payment Link and resulting
     * [CheckoutSessions](/api/checkout/sessions/object), [PaymentIntents](/api/payment_intents/object),
     * [Invoices](/api/invoices/object), and [Subscriptions](/api/subscriptions/object).
     */
    public var managedPayments: InlinePaymentLinkManagedPaymentsXfb502a66? = null

    public var nameCollection: PaymentLinksResourceNameCollection? = null

    /**
     * The account on behalf of which to charge. See the [Connect
     * documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for
     * details.
     */
    public var onBehalfOf: InlinePaymentLinkOnBehalfOfX640a3de7? = null

    private var optionalItemsValue: List<PaymentLinksResourceOptionalItem>? = null

    /**
     * The optional items presented to the customer at checkout.
     */
    public var optionalItems: List<PaymentLinksResourceOptionalItem>?
      get() = optionalItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionalItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Indicates the parameters to be passed to PaymentIntent creation during checkout.
     */
    public var paymentIntentData: InlinePaymentLinkPaymentIntentDataX8866930d? = null

    /**
     * Payment-method-specific configuration.
     */
    public var paymentMethodOptions: InlinePaymentLinkPaymentMethodOptionsX4990ce45? = null

    private var paymentMethodTypesValue: List<InlinePaymentLinkPaymentMethodTypesItemX5b36364b>? =
        null

    /**
     * The list of payment method types that customers can use. When `null`, Stripe will dynamically show relevant
     * payment methods you've enabled in your [payment method
     * settings](https://dashboard.stripe.com/settings/payment_methods).
     */
    public var paymentMethodTypes: List<InlinePaymentLinkPaymentMethodTypesItemX5b36364b>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Settings that restrict the usage of a payment link.
     */
    public var restrictions: InlinePaymentLinkRestrictionsXaf818cc6? = null

    /**
     * Configuration for collecting the customer's shipping address.
     */
    public var shippingAddressCollection: InlinePaymentLinkShippingAddressCollectionXeac79dd6? =
        null

    /**
     * When creating a subscription, the specified configuration data will be used. There must be at least one line item
     * with a recurring price to use `subscription_data`.
     */
    public var subscriptionData: InlinePaymentLinkSubscriptionDataXc04bdbec? = null

    /**
     * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will
     * be transferred to.
     */
    public var transferData: InlinePaymentLinkTransferDataX31f4137c? = null

    public fun build(): PaymentLink {
      check(activeValue != null) { "active is required" }
      check(afterCompletionValue != null) { "afterCompletion is required" }
      check(allowPromotionCodesValue != null) { "allowPromotionCodes is required" }
      check(automaticTaxValue != null) { "automaticTax is required" }
      check(billingAddressCollectionValue != null) { "billingAddressCollection is required" }
      check(currencyValue != null) { "currency is required" }
      check(customFieldsValue != null) { "customFields is required" }
      check(customTextValue != null) { "customText is required" }
      check(customerCreationValue != null) { "customerCreation is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentMethodCollectionValue != null) { "paymentMethodCollection is required" }
      check(phoneNumberCollectionValue != null) { "phoneNumberCollection is required" }
      check(shippingOptionsValue != null) { "shippingOptions is required" }
      check(submitTypeValue != null) { "submitType is required" }
      check(taxIdCollectionValue != null) { "taxIdCollection is required" }
      check(urlValue != null) { "url is required" }
      return PaymentLink(
        active = active,
        afterCompletion = afterCompletion,
        allowPromotionCodes = allowPromotionCodes,
        automaticTax = automaticTax,
        billingAddressCollection = billingAddressCollection,
        currency = currency,
        customFields = customFields,
        customText = customText,
        customerCreation = customerCreation,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        paymentMethodCollection = paymentMethodCollection,
        phoneNumberCollection = phoneNumberCollection,
        shippingOptions = shippingOptions,
        submitType = submitType,
        taxIdCollection = taxIdCollection,
        url = url,
        application = application,
        applicationFeeAmount = applicationFeeAmount,
        applicationFeePercent = applicationFeePercent,
        consentCollection = consentCollection,
        inactiveMessage = inactiveMessage,
        invoiceCreation = invoiceCreation,
        lineItems = lineItems,
        managedPayments = managedPayments,
        nameCollection = nameCollection,
        onBehalfOf = onBehalfOf,
        optionalItems = optionalItems,
        paymentIntentData = paymentIntentData,
        paymentMethodOptions = paymentMethodOptions,
        paymentMethodTypes = paymentMethodTypes,
        restrictions = restrictions,
        shippingAddressCollection = shippingAddressCollection,
        subscriptionData = subscriptionData,
        transferData = transferData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLink = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLink {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLink must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val afterCompletion = json.decodeRequired<PaymentLinksResourceAfterCompletion>(rawObject, "after_completion")
      val allowPromotionCodes = json.decodeRequired<Boolean>(rawObject, "allow_promotion_codes")
      val automaticTax = json.decodeRequired<PaymentLinksResourceAutomaticTax>(rawObject, "automatic_tax")
      val billingAddressCollection = json.decodeRequired<InlinePaymentLinkBillingAddressCollectionX8c0d649d>(rawObject, "billing_address_collection")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customFields = json.decodeRequired<List<PaymentLinksResourceCustomFields>>(rawObject, "custom_fields")
      val customText = json.decodeRequired<PaymentLinksResourceCustomText>(rawObject, "custom_text")
      val customerCreation = json.decodeRequired<InlinePaymentLinkCustomerCreationX2f367cb7>(rawObject, "customer_creation")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlinePaymentLinkObjectValueXc98ca785>(rawObject, "object")
      val paymentMethodCollection = json.decodeRequired<InlinePaymentLinkPaymentMethodCollectionX19b2f8b5>(rawObject, "payment_method_collection")
      val phoneNumberCollection = json.decodeRequired<PaymentLinksResourcePhoneNumberCollection>(rawObject, "phone_number_collection")
      val shippingOptions = json.decodeRequired<List<PaymentLinksResourceShippingOption>>(rawObject, "shipping_options")
      val submitType = json.decodeRequired<InlinePaymentLinkSubmitTypeXa03c3bfc>(rawObject, "submit_type")
      val taxIdCollection = json.decodeRequired<PaymentLinksResourceTaxIdCollection>(rawObject, "tax_id_collection")
      val url = json.decodeRequired<String>(rawObject, "url")
      return PaymentLink(
        active = active,
        afterCompletion = afterCompletion,
        allowPromotionCodes = allowPromotionCodes,
        automaticTax = automaticTax,
        billingAddressCollection = billingAddressCollection,
        currency = currency,
        customFields = customFields,
        customText = customText,
        customerCreation = customerCreation,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        paymentMethodCollection = paymentMethodCollection,
        phoneNumberCollection = phoneNumberCollection,
        shippingOptions = shippingOptions,
        submitType = submitType,
        taxIdCollection = taxIdCollection,
        url = url,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkApplicationX5a0c3952?>(element) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        consentCollection = rawObject["consent_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkConsentCollectionX2d71e575?>(element) },
        inactiveMessage = rawObject["inactive_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoiceCreation = rawObject["invoice_creation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkInvoiceCreationX9a83f095?>(element) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlinePaymentLinkLineItemsX48a608a0>(it) },
        managedPayments = rawObject["managed_payments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkManagedPaymentsXfb502a66?>(element) },
        nameCollection = rawObject["name_collection"]?.let { json.decodeFromJsonElement<PaymentLinksResourceNameCollection>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkOnBehalfOfX640a3de7?>(element) },
        optionalItems = rawObject["optional_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PaymentLinksResourceOptionalItem>?>(element) },
        paymentIntentData = rawObject["payment_intent_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkPaymentIntentDataX8866930d?>(element) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkPaymentMethodOptionsX4990ce45?>(element) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlinePaymentLinkPaymentMethodTypesItemX5b36364b>?>(element) },
        restrictions = rawObject["restrictions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkRestrictionsXaf818cc6?>(element) },
        shippingAddressCollection = rawObject["shipping_address_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkShippingAddressCollectionXeac79dd6?>(element) },
        subscriptionData = rawObject["subscription_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkSubscriptionDataXc04bdbec?>(element) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinkTransferDataX31f4137c?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLink) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("after_completion", json.encodeToJsonElement(value.afterCompletion))
        put("allow_promotion_codes", json.encodeToJsonElement(value.allowPromotionCodes))
        put("automatic_tax", json.encodeToJsonElement(value.automaticTax))
        put("billing_address_collection", json.encodeToJsonElement(value.billingAddressCollection))
        put("currency", value.currency)
        put("custom_fields", json.encodeToJsonElement(value.customFields))
        put("custom_text", json.encodeToJsonElement(value.customText))
        put("customer_creation", json.encodeToJsonElement(value.customerCreation))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment_method_collection", json.encodeToJsonElement(value.paymentMethodCollection))
        put("phone_number_collection", json.encodeToJsonElement(value.phoneNumberCollection))
        put("shipping_options", json.encodeToJsonElement(value.shippingOptions))
        put("submit_type", json.encodeToJsonElement(value.submitType))
        put("tax_id_collection", json.encodeToJsonElement(value.taxIdCollection))
        put("url", value.url)
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.consentCollection?.let { put("consent_collection", json.encodeToJsonElement(it)) }
        value.inactiveMessage?.let { put("inactive_message", it) }
        value.invoiceCreation?.let { put("invoice_creation", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.nameCollection?.let { put("name_collection", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.optionalItems?.let { put("optional_items", json.encodeToJsonElement(it)) }
        value.paymentIntentData?.let { put("payment_intent_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
        value.shippingAddressCollection?.let { put("shipping_address_collection", json.encodeToJsonElement(it)) }
        value.subscriptionData?.let { put("subscription_data", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLink(block: PaymentLink.Builder.() -> Unit): PaymentLink = PaymentLink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLink is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

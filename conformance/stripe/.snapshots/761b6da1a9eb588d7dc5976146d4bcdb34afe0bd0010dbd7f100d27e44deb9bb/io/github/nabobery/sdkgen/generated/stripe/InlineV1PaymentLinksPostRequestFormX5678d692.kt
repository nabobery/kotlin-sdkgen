package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormX5678d692.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormX5678d692(
  /**
   * Whether the payment link's `url` is active. If `false`, customers visiting the URL will be shown a page saying that
   * the link has been deactivated.
   */
  public val active: Boolean? = null,
  /**
   * Behavior after the purchase is complete.
   */
  public val afterCompletion: InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789? = null,
  /**
   * Enables user redeemable promotion codes.
   */
  public val allowPromotionCodes: Boolean? = null,
  /**
   * Configuration for automatic tax collection.
   */
  public val automaticTax: InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661? = null,
  /**
   * Configuration for collecting the customer's billing address. Defaults to `auto`.
   */
  public val billingAddressCollection:
      InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af? = null,
  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't set
   * this parameter if `ui_mode` is `custom`.
   */
  public val customFields: InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf? = null,
  /**
   * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is
   * `custom`.
   */
  public val customText: InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3? = null,
  /**
   * Configures whether [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment link
   * create a [Customer](https://docs.stripe.com/api/customers).
   */
  public val customerCreation: InlineV1PaymentLinksPostRequestFormCustomerCreationX4cdc4cda? = null,
  expand: List<String>? = null,
  /**
   * The custom message to be displayed to a customer when a payment link is no longer active.
   */
  public val inactiveMessage: InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8? = null,
  /**
   * Generate a post-purchase Invoice for one-time payments.
   */
  public val invoiceCreation: InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a? = null,
  lineItems: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4>? = null,
  metadata: Map<String, String>? = null,
  /**
   * Controls settings applied for collecting the customer's name.
   */
  public val nameCollection: InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6? = null,
  /**
   * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
   * recurring [Prices](https://docs.stripe.com/api/prices).
   * There is a maximum of 10 optional items allowed on a payment link, and the existing limits on the number of line
   * items allowed on a payment link apply to the combined number of line items and optional items.
   * There is a maximum of 20 combined line items and optional items.
   */
  public val optionalItems: InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294? = null,
  /**
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
   */
  public val paymentIntentData:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d? = null,
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
      InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc? = null,
  /**
   * Payment-method-specific configuration.
   */
  public val paymentMethodOptions:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d? = null,
  /**
   * The list of payment method types that customers can use. Pass an empty string to enable dynamic payment methods
   * that use your [payment method settings](https://dashboard.stripe.com/settings/payment_methods).
   */
  public val paymentMethodTypes:
      InlineV1PaymentLinksPostRequestFormPaymentMethodTypesX8c0dc4e8? = null,
  /**
   * Controls phone number collection settings during checkout.
   *
   * We recommend that you review your privacy policy and check with your legal contacts.
   */
  public val phoneNumberCollection:
      InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c? = null,
  /**
   * Settings that restrict the usage of a payment link.
   */
  public val restrictions: InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f? = null,
  /**
   * Configuration for collecting the customer's shipping address.
   */
  public val shippingAddressCollection:
      InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf? = null,
  /**
   * Describes the type of transaction being performed in order to customize relevant text on the page, such as the
   * submit button. Changing this value will also affect the hostname in the
   * [url](https://docs.stripe.com/api/payment_links/payment_links/object#url) property (example: `donate.stripe.com`).
   */
  public val submitType: InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8? = null,
  /**
   * When creating a subscription, the specified configuration data will be used. There must be at least one line item
   * with a recurring price to use `subscription_data`.
   */
  public val subscriptionData: InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0? = null,
  /**
   * Controls tax ID collection during checkout.
   */
  public val taxIdCollection: InlineV1PaymentLinksPostRequestFormTaxIdCollectionX1eb15a5e? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * The line items representing what is being sold. Each line item represents an item being sold. Up to 20 line items
   * are supported.
   */
  public val lineItems: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4>? =
      lineItems?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`. Metadata associated with
   * this Payment Link will automatically be copied to [checkout
   * sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment link.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * Whether the payment link's `url` is active. If `false`, customers visiting the URL will be shown a page saying
     * that the link has been deactivated.
     */
    public var active: Boolean? = null

    /**
     * Behavior after the purchase is complete.
     */
    public var afterCompletion: InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789? = null

    /**
     * Enables user redeemable promotion codes.
     */
    public var allowPromotionCodes: Boolean? = null

    /**
     * Configuration for automatic tax collection.
     */
    public var automaticTax: InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661? = null

    /**
     * Configuration for collecting the customer's billing address. Defaults to `auto`.
     */
    public var billingAddressCollection:
        InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af? = null

    /**
     * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't
     * set this parameter if `ui_mode` is `custom`.
     */
    public var customFields: InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf? = null

    /**
     * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is
     * `custom`.
     */
    public var customText: InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3? = null

    /**
     * Configures whether [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment
     * link create a [Customer](https://docs.stripe.com/api/customers).
     */
    public var customerCreation: InlineV1PaymentLinksPostRequestFormCustomerCreationX4cdc4cda? =
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
    public var inactiveMessage: InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8? = null

    /**
     * Generate a post-purchase Invoice for one-time payments.
     */
    public var invoiceCreation: InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a? = null

    private var lineItemsValue: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4>? =
        null

    /**
     * The line items representing what is being sold. Each line item represents an item being sold. Up to 20 line items
     * are supported.
     */
    public var lineItems: List<InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4>?
      get() = lineItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lineItemsValue = value?.let { collection0 -> collection0.toList() }
      }

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
    public var nameCollection: InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6? = null

    /**
     * A list of optional items the customer can add to their order at checkout. Use this parameter to pass one-time or
     * recurring [Prices](https://docs.stripe.com/api/prices).
     * There is a maximum of 10 optional items allowed on a payment link, and the existing limits on the number of line
     * items allowed on a payment link apply to the combined number of line items and optional items.
     * There is a maximum of 20 combined line items and optional items.
     */
    public var optionalItems: InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294? = null

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
     */
    public var paymentIntentData: InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d? =
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
        InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc? = null

    /**
     * Payment-method-specific configuration.
     */
    public var paymentMethodOptions:
        InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d? = null

    /**
     * The list of payment method types that customers can use. Pass an empty string to enable dynamic payment methods
     * that use your [payment method settings](https://dashboard.stripe.com/settings/payment_methods).
     */
    public var paymentMethodTypes: InlineV1PaymentLinksPostRequestFormPaymentMethodTypesX8c0dc4e8? =
        null

    /**
     * Controls phone number collection settings during checkout.
     *
     * We recommend that you review your privacy policy and check with your legal contacts.
     */
    public var phoneNumberCollection:
        InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c? = null

    /**
     * Settings that restrict the usage of a payment link.
     */
    public var restrictions: InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f? = null

    /**
     * Configuration for collecting the customer's shipping address.
     */
    public var shippingAddressCollection:
        InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf? = null

    /**
     * Describes the type of transaction being performed in order to customize relevant text on the page, such as the
     * submit button. Changing this value will also affect the hostname in the
     * [url](https://docs.stripe.com/api/payment_links/payment_links/object#url) property (example:
     * `donate.stripe.com`).
     */
    public var submitType: InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8? = null

    /**
     * When creating a subscription, the specified configuration data will be used. There must be at least one line item
     * with a recurring price to use `subscription_data`.
     */
    public var subscriptionData: InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0? =
        null

    /**
     * Controls tax ID collection during checkout.
     */
    public var taxIdCollection: InlineV1PaymentLinksPostRequestFormTaxIdCollectionX1eb15a5e? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormX5678d692 = InlineV1PaymentLinksPostRequestFormX5678d692(
      active = active,
      afterCompletion = afterCompletion,
      allowPromotionCodes = allowPromotionCodes,
      automaticTax = automaticTax,
      billingAddressCollection = billingAddressCollection,
      customFields = customFields,
      customText = customText,
      customerCreation = customerCreation,
      expand = expand,
      inactiveMessage = inactiveMessage,
      invoiceCreation = invoiceCreation,
      lineItems = lineItems,
      metadata = metadata,
      nameCollection = nameCollection,
      optionalItems = optionalItems,
      paymentIntentData = paymentIntentData,
      paymentMethodCollection = paymentMethodCollection,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      phoneNumberCollection = phoneNumberCollection,
      restrictions = restrictions,
      shippingAddressCollection = shippingAddressCollection,
      submitType = submitType,
      subscriptionData = subscriptionData,
      taxIdCollection = taxIdCollection,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormX5678d692 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormX5678d692> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormX5678d692 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormX5678d692")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormX5678d692 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormX5678d692(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        afterCompletion = rawObject["after_completion"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAfterCompletionXc1602789>(it) },
        allowPromotionCodes = rawObject["allow_promotion_codes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormAutomaticTaxXbeeab661>(it) },
        billingAddressCollection = rawObject["billing_address_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormBillingAddressCollectionX7432c0af>(it) },
        customFields = rawObject["custom_fields"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf>(it) },
        customText = rawObject["custom_text"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3>(it) },
        customerCreation = rawObject["customer_creation"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomerCreationX4cdc4cda>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        inactiveMessage = rawObject["inactive_message"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8>(it) },
        invoiceCreation = rawObject["invoice_creation"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationX27263f6a>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormLineItemsItemX363558c4>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        nameCollection = rawObject["name_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionXc76d0ec6>(it) },
        optionalItems = rawObject["optional_items"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormOptionalItemsX45712294>(it) },
        paymentIntentData = rawObject["payment_intent_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataXd5fe0d4d>(it) },
        paymentMethodCollection = rawObject["payment_method_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsXcbb7398d>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesX8c0dc4e8>(it) },
        phoneNumberCollection = rawObject["phone_number_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionX2eaaa01c>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f>(it) },
        shippingAddressCollection = rawObject["shipping_address_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionX4d7087bf>(it) },
        submitType = rawObject["submit_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubmitTypeX7702e8f8>(it) },
        subscriptionData = rawObject["subscription_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0>(it) },
        taxIdCollection = rawObject["tax_id_collection"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormTaxIdCollectionX1eb15a5e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormX5678d692) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormX5678d692")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.afterCompletion?.let { put("after_completion", json.encodeToJsonElement(it)) }
        value.allowPromotionCodes?.let { put("allow_promotion_codes", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.billingAddressCollection?.let { put("billing_address_collection", json.encodeToJsonElement(it)) }
        value.customFields?.let { put("custom_fields", json.encodeToJsonElement(it)) }
        value.customText?.let { put("custom_text", json.encodeToJsonElement(it)) }
        value.customerCreation?.let { put("customer_creation", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.inactiveMessage?.let { put("inactive_message", json.encodeToJsonElement(it)) }
        value.invoiceCreation?.let { put("invoice_creation", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nameCollection?.let { put("name_collection", json.encodeToJsonElement(it)) }
        value.optionalItems?.let { put("optional_items", json.encodeToJsonElement(it)) }
        value.paymentIntentData?.let { put("payment_intent_data", json.encodeToJsonElement(it)) }
        value.paymentMethodCollection?.let { put("payment_method_collection", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.phoneNumberCollection?.let { put("phone_number_collection", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
        value.shippingAddressCollection?.let { put("shipping_address_collection", json.encodeToJsonElement(it)) }
        value.submitType?.let { put("submit_type", json.encodeToJsonElement(it)) }
        value.subscriptionData?.let { put("subscription_data", json.encodeToJsonElement(it)) }
        value.taxIdCollection?.let { put("tax_id_collection", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormX5678d692(block: InlineV1PaymentLinksPostRequestFormX5678d692.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormX5678d692 = InlineV1PaymentLinksPostRequestFormX5678d692.build(block)

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormX01b0ddae.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormX01b0ddae(
  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers.
   * It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a
   * PaymentMethod to a Customer.
   */
  public val attachToSelf: Boolean? = null,
  /**
   * When you enable this parameter, this SetupIntent accepts payment methods that you enable in the Dashboard and that
   * are compatible with its other parameters.
   */
  public val automaticPaymentMethods:
      InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7? = null,
  /**
   * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults to `false`. If a card is
   * the attached payment method, you can provide a `return_url` in case further authentication is necessary.
   */
  public val confirm: Boolean? = null,
  /**
   * ID of the ConfirmationToken used to confirm this SetupIntent.
   *
   * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
   * `payment_method`, then the values in this request will take precedence.
   */
  public val confirmationToken: String? = null,
  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment methods
   * attached to other Customers cannot be used with this SetupIntent.
   */
  public val customer: String? = null,
  /**
   * ID of the Account this SetupIntent belongs to, if one exists.
   *
   * If present, the SetupIntent's payment method will be attached to the Account on successful setup. Payment methods
   * attached to other Accounts cannot be used with this SetupIntent.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  excludedPaymentMethodTypes: List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesItemX8f0651f5>? = null,
  expand: List<String>? = null,
  flowDirections: List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e>? = null,
  /**
   * This hash contains details about the mandate to create. This parameter can only be used with
   * [`confirm=true`](https://docs.stripe.com/api/setup_intents/create#create_setup_intent-confirm).
   */
  public val mandateData: InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1? = null,
  metadata: Map<String, String>? = null,
  /**
   * The Stripe account ID created for this SetupIntent.
   */
  public val onBehalfOf: String? = null,
  /**
   * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this SetupIntent.
   */
  public val paymentMethod: String? = null,
  /**
   * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use with
   * this SetupIntent.
   */
  public val paymentMethodConfiguration: String? = null,
  /**
   * When included, this hash creates a PaymentMethod that is set as the
   * [`payment_method`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method)
   * value in the SetupIntent.
   */
  public val paymentMethodData:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataX076e36a5? = null,
  /**
   * Payment method-specific configuration for this SetupIntent.
   */
  public val paymentMethodOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27? = null,
  paymentMethodTypes: List<String>? = null,
  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method's
   * app or site. To redirect to a mobile application, you can alternatively supply an application URI scheme. This
   * parameter can only be used with
   * [`confirm=true`](https://docs.stripe.com/api/setup_intents/create#create_setup_intent-confirm).
   */
  public val returnUrl: String? = null,
  /**
   * If you populate this hash, this SetupIntent generates a `single_use` mandate after successful completion.
   *
   * Single-use mandates are only valid for the following payment methods: `acss_debit`, `alipay`, `au_becs_debit`,
   * `bacs_debit`, `bancontact`, `boleto`, `ideal`, `link`, `sepa_debit`, and `us_bank_account`.
   */
  public val singleUse: InlineV1SetupIntentsPostRequestFormSingleUseX4e6759b9? = null,
  /**
   * Indicates how the payment method is intended to be used in the future. If not provided, this value defaults to
   * `off_session`.
   */
  public val usage: InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c? = null,
  /**
   * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the next
   * actions.
   */
  public val useStripeSdk: Boolean? = null,
) {
  /**
   * The list of payment method types to exclude from use with this SetupIntent.
   */
  public val excludedPaymentMethodTypes:
      List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesItemX8f0651f5>? =
      excludedPaymentMethodTypes?.let { collection0 -> collection0.toList() }

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Indicates the directions of money movement for which this payment method is intended to be used.
   *
   * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
   * you intend to use the payment method as the destination to send funds to. You can include both if you intend to use
   * the payment method for both purposes.
   */
  public val flowDirections: List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e>? =
      flowDirections?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The list of payment method types (for example, card) that this SetupIntent can use. If you don't provide this,
   * Stripe will dynamically show relevant payment methods from your [payment method
   * settings](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be found
   * [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
   */
  public val paymentMethodTypes: List<String>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
     *
     * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and
     * OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false
     * when attaching a PaymentMethod to a Customer.
     */
    public var attachToSelf: Boolean? = null

    /**
     * When you enable this parameter, this SetupIntent accepts payment methods that you enable in the Dashboard and
     * that are compatible with its other parameters.
     */
    public var automaticPaymentMethods:
        InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7? = null

    /**
     * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults to `false`. If a card
     * is the attached payment method, you can provide a `return_url` in case further authentication is necessary.
     */
    public var confirm: Boolean? = null

    /**
     * ID of the ConfirmationToken used to confirm this SetupIntent.
     *
     * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
     * `payment_method`, then the values in this request will take precedence.
     */
    public var confirmationToken: String? = null

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment
     * methods attached to other Customers cannot be used with this SetupIntent.
     */
    public var customer: String? = null

    /**
     * ID of the Account this SetupIntent belongs to, if one exists.
     *
     * If present, the SetupIntent's payment method will be attached to the Account on successful setup. Payment methods
     * attached to other Accounts cannot be used with this SetupIntent.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    private var excludedPaymentMethodTypesValue:
        List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesItemX8f0651f5>? = null

    /**
     * The list of payment method types to exclude from use with this SetupIntent.
     */
    public var excludedPaymentMethodTypes:
        List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesItemX8f0651f5>?
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

    private var flowDirectionsValue:
        List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e>? = null

    /**
     * Indicates the directions of money movement for which this payment method is intended to be used.
     *
     * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
     * you intend to use the payment method as the destination to send funds to. You can include both if you intend to
     * use the payment method for both purposes.
     */
    public var flowDirections: List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e>?
      get() = flowDirectionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        flowDirectionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * This hash contains details about the mandate to create. This parameter can only be used with
     * [`confirm=true`](https://docs.stripe.com/api/setup_intents/create#create_setup_intent-confirm).
     */
    public var mandateData: InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1? = null

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
     * The Stripe account ID created for this SetupIntent.
     */
    public var onBehalfOf: String? = null

    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this SetupIntent.
     */
    public var paymentMethod: String? = null

    /**
     * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use
     * with this SetupIntent.
     */
    public var paymentMethodConfiguration: String? = null

    /**
     * When included, this hash creates a PaymentMethod that is set as the
     * [`payment_method`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method)
     * value in the SetupIntent.
     */
    public var paymentMethodData: InlineV1SetupIntentsPostRequestFormPaymentMethodDataX076e36a5? =
        null

    /**
     * Payment method-specific configuration for this SetupIntent.
     */
    public var paymentMethodOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27? = null

    private var paymentMethodTypesValue: List<String>? = null

    /**
     * The list of payment method types (for example, card) that this SetupIntent can use. If you don't provide this,
     * Stripe will dynamically show relevant payment methods from your [payment method
     * settings](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
     * found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
     */
    public var paymentMethodTypes: List<String>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method's
     * app or site. To redirect to a mobile application, you can alternatively supply an application URI scheme. This
     * parameter can only be used with
     * [`confirm=true`](https://docs.stripe.com/api/setup_intents/create#create_setup_intent-confirm).
     */
    public var returnUrl: String? = null

    /**
     * If you populate this hash, this SetupIntent generates a `single_use` mandate after successful completion.
     *
     * Single-use mandates are only valid for the following payment methods: `acss_debit`, `alipay`, `au_becs_debit`,
     * `bacs_debit`, `bancontact`, `boleto`, `ideal`, `link`, `sepa_debit`, and `us_bank_account`.
     */
    public var singleUse: InlineV1SetupIntentsPostRequestFormSingleUseX4e6759b9? = null

    /**
     * Indicates how the payment method is intended to be used in the future. If not provided, this value defaults to
     * `off_session`.
     */
    public var usage: InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c? = null

    /**
     * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the
     * next actions.
     */
    public var useStripeSdk: Boolean? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormX01b0ddae = InlineV1SetupIntentsPostRequestFormX01b0ddae(
      attachToSelf = attachToSelf,
      automaticPaymentMethods = automaticPaymentMethods,
      confirm = confirm,
      confirmationToken = confirmationToken,
      customer = customer,
      customerAccount = customerAccount,
      description = description,
      excludedPaymentMethodTypes = excludedPaymentMethodTypes,
      expand = expand,
      flowDirections = flowDirections,
      mandateData = mandateData,
      metadata = metadata,
      onBehalfOf = onBehalfOf,
      paymentMethod = paymentMethod,
      paymentMethodConfiguration = paymentMethodConfiguration,
      paymentMethodData = paymentMethodData,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      returnUrl = returnUrl,
      singleUse = singleUse,
      usage = usage,
      useStripeSdk = useStripeSdk,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormX01b0ddae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormX01b0ddae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormX01b0ddae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormX01b0ddae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormX01b0ddae must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormX01b0ddae(
        attachToSelf = rawObject["attach_to_self"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        automaticPaymentMethods = rawObject["automatic_payment_methods"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormAutomaticPaymentMethodsX305652f7>(it) },
        confirm = rawObject["confirm"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        confirmationToken = rawObject["confirmation_token"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesItemX8f0651f5>>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        flowDirections = rawObject["flow_directions"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e>>(it) },
        mandateData = rawObject["mandate_data"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodConfiguration = rawObject["payment_method_configuration"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataX076e36a5>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        singleUse = rawObject["single_use"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormSingleUseX4e6759b9>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c>(it) },
        useStripeSdk = rawObject["use_stripe_sdk"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormX01b0ddae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormX01b0ddae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attachToSelf?.let { put("attach_to_self", json.encodeToJsonElement(it)) }
        value.automaticPaymentMethods?.let { put("automatic_payment_methods", json.encodeToJsonElement(it)) }
        value.confirm?.let { put("confirm", json.encodeToJsonElement(it)) }
        value.confirmationToken?.let { put("confirmation_token", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.flowDirections?.let { put("flow_directions", json.encodeToJsonElement(it)) }
        value.mandateData?.let { put("mandate_data", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodConfiguration?.let { put("payment_method_configuration", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.singleUse?.let { put("single_use", json.encodeToJsonElement(it)) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
        value.useStripeSdk?.let { put("use_stripe_sdk", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormX01b0ddae(block: InlineV1SetupIntentsPostRequestFormX01b0ddae.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormX01b0ddae = InlineV1SetupIntentsPostRequestFormX01b0ddae.build(block)

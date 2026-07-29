package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6(
  /**
   * Provides industry-specific information about the amount.
   */
  public val amountDetails:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab? = null,
  /**
   * Amount to confirm on the PaymentIntent. Defaults to `amount` if not provided.
   */
  public val amountToConfirm: Int? = null,
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX5c4aa7af? = null,
  /**
   * The client secret of the PaymentIntent.
   */
  public val clientSecret: String? = null,
  /**
   * ID of the ConfirmationToken used to confirm this PaymentIntent.
   *
   * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
   * `payment_method`, then the values in this request will take precedence.
   */
  public val confirmationToken: String? = null,
  /**
   * Set to `true` to fail the payment attempt if the PaymentIntent transitions into `requires_action`. This parameter
   * is intended for simpler integrations that do not handle customer actions, like [saving cards without
   * authentication](https://docs.stripe.com/payments/save-card-without-authentication).
   */
  public val errorOnRequiresAction: Boolean? = null,
  /**
   * The list of payment method types to exclude from use with this payment.
   */
  public val excludedPaymentMethodTypes:
      InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8? = null,
  expand: List<String>? = null,
  /**
   * Automations to be run during the PaymentIntent lifecycle
   */
  public val hooks: InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5? = null,
  /**
   * ID of the mandate that's used for this payment.
   */
  public val mandate: String? = null,
  public val mandateData: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8? = null,
  /**
   * Set to `true` to indicate that the customer isn't in your checkout flow during this payment attempt and can't
   * authenticate. Use this parameter in scenarios where you collect payment method details and [charge them
   * later](https://docs.stripe.com/payments/save-during-payment).
   */
  public val offSession: InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab? = null,
  /**
   * Provides industry-specific information about the charge.
   */
  public val paymentDetails:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb? = null,
  /**
   * ID of the payment method (a PaymentMethod, Card, or [compatible
   * Source](https://docs.stripe.com/payments/payment-methods/transitioning#compatibility) object) to attach to this
   * PaymentIntent.
   * If the payment method is attached to a Customer, it must match the
   * [customer](https://api.stripe.com#create_payment_intent-customer) that is set on this PaymentIntent.
   */
  public val paymentMethod: String? = null,
  /**
   * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
   * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
   * property on the PaymentIntent.
   */
  public val paymentMethodData:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataX34ae9b07? = null,
  /**
   * Payment method-specific configuration for this PaymentIntent.
   */
  public val paymentMethodOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682? = null,
  paymentMethodTypes: List<String>? = null,
  /**
   * Options to configure Radar. Learn more about [Radar Sessions](https://docs.stripe.com/radar/radar-session).
   */
  public val radarOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsXe78ea4d8? = null,
  /**
   * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
   * payment in live mode, a receipt will be sent regardless of your [email
   * settings](https://dashboard.stripe.com/account/emails).
   */
  public val receiptEmail:
      InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb? = null,
  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method's
   * app or site.
   * If you'd prefer to redirect to a mobile application, you can alternatively supply an application URI scheme.
   * This parameter is only used for cards and other redirect-based payment methods.
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
   *
   * If you've already set `setup_future_usage` and you're performing a request using a publishable key, you can only
   * update the value from `on_session` to `off_session`.
   */
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXd1fd8261? = null,
  /**
   * Shipping information for this PaymentIntent.
   */
  public val shipping: InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf? = null,
  /**
   * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the next
   * actions.
   */
  public val useStripeSdk: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * The list of payment method types (for example, a card) that this PaymentIntent can use. Use
   * `automatic_payment_methods` to manage payment methods from the [Stripe
   * Dashboard](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
   * found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
   */
  public val paymentMethodTypes: List<String>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Provides industry-specific information about the amount.
     */
    public var amountDetails: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab? =
        null

    /**
     * Amount to confirm on the PaymentIntent. Defaults to `amount` if not provided.
     */
    public var amountToConfirm: Int? = null

    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX5c4aa7af? =
        null

    /**
     * The client secret of the PaymentIntent.
     */
    public var clientSecret: String? = null

    /**
     * ID of the ConfirmationToken used to confirm this PaymentIntent.
     *
     * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
     * `payment_method`, then the values in this request will take precedence.
     */
    public var confirmationToken: String? = null

    /**
     * Set to `true` to fail the payment attempt if the PaymentIntent transitions into `requires_action`. This parameter
     * is intended for simpler integrations that do not handle customer actions, like [saving cards without
     * authentication](https://docs.stripe.com/payments/save-card-without-authentication).
     */
    public var errorOnRequiresAction: Boolean? = null

    /**
     * The list of payment method types to exclude from use with this payment.
     */
    public var excludedPaymentMethodTypes:
        InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8? = null

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
    public var hooks: InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5? = null

    /**
     * ID of the mandate that's used for this payment.
     */
    public var mandate: String? = null

    public var mandateData: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8? = null

    /**
     * Set to `true` to indicate that the customer isn't in your checkout flow during this payment attempt and can't
     * authenticate. Use this parameter in scenarios where you collect payment method details and [charge them
     * later](https://docs.stripe.com/payments/save-during-payment).
     */
    public var offSession: InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab? = null

    /**
     * Provides industry-specific information about the charge.
     */
    public var paymentDetails: InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb?
        = null

    /**
     * ID of the payment method (a PaymentMethod, Card, or [compatible
     * Source](https://docs.stripe.com/payments/payment-methods/transitioning#compatibility) object) to attach to this
     * PaymentIntent.
     * If the payment method is attached to a Customer, it must match the
     * [customer](https://api.stripe.com#create_payment_intent-customer) that is set on this PaymentIntent.
     */
    public var paymentMethod: String? = null

    /**
     * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
     * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
     * property on the PaymentIntent.
     */
    public var paymentMethodData:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataX34ae9b07? = null

    /**
     * Payment method-specific configuration for this PaymentIntent.
     */
    public var paymentMethodOptions:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682? = null

    private var paymentMethodTypesValue: List<String>? = null

    /**
     * The list of payment method types (for example, a card) that this PaymentIntent can use. Use
     * `automatic_payment_methods` to manage payment methods from the [Stripe
     * Dashboard](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
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
    public var radarOptions: InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsXe78ea4d8? =
        null

    /**
     * Email address that the receipt for the resulting payment will be sent to. If `receipt_email` is specified for a
     * payment in live mode, a receipt will be sent regardless of your [email
     * settings](https://dashboard.stripe.com/account/emails).
     */
    public var receiptEmail: InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb? =
        null

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method's
     * app or site.
     * If you'd prefer to redirect to a mobile application, you can alternatively supply an application URI scheme.
     * This parameter is only used for cards and other redirect-based payment methods.
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
     *
     * If you've already set `setup_future_usage` and you're performing a request using a publishable key, you can only
     * update the value from `on_session` to `off_session`.
     */
    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXd1fd8261? = null

    /**
     * Shipping information for this PaymentIntent.
     */
    public var shipping: InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf? = null

    /**
     * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the
     * next actions.
     */
    public var useStripeSdk: Boolean? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6 = InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6(
      amountDetails = amountDetails,
      amountToConfirm = amountToConfirm,
      captureMethod = captureMethod,
      clientSecret = clientSecret,
      confirmationToken = confirmationToken,
      errorOnRequiresAction = errorOnRequiresAction,
      excludedPaymentMethodTypes = excludedPaymentMethodTypes,
      expand = expand,
      hooks = hooks,
      mandate = mandate,
      mandateData = mandateData,
      offSession = offSession,
      paymentDetails = paymentDetails,
      paymentMethod = paymentMethod,
      paymentMethodData = paymentMethodData,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      radarOptions = radarOptions,
      receiptEmail = receiptEmail,
      returnUrl = returnUrl,
      setupFutureUsage = setupFutureUsage,
      shipping = shipping,
      useStripeSdk = useStripeSdk,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6(
        amountDetails = rawObject["amount_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsX7bf357ab>(it) },
        amountToConfirm = rawObject["amount_to_confirm"]?.let { json.decodeFromJsonElement<Int>(it) },
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX5c4aa7af>(it) },
        clientSecret = rawObject["client_secret"]?.let { json.decodeFromJsonElement<String>(it) },
        confirmationToken = rawObject["confirmation_token"]?.let { json.decodeFromJsonElement<String>(it) },
        errorOnRequiresAction = rawObject["error_on_requires_action"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        hooks = rawObject["hooks"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormHooksX4e3fcdd5>(it) },
        mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<String>(it) },
        mandateData = rawObject["mandate_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8>(it) },
        offSession = rawObject["off_session"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab>(it) },
        paymentDetails = rawObject["payment_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataX34ae9b07>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsXe78ea4d8>(it) },
        receiptEmail = rawObject["receipt_email"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormReceiptEmailX03df02bb>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXd1fd8261>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf>(it) },
        useStripeSdk = rawObject["use_stripe_sdk"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.amountToConfirm?.let { put("amount_to_confirm", json.encodeToJsonElement(it)) }
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.clientSecret?.let { put("client_secret", it) }
        value.confirmationToken?.let { put("confirmation_token", it) }
        value.errorOnRequiresAction?.let { put("error_on_requires_action", json.encodeToJsonElement(it)) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.hooks?.let { put("hooks", json.encodeToJsonElement(it)) }
        value.mandate?.let { put("mandate", it) }
        value.mandateData?.let { put("mandate_data", json.encodeToJsonElement(it)) }
        value.offSession?.let { put("off_session", json.encodeToJsonElement(it)) }
        value.paymentDetails?.let { put("payment_details", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.radarOptions?.let { put("radar_options", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.useStripeSdk?.let { put("use_stripe_sdk", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6(block: InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6 = InlineV1PaymentIntentsConfirmPostRequestFormX344a5cd6.build(block)

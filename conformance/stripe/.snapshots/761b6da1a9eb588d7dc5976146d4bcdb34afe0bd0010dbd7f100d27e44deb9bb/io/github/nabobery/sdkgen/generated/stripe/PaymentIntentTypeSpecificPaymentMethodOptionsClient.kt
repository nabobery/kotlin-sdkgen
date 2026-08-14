package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentIntentTypeSpecificPaymentMethodOptionsClientView(
  @SerialName("capture_method")
  public val captureMethod:
      InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d? = null,
  public val installments: PaymentFlowsInstallmentOptions? = null,
  @SerialName("mandate_options")
  public val mandateOptions: PaymentIntentPaymentMethodOptionsMandateOptionsPayto? = null,
  @SerialName("request_incremental_authorization_support")
  public val requestIncrementalAuthorizationSupport: Boolean? = null,
  @SerialName("require_cvc_recollection")
  public val requireCvcRecollection: Boolean? = null,
  public val routing: PaymentMethodOptionsCardPresentRouting? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage: InlinePaymentIntentTypeSpefa40SetupFutureUsageX579b72d6? = null,
  @SerialName("verification_method")
  public val verificationMethod: InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_type_specific_payment_method_options_client
 */
@Serializable(with = PaymentIntentTypeSpecificPaymentMethodOptionsClient.Serializer::class)
public class PaymentIntentTypeSpecificPaymentMethodOptionsClient(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod:
      InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d? = null,
  public val installments: PaymentFlowsInstallmentOptions? = null,
  public val mandateOptions: PaymentIntentPaymentMethodOptionsMandateOptionsPayto? = null,
  /**
   * Request ability to [increment](https://docs.stripe.com/terminal/features/incremental-authorizations) this
   * PaymentIntent if the combination of MCC and card brand is eligible. Check
   * [incremental_authorization_supported](https://docs.stripe.com/api/charges/object#charge_object-payment_method_detai
   * ls-card_present-incremental_authorization_supported) in the
   * [Confirm](https://docs.stripe.com/api/payment_intents/confirm) response to verify support.
   */
  public val requestIncrementalAuthorizationSupport: Boolean? = null,
  /**
   * When enabled, using a card that is attached to a customer will require the CVC to be provided again (i.e. using the
   * cvc_token parameter).
   */
  public val requireCvcRecollection: Boolean? = null,
  public val routing: PaymentMethodOptionsCardPresentRouting? = null,
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
  public val setupFutureUsage: InlinePaymentIntentTypeSpefa40SetupFutureUsageX579b72d6? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod: InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod:
        InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d? = null

    public var installments: PaymentFlowsInstallmentOptions? = null

    public var mandateOptions: PaymentIntentPaymentMethodOptionsMandateOptionsPayto? = null

    /**
     * Request ability to [increment](https://docs.stripe.com/terminal/features/incremental-authorizations) this
     * PaymentIntent if the combination of MCC and card brand is eligible. Check
     * [incremental_authorization_supported](https://docs.stripe.com/api/charges/object#charge_object-payment_method_det
     * ails-card_present-incremental_authorization_supported) in the
     * [Confirm](https://docs.stripe.com/api/payment_intents/confirm) response to verify support.
     */
    public var requestIncrementalAuthorizationSupport: Boolean? = null

    /**
     * When enabled, using a card that is attached to a customer will require the CVC to be provided again (i.e. using
     * the cvc_token parameter).
     */
    public var requireCvcRecollection: Boolean? = null

    public var routing: PaymentMethodOptionsCardPresentRouting? = null

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
    public var setupFutureUsage: InlinePaymentIntentTypeSpefa40SetupFutureUsageX579b72d6? = null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod: InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a? = null

    public fun build(): PaymentIntentTypeSpecificPaymentMethodOptionsClient = PaymentIntentTypeSpecificPaymentMethodOptionsClient(
      captureMethod = captureMethod,
      installments = installments,
      mandateOptions = mandateOptions,
      requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport,
      requireCvcRecollection = requireCvcRecollection,
      routing = routing,
      setupFutureUsage = setupFutureUsage,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentTypeSpecificPaymentMethodOptionsClient = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentTypeSpecificPaymentMethodOptionsClient> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentTypeSpecificPaymentMethodOptionsClient {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentTypeSpecificPaymentMethodOptionsClient")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentTypeSpecificPaymentMethodOptionsClient must be a JSON object")
      return PaymentIntentTypeSpecificPaymentMethodOptionsClient(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d>(it) },
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<PaymentFlowsInstallmentOptions>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsMandateOptionsPayto>(it) },
        requestIncrementalAuthorizationSupport = rawObject["request_incremental_authorization_support"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requireCvcRecollection = rawObject["require_cvc_recollection"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        routing = rawObject["routing"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsCardPresentRouting>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentIntentTypeSpefa40SetupFutureUsageX579b72d6>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentTypeSpecificPaymentMethodOptionsClient) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentTypeSpecificPaymentMethodOptionsClient")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorizationSupport?.let { put("request_incremental_authorization_support", json.encodeToJsonElement(it)) }
        value.requireCvcRecollection?.let { put("require_cvc_recollection", json.encodeToJsonElement(it)) }
        value.routing?.let { put("routing", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentTypeSpecificPaymentMethodOptionsClient(block: PaymentIntentTypeSpecificPaymentMethodOptionsClient.Builder.() -> Unit): PaymentIntentTypeSpecificPaymentMethodOptionsClient = PaymentIntentTypeSpecificPaymentMethodOptionsClient.build(block)

package io.github.nabobery.sdkgen.generated.stripe

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
public data class PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptionsView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage: InlinePaymentFlowsPrivateP9f6bSetupFutureUsageX804059ac? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_kakao_pay_payment_method_optio
 * ns
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b? = null,
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
  public val setupFutureUsage: InlinePaymentFlowsPrivateP9f6bSetupFutureUsageX804059ac? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b? = null

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
    public var setupFutureUsage: InlinePaymentFlowsPrivateP9f6bSetupFutureUsageX804059ac? = null

    public fun build(): PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions = PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions(
      captureMethod = captureMethod,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions must be a JSON object")
      return PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsPrivateP9f6bCaptureMethodX669a801b>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsPrivateP9f6bSetupFutureUsageX804059ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions(block: PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions.Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions = PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions.build(block)

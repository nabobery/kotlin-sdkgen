package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_link_payment_method_options
 */
@Serializable(with = CheckoutLinkPaymentMethodOptions.Serializer::class)
public class CheckoutLinkPaymentMethodOptions(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04? = null,
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
      InlineCheckoutLinkPaymentMethodOptionsSetupFutureUsageXe61da0be? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04? = null

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
    public var setupFutureUsage: InlineCheckoutLinkPaymentMethodOptionsSetupFutureUsageXe61da0be? =
        null

    public fun build(): CheckoutLinkPaymentMethodOptions = CheckoutLinkPaymentMethodOptions(
      captureMethod = captureMethod,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutLinkPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutLinkPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutLinkPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutLinkPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutLinkPaymentMethodOptions must be a JSON object")
      return CheckoutLinkPaymentMethodOptions(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineCheckoutLinkPaymentMethodOptionsCaptureMethodXff9c5b04>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutLinkPaymentMethodOptionsSetupFutureUsageXe61da0be>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutLinkPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutLinkPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutLinkPaymentMethodOptions(block: CheckoutLinkPaymentMethodOptions.Builder.() -> Unit): CheckoutLinkPaymentMethodOptions = CheckoutLinkPaymentMethodOptions.build(block)

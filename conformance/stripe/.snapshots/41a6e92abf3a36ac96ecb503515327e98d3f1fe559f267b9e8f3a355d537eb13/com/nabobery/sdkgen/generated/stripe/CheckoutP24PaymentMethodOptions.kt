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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_p24_payment_method_options
 */
@Serializable(with = CheckoutP24PaymentMethodOptions.Serializer::class)
public class CheckoutP24PaymentMethodOptions(
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
      InlineCheckoutP24PaymentMethodOptionsSetupFutureUsageXa2e2ed52? = null,
) {
  public class Builder {
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
    public var setupFutureUsage: InlineCheckoutP24PaymentMethodOptionsSetupFutureUsageXa2e2ed52? =
        null

    public fun build(): CheckoutP24PaymentMethodOptions = CheckoutP24PaymentMethodOptions(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutP24PaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutP24PaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutP24PaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutP24PaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutP24PaymentMethodOptions must be a JSON object")
      return CheckoutP24PaymentMethodOptions(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutP24PaymentMethodOptionsSetupFutureUsageXa2e2ed52>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutP24PaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutP24PaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutP24PaymentMethodOptions(block: CheckoutP24PaymentMethodOptions.Builder.() -> Unit): CheckoutP24PaymentMethodOptions = CheckoutP24PaymentMethodOptions.build(block)

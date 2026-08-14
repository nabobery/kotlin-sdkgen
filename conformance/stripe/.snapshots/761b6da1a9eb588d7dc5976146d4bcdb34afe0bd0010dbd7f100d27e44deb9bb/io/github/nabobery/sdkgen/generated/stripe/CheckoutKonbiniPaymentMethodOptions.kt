package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_konbini_payment_method_options
 */
@Serializable(with = CheckoutKonbiniPaymentMethodOptions.Serializer::class)
public class CheckoutKonbiniPaymentMethodOptions(
  /**
   * The number of calendar days (between 1 and 60) after which Konbini payment instructions will expire. For example,
   * if a PaymentIntent is confirmed with Konbini and `expires_after_days` set to 2 on Monday JST, the instructions will
   * expire on Wednesday 23:59:59 JST.
   */
  public val expiresAfterDays: Int? = null,
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
      InlineCheckoutKonbiniPaymentMethodOptionsSetupFutureUsageX8787c5f2? = null,
) {
  public class Builder {
    /**
     * The number of calendar days (between 1 and 60) after which Konbini payment instructions will expire. For example,
     * if a PaymentIntent is confirmed with Konbini and `expires_after_days` set to 2 on Monday JST, the instructions
     * will expire on Wednesday 23:59:59 JST.
     */
    public var expiresAfterDays: Int? = null

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
    public var setupFutureUsage: InlineCheckoutKonbiniPaymentMethodOptionsSetupFutureUsageX8787c5f2?
        = null

    public fun build(): CheckoutKonbiniPaymentMethodOptions = CheckoutKonbiniPaymentMethodOptions(
      expiresAfterDays = expiresAfterDays,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutKonbiniPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutKonbiniPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutKonbiniPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutKonbiniPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutKonbiniPaymentMethodOptions must be a JSON object")
      return CheckoutKonbiniPaymentMethodOptions(
        expiresAfterDays = rawObject["expires_after_days"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutKonbiniPaymentMethodOptionsSetupFutureUsageX8787c5f2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutKonbiniPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutKonbiniPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expiresAfterDays?.let { put("expires_after_days", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutKonbiniPaymentMethodOptions(block: CheckoutKonbiniPaymentMethodOptions.Builder.() -> Unit): CheckoutKonbiniPaymentMethodOptions = CheckoutKonbiniPaymentMethodOptions.build(block)

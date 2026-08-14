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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodOptionsSofortView(
  @SerialName("preferred_language")
  public val preferredLanguage: InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage: InlinePaymentMethodOptionsSofortSetupFutureUsageXd4013f6c? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_sofort
 */
@Serializable(with = PaymentMethodOptionsSofort.Serializer::class)
public class PaymentMethodOptionsSofort(
  /**
   * Preferred language of the SOFORT authorization page that the customer is redirected to.
   */
  public val preferredLanguage: InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d? = null,
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
  public val setupFutureUsage: InlinePaymentMethodOptionsSofortSetupFutureUsageXd4013f6c? = null,
) {
  public class Builder {
    /**
     * Preferred language of the SOFORT authorization page that the customer is redirected to.
     */
    public var preferredLanguage: InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d? = null

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
    public var setupFutureUsage: InlinePaymentMethodOptionsSofortSetupFutureUsageXd4013f6c? = null

    public fun build(): PaymentMethodOptionsSofort = PaymentMethodOptionsSofort(
      preferredLanguage = preferredLanguage,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsSofort = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsSofort> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsSofort {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsSofort")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsSofort must be a JSON object")
      return PaymentMethodOptionsSofort(
        preferredLanguage = rawObject["preferred_language"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodOptionsSofortPreferredLanguageX71f24d9d?>(element) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsSofortSetupFutureUsageXd4013f6c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsSofort) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsSofort")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preferredLanguage?.let { put("preferred_language", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsSofort(block: PaymentMethodOptionsSofort.Builder.() -> Unit): PaymentMethodOptionsSofort = PaymentMethodOptionsSofort.build(block)

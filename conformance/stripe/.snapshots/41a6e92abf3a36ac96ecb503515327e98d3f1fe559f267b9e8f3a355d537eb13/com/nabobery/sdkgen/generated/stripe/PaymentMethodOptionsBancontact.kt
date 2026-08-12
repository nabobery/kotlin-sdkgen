package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodOptionsBancontactView(
  @SerialName("preferred_language")
  public val preferredLanguage: InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc,
  @SerialName("setup_future_usage")
  public val setupFutureUsage:
      InlinePaymentMethodOptionsBancontactSetupFutureUsageXffdfe472? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_bancontact
 */
@Serializable(with = PaymentMethodOptionsBancontact.Serializer::class)
public class PaymentMethodOptionsBancontact(
  /**
   * Preferred language of the Bancontact authorization page that the customer is redirected to.
   */
  public val preferredLanguage: InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc,
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
      InlinePaymentMethodOptionsBancontactSetupFutureUsageXffdfe472? = null,
) {
  public class Builder {
    private var preferredLanguageValue:
        InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc? = null

    public var preferredLanguage: InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc
      get() = requireNotNull(preferredLanguageValue) { "preferredLanguage is required" }
      set(`value`) {
        preferredLanguageValue = value
      }

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
    public var setupFutureUsage: InlinePaymentMethodOptionsBancontactSetupFutureUsageXffdfe472? =
        null

    public fun build(): PaymentMethodOptionsBancontact {
      check(preferredLanguageValue != null) { "preferredLanguage is required" }
      return PaymentMethodOptionsBancontact(
        preferredLanguage = preferredLanguage,
        setupFutureUsage = setupFutureUsage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsBancontact = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsBancontact> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsBancontact {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsBancontact")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsBancontact must be a JSON object")
      val preferredLanguage = json.decodeRequired<InlinePaymentMethodOptionsBancontactPreferredLanguageXd2c8b7fc>(rawObject, "preferred_language")
      return PaymentMethodOptionsBancontact(
        preferredLanguage = preferredLanguage,
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsBancontactSetupFutureUsageXffdfe472>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsBancontact) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsBancontact")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("preferred_language", json.encodeToJsonElement(value.preferredLanguage))
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsBancontact(block: PaymentMethodOptionsBancontact.Builder.() -> Unit): PaymentMethodOptionsBancontact = PaymentMethodOptionsBancontact.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodOptionsBancontact is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

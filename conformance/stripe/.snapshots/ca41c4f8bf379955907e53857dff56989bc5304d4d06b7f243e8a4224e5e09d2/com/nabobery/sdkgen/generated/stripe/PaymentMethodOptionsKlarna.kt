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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodOptionsKlarnaView(
  @SerialName("capture_method")
  public val captureMethod: InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a? = null,
  @SerialName("preferred_locale")
  public val preferredLocale: String? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage: InlinePaymentMethodOptionsKlarnaSetupFutureUsageX4dd59568? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_klarna
 */
@Serializable(with = PaymentMethodOptionsKlarna.Serializer::class)
public class PaymentMethodOptionsKlarna(
  /**
   * Controls when the funds will be captured from the customer's account.
   */
  public val captureMethod: InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a? = null,
  /**
   * Preferred locale of the Klarna checkout page that the customer is redirected to.
   */
  public val preferredLocale: String? = null,
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
  public val setupFutureUsage: InlinePaymentMethodOptionsKlarnaSetupFutureUsageX4dd59568? = null,
) {
  public class Builder {
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a? = null

    /**
     * Preferred locale of the Klarna checkout page that the customer is redirected to.
     */
    public var preferredLocale: String? = null

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
    public var setupFutureUsage: InlinePaymentMethodOptionsKlarnaSetupFutureUsageX4dd59568? = null

    public fun build(): PaymentMethodOptionsKlarna = PaymentMethodOptionsKlarna(
      captureMethod = captureMethod,
      preferredLocale = preferredLocale,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsKlarna = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsKlarna> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsKlarna {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsKlarna")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsKlarna must be a JSON object")
      return PaymentMethodOptionsKlarna(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsKlarnaSetupFutureUsageX4dd59568>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsKlarna) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsKlarna")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.preferredLocale?.let { put("preferred_locale", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsKlarna(block: PaymentMethodOptionsKlarna.Builder.() -> Unit): PaymentMethodOptionsKlarna = PaymentMethodOptionsKlarna.build(block)

package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_payment_method_options
 */
@Serializable(with = CheckoutAcssDebitPaymentMethodOptions.Serializer::class)
public class CheckoutAcssDebitPaymentMethodOptions(
  /**
   * Currency supported by the bank account. Returned when the Session is in `setup` mode.
   */
  public val currency: InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a? = null,
  public val mandateOptions: CheckoutAcssDebitMandateOptions? = null,
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
      InlineCheckoutAcssDebitPaymentMethodOptionsSetupFutureUsageX06041e79? = null,
  /**
   * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
   * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
   */
  public val targetDate: String? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod:
      InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d? = null,
) {
  public class Builder {
    /**
     * Currency supported by the bank account. Returned when the Session is in `setup` mode.
     */
    public var currency: InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a? = null

    public var mandateOptions: CheckoutAcssDebitMandateOptions? = null

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
    public var setupFutureUsage:
        InlineCheckoutAcssDebitPaymentMethodOptionsSetupFutureUsageX06041e79? = null

    /**
     * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
     * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
     */
    public var targetDate: String? = null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod:
        InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d? = null

    public fun build(): CheckoutAcssDebitPaymentMethodOptions = CheckoutAcssDebitPaymentMethodOptions(
      currency = currency,
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutAcssDebitPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutAcssDebitPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutAcssDebitPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutAcssDebitPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutAcssDebitPaymentMethodOptions must be a JSON object")
      return CheckoutAcssDebitPaymentMethodOptions(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<CheckoutAcssDebitMandateOptions>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutAcssDebitPaymentMethodOptionsSetupFutureUsageX06041e79>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutAcssDebitPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutAcssDebitPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currency?.let { put("currency", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutAcssDebitPaymentMethodOptions(block: CheckoutAcssDebitPaymentMethodOptions.Builder.() -> Unit): CheckoutAcssDebitPaymentMethodOptions = CheckoutAcssDebitPaymentMethodOptions.build(block)

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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_bacs_debit_payment_method_options
 */
@Serializable(with = CheckoutBacsDebitPaymentMethodOptions.Serializer::class)
public class CheckoutBacsDebitPaymentMethodOptions(
  public val mandateOptions: CheckoutPaymentMethodOptionsMandateOptionsBacsDebit? = null,
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
      InlineCheckoutBacsDebitPaymentMethodOptionsSetupFutureUsageX6c1aa115? = null,
  /**
   * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
   * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
   */
  public val targetDate: String? = null,
) {
  public class Builder {
    public var mandateOptions: CheckoutPaymentMethodOptionsMandateOptionsBacsDebit? = null

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
        InlineCheckoutBacsDebitPaymentMethodOptionsSetupFutureUsageX6c1aa115? = null

    /**
     * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
     * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
     */
    public var targetDate: String? = null

    public fun build(): CheckoutBacsDebitPaymentMethodOptions = CheckoutBacsDebitPaymentMethodOptions(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutBacsDebitPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutBacsDebitPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutBacsDebitPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutBacsDebitPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutBacsDebitPaymentMethodOptions must be a JSON object")
      return CheckoutBacsDebitPaymentMethodOptions(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<CheckoutPaymentMethodOptionsMandateOptionsBacsDebit>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutBacsDebitPaymentMethodOptionsSetupFutureUsageX6c1aa115>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutBacsDebitPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutBacsDebitPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutBacsDebitPaymentMethodOptions(block: CheckoutBacsDebitPaymentMethodOptions.Builder.() -> Unit): CheckoutBacsDebitPaymentMethodOptions = CheckoutBacsDebitPaymentMethodOptions.build(block)

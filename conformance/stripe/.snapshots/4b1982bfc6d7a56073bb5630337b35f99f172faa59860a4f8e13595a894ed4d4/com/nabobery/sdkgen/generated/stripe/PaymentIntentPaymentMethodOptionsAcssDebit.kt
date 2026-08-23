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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentIntentPaymentMethodOptionsAcssDebitView(
  @SerialName("mandate_options")
  public val mandateOptions: PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage:
      InlinePaymentIntentPaymentMethodOptionsAcssDebitSetupFutureUsageX63d4bf2a? = null,
  @SerialName("target_date")
  public val targetDate: String? = null,
  @SerialName("verification_method")
  public val verificationMethod:
      InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_acss_debit
 */
@Serializable(with = PaymentIntentPaymentMethodOptionsAcssDebit.Serializer::class)
public class PaymentIntentPaymentMethodOptionsAcssDebit(
  public val mandateOptions: PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit? = null,
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
      InlinePaymentIntentPaymentMethodOptionsAcssDebitSetupFutureUsageX63d4bf2a? = null,
  /**
   * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
   * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
   */
  public val targetDate: String? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod:
      InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487? = null,
) {
  public class Builder {
    public var mandateOptions: PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit? = null

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
        InlinePaymentIntentPaymentMethodOptionsAcssDebitSetupFutureUsageX63d4bf2a? = null

    /**
     * Controls when Stripe will attempt to debit the funds from the customer's account. The date must be a string in
     * YYYY-MM-DD format. The date must be in the future and between 3 and 15 calendar days from now.
     */
    public var targetDate: String? = null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod:
        InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487? = null

    public fun build(): PaymentIntentPaymentMethodOptionsAcssDebit = PaymentIntentPaymentMethodOptionsAcssDebit(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
      targetDate = targetDate,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptionsAcssDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentPaymentMethodOptionsAcssDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptionsAcssDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptionsAcssDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentPaymentMethodOptionsAcssDebit must be a JSON object")
      return PaymentIntentPaymentMethodOptionsAcssDebit(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsMandateOptionsAcssDebit>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAcssDebitSetupFutureUsageX63d4bf2a>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAcssDebitVerificationMethodX54db9487>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentPaymentMethodOptionsAcssDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptionsAcssDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", it) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentPaymentMethodOptionsAcssDebit(block: PaymentIntentPaymentMethodOptionsAcssDebit.Builder.() -> Unit): PaymentIntentPaymentMethodOptionsAcssDebit = PaymentIntentPaymentMethodOptionsAcssDebit.build(block)

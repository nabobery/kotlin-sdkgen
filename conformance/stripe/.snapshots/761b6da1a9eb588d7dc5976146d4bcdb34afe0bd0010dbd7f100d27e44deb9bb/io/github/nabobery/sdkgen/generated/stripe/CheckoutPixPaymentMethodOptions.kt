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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_pix_payment_method_options
 */
@Serializable(with = CheckoutPixPaymentMethodOptions.Serializer::class)
public class CheckoutPixPaymentMethodOptions(
  /**
   * Determines if the amount includes the IOF tax.
   */
  public val amountIncludesIof:
      InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c? = null,
  /**
   * The number of seconds after which Pix payment will expire.
   */
  public val expiresAfterSeconds: Int? = null,
  public val mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null,
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
      InlineCheckoutPixPaymentMethodOptionsSetupFutureUsageX1e94208d? = null,
) {
  public class Builder {
    /**
     * Determines if the amount includes the IOF tax.
     */
    public var amountIncludesIof: InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c? =
        null

    /**
     * The number of seconds after which Pix payment will expire.
     */
    public var expiresAfterSeconds: Int? = null

    public var mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null

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
    public var setupFutureUsage: InlineCheckoutPixPaymentMethodOptionsSetupFutureUsageX1e94208d? =
        null

    public fun build(): CheckoutPixPaymentMethodOptions = CheckoutPixPaymentMethodOptions(
      amountIncludesIof = amountIncludesIof,
      expiresAfterSeconds = expiresAfterSeconds,
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutPixPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckoutPixPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutPixPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutPixPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutPixPaymentMethodOptions must be a JSON object")
      return CheckoutPixPaymentMethodOptions(
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineCheckoutPixPaymentMethodOptionsAmountIncludesIofX21a3a40c>(it) },
        expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<PaymentMethodOptionsMandateOptionsPix>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineCheckoutPixPaymentMethodOptionsSetupFutureUsageX1e94208d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutPixPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutPixPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutPixPaymentMethodOptions(block: CheckoutPixPaymentMethodOptions.Builder.() -> Unit): CheckoutPixPaymentMethodOptions = CheckoutPixPaymentMethodOptions.build(block)

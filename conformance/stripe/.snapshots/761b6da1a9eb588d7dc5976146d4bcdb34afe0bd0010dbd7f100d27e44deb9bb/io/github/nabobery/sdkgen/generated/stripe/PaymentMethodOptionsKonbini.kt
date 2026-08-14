package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
public data class PaymentMethodOptionsKonbiniView(
  @SerialName("confirmation_number")
  public val confirmationNumber: String? = null,
  @SerialName("expires_after_days")
  public val expiresAfterDays: Int? = null,
  @SerialName("expires_at")
  public val expiresAt: Int? = null,
  @SerialName("product_description")
  public val productDescription: String? = null,
  @SerialName("setup_future_usage")
  public val setupFutureUsage: InlinePaymentMethodOptionsKonbiniSetupFutureUsageXf37dd975? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_konbini
 */
@Serializable(with = PaymentMethodOptionsKonbini.Serializer::class)
public class PaymentMethodOptionsKonbini(
  /**
   * An optional 10 to 11 digit numeric-only string determining the confirmation code at applicable convenience stores.
   */
  public val confirmationNumber: String? = null,
  /**
   * The number of calendar days (between 1 and 60) after which Konbini payment instructions will expire. For example,
   * if a PaymentIntent is confirmed with Konbini and `expires_after_days` set to 2 on Monday JST, the instructions will
   * expire on Wednesday 23:59:59 JST.
   */
  public val expiresAfterDays: Int? = null,
  /**
   * The timestamp at which the Konbini payment instructions will expire. Only one of `expires_after_days` or
   * `expires_at` may be set.
   */
  public val expiresAt: Int? = null,
  /**
   * A product descriptor of up to 22 characters, which will appear to customers at the convenience store.
   */
  public val productDescription: String? = null,
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
  public val setupFutureUsage: InlinePaymentMethodOptionsKonbiniSetupFutureUsageXf37dd975? = null,
) {
  public class Builder {
    /**
     * An optional 10 to 11 digit numeric-only string determining the confirmation code at applicable convenience
     * stores.
     */
    public var confirmationNumber: String? = null

    /**
     * The number of calendar days (between 1 and 60) after which Konbini payment instructions will expire. For example,
     * if a PaymentIntent is confirmed with Konbini and `expires_after_days` set to 2 on Monday JST, the instructions
     * will expire on Wednesday 23:59:59 JST.
     */
    public var expiresAfterDays: Int? = null

    /**
     * The timestamp at which the Konbini payment instructions will expire. Only one of `expires_after_days` or
     * `expires_at` may be set.
     */
    public var expiresAt: Int? = null

    /**
     * A product descriptor of up to 22 characters, which will appear to customers at the convenience store.
     */
    public var productDescription: String? = null

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
    public var setupFutureUsage: InlinePaymentMethodOptionsKonbiniSetupFutureUsageXf37dd975? = null

    public fun build(): PaymentMethodOptionsKonbini = PaymentMethodOptionsKonbini(
      confirmationNumber = confirmationNumber,
      expiresAfterDays = expiresAfterDays,
      expiresAt = expiresAt,
      productDescription = productDescription,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsKonbini = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsKonbini> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsKonbini {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsKonbini")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsKonbini must be a JSON object")
      return PaymentMethodOptionsKonbini(
        confirmationNumber = rawObject["confirmation_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expiresAfterDays = rawObject["expires_after_days"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        productDescription = rawObject["product_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlinePaymentMethodOptionsKonbiniSetupFutureUsageXf37dd975>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsKonbini) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsKonbini")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.confirmationNumber?.let { put("confirmation_number", it) }
        value.expiresAfterDays?.let { put("expires_after_days", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.productDescription?.let { put("product_description", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsKonbini(block: PaymentMethodOptionsKonbini.Builder.() -> Unit): PaymentMethodOptionsKonbini = PaymentMethodOptionsKonbini.build(block)

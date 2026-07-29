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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_wallet_visa_checkout
 */
@Serializable(with = PaymentMethodDetailsCardWalletVisaCheckout.Serializer::class)
public class PaymentMethodDetailsCardWalletVisaCheckout(
  /**
   * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time
   * of authorization or settlement. They cannot be set or mutated.
   */
  public val billingAddress:
      InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813? = null,
  /**
   * Owner's verified email. Values are verified or provided by the wallet directly (if supported) at the time of
   * authorization or settlement. They cannot be set or mutated.
   */
  public val email: String? = null,
  /**
   * Owner's verified full name. Values are verified or provided by the wallet directly (if supported) at the time of
   * authorization or settlement. They cannot be set or mutated.
   */
  public val name: String? = null,
  /**
   * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the
   * time of authorization or settlement. They cannot be set or mutated.
   */
  public val shippingAddress:
      InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640? = null,
) {
  public class Builder {
    /**
     * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the
     * time of authorization or settlement. They cannot be set or mutated.
     */
    public var billingAddress:
        InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813? = null

    /**
     * Owner's verified email. Values are verified or provided by the wallet directly (if supported) at the time of
     * authorization or settlement. They cannot be set or mutated.
     */
    public var email: String? = null

    /**
     * Owner's verified full name. Values are verified or provided by the wallet directly (if supported) at the time of
     * authorization or settlement. They cannot be set or mutated.
     */
    public var name: String? = null

    /**
     * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the
     * time of authorization or settlement. They cannot be set or mutated.
     */
    public var shippingAddress:
        InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640? = null

    public fun build(): PaymentMethodDetailsCardWalletVisaCheckout = PaymentMethodDetailsCardWalletVisaCheckout(
      billingAddress = billingAddress,
      email = email,
      name = name,
      shippingAddress = shippingAddress,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardWalletVisaCheckout = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsCardWalletVisaCheckout> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardWalletVisaCheckout {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardWalletVisaCheckout")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCardWalletVisaCheckout must be a JSON object")
      return PaymentMethodDetailsCardWalletVisaCheckout(
        billingAddress = rawObject["billing_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        shippingAddress = rawObject["shipping_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCardWalletVisaCheckout) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardWalletVisaCheckout")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingAddress?.let { put("billing_address", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.shippingAddress?.let { put("shipping_address", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCardWalletVisaCheckout(block: PaymentMethodDetailsCardWalletVisaCheckout.Builder.() -> Unit): PaymentMethodDetailsCardWalletVisaCheckout = PaymentMethodDetailsCardWalletVisaCheckout.build(block)

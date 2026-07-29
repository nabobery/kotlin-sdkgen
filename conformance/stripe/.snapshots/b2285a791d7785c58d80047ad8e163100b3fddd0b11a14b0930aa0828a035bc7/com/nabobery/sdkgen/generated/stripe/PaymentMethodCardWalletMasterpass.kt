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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_wallet_masterpass
 */
@Serializable(with = PaymentMethodCardWalletMasterpass.Serializer::class)
public class PaymentMethodCardWalletMasterpass(
  /**
   * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time
   * of authorization or settlement. They cannot be set or mutated.
   */
  public val billingAddress: InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb? = null,
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
      InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27? = null,
) {
  public class Builder {
    /**
     * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the
     * time of authorization or settlement. They cannot be set or mutated.
     */
    public var billingAddress: InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb? =
        null

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
    public var shippingAddress: InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27? =
        null

    public fun build(): PaymentMethodCardWalletMasterpass = PaymentMethodCardWalletMasterpass(
      billingAddress = billingAddress,
      email = email,
      name = name,
      shippingAddress = shippingAddress,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodCardWalletMasterpass = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodCardWalletMasterpass> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodCardWalletMasterpass {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodCardWalletMasterpass")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodCardWalletMasterpass must be a JSON object")
      return PaymentMethodCardWalletMasterpass(
        billingAddress = rawObject["billing_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        shippingAddress = rawObject["shipping_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodCardWalletMasterpass) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodCardWalletMasterpass")
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

public fun paymentMethodCardWalletMasterpass(block: PaymentMethodCardWalletMasterpass.Builder.() -> Unit): PaymentMethodCardWalletMasterpass = PaymentMethodCardWalletMasterpass.build(block)

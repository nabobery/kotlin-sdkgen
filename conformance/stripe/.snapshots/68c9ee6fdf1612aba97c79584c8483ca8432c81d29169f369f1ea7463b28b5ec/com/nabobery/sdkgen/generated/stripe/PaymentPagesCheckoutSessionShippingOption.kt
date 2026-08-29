package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_shipping_option
 */
@Serializable(with = PaymentPagesCheckoutSessionShippingOption.Serializer::class)
public class PaymentPagesCheckoutSessionShippingOption(
  /**
   * A non-negative integer in cents representing how much to charge.
   */
  public val shippingAmount: Int,
  /**
   * The shipping rate.
   */
  public val shippingRate: InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003,
) {
  public class Builder {
    private var shippingAmountValue: Int? = null

    public var shippingAmount: Int
      get() = requireNotNull(shippingAmountValue) { "shippingAmount is required" }
      set(`value`) {
        shippingAmountValue = value
      }

    private var shippingRateValue:
        InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003? = null

    public var shippingRate: InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003
      get() = requireNotNull(shippingRateValue) { "shippingRate is required" }
      set(`value`) {
        shippingRateValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionShippingOption {
      check(shippingAmountValue != null) { "shippingAmount is required" }
      check(shippingRateValue != null) { "shippingRate is required" }
      return PaymentPagesCheckoutSessionShippingOption(
        shippingAmount = shippingAmount,
        shippingRate = shippingRate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionShippingOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionShippingOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionShippingOption {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionShippingOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionShippingOption must be a JSON object")
      val shippingAmount = json.decodeRequired<Int>(rawObject, "shipping_amount")
      val shippingRate = json.decodeRequired<InlinePaymentPagesCheckoutSessionShippingOptionShippingRateX8ed48003>(rawObject, "shipping_rate")
      return PaymentPagesCheckoutSessionShippingOption(
        shippingAmount = shippingAmount,
        shippingRate = shippingRate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionShippingOption) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionShippingOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("shipping_amount", json.encodeToJsonElement(value.shippingAmount))
        put("shipping_rate", json.encodeToJsonElement(value.shippingRate))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionShippingOption(block: PaymentPagesCheckoutSessionShippingOption.Builder.() -> Unit): PaymentPagesCheckoutSessionShippingOption = PaymentPagesCheckoutSessionShippingOption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionShippingOption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

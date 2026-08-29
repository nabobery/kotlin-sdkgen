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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_shipping_option
 */
@Serializable(with = PaymentLinksResourceShippingOption.Serializer::class)
public class PaymentLinksResourceShippingOption(
  /**
   * A non-negative integer in cents representing how much to charge.
   */
  public val shippingAmount: Int,
  /**
   * The ID of the Shipping Rate to use for this shipping option.
   */
  public val shippingRate: InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a,
) {
  public class Builder {
    private var shippingAmountValue: Int? = null

    public var shippingAmount: Int
      get() = requireNotNull(shippingAmountValue) { "shippingAmount is required" }
      set(`value`) {
        shippingAmountValue = value
      }

    private var shippingRateValue: InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a? =
        null

    public var shippingRate: InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a
      get() = requireNotNull(shippingRateValue) { "shippingRate is required" }
      set(`value`) {
        shippingRateValue = value
      }

    public fun build(): PaymentLinksResourceShippingOption {
      check(shippingAmountValue != null) { "shippingAmount is required" }
      check(shippingRateValue != null) { "shippingRate is required" }
      return PaymentLinksResourceShippingOption(
        shippingAmount = shippingAmount,
        shippingRate = shippingRate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceShippingOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceShippingOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceShippingOption {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceShippingOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceShippingOption must be a JSON object")
      val shippingAmount = json.decodeRequired<Int>(rawObject, "shipping_amount")
      val shippingRate = json.decodeRequired<InlinePaymentLinksResourceShippingOptionShippingRateX25fa606a>(rawObject, "shipping_rate")
      return PaymentLinksResourceShippingOption(
        shippingAmount = shippingAmount,
        shippingRate = shippingRate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceShippingOption) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceShippingOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("shipping_amount", json.encodeToJsonElement(value.shippingAmount))
        put("shipping_rate", json.encodeToJsonElement(value.shippingRate))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceShippingOption(block: PaymentLinksResourceShippingOption.Builder.() -> Unit): PaymentLinksResourceShippingOption = PaymentLinksResourceShippingOption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceShippingOption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

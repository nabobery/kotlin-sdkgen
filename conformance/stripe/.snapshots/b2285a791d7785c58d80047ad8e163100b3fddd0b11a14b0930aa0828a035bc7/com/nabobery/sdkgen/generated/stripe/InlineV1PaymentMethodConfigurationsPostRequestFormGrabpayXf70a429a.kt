package com.nabobery.sdkgen.generated.stripe

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
 * GrabPay is a payment method developed by [Grab](https://www.grab.com/sg/consumer/finance/pay/). GrabPay is a digital
 * wallet - customers maintain a balance in their wallets that they pay out with. Check this
 * [page](https://docs.stripe.com/payments/grabpay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/grabpay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormGrabpayDisplayPreferenceX08b116b0? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormGrabpayDisplayPreferenceX08b116b0? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a = InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormGrabpayDisplayPreferenceX08b116b0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a(block: InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a = InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXf70a429a.build(block)

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
 * Sunbit is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method where customers
 * choose to pay in 3, 6, or 12 installments. Customers are redirected from your website or app, authorize the payment
 * with Sunbit, then return to your website or app. You get [immediate
 * notification](https://docs.stripe.com/payments/payment-methods#payment-notification) of whether the payment succeeded
 * or failed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/sunbit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSunbitDisplayPreferenceX57fe3534? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSunbitDisplayPreferenceX57fe3534? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889 = InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSunbitDisplayPreferenceX57fe3534>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889(block: InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889 = InlineV1PaymentMethodConfigurationsPostRequestFormSunbitXa1c2b889.build(block)

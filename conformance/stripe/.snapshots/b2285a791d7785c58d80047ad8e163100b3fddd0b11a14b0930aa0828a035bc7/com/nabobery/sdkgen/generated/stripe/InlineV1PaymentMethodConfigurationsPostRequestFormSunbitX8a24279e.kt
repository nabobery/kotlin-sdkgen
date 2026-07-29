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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/sunbit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSunbitDisplayPreferenceX56dd3efc? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSunbitDisplayPreferenceX56dd3efc? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e = InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSunbitDisplayPreferenceX56dd3efc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e(block: InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e = InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e.build(block)

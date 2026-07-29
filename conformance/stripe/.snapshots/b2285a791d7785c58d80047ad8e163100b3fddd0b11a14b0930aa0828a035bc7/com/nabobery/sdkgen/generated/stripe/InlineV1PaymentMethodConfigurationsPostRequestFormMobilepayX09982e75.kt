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
 * MobilePay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) card wallet payment method used
 * in Denmark and Finland. It allows customers to [authenticate and
 * approve](https://docs.stripe.com/payments/payment-methods#customer-actions) payments using the MobilePay app. Check
 * this [page](https://docs.stripe.com/payments/mobilepay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/mobilepay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormMobilepayDisplayPreferenceXfc37769e? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormMobilepayDisplayPreferenceXfc37769e? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75 = InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormMobilepayDisplayPreferenceXfc37769e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75(block: InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75 = InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75.build(block)

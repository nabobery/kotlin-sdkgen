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
 * PAYCO is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/payco
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPaycoDisplayPreferenceX8e935dc0? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPaycoDisplayPreferenceX8e935dc0? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767 = InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPaycoDisplayPreferenceX8e935dc0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767(block: InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767 = InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767.build(block)

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
 * PromptPay is a Thailand-based payment method that allows customers to make a payment using their preferred app from
 * participating banks. Check this [page](https://docs.stripe.com/payments/promptpay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/promptpay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPromptpayDisplayPreferenceXaf1cbe6f? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPromptpayDisplayPreferenceXaf1cbe6f? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3 = InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPromptpayDisplayPreferenceXaf1cbe6f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3(block: InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3 = InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXe14676a3.build(block)

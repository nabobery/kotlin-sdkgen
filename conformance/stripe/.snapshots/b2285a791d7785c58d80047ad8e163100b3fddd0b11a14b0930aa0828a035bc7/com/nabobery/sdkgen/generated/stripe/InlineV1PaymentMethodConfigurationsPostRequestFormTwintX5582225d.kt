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
 * Twint is a payment method popular in Switzerland. It allows customers to pay using their mobile phone. Check this
 * [page](https://docs.stripe.com/payments/twint) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/twint
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormTwintDisplayPreferenceXb99ee490? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormTwintDisplayPreferenceXb99ee490? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d = InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormTwintDisplayPreferenceXb99ee490>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d(block: InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d = InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d.build(block)

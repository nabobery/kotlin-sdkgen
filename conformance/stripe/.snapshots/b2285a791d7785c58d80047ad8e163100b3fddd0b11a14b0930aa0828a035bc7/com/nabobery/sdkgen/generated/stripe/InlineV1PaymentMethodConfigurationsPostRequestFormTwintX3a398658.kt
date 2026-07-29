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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/twint
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormTwintDisplayPreferenceX7da5d845? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormTwintDisplayPreferenceX7da5d845? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658 = InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormTwintDisplayPreferenceX7da5d845>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658(block: InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658 = InlineV1PaymentMethodConfigurationsPostRequestFormTwintX3a398658.build(block)

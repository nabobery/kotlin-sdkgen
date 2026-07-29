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
 * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to pay using their PayPal
 * account. Check this [page](https://docs.stripe.com/payments/paypal) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/paypal
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPaypalDisplayPreferenceX696681d7? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPaypalDisplayPreferenceX696681d7? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb = InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPaypalDisplayPreferenceX696681d7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb(block: InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb = InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX9d9e69bb.build(block)

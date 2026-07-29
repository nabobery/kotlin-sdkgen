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
 * PayTo is a [real-time](https://docs.stripe.com/payments/real-time) payment method that enables customers in Australia
 * to pay by providing their bank account details. Customers must accept a mandate authorizing you to debit their
 * account. Check this [page](https://docs.stripe.com/payments/payto) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payto
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPaytoDisplayPreferenceX77c70bb5? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPaytoDisplayPreferenceX77c70bb5? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369 = InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPaytoDisplayPreferenceX77c70bb5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369(block: InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369 = InlineV1PaymentMethodConfigurationsPostRequestFormPaytoX431cc369.build(block)

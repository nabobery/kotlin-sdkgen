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
 * Bancontact is the most popular online payment method in Belgium, with over 15 million cards in circulation.
 * [Customers](https://docs.stripe.com/api/customers) use a Bancontact card or mobile app linked to a Belgian bank
 * account to make online payments that are secure, guaranteed, and confirmed immediately. Check this
 * [page](https://docs.stripe.com/payments/bancontact) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/bancontact
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX2975c00c? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX2975c00c? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b = InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX2975c00c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b(block: InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b = InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX7ea2e26b.build(block)

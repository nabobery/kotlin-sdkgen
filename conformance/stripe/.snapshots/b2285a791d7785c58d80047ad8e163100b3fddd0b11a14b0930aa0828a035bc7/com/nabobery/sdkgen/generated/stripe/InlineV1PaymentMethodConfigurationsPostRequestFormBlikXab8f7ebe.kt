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
 * BLIK is a [single use](https://docs.stripe.com/payments/payment-methods#usage) payment method that requires customers
 * to authenticate their payments. When customers want to pay online using BLIK, they request a six-digit code from
 * their banking application and enter it into the payment collection form. Check this
 * [page](https://docs.stripe.com/payments/blik) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/blik
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe = InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe(block: InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe = InlineV1PaymentMethodConfigurationsPostRequestFormBlikXab8f7ebe.build(block)

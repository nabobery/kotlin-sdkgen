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
 * Stripe users in Europe and the United States can use the [Payment Intents
 * API](https://stripe.com/docs/payments/payment-intents)—a single integration path for creating payments using any
 * supported method—to accept [Sofort](https://www.sofort.com/) payments from customers. Check this
 * [page](https://docs.stripe.com/payments/sofort) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/sofort
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSofortDisplayPreferenceX25159872? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSofortDisplayPreferenceX25159872? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600 = InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSofortDisplayPreferenceX25159872>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600(block: InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600 = InlineV1PaymentMethodConfigurationsPostRequestFormSofortX8259f600.build(block)

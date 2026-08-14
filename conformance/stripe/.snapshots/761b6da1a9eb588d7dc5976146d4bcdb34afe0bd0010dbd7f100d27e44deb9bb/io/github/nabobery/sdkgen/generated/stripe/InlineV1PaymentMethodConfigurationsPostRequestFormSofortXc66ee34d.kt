package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/sofort
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSofortDisplayPreferenceXccaf9805? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSofortDisplayPreferenceXccaf9805? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d = InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSofortDisplayPreferenceXccaf9805>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d(block: InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d = InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d.build(block)

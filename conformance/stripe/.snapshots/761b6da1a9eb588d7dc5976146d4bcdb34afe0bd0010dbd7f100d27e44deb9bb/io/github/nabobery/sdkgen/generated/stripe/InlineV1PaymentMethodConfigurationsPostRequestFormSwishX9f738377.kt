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
 * Swish is a [real-time](https://docs.stripe.com/payments/real-time) payment method popular in Sweden. It allows
 * customers to [authenticate and approve](https://docs.stripe.com/payments/payment-methods#customer-actions) payments
 * using the Swish mobile app and the Swedish BankID mobile app. Check this
 * [page](https://docs.stripe.com/payments/swish) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/swish
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSwishDisplayPreferenceXc71b685a? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSwishDisplayPreferenceXc71b685a? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377 = InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSwishDisplayPreferenceXc71b685a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377(block: InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377 = InlineV1PaymentMethodConfigurationsPostRequestFormSwishX9f738377.build(block)

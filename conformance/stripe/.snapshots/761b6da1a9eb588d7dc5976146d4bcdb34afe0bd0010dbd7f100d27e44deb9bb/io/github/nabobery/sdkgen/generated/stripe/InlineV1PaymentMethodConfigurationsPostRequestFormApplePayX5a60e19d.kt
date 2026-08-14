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
 * Stripe users can accept [Apple Pay](https://stripe.com/payments/apple-pay) in iOS applications in iOS 9 and later,
 * and on the web in Safari starting with iOS 10 or macOS Sierra. There are no additional fees to process Apple Pay
 * payments, and the [pricing](https://stripe.com/pricing) is the same as other card transactions. Check this
 * [page](https://docs.stripe.com/apple-pay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/apple_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormApplePayDisplayPreferenceXd4690575? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormApplePayDisplayPreferenceXd4690575? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormApplePayDisplayPreferenceXd4690575>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d(block: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d.build(block)

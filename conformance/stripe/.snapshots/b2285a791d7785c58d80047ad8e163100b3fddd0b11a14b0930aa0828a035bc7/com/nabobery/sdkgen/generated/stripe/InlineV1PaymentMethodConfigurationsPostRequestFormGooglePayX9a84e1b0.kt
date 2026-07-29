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
 * Google Pay allows customers to make payments in your app or website using any credit or debit card saved to their
 * Google Account, including those from Google Play, YouTube, Chrome, or an Android device. Use the Google Pay API to
 * request any credit or debit card stored in your customer's Google account. Check this
 * [page](https://docs.stripe.com/google-pay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/google_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormGooglePayDisplayPreferenceXe471f811? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormGooglePayDisplayPreferenceXe471f811? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0 = InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormGooglePayDisplayPreferenceXe471f811>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0(block: InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0 = InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX9a84e1b0.build(block)

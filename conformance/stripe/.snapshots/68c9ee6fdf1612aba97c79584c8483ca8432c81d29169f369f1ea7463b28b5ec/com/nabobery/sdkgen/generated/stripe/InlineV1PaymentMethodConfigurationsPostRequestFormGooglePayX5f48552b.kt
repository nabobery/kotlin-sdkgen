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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/google_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormGooglePayDisplayPreferenceXe2009e3c? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormGooglePayDisplayPreferenceXe2009e3c? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b = InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormGooglePayDisplayPreferenceXe2009e3c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b(block: InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b = InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b.build(block)

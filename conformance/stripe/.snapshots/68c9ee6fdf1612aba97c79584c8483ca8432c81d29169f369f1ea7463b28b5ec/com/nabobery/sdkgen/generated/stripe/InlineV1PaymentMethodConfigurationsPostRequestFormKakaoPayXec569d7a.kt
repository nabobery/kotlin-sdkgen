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
 * Kakao Pay is a popular local wallet available in South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/kakao_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceXbbb16d6e? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceXbbb16d6e? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a = InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceXbbb16d6e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a(block: InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a = InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayXec569d7a.build(block)

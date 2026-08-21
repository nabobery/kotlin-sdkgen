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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/kakao_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b = InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b(block: InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b = InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b.build(block)

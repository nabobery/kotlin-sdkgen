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
 * Naver Pay is a popular local wallet available in South Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormNaverPayDisplayPreferenceX9ff7cc5a? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormNaverPayDisplayPreferenceX9ff7cc5a? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7 = InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormNaverPayDisplayPreferenceX9ff7cc5a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7(block: InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7 = InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7.build(block)

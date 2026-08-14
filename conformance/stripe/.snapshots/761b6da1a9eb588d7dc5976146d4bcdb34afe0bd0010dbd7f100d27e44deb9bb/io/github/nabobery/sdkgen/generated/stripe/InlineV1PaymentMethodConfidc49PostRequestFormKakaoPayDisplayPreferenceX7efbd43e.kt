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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/kakao_pay/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/kakao_pay/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e.Serializer::class)
public class InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayPreferenceXda5a49f0? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayPreferenceXda5a49f0?
        = null

    public fun build(): InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e = InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e must be a JSON object")
      return InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayPreferenceXda5a49f0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e(block: InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e.Builder.() -> Unit): InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e = InlineV1PaymentMethodConfidc49PostRequestFormKakaoPayDisplayPreferenceX7efbd43e.build(block)

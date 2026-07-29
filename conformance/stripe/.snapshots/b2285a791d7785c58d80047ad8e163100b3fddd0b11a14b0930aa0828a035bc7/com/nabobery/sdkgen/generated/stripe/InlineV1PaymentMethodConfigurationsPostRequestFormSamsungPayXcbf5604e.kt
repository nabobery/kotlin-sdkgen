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
 * Samsung Pay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in South
 * Korea.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/samsung_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX274848b6? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX274848b6? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e = InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX274848b6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e(block: InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e = InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayXcbf5604e.build(block)

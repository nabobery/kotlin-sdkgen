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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/zip/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/zip/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormZipPreferenceX45f3e9e5? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormZipPreferenceX45f3e9e5? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20 = InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormZipPreferenceX45f3e9e5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20(block: InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20 = InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceXade79f20.build(block)

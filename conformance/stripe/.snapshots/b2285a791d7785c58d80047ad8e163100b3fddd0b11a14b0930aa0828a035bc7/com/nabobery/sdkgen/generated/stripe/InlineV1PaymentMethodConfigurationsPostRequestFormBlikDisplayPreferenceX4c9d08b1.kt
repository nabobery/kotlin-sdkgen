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
 * lication~1x-www-form-urlencoded/schema/properties/blik/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/blik/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormBlikPreferenceX2e2df19c? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormBlikPreferenceX2e2df19c? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1 = InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBlikPreferenceX2e2df19c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1(block: InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1 = InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1.build(block)

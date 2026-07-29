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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/zip/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/zip/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormZipPreferenceXcc4657de? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormZipPreferenceXcc4657de? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848 = InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormZipPreferenceXcc4657de>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848(block: InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848 = InlineV1PaymentMethodConfigurationsPostRequestFormZipDisplayPreferenceX0b820848.build(block)

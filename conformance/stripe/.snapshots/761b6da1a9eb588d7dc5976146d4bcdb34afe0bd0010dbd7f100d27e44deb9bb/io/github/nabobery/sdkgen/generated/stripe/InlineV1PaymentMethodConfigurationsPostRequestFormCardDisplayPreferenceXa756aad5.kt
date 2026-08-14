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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/card/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/card/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormCardPreferenceX04efad5e? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormCardPreferenceX04efad5e? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5 = InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormCardPreferenceX04efad5e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5(block: InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5 = InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5.build(block)

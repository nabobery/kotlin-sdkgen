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
 * orm-urlencoded/schema/properties/alma/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/alma/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormAlmaPreferenceXfd1c9b90? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormAlmaPreferenceXfd1c9b90? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82 = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAlmaPreferenceXfd1c9b90>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82(block: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82 = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82.build(block)

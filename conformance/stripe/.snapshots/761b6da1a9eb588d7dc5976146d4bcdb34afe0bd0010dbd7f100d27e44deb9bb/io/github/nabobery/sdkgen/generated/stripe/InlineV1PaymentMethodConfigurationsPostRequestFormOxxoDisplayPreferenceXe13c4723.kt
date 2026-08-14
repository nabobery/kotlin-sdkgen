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
 * orm-urlencoded/schema/properties/oxxo/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/oxxo/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormOxxoPreferenceX4b96683d? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormOxxoPreferenceX4b96683d? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723 = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormOxxoPreferenceX4b96683d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723(block: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723 = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723.build(block)

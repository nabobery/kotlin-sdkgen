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
 * orm-urlencoded/schema/properties/p24/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/p24/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormP24PreferenceXe3b095d2? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormP24PreferenceXe3b095d2? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe = InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormP24PreferenceXe3b095d2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe(block: InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe = InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe.build(block)

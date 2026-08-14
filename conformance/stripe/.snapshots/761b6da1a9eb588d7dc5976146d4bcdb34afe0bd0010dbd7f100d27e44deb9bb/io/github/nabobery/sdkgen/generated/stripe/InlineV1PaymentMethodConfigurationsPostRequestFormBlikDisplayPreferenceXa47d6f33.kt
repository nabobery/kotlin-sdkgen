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
 * orm-urlencoded/schema/properties/blik/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/blik/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormBlikPreferenceX17b3dba1? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormBlikPreferenceX17b3dba1? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33 = InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBlikPreferenceX17b3dba1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33(block: InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33 = InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceXa47d6f33.build(block)

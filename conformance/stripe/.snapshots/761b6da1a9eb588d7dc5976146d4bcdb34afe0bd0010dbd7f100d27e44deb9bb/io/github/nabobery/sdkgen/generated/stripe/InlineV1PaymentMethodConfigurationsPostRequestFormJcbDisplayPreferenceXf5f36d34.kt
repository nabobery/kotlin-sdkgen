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
 * lication~1x-www-form-urlencoded/schema/properties/jcb/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/jcb/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormJcbPreferenceXc4042a3c? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormJcbPreferenceXc4042a3c? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34 = InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormJcbPreferenceXc4042a3c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34(block: InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34 = InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXf5f36d34.build(block)

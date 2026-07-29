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
 * orm-urlencoded/schema/properties/jcb/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/jcb/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormJcbPreferenceX62d941ea? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormJcbPreferenceX62d941ea? =
        null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6 = InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormJcbPreferenceX62d941ea>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6(block: InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6 = InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6.build(block)

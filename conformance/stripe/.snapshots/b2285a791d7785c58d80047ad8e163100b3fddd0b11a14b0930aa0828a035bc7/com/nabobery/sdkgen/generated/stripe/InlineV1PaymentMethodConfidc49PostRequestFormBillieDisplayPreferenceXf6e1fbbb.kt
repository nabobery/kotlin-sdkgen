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
 * orm-urlencoded/schema/properties/billie/properties/display_preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/billie/properties/display_preference
 */
@Serializable(with = InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb.Serializer::class)
public class InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb(
  public val preference:
      InlineV1PaymentMethodConfidc49PostRequestFormBilliePreferenceX013aca38? = null,
) {
  public class Builder {
    public var preference: InlineV1PaymentMethodConfidc49PostRequestFormBilliePreferenceX013aca38? =
        null

    public fun build(): InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb = InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb(
      preference = preference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb must be a JSON object")
      return InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb(
        preference = rawObject["preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBilliePreferenceX013aca38>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.preference?.let { put("preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb(block: InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb.Builder.() -> Unit): InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb = InlineV1PaymentMethodConfidc49PostRequestFormBillieDisplayPreferenceXf6e1fbbb.build(block)

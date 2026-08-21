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
 * Alma is a Buy Now, Pay Later payment method that offers customers the ability to pay in 2, 3, or 4 installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/alma
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAlmaDisplayPreferenceX914cfb82>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc(block: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc = InlineV1PaymentMethodConfigurationsPostRequestFormAlmaXff86f3bc.build(block)

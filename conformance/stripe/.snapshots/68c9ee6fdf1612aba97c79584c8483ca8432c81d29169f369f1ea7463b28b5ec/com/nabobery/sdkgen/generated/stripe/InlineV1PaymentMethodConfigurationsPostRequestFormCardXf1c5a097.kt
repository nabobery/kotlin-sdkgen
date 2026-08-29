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
 * Cards are a popular way for consumers and businesses to pay online or in person. Stripe supports global and local
 * card networks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceX32540df1? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceX32540df1? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097 = InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceX32540df1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097(block: InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097 = InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097.build(block)

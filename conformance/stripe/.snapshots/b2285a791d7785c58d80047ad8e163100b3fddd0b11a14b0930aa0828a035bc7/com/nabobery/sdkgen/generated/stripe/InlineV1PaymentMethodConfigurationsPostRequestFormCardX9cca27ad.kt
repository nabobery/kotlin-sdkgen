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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad = InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCardDisplayPreferenceXa756aad5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad(block: InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad = InlineV1PaymentMethodConfigurationsPostRequestFormCardX9cca27ad.build(block)

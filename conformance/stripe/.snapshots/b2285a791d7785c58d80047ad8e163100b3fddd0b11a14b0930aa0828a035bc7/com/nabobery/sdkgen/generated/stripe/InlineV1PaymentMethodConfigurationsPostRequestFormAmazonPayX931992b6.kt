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
 * Amazon Pay is a wallet payment method that lets your customers check out the same way as on Amazon.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/amazon_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormAmazonPayDisplayPreferenceXfa05df25? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormAmazonPayDisplayPreferenceXfa05df25? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6 = InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAmazonPayDisplayPreferenceXfa05df25>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6(block: InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6 = InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX931992b6.build(block)

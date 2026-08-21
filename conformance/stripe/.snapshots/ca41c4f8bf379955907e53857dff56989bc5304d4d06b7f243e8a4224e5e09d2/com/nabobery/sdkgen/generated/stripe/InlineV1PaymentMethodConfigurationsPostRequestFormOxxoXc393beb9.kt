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
 * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin America and represents nearly
 * 20% of online transactions in Mexico. OXXO allows customers to pay bills and online purchases in-store with cash.
 * Check this [page](https://docs.stripe.com/payments/oxxo) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/oxxo
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9 = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXc4b4028a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9(block: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9 = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9.build(block)

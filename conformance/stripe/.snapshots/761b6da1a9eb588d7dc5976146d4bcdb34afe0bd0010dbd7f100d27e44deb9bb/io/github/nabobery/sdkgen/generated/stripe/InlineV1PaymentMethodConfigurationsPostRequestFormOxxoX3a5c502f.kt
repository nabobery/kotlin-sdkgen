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
 * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin America and represents nearly
 * 20% of online transactions in Mexico. OXXO allows customers to pay bills and online purchases in-store with cash.
 * Check this [page](https://docs.stripe.com/payments/oxxo) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/oxxo
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoDisplayPreferenceXe13c4723>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f(block: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f = InlineV1PaymentMethodConfigurationsPostRequestFormOxxoX3a5c502f.build(block)

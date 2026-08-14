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
 * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil. Check this
 * [page](https://docs.stripe.com/payments/boleto) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/boleto
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormBoletoDisplayPreferenceX301931b8? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormBoletoDisplayPreferenceX301931b8? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83 = InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBoletoDisplayPreferenceX301931b8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83(block: InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83 = InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX97a9ba83.build(block)

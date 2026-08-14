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
 * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores with cash. Check this
 * [page](https://docs.stripe.com/payments/konbini) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/konbini
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormKonbiniDisplayPreferenceXba230e93? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormKonbiniDisplayPreferenceXba230e93? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89 = InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormKonbiniDisplayPreferenceXba230e93>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89(block: InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89 = InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89.build(block)

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
 * Cartes Bancaires is France's local card network. More than 95% of these cards are co-branded with either Visa or
 * Mastercard, meaning you can process these cards over either Cartes Bancaires or the Visa or Mastercard networks.
 * Check this [page](https://docs.stripe.com/payments/cartes-bancaires) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/cartes_bancaires
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXb25072db? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXb25072db? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74 = InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXb25072db>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74(block: InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74 = InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74.build(block)

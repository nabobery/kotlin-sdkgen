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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/cartes_bancaires
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX6ba632b8? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX6ba632b8? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d = InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX6ba632b8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d(block: InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d = InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesXe72f2d6d.build(block)

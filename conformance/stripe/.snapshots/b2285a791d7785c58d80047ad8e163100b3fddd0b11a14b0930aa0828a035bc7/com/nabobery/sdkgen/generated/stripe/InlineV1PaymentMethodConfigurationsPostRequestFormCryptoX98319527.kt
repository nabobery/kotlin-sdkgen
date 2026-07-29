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
 * [Stablecoin payments](https://docs.stripe.com/payments/stablecoin-payments) enable customers to pay in stablecoins
 * like USDC from 100s of wallets including Phantom and Metamask.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/crypto
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormCryptoDisplayPreferenceX3a7c048f? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormCryptoDisplayPreferenceX3a7c048f? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527 = InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormCryptoDisplayPreferenceX3a7c048f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527(block: InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527 = InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX98319527.build(block)

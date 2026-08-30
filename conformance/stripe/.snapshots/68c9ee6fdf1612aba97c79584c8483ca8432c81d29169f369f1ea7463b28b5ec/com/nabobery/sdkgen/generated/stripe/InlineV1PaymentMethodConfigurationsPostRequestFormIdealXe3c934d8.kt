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
 * iDEAL is a Netherlands-based payment method that allows customers to complete transactions online using their bank
 * credentials. All major Dutch banks are members of Currence, the scheme that operates iDEAL, making it the most
 * popular online payment method in the Netherlands with a share of online transactions close to 55%. Check this
 * [page](https://docs.stripe.com/payments/ideal) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/ideal
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormIdealDisplayPreferenceXfad24265? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormIdealDisplayPreferenceXfad24265? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8 = InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormIdealDisplayPreferenceXfad24265>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8(block: InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8 = InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8.build(block)

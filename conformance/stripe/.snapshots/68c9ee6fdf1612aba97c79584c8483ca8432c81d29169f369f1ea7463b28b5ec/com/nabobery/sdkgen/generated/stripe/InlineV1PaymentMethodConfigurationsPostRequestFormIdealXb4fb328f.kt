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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/ideal
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormIdealDisplayPreferenceXd807c628? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormIdealDisplayPreferenceXd807c628? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f = InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormIdealDisplayPreferenceXd807c628>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f(block: InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f = InlineV1PaymentMethodConfigurationsPostRequestFormIdealXb4fb328f.build(block)

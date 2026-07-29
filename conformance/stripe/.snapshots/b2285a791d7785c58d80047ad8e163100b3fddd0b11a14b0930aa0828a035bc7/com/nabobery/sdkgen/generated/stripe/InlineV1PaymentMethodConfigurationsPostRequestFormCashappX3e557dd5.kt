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
 * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and receive money using
 * their digital wallet. Check this [page](https://docs.stripe.com/payments/cash-app-pay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/cashapp
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormCashappDisplayPreferenceXe7679c87? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormCashappDisplayPreferenceXe7679c87? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5 = InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormCashappDisplayPreferenceXe7679c87>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5(block: InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5 = InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5.build(block)

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/cashapp
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormCashappDisplayPreferenceX40ab4f8f? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormCashappDisplayPreferenceX40ab4f8f? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a = InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormCashappDisplayPreferenceX40ab4f8f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a(block: InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a = InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3f4db87a.build(block)

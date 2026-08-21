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
 * Scalapay is a [single-use](/payments/payment-methods#usage) payment method that lets customers pay in 3 or 4
 * installments. Customers are redirected from your website or app, authorize the payment with Scalapay, then return to
 * your website or app. You get [immediate notification](/payments/payment-methods#payment-notification) of whether the
 * payment succeeded or failed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/scalapay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormScalapayDisplayPreferenceXc30a58d9? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormScalapayDisplayPreferenceXc30a58d9? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84 = InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormScalapayDisplayPreferenceXc30a58d9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84(block: InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84 = InlineV1PaymentMethodConfigurationsPostRequestFormScalapayXda46ec84.build(block)

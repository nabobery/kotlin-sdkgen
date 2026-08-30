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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/scalapay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormScalapayDisplayPreferenceX7e345945? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormScalapayDisplayPreferenceX7e345945? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc = InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormScalapayDisplayPreferenceX7e345945>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc(block: InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc = InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc.build(block)

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
 * Satispay is a [single-use](/payments/payment-methods#usage) payment method where customers are required to
 * [authenticate](/payments/payment-methods#customer-actions) their payment. Customers pay by being redirected from your
 * website or app, authorizing the payment with Satispay, then returning to your website or app. You get [immediate
 * notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or failed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/satispay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormSatispayDisplayPreferenceXbace1524? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormSatispayDisplayPreferenceXbace1524? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721 = InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormSatispayDisplayPreferenceXbace1524>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721(block: InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721 = InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXe22c1721.build(block)

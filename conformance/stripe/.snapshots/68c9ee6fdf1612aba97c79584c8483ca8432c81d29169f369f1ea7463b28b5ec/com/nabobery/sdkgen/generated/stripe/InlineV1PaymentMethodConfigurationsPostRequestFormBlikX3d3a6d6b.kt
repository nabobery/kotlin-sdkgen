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
 * BLIK is a [single use](https://docs.stripe.com/payments/payment-methods#usage) payment method that requires customers
 * to authenticate their payments. When customers want to pay online using BLIK, they request a six-digit code from
 * their banking application and enter it into the payment collection form. Check this
 * [page](https://docs.stripe.com/payments/blik) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/blik
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b = InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBlikDisplayPreferenceX4c9d08b1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b(block: InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b = InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b.build(block)

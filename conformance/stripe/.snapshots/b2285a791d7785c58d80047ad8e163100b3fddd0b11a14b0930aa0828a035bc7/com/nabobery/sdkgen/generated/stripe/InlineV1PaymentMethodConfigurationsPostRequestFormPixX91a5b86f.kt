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
 * Pix is a payment method popular in Brazil. When paying with Pix, customers authenticate and approve payments by
 * scanning a QR code in their preferred banking app. Check this [page](https://docs.stripe.com/payments/pix) for more
 * details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/pix
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f = InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX52a545e6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f(block: InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f = InlineV1PaymentMethodConfigurationsPostRequestFormPixX91a5b86f.build(block)

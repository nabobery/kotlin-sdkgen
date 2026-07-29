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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/pix
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX07bc12d6? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX07bc12d6? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a = InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPixDisplayPreferenceX07bc12d6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a(block: InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a = InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a.build(block)

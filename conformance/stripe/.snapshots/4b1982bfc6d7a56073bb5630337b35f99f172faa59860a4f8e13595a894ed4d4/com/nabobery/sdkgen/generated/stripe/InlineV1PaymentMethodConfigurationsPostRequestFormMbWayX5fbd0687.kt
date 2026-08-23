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
 * MB WAY is the most popular wallet in Portugal. After entering their phone number in your checkout, customers approve
 * the payment directly in their MB WAY app. Check this [page](https://docs.stripe.com/payments/mb-way) for more
 * details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/mb_way
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormMbWayDisplayPreferenceX3942261b? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormMbWayDisplayPreferenceX3942261b? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687 = InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormMbWayDisplayPreferenceX3942261b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687(block: InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687 = InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687.build(block)

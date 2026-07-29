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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/mb_way
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormMbWayDisplayPreferenceX057beb71? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormMbWayDisplayPreferenceX057beb71? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656 = InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormMbWayDisplayPreferenceX057beb71>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656(block: InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656 = InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX65d91656.build(block)

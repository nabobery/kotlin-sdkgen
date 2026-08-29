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
 * Alipay is a digital wallet in China that has more than a billion active users worldwide. Alipay users can pay on the
 * web or on a mobile device using login credentials or their Alipay app. Alipay has a low dispute rate and reduces
 * fraud by authenticating payments using the customer's login credentials. Check this
 * [page](https://docs.stripe.com/payments/alipay) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/alipay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormAlipayDisplayPreferenceX131c80c0? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormAlipayDisplayPreferenceX131c80c0? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99 = InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormAlipayDisplayPreferenceX131c80c0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99(block: InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99 = InlineV1PaymentMethodConfigurationsPostRequestFormAlipayXeb55fb99.build(block)

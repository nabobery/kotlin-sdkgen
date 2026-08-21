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
 * [Link](https://docs.stripe.com/payments/link) is a payment method network. With Link, users save their payment
 * details once, then reuse that information to pay with one click for any business on the network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/link
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX92fbdaf5? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX92fbdaf5? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6 = InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormLinkDisplayPreferenceX92fbdaf5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6(block: InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6 = InlineV1PaymentMethodConfigurationsPostRequestFormLinkX757929f6.build(block)

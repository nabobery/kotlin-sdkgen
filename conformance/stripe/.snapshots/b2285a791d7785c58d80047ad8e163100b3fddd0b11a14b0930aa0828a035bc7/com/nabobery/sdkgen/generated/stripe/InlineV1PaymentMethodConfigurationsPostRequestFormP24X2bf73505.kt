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
 * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete transactions online using
 * bank transfers and other methods. Bank transfers account for 30% of online payments in Poland and Przelewy24 provides
 * a way for customers to pay with over 165 banks. Check this [page](https://docs.stripe.com/payments/p24) for more
 * details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/p24
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505 = InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormP24DisplayPreferenceXe541abfe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505(block: InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505 = InlineV1PaymentMethodConfigurationsPostRequestFormP24X2bf73505.build(block)

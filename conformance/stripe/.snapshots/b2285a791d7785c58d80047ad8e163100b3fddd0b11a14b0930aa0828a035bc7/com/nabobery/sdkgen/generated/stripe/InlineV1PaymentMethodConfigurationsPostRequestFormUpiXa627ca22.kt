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
 * Unified Payment Interface (UPI) is India's leading payment method with exponential growth since it launched in 2016.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/upi
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormUpiDisplayPreferenceX23eacf99? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormUpiDisplayPreferenceX23eacf99? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22 = InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormUpiDisplayPreferenceX23eacf99>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22(block: InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22 = InlineV1PaymentMethodConfigurationsPostRequestFormUpiXa627ca22.build(block)

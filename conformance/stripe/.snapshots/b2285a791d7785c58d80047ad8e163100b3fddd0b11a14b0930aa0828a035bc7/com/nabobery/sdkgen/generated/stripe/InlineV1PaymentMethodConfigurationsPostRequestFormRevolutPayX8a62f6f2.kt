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
 * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method. Revolut Pay uses the
 * customer’s stored balance or cards to fund the payment, and offers the option for non-Revolut customers to save their
 * details after their first purchase.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/revolut_pay
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX3ac67421? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX3ac67421? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2 = InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX3ac67421>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2(block: InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2 = InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2.build(block)

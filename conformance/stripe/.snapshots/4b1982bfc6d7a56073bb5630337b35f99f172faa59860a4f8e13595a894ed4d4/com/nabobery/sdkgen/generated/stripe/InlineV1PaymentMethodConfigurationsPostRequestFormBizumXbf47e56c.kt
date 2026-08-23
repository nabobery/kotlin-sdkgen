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
 * To enable Bizum, buyers need a Spanish IBAN from a bank connected to Bizum. Within their banking app, they can enable
 * Bizum and link their mobile number to their IBAN.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/bizum
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormBizumDisplayPreferenceXb03851fe? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormBizumDisplayPreferenceXb03851fe? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c = InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBizumDisplayPreferenceXb03851fe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c(block: InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c = InlineV1PaymentMethodConfigurationsPostRequestFormBizumXbf47e56c.build(block)

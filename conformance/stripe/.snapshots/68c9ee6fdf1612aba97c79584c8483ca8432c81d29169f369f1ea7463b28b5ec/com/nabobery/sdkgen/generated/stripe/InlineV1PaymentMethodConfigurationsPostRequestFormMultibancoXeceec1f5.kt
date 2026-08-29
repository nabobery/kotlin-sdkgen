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
 * Stripe users in Europe and the United States can accept Multibanco payments from customers in Portugal using
 * [Sources](https://stripe.com/docs/sources)—a single integration path for creating payments using any supported
 * method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/multibanco
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX17e17ed7? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX17e17ed7? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5 = InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceX17e17ed7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5(block: InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5 = InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5.build(block)

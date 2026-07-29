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
 * Financial Process Exchange (FPX) is a Malaysia-based payment method that allows customers to complete transactions
 * online using their bank credentials. Bank Negara Malaysia (BNM), the Central Bank of Malaysia, and eleven other major
 * Malaysian financial institutions are members of the PayNet Group, which owns and operates FPX. It is one of the most
 * popular online payment methods in Malaysia, with nearly 90 million transactions in 2018 according to BNM. Check this
 * [page](https://docs.stripe.com/payments/fpx) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/fpx
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormFpxDisplayPreferenceXb1f68aba? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormFpxDisplayPreferenceXb1f68aba? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d = InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormFpxDisplayPreferenceXb1f68aba>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d(block: InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d = InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d.build(block)

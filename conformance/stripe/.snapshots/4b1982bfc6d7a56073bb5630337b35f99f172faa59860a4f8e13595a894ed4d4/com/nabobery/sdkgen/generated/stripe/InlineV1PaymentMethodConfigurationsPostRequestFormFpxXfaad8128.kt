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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/fpx
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128(
  public val displayPreference:
      InlineV1PaymentMethodConfigurationsPostRequestFormFpxDisplayPreferenceXce094fc4? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfigurationsPostRequestFormFpxDisplayPreferenceXce094fc4? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128 = InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormFpxDisplayPreferenceXce094fc4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128(block: InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128 = InlineV1PaymentMethodConfigurationsPostRequestFormFpxXfaad8128.build(block)

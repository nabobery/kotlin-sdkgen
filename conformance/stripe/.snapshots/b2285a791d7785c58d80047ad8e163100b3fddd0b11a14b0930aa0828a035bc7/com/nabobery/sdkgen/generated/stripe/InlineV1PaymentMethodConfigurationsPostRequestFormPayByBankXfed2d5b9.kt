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
 * Pay by bank is a redirect payment method backed by bank transfers. A customer is redirected to their bank to
 * authorize a bank transfer for a given amount. This removes a lot of the error risks inherent in waiting for the
 * customer to initiate a transfer themselves, and is less expensive than card payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/pay_by_bank
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPayByBankDisplayPreferenceX7c47f7cc? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPayByBankDisplayPreferenceX7c47f7cc? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9 = InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPayByBankDisplayPreferenceX7c47f7cc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9(block: InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9 = InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXfed2d5b9.build(block)

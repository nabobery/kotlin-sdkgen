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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/pay_by_bank
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormPayByBankDisplayPreferenceXb8076f60? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormPayByBankDisplayPreferenceXb8076f60? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62 = InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormPayByBankDisplayPreferenceXb8076f60>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62(block: InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62 = InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62.build(block)

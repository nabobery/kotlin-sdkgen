package io.github.nabobery.sdkgen.generated.stripe

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
 * Apple Pay Later, a payment method for customers to buy now and pay later, gives your customers a way to split
 * purchases into four installments across six weeks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/apple_pay_later
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXf706efff? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXf706efff? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9 = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormDisplayPreferenceXf706efff>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9(block: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9 = InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9.build(block)

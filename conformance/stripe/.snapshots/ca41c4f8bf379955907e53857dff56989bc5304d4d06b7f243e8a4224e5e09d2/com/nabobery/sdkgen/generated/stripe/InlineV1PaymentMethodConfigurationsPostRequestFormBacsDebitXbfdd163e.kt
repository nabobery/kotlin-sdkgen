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
 * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank account, check this
 * [page](https://docs.stripe.com/payments/payment-methods/bacs-debit) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/bacs_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormBacsDebitDisplayPreferenceX92e4c120? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormBacsDebitDisplayPreferenceX92e4c120? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e = InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBacsDebitDisplayPreferenceX92e4c120>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e(block: InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e = InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXbfdd163e.build(block)

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
 * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank account, check this
 * [page](https://docs.stripe.com/payments/payment-methods/bacs-debit) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema/properties/bacs_debit
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8(
  public val displayPreference:
      InlineV1PaymentMethodConfidc49PostRequestFormBacsDebitDisplayPreferenceX7ea9a8ff? = null,
) {
  public class Builder {
    public var displayPreference:
        InlineV1PaymentMethodConfidc49PostRequestFormBacsDebitDisplayPreferenceX7ea9a8ff? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8 = InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8(
      displayPreference = displayPreference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8(
        displayPreference = rawObject["display_preference"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfidc49PostRequestFormBacsDebitDisplayPreferenceX7ea9a8ff>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8(block: InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8 = InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8.build(block)

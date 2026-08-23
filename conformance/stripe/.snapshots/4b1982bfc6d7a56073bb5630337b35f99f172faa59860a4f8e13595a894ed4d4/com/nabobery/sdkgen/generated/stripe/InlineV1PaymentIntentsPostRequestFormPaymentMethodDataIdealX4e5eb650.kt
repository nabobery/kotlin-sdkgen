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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/ideal
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650(
  public val bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealBankX5aed103e? = null,
) {
  public class Builder {
    public var bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealBankX5aed103e? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealBankX5aed103e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX4e5eb650.build(block)

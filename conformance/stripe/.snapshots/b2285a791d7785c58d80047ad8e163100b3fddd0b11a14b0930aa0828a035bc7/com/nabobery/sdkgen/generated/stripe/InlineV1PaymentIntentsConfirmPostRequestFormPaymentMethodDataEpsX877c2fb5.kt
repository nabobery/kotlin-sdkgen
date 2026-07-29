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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/eps
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5(
  public val bank:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsBankX5a7886ad? = null,
) {
  public class Builder {
    public var bank: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsBankX5a7886ad?
        = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsBankX5a7886ad>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEpsX877c2fb5.build(block)

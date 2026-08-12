package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/fpx
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8(
  public val bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX4ac1807d,
) {
  public class Builder {
    private var bankValue: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX4ac1807d? =
        null

    public var bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX4ac1807d
      get() = requireNotNull(bankValue) { "bank is required" }
      set(`value`) {
        bankValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8 {
      check(bankValue != null) { "bank is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8(
        bank = bank,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8 must be a JSON object")
      val bank = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX4ac1807d>(rawObject, "bank")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8(
        bank = bank,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank", json.encodeToJsonElement(value.bank))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxX9dfbb5c8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

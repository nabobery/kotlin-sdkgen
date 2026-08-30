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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/fpx
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d(
  public val bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX05d4db2a,
) {
  public class Builder {
    private var bankValue: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX05d4db2a? =
        null

    public var bank: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX05d4db2a
      get() = requireNotNull(bankValue) { "bank is required" }
      set(`value`) {
        bankValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d {
      check(bankValue != null) { "bank is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d(
        bank = bank,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d must be a JSON object")
      val bank = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxBankX05d4db2a>(rawObject, "bank")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d(
        bank = bank,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank", json.encodeToJsonElement(value.bank))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

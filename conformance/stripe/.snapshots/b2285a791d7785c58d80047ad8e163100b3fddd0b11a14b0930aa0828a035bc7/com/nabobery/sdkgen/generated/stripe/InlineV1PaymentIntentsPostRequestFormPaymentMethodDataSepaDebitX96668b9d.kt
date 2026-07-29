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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d(
  public val iban: String,
) {
  public class Builder {
    private var ibanValue: String? = null

    public var iban: String
      get() = requireNotNull(ibanValue) { "iban is required" }
      set(`value`) {
        ibanValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d {
      check(ibanValue != null) { "iban is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d(
        iban = iban,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d must be a JSON object")
      val iban = json.decodeRequired<String>(rawObject, "iban")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d(
        iban = iban,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("iban", value.iban)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitX96668b9d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

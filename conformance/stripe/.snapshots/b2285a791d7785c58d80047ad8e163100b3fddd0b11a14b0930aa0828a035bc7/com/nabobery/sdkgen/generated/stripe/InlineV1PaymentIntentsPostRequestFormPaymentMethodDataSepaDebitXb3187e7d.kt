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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d(
  public val iban: String,
) {
  public class Builder {
    private var ibanValue: String? = null

    public var iban: String
      get() = requireNotNull(ibanValue) { "iban is required" }
      set(`value`) {
        ibanValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d {
      check(ibanValue != null) { "iban is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d(
        iban = iban,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d must be a JSON object")
      val iban = json.decodeRequired<String>(rawObject, "iban")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d(
        iban = iban,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("iban", value.iban)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

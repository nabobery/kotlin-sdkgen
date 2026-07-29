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
 * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a(
  public val iban: String,
) {
  public class Builder {
    private var ibanValue: String? = null

    public var iban: String
      get() = requireNotNull(ibanValue) { "iban is required" }
      set(`value`) {
        ibanValue = value
      }

    public fun build(): InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a {
      check(ibanValue != null) { "iban is required" }
      return InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a(
        iban = iban,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a must be a JSON object")
      val iban = json.decodeRequired<String>(rawObject, "iban")
      return InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a(
        iban = iban,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("iban", value.iban)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a(block: InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a = InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

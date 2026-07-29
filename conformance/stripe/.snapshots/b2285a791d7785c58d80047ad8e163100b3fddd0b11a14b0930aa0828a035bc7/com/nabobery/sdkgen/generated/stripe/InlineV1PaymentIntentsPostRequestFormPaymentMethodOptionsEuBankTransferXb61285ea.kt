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
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/properties/eu_
 * bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/properties/eu_
 * bank_transfer
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea(
  public val country: String,
) {
  public class Builder {
    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea {
      check(countryValue != null) { "country is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea(
        country = country,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea must be a JSON object")
      val country = json.decodeRequired<String>(rawObject, "country")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea(
        country = country,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("country", value.country)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

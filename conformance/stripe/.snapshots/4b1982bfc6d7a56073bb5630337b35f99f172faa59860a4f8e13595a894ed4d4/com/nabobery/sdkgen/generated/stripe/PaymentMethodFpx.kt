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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_fpx
 */
@Serializable(with = PaymentMethodFpx.Serializer::class)
public class PaymentMethodFpx(
  /**
   * The customer's bank, if provided. Can be one of `affin_bank`, `agrobank`, `alliance_bank`, `ambank`, `bank_islam`,
   * `bank_muamalat`, `bank_rakyat`, `bsn`, `cimb`, `hong_leong_bank`, `hsbc`, `kfh`, `maybank2u`, `ocbc`,
   * `public_bank`, `rhb`, `standard_chartered`, `uob`, `deutsche_bank`, `maybank2e`, `pb_enterprise`, or
   * `bank_of_china`.
   */
  public val bank: InlinePaymentMethodFpxBankX7eb5f7ea,
) {
  public class Builder {
    private var bankValue: InlinePaymentMethodFpxBankX7eb5f7ea? = null

    public var bank: InlinePaymentMethodFpxBankX7eb5f7ea
      get() = requireNotNull(bankValue) { "bank is required" }
      set(`value`) {
        bankValue = value
      }

    public fun build(): PaymentMethodFpx {
      check(bankValue != null) { "bank is required" }
      return PaymentMethodFpx(
        bank = bank,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodFpx = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodFpx> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodFpx {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodFpx")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodFpx must be a JSON object")
      val bank = json.decodeRequired<InlinePaymentMethodFpxBankX7eb5f7ea>(rawObject, "bank")
      return PaymentMethodFpx(
        bank = bank,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodFpx) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodFpx")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank", json.encodeToJsonElement(value.bank))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodFpx(block: PaymentMethodFpx.Builder.() -> Unit): PaymentMethodFpx = PaymentMethodFpx.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodFpx is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_boleto
 */
@Serializable(with = PaymentMethodBoleto.Serializer::class)
public class PaymentMethodBoleto(
  /**
   * Uniquely identifies the customer tax id (CNPJ or CPF)
   */
  public val taxId: String,
) {
  public class Builder {
    private var taxIdValue: String? = null

    public var taxId: String
      get() = requireNotNull(taxIdValue) { "taxId is required" }
      set(`value`) {
        taxIdValue = value
      }

    public fun build(): PaymentMethodBoleto {
      check(taxIdValue != null) { "taxId is required" }
      return PaymentMethodBoleto(
        taxId = taxId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodBoleto = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodBoleto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodBoleto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodBoleto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodBoleto must be a JSON object")
      val taxId = json.decodeRequired<String>(rawObject, "tax_id")
      return PaymentMethodBoleto(
        taxId = taxId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodBoleto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodBoleto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tax_id", value.taxId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodBoleto(block: PaymentMethodBoleto.Builder.() -> Unit): PaymentMethodBoleto = PaymentMethodBoleto.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodBoleto is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

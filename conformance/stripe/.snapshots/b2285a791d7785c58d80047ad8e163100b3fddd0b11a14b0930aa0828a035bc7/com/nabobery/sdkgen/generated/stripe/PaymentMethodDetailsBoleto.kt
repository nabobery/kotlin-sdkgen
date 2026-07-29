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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_boleto
 */
@Serializable(with = PaymentMethodDetailsBoleto.Serializer::class)
public class PaymentMethodDetailsBoleto(
  /**
   * The tax ID of the customer (CPF for individuals consumers or CNPJ for businesses consumers)
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

    public fun build(): PaymentMethodDetailsBoleto {
      check(taxIdValue != null) { "taxId is required" }
      return PaymentMethodDetailsBoleto(
        taxId = taxId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsBoleto = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsBoleto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsBoleto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsBoleto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsBoleto must be a JSON object")
      val taxId = json.decodeRequired<String>(rawObject, "tax_id")
      return PaymentMethodDetailsBoleto(
        taxId = taxId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsBoleto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsBoleto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tax_id", value.taxId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsBoleto(block: PaymentMethodDetailsBoleto.Builder.() -> Unit): PaymentMethodDetailsBoleto = PaymentMethodDetailsBoleto.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDetailsBoleto is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

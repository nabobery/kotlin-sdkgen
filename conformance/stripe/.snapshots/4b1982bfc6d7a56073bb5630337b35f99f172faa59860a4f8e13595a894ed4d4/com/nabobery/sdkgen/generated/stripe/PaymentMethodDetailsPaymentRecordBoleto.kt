package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_boleto
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordBoleto.Serializer::class)
public class PaymentMethodDetailsPaymentRecordBoleto(
  /**
   * The tax ID of the customer (CPF for individuals consumers or CNPJ for businesses consumers)
   */
  public val taxId: String? = null,
) {
  public class Builder {
    /**
     * The tax ID of the customer (CPF for individuals consumers or CNPJ for businesses consumers)
     */
    public var taxId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordBoleto = PaymentMethodDetailsPaymentRecordBoleto(
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordBoleto = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordBoleto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordBoleto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordBoleto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordBoleto must be a JSON object")
      return PaymentMethodDetailsPaymentRecordBoleto(
        taxId = rawObject["tax_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordBoleto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordBoleto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.taxId?.let { put("tax_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordBoleto(block: PaymentMethodDetailsPaymentRecordBoleto.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordBoleto = PaymentMethodDetailsPaymentRecordBoleto.build(block)

package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_alma_det
 * ails_resource_installments
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments(
  /**
   * The number of installments.
   */
  public val count: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments {
      check(countValue != null) { "count is required" }
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments(
        count = count,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments(
        count = count,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

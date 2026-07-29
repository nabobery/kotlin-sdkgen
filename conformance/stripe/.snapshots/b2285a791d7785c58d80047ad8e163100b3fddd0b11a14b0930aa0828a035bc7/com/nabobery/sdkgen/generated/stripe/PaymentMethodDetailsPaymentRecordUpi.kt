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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_upi
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordUpi.Serializer::class)
public class PaymentMethodDetailsPaymentRecordUpi(
  /**
   * Customer's unique Virtual Payment Address.
   */
  public val vpa: String? = null,
) {
  public class Builder {
    /**
     * Customer's unique Virtual Payment Address.
     */
    public var vpa: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordUpi = PaymentMethodDetailsPaymentRecordUpi(
      vpa = vpa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordUpi = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordUpi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordUpi {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordUpi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordUpi must be a JSON object")
      return PaymentMethodDetailsPaymentRecordUpi(
        vpa = rawObject["vpa"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordUpi) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordUpi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.vpa?.let { put("vpa", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordUpi(block: PaymentMethodDetailsPaymentRecordUpi.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordUpi = PaymentMethodDetailsPaymentRecordUpi.build(block)

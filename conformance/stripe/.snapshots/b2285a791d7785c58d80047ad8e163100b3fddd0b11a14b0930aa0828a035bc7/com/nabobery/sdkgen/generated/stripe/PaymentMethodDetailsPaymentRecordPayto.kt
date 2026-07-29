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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_payto
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordPayto.Serializer::class)
public class PaymentMethodDetailsPaymentRecordPayto(
  /**
   * Bank-State-Branch number of the bank account.
   */
  public val bsbNumber: String? = null,
  /**
   * Last four digits of the bank account number.
   */
  public val last4: String? = null,
  /**
   * ID of the mandate used to make this payment.
   */
  public val mandate: String? = null,
  /**
   * The PayID alias for the bank account.
   */
  public val payId: String? = null,
) {
  public class Builder {
    /**
     * Bank-State-Branch number of the bank account.
     */
    public var bsbNumber: String? = null

    /**
     * Last four digits of the bank account number.
     */
    public var last4: String? = null

    /**
     * ID of the mandate used to make this payment.
     */
    public var mandate: String? = null

    /**
     * The PayID alias for the bank account.
     */
    public var payId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordPayto = PaymentMethodDetailsPaymentRecordPayto(
      bsbNumber = bsbNumber,
      last4 = last4,
      mandate = mandate,
      payId = payId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordPayto = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordPayto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordPayto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordPayto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordPayto must be a JSON object")
      return PaymentMethodDetailsPaymentRecordPayto(
        bsbNumber = rawObject["bsb_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<String>(it) },
        payId = rawObject["pay_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordPayto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordPayto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bsbNumber?.let { put("bsb_number", it) }
        value.last4?.let { put("last4", it) }
        value.mandate?.let { put("mandate", it) }
        value.payId?.let { put("pay_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordPayto(block: PaymentMethodDetailsPaymentRecordPayto.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordPayto = PaymentMethodDetailsPaymentRecordPayto.build(block)

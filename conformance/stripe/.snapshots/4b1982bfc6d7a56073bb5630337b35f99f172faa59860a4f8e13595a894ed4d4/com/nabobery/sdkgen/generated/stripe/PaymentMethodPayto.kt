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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_payto
 */
@Serializable(with = PaymentMethodPayto.Serializer::class)
public class PaymentMethodPayto(
  /**
   * Bank-State-Branch number of the bank account.
   */
  public val bsbNumber: String? = null,
  /**
   * Last four digits of the bank account number.
   */
  public val last4: String? = null,
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
     * The PayID alias for the bank account.
     */
    public var payId: String? = null

    public fun build(): PaymentMethodPayto = PaymentMethodPayto(
      bsbNumber = bsbNumber,
      last4 = last4,
      payId = payId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodPayto = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodPayto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodPayto {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodPayto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodPayto must be a JSON object")
      return PaymentMethodPayto(
        bsbNumber = rawObject["bsb_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        payId = rawObject["pay_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodPayto) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodPayto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bsbNumber?.let { put("bsb_number", it) }
        value.last4?.let { put("last4", it) }
        value.payId?.let { put("pay_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodPayto(block: PaymentMethodPayto.Builder.() -> Unit): PaymentMethodPayto = PaymentMethodPayto.build(block)

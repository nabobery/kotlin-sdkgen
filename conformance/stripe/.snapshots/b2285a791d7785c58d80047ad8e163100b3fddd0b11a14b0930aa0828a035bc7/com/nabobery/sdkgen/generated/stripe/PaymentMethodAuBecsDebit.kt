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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_au_becs_debit
 */
@Serializable(with = PaymentMethodAuBecsDebit.Serializer::class)
public class PaymentMethodAuBecsDebit(
  /**
   * Six-digit number identifying bank and branch associated with this bank account.
   */
  public val bsbNumber: String? = null,
  /**
   * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
   * the same.
   */
  public val fingerprint: String? = null,
  /**
   * Last four digits of the bank account number.
   */
  public val last4: String? = null,
) {
  public class Builder {
    /**
     * Six-digit number identifying bank and branch associated with this bank account.
     */
    public var bsbNumber: String? = null

    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
     * are the same.
     */
    public var fingerprint: String? = null

    /**
     * Last four digits of the bank account number.
     */
    public var last4: String? = null

    public fun build(): PaymentMethodAuBecsDebit = PaymentMethodAuBecsDebit(
      bsbNumber = bsbNumber,
      fingerprint = fingerprint,
      last4 = last4,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodAuBecsDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodAuBecsDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodAuBecsDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodAuBecsDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodAuBecsDebit must be a JSON object")
      return PaymentMethodAuBecsDebit(
        bsbNumber = rawObject["bsb_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodAuBecsDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodAuBecsDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bsbNumber?.let { put("bsb_number", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodAuBecsDebit(block: PaymentMethodAuBecsDebit.Builder.() -> Unit): PaymentMethodAuBecsDebit = PaymentMethodAuBecsDebit.build(block)

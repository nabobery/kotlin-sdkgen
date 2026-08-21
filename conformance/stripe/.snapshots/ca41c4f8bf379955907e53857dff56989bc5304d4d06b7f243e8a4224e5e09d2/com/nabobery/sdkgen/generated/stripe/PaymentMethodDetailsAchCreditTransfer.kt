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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_ach_credit_transfer
 */
@Serializable(with = PaymentMethodDetailsAchCreditTransfer.Serializer::class)
public class PaymentMethodDetailsAchCreditTransfer(
  /**
   * Account number to transfer funds to.
   */
  public val accountNumber: String? = null,
  /**
   * Name of the bank associated with the routing number.
   */
  public val bankName: String? = null,
  /**
   * Routing transit number for the bank account to transfer funds to.
   */
  public val routingNumber: String? = null,
  /**
   * SWIFT code of the bank associated with the routing number.
   */
  public val swiftCode: String? = null,
) {
  public class Builder {
    /**
     * Account number to transfer funds to.
     */
    public var accountNumber: String? = null

    /**
     * Name of the bank associated with the routing number.
     */
    public var bankName: String? = null

    /**
     * Routing transit number for the bank account to transfer funds to.
     */
    public var routingNumber: String? = null

    /**
     * SWIFT code of the bank associated with the routing number.
     */
    public var swiftCode: String? = null

    public fun build(): PaymentMethodDetailsAchCreditTransfer = PaymentMethodDetailsAchCreditTransfer(
      accountNumber = accountNumber,
      bankName = bankName,
      routingNumber = routingNumber,
      swiftCode = swiftCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsAchCreditTransfer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsAchCreditTransfer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsAchCreditTransfer {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsAchCreditTransfer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsAchCreditTransfer must be a JSON object")
      return PaymentMethodDetailsAchCreditTransfer(
        accountNumber = rawObject["account_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        routingNumber = rawObject["routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        swiftCode = rawObject["swift_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsAchCreditTransfer) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsAchCreditTransfer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountNumber?.let { put("account_number", it) }
        value.bankName?.let { put("bank_name", it) }
        value.routingNumber?.let { put("routing_number", it) }
        value.swiftCode?.let { put("swift_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsAchCreditTransfer(block: PaymentMethodDetailsAchCreditTransfer.Builder.() -> Unit): PaymentMethodDetailsAchCreditTransfer = PaymentMethodDetailsAchCreditTransfer.build(block)

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_ach_debit
 */
@Serializable(with = PaymentMethodDetailsAchDebit.Serializer::class)
public class PaymentMethodDetailsAchDebit(
  /**
   * Type of entity that holds the account. This can be either `individual` or `company`.
   */
  public val accountHolderType:
      InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08? = null,
  /**
   * Name of the bank associated with the bank account.
   */
  public val bankName: String? = null,
  /**
   * Two-letter ISO code representing the country the bank account is located in.
   */
  public val country: String? = null,
  /**
   * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
   * the same.
   */
  public val fingerprint: String? = null,
  /**
   * Last four digits of the bank account number.
   */
  public val last4: String? = null,
  /**
   * Routing transit number of the bank account.
   */
  public val routingNumber: String? = null,
) {
  public class Builder {
    /**
     * Type of entity that holds the account. This can be either `individual` or `company`.
     */
    public var accountHolderType: InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08? =
        null

    /**
     * Name of the bank associated with the bank account.
     */
    public var bankName: String? = null

    /**
     * Two-letter ISO code representing the country the bank account is located in.
     */
    public var country: String? = null

    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
     * are the same.
     */
    public var fingerprint: String? = null

    /**
     * Last four digits of the bank account number.
     */
    public var last4: String? = null

    /**
     * Routing transit number of the bank account.
     */
    public var routingNumber: String? = null

    public fun build(): PaymentMethodDetailsAchDebit = PaymentMethodDetailsAchDebit(
      accountHolderType = accountHolderType,
      bankName = bankName,
      country = country,
      fingerprint = fingerprint,
      last4 = last4,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsAchDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsAchDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsAchDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsAchDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsAchDebit must be a JSON object")
      return PaymentMethodDetailsAchDebit(
        accountHolderType = rawObject["account_holder_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsAchDebitAccountHolderTypeX780ecb08?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        routingNumber = rawObject["routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsAchDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsAchDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.bankName?.let { put("bank_name", it) }
        value.country?.let { put("country", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsAchDebit(block: PaymentMethodDetailsAchDebit.Builder.() -> Unit): PaymentMethodDetailsAchDebit = PaymentMethodDetailsAchDebit.build(block)

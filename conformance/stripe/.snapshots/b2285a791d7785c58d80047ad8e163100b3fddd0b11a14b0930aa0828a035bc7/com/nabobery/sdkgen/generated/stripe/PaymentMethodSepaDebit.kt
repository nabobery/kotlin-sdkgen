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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_sepa_debit
 */
@Serializable(with = PaymentMethodSepaDebit.Serializer::class)
public class PaymentMethodSepaDebit(
  /**
   * Bank code of bank associated with the bank account.
   */
  public val bankCode: String? = null,
  /**
   * Branch code of bank associated with the bank account.
   */
  public val branchCode: String? = null,
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
   * Information about the object that generated this PaymentMethod.
   */
  public val generatedFrom: InlinePaymentMethodSepaDebitGeneratedFromX94640171? = null,
  /**
   * Last four characters of the IBAN.
   */
  public val last4: String? = null,
) {
  public class Builder {
    /**
     * Bank code of bank associated with the bank account.
     */
    public var bankCode: String? = null

    /**
     * Branch code of bank associated with the bank account.
     */
    public var branchCode: String? = null

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
     * Information about the object that generated this PaymentMethod.
     */
    public var generatedFrom: InlinePaymentMethodSepaDebitGeneratedFromX94640171? = null

    /**
     * Last four characters of the IBAN.
     */
    public var last4: String? = null

    public fun build(): PaymentMethodSepaDebit = PaymentMethodSepaDebit(
      bankCode = bankCode,
      branchCode = branchCode,
      country = country,
      fingerprint = fingerprint,
      generatedFrom = generatedFrom,
      last4 = last4,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodSepaDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodSepaDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodSepaDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodSepaDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodSepaDebit must be a JSON object")
      return PaymentMethodSepaDebit(
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        branchCode = rawObject["branch_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        generatedFrom = rawObject["generated_from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodSepaDebitGeneratedFromX94640171?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodSepaDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodSepaDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankCode?.let { put("bank_code", it) }
        value.branchCode?.let { put("branch_code", it) }
        value.country?.let { put("country", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.generatedFrom?.let { put("generated_from", json.encodeToJsonElement(it)) }
        value.last4?.let { put("last4", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodSepaDebit(block: PaymentMethodSepaDebit.Builder.() -> Unit): PaymentMethodSepaDebit = PaymentMethodSepaDebit.build(block)

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_sepa_debit
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordSepaDebit.Serializer::class)
public class PaymentMethodDetailsPaymentRecordSepaDebit(
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
   * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
   */
  public val expectedDebitDate: String? = null,
  /**
   * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
   * the same.
   */
  public val fingerprint: String? = null,
  /**
   * Last four characters of the IBAN.
   */
  public val last4: String? = null,
  /**
   * Find the ID of the mandate used for this payment under the
   * [payment_method_details.sepa_debit.mandate](https://docs.stripe.com/api/charges/object#charge_object-payment_method
   * _details-sepa_debit-mandate) property on the Charge. Use this mandate ID to [retrieve the
   * Mandate](https://docs.stripe.com/api/mandates/retrieve).
   */
  public val mandate: String? = null,
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
     * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
     */
    public var expectedDebitDate: String? = null

    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
     * are the same.
     */
    public var fingerprint: String? = null

    /**
     * Last four characters of the IBAN.
     */
    public var last4: String? = null

    /**
     * Find the ID of the mandate used for this payment under the
     * [payment_method_details.sepa_debit.mandate](https://docs.stripe.com/api/charges/object#charge_object-payment_meth
     * od_details-sepa_debit-mandate) property on the Charge. Use this mandate ID to [retrieve the
     * Mandate](https://docs.stripe.com/api/mandates/retrieve).
     */
    public var mandate: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordSepaDebit = PaymentMethodDetailsPaymentRecordSepaDebit(
      bankCode = bankCode,
      branchCode = branchCode,
      country = country,
      expectedDebitDate = expectedDebitDate,
      fingerprint = fingerprint,
      last4 = last4,
      mandate = mandate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordSepaDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordSepaDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordSepaDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordSepaDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordSepaDebit must be a JSON object")
      return PaymentMethodDetailsPaymentRecordSepaDebit(
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        branchCode = rawObject["branch_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expectedDebitDate = rawObject["expected_debit_date"]?.let { json.decodeFromJsonElement<String>(it) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandate = rawObject["mandate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordSepaDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordSepaDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankCode?.let { put("bank_code", it) }
        value.branchCode?.let { put("branch_code", it) }
        value.country?.let { put("country", it) }
        value.expectedDebitDate?.let { put("expected_debit_date", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.mandate?.let { put("mandate", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordSepaDebit(block: PaymentMethodDetailsPaymentRecordSepaDebit.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordSepaDebit = PaymentMethodDetailsPaymentRecordSepaDebit.build(block)

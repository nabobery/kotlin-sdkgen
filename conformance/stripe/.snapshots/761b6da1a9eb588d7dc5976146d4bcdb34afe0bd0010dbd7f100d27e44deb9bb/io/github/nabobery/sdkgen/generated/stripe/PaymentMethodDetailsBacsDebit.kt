package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_bacs_debit
 */
@Serializable(with = PaymentMethodDetailsBacsDebit.Serializer::class)
public class PaymentMethodDetailsBacsDebit(
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
   * Last four digits of the bank account number.
   */
  public val last4: String? = null,
  /**
   * ID of the mandate used to make this payment.
   */
  public val mandate: String? = null,
  /**
   * Sort code of the bank account. (e.g., `10-20-30`)
   */
  public val sortCode: String? = null,
) {
  public class Builder {
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
     * Last four digits of the bank account number.
     */
    public var last4: String? = null

    /**
     * ID of the mandate used to make this payment.
     */
    public var mandate: String? = null

    /**
     * Sort code of the bank account. (e.g., `10-20-30`)
     */
    public var sortCode: String? = null

    public fun build(): PaymentMethodDetailsBacsDebit = PaymentMethodDetailsBacsDebit(
      expectedDebitDate = expectedDebitDate,
      fingerprint = fingerprint,
      last4 = last4,
      mandate = mandate,
      sortCode = sortCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsBacsDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsBacsDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsBacsDebit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsBacsDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsBacsDebit must be a JSON object")
      return PaymentMethodDetailsBacsDebit(
        expectedDebitDate = rawObject["expected_debit_date"]?.let { json.decodeFromJsonElement<String>(it) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandate = rawObject["mandate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sortCode = rawObject["sort_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsBacsDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsBacsDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expectedDebitDate?.let { put("expected_debit_date", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.mandate?.let { put("mandate", it) }
        value.sortCode?.let { put("sort_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsBacsDebit(block: PaymentMethodDetailsBacsDebit.Builder.() -> Unit): PaymentMethodDetailsBacsDebit = PaymentMethodDetailsBacsDebit.build(block)

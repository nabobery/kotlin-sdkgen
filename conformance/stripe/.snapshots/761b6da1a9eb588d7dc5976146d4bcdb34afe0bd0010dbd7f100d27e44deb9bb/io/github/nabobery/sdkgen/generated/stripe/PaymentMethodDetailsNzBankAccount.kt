package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_nz_bank_account
 */
@Serializable(with = PaymentMethodDetailsNzBankAccount.Serializer::class)
public class PaymentMethodDetailsNzBankAccount(
  /**
   * The numeric code for the bank account's bank.
   */
  public val bankCode: String,
  /**
   * The name of the bank.
   */
  public val bankName: String,
  /**
   * The numeric code for the bank account's bank branch.
   */
  public val branchCode: String,
  /**
   * Last four digits of the bank account number.
   */
  public val last4: String,
  /**
   * The name on the bank account. Only present if the account holder name is different from the name of the authorized
   * signatory collected in the PaymentMethod’s billing details.
   */
  public val accountHolderName: String? = null,
  /**
   * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
   */
  public val expectedDebitDate: String? = null,
  /**
   * The suffix of the bank account number.
   */
  public val suffix: String? = null,
) {
  public class Builder {
    private var bankCodeValue: String? = null

    public var bankCode: String
      get() = requireNotNull(bankCodeValue) { "bankCode is required" }
      set(`value`) {
        bankCodeValue = value
      }

    private var bankNameValue: String? = null

    public var bankName: String
      get() = requireNotNull(bankNameValue) { "bankName is required" }
      set(`value`) {
        bankNameValue = value
      }

    private var branchCodeValue: String? = null

    public var branchCode: String
      get() = requireNotNull(branchCodeValue) { "branchCode is required" }
      set(`value`) {
        branchCodeValue = value
      }

    private var last4Value: String? = null

    public var last4: String
      get() = requireNotNull(last4Value) { "last4 is required" }
      set(`value`) {
        last4Value = value
      }

    /**
     * The name on the bank account. Only present if the account holder name is different from the name of the
     * authorized signatory collected in the PaymentMethod’s billing details.
     */
    public var accountHolderName: String? = null

    /**
     * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
     */
    public var expectedDebitDate: String? = null

    /**
     * The suffix of the bank account number.
     */
    public var suffix: String? = null

    public fun build(): PaymentMethodDetailsNzBankAccount {
      check(bankCodeValue != null) { "bankCode is required" }
      check(bankNameValue != null) { "bankName is required" }
      check(branchCodeValue != null) { "branchCode is required" }
      check(last4Value != null) { "last4 is required" }
      return PaymentMethodDetailsNzBankAccount(
        bankCode = bankCode,
        bankName = bankName,
        branchCode = branchCode,
        last4 = last4,
        accountHolderName = accountHolderName,
        expectedDebitDate = expectedDebitDate,
        suffix = suffix,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsNzBankAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsNzBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsNzBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsNzBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsNzBankAccount must be a JSON object")
      val bankCode = json.decodeRequired<String>(rawObject, "bank_code")
      val bankName = json.decodeRequired<String>(rawObject, "bank_name")
      val branchCode = json.decodeRequired<String>(rawObject, "branch_code")
      val last4 = json.decodeRequired<String>(rawObject, "last4")
      return PaymentMethodDetailsNzBankAccount(
        bankCode = bankCode,
        bankName = bankName,
        branchCode = branchCode,
        last4 = last4,
        accountHolderName = rawObject["account_holder_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expectedDebitDate = rawObject["expected_debit_date"]?.let { json.decodeFromJsonElement<String>(it) },
        suffix = rawObject["suffix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsNzBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsNzBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank_code", value.bankCode)
        put("bank_name", value.bankName)
        put("branch_code", value.branchCode)
        put("last4", value.last4)
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.expectedDebitDate?.let { put("expected_debit_date", it) }
        value.suffix?.let { put("suffix", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsNzBankAccount(block: PaymentMethodDetailsNzBankAccount.Builder.() -> Unit): PaymentMethodDetailsNzBankAccount = PaymentMethodDetailsNzBankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDetailsNzBankAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

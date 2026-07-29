package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_nz_bank_account
 */
@Serializable(with = PaymentMethodNzBankAccount.Serializer::class)
public class PaymentMethodNzBankAccount(
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
     * The suffix of the bank account number.
     */
    public var suffix: String? = null

    public fun build(): PaymentMethodNzBankAccount {
      check(bankCodeValue != null) { "bankCode is required" }
      check(bankNameValue != null) { "bankName is required" }
      check(branchCodeValue != null) { "branchCode is required" }
      check(last4Value != null) { "last4 is required" }
      return PaymentMethodNzBankAccount(
        bankCode = bankCode,
        bankName = bankName,
        branchCode = branchCode,
        last4 = last4,
        accountHolderName = accountHolderName,
        suffix = suffix,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodNzBankAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodNzBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodNzBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodNzBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodNzBankAccount must be a JSON object")
      val bankCode = json.decodeRequired<String>(rawObject, "bank_code")
      val bankName = json.decodeRequired<String>(rawObject, "bank_name")
      val branchCode = json.decodeRequired<String>(rawObject, "branch_code")
      val last4 = json.decodeRequired<String>(rawObject, "last4")
      return PaymentMethodNzBankAccount(
        bankCode = bankCode,
        bankName = bankName,
        branchCode = branchCode,
        last4 = last4,
        accountHolderName = rawObject["account_holder_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        suffix = rawObject["suffix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodNzBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodNzBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bank_code", value.bankCode)
        put("bank_name", value.bankName)
        put("branch_code", value.branchCode)
        put("last4", value.last4)
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.suffix?.let { put("suffix", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodNzBankAccount(block: PaymentMethodNzBankAccount.Builder.() -> Unit): PaymentMethodNzBankAccount = PaymentMethodNzBankAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodNzBankAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

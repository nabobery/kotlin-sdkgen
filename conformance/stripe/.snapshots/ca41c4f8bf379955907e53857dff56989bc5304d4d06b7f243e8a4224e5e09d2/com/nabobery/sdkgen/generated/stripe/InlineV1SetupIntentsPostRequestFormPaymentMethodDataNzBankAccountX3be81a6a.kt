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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/nz_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/nz_bank_account
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a(
  public val accountNumber: String,
  public val bankCode: String,
  public val branchCode: String,
  public val suffix: String,
  public val accountHolderName: String? = null,
  public val reference: String? = null,
) {
  public class Builder {
    private var accountNumberValue: String? = null

    public var accountNumber: String
      get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
      set(`value`) {
        accountNumberValue = value
      }

    private var bankCodeValue: String? = null

    public var bankCode: String
      get() = requireNotNull(bankCodeValue) { "bankCode is required" }
      set(`value`) {
        bankCodeValue = value
      }

    private var branchCodeValue: String? = null

    public var branchCode: String
      get() = requireNotNull(branchCodeValue) { "branchCode is required" }
      set(`value`) {
        branchCodeValue = value
      }

    private var suffixValue: String? = null

    public var suffix: String
      get() = requireNotNull(suffixValue) { "suffix is required" }
      set(`value`) {
        suffixValue = value
      }

    public var accountHolderName: String? = null

    public var reference: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a {
      check(accountNumberValue != null) { "accountNumber is required" }
      check(bankCodeValue != null) { "bankCode is required" }
      check(branchCodeValue != null) { "branchCode is required" }
      check(suffixValue != null) { "suffix is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a(
        accountNumber = accountNumber,
        bankCode = bankCode,
        branchCode = branchCode,
        suffix = suffix,
        accountHolderName = accountHolderName,
        reference = reference,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a must be a JSON object")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val bankCode = json.decodeRequired<String>(rawObject, "bank_code")
      val branchCode = json.decodeRequired<String>(rawObject, "branch_code")
      val suffix = json.decodeRequired<String>(rawObject, "suffix")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a(
        accountNumber = accountNumber,
        bankCode = bankCode,
        branchCode = branchCode,
        suffix = suffix,
        accountHolderName = rawObject["account_holder_name"]?.let { json.decodeFromJsonElement<String>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_number", value.accountNumber)
        put("bank_code", value.bankCode)
        put("branch_code", value.branchCode)
        put("suffix", value.suffix)
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNzBankAccountX3be81a6a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

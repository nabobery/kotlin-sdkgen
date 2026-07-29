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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Iban Records contain E.U. bank account details per the SEPA format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_iban_record
 */
@Serializable(with = FundingInstructionsBankTransferIbanRecord.Serializer::class)
public class FundingInstructionsBankTransferIbanRecord(
  public val accountHolderAddress: Address,
  /**
   * The name of the person or business that owns the bank account
   */
  public val accountHolderName: String,
  public val bankAddress: Address,
  /**
   * The BIC/SWIFT code of the account.
   */
  public val bic: String,
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String,
  /**
   * The IBAN of the account.
   */
  public val iban: String,
) {
  public class Builder {
    private var accountHolderAddressValue: Address? = null

    public var accountHolderAddress: Address
      get() = requireNotNull(accountHolderAddressValue) { "accountHolderAddress is required" }
      set(`value`) {
        accountHolderAddressValue = value
      }

    private var accountHolderNameValue: String? = null

    public var accountHolderName: String
      get() = requireNotNull(accountHolderNameValue) { "accountHolderName is required" }
      set(`value`) {
        accountHolderNameValue = value
      }

    private var bankAddressValue: Address? = null

    public var bankAddress: Address
      get() = requireNotNull(bankAddressValue) { "bankAddress is required" }
      set(`value`) {
        bankAddressValue = value
      }

    private var bicValue: String? = null

    public var bic: String
      get() = requireNotNull(bicValue) { "bic is required" }
      set(`value`) {
        bicValue = value
      }

    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    private var ibanValue: String? = null

    public var iban: String
      get() = requireNotNull(ibanValue) { "iban is required" }
      set(`value`) {
        ibanValue = value
      }

    public fun build(): FundingInstructionsBankTransferIbanRecord {
      check(accountHolderAddressValue != null) { "accountHolderAddress is required" }
      check(accountHolderNameValue != null) { "accountHolderName is required" }
      check(bankAddressValue != null) { "bankAddress is required" }
      check(bicValue != null) { "bic is required" }
      check(countryValue != null) { "country is required" }
      check(ibanValue != null) { "iban is required" }
      return FundingInstructionsBankTransferIbanRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        bankAddress = bankAddress,
        bic = bic,
        country = country,
        iban = iban,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferIbanRecord = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FundingInstructionsBankTransferIbanRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferIbanRecord {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferIbanRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferIbanRecord must be a JSON object")
      val accountHolderAddress = json.decodeRequired<Address>(rawObject, "account_holder_address")
      val accountHolderName = json.decodeRequired<String>(rawObject, "account_holder_name")
      val bankAddress = json.decodeRequired<Address>(rawObject, "bank_address")
      val bic = json.decodeRequired<String>(rawObject, "bic")
      val country = json.decodeRequired<String>(rawObject, "country")
      val iban = json.decodeRequired<String>(rawObject, "iban")
      return FundingInstructionsBankTransferIbanRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        bankAddress = bankAddress,
        bic = bic,
        country = country,
        iban = iban,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferIbanRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferIbanRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder_address", json.encodeToJsonElement(value.accountHolderAddress))
        put("account_holder_name", value.accountHolderName)
        put("bank_address", json.encodeToJsonElement(value.bankAddress))
        put("bic", value.bic)
        put("country", value.country)
        put("iban", value.iban)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferIbanRecord(block: FundingInstructionsBankTransferIbanRecord.Builder.() -> Unit): FundingInstructionsBankTransferIbanRecord = FundingInstructionsBankTransferIbanRecord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferIbanRecord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

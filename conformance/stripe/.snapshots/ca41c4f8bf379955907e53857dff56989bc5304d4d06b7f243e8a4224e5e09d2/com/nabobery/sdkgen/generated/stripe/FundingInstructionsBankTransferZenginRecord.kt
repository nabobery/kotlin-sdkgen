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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Zengin Records contain Japan bank account details per the Zengin format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_zengin_record
 */
@Serializable(with = FundingInstructionsBankTransferZenginRecord.Serializer::class)
public class FundingInstructionsBankTransferZenginRecord(
  public val accountHolderAddress: Address,
  public val bankAddress: Address,
  /**
   * The account holder name
   */
  public val accountHolderName: String? = null,
  /**
   * The account number
   */
  public val accountNumber: String? = null,
  /**
   * The bank account type. In Japan, this can only be `futsu` or `toza`.
   */
  public val accountType: String? = null,
  /**
   * The bank code of the account
   */
  public val bankCode: String? = null,
  /**
   * The bank name of the account
   */
  public val bankName: String? = null,
  /**
   * The branch code of the account
   */
  public val branchCode: String? = null,
  /**
   * The branch name of the account
   */
  public val branchName: String? = null,
) {
  public class Builder {
    private var accountHolderAddressValue: Address? = null

    public var accountHolderAddress: Address
      get() = requireNotNull(accountHolderAddressValue) { "accountHolderAddress is required" }
      set(`value`) {
        accountHolderAddressValue = value
      }

    private var bankAddressValue: Address? = null

    public var bankAddress: Address
      get() = requireNotNull(bankAddressValue) { "bankAddress is required" }
      set(`value`) {
        bankAddressValue = value
      }

    /**
     * The account holder name
     */
    public var accountHolderName: String? = null

    /**
     * The account number
     */
    public var accountNumber: String? = null

    /**
     * The bank account type. In Japan, this can only be `futsu` or `toza`.
     */
    public var accountType: String? = null

    /**
     * The bank code of the account
     */
    public var bankCode: String? = null

    /**
     * The bank name of the account
     */
    public var bankName: String? = null

    /**
     * The branch code of the account
     */
    public var branchCode: String? = null

    /**
     * The branch name of the account
     */
    public var branchName: String? = null

    public fun build(): FundingInstructionsBankTransferZenginRecord {
      check(accountHolderAddressValue != null) { "accountHolderAddress is required" }
      check(bankAddressValue != null) { "bankAddress is required" }
      return FundingInstructionsBankTransferZenginRecord(
        accountHolderAddress = accountHolderAddress,
        bankAddress = bankAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        accountType = accountType,
        bankCode = bankCode,
        bankName = bankName,
        branchCode = branchCode,
        branchName = branchName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferZenginRecord = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FundingInstructionsBankTransferZenginRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferZenginRecord {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferZenginRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferZenginRecord must be a JSON object")
      val accountHolderAddress = json.decodeRequired<Address>(rawObject, "account_holder_address")
      val bankAddress = json.decodeRequired<Address>(rawObject, "bank_address")
      return FundingInstructionsBankTransferZenginRecord(
        accountHolderAddress = accountHolderAddress,
        bankAddress = bankAddress,
        accountHolderName = rawObject["account_holder_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        accountNumber = rawObject["account_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        accountType = rawObject["account_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        branchCode = rawObject["branch_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        branchName = rawObject["branch_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferZenginRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferZenginRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder_address", json.encodeToJsonElement(value.accountHolderAddress))
        put("bank_address", json.encodeToJsonElement(value.bankAddress))
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.accountNumber?.let { put("account_number", it) }
        value.accountType?.let { put("account_type", it) }
        value.bankCode?.let { put("bank_code", it) }
        value.bankName?.let { put("bank_name", it) }
        value.branchCode?.let { put("branch_code", it) }
        value.branchName?.let { put("branch_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferZenginRecord(block: FundingInstructionsBankTransferZenginRecord.Builder.() -> Unit): FundingInstructionsBankTransferZenginRecord = FundingInstructionsBankTransferZenginRecord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferZenginRecord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

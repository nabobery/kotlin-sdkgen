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
 * Sort Code Records contain U.K. bank account details per the sort code format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_sort_code_record
 */
@Serializable(with = FundingInstructionsBankTransferSortCodeRecord.Serializer::class)
public class FundingInstructionsBankTransferSortCodeRecord(
  public val accountHolderAddress: Address,
  /**
   * The name of the person or business that owns the bank account
   */
  public val accountHolderName: String,
  /**
   * The account number
   */
  public val accountNumber: String,
  public val bankAddress: Address,
  /**
   * The six-digit sort code
   */
  public val sortCode: String,
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

    private var accountNumberValue: String? = null

    public var accountNumber: String
      get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
      set(`value`) {
        accountNumberValue = value
      }

    private var bankAddressValue: Address? = null

    public var bankAddress: Address
      get() = requireNotNull(bankAddressValue) { "bankAddress is required" }
      set(`value`) {
        bankAddressValue = value
      }

    private var sortCodeValue: String? = null

    public var sortCode: String
      get() = requireNotNull(sortCodeValue) { "sortCode is required" }
      set(`value`) {
        sortCodeValue = value
      }

    public fun build(): FundingInstructionsBankTransferSortCodeRecord {
      check(accountHolderAddressValue != null) { "accountHolderAddress is required" }
      check(accountHolderNameValue != null) { "accountHolderName is required" }
      check(accountNumberValue != null) { "accountNumber is required" }
      check(bankAddressValue != null) { "bankAddress is required" }
      check(sortCodeValue != null) { "sortCode is required" }
      return FundingInstructionsBankTransferSortCodeRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        bankAddress = bankAddress,
        sortCode = sortCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferSortCodeRecord = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FundingInstructionsBankTransferSortCodeRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferSortCodeRecord {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferSortCodeRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferSortCodeRecord must be a JSON object")
      val accountHolderAddress = json.decodeRequired<Address>(rawObject, "account_holder_address")
      val accountHolderName = json.decodeRequired<String>(rawObject, "account_holder_name")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val bankAddress = json.decodeRequired<Address>(rawObject, "bank_address")
      val sortCode = json.decodeRequired<String>(rawObject, "sort_code")
      return FundingInstructionsBankTransferSortCodeRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        bankAddress = bankAddress,
        sortCode = sortCode,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferSortCodeRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferSortCodeRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder_address", json.encodeToJsonElement(value.accountHolderAddress))
        put("account_holder_name", value.accountHolderName)
        put("account_number", value.accountNumber)
        put("bank_address", json.encodeToJsonElement(value.bankAddress))
        put("sort_code", value.sortCode)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferSortCodeRecord(block: FundingInstructionsBankTransferSortCodeRecord.Builder.() -> Unit): FundingInstructionsBankTransferSortCodeRecord = FundingInstructionsBankTransferSortCodeRecord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferSortCodeRecord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

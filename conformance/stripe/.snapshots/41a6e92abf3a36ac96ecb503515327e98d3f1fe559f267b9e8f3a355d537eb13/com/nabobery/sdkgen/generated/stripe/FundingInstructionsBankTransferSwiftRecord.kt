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
 * SWIFT Records contain U.S. bank account details per the SWIFT format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_swift_record
 */
@Serializable(with = FundingInstructionsBankTransferSwiftRecord.Serializer::class)
public class FundingInstructionsBankTransferSwiftRecord(
  public val accountHolderAddress: Address,
  /**
   * The account holder name
   */
  public val accountHolderName: String,
  /**
   * The account number
   */
  public val accountNumber: String,
  /**
   * The account type
   */
  public val accountType: String,
  public val bankAddress: Address,
  /**
   * The bank name
   */
  public val bankName: String,
  /**
   * The SWIFT code
   */
  public val swiftCode: String,
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

    private var accountTypeValue: String? = null

    public var accountType: String
      get() = requireNotNull(accountTypeValue) { "accountType is required" }
      set(`value`) {
        accountTypeValue = value
      }

    private var bankAddressValue: Address? = null

    public var bankAddress: Address
      get() = requireNotNull(bankAddressValue) { "bankAddress is required" }
      set(`value`) {
        bankAddressValue = value
      }

    private var bankNameValue: String? = null

    public var bankName: String
      get() = requireNotNull(bankNameValue) { "bankName is required" }
      set(`value`) {
        bankNameValue = value
      }

    private var swiftCodeValue: String? = null

    public var swiftCode: String
      get() = requireNotNull(swiftCodeValue) { "swiftCode is required" }
      set(`value`) {
        swiftCodeValue = value
      }

    public fun build(): FundingInstructionsBankTransferSwiftRecord {
      check(accountHolderAddressValue != null) { "accountHolderAddress is required" }
      check(accountHolderNameValue != null) { "accountHolderName is required" }
      check(accountNumberValue != null) { "accountNumber is required" }
      check(accountTypeValue != null) { "accountType is required" }
      check(bankAddressValue != null) { "bankAddress is required" }
      check(bankNameValue != null) { "bankName is required" }
      check(swiftCodeValue != null) { "swiftCode is required" }
      return FundingInstructionsBankTransferSwiftRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        accountType = accountType,
        bankAddress = bankAddress,
        bankName = bankName,
        swiftCode = swiftCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferSwiftRecord = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FundingInstructionsBankTransferSwiftRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferSwiftRecord {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferSwiftRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferSwiftRecord must be a JSON object")
      val accountHolderAddress = json.decodeRequired<Address>(rawObject, "account_holder_address")
      val accountHolderName = json.decodeRequired<String>(rawObject, "account_holder_name")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val accountType = json.decodeRequired<String>(rawObject, "account_type")
      val bankAddress = json.decodeRequired<Address>(rawObject, "bank_address")
      val bankName = json.decodeRequired<String>(rawObject, "bank_name")
      val swiftCode = json.decodeRequired<String>(rawObject, "swift_code")
      return FundingInstructionsBankTransferSwiftRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        accountType = accountType,
        bankAddress = bankAddress,
        bankName = bankName,
        swiftCode = swiftCode,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferSwiftRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferSwiftRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder_address", json.encodeToJsonElement(value.accountHolderAddress))
        put("account_holder_name", value.accountHolderName)
        put("account_number", value.accountNumber)
        put("account_type", value.accountType)
        put("bank_address", json.encodeToJsonElement(value.bankAddress))
        put("bank_name", value.bankName)
        put("swift_code", value.swiftCode)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferSwiftRecord(block: FundingInstructionsBankTransferSwiftRecord.Builder.() -> Unit): FundingInstructionsBankTransferSwiftRecord = FundingInstructionsBankTransferSwiftRecord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferSwiftRecord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * SPEI Records contain Mexico bank account details per the SPEI format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_spei_record
 */
@Serializable(with = FundingInstructionsBankTransferSpeiRecord.Serializer::class)
public class FundingInstructionsBankTransferSpeiRecord(
  public val accountHolderAddress: Address,
  /**
   * The account holder name
   */
  public val accountHolderName: String,
  public val bankAddress: Address,
  /**
   * The three-digit bank code
   */
  public val bankCode: String,
  /**
   * The short banking institution name
   */
  public val bankName: String,
  /**
   * The CLABE number
   */
  public val clabe: String,
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

    private var clabeValue: String? = null

    public var clabe: String
      get() = requireNotNull(clabeValue) { "clabe is required" }
      set(`value`) {
        clabeValue = value
      }

    public fun build(): FundingInstructionsBankTransferSpeiRecord {
      check(accountHolderAddressValue != null) { "accountHolderAddress is required" }
      check(accountHolderNameValue != null) { "accountHolderName is required" }
      check(bankAddressValue != null) { "bankAddress is required" }
      check(bankCodeValue != null) { "bankCode is required" }
      check(bankNameValue != null) { "bankName is required" }
      check(clabeValue != null) { "clabe is required" }
      return FundingInstructionsBankTransferSpeiRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        bankAddress = bankAddress,
        bankCode = bankCode,
        bankName = bankName,
        clabe = clabe,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferSpeiRecord = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FundingInstructionsBankTransferSpeiRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferSpeiRecord {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferSpeiRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferSpeiRecord must be a JSON object")
      val accountHolderAddress = json.decodeRequired<Address>(rawObject, "account_holder_address")
      val accountHolderName = json.decodeRequired<String>(rawObject, "account_holder_name")
      val bankAddress = json.decodeRequired<Address>(rawObject, "bank_address")
      val bankCode = json.decodeRequired<String>(rawObject, "bank_code")
      val bankName = json.decodeRequired<String>(rawObject, "bank_name")
      val clabe = json.decodeRequired<String>(rawObject, "clabe")
      return FundingInstructionsBankTransferSpeiRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        bankAddress = bankAddress,
        bankCode = bankCode,
        bankName = bankName,
        clabe = clabe,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferSpeiRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferSpeiRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder_address", json.encodeToJsonElement(value.accountHolderAddress))
        put("account_holder_name", value.accountHolderName)
        put("bank_address", json.encodeToJsonElement(value.bankAddress))
        put("bank_code", value.bankCode)
        put("bank_name", value.bankName)
        put("clabe", value.clabe)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferSpeiRecord(block: FundingInstructionsBankTransferSpeiRecord.Builder.() -> Unit): FundingInstructionsBankTransferSpeiRecord = FundingInstructionsBankTransferSpeiRecord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferSpeiRecord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

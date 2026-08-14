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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * ABA Records contain U.S. bank account details per the ABA format.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_aba_record
 */
@Serializable(with = FundingInstructionsBankTransferAbaRecord.Serializer::class)
public class FundingInstructionsBankTransferAbaRecord(
  public val accountHolderAddress: Address,
  /**
   * The account holder name
   */
  public val accountHolderName: String,
  /**
   * The ABA account number
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
   * The ABA routing number
   */
  public val routingNumber: String,
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

    private var routingNumberValue: String? = null

    public var routingNumber: String
      get() = requireNotNull(routingNumberValue) { "routingNumber is required" }
      set(`value`) {
        routingNumberValue = value
      }

    public fun build(): FundingInstructionsBankTransferAbaRecord {
      check(accountHolderAddressValue != null) { "accountHolderAddress is required" }
      check(accountHolderNameValue != null) { "accountHolderName is required" }
      check(accountNumberValue != null) { "accountNumber is required" }
      check(accountTypeValue != null) { "accountType is required" }
      check(bankAddressValue != null) { "bankAddress is required" }
      check(bankNameValue != null) { "bankName is required" }
      check(routingNumberValue != null) { "routingNumber is required" }
      return FundingInstructionsBankTransferAbaRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        accountType = accountType,
        bankAddress = bankAddress,
        bankName = bankName,
        routingNumber = routingNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferAbaRecord = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FundingInstructionsBankTransferAbaRecord> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferAbaRecord {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferAbaRecord")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferAbaRecord must be a JSON object")
      val accountHolderAddress = json.decodeRequired<Address>(rawObject, "account_holder_address")
      val accountHolderName = json.decodeRequired<String>(rawObject, "account_holder_name")
      val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
      val accountType = json.decodeRequired<String>(rawObject, "account_type")
      val bankAddress = json.decodeRequired<Address>(rawObject, "bank_address")
      val bankName = json.decodeRequired<String>(rawObject, "bank_name")
      val routingNumber = json.decodeRequired<String>(rawObject, "routing_number")
      return FundingInstructionsBankTransferAbaRecord(
        accountHolderAddress = accountHolderAddress,
        accountHolderName = accountHolderName,
        accountNumber = accountNumber,
        accountType = accountType,
        bankAddress = bankAddress,
        bankName = bankName,
        routingNumber = routingNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferAbaRecord) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferAbaRecord")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account_holder_address", json.encodeToJsonElement(value.accountHolderAddress))
        put("account_holder_name", value.accountHolderName)
        put("account_number", value.accountNumber)
        put("account_type", value.accountType)
        put("bank_address", json.encodeToJsonElement(value.bankAddress))
        put("bank_name", value.bankName)
        put("routing_number", value.routingNumber)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferAbaRecord(block: FundingInstructionsBankTransferAbaRecord.Builder.() -> Unit): FundingInstructionsBankTransferAbaRecord = FundingInstructionsBankTransferAbaRecord.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferAbaRecord is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

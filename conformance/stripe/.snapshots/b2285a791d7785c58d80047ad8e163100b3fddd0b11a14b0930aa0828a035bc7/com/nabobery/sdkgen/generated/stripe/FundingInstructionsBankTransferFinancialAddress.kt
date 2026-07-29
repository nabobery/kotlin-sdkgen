package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * FinancialAddresses contain identifying information that resolves to a FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_financial_address
 */
@Serializable(with = FundingInstructionsBankTransferFinancialAddress.Serializer::class)
public class FundingInstructionsBankTransferFinancialAddress(
  /**
   * The type of financial address
   */
  public val type: InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec,
  public val aba: FundingInstructionsBankTransferAbaRecord? = null,
  public val iban: FundingInstructionsBankTransferIbanRecord? = null,
  public val sortCode: FundingInstructionsBankTransferSortCodeRecord? = null,
  public val spei: FundingInstructionsBankTransferSpeiRecord? = null,
  supportedNetworks: List<InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234>? = null,
  public val swift: FundingInstructionsBankTransferSwiftRecord? = null,
  public val zengin: FundingInstructionsBankTransferZenginRecord? = null,
) {
  /**
   * The payment networks supported by this FinancialAddress
   */
  public val supportedNetworks: List<InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234>?
      = supportedNetworks?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec? =
        null

    public var type: InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var aba: FundingInstructionsBankTransferAbaRecord? = null

    public var iban: FundingInstructionsBankTransferIbanRecord? = null

    public var sortCode: FundingInstructionsBankTransferSortCodeRecord? = null

    public var spei: FundingInstructionsBankTransferSpeiRecord? = null

    private var supportedNetworksValue:
        List<InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234>? = null

    /**
     * The payment networks supported by this FinancialAddress
     */
    public var supportedNetworks:
        List<InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234>?
      get() = supportedNetworksValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedNetworksValue = value?.let { collection0 -> collection0.toList() }
      }

    public var swift: FundingInstructionsBankTransferSwiftRecord? = null

    public var zengin: FundingInstructionsBankTransferZenginRecord? = null

    public fun build(): FundingInstructionsBankTransferFinancialAddress {
      check(typeValue != null) { "type is required" }
      return FundingInstructionsBankTransferFinancialAddress(
        type = type,
        aba = aba,
        iban = iban,
        sortCode = sortCode,
        spei = spei,
        supportedNetworks = supportedNetworks,
        swift = swift,
        zengin = zengin,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransferFinancialAddress = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FundingInstructionsBankTransferFinancialAddress> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FundingInstructionsBankTransferFinancialAddress {
      val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransferFinancialAddress")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FundingInstructionsBankTransferFinancialAddress must be a JSON object")
      val type = json.decodeRequired<InlineFundingInstructionsBankTransferFinancialAddressTypeX08176dec>(rawObject, "type")
      return FundingInstructionsBankTransferFinancialAddress(
        type = type,
        aba = rawObject["aba"]?.let { json.decodeFromJsonElement<FundingInstructionsBankTransferAbaRecord>(it) },
        iban = rawObject["iban"]?.let { json.decodeFromJsonElement<FundingInstructionsBankTransferIbanRecord>(it) },
        sortCode = rawObject["sort_code"]?.let { json.decodeFromJsonElement<FundingInstructionsBankTransferSortCodeRecord>(it) },
        spei = rawObject["spei"]?.let { json.decodeFromJsonElement<FundingInstructionsBankTransferSpeiRecord>(it) },
        supportedNetworks = rawObject["supported_networks"]?.let { json.decodeFromJsonElement<List<InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234>>(it) },
        swift = rawObject["swift"]?.let { json.decodeFromJsonElement<FundingInstructionsBankTransferSwiftRecord>(it) },
        zengin = rawObject["zengin"]?.let { json.decodeFromJsonElement<FundingInstructionsBankTransferZenginRecord>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FundingInstructionsBankTransferFinancialAddress) {
      val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransferFinancialAddress")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.aba?.let { put("aba", json.encodeToJsonElement(it)) }
        value.iban?.let { put("iban", json.encodeToJsonElement(it)) }
        value.sortCode?.let { put("sort_code", json.encodeToJsonElement(it)) }
        value.spei?.let { put("spei", json.encodeToJsonElement(it)) }
        value.supportedNetworks?.let { put("supported_networks", json.encodeToJsonElement(it)) }
        value.swift?.let { put("swift", json.encodeToJsonElement(it)) }
        value.zengin?.let { put("zengin", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fundingInstructionsBankTransferFinancialAddress(block: FundingInstructionsBankTransferFinancialAddress.Builder.() -> Unit): FundingInstructionsBankTransferFinancialAddress = FundingInstructionsBankTransferFinancialAddress.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FundingInstructionsBankTransferFinancialAddress is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_financial_address
 */
@Serializable(with = TreasuryFinancialAccountsResourceFinancialAddress.Serializer::class)
public class TreasuryFinancialAccountsResourceFinancialAddress(
  /**
   * The type of financial address
   */
  public val type: InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8,
  public val aba: TreasuryFinancialAccountsResourceAbaRecord? = null,
  supportedNetworks: List<InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf>? = null,
) {
  /**
   * The list of networks that the address supports
   */
  public val supportedNetworks: List<InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf>?
      = supportedNetworks?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8? =
        null

    public var type: InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var aba: TreasuryFinancialAccountsResourceAbaRecord? = null

    private var supportedNetworksValue:
        List<InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf>? = null

    /**
     * The list of networks that the address supports
     */
    public var supportedNetworks:
        List<InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf>?
      get() = supportedNetworksValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedNetworksValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TreasuryFinancialAccountsResourceFinancialAddress {
      check(typeValue != null) { "type is required" }
      return TreasuryFinancialAccountsResourceFinancialAddress(
        type = type,
        aba = aba,
        supportedNetworks = supportedNetworks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceFinancialAddress = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceFinancialAddress> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceFinancialAddress {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceFinancialAddress")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceFinancialAddress must be a JSON object")
      val type = json.decodeRequired<InlineTreasuryFinancialAccountsResourceFinancialAddressTypeX6816c6a8>(rawObject, "type")
      return TreasuryFinancialAccountsResourceFinancialAddress(
        type = type,
        aba = rawObject["aba"]?.let { json.decodeFromJsonElement<TreasuryFinancialAccountsResourceAbaRecord>(it) },
        supportedNetworks = rawObject["supported_networks"]?.let { json.decodeFromJsonElement<List<InlineTreasuryFinancialAccf6dfSupportedNetworksItemX379394bf>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceFinancialAddress) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceFinancialAddress")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.aba?.let { put("aba", json.encodeToJsonElement(it)) }
        value.supportedNetworks?.let { put("supported_networks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceFinancialAddress(block: TreasuryFinancialAccountsResourceFinancialAddress.Builder.() -> Unit): TreasuryFinancialAccountsResourceFinancialAddress = TreasuryFinancialAccountsResourceFinancialAddress.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccountsResourceFinancialAddress is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

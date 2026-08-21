package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * InboundTransfers contains inbound transfers features for a FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_inbound_transfers
 */
@Serializable(with = TreasuryFinancialAccountsResourceInboundTransfers.Serializer::class)
public class TreasuryFinancialAccountsResourceInboundTransfers(
  public val ach: TreasuryFinancialAccountsResourceInboundAchToggleSettings? = null,
) {
  public class Builder {
    public var ach: TreasuryFinancialAccountsResourceInboundAchToggleSettings? = null

    public fun build(): TreasuryFinancialAccountsResourceInboundTransfers = TreasuryFinancialAccountsResourceInboundTransfers(
      ach = ach,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceInboundTransfers = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceInboundTransfers> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceInboundTransfers {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceInboundTransfers")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceInboundTransfers must be a JSON object")
      return TreasuryFinancialAccountsResourceInboundTransfers(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<TreasuryFinancialAccountsResourceInboundAchToggleSettings>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceInboundTransfers) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceInboundTransfers")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceInboundTransfers(block: TreasuryFinancialAccountsResourceInboundTransfers.Builder.() -> Unit): TreasuryFinancialAccountsResourceInboundTransfers = TreasuryFinancialAccountsResourceInboundTransfers.build(block)

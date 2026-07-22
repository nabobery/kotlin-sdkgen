package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Unit

/**
 * OutboundTransfers contains outbound transfers features for a FinancialAccount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_outbound_transfers
 */
@Serializable(with = TreasuryFinancialAccountsResourceOutboundTransfers.Serializer::class)
public class TreasuryFinancialAccountsResourceOutboundTransfers(
    public val ach: TreasuryFinancialAccountsResourceOutboundAchToggleSettings? = null,
    public val usDomesticWire: TreasuryFinancialAccountsResourceToggleSettings? = null,
) {
    public class Builder {
        public var ach: TreasuryFinancialAccountsResourceOutboundAchToggleSettings? = null

        public var usDomesticWire: TreasuryFinancialAccountsResourceToggleSettings? = null

        public fun build(): TreasuryFinancialAccountsResourceOutboundTransfers =
            TreasuryFinancialAccountsResourceOutboundTransfers(
                ach = ach,
                usDomesticWire = usDomesticWire,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceOutboundTransfers =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryFinancialAccountsResourceOutboundTransfers> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceOutboundTransfers {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceOutboundTransfers")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryFinancialAccountsResourceOutboundTransfers must be a JSON object",
                    )
            return TreasuryFinancialAccountsResourceOutboundTransfers(
                ach =
                    rawObject["ach"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceOutboundAchToggleSettings>(it)
                    },
                usDomesticWire =
                    rawObject["us_domestic_wire"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceToggleSettings>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryFinancialAccountsResourceOutboundTransfers,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceOutboundTransfers")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
                    value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryFinancialAccountsResourceOutboundTransfers(
    block: TreasuryFinancialAccountsResourceOutboundTransfers.Builder.() -> Unit,
): TreasuryFinancialAccountsResourceOutboundTransfers = TreasuryFinancialAccountsResourceOutboundTransfers.build(block)

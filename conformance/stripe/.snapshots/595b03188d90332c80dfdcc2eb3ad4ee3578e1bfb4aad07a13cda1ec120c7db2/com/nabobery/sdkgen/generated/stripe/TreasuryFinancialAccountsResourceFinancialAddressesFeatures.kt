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
 * Settings related to Financial Addresses features on a Financial Account
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_financial_addresses_features
 */
@Serializable(with = TreasuryFinancialAccountsResourceFinancialAddressesFeatures.Serializer::class)
public class TreasuryFinancialAccountsResourceFinancialAddressesFeatures(
    public val aba: TreasuryFinancialAccountsResourceAbaToggleSettings? = null,
) {
    public class Builder {
        public var aba: TreasuryFinancialAccountsResourceAbaToggleSettings? = null

        public fun build(): TreasuryFinancialAccountsResourceFinancialAddressesFeatures =
            TreasuryFinancialAccountsResourceFinancialAddressesFeatures(
                aba = aba,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceFinancialAddressesFeatures =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryFinancialAccountsResourceFinancialAddressesFeatures> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceFinancialAddressesFeatures {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceFinancialAddressesFeatures")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TreasuryFinancialAccountsResourceFinancialAddressesFeatures must be a JSON object",
                    )
            return TreasuryFinancialAccountsResourceFinancialAddressesFeatures(
                aba =
                    rawObject["aba"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceAbaToggleSettings>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryFinancialAccountsResourceFinancialAddressesFeatures,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceFinancialAddressesFeatures")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.aba?.let { put("aba", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryFinancialAccountsResourceFinancialAddressesFeatures(
    block: TreasuryFinancialAccountsResourceFinancialAddressesFeatures.Builder.() -> Unit,
): TreasuryFinancialAccountsResourceFinancialAddressesFeatures =
    TreasuryFinancialAccountsResourceFinancialAddressesFeatures.build(block)

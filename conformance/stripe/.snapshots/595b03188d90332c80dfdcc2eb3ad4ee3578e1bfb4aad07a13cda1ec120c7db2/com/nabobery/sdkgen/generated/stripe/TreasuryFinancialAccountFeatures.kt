package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit

/**
 * Encodes whether a FinancialAccount has access to a particular Feature, with a `status` enum and associated
 * `status_details`.
 * Stripe or the platform can control Features via the requested field.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account_features
 */
@Serializable(with = TreasuryFinancialAccountFeatures.Serializer::class)
public class TreasuryFinancialAccountFeatures(
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7,
    public val cardIssuing: TreasuryFinancialAccountsResourceToggleSettings? = null,
    public val depositInsurance: TreasuryFinancialAccountsResourceToggleSettings? = null,
    public val financialAddresses: TreasuryFinancialAccountsResourceFinancialAddressesFeatures? = null,
    public val inboundTransfers: TreasuryFinancialAccountsResourceInboundTransfers? = null,
    public val intraStripeFlows: TreasuryFinancialAccountsResourceToggleSettings? = null,
    public val outboundPayments: TreasuryFinancialAccountsResourceOutboundPayments? = null,
    public val outboundTransfers: TreasuryFinancialAccountsResourceOutboundTransfers? = null,
) {
    public class Builder {
        private var objectValueValue: InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7? = null

        public var objectValue: InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public var cardIssuing: TreasuryFinancialAccountsResourceToggleSettings? = null

        public var depositInsurance: TreasuryFinancialAccountsResourceToggleSettings? = null

        public var financialAddresses: TreasuryFinancialAccountsResourceFinancialAddressesFeatures? =
            null

        public var inboundTransfers: TreasuryFinancialAccountsResourceInboundTransfers? = null

        public var intraStripeFlows: TreasuryFinancialAccountsResourceToggleSettings? = null

        public var outboundPayments: TreasuryFinancialAccountsResourceOutboundPayments? = null

        public var outboundTransfers: TreasuryFinancialAccountsResourceOutboundTransfers? = null

        public fun build(): TreasuryFinancialAccountFeatures {
            check(objectValueValue != null) { "objectValue is required" }
            return TreasuryFinancialAccountFeatures(
                objectValue = objectValue,
                cardIssuing = cardIssuing,
                depositInsurance = depositInsurance,
                financialAddresses = financialAddresses,
                inboundTransfers = inboundTransfers,
                intraStripeFlows = intraStripeFlows,
                outboundPayments = outboundPayments,
                outboundTransfers = outboundTransfers,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountFeatures = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TreasuryFinancialAccountFeatures> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TreasuryFinancialAccountFeatures {
            val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountFeatures")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TreasuryFinancialAccountFeatures must be a JSON object")
            val objectValue =
                json.decodeRequired<InlineTreasuryFinancialAccountFeaturesObjectValueX72f91fa7>(
                    rawObject,
                    "object",
                )
            return TreasuryFinancialAccountFeatures(
                objectValue = objectValue,
                cardIssuing =
                    rawObject["card_issuing"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceToggleSettings>(it)
                    },
                depositInsurance =
                    rawObject["deposit_insurance"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceToggleSettings>(it)
                    },
                financialAddresses =
                    rawObject["financial_addresses"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceFinancialAddressesFeatures>(it)
                    },
                inboundTransfers =
                    rawObject["inbound_transfers"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceInboundTransfers>(it)
                    },
                intraStripeFlows =
                    rawObject["intra_stripe_flows"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceToggleSettings>(it)
                    },
                outboundPayments =
                    rawObject["outbound_payments"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceOutboundPayments>(it)
                    },
                outboundTransfers =
                    rawObject["outbound_transfers"]?.let {
                        json.decodeFromJsonElement<TreasuryFinancialAccountsResourceOutboundTransfers>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TreasuryFinancialAccountFeatures,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountFeatures")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
                    value.depositInsurance?.let { put("deposit_insurance", json.encodeToJsonElement(it)) }
                    value.financialAddresses?.let { put("financial_addresses", json.encodeToJsonElement(it)) }
                    value.inboundTransfers?.let { put("inbound_transfers", json.encodeToJsonElement(it)) }
                    value.intraStripeFlows?.let { put("intra_stripe_flows", json.encodeToJsonElement(it)) }
                    value.outboundPayments?.let { put("outbound_payments", json.encodeToJsonElement(it)) }
                    value.outboundTransfers?.let { put("outbound_transfers", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun treasuryFinancialAccountFeatures(
    block: TreasuryFinancialAccountFeatures.Builder.() -> Unit,
): TreasuryFinancialAccountFeatures = TreasuryFinancialAccountFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TreasuryFinancialAccountFeatures is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

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
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer
 */
@Serializable(with = FundingInstructionsBankTransfer.Serializer::class)
public class FundingInstructionsBankTransfer(
    /**
     * The country of the bank account to fund
     */
    public val country: String,
    financialAddresses: List<FundingInstructionsBankTransferFinancialAddress>,
    /**
     * The bank_transfer type
     */
    public val type: InlineFundingInstructionsBankTransferTypeX6b71fe17,
) {
    /**
     * A list of financial addresses that can be used to fund a particular balance
     */
    public val financialAddresses: List<FundingInstructionsBankTransferFinancialAddress> =
        financialAddresses.toList()

    public class Builder {
        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        private var financialAddressesValue: List<FundingInstructionsBankTransferFinancialAddress>? =
            null

        public var financialAddresses: List<FundingInstructionsBankTransferFinancialAddress>
            get() = requireNotNull(financialAddressesValue) { "financialAddresses is required" }
            set(`value`) {
                financialAddressesValue = value
            }

        private var typeValue: InlineFundingInstructionsBankTransferTypeX6b71fe17? = null

        public var type: InlineFundingInstructionsBankTransferTypeX6b71fe17
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): FundingInstructionsBankTransfer {
            check(countryValue != null) { "country is required" }
            check(financialAddressesValue != null) { "financialAddresses is required" }
            check(typeValue != null) { "type is required" }
            return FundingInstructionsBankTransfer(
                country = country,
                financialAddresses = financialAddresses,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): FundingInstructionsBankTransfer = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<FundingInstructionsBankTransfer> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): FundingInstructionsBankTransfer {
            val jsonDecoder = decoder.requireJsonDecoder("FundingInstructionsBankTransfer")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("FundingInstructionsBankTransfer must be a JSON object")
            val country = json.decodeRequired<String>(rawObject, "country")
            val financialAddresses =
                json.decodeRequired<List<FundingInstructionsBankTransferFinancialAddress>>(
                    rawObject,
                    "financial_addresses",
                )
            val type = json.decodeRequired<InlineFundingInstructionsBankTransferTypeX6b71fe17>(rawObject, "type")
            return FundingInstructionsBankTransfer(
                country = country,
                financialAddresses = financialAddresses,
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: FundingInstructionsBankTransfer,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("FundingInstructionsBankTransfer")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("country", value.country)
                    put("financial_addresses", json.encodeToJsonElement(value.financialAddresses))
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun fundingInstructionsBankTransfer(
    block: FundingInstructionsBankTransfer.Builder.() -> Unit,
): FundingInstructionsBankTransfer = FundingInstructionsBankTransfer.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "FundingInstructionsBankTransfer is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * When a non-stripe BIN is used, any use of an [issued card](https://docs.stripe.com/issuing) must be settled directly
 * with the card network. The net amount owed is represented by an Issuing `Settlement` object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.settlement
 */
@Serializable(with = IssuingSettlement.Serializer::class)
public class IssuingSettlement(
    /**
     * The Bank Identification Number reflecting this settlement record.
     */
    public val bin: String,
    /**
     * The date that the transactions are cleared and posted to user's accounts.
     */
    public val clearingDate: Int,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * The total interchange received as reimbursement for the transactions.
     */
    public val interchangeFeesAmount: Int,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * The total net amount required to settle with the network.
     */
    public val netTotalAmount: Int,
    /**
     * The card network for this settlement report. One of ["visa", "maestro", "mastercard"]
     */
    public val network: InlineIssuingSettlementNetworkXcdee1767,
    /**
     * The total amount of fees owed to the network.
     */
    public val networkFeesAmount: Int,
    /**
     * The Settlement Identification Number assigned by the network.
     */
    public val networkSettlementIdentifier: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineIssuingSettlementObjectValueX9e285a98,
    /**
     * One of `international` or `uk_national_net`.
     */
    public val settlementService: String,
    /**
     * The current processing status of this settlement.
     */
    public val status: InlineIssuingSettlementStatusX0d8287a0,
    /**
     * The total transaction amount reflected in this settlement.
     */
    public val transactionAmount: Int,
    /**
     * The total number of transactions reflected in this settlement.
     */
    public val transactionCount: Int,
) {
    public class Builder {
        private var binValue: String? = null

        public var bin: String
            get() = requireNotNull(binValue) { "bin is required" }
            set(`value`) {
                binValue = value
            }

        private var clearingDateValue: Int? = null

        public var clearingDate: Int
            get() = requireNotNull(clearingDateValue) { "clearingDate is required" }
            set(`value`) {
                clearingDateValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var interchangeFeesAmountValue: Int? = null

        public var interchangeFeesAmount: Int
            get() = requireNotNull(interchangeFeesAmountValue) { "interchangeFeesAmount is required" }
            set(`value`) {
                interchangeFeesAmountValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var netTotalAmountValue: Int? = null

        public var netTotalAmount: Int
            get() = requireNotNull(netTotalAmountValue) { "netTotalAmount is required" }
            set(`value`) {
                netTotalAmountValue = value
            }

        private var networkValue: InlineIssuingSettlementNetworkXcdee1767? = null

        public var network: InlineIssuingSettlementNetworkXcdee1767
            get() = requireNotNull(networkValue) { "network is required" }
            set(`value`) {
                networkValue = value
            }

        private var networkFeesAmountValue: Int? = null

        public var networkFeesAmount: Int
            get() = requireNotNull(networkFeesAmountValue) { "networkFeesAmount is required" }
            set(`value`) {
                networkFeesAmountValue = value
            }

        private var networkSettlementIdentifierValue: String? = null

        public var networkSettlementIdentifier: String
            get() = requireNotNull(networkSettlementIdentifierValue) { "networkSettlementIdentifier is required" }
            set(`value`) {
                networkSettlementIdentifierValue = value
            }

        private var objectValueValue: InlineIssuingSettlementObjectValueX9e285a98? = null

        public var objectValue: InlineIssuingSettlementObjectValueX9e285a98
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var settlementServiceValue: String? = null

        public var settlementService: String
            get() = requireNotNull(settlementServiceValue) { "settlementService is required" }
            set(`value`) {
                settlementServiceValue = value
            }

        private var statusValue: InlineIssuingSettlementStatusX0d8287a0? = null

        public var status: InlineIssuingSettlementStatusX0d8287a0
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var transactionAmountValue: Int? = null

        public var transactionAmount: Int
            get() = requireNotNull(transactionAmountValue) { "transactionAmount is required" }
            set(`value`) {
                transactionAmountValue = value
            }

        private var transactionCountValue: Int? = null

        public var transactionCount: Int
            get() = requireNotNull(transactionCountValue) { "transactionCount is required" }
            set(`value`) {
                transactionCountValue = value
            }

        public fun build(): IssuingSettlement {
            check(binValue != null) { "bin is required" }
            check(clearingDateValue != null) { "clearingDate is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(idValue != null) { "id is required" }
            check(interchangeFeesAmountValue != null) { "interchangeFeesAmount is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(netTotalAmountValue != null) { "netTotalAmount is required" }
            check(networkValue != null) { "network is required" }
            check(networkFeesAmountValue != null) { "networkFeesAmount is required" }
            check(networkSettlementIdentifierValue != null) { "networkSettlementIdentifier is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(settlementServiceValue != null) { "settlementService is required" }
            check(statusValue != null) { "status is required" }
            check(transactionAmountValue != null) { "transactionAmount is required" }
            check(transactionCountValue != null) { "transactionCount is required" }
            return IssuingSettlement(
                bin = bin,
                clearingDate = clearingDate,
                created = created,
                currency = currency,
                id = id,
                interchangeFeesAmount = interchangeFeesAmount,
                livemode = livemode,
                metadata = metadata,
                netTotalAmount = netTotalAmount,
                network = network,
                networkFeesAmount = networkFeesAmount,
                networkSettlementIdentifier = networkSettlementIdentifier,
                objectValue = objectValue,
                settlementService = settlementService,
                status = status,
                transactionAmount = transactionAmount,
                transactionCount = transactionCount,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingSettlement = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingSettlement> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingSettlement {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingSettlement")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingSettlement must be a JSON object")
            val bin = json.decodeRequired<String>(rawObject, "bin")
            val clearingDate = json.decodeRequired<Int>(rawObject, "clearing_date")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val id = json.decodeRequired<String>(rawObject, "id")
            val interchangeFeesAmount = json.decodeRequired<Int>(rawObject, "interchange_fees_amount")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val netTotalAmount = json.decodeRequired<Int>(rawObject, "net_total_amount")
            val network = json.decodeRequired<InlineIssuingSettlementNetworkXcdee1767>(rawObject, "network")
            val networkFeesAmount = json.decodeRequired<Int>(rawObject, "network_fees_amount")
            val networkSettlementIdentifier = json.decodeRequired<String>(rawObject, "network_settlement_identifier")
            val objectValue = json.decodeRequired<InlineIssuingSettlementObjectValueX9e285a98>(rawObject, "object")
            val settlementService = json.decodeRequired<String>(rawObject, "settlement_service")
            val status = json.decodeRequired<InlineIssuingSettlementStatusX0d8287a0>(rawObject, "status")
            val transactionAmount = json.decodeRequired<Int>(rawObject, "transaction_amount")
            val transactionCount = json.decodeRequired<Int>(rawObject, "transaction_count")
            return IssuingSettlement(
                bin = bin,
                clearingDate = clearingDate,
                created = created,
                currency = currency,
                id = id,
                interchangeFeesAmount = interchangeFeesAmount,
                livemode = livemode,
                metadata = metadata,
                netTotalAmount = netTotalAmount,
                network = network,
                networkFeesAmount = networkFeesAmount,
                networkSettlementIdentifier = networkSettlementIdentifier,
                objectValue = objectValue,
                settlementService = settlementService,
                status = status,
                transactionAmount = transactionAmount,
                transactionCount = transactionCount,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingSettlement,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingSettlement")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("bin", value.bin)
                    put("clearing_date", json.encodeToJsonElement(value.clearingDate))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("id", value.id)
                    put("interchange_fees_amount", json.encodeToJsonElement(value.interchangeFeesAmount))
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("net_total_amount", json.encodeToJsonElement(value.netTotalAmount))
                    put("network", json.encodeToJsonElement(value.network))
                    put("network_fees_amount", json.encodeToJsonElement(value.networkFeesAmount))
                    put("network_settlement_identifier", value.networkSettlementIdentifier)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("settlement_service", value.settlementService)
                    put("status", json.encodeToJsonElement(value.status))
                    put("transaction_amount", json.encodeToJsonElement(value.transactionAmount))
                    put("transaction_count", json.encodeToJsonElement(value.transactionCount))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingSettlement(block: IssuingSettlement.Builder.() -> Unit): IssuingSettlement =
    IssuingSettlement.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingSettlement is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

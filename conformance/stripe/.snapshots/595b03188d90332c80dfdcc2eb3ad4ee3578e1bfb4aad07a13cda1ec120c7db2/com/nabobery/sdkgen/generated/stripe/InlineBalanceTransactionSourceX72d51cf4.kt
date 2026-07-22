package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineBalanceTransactionSourceX72d51cf4Branch {
    Branch1,
    ApplicationFee,
    Charge,
    ConnectCollectionTransfer,
    CustomerCashBalanceTransaction,
    Dispute,
    FeeRefund,
    IssuingAuthorization,
    IssuingDispute,
    IssuingTransaction,
    Payout,
    Refund,
    ReserveTransaction,
    TaxDeductedAtSource,
    Topup,
    Transfer,
    TransferReversal,
}

public sealed class InlineBalanceTransactionSourceX72d51cf4DecodingException(
    message: String,
) : SerializationException(message)

public class InlineBalanceTransactionSourceX72d51cf4NoMatchException(
    message: String,
) : InlineBalanceTransactionSourceX72d51cf4DecodingException(message)

internal data class InlineBalanceTransactionSourceX72d51cf4Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplicationFee: Boolean,
    public val matchesCharge: Boolean,
    public val matchesConnectCollectionTransfer: Boolean,
    public val matchesCustomerCashBalanceTransaction: Boolean,
    public val matchesDispute: Boolean,
    public val matchesFeeRefund: Boolean,
    public val matchesIssuingAuthorization: Boolean,
    public val matchesIssuingDispute: Boolean,
    public val matchesIssuingTransaction: Boolean,
    public val matchesPayout: Boolean,
    public val matchesRefund: Boolean,
    public val matchesReserveTransaction: Boolean,
    public val matchesTaxDeductedAtSource: Boolean,
    public val matchesTopup: Boolean,
    public val matchesTransfer: Boolean,
    public val matchesTransferReversal: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesApplicationFee,
                matchesCharge,
                matchesConnectCollectionTransfer,
                matchesCustomerCashBalanceTransaction,
                matchesDispute,
                matchesFeeRefund,
                matchesIssuingAuthorization,
                matchesIssuingDispute,
                matchesIssuingTransaction,
                matchesPayout,
                matchesRefund,
                matchesReserveTransaction,
                matchesTaxDeductedAtSource,
                matchesTopup,
                matchesTransfer,
                matchesTransferReversal,
            ).count {
                it
            }
}

/**
 * This transaction relates to the Stripe object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_transaction/properties/source
 */
@Serializable(with = InlineBalanceTransactionSourceX72d51cf4.Serializer::class)
public class InlineBalanceTransactionSourceX72d51cf4 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBalanceTransactionSourceX72d51cf4Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val applicationFee: ApplicationFee? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApplicationFee) json.decodeFromJsonElement<ApplicationFee>(raw) else null
        }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val connectCollectionTransfer: ConnectCollectionTransfer? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesConnectCollectionTransfer) {
                json.decodeFromJsonElement<ConnectCollectionTransfer>(
                    raw,
                )
            } else {
                null
            }
        }

    public val customerCashBalanceTransaction: CustomerCashBalanceTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesCustomerCashBalanceTransaction) {
                json
                    .decodeFromJsonElement<CustomerCashBalanceTransaction>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val dispute: Dispute? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesDispute) json.decodeFromJsonElement<Dispute>(raw) else null }

    public val feeRefund: FeeRefund? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesFeeRefund) json.decodeFromJsonElement<FeeRefund>(raw) else null
        }

    public val issuingAuthorization: IssuingAuthorization? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingAuthorization) json.decodeFromJsonElement<IssuingAuthorization>(raw) else null
        }

    public val issuingDispute: IssuingDispute? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingDispute) json.decodeFromJsonElement<IssuingDispute>(raw) else null
        }

    public val issuingTransaction: IssuingTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingTransaction) json.decodeFromJsonElement<IssuingTransaction>(raw) else null
        }

    public val payout: Payout? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesPayout) json.decodeFromJsonElement<Payout>(raw) else null }

    public val refund: Refund? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesRefund) json.decodeFromJsonElement<Refund>(raw) else null }

    public val reserveTransaction: ReserveTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesReserveTransaction) json.decodeFromJsonElement<ReserveTransaction>(raw) else null
        }

    public val taxDeductedAtSource: TaxDeductedAtSource? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTaxDeductedAtSource) json.decodeFromJsonElement<TaxDeductedAtSource>(raw) else null
        }

    public val topup: Topup? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesTopup) json.decodeFromJsonElement<Topup>(raw) else null }

    public val transfer: Transfer? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesTransfer) json.decodeFromJsonElement<Transfer>(raw) else null }

    public val transferReversal: TransferReversal? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTransferReversal) json.decodeFromJsonElement<TransferReversal>(raw) else null
        }

    public val matchedBranches: Set<InlineBalanceTransactionSourceX72d51cf4Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineBalanceTransactionSourceX72d51cf4Branch.Branch1)
                if (inspection.matchesApplicationFee) add(InlineBalanceTransactionSourceX72d51cf4Branch.ApplicationFee)
                if (inspection.matchesCharge) add(InlineBalanceTransactionSourceX72d51cf4Branch.Charge)
                if (inspection.matchesConnectCollectionTransfer) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.ConnectCollectionTransfer,
                    )
                }
                if (inspection.matchesCustomerCashBalanceTransaction) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.CustomerCashBalanceTransaction,
                    )
                }
                if (inspection.matchesDispute) add(InlineBalanceTransactionSourceX72d51cf4Branch.Dispute)
                if (inspection.matchesFeeRefund) add(InlineBalanceTransactionSourceX72d51cf4Branch.FeeRefund)
                if (inspection.matchesIssuingAuthorization) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.IssuingAuthorization,
                    )
                }
                if (inspection.matchesIssuingDispute) add(InlineBalanceTransactionSourceX72d51cf4Branch.IssuingDispute)
                if (inspection.matchesIssuingTransaction) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.IssuingTransaction,
                    )
                }
                if (inspection.matchesPayout) add(InlineBalanceTransactionSourceX72d51cf4Branch.Payout)
                if (inspection.matchesRefund) add(InlineBalanceTransactionSourceX72d51cf4Branch.Refund)
                if (inspection.matchesReserveTransaction) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.ReserveTransaction,
                    )
                }
                if (inspection.matchesTaxDeductedAtSource) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.TaxDeductedAtSource,
                    )
                }
                if (inspection.matchesTopup) add(InlineBalanceTransactionSourceX72d51cf4Branch.Topup)
                if (inspection.matchesTransfer) add(InlineBalanceTransactionSourceX72d51cf4Branch.Transfer)
                if (inspection.matchesTransferReversal) {
                    add(
                        InlineBalanceTransactionSourceX72d51cf4Branch.TransferReversal,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineBalanceTransactionSourceX72d51cf4 {
            val inspection = inspectInlineBalanceTransactionSourceX72d51cf4(raw)
            if (inspection.matchCount == 0) {
                throw InlineBalanceTransactionSourceX72d51cf4NoMatchException(
                    "InlineBalanceTransactionSourceX72d51cf4 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBalanceTransactionSourceX72d51cf4(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBalanceTransactionSourceX72d51cf4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBalanceTransactionSourceX72d51cf4 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBalanceTransactionSourceX72d51cf4")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBalanceTransactionSourceX72d51cf4,
        ) {
            encoder.requireJsonEncoder("InlineBalanceTransactionSourceX72d51cf4").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBalanceTransactionSourceX72d51cf4(
    element: JsonElement,
): InlineBalanceTransactionSourceX72d51cf4Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplicationFee = element.isJsonDecodable<ApplicationFee>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    val matchesConnectCollectionTransfer = element.isJsonDecodable<ConnectCollectionTransfer>()
    val matchesCustomerCashBalanceTransaction = element.isJsonDecodable<CustomerCashBalanceTransaction>()
    val matchesDispute = element.isJsonDecodable<Dispute>()
    val matchesFeeRefund = element.isJsonDecodable<FeeRefund>()
    val matchesIssuingAuthorization = element.isJsonDecodable<IssuingAuthorization>()
    val matchesIssuingDispute = element.isJsonDecodable<IssuingDispute>()
    val matchesIssuingTransaction = element.isJsonDecodable<IssuingTransaction>()
    val matchesPayout = element.isJsonDecodable<Payout>()
    val matchesRefund = element.isJsonDecodable<Refund>()
    val matchesReserveTransaction = element.isJsonDecodable<ReserveTransaction>()
    val matchesTaxDeductedAtSource = element.isJsonDecodable<TaxDeductedAtSource>()
    val matchesTopup = element.isJsonDecodable<Topup>()
    val matchesTransfer = element.isJsonDecodable<Transfer>()
    val matchesTransferReversal = element.isJsonDecodable<TransferReversal>()
    return InlineBalanceTransactionSourceX72d51cf4Inspection(
        matchesBranch1 = matchesBranch1,
        matchesApplicationFee = matchesApplicationFee,
        matchesCharge = matchesCharge,
        matchesConnectCollectionTransfer = matchesConnectCollectionTransfer,
        matchesCustomerCashBalanceTransaction = matchesCustomerCashBalanceTransaction,
        matchesDispute = matchesDispute,
        matchesFeeRefund = matchesFeeRefund,
        matchesIssuingAuthorization = matchesIssuingAuthorization,
        matchesIssuingDispute = matchesIssuingDispute,
        matchesIssuingTransaction = matchesIssuingTransaction,
        matchesPayout = matchesPayout,
        matchesRefund = matchesRefund,
        matchesReserveTransaction = matchesReserveTransaction,
        matchesTaxDeductedAtSource = matchesTaxDeductedAtSource,
        matchesTopup = matchesTopup,
        matchesTransfer = matchesTransfer,
        matchesTransferReversal = matchesTransferReversal,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesApplicationFee) add("ApplicationFee: value does not match ApplicationFee")
                if (!matchesCharge) add("Charge: value does not match Charge")
                if (!matchesConnectCollectionTransfer) {
                    add(
                        "ConnectCollectionTransfer: value does not match ConnectCollectionTransfer",
                    )
                }
                if (!matchesCustomerCashBalanceTransaction) {
                    add(
                        "CustomerCashBalanceTransaction: value does not match CustomerCashBalanceTransaction",
                    )
                }
                if (!matchesDispute) add("Dispute: value does not match Dispute")
                if (!matchesFeeRefund) add("FeeRefund: value does not match FeeRefund")
                if (!matchesIssuingAuthorization) add("IssuingAuthorization: value does not match IssuingAuthorization")
                if (!matchesIssuingDispute) add("IssuingDispute: value does not match IssuingDispute")
                if (!matchesIssuingTransaction) add("IssuingTransaction: value does not match IssuingTransaction")
                if (!matchesPayout) add("Payout: value does not match Payout")
                if (!matchesRefund) add("Refund: value does not match Refund")
                if (!matchesReserveTransaction) add("ReserveTransaction: value does not match ReserveTransaction")
                if (!matchesTaxDeductedAtSource) add("TaxDeductedAtSource: value does not match TaxDeductedAtSource")
                if (!matchesTopup) add("Topup: value does not match Topup")
                if (!matchesTransfer) add("Transfer: value does not match Transfer")
                if (!matchesTransferReversal) add("TransferReversal: value does not match TransferReversal")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

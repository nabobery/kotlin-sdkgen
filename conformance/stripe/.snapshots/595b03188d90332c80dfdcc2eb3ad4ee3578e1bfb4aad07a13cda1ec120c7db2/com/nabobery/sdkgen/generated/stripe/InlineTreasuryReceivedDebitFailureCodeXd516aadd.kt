package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Reason for the failure. A ReceivedDebit might fail because the FinancialAccount doesn't have sufficient funds, is
 * closed, or is frozen.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit/properties/failure_code
 */
@Serializable(with = InlineTreasuryReceivedDebitFailureCodeXd516aadd.Serializer::class)
public sealed class InlineTreasuryReceivedDebitFailureCodeXd516aadd {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account_closed`.
     */
    public data object AccountClosed : InlineTreasuryReceivedDebitFailureCodeXd516aadd() {
        public override val `value`: String = "account_closed"
    }

    /**
     * Documented value. Wire value: `account_frozen`.
     */
    public data object AccountFrozen : InlineTreasuryReceivedDebitFailureCodeXd516aadd() {
        public override val `value`: String = "account_frozen"
    }

    /**
     * Documented value. Wire value: `insufficient_funds`.
     */
    public data object InsufficientFunds : InlineTreasuryReceivedDebitFailureCodeXd516aadd() {
        public override val `value`: String = "insufficient_funds"
    }

    /**
     * Documented value. Wire value: `international_transaction`.
     */
    public data object InternationalTransaction : InlineTreasuryReceivedDebitFailureCodeXd516aadd() {
        public override val `value`: String = "international_transaction"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineTreasuryReceivedDebitFailureCodeXd516aadd() {
        public override val `value`: String = "other"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryReceivedDebitFailureCodeXd516aadd()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryReceivedDebitFailureCodeXd516aadd =
            when (value) {
                AccountClosed.value -> AccountClosed
                AccountFrozen.value -> AccountFrozen
                InsufficientFunds.value -> InsufficientFunds
                InternationalTransaction.value -> InternationalTransaction
                Other.value -> Other
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryReceivedDebitFailureCodeXd516aadd> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedDebitFailureCodeXd516aadd",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitFailureCodeXd516aadd =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryReceivedDebitFailureCodeXd516aadd,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

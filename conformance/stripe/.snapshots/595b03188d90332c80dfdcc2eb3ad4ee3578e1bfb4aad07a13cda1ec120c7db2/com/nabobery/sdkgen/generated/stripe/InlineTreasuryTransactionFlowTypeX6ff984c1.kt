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
 * Type of the flow that created the Transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction/properties/flow_type
 */
@Serializable(with = InlineTreasuryTransactionFlowTypeX6ff984c1.Serializer::class)
public sealed class InlineTreasuryTransactionFlowTypeX6ff984c1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `credit_reversal`.
     */
    public data object CreditReversal : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "credit_reversal"
    }

    /**
     * Documented value. Wire value: `debit_reversal`.
     */
    public data object DebitReversal : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "debit_reversal"
    }

    /**
     * Documented value. Wire value: `inbound_transfer`.
     */
    public data object InboundTransfer : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "inbound_transfer"
    }

    /**
     * Documented value. Wire value: `issuing_authorization`.
     */
    public data object IssuingAuthorization : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "issuing_authorization"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `outbound_payment`.
     */
    public data object OutboundPayment : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "outbound_payment"
    }

    /**
     * Documented value. Wire value: `outbound_transfer`.
     */
    public data object OutboundTransfer : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "outbound_transfer"
    }

    /**
     * Documented value. Wire value: `received_credit`.
     */
    public data object ReceivedCredit : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "received_credit"
    }

    /**
     * Documented value. Wire value: `received_debit`.
     */
    public data object ReceivedDebit : InlineTreasuryTransactionFlowTypeX6ff984c1() {
        public override val `value`: String = "received_debit"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryTransactionFlowTypeX6ff984c1()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryTransactionFlowTypeX6ff984c1 =
            when (value) {
                CreditReversal.value -> CreditReversal
                DebitReversal.value -> DebitReversal
                InboundTransfer.value -> InboundTransfer
                IssuingAuthorization.value -> IssuingAuthorization
                Other.value -> Other
                OutboundPayment.value -> OutboundPayment
                OutboundTransfer.value -> OutboundTransfer
                ReceivedCredit.value -> ReceivedCredit
                ReceivedDebit.value -> ReceivedDebit
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasuryTransactionFlowTypeX6ff984c1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionFlowTypeX6ff984c1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryTransactionFlowTypeX6ff984c1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryTransactionFlowTypeX6ff984c1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

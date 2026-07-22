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
 * The type of the cash balance transaction. New types may be added in future. See [Customer
 * Balance](https://docs.stripe.com/payments/customer-balance#types) to learn more about these types.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_cash_balance_transaction/properties/type
 */
@Serializable(with = InlineCustomerCashBalanceTransactionTypeXef586d00.Serializer::class)
public sealed class InlineCustomerCashBalanceTransactionTypeXef586d00 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `adjusted_for_overdraft`.
     */
    public data object AdjustedForOverdraft : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "adjusted_for_overdraft"
    }

    /**
     * Documented value. Wire value: `applied_to_payment`.
     */
    public data object AppliedToPayment : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "applied_to_payment"
    }

    /**
     * Documented value. Wire value: `funded`.
     */
    public data object Funded : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "funded"
    }

    /**
     * Documented value. Wire value: `funding_reversed`.
     */
    public data object FundingReversed : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "funding_reversed"
    }

    /**
     * Documented value. Wire value: `refunded_from_payment`.
     */
    public data object RefundedFromPayment : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "refunded_from_payment"
    }

    /**
     * Documented value. Wire value: `return_canceled`.
     */
    public data object ReturnCanceled : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "return_canceled"
    }

    /**
     * Documented value. Wire value: `return_initiated`.
     */
    public data object ReturnInitiated : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "return_initiated"
    }

    /**
     * Documented value. Wire value: `transferred_to_balance`.
     */
    public data object TransferredToBalance : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "transferred_to_balance"
    }

    /**
     * Documented value. Wire value: `unapplied_from_payment`.
     */
    public data object UnappliedFromPayment : InlineCustomerCashBalanceTransactionTypeXef586d00() {
        public override val `value`: String = "unapplied_from_payment"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerCashBalanceTransactionTypeXef586d00()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerCashBalanceTransactionTypeXef586d00 =
            when (value) {
                AdjustedForOverdraft.value -> AdjustedForOverdraft
                AppliedToPayment.value -> AppliedToPayment
                Funded.value -> Funded
                FundingReversed.value -> FundingReversed
                RefundedFromPayment.value -> RefundedFromPayment
                ReturnCanceled.value -> ReturnCanceled
                ReturnInitiated.value -> ReturnInitiated
                TransferredToBalance.value -> TransferredToBalance
                UnappliedFromPayment.value -> UnappliedFromPayment
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerCashBalanceTransactionTypeXef586d00> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerCashBalanceTransactionTypeXef586d00",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerCashBalanceTransactionTypeXef586d00 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerCashBalanceTransactionTypeXef586d00,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

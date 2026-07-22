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
 * If `completed`, you can use the [Balance Transactions
 * API](https://docs.stripe.com/api/balance_transactions/list#balance_transaction_list-payout) to list all balance
 * transactions that are paid out in this payout.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/reconciliation_status
 */
@Serializable(with = InlinePayoutReconciliationStatusX2b08164f.Serializer::class)
public sealed class InlinePayoutReconciliationStatusX2b08164f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `completed`.
     */
    public data object Completed : InlinePayoutReconciliationStatusX2b08164f() {
        public override val `value`: String = "completed"
    }

    /**
     * Documented value. Wire value: `in_progress`.
     */
    public data object InProgress : InlinePayoutReconciliationStatusX2b08164f() {
        public override val `value`: String = "in_progress"
    }

    /**
     * Documented value. Wire value: `not_applicable`.
     */
    public data object NotApplicable : InlinePayoutReconciliationStatusX2b08164f() {
        public override val `value`: String = "not_applicable"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePayoutReconciliationStatusX2b08164f()

    public companion object {
        public fun fromValue(`value`: String): InlinePayoutReconciliationStatusX2b08164f =
            when (value) {
                Completed.value -> Completed
                InProgress.value -> InProgress
                NotApplicable.value -> NotApplicable
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePayoutReconciliationStatusX2b08164f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePayoutReconciliationStatusX2b08164f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePayoutReconciliationStatusX2b08164f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePayoutReconciliationStatusX2b08164f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

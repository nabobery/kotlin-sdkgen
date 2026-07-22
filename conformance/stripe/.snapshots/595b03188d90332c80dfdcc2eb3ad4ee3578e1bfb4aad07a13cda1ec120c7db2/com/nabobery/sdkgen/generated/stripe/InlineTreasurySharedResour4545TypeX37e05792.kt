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
 * Polymorphic type matching the originating money movement's source. This can be an external account, a Stripe balance,
 * or a FinancialAccount.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_shared_resource_initiating_payment_method_details_initiatin
 * g_payment_method_details/properties/type
 */
@Serializable(with = InlineTreasurySharedResour4545TypeX37e05792.Serializer::class)
public sealed class InlineTreasurySharedResour4545TypeX37e05792 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `balance`.
     */
    public data object Balance : InlineTreasurySharedResour4545TypeX37e05792() {
        public override val `value`: String = "balance"
    }

    /**
     * Documented value. Wire value: `financial_account`.
     */
    public data object FinancialAccount : InlineTreasurySharedResour4545TypeX37e05792() {
        public override val `value`: String = "financial_account"
    }

    /**
     * Documented value. Wire value: `issuing_card`.
     */
    public data object IssuingCard : InlineTreasurySharedResour4545TypeX37e05792() {
        public override val `value`: String = "issuing_card"
    }

    /**
     * Documented value. Wire value: `stripe`.
     */
    public data object Stripe : InlineTreasurySharedResour4545TypeX37e05792() {
        public override val `value`: String = "stripe"
    }

    /**
     * Documented value. Wire value: `us_bank_account`.
     */
    public data object UsBankAccount : InlineTreasurySharedResour4545TypeX37e05792() {
        public override val `value`: String = "us_bank_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasurySharedResour4545TypeX37e05792()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasurySharedResour4545TypeX37e05792 =
            when (value) {
                Balance.value -> Balance
                FinancialAccount.value -> FinancialAccount
                IssuingCard.value -> IssuingCard
                Stripe.value -> Stripe
                UsBankAccount.value -> UsBankAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTreasurySharedResour4545TypeX37e05792> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasurySharedResour4545TypeX37e05792",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasurySharedResour4545TypeX37e05792 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasurySharedResour4545TypeX37e05792,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * The type of debit transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_debit/properties/type
 */
@Serializable(with = InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc.Serializer::class)
public sealed class InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `credits_applied`.
     */
    public data object CreditsApplied : InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc() {
        public override val `value`: String = "credits_applied"
    }

    /**
     * Documented value. Wire value: `credits_expired`.
     */
    public data object CreditsExpired : InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc() {
        public override val `value`: String = "credits_expired"
    }

    /**
     * Documented value. Wire value: `credits_voided`.
     */
    public data object CreditsVoided : InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc() {
        public override val `value`: String = "credits_voided"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc =
            when (value) {
                CreditsApplied.value -> CreditsApplied
                CreditsExpired.value -> CreditsExpired
                CreditsVoided.value -> CreditsVoided
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingCreditGrantsResourceBalanceDebitTypeX2282ffcc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

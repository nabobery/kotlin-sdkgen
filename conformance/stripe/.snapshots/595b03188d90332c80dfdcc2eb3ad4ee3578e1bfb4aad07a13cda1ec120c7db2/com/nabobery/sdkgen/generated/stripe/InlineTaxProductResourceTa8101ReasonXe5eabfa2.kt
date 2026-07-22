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
 * Details on why we couldn't commit the tax transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_association_transaction_attempts_resource_e
 * rrored/properties/reason
 */
@Serializable(with = InlineTaxProductResourceTa8101ReasonXe5eabfa2.Serializer::class)
public sealed class InlineTaxProductResourceTa8101ReasonXe5eabfa2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `another_payment_associated_with_calculation`.
     */
    public data object AnotherPaymentAssociatedWithCalculation : InlineTaxProductResourceTa8101ReasonXe5eabfa2() {
        public override val `value`: String = "another_payment_associated_with_calculation"
    }

    /**
     * Documented value. Wire value: `calculation_expired`.
     */
    public data object CalculationExpired : InlineTaxProductResourceTa8101ReasonXe5eabfa2() {
        public override val `value`: String = "calculation_expired"
    }

    /**
     * Documented value. Wire value: `currency_mismatch`.
     */
    public data object CurrencyMismatch : InlineTaxProductResourceTa8101ReasonXe5eabfa2() {
        public override val `value`: String = "currency_mismatch"
    }

    /**
     * Documented value. Wire value: `original_transaction_voided`.
     */
    public data object OriginalTransactionVoided : InlineTaxProductResourceTa8101ReasonXe5eabfa2() {
        public override val `value`: String = "original_transaction_voided"
    }

    /**
     * Documented value. Wire value: `unique_reference_violation`.
     */
    public data object UniqueReferenceViolation : InlineTaxProductResourceTa8101ReasonXe5eabfa2() {
        public override val `value`: String = "unique_reference_violation"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductResourceTa8101ReasonXe5eabfa2()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxProductResourceTa8101ReasonXe5eabfa2 =
            when (value) {
                AnotherPaymentAssociatedWithCalculation.value -> AnotherPaymentAssociatedWithCalculation
                CalculationExpired.value -> CalculationExpired
                CurrencyMismatch.value -> CurrencyMismatch
                OriginalTransactionVoided.value -> OriginalTransactionVoided
                UniqueReferenceViolation.value -> UniqueReferenceViolation
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductResourceTa8101ReasonXe5eabfa2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceTa8101ReasonXe5eabfa2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTaxProductResourceTa8101ReasonXe5eabfa2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductResourceTa8101ReasonXe5eabfa2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

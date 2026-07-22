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
 * The enum that describes the dispute loss outcome. If the dispute is not lost, this field will be absent. New enum
 * values may be added in the future, so be sure to handle unknown values.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.dispute/properties/loss_reason
 */
@Serializable(with = InlineIssuingDisputeLossReasonXaa48fc42.Serializer::class)
public sealed class InlineIssuingDisputeLossReasonXaa48fc42 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cardholder_authentication_issuer_liability`.
     */
    public data object CardholderAuthenticationIssuerLiability : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "cardholder_authentication_issuer_liability"
    }

    /**
     * Documented value. Wire value: `eci5_token_transaction_with_tavv`.
     */
    public data object Eci5TokenTransactionWithTavv : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "eci5_token_transaction_with_tavv"
    }

    /**
     * Documented value. Wire value: `excess_disputes_in_timeframe`.
     */
    public data object ExcessDisputesInTimeframe : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "excess_disputes_in_timeframe"
    }

    /**
     * Documented value. Wire value: `has_not_met_the_minimum_dispute_amount_requirements`.
     */
    public data object HasNotMetTheMinimumDisputeAmountRequirements : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "has_not_met_the_minimum_dispute_amount_requirements"
    }

    /**
     * Documented value. Wire value: `invalid_duplicate_dispute`.
     */
    public data object InvalidDuplicateDispute : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "invalid_duplicate_dispute"
    }

    /**
     * Documented value. Wire value: `invalid_incorrect_amount_dispute`.
     */
    public data object InvalidIncorrectAmountDispute : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "invalid_incorrect_amount_dispute"
    }

    /**
     * Documented value. Wire value: `invalid_no_authorization`.
     */
    public data object InvalidNoAuthorization : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "invalid_no_authorization"
    }

    /**
     * Documented value. Wire value: `invalid_use_of_disputes`.
     */
    public data object InvalidUseOfDisputes : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "invalid_use_of_disputes"
    }

    /**
     * Documented value. Wire value: `merchandise_delivered_or_shipped`.
     */
    public data object MerchandiseDeliveredOrShipped : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "merchandise_delivered_or_shipped"
    }

    /**
     * Documented value. Wire value: `merchandise_or_service_as_described`.
     */
    public data object MerchandiseOrServiceAsDescribed : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "merchandise_or_service_as_described"
    }

    /**
     * Documented value. Wire value: `not_cancelled`.
     */
    public data object NotCancelled : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "not_cancelled"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `refund_issued`.
     */
    public data object RefundIssued : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "refund_issued"
    }

    /**
     * Documented value. Wire value: `submitted_beyond_allowable_time_limit`.
     */
    public data object SubmittedBeyondAllowableTimeLimit : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "submitted_beyond_allowable_time_limit"
    }

    /**
     * Documented value. Wire value: `transaction_3ds_required`.
     */
    public data object Transaction3dsRequired : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "transaction_3ds_required"
    }

    /**
     * Documented value. Wire value: `transaction_approved_after_prior_fraud_dispute`.
     */
    public data object TransactionApprovedAfterPriorFraudDispute : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "transaction_approved_after_prior_fraud_dispute"
    }

    /**
     * Documented value. Wire value: `transaction_authorized`.
     */
    public data object TransactionAuthorized : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "transaction_authorized"
    }

    /**
     * Documented value. Wire value: `transaction_electronically_read`.
     */
    public data object TransactionElectronicallyRead : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "transaction_electronically_read"
    }

    /**
     * Documented value. Wire value: `transaction_qualifies_for_visa_easy_payment_service`.
     */
    public data object TransactionQualifiesForVisaEasyPaymentService : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "transaction_qualifies_for_visa_easy_payment_service"
    }

    /**
     * Documented value. Wire value: `transaction_unattended`.
     */
    public data object TransactionUnattended : InlineIssuingDisputeLossReasonXaa48fc42() {
        public override val `value`: String = "transaction_unattended"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineIssuingDisputeLossReasonXaa48fc42()

    public companion object {
        public fun fromValue(`value`: String): InlineIssuingDisputeLossReasonXaa48fc42 =
            when (value) {
                CardholderAuthenticationIssuerLiability.value -> CardholderAuthenticationIssuerLiability
                Eci5TokenTransactionWithTavv.value -> Eci5TokenTransactionWithTavv
                ExcessDisputesInTimeframe.value -> ExcessDisputesInTimeframe
                HasNotMetTheMinimumDisputeAmountRequirements.value -> HasNotMetTheMinimumDisputeAmountRequirements
                InvalidDuplicateDispute.value -> InvalidDuplicateDispute
                InvalidIncorrectAmountDispute.value -> InvalidIncorrectAmountDispute
                InvalidNoAuthorization.value -> InvalidNoAuthorization
                InvalidUseOfDisputes.value -> InvalidUseOfDisputes
                MerchandiseDeliveredOrShipped.value -> MerchandiseDeliveredOrShipped
                MerchandiseOrServiceAsDescribed.value -> MerchandiseOrServiceAsDescribed
                NotCancelled.value -> NotCancelled
                Other.value -> Other
                RefundIssued.value -> RefundIssued
                SubmittedBeyondAllowableTimeLimit.value -> SubmittedBeyondAllowableTimeLimit
                Transaction3dsRequired.value -> Transaction3dsRequired
                TransactionApprovedAfterPriorFraudDispute.value -> TransactionApprovedAfterPriorFraudDispute
                TransactionAuthorized.value -> TransactionAuthorized
                TransactionElectronicallyRead.value -> TransactionElectronicallyRead
                TransactionQualifiesForVisaEasyPaymentService.value -> TransactionQualifiesForVisaEasyPaymentService
                TransactionUnattended.value -> TransactionUnattended
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineIssuingDisputeLossReasonXaa48fc42> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineIssuingDisputeLossReasonXaa48fc42",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineIssuingDisputeLossReasonXaa48fc42 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingDisputeLossReasonXaa48fc42,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

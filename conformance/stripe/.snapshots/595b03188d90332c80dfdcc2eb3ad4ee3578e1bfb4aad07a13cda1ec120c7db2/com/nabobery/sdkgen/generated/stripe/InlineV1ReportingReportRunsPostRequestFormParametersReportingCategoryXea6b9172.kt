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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/parameters/properties/reporting_category.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/parameters/properties/reporting_category
 */
@Serializable(with = InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172.Serializer::class)
public sealed class InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `advance`.
     */
    public data object Advance : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "advance"
    }

    /**
     * Documented value. Wire value: `advance_funding`.
     */
    public data object AdvanceFunding : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "advance_funding"
    }

    /**
     * Documented value. Wire value: `anticipation_repayment`.
     */
    public data object AnticipationRepayment : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "anticipation_repayment"
    }

    /**
     * Documented value. Wire value: `charge`.
     */
    public data object Charge : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "charge"
    }

    /**
     * Documented value. Wire value: `charge_failure`.
     */
    public data object ChargeFailure : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "charge_failure"
    }

    /**
     * Documented value. Wire value: `climate_order_purchase`.
     */
    public data object ClimateOrderPurchase : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "climate_order_purchase"
    }

    /**
     * Documented value. Wire value: `climate_order_refund`.
     */
    public data object ClimateOrderRefund : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "climate_order_refund"
    }

    /**
     * Documented value. Wire value: `connect_collection_transfer`.
     */
    public data object ConnectCollectionTransfer : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "connect_collection_transfer"
    }

    /**
     * Documented value. Wire value: `connect_reserved_funds`.
     */
    public data object ConnectReservedFunds : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "connect_reserved_funds"
    }

    /**
     * Documented value. Wire value: `contribution`.
     */
    public data object Contribution : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "contribution"
    }

    /**
     * Documented value. Wire value: `dispute`.
     */
    public data object Dispute : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "dispute"
    }

    /**
     * Documented value. Wire value: `dispute_reversal`.
     */
    public data object DisputeReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "dispute_reversal"
    }

    /**
     * Documented value. Wire value: `fee`.
     */
    public data object Fee : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "fee"
    }

    /**
     * Documented value. Wire value: `financing_paydown`.
     */
    public data object FinancingPaydown : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "financing_paydown"
    }

    /**
     * Documented value. Wire value: `financing_paydown_reversal`.
     */
    public data object FinancingPaydownReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "financing_paydown_reversal"
    }

    /**
     * Documented value. Wire value: `financing_payout`.
     */
    public data object FinancingPayout : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "financing_payout"
    }

    /**
     * Documented value. Wire value: `financing_payout_reversal`.
     */
    public data object FinancingPayoutReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "financing_payout_reversal"
    }

    /**
     * Documented value. Wire value: `issuing_authorization_hold`.
     */
    public data object IssuingAuthorizationHold : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "issuing_authorization_hold"
    }

    /**
     * Documented value. Wire value: `issuing_authorization_release`.
     */
    public data object IssuingAuthorizationRelease : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "issuing_authorization_release"
    }

    /**
     * Documented value. Wire value: `issuing_dispute`.
     */
    public data object IssuingDispute : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "issuing_dispute"
    }

    /**
     * Documented value. Wire value: `issuing_transaction`.
     */
    public data object IssuingTransaction : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "issuing_transaction"
    }

    /**
     * Documented value. Wire value: `network_cost`.
     */
    public data object NetworkCost : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "network_cost"
    }

    /**
     * Documented value. Wire value: `other_adjustment`.
     */
    public data object OtherAdjustment : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "other_adjustment"
    }

    /**
     * Documented value. Wire value: `partial_capture_reversal`.
     */
    public data object PartialCaptureReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "partial_capture_reversal"
    }

    /**
     * Documented value. Wire value: `payout`.
     */
    public data object Payout : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "payout"
    }

    /**
     * Documented value. Wire value: `payout_reversal`.
     */
    public data object PayoutReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "payout_reversal"
    }

    /**
     * Documented value. Wire value: `platform_earning`.
     */
    public data object PlatformEarning : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "platform_earning"
    }

    /**
     * Documented value. Wire value: `platform_earning_refund`.
     */
    public data object PlatformEarningRefund : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "platform_earning_refund"
    }

    /**
     * Documented value. Wire value: `refund`.
     */
    public data object Refund : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "refund"
    }

    /**
     * Documented value. Wire value: `refund_failure`.
     */
    public data object RefundFailure : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "refund_failure"
    }

    /**
     * Documented value. Wire value: `risk_reserved_funds`.
     */
    public data object RiskReservedFunds : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "risk_reserved_funds"
    }

    /**
     * Documented value. Wire value: `tax`.
     */
    public data object Tax : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "tax"
    }

    /**
     * Documented value. Wire value: `topup`.
     */
    public data object Topup : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "topup"
    }

    /**
     * Documented value. Wire value: `topup_reversal`.
     */
    public data object TopupReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "topup_reversal"
    }

    /**
     * Documented value. Wire value: `transfer`.
     */
    public data object Transfer : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "transfer"
    }

    /**
     * Documented value. Wire value: `transfer_reversal`.
     */
    public data object TransferReversal : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "transfer_reversal"
    }

    /**
     * Documented value. Wire value: `unreconciled_customer_funds`.
     */
    public data object UnreconciledCustomerFunds : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172() {
        public override val `value`: String = "unreconciled_customer_funds"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172 =
            when (value) {
                Advance.value -> Advance
                AdvanceFunding.value -> AdvanceFunding
                AnticipationRepayment.value -> AnticipationRepayment
                Charge.value -> Charge
                ChargeFailure.value -> ChargeFailure
                ClimateOrderPurchase.value -> ClimateOrderPurchase
                ClimateOrderRefund.value -> ClimateOrderRefund
                ConnectCollectionTransfer.value -> ConnectCollectionTransfer
                ConnectReservedFunds.value -> ConnectReservedFunds
                Contribution.value -> Contribution
                Dispute.value -> Dispute
                DisputeReversal.value -> DisputeReversal
                Fee.value -> Fee
                FinancingPaydown.value -> FinancingPaydown
                FinancingPaydownReversal.value -> FinancingPaydownReversal
                FinancingPayout.value -> FinancingPayout
                FinancingPayoutReversal.value -> FinancingPayoutReversal
                IssuingAuthorizationHold.value -> IssuingAuthorizationHold
                IssuingAuthorizationRelease.value -> IssuingAuthorizationRelease
                IssuingDispute.value -> IssuingDispute
                IssuingTransaction.value -> IssuingTransaction
                NetworkCost.value -> NetworkCost
                OtherAdjustment.value -> OtherAdjustment
                PartialCaptureReversal.value -> PartialCaptureReversal
                Payout.value -> Payout
                PayoutReversal.value -> PayoutReversal
                PlatformEarning.value -> PlatformEarning
                PlatformEarningRefund.value -> PlatformEarningRefund
                Refund.value -> Refund
                RefundFailure.value -> RefundFailure
                RiskReservedFunds.value -> RiskReservedFunds
                Tax.value -> Tax
                Topup.value -> Topup
                TopupReversal.value -> TopupReversal
                Transfer.value -> Transfer
                TransferReversal.value -> TransferReversal
                UnreconciledCustomerFunds.value -> UnreconciledCustomerFunds
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

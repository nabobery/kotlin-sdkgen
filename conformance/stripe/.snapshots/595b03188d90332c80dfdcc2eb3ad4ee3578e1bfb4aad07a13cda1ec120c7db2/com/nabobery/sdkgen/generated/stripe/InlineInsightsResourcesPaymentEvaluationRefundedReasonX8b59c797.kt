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
 * Indicates the reason for the refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_refunded/properties/reason
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `duplicate`.
     */
    public data object Duplicate : InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797() {
        public override val `value`: String = "duplicate"
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `requested_by_customer`.
     */
    public data object RequestedByCustomer : InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797() {
        public override val `value`: String = "requested_by_customer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797()

    public companion object {
        public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797 =
            when (value) {
                Duplicate.value -> Duplicate
                Fraudulent.value -> Fraudulent
                Other.value -> Other
                RequestedByCustomer.value -> RequestedByCustomer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInsightsResourcesPaymentEvaluationRefundedReasonX8b59c797,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

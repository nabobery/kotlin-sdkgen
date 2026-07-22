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
 * Indicates the type of event attached to the payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_event/properties/type
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `dispute_opened`.
     */
    public data object DisputeOpened : InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d() {
        public override val `value`: String = "dispute_opened"
    }

    /**
     * Documented value. Wire value: `early_fraud_warning_received`.
     */
    public data object EarlyFraudWarningReceived : InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d() {
        public override val `value`: String = "early_fraud_warning_received"
    }

    /**
     * Documented value. Wire value: `refunded`.
     */
    public data object Refunded : InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d() {
        public override val `value`: String = "refunded"
    }

    /**
     * Documented value. Wire value: `user_intervention_raised`.
     */
    public data object UserInterventionRaised : InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d() {
        public override val `value`: String = "user_intervention_raised"
    }

    /**
     * Documented value. Wire value: `user_intervention_resolved`.
     */
    public data object UserInterventionResolved : InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d() {
        public override val `value`: String = "user_intervention_resolved"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d()

    public companion object {
        public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d =
            when (value) {
                DisputeOpened.value -> DisputeOpened
                EarlyFraudWarningReceived.value -> EarlyFraudWarningReceived
                Refunded.value -> Refunded
                UserInterventionRaised.value -> UserInterventionRaised
                UserInterventionResolved.value -> UserInterventionResolved
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInsightsResourcesPaymentEvaluationEventTypeX223d690d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

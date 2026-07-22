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
 * Type of user intervention raised.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_user_intervention_raised/prope
 * rties/type
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `3ds`.
     */
    public data object _3ds : InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a() {
        public override val `value`: String = "3ds"
    }

    /**
     * Documented value. Wire value: `captcha`.
     */
    public data object Captcha : InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a() {
        public override val `value`: String = "captcha"
    }

    /**
     * Documented value. Wire value: `custom`.
     */
    public data object Custom : InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a() {
        public override val `value`: String = "custom"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a =
            when (value) {
                _3ds.value -> _3ds
                Captcha.value -> Captcha
                Custom.value -> Custom
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInsightsResourcesPaymentEvaluationUserInterventionRaisedTypeXe03c7f0a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

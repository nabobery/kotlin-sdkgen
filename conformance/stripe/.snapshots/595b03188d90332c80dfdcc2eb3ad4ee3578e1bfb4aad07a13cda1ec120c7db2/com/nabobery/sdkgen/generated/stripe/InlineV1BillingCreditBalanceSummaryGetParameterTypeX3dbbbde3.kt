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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema/properties/type
 */
@Serializable(with = InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3.Serializer::class)
public sealed class InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `applicability_scope`.
     */
    public data object ApplicabilityScope : InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3() {
        public override val `value`: String = "applicability_scope"
    }

    /**
     * Documented value. Wire value: `credit_grant`.
     */
    public data object CreditGrant : InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3() {
        public override val `value`: String = "credit_grant"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3 =
            when (value) {
                ApplicabilityScope.value -> ApplicabilityScope
                CreditGrant.value -> CreditGrant
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema/properties/applicab
 * ility_scope/properties/price_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema/properties/applicab
 * ility_scope/properties/price_type
 */
@Serializable(with = InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7.Serializer::class)
public sealed class InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `metered`.
     */
    public data object Metered : InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7() {
        public override val `value`: String = "metered"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7 =
            when (value) {
                Metered.value -> Metered
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

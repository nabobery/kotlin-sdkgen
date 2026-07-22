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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/mode
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa.Serializer::class)
public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `at_period_end`.
     */
    public data object AtPeriodEnd : InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa() {
        public override val `value`: String = "at_period_end"
    }

    /**
     * Documented value. Wire value: `immediately`.
     */
    public data object Immediately : InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa() {
        public override val `value`: String = "immediately"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa()

    public companion object {
        public fun fromValue(`value`: String): InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa =
            when (value) {
                AtPeriodEnd.value -> AtPeriodEnd
                Immediately.value -> Immediately
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX5654b5aa,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

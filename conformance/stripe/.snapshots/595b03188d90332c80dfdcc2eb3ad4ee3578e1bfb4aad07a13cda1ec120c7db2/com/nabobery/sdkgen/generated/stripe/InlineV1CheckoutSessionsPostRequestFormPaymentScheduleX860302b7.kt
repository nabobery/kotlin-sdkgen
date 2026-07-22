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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/payment_sche
 * dule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/payment_sche
 * dule
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `combined`.
     */
    public data object Combined : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7() {
        public override val `value`: String = "combined"
    }

    /**
     * Documented value. Wire value: `interval`.
     */
    public data object Interval : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7() {
        public override val `value`: String = "interval"
    }

    /**
     * Documented value. Wire value: `sporadic`.
     */
    public data object Sporadic : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7() {
        public override val `value`: String = "sporadic"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7 =
            when (value) {
                Combined.value -> Combined
                Interval.value -> Interval
                Sporadic.value -> Sporadic
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX860302b7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

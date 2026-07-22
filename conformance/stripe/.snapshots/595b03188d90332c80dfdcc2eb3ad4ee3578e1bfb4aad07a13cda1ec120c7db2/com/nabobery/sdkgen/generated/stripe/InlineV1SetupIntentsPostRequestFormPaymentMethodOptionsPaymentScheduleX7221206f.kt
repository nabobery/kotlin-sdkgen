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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/payment_schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/payment_schedule
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `combined`.
     */
    public data object Combined : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f() {
        public override val `value`: String = "combined"
    }

    /**
     * Documented value. Wire value: `interval`.
     */
    public data object Interval : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f() {
        public override val `value`: String = "interval"
    }

    /**
     * Documented value. Wire value: `sporadic`.
     */
    public data object Sporadic : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f() {
        public override val `value`: String = "sporadic"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f =
            when (value) {
                Combined.value -> Combined
                Interval.value -> Interval
                Sporadic.value -> Sporadic
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

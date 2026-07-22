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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/payme
 * nt_schedule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/payme
 * nt_schedule
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `halfyearly`.
     */
    public data object Halfyearly : InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c() {
        public override val `value`: String = "halfyearly"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `quarterly`.
     */
    public data object Quarterly : InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c() {
        public override val `value`: String = "quarterly"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c() {
        public override val `value`: String = "weekly"
    }

    /**
     * Documented value. Wire value: `yearly`.
     */
    public data object Yearly : InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c() {
        public override val `value`: String = "yearly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c =
            when (value) {
                Halfyearly.value -> Halfyearly
                Monthly.value -> Monthly
                Quarterly.value -> Quarterly
                Weekly.value -> Weekly
                Yearly.value -> Yearly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentScheduleX5ee9385c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

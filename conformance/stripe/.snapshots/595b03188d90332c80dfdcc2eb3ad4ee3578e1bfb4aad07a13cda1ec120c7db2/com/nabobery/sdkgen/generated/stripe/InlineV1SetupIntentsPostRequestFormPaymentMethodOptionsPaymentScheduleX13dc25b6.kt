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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payment_sche
 * dule.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payment_sche
 * dule
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `adhoc`.
     */
    public data object Adhoc : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "adhoc"
    }

    /**
     * Documented value. Wire value: `annual`.
     */
    public data object Annual : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "annual"
    }

    /**
     * Documented value. Wire value: `daily`.
     */
    public data object Daily : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "daily"
    }

    /**
     * Documented value. Wire value: `fortnightly`.
     */
    public data object Fortnightly : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "fortnightly"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `quarterly`.
     */
    public data object Quarterly : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "quarterly"
    }

    /**
     * Documented value. Wire value: `semi_annual`.
     */
    public data object SemiAnnual : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "semi_annual"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6() {
        public override val `value`: String = "weekly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6 =
            when (value) {
                Value.value -> Value
                Adhoc.value -> Adhoc
                Annual.value -> Annual
                Daily.value -> Daily
                Fortnightly.value -> Fortnightly
                Monthly.value -> Monthly
                Quarterly.value -> Quarterly
                SemiAnnual.value -> SemiAnnual
                Weekly.value -> Weekly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX13dc25b6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

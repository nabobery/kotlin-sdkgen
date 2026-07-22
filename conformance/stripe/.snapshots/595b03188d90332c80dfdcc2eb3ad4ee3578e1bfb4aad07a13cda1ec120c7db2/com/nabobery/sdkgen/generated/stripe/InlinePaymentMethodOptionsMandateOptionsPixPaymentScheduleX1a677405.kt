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
 * Schedule at which the future payments will be charged.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_mandate_options_pix/properties/payment_schedu
 * le
 */
@Serializable(with = InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405.Serializer::class)
public sealed class InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `halfyearly`.
     */
    public data object Halfyearly : InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405() {
        public override val `value`: String = "halfyearly"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `quarterly`.
     */
    public data object Quarterly : InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405() {
        public override val `value`: String = "quarterly"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405() {
        public override val `value`: String = "weekly"
    }

    /**
     * Documented value. Wire value: `yearly`.
     */
    public data object Yearly : InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405() {
        public override val `value`: String = "yearly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405 =
            when (value) {
                Halfyearly.value -> Halfyearly
                Monthly.value -> Monthly
                Quarterly.value -> Quarterly
                Weekly.value -> Weekly
                Yearly.value -> Yearly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsMandateOptionsPixPaymentScheduleX1a677405,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

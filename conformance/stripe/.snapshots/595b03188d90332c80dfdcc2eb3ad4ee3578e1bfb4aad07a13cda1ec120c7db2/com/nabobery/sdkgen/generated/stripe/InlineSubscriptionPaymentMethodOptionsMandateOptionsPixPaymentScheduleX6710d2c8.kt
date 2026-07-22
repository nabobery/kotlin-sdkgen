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
 * sdkgen://source/openapi.json#/components/schemas/subscription_payment_method_options_mandate_options_pix/properties/p
 * ayment_schedule
 */
@Serializable(with = InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8.Serializer::class)
public sealed class InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `halfyearly`.
     */
    public data object Halfyearly : InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8() {
        public override val `value`: String = "halfyearly"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `quarterly`.
     */
    public data object Quarterly : InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8() {
        public override val `value`: String = "quarterly"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8() {
        public override val `value`: String = "weekly"
    }

    /**
     * Documented value. Wire value: `yearly`.
     */
    public data object Yearly : InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8() {
        public override val `value`: String = "yearly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8 =
            when (value) {
                Halfyearly.value -> Halfyearly
                Monthly.value -> Monthly
                Quarterly.value -> Quarterly
                Weekly.value -> Weekly
                Yearly.value -> Yearly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionPaymentMethodOptionsMandateOptionsPixPaymentScheduleX6710d2c8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

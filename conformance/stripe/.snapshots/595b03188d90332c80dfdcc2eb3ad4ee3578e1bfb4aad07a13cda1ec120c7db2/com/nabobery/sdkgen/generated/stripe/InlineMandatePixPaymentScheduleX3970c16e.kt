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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_pix/properties/payment_schedule
 */
@Serializable(with = InlineMandatePixPaymentScheduleX3970c16e.Serializer::class)
public sealed class InlineMandatePixPaymentScheduleX3970c16e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `halfyearly`.
     */
    public data object Halfyearly : InlineMandatePixPaymentScheduleX3970c16e() {
        public override val `value`: String = "halfyearly"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlineMandatePixPaymentScheduleX3970c16e() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `quarterly`.
     */
    public data object Quarterly : InlineMandatePixPaymentScheduleX3970c16e() {
        public override val `value`: String = "quarterly"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlineMandatePixPaymentScheduleX3970c16e() {
        public override val `value`: String = "weekly"
    }

    /**
     * Documented value. Wire value: `yearly`.
     */
    public data object Yearly : InlineMandatePixPaymentScheduleX3970c16e() {
        public override val `value`: String = "yearly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineMandatePixPaymentScheduleX3970c16e()

    public companion object {
        public fun fromValue(`value`: String): InlineMandatePixPaymentScheduleX3970c16e =
            when (value) {
                Halfyearly.value -> Halfyearly
                Monthly.value -> Monthly
                Quarterly.value -> Quarterly
                Weekly.value -> Weekly
                Yearly.value -> Yearly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineMandatePixPaymentScheduleX3970c16e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineMandatePixPaymentScheduleX3970c16e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineMandatePixPaymentScheduleX3970c16e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineMandatePixPaymentScheduleX3970c16e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

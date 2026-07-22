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
 * Payment schedule for the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_mandate_options/properties/payment_schedule
 */
@Serializable(with = InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4.Serializer::class)
public sealed class InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `combined`.
     */
    public data object Combined : InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4() {
        public override val `value`: String = "combined"
    }

    /**
     * Documented value. Wire value: `interval`.
     */
    public data object Interval : InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4() {
        public override val `value`: String = "interval"
    }

    /**
     * Documented value. Wire value: `sporadic`.
     */
    public data object Sporadic : InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4() {
        public override val `value`: String = "sporadic"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4 =
            when (value) {
                Combined.value -> Combined
                Interval.value -> Interval
                Sporadic.value -> Sporadic
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutAcssDebitMandateOptionsPaymentScheduleXfdc125d4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

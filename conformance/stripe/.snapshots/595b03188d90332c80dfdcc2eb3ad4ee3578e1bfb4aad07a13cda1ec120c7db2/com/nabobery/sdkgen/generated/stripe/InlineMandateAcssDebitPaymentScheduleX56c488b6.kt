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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_acss_debit/properties/payment_schedule
 */
@Serializable(with = InlineMandateAcssDebitPaymentScheduleX56c488b6.Serializer::class)
public sealed class InlineMandateAcssDebitPaymentScheduleX56c488b6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `combined`.
     */
    public data object Combined : InlineMandateAcssDebitPaymentScheduleX56c488b6() {
        public override val `value`: String = "combined"
    }

    /**
     * Documented value. Wire value: `interval`.
     */
    public data object Interval : InlineMandateAcssDebitPaymentScheduleX56c488b6() {
        public override val `value`: String = "interval"
    }

    /**
     * Documented value. Wire value: `sporadic`.
     */
    public data object Sporadic : InlineMandateAcssDebitPaymentScheduleX56c488b6() {
        public override val `value`: String = "sporadic"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineMandateAcssDebitPaymentScheduleX56c488b6()

    public companion object {
        public fun fromValue(`value`: String): InlineMandateAcssDebitPaymentScheduleX56c488b6 =
            when (value) {
                Combined.value -> Combined
                Interval.value -> Interval
                Sporadic.value -> Sporadic
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineMandateAcssDebitPaymentScheduleX56c488b6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineMandateAcssDebitPaymentScheduleX56c488b6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineMandateAcssDebitPaymentScheduleX56c488b6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineMandateAcssDebitPaymentScheduleX56c488b6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

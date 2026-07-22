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
 * The time window which meter events have been pre-aggregated for, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter/properties/event_time_window
 */
@Serializable(with = InlineBillingMeterEventTimeWindowX21f9c1a1.Serializer::class)
public sealed class InlineBillingMeterEventTimeWindowX21f9c1a1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineBillingMeterEventTimeWindowX21f9c1a1() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `hour`.
     */
    public data object Hour : InlineBillingMeterEventTimeWindowX21f9c1a1() {
        public override val `value`: String = "hour"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingMeterEventTimeWindowX21f9c1a1()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingMeterEventTimeWindowX21f9c1a1 =
            when (value) {
                Day.value -> Day
                Hour.value -> Hour
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingMeterEventTimeWindowX21f9c1a1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingMeterEventTimeWindowX21f9c1a1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingMeterEventTimeWindowX21f9c1a1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingMeterEventTimeWindowX21f9c1a1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

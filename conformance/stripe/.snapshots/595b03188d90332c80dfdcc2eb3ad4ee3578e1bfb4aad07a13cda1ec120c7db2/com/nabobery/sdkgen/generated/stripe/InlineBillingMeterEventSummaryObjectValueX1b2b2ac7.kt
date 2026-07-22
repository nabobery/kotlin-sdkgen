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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_summary/properties/object
 */
@Serializable(with = InlineBillingMeterEventSummaryObjectValueX1b2b2ac7.Serializer::class)
public sealed class InlineBillingMeterEventSummaryObjectValueX1b2b2ac7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `billing.meter_event_summary`.
     */
    public data object BillingMeterEventSummary : InlineBillingMeterEventSummaryObjectValueX1b2b2ac7() {
        public override val `value`: String = "billing.meter_event_summary"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingMeterEventSummaryObjectValueX1b2b2ac7()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingMeterEventSummaryObjectValueX1b2b2ac7 =
            when (value) {
                BillingMeterEventSummary.value -> BillingMeterEventSummary
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingMeterEventSummaryObjectValueX1b2b2ac7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingMeterEventSummaryObjectValueX1b2b2ac7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingMeterEventSummaryObjectValueX1b2b2ac7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingMeterEventSummaryObjectValueX1b2b2ac7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

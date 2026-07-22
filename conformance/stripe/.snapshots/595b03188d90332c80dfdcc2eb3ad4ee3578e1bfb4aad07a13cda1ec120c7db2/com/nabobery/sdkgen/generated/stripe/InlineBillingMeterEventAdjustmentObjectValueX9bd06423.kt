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
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.meter_event_adjustment/properties/object
 */
@Serializable(with = InlineBillingMeterEventAdjustmentObjectValueX9bd06423.Serializer::class)
public sealed class InlineBillingMeterEventAdjustmentObjectValueX9bd06423 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `billing.meter_event_adjustment`.
     */
    public data object BillingMeterEventAdjustment : InlineBillingMeterEventAdjustmentObjectValueX9bd06423() {
        public override val `value`: String = "billing.meter_event_adjustment"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingMeterEventAdjustmentObjectValueX9bd06423()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingMeterEventAdjustmentObjectValueX9bd06423 =
            when (value) {
                BillingMeterEventAdjustment.value -> BillingMeterEventAdjustment
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingMeterEventAdjustmentObjectValueX9bd06423> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingMeterEventAdjustmentObjectValueX9bd06423",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingMeterEventAdjustmentObjectValueX9bd06423 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingMeterEventAdjustmentObjectValueX9bd06423,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

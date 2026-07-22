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
 * Specifies how events are aggregated.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_aggregation_settings/properties/formula
 */
@Serializable(with = InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6.Serializer::class)
public sealed class InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `count`.
     */
    public data object Count : InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6() {
        public override val `value`: String = "count"
    }

    /**
     * Documented value. Wire value: `last`.
     */
    public data object Last : InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6() {
        public override val `value`: String = "last"
    }

    /**
     * Documented value. Wire value: `sum`.
     */
    public data object Sum : InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6() {
        public override val `value`: String = "sum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6 =
            when (value) {
                Count.value -> Count
                Last.value -> Last
                Sum.value -> Sum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

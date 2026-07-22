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
 * Select how to calculate the end of the invoice item period.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_invoice_item_period_resource_period_
 * end/properties/type
 */
@Serializable(with = InlineSubscriptionScheduleb51cTypeX539790cb.Serializer::class)
public sealed class InlineSubscriptionScheduleb51cTypeX539790cb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `min_item_period_end`.
     */
    public data object MinItemPeriodEnd : InlineSubscriptionScheduleb51cTypeX539790cb() {
        public override val `value`: String = "min_item_period_end"
    }

    /**
     * Documented value. Wire value: `phase_end`.
     */
    public data object PhaseEnd : InlineSubscriptionScheduleb51cTypeX539790cb() {
        public override val `value`: String = "phase_end"
    }

    /**
     * Documented value. Wire value: `timestamp`.
     */
    public data object Timestamp : InlineSubscriptionScheduleb51cTypeX539790cb() {
        public override val `value`: String = "timestamp"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSubscriptionScheduleb51cTypeX539790cb()

    public companion object {
        public fun fromValue(`value`: String): InlineSubscriptionScheduleb51cTypeX539790cb =
            when (value) {
                MinItemPeriodEnd.value -> MinItemPeriodEnd
                PhaseEnd.value -> PhaseEnd
                Timestamp.value -> Timestamp
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSubscriptionScheduleb51cTypeX539790cb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSubscriptionScheduleb51cTypeX539790cb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleb51cTypeX539790cb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionScheduleb51cTypeX539790cb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

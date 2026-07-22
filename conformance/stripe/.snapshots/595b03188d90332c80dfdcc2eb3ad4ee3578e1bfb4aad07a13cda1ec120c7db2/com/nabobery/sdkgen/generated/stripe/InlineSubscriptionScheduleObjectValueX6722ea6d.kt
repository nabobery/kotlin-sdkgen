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
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule/properties/object
 */
@Serializable(with = InlineSubscriptionScheduleObjectValueX6722ea6d.Serializer::class)
public sealed class InlineSubscriptionScheduleObjectValueX6722ea6d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `subscription_schedule`.
     */
    public data object SubscriptionSchedule : InlineSubscriptionScheduleObjectValueX6722ea6d() {
        public override val `value`: String = "subscription_schedule"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSubscriptionScheduleObjectValueX6722ea6d()

    public companion object {
        public fun fromValue(`value`: String): InlineSubscriptionScheduleObjectValueX6722ea6d =
            when (value) {
                SubscriptionSchedule.value -> SubscriptionSchedule
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSubscriptionScheduleObjectValueX6722ea6d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSubscriptionScheduleObjectValueX6722ea6d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleObjectValueX6722ea6d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionScheduleObjectValueX6722ea6d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

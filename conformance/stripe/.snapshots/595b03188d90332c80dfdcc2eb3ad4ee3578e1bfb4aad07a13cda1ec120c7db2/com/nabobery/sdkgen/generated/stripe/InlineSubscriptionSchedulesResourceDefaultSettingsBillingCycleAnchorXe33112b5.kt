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
 * Possible values are `phase_start` or `automatic`. If `phase_start` then billing cycle anchor of the subscription is
 * set to the start of the phase when entering the phase. If `automatic` then the billing cycle anchor is automatically
 * modified as needed when entering the phase. For more information, see the billing cycle
 * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings/properties/billing_
 * cycle_anchor
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5.Serializer::class)
public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `phase_start`.
     */
    public data object PhaseStart : InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5() {
        public override val `value`: String = "phase_start"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5 =
            when (value) {
                Automatic.value -> Automatic
                PhaseStart.value -> PhaseStart
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

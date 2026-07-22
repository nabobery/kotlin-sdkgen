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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/interval
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `daily`.
     */
    public data object Daily : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52() {
        public override val `value`: String = "daily"
    }

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52() {
        public override val `value`: String = "manual"
    }

    /**
     * Documented value. Wire value: `monthly`.
     */
    public data object Monthly : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52() {
        public override val `value`: String = "monthly"
    }

    /**
     * Documented value. Wire value: `weekly`.
     */
    public data object Weekly : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52() {
        public override val `value`: String = "weekly"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52 =
            when (value) {
                Daily.value -> Daily
                Manual.value -> Manual
                Monthly.value -> Monthly
                Weekly.value -> Weekly
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleIntervalX7123fa52,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

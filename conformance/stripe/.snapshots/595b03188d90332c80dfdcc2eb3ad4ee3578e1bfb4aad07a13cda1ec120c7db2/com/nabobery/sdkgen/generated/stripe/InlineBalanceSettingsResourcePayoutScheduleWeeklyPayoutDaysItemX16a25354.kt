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
 * sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payout_schedule/properties/weekly_payout_d
 * ays/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payout_schedule/properties/weekly_payout_d
 * ays/items
 */
@Serializable(with = InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354.Serializer::class)
public sealed class InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `friday`.
     */
    public data object Friday : InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354() {
        public override val `value`: String = "friday"
    }

    /**
     * Documented value. Wire value: `monday`.
     */
    public data object Monday : InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354() {
        public override val `value`: String = "monday"
    }

    /**
     * Documented value. Wire value: `thursday`.
     */
    public data object Thursday : InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354() {
        public override val `value`: String = "thursday"
    }

    /**
     * Documented value. Wire value: `tuesday`.
     */
    public data object Tuesday : InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354() {
        public override val `value`: String = "tuesday"
    }

    /**
     * Documented value. Wire value: `wednesday`.
     */
    public data object Wednesday : InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354() {
        public override val `value`: String = "wednesday"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354 =
            when (value) {
                Friday.value -> Friday
                Monday.value -> Monday
                Thursday.value -> Thursday
                Tuesday.value -> Tuesday
                Wednesday.value -> Wednesday
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBalanceSettingsResourcePayoutScheduleWeeklyPayoutDaysItemX16a25354,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

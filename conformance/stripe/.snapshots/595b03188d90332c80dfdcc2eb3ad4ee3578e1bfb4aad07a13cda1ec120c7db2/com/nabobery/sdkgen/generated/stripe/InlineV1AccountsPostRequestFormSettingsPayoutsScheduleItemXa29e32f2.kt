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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule/properties/weekly_payout_days/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule/properties/weekly_payout_days/items
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `friday`.
     */
    public data object Friday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2() {
        public override val `value`: String = "friday"
    }

    /**
     * Documented value. Wire value: `monday`.
     */
    public data object Monday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2() {
        public override val `value`: String = "monday"
    }

    /**
     * Documented value. Wire value: `thursday`.
     */
    public data object Thursday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2() {
        public override val `value`: String = "thursday"
    }

    /**
     * Documented value. Wire value: `tuesday`.
     */
    public data object Tuesday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2() {
        public override val `value`: String = "tuesday"
    }

    /**
     * Documented value. Wire value: `wednesday`.
     */
    public data object Wednesday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2() {
        public override val `value`: String = "wednesday"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2 =
            when (value) {
                Friday.value -> Friday
                Monday.value -> Monday
                Thursday.value -> Thursday
                Tuesday.value -> Tuesday
                Wednesday.value -> Wednesday
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemXa29e32f2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

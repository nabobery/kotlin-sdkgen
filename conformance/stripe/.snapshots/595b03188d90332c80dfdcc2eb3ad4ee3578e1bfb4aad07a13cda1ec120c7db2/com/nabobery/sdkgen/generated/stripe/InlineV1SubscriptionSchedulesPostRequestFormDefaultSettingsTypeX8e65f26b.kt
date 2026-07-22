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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/automatic_tax/properties/liability/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/automatic_tax/properties/liability/properties/type
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `self`.
     */
    public data object Self : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b() {
        public override val `value`: String = "self"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b =
            when (value) {
                Account.value -> Account
                Self.value -> Self
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTypeX8e65f26b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

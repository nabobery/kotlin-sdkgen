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
 * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
 * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
 * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/end_behavior
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cancel`.
     */
    public data object Cancel : InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808() {
        public override val `value`: String = "cancel"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `release`.
     */
    public data object Release : InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808() {
        public override val `value`: String = "release"
    }

    /**
     * Documented value. Wire value: `renew`.
     */
    public data object Renew : InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808() {
        public override val `value`: String = "renew"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808 =
            when (value) {
                Cancel.value -> Cancel
                None.value -> None
                Release.value -> Release
                Renew.value -> Renew
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

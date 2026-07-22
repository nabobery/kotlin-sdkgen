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
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/price_data/properties/tax_behavi
 * or.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/price_data/properties/tax_behavi
 * or
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsTaxBehaviorX7a1d03ed,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

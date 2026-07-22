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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/recurring/properties/interva
 * l.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/recurring/properties/interva
 * l
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `month`.
     */
    public data object Month : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058() {
        public override val `value`: String = "month"
    }

    /**
     * Documented value. Wire value: `week`.
     */
    public data object Week : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058() {
        public override val `value`: String = "week"
    }

    /**
     * Documented value. Wire value: `year`.
     */
    public data object Year : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058() {
        public override val `value`: String = "year"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058 =
            when (value) {
                Day.value -> Day
                Month.value -> Month
                Week.value -> Week
                Year.value -> Year
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataRecurringIntervalX64ec8058,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

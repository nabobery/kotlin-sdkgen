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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/price_data/properties/recurring/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/price_data/properties/recurring/properties/interval
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `month`.
     */
    public data object Month : InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab() {
        public override val `value`: String = "month"
    }

    /**
     * Documented value. Wire value: `week`.
     */
    public data object Week : InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab() {
        public override val `value`: String = "week"
    }

    /**
     * Documented value. Wire value: `year`.
     */
    public data object Year : InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab() {
        public override val `value`: String = "year"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab =
            when (value) {
                Day.value -> Day
                Month.value -> Month
                Week.value -> Week
                Year.value -> Year
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringIntervalX785e72ab,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

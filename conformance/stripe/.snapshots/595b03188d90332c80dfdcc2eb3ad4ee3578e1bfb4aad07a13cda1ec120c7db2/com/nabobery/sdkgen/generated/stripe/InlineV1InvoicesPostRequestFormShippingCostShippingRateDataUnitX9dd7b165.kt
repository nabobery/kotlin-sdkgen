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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate/properties/minimum/properties/un
 * it.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate/properties/minimum/properties/un
 * it
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `business_day`.
     */
    public data object BusinessDay : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165() {
        public override val `value`: String = "business_day"
    }

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `hour`.
     */
    public data object Hour : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165() {
        public override val `value`: String = "hour"
    }

    /**
     * Documented value. Wire value: `month`.
     */
    public data object Month : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165() {
        public override val `value`: String = "month"
    }

    /**
     * Documented value. Wire value: `week`.
     */
    public data object Week : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165() {
        public override val `value`: String = "week"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165 =
            when (value) {
                BusinessDay.value -> BusinessDay
                Day.value -> Day
                Hour.value -> Hour
                Month.value -> Month
                Week.value -> Week
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

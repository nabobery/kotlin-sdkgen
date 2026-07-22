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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/duration/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/duration/properties/interval
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `day`.
     */
    public data object Day : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55() {
        public override val `value`: String = "day"
    }

    /**
     * Documented value. Wire value: `month`.
     */
    public data object Month : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55() {
        public override val `value`: String = "month"
    }

    /**
     * Documented value. Wire value: `week`.
     */
    public data object Week : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55() {
        public override val `value`: String = "week"
    }

    /**
     * Documented value. Wire value: `year`.
     */
    public data object Year : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55() {
        public override val `value`: String = "year"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55 =
            when (value) {
                Day.value -> Day
                Month.value -> Month
                Week.value -> Week
                Year.value -> Year
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

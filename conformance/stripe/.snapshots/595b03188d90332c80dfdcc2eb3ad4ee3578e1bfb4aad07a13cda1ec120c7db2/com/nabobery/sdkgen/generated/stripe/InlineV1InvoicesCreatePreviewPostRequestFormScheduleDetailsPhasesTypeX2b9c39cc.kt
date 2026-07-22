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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod/properties/start/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod/properties/start/properties/type
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `max_item_period_start`.
     */
    public data object MaxItemPeriodStart : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc() {
        public override val `value`: String = "max_item_period_start"
    }

    /**
     * Documented value. Wire value: `phase_start`.
     */
    public data object PhaseStart : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc() {
        public override val `value`: String = "phase_start"
    }

    /**
     * Documented value. Wire value: `timestamp`.
     */
    public data object Timestamp : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc() {
        public override val `value`: String = "timestamp"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc =
            when (value) {
                MaxItemPeriodStart.value -> MaxItemPeriodStart
                PhaseStart.value -> PhaseStart
                Timestamp.value -> Timestamp
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

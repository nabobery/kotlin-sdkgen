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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/period/properties/start/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/period/properties/start/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `max_item_period_start`.
     */
    public data object MaxItemPeriodStart : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b() {
        public override val `value`: String = "max_item_period_start"
    }

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b() {
        public override val `value`: String = "now"
    }

    /**
     * Documented value. Wire value: `timestamp`.
     */
    public data object Timestamp : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b() {
        public override val `value`: String = "timestamp"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b =
            when (value) {
                MaxItemPeriodStart.value -> MaxItemPeriodStart
                Now.value -> Now
                Timestamp.value -> Timestamp
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeXa1c3095b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

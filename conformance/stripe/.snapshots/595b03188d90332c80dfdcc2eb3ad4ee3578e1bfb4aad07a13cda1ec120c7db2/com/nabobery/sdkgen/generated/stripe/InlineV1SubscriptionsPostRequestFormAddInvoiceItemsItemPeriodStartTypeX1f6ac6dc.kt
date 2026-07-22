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
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/start/properties/typ
 * e.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period/properties/start/properties/typ
 * e
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `max_item_period_start`.
     */
    public data object MaxItemPeriodStart : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc() {
        public override val `value`: String = "max_item_period_start"
    }

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc() {
        public override val `value`: String = "now"
    }

    /**
     * Documented value. Wire value: `timestamp`.
     */
    public data object Timestamp : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc() {
        public override val `value`: String = "timestamp"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc =
            when (value) {
                MaxItemPeriodStart.value -> MaxItemPeriodStart
                Now.value -> Now
                Timestamp.value -> Timestamp
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartTypeX1f6ac6dc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

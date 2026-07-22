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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/tax_b
 * ehavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data/properties/tax_b
 * ehavior
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

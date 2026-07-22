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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2.Serializer::class)
public sealed class InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

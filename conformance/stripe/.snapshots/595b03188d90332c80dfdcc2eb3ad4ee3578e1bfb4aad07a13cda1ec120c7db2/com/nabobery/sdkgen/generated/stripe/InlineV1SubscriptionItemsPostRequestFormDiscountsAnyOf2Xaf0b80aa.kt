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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa.Serializer::class)
public sealed class InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

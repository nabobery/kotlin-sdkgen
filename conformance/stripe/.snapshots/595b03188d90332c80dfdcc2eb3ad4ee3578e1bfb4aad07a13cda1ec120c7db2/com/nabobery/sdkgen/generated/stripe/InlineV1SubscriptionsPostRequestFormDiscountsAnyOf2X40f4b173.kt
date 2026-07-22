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
 * chema/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X40f4b173,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

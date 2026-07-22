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
 * roperties/line_items/items/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb()

    public companion object {
        public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf2X6102bfeb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

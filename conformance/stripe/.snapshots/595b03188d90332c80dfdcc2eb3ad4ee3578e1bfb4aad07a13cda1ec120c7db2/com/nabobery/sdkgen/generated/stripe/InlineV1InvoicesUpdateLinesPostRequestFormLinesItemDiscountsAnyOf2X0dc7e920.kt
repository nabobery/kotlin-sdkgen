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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/discounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/discounts/anyOf/1
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920.Serializer::class)
public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

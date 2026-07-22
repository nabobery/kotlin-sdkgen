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
 * rlencoded/schema/properties/invoice_items/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2Xae5fe17a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * rlencoded/schema/properties/invoice_items/items/properties/price_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/price_data/properties/tax_behavior
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclusive`.
     */
    public data object Exclusive : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9() {
        public override val `value`: String = "exclusive"
    }

    /**
     * Documented value. Wire value: `inclusive`.
     */
    public data object Inclusive : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9() {
        public override val `value`: String = "inclusive"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9 =
            when (value) {
                Exclusive.value -> Exclusive
                Inclusive.value -> Inclusive
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorX8f1093b9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

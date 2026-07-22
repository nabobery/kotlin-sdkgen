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
 * How to handle pending invoice items on invoice creation. Defaults to `exclude` if the parameter is omitted.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/pending_invoice_items_behavior
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `exclude`.
     */
    public data object Exclude : InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86() {
        public override val `value`: String = "exclude"
    }

    /**
     * Documented value. Wire value: `include`.
     */
    public data object Include : InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86() {
        public override val `value`: String = "include"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86 =
            when (value) {
                Exclude.value -> Exclude
                Include.value -> Include
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPendingInvoiceItemsBehaviorX0af94a86,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

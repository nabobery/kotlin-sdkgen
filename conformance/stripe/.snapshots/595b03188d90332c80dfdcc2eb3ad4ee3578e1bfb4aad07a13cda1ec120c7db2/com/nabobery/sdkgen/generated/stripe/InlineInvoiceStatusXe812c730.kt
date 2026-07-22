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
 * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn
 * more](https://docs.stripe.com/billing/invoices/workflow#workflow-overview)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/status
 */
@Serializable(with = InlineInvoiceStatusXe812c730.Serializer::class)
public sealed class InlineInvoiceStatusXe812c730 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `draft`.
     */
    public data object Draft : InlineInvoiceStatusXe812c730() {
        public override val `value`: String = "draft"
    }

    /**
     * Documented value. Wire value: `open`.
     */
    public data object Open : InlineInvoiceStatusXe812c730() {
        public override val `value`: String = "open"
    }

    /**
     * Documented value. Wire value: `paid`.
     */
    public data object Paid : InlineInvoiceStatusXe812c730() {
        public override val `value`: String = "paid"
    }

    /**
     * Documented value. Wire value: `uncollectible`.
     */
    public data object Uncollectible : InlineInvoiceStatusXe812c730() {
        public override val `value`: String = "uncollectible"
    }

    /**
     * Documented value. Wire value: `void`.
     */
    public data object Void : InlineInvoiceStatusXe812c730() {
        public override val `value`: String = "void"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoiceStatusXe812c730()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoiceStatusXe812c730 =
            when (value) {
                Draft.value -> Draft
                Open.value -> Open
                Paid.value -> Paid
                Uncollectible.value -> Uncollectible
                Void.value -> Void
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoiceStatusXe812c730> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoiceStatusXe812c730",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInvoiceStatusXe812c730 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceStatusXe812c730,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

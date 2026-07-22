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
 * The status of the template, one of `active` or `archived`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_rendering_template/properties/status
 */
@Serializable(with = InlineInvoiceRenderingTemplateStatusX802c7d42.Serializer::class)
public sealed class InlineInvoiceRenderingTemplateStatusX802c7d42 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineInvoiceRenderingTemplateStatusX802c7d42() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `archived`.
     */
    public data object Archived : InlineInvoiceRenderingTemplateStatusX802c7d42() {
        public override val `value`: String = "archived"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoiceRenderingTemplateStatusX802c7d42()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoiceRenderingTemplateStatusX802c7d42 =
            when (value) {
                Active.value -> Active
                Archived.value -> Archived
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoiceRenderingTemplateStatusX802c7d42> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoiceRenderingTemplateStatusX802c7d42",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInvoiceRenderingTemplateStatusX802c7d42 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceRenderingTemplateStatusX802c7d42,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

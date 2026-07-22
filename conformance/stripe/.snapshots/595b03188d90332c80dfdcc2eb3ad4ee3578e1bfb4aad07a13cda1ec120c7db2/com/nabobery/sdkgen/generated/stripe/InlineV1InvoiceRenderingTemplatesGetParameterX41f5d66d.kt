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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoice_rendering_templates/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoice_rendering_templates/get/parameters/4/schema
 */
@Serializable(with = InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d.Serializer::class)
public sealed class InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `archived`.
     */
    public data object Archived : InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d() {
        public override val `value`: String = "archived"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d =
            when (value) {
                Active.value -> Active
                Archived.value -> Archived
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

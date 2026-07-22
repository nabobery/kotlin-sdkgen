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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/tax_a
 * mounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/tax_a
 * mounts/anyOf/1
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4.Serializer::class)
public sealed class InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/tax_rates/an
 * yOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/tax_rates/an
 * yOf/1
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b.Serializer::class)
public sealed class InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_amounts/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_amounts/anyOf/1
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd.Serializer::class)
public sealed class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

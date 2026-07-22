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
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/tax_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/tax_code/anyOf/1
 */
@Serializable(with = InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde.Serializer::class)
public sealed class InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsPostRequestFormTaxCodeAnyOf2X53ab3bde,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

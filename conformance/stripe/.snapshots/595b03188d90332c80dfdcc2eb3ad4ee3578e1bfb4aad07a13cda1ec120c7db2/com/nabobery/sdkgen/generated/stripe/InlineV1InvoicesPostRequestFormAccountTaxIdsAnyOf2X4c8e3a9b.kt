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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/account_tax_ids/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/account_tax_ids/anyOf/1
 */
@Serializable(with = InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

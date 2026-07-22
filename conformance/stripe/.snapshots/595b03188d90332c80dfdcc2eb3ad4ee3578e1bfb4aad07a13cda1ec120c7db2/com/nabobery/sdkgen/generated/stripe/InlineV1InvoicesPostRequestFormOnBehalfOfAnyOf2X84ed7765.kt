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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/on_behalf_of/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/on_behalf_of/anyOf/1
 */
@Serializable(with = InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

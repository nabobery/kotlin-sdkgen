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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/object
 */
@Serializable(with = InlineInvoiceitemObjectValueX2ce8a156.Serializer::class)
public sealed class InlineInvoiceitemObjectValueX2ce8a156 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `invoiceitem`.
     */
    public data object Invoiceitem : InlineInvoiceitemObjectValueX2ce8a156() {
        public override val `value`: String = "invoiceitem"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoiceitemObjectValueX2ce8a156()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoiceitemObjectValueX2ce8a156 =
            when (value) {
                Invoiceitem.value -> Invoiceitem
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoiceitemObjectValueX2ce8a156> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoiceitemObjectValueX2ce8a156",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInvoiceitemObjectValueX2ce8a156 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceitemObjectValueX2ce8a156,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

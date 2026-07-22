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
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/object
 */
@Serializable(with = InlineRefundObjectValueX88f924f8.Serializer::class)
public sealed class InlineRefundObjectValueX88f924f8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `refund`.
     */
    public data object Refund : InlineRefundObjectValueX88f924f8() {
        public override val `value`: String = "refund"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineRefundObjectValueX88f924f8()

    public companion object {
        public fun fromValue(`value`: String): InlineRefundObjectValueX88f924f8 =
            when (value) {
                Refund.value -> Refund
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineRefundObjectValueX88f924f8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineRefundObjectValueX88f924f8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineRefundObjectValueX88f924f8 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineRefundObjectValueX88f924f8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

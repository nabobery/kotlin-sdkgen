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
 * Source: sdkgen://source/openapi.json#/components/schemas/product/properties/object
 */
@Serializable(with = InlineProductObjectValueXe481ef09.Serializer::class)
public sealed class InlineProductObjectValueXe481ef09 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `product`.
     */
    public data object Product : InlineProductObjectValueXe481ef09() {
        public override val `value`: String = "product"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineProductObjectValueXe481ef09()

    public companion object {
        public fun fromValue(`value`: String): InlineProductObjectValueXe481ef09 =
            when (value) {
                Product.value -> Product
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineProductObjectValueXe481ef09> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineProductObjectValueXe481ef09",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineProductObjectValueXe481ef09 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineProductObjectValueXe481ef09,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

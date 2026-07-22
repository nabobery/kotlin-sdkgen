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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_coupon/properties/object
 */
@Serializable(with = InlineDeletedCouponObjectValueX9974a7c9.Serializer::class)
public sealed class InlineDeletedCouponObjectValueX9974a7c9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `coupon`.
     */
    public data object Coupon : InlineDeletedCouponObjectValueX9974a7c9() {
        public override val `value`: String = "coupon"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineDeletedCouponObjectValueX9974a7c9()

    public companion object {
        public fun fromValue(`value`: String): InlineDeletedCouponObjectValueX9974a7c9 =
            when (value) {
                Coupon.value -> Coupon
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineDeletedCouponObjectValueX9974a7c9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineDeletedCouponObjectValueX9974a7c9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineDeletedCouponObjectValueX9974a7c9 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDeletedCouponObjectValueX9974a7c9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

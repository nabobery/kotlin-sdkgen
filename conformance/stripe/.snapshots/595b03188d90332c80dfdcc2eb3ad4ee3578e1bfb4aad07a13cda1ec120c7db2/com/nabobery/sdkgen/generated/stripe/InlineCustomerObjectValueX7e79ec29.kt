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
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/object
 */
@Serializable(with = InlineCustomerObjectValueX7e79ec29.Serializer::class)
public sealed class InlineCustomerObjectValueX7e79ec29 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer`.
     */
    public data object Customer : InlineCustomerObjectValueX7e79ec29() {
        public override val `value`: String = "customer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerObjectValueX7e79ec29()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerObjectValueX7e79ec29 =
            when (value) {
                Customer.value -> Customer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerObjectValueX7e79ec29> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerObjectValueX7e79ec29",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerObjectValueX7e79ec29 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerObjectValueX7e79ec29,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

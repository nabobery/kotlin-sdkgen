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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/line_items/properties/object
 */
@Serializable(with = InlinePaymentLinkLineItemsObjectValueX4a8f34e6.Serializer::class)
public sealed class InlinePaymentLinkLineItemsObjectValueX4a8f34e6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlinePaymentLinkLineItemsObjectValueX4a8f34e6() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentLinkLineItemsObjectValueX4a8f34e6()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentLinkLineItemsObjectValueX4a8f34e6 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentLinkLineItemsObjectValueX4a8f34e6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentLinkLineItemsObjectValueX4a8f34e6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentLinkLineItemsObjectValueX4a8f34e6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinkLineItemsObjectValueX4a8f34e6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

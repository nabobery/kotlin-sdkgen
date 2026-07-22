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
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/items/properties/object
 */
@Serializable(with = InlineSubscriptionItemsObjectValueXccea23cf.Serializer::class)
public sealed class InlineSubscriptionItemsObjectValueXccea23cf {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineSubscriptionItemsObjectValueXccea23cf() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSubscriptionItemsObjectValueXccea23cf()

    public companion object {
        public fun fromValue(`value`: String): InlineSubscriptionItemsObjectValueXccea23cf =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSubscriptionItemsObjectValueXccea23cf> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSubscriptionItemsObjectValueXccea23cf",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSubscriptionItemsObjectValueXccea23cf =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionItemsObjectValueXccea23cf,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

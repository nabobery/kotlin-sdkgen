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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_subscription_item/properties/object
 */
@Serializable(with = InlineDeletedSubscriptionItemObjectValueXb0f4784b.Serializer::class)
public sealed class InlineDeletedSubscriptionItemObjectValueXb0f4784b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `subscription_item`.
     */
    public data object SubscriptionItem : InlineDeletedSubscriptionItemObjectValueXb0f4784b() {
        public override val `value`: String = "subscription_item"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineDeletedSubscriptionItemObjectValueXb0f4784b()

    public companion object {
        public fun fromValue(`value`: String): InlineDeletedSubscriptionItemObjectValueXb0f4784b =
            when (value) {
                SubscriptionItem.value -> SubscriptionItem
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineDeletedSubscriptionItemObjectValueXb0f4784b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineDeletedSubscriptionItemObjectValueXb0f4784b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineDeletedSubscriptionItemObjectValueXb0f4784b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDeletedSubscriptionItemObjectValueXb0f4784b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

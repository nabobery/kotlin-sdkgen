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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

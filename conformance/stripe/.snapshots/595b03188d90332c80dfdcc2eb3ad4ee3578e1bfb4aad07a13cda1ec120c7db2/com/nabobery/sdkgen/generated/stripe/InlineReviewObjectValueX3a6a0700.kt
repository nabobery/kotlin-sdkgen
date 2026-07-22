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
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/object
 */
@Serializable(with = InlineReviewObjectValueX3a6a0700.Serializer::class)
public sealed class InlineReviewObjectValueX3a6a0700 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `review`.
     */
    public data object Review : InlineReviewObjectValueX3a6a0700() {
        public override val `value`: String = "review"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineReviewObjectValueX3a6a0700()

    public companion object {
        public fun fromValue(`value`: String): InlineReviewObjectValueX3a6a0700 =
            when (value) {
                Review.value -> Review
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineReviewObjectValueX3a6a0700> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineReviewObjectValueX3a6a0700",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineReviewObjectValueX3a6a0700 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineReviewObjectValueX3a6a0700,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

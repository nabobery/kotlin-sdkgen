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
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/description/anyOf/1
 */
@Serializable(with = InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d.Serializer::class)
public sealed class InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

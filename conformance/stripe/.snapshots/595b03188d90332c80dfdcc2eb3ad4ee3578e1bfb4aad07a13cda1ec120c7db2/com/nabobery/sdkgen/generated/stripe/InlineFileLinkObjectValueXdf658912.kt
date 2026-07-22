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
 * Source: sdkgen://source/openapi.json#/components/schemas/file_link/properties/object
 */
@Serializable(with = InlineFileLinkObjectValueXdf658912.Serializer::class)
public sealed class InlineFileLinkObjectValueXdf658912 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `file_link`.
     */
    public data object FileLink : InlineFileLinkObjectValueXdf658912() {
        public override val `value`: String = "file_link"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineFileLinkObjectValueXdf658912()

    public companion object {
        public fun fromValue(`value`: String): InlineFileLinkObjectValueXdf658912 =
            when (value) {
                FileLink.value -> FileLink
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineFileLinkObjectValueXdf658912> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineFileLinkObjectValueXdf658912",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineFileLinkObjectValueXdf658912 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFileLinkObjectValueXdf658912,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

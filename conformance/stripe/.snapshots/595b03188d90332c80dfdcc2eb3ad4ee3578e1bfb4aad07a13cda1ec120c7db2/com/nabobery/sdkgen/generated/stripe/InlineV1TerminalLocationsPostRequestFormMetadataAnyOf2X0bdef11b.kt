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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b.Serializer::class)
public sealed class InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

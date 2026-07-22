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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/bbpos_wisepos_e/properties/splashscreen/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/bbpos_wisepos_e/properties/splashscreen/anyOf/1
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEAnyOf2X4e8c90bd,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

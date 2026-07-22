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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/configuration_overrides/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/configuration_overrides/anyOf/1
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6.Serializer::class)
public sealed class InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalLocationsPostRequestFormConfigurationOverridesAnyOf2X8a0769b6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700/anyOf/1
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

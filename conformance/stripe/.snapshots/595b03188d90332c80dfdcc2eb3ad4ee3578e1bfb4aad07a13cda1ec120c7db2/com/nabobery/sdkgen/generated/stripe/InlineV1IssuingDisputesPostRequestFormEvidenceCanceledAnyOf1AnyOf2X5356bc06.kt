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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/canceled_at/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/canceled/anyOf/0/properties/canceled_at/anyOf/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1AnyOf2X5356bc06,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

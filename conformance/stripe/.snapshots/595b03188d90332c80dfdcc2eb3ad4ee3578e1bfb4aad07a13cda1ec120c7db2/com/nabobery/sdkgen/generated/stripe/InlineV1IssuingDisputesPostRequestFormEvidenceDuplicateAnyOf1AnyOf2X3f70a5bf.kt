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
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0/properties/card_statement/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/duplicate/anyOf/0/properties/card_statement/anyOf/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceDuplicateAnyOf1AnyOf2X3f70a5bf,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

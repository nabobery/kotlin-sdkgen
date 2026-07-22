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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other/anyOf/0/properties/additional_documentation/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/other/anyOf/0/properties/additional_documentation/anyOf/1
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2X61be6ce9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

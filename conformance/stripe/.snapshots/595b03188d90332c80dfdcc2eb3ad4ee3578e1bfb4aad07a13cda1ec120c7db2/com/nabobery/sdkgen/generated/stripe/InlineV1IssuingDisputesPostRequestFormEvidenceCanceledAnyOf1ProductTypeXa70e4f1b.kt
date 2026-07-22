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
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/product_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/canceled/anyOf/0/properties/product_type
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `merchandise`.
     */
    public data object Merchandise : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b() {
        public override val `value`: String = "merchandise"
    }

    /**
     * Documented value. Wire value: `service`.
     */
    public data object Service : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b() {
        public override val `value`: String = "service"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b =
            when (value) {
                Value.value -> Value
                Merchandise.value -> Merchandise
                Service.value -> Service
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAnyOf1ProductTypeXa70e4f1b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

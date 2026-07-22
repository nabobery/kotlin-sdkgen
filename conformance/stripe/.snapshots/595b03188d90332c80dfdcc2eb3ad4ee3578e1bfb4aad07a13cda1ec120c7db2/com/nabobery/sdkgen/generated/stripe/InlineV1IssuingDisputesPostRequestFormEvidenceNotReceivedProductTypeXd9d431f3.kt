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
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/not_received/anyOf/0/properties/product_type
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `merchandise`.
     */
    public data object Merchandise : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3() {
        public override val `value`: String = "merchandise"
    }

    /**
     * Documented value. Wire value: `service`.
     */
    public data object Service : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3() {
        public override val `value`: String = "service"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3 =
            when (value) {
                Value.value -> Value
                Merchandise.value -> Merchandise
                Service.value -> Service
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceNotReceivedProductTypeXd9d431f3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

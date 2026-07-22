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
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/return_status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/merchandise_not_as_described/anyOf/0/properties/return_status
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639.Serializer::class)
public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `merchant_rejected`.
     */
    public data object MerchantRejected : InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639() {
        public override val `value`: String = "merchant_rejected"
    }

    /**
     * Documented value. Wire value: `successful`.
     */
    public data object Successful : InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639() {
        public override val `value`: String = "successful"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639 =
            when (value) {
                Value.value -> Value
                MerchantRejected.value -> MerchantRejected
                Successful.value -> Successful
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceReturnStatusX65c23639,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/state/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/state/anyOf/1
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee.Serializer::class)
public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xd16a4bee,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

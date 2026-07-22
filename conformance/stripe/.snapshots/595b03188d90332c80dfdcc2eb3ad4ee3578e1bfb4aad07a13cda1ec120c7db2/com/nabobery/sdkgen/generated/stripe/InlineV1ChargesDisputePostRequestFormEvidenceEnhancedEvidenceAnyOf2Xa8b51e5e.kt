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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/country/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address/properties/country/anyOf/1
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e.Serializer::class)
public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xa8b51e5e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

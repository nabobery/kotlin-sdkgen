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
 * perties/disputed_transaction/properties/customer_device_id/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/customer_device_id/anyOf/1
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7.Serializer::class)
public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xac21eda7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/city/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address/properties/city/anyOf/1
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a.Serializer::class)
public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2Xc9f38d4a) {
      encoder.encodeString(value.value)
    }
  }
}

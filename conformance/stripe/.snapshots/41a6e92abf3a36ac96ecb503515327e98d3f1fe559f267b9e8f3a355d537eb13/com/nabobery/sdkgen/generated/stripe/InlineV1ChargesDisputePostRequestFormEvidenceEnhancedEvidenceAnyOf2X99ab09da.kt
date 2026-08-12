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
 * perties/disputed_transaction/properties/customer_purchase_ip/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/customer_purchase_ip/anyOf/1
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da.Serializer::class)
public sealed class InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf2X99ab09da) {
      encoder.encodeString(value.value)
    }
  }
}

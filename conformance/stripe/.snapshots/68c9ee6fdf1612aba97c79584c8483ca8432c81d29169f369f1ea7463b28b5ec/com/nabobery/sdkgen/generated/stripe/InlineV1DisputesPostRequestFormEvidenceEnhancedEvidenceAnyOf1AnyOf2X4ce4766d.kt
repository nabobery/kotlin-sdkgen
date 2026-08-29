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
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_device_id/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/customer_device_id/anyOf/1
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d.Serializer::class)
public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2X4ce4766d) {
      encoder.encodeString(value.value)
    }
  }
}

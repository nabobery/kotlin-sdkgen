package io.github.nabobery.sdkgen.generated.stripe

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
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/postal_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /prior_undisputed_transactions/items/properties/shipping_address/properties/postal_code/anyOf/1
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb.Serializer::class)
public sealed class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1AnyOf2Xc7a254eb) {
      encoder.encodeString(value.value)
    }
  }
}

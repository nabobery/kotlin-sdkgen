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
 * Visa Compelling Evidence 3.0 eligibility status.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_visa_compelling_evidence3/properties/st
 * atus
 */
@Serializable(with = InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737.Serializer::class)
public sealed class InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_qualified`.
   */
  public data object NotQualified : InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737() {
    public override val `value`: String = "not_qualified"
  }

  /**
   * Documented value. Wire value: `qualified`.
   */
  public data object Qualified : InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737() {
    public override val `value`: String = "qualified"
  }

  /**
   * Documented value. Wire value: `requires_action`.
   */
  public data object RequiresAction : InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737() {
    public override val `value`: String = "requires_action"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737 = when (value) {
      NotQualified.value -> NotQualified
      Qualified.value -> Qualified
      RequiresAction.value -> RequiresAction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEnhancedEligibilityVisaCompellingEvidence3StatusX17878737) {
      encoder.encodeString(value.value)
    }
  }
}

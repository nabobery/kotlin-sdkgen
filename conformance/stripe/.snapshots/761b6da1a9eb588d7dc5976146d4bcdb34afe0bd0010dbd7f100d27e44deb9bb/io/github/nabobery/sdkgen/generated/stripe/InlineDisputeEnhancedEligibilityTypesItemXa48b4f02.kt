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
 * sdkgen://source/openapi.json#/components/schemas/dispute/properties/enhanced_eligibility_types/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute/properties/enhanced_eligibility_types/items
 */
@Serializable(with = InlineDisputeEnhancedEligibilityTypesItemXa48b4f02.Serializer::class)
public sealed class InlineDisputeEnhancedEligibilityTypesItemXa48b4f02 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mastercard_compliance`.
   */
  public data object MastercardCompliance : InlineDisputeEnhancedEligibilityTypesItemXa48b4f02() {
    public override val `value`: String = "mastercard_compliance"
  }

  /**
   * Documented value. Wire value: `visa_compelling_evidence_3`.
   */
  public data object VisaCompellingEvidence3 : InlineDisputeEnhancedEligibilityTypesItemXa48b4f02() {
    public override val `value`: String = "visa_compelling_evidence_3"
  }

  /**
   * Documented value. Wire value: `visa_compliance`.
   */
  public data object VisaCompliance : InlineDisputeEnhancedEligibilityTypesItemXa48b4f02() {
    public override val `value`: String = "visa_compliance"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeEnhancedEligibilityTypesItemXa48b4f02()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeEnhancedEligibilityTypesItemXa48b4f02 = when (value) {
      MastercardCompliance.value -> MastercardCompliance
      VisaCompellingEvidence3.value -> VisaCompellingEvidence3
      VisaCompliance.value -> VisaCompliance
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEnhancedEligibilityTypesItemXa48b4f02> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDisputeEnhancedEligibilityTypesItemXa48b4f02", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeEnhancedEligibilityTypesItemXa48b4f02 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEnhancedEligibilityTypesItemXa48b4f02) {
      encoder.encodeString(value.value)
    }
  }
}

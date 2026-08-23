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
 * Mastercard compliance eligibility status.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_mastercard_compliance/properties/status
 */
@Serializable(with = InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7.Serializer::class)
public sealed class InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fee_acknowledged`.
   */
  public data object FeeAcknowledged : InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7() {
    public override val `value`: String = "fee_acknowledged"
  }

  /**
   * Documented value. Wire value: `requires_fee_acknowledgement`.
   */
  public data object RequiresFeeAcknowledgement : InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7() {
    public override val `value`: String = "requires_fee_acknowledgement"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7 = when (value) {
      FeeAcknowledged.value -> FeeAcknowledged
      RequiresFeeAcknowledgement.value -> RequiresFeeAcknowledgement
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEnhancedEligibilityMastercardComplianceStatusXd1c2fcf7) {
      encoder.encodeString(value.value)
    }
  }
}

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
 * Visa compliance eligibility status.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_enhanced_eligibility_visa_compliance/properties/status
 */
@Serializable(with = InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa.Serializer::class)
public sealed class InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fee_acknowledged`.
   */
  public data object FeeAcknowledged : InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa() {
    public override val `value`: String = "fee_acknowledged"
  }

  /**
   * Documented value. Wire value: `requires_fee_acknowledgement`.
   */
  public data object RequiresFeeAcknowledgement : InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa() {
    public override val `value`: String = "requires_fee_acknowledgement"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa = when (value) {
      FeeAcknowledged.value -> FeeAcknowledged
      RequiresFeeAcknowledgement.value -> RequiresFeeAcknowledgement
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeEnhancedEligibilityVisaComplianceStatusXb5803dfa) {
      encoder.encodeString(value.value)
    }
  }
}

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
 * This value is used to determine if a business is exempt from providing ultimate beneficial owners. See [this support
 * article](https://support.stripe.com/questions/exemption-from-providing-ownership-details) and
 * [changelog](https://docs.stripe.com/changelog/acacia/2025-01-27/ownership-exemption-reason-accounts-api) for more
 * details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/ownership_exemption_reason
 */
@Serializable(with = InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628.Serializer::class)
public sealed class InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `qualified_entity_exceeds_ownership_threshold`.
   */
  public data object QualifiedEntityExceedsOwnershipThreshold : InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628() {
    public override val `value`: String = "qualified_entity_exceeds_ownership_threshold"
  }

  /**
   * Documented value. Wire value: `qualifies_as_financial_institution`.
   */
  public data object QualifiesAsFinancialInstitution : InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628() {
    public override val `value`: String = "qualifies_as_financial_institution"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628()

  public companion object {
    public fun fromValue(`value`: String): InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628 = when (value) {
      QualifiedEntityExceedsOwnershipThreshold.value -> QualifiedEntityExceedsOwnershipThreshold
      QualifiesAsFinancialInstitution.value -> QualifiesAsFinancialInstitution
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628) {
      encoder.encodeString(value.value)
    }
  }
}

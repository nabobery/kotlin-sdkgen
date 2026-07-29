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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/ownership_exemption_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/ownership_exemption_reason
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `qualified_entity_exceeds_ownership_threshold`.
   */
  public data object QualifiedEntityExceedsOwnershipThreshold : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7() {
    public override val `value`: String = "qualified_entity_exceeds_ownership_threshold"
  }

  /**
   * Documented value. Wire value: `qualifies_as_financial_institution`.
   */
  public data object QualifiesAsFinancialInstitution : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7() {
    public override val `value`: String = "qualifies_as_financial_institution"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7 = when (value) {
      Value.value -> Value
      QualifiedEntityExceedsOwnershipThreshold.value -> QualifiedEntityExceedsOwnershipThreshold
      QualifiesAsFinancialInstitution.value -> QualifiesAsFinancialInstitution
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonXc9319ed7) {
      encoder.encodeString(value.value)
    }
  }
}

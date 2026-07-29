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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/ownership_exemption_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/ownership_exemption_reason
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `qualified_entity_exceeds_ownership_threshold`.
   */
  public data object QualifiedEntityExceedsOwnershipThreshold : InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988() {
    public override val `value`: String = "qualified_entity_exceeds_ownership_threshold"
  }

  /**
   * Documented value. Wire value: `qualifies_as_financial_institution`.
   */
  public data object QualifiesAsFinancialInstitution : InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988() {
    public override val `value`: String = "qualifies_as_financial_institution"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988 = when (value) {
      Value.value -> Value
      QualifiedEntityExceedsOwnershipThreshold.value -> QualifiedEntityExceedsOwnershipThreshold
      QualifiesAsFinancialInstitution.value -> QualifiesAsFinancialInstitution
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988) {
      encoder.encodeString(value.value)
    }
  }
}

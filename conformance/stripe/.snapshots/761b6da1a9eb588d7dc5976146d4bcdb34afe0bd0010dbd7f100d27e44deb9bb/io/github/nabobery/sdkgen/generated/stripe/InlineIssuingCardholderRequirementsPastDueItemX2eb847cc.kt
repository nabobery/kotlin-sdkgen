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
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_requirements/properties/past_due/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_requirements/properties/past_due/items
 */
@Serializable(with = InlineIssuingCardholderRequirementsPastDueItemX2eb847cc.Serializer::class)
public sealed class InlineIssuingCardholderRequirementsPastDueItemX2eb847cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company.tax_id`.
   */
  public data object CompanyTaxId : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "company.tax_id"
  }

  /**
   * Documented value. Wire value: `individual.card_issuing.user_terms_acceptance.date`.
   */
  public data object IndividualCardIssuingUserTermsAcceptanceDate : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.card_issuing.user_terms_acceptance.date"
  }

  /**
   * Documented value. Wire value: `individual.card_issuing.user_terms_acceptance.ip`.
   */
  public data object IndividualCardIssuingUserTermsAcceptanceIp : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.card_issuing.user_terms_acceptance.ip"
  }

  /**
   * Documented value. Wire value: `individual.dob.day`.
   */
  public data object IndividualDobDay : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.dob.day"
  }

  /**
   * Documented value. Wire value: `individual.dob.month`.
   */
  public data object IndividualDobMonth : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.dob.month"
  }

  /**
   * Documented value. Wire value: `individual.dob.year`.
   */
  public data object IndividualDobYear : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.dob.year"
  }

  /**
   * Documented value. Wire value: `individual.first_name`.
   */
  public data object IndividualFirstName : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.first_name"
  }

  /**
   * Documented value. Wire value: `individual.last_name`.
   */
  public data object IndividualLastName : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.last_name"
  }

  /**
   * Documented value. Wire value: `individual.verification.document`.
   */
  public data object IndividualVerificationDocument : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc() {
    public override val `value`: String = "individual.verification.document"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderRequirementsPastDueItemX2eb847cc()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderRequirementsPastDueItemX2eb847cc = when (value) {
      CompanyTaxId.value -> CompanyTaxId
      IndividualCardIssuingUserTermsAcceptanceDate.value -> IndividualCardIssuingUserTermsAcceptanceDate
      IndividualCardIssuingUserTermsAcceptanceIp.value -> IndividualCardIssuingUserTermsAcceptanceIp
      IndividualDobDay.value -> IndividualDobDay
      IndividualDobMonth.value -> IndividualDobMonth
      IndividualDobYear.value -> IndividualDobYear
      IndividualFirstName.value -> IndividualFirstName
      IndividualLastName.value -> IndividualLastName
      IndividualVerificationDocument.value -> IndividualVerificationDocument
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderRequirementsPastDueItemX2eb847cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderRequirementsPastDueItemX2eb847cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderRequirementsPastDueItemX2eb847cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderRequirementsPastDueItemX2eb847cc) {
      encoder.encodeString(value.value)
    }
  }
}

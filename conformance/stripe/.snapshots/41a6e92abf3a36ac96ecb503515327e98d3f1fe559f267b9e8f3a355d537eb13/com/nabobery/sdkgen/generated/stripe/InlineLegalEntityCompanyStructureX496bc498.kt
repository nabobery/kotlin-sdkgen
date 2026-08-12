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
 * The category identifying the legal structure of the company or legal entity. Also available for accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `stripe`. See [Business structure](https://docs.stripe.com/connect/identity-verification#business-structure) for more
 * details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/structure
 */
@Serializable(with = InlineLegalEntityCompanyStructureX496bc498.Serializer::class)
public sealed class InlineLegalEntityCompanyStructureX496bc498 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `free_zone_establishment`.
   */
  public data object FreeZoneEstablishment : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "free_zone_establishment"
  }

  /**
   * Documented value. Wire value: `free_zone_llc`.
   */
  public data object FreeZoneLlc : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "free_zone_llc"
  }

  /**
   * Documented value. Wire value: `government_instrumentality`.
   */
  public data object GovernmentInstrumentality : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "government_instrumentality"
  }

  /**
   * Documented value. Wire value: `governmental_unit`.
   */
  public data object GovernmentalUnit : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "governmental_unit"
  }

  /**
   * Documented value. Wire value: `incorporated_non_profit`.
   */
  public data object IncorporatedNonProfit : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "incorporated_non_profit"
  }

  /**
   * Documented value. Wire value: `incorporated_partnership`.
   */
  public data object IncorporatedPartnership : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "incorporated_partnership"
  }

  /**
   * Documented value. Wire value: `limited_liability_partnership`.
   */
  public data object LimitedLiabilityPartnership : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "limited_liability_partnership"
  }

  /**
   * Documented value. Wire value: `llc`.
   */
  public data object Llc : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "llc"
  }

  /**
   * Documented value. Wire value: `multi_member_llc`.
   */
  public data object MultiMemberLlc : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "multi_member_llc"
  }

  /**
   * Documented value. Wire value: `private_company`.
   */
  public data object PrivateCompany : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "private_company"
  }

  /**
   * Documented value. Wire value: `private_corporation`.
   */
  public data object PrivateCorporation : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "private_corporation"
  }

  /**
   * Documented value. Wire value: `private_partnership`.
   */
  public data object PrivatePartnership : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "private_partnership"
  }

  /**
   * Documented value. Wire value: `public_company`.
   */
  public data object PublicCompany : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "public_company"
  }

  /**
   * Documented value. Wire value: `public_corporation`.
   */
  public data object PublicCorporation : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "public_corporation"
  }

  /**
   * Documented value. Wire value: `public_partnership`.
   */
  public data object PublicPartnership : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "public_partnership"
  }

  /**
   * Documented value. Wire value: `registered_charity`.
   */
  public data object RegisteredCharity : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "registered_charity"
  }

  /**
   * Documented value. Wire value: `single_member_llc`.
   */
  public data object SingleMemberLlc : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "single_member_llc"
  }

  /**
   * Documented value. Wire value: `sole_establishment`.
   */
  public data object SoleEstablishment : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "sole_establishment"
  }

  /**
   * Documented value. Wire value: `sole_proprietorship`.
   */
  public data object SoleProprietorship : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "sole_proprietorship"
  }

  /**
   * Documented value. Wire value: `tax_exempt_government_instrumentality`.
   */
  public data object TaxExemptGovernmentInstrumentality : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "tax_exempt_government_instrumentality"
  }

  /**
   * Documented value. Wire value: `unincorporated_association`.
   */
  public data object UnincorporatedAssociation : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "unincorporated_association"
  }

  /**
   * Documented value. Wire value: `unincorporated_non_profit`.
   */
  public data object UnincorporatedNonProfit : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "unincorporated_non_profit"
  }

  /**
   * Documented value. Wire value: `unincorporated_partnership`.
   */
  public data object UnincorporatedPartnership : InlineLegalEntityCompanyStructureX496bc498() {
    public override val `value`: String = "unincorporated_partnership"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLegalEntityCompanyStructureX496bc498()

  public companion object {
    public fun fromValue(`value`: String): InlineLegalEntityCompanyStructureX496bc498 = when (value) {
      FreeZoneEstablishment.value -> FreeZoneEstablishment
      FreeZoneLlc.value -> FreeZoneLlc
      GovernmentInstrumentality.value -> GovernmentInstrumentality
      GovernmentalUnit.value -> GovernmentalUnit
      IncorporatedNonProfit.value -> IncorporatedNonProfit
      IncorporatedPartnership.value -> IncorporatedPartnership
      LimitedLiabilityPartnership.value -> LimitedLiabilityPartnership
      Llc.value -> Llc
      MultiMemberLlc.value -> MultiMemberLlc
      PrivateCompany.value -> PrivateCompany
      PrivateCorporation.value -> PrivateCorporation
      PrivatePartnership.value -> PrivatePartnership
      PublicCompany.value -> PublicCompany
      PublicCorporation.value -> PublicCorporation
      PublicPartnership.value -> PublicPartnership
      RegisteredCharity.value -> RegisteredCharity
      SingleMemberLlc.value -> SingleMemberLlc
      SoleEstablishment.value -> SoleEstablishment
      SoleProprietorship.value -> SoleProprietorship
      TaxExemptGovernmentInstrumentality.value -> TaxExemptGovernmentInstrumentality
      UnincorporatedAssociation.value -> UnincorporatedAssociation
      UnincorporatedNonProfit.value -> UnincorporatedNonProfit
      UnincorporatedPartnership.value -> UnincorporatedPartnership
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyStructureX496bc498> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineLegalEntityCompanyStructureX496bc498", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyStructureX496bc498 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyStructureX496bc498) {
      encoder.encodeString(value.value)
    }
  }
}

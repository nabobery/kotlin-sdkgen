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
 * Represents the reason why the status is `pending` or `restricted`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_toggles_setting_status_details/
 * properties/code
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be.Serializer::class)
public sealed class InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `activating`.
   */
  public data object Activating : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "activating"
  }

  /**
   * Documented value. Wire value: `capability_not_requested`.
   */
  public data object CapabilityNotRequested : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "capability_not_requested"
  }

  /**
   * Documented value. Wire value: `financial_account_closed`.
   */
  public data object FinancialAccountClosed : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "financial_account_closed"
  }

  /**
   * Documented value. Wire value: `rejected_other`.
   */
  public data object RejectedOther : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "rejected_other"
  }

  /**
   * Documented value. Wire value: `rejected_unsupported_business`.
   */
  public data object RejectedUnsupportedBusiness : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "rejected_unsupported_business"
  }

  /**
   * Documented value. Wire value: `requirements_past_due`.
   */
  public data object RequirementsPastDue : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "requirements_past_due"
  }

  /**
   * Documented value. Wire value: `requirements_pending_verification`.
   */
  public data object RequirementsPendingVerification : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "requirements_pending_verification"
  }

  /**
   * Documented value. Wire value: `restricted_by_platform`.
   */
  public data object RestrictedByPlatform : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "restricted_by_platform"
  }

  /**
   * Documented value. Wire value: `restricted_other`.
   */
  public data object RestrictedOther : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be() {
    public override val `value`: String = "restricted_other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be = when (value) {
      Activating.value -> Activating
      CapabilityNotRequested.value -> CapabilityNotRequested
      FinancialAccountClosed.value -> FinancialAccountClosed
      RejectedOther.value -> RejectedOther
      RejectedUnsupportedBusiness.value -> RejectedUnsupportedBusiness
      RequirementsPastDue.value -> RequirementsPastDue
      RequirementsPendingVerification.value -> RequirementsPendingVerification
      RestrictedByPlatform.value -> RestrictedByPlatform
      RestrictedOther.value -> RestrictedOther
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceTogglesSettingStatusDetailsCodeXbc4381be) {
      encoder.encodeString(value.value)
    }
  }
}

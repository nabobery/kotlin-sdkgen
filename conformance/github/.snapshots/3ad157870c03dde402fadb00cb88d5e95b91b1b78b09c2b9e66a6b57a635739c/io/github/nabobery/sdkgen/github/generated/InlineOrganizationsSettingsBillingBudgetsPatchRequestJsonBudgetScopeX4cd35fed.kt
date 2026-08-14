package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The scope of the budget for this organization.
 *
 * - `organization`: Apply the budget to the organization.
 * - `repository`: Apply the budget to a specific repository in the organization.
 * - `multi_user_customer`: Apply a universal budget to all users in the organization.
 * - `user`: Apply the budget to a single user in the organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_scope
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed.Serializer::class)
public sealed class InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `cost_center`.
   */
  public data object CostCenter : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed() {
    public override val `value`: String = "cost_center"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      Repository.value -> Repository
      CostCenter.value -> CostCenter
      MultiUserCustomer.value -> MultiUserCustomer
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetScopeX4cd35fed) {
      encoder.encodeString(value.value)
    }
  }
}

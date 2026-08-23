package com.nabobery.sdkgen.github.generated

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
 * `user` and `multi_user_customer` scopes are only supported when
 * `budget_product_sku` is `ai_credits` or `premium_requests`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_scope
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e.Serializer::class)
public sealed class InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e = when (value) {
      Organization.value -> Organization
      Repository.value -> Repository
      MultiUserCustomer.value -> MultiUserCustomer
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetScopeX9df3d98e) {
      encoder.encodeString(value.value)
    }
  }
}

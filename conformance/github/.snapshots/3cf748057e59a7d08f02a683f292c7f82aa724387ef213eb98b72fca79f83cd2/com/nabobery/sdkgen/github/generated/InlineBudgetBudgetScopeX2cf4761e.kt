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
 * The scope of the budget
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_scope
 */
@Serializable(with = InlineBudgetBudgetScopeX2cf4761e.Serializer::class)
public sealed class InlineBudgetBudgetScopeX2cf4761e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `cost_center`.
   */
  public data object CostCenter : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "cost_center"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `multi_user_cost_center`.
   */
  public data object MultiUserCostCenter : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "multi_user_cost_center"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineBudgetBudgetScopeX2cf4761e() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBudgetBudgetScopeX2cf4761e()

  public companion object {
    public fun fromValue(`value`: String): InlineBudgetBudgetScopeX2cf4761e = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      Repository.value -> Repository
      CostCenter.value -> CostCenter
      MultiUserCustomer.value -> MultiUserCustomer
      MultiUserCostCenter.value -> MultiUserCostCenter
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBudgetBudgetScopeX2cf4761e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineBudgetBudgetScopeX2cf4761e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBudgetBudgetScopeX2cf4761e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBudgetBudgetScopeX2cf4761e) {
      encoder.encodeString(value.value)
    }
  }
}

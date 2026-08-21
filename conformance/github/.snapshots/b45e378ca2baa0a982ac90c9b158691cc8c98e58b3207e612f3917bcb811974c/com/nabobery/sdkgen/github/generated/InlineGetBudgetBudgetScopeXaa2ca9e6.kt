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
 * The type of scope for the budget
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/get-budget/properties/budget_scope
 */
@Serializable(with = InlineGetBudgetBudgetScopeXaa2ca9e6.Serializer::class)
public sealed class InlineGetBudgetBudgetScopeXaa2ca9e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `cost_center`.
   */
  public data object CostCenter : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "cost_center"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `multi_user_cost_center`.
   */
  public data object MultiUserCostCenter : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "multi_user_cost_center"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineGetBudgetBudgetScopeXaa2ca9e6() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGetBudgetBudgetScopeXaa2ca9e6()

  public companion object {
    public fun fromValue(`value`: String): InlineGetBudgetBudgetScopeXaa2ca9e6 = when (value) {
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

  internal object Serializer : KSerializer<InlineGetBudgetBudgetScopeXaa2ca9e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineGetBudgetBudgetScopeXaa2ca9e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGetBudgetBudgetScopeXaa2ca9e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGetBudgetBudgetScopeXaa2ca9e6) {
      encoder.encodeString(value.value)
    }
  }
}

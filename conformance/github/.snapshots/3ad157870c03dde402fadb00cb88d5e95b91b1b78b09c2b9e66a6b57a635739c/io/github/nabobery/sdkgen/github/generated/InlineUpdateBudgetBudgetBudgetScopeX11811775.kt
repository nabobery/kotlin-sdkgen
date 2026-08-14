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
 * The type of scope for the budget
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_scope
 */
@Serializable(with = InlineUpdateBudgetBudgetBudgetScopeX11811775.Serializer::class)
public sealed class InlineUpdateBudgetBudgetBudgetScopeX11811775 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `cost_center`.
   */
  public data object CostCenter : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "cost_center"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `multi_user_cost_center`.
   */
  public data object MultiUserCostCenter : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "multi_user_cost_center"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineUpdateBudgetBudgetBudgetScopeX11811775() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUpdateBudgetBudgetBudgetScopeX11811775()

  public companion object {
    public fun fromValue(`value`: String): InlineUpdateBudgetBudgetBudgetScopeX11811775 = when (value) {
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

  internal object Serializer : KSerializer<InlineUpdateBudgetBudgetBudgetScopeX11811775> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUpdateBudgetBudgetBudgetScopeX11811775", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUpdateBudgetBudgetBudgetScopeX11811775 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUpdateBudgetBudgetBudgetScopeX11811775) {
      encoder.encodeString(value.value)
    }
  }
}

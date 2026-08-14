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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_scope
 */
@Serializable(with = InlineCreateBudgetBudgetBudgetScopeX37173668.Serializer::class)
public sealed class InlineCreateBudgetBudgetBudgetScopeX37173668 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `cost_center`.
   */
  public data object CostCenter : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "cost_center"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `multi_user_cost_center`.
   */
  public data object MultiUserCostCenter : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "multi_user_cost_center"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineCreateBudgetBudgetBudgetScopeX37173668() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreateBudgetBudgetBudgetScopeX37173668()

  public companion object {
    public fun fromValue(`value`: String): InlineCreateBudgetBudgetBudgetScopeX37173668 = when (value) {
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

  internal object Serializer : KSerializer<InlineCreateBudgetBudgetBudgetScopeX37173668> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCreateBudgetBudgetBudgetScopeX37173668", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreateBudgetBudgetBudgetScopeX37173668 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreateBudgetBudgetBudgetScopeX37173668) {
      encoder.encodeString(value.value)
    }
  }
}

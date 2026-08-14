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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/get/parameters/3/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/get/parameters/3/schema
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf.Serializer::class)
public sealed class InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `cost_center`.
   */
  public data object CostCenter : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf() {
    public override val `value`: String = "cost_center"
  }

  /**
   * Documented value. Wire value: `multi_user_customer`.
   */
  public data object MultiUserCustomer : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf() {
    public override val `value`: String = "multi_user_customer"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      Repository.value -> Repository
      CostCenter.value -> CostCenter
      MultiUserCustomer.value -> MultiUserCustomer
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf) {
      encoder.encodeString(value.value)
    }
  }
}

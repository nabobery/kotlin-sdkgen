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
 * The policy state for Copilot cloud agent in the enterprise. Can be one of `enabled_for_all_orgs`,
 * `disabled_for_all_orgs`, `enabled_for_selected_orgs`, or `configured_by_org_admins`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent/put/requestBody/cont
 * ent/application~1json/schema/properties/policy_state
 */
@Serializable(with = InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9.Serializer::class)
public sealed class InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled_for_all_orgs`.
   */
  public data object EnabledForAllOrgs : InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9() {
    public override val `value`: String = "enabled_for_all_orgs"
  }

  /**
   * Documented value. Wire value: `disabled_for_all_orgs`.
   */
  public data object DisabledForAllOrgs : InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9() {
    public override val `value`: String = "disabled_for_all_orgs"
  }

  /**
   * Documented value. Wire value: `enabled_for_selected_orgs`.
   */
  public data object EnabledForSelectedOrgs : InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9() {
    public override val `value`: String = "enabled_for_selected_orgs"
  }

  /**
   * Documented value. Wire value: `configured_by_org_admins`.
   */
  public data object ConfiguredByOrgAdmins : InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9() {
    public override val `value`: String = "configured_by_org_admins"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9 = when (value) {
      EnabledForAllOrgs.value -> EnabledForAllOrgs
      DisabledForAllOrgs.value -> DisabledForAllOrgs
      EnabledForSelectedOrgs.value -> EnabledForSelectedOrgs
      ConfiguredByOrgAdmins.value -> ConfiguredByOrgAdmins
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonPolicyStateX57d6ebb9) {
      encoder.encodeString(value.value)
    }
  }
}

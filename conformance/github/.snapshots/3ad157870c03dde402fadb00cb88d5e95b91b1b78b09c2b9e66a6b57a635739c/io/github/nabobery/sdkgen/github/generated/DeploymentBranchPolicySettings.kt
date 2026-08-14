package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The type of deployment branch policy for this environment. To allow all branches to deploy, set to `null`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy-settings
 */
@Serializable(with = DeploymentBranchPolicySettings.Serializer::class)
public class DeploymentBranchPolicySettings(
  /**
   * Whether only branches that match the specified name patterns can deploy to this environment.  If
   * `custom_branch_policies` is `true`, `protected_branches` must be `false`; if `custom_branch_policies` is `false`,
   * `protected_branches` must be `true`.
   */
  public val customBranchPolicies: Boolean,
  /**
   * Whether only branches with branch protection rules can deploy to this environment. If `protected_branches` is
   * `true`, `custom_branch_policies` must be `false`; if `protected_branches` is `false`, `custom_branch_policies` must
   * be `true`.
   */
  public val protectedBranches: Boolean,
) {
  public class Builder {
    private var customBranchPoliciesValue: Boolean? = null

    public var customBranchPolicies: Boolean
      get() = requireNotNull(customBranchPoliciesValue) { "customBranchPolicies is required" }
      set(`value`) {
        customBranchPoliciesValue = value
      }

    private var protectedBranchesValue: Boolean? = null

    public var protectedBranches: Boolean
      get() = requireNotNull(protectedBranchesValue) { "protectedBranches is required" }
      set(`value`) {
        protectedBranchesValue = value
      }

    public fun build(): DeploymentBranchPolicySettings {
      check(customBranchPoliciesValue != null) { "customBranchPolicies is required" }
      check(protectedBranchesValue != null) { "protectedBranches is required" }
      return DeploymentBranchPolicySettings(
        customBranchPolicies = customBranchPolicies,
        protectedBranches = protectedBranches,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeploymentBranchPolicySettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeploymentBranchPolicySettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeploymentBranchPolicySettings {
      val jsonDecoder = decoder.requireJsonDecoder("DeploymentBranchPolicySettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeploymentBranchPolicySettings must be a JSON object")
      val customBranchPolicies = json.decodeRequired<Boolean>(rawObject, "custom_branch_policies")
      val protectedBranches = json.decodeRequired<Boolean>(rawObject, "protected_branches")
      return DeploymentBranchPolicySettings(
        customBranchPolicies = customBranchPolicies,
        protectedBranches = protectedBranches,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeploymentBranchPolicySettings) {
      val jsonEncoder = encoder.requireJsonEncoder("DeploymentBranchPolicySettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom_branch_policies", json.encodeToJsonElement(value.customBranchPolicies))
        put("protected_branches", json.encodeToJsonElement(value.protectedBranches))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deploymentBranchPolicySettings(block: DeploymentBranchPolicySettings.Builder.() -> Unit): DeploymentBranchPolicySettings = DeploymentBranchPolicySettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeploymentBranchPolicySettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

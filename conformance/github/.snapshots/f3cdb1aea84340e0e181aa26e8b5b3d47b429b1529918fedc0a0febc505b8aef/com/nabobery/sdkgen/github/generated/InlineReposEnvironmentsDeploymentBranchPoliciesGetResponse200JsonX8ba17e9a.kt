package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment-branch-pol
 * icies/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment-branch-pol
 * icies/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a.Serializer::class)
public class InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a(
  branchPolicies: List<DeploymentBranchPolicy>,
  /**
   * The number of deployment branch policies for the environment.
   */
  public val totalCount: Int,
) {
  public val branchPolicies: List<DeploymentBranchPolicy> = branchPolicies.toList()

  public class Builder {
    private var branchPoliciesValue: List<DeploymentBranchPolicy>? = null

    public var branchPolicies: List<DeploymentBranchPolicy>
      get() = requireNotNull(branchPoliciesValue) { "branchPolicies is required" }.toList()
      set(`value`) {
        branchPoliciesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a {
      check(branchPoliciesValue != null) { "branchPolicies is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a(
        branchPolicies = branchPolicies,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a must be a JSON object")
      val branchPolicies = json.decodeRequired<List<DeploymentBranchPolicy>>(rawObject, "branch_policies")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a(
        branchPolicies = branchPolicies,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("branch_policies", json.encodeToJsonElement(value.branchPolicies))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a(block: InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a.Builder.() -> Unit): InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a = InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposEnvironmentsDeploymentBranchPoliciesGetResponse200JsonX8ba17e9a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-workflows-private-repos-request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-workflows-private-repos-request
 */
@Serializable(with = ActionsForkPrWorkflowsPrivateReposRequest.Serializer::class)
public class ActionsForkPrWorkflowsPrivateReposRequest(
  /**
   * Whether workflows triggered by pull requests from forks are allowed to run on private repositories.
   */
  public val runWorkflowsFromForkPullRequests: Boolean,
  /**
   * Whether workflows triggered by pull requests from forks require approval from a repository administrator to run.
   */
  public val requireApprovalForForkPrWorkflows: Boolean? = null,
  /**
   * Whether to make secrets and variables available to workflows triggered by pull requests from forks.
   */
  public val sendSecretsAndVariables: Boolean? = null,
  /**
   * Whether GitHub Actions can create pull requests or submit approving pull request reviews from a workflow triggered
   * by a fork pull request.
   */
  public val sendWriteTokensToWorkflows: Boolean? = null,
) {
  public class Builder {
    private var runWorkflowsFromForkPullRequestsValue: Boolean? = null

    public var runWorkflowsFromForkPullRequests: Boolean
      get() = requireNotNull(runWorkflowsFromForkPullRequestsValue) { "runWorkflowsFromForkPullRequests is required" }
      set(`value`) {
        runWorkflowsFromForkPullRequestsValue = value
      }

    /**
     * Whether workflows triggered by pull requests from forks require approval from a repository administrator to run.
     */
    public var requireApprovalForForkPrWorkflows: Boolean? = null

    /**
     * Whether to make secrets and variables available to workflows triggered by pull requests from forks.
     */
    public var sendSecretsAndVariables: Boolean? = null

    /**
     * Whether GitHub Actions can create pull requests or submit approving pull request reviews from a workflow
     * triggered by a fork pull request.
     */
    public var sendWriteTokensToWorkflows: Boolean? = null

    public fun build(): ActionsForkPrWorkflowsPrivateReposRequest {
      check(runWorkflowsFromForkPullRequestsValue != null) { "runWorkflowsFromForkPullRequests is required" }
      return ActionsForkPrWorkflowsPrivateReposRequest(
        runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests,
        requireApprovalForForkPrWorkflows = requireApprovalForForkPrWorkflows,
        sendSecretsAndVariables = sendSecretsAndVariables,
        sendWriteTokensToWorkflows = sendWriteTokensToWorkflows,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsForkPrWorkflowsPrivateReposRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsForkPrWorkflowsPrivateReposRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsForkPrWorkflowsPrivateReposRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsForkPrWorkflowsPrivateReposRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsForkPrWorkflowsPrivateReposRequest must be a JSON object")
      val runWorkflowsFromForkPullRequests = json.decodeRequired<Boolean>(rawObject, "run_workflows_from_fork_pull_requests")
      return ActionsForkPrWorkflowsPrivateReposRequest(
        runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests,
        requireApprovalForForkPrWorkflows = rawObject["require_approval_for_fork_pr_workflows"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        sendSecretsAndVariables = rawObject["send_secrets_and_variables"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        sendWriteTokensToWorkflows = rawObject["send_write_tokens_to_workflows"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsForkPrWorkflowsPrivateReposRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsForkPrWorkflowsPrivateReposRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("run_workflows_from_fork_pull_requests", json.encodeToJsonElement(value.runWorkflowsFromForkPullRequests))
        value.requireApprovalForForkPrWorkflows?.let { put("require_approval_for_fork_pr_workflows", json.encodeToJsonElement(it)) }
        value.sendSecretsAndVariables?.let { put("send_secrets_and_variables", json.encodeToJsonElement(it)) }
        value.sendWriteTokensToWorkflows?.let { put("send_write_tokens_to_workflows", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsForkPrWorkflowsPrivateReposRequest(block: ActionsForkPrWorkflowsPrivateReposRequest.Builder.() -> Unit): ActionsForkPrWorkflowsPrivateReposRequest = ActionsForkPrWorkflowsPrivateReposRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsForkPrWorkflowsPrivateReposRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

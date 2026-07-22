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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-workflows-private-repos.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-workflows-private-repos
 */
@Serializable(with = ActionsForkPrWorkflowsPrivateRepos.Serializer::class)
public class ActionsForkPrWorkflowsPrivateRepos(
  /**
   * Whether workflows triggered by pull requests from forks require approval from a repository administrator to run.
   */
  public val requireApprovalForForkPrWorkflows: Boolean,
  /**
   * Whether workflows triggered by pull requests from forks are allowed to run on private repositories.
   */
  public val runWorkflowsFromForkPullRequests: Boolean,
  /**
   * Whether to make secrets and variables available to workflows triggered by pull requests from forks.
   */
  public val sendSecretsAndVariables: Boolean,
  /**
   * Whether GitHub Actions can create pull requests or submit approving pull request reviews from a workflow triggered
   * by a fork pull request.
   */
  public val sendWriteTokensToWorkflows: Boolean,
) {
  public class Builder {
    private var requireApprovalForForkPrWorkflowsValue: Boolean? = null

    public var requireApprovalForForkPrWorkflows: Boolean
      get() = requireNotNull(requireApprovalForForkPrWorkflowsValue) { "requireApprovalForForkPrWorkflows is required" }
      set(`value`) {
        requireApprovalForForkPrWorkflowsValue = value
      }

    private var runWorkflowsFromForkPullRequestsValue: Boolean? = null

    public var runWorkflowsFromForkPullRequests: Boolean
      get() = requireNotNull(runWorkflowsFromForkPullRequestsValue) { "runWorkflowsFromForkPullRequests is required" }
      set(`value`) {
        runWorkflowsFromForkPullRequestsValue = value
      }

    private var sendSecretsAndVariablesValue: Boolean? = null

    public var sendSecretsAndVariables: Boolean
      get() = requireNotNull(sendSecretsAndVariablesValue) { "sendSecretsAndVariables is required" }
      set(`value`) {
        sendSecretsAndVariablesValue = value
      }

    private var sendWriteTokensToWorkflowsValue: Boolean? = null

    public var sendWriteTokensToWorkflows: Boolean
      get() = requireNotNull(sendWriteTokensToWorkflowsValue) { "sendWriteTokensToWorkflows is required" }
      set(`value`) {
        sendWriteTokensToWorkflowsValue = value
      }

    public fun build(): ActionsForkPrWorkflowsPrivateRepos {
      check(requireApprovalForForkPrWorkflowsValue != null) { "requireApprovalForForkPrWorkflows is required" }
      check(runWorkflowsFromForkPullRequestsValue != null) { "runWorkflowsFromForkPullRequests is required" }
      check(sendSecretsAndVariablesValue != null) { "sendSecretsAndVariables is required" }
      check(sendWriteTokensToWorkflowsValue != null) { "sendWriteTokensToWorkflows is required" }
      return ActionsForkPrWorkflowsPrivateRepos(
        requireApprovalForForkPrWorkflows = requireApprovalForForkPrWorkflows,
        runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests,
        sendSecretsAndVariables = sendSecretsAndVariables,
        sendWriteTokensToWorkflows = sendWriteTokensToWorkflows,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsForkPrWorkflowsPrivateRepos = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsForkPrWorkflowsPrivateRepos> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsForkPrWorkflowsPrivateRepos {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsForkPrWorkflowsPrivateRepos")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsForkPrWorkflowsPrivateRepos must be a JSON object")
      val requireApprovalForForkPrWorkflows = json.decodeRequired<Boolean>(rawObject, "require_approval_for_fork_pr_workflows")
      val runWorkflowsFromForkPullRequests = json.decodeRequired<Boolean>(rawObject, "run_workflows_from_fork_pull_requests")
      val sendSecretsAndVariables = json.decodeRequired<Boolean>(rawObject, "send_secrets_and_variables")
      val sendWriteTokensToWorkflows = json.decodeRequired<Boolean>(rawObject, "send_write_tokens_to_workflows")
      return ActionsForkPrWorkflowsPrivateRepos(
        requireApprovalForForkPrWorkflows = requireApprovalForForkPrWorkflows,
        runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests,
        sendSecretsAndVariables = sendSecretsAndVariables,
        sendWriteTokensToWorkflows = sendWriteTokensToWorkflows,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsForkPrWorkflowsPrivateRepos) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsForkPrWorkflowsPrivateRepos")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("require_approval_for_fork_pr_workflows", json.encodeToJsonElement(value.requireApprovalForForkPrWorkflows))
        put("run_workflows_from_fork_pull_requests", json.encodeToJsonElement(value.runWorkflowsFromForkPullRequests))
        put("send_secrets_and_variables", json.encodeToJsonElement(value.sendSecretsAndVariables))
        put("send_write_tokens_to_workflows", json.encodeToJsonElement(value.sendWriteTokensToWorkflows))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsForkPrWorkflowsPrivateRepos(block: ActionsForkPrWorkflowsPrivateRepos.Builder.() -> Unit): ActionsForkPrWorkflowsPrivateRepos = ActionsForkPrWorkflowsPrivateRepos.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsForkPrWorkflowsPrivateRepos is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

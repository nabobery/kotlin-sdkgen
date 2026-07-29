package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/pull_requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/pull_requests/items/properties/base
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6.Serializer::class)
public class InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6(
  public val ref: String,
  public val repo: InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemBaseRepoXdc53ca8f,
  public val sha: String,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repoValue:
        InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemBaseRepoXdc53ca8f? = null

    public var repo: InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemBaseRepoXdc53ca8f
      get() = requireNotNull(repoValue) { "repo is required" }
      set(`value`) {
        repoValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public fun build(): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemBaseRepoXdc53ca8f>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", value.ref)
        put("repo", json.encodeToJsonElement(value.repo))
        put("sha", value.sha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6(block: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6.Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6 = InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemBaseX9a7edbc6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

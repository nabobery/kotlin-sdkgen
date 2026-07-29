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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/pull_requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/pull_requests/items/properties/base
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42.Serializer::class)
public class InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42(
  public val ref: String,
  public val repo: InlineWebhookDeploymentRevd4e8WorkflowRunPullRequestsItemBaseRepoXf80098cb,
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
        InlineWebhookDeploymentRevd4e8WorkflowRunPullRequestsItemBaseRepoXf80098cb? = null

    public var repo: InlineWebhookDeploymentRevd4e8WorkflowRunPullRequestsItemBaseRepoXf80098cb
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

    public fun build(): InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentRevd4e8WorkflowRunPullRequestsItemBaseRepoXf80098cb>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42")
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

public fun inlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42(block: InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42.Builder.() -> Unit): InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42 = InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewRequestedWorkflowRunPullRequestsItemBaseX149c9d42 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

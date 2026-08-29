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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/pull_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/pull_requests/items/properties/head
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319.Serializer::class)
public class InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319(
  public val ref: String,
  public val repo: InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemHeadRepoXf7b146b6,
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
        InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemHeadRepoXf7b146b6? = null

    public var repo: InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemHeadRepoXf7b146b6
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

    public fun build(): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentRevd571WorkflowRunPullRequestsItemHeadRepoXf7b146b6>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319")
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

public fun inlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319(block: InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319.Builder.() -> Unit): InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319 = InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewRejectedWorkflowRunPullRequestsItemHeadX1f1b6319 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

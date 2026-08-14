package io.github.nabobery.sdkgen.github.generated

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
 * s/pull_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/pull_requests/items/properties/head
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7.Serializer::class)
public class InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7(
  public val ref: String,
  public val repo: InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026,
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
        InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026? = null

    public var repo: InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026
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

    public fun build(): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentRevc662WorkflowRunPullRequestsItemHeadRepoX80fa8026>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7")
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

public fun inlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7(block: InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7.Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7 = InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemHeadXbb2246e7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

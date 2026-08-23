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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /pull_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /pull_requests/items/properties/head
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1.Serializer::class)
public class InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1(
  public val ref: String,
  public val repo: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadRepoX489af1fc,
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
        InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadRepoX489af1fc? = null

    public var repo:
        InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadRepoX489af1fc
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

    public fun build(): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadRepoX489af1fc>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1")
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

public fun inlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1(block: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1.Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1 = InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemHeadXe66ae4d1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

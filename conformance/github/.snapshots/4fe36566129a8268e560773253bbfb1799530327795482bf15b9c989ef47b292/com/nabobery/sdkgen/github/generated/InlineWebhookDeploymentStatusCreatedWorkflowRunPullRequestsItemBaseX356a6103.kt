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
 * /pull_requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /pull_requests/items/properties/base
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103.Serializer::class)
public class InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103(
  public val ref: String,
  public val repo: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseRepoX9f14d7cf,
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
        InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseRepoX9f14d7cf? = null

    public var repo:
        InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseRepoX9f14d7cf
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

    public fun build(): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseRepoX9f14d7cf>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103")
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

public fun inlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103(block: InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103.Builder.() -> Unit): InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103 = InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentStatusCreatedWorkflowRunPullRequestsItemBaseX356a6103 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

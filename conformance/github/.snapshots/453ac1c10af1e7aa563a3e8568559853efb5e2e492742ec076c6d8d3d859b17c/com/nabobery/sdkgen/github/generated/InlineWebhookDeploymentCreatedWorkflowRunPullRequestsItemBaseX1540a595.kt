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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/pull_r
 * equests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/pull_r
 * equests/items/properties/base
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595.Serializer::class)
public class InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595(
  public val ref: String,
  public val repo: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseRepoX4afc5615,
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
        InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseRepoX4afc5615? = null

    public var repo: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseRepoX4afc5615
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

    public fun build(): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseRepoX4afc5615>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595")
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

public fun inlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595(block: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595.Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595 = InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemBaseX1540a595 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

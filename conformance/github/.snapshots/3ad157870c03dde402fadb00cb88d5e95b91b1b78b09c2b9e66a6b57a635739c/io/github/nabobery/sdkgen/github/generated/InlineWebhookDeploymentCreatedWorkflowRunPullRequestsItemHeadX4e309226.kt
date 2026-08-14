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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/pull_r
 * equests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/pull_r
 * equests/items/properties/head
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226.Serializer::class)
public class InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226(
  public val ref: String,
  public val repo: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadRepoX396e2606,
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
        InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadRepoX396e2606? = null

    public var repo: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadRepoX396e2606
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

    public fun build(): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadRepoX396e2606>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226")
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

public fun inlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226(block: InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226.Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226 = InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunPullRequestsItemHeadX4e309226 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

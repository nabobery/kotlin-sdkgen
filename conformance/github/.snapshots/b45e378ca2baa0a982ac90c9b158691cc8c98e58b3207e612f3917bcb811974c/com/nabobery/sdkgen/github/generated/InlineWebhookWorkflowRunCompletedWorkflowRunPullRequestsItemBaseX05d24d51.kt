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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items/properties/base
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51.Serializer::class)
public class InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51(
  public val ref: String,
  public val repo: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2,
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
        InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2? = null

    public var repo: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2
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

    public fun build(): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseRepoX73ae06f2>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51")
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

public fun inlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51(block: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51.Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51 = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemBaseX05d24d51 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

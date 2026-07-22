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
 * ll_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/pu
 * ll_requests/items/properties/head
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d.Serializer::class)
public class InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d(
  public val ref: String,
  public val repo: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadRepoXbd0a210f,
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
        InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadRepoXbd0a210f? = null

    public var repo: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadRepoXbd0a210f
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

    public fun build(): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadRepoXbd0a210f>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d")
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

public fun inlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d(block: InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d.Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d = InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemHeadX47e2458d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/pu
 * ll_requests/items/properties/base.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/pu
 * ll_requests/items/properties/base
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f.Serializer::class)
public class InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f(
  public val ref: String,
  public val repo: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseRepoX903e7bb7,
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
        InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseRepoX903e7bb7? = null

    public var repo: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseRepoX903e7bb7
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

    public fun build(): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseRepoX903e7bb7>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f")
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

public fun inlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f(block: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f.Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f = InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemBaseX7acaa06f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

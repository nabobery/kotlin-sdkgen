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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * pull_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * pull_requests/items/properties/head
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae(
  public val ref: String,
  public val repo: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadRepoX2c607256,
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
        InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadRepoX2c607256? = null

    public var repo: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadRepoX2c607256
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

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadRepoX2c607256>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae")
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

public fun inlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae(block: InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae = InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunPullRequestsItemHeadX20974aae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

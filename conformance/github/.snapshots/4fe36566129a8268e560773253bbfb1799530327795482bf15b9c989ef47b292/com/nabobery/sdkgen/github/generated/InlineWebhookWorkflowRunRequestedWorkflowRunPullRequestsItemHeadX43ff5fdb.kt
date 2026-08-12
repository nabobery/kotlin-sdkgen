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
 * ll_requests/items/properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/pu
 * ll_requests/items/properties/head
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb.Serializer::class)
public class InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb(
  public val ref: String,
  public val repo: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadRepoXc967fce6,
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
        InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadRepoXc967fce6? = null

    public var repo: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadRepoXc967fce6
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

    public fun build(): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadRepoXc967fce6>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb")
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

public fun inlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb(block: InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb.Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb = InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunPullRequestsItemHeadX43ff5fdb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

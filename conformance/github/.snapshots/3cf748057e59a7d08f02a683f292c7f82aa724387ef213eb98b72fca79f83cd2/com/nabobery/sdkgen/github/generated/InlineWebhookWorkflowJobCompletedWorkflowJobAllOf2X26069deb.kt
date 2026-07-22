package com.nabobery.sdkgen.github.generated

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed/properties/workflow_job/allOf/1
 */
@Serializable(with = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb.Serializer::class)
public class InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb(
  public val conclusion: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f,
  public val checkRunUrl: String? = null,
  public val completedAt: String? = null,
  /**
   * The time that the job created.
   */
  public val createdAt: String? = null,
  /**
   * The name of the current branch.
   */
  public val headBranch: String? = null,
  public val headSha: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val labels: List<String?>? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val runAttempt: Int? = null,
  public val runId: Int? = null,
  public val runUrl: String? = null,
  public val runnerGroupId: Double? = null,
  public val runnerGroupName: String? = null,
  public val runnerId: Double? = null,
  public val runnerName: String? = null,
  public val startedAt: String? = null,
  public val status: String? = null,
  public val steps: List<JsonObject?>? = null,
  public val url: String? = null,
  /**
   * The name of the workflow.
   */
  public val workflowName: String? = null,
) {
  public class Builder {
    private var conclusionValue:
        InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f? = null

    public var conclusion: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f
      get() = requireNotNull(conclusionValue) { "conclusion is required" }
      set(`value`) {
        conclusionValue = value
      }

    public var checkRunUrl: String? = null

    public var completedAt: String? = null

    /**
     * The time that the job created.
     */
    public var createdAt: String? = null

    /**
     * The name of the current branch.
     */
    public var headBranch: String? = null

    public var headSha: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var labels: List<String?>? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var runAttempt: Int? = null

    public var runId: Int? = null

    public var runUrl: String? = null

    public var runnerGroupId: Double? = null

    public var runnerGroupName: String? = null

    public var runnerId: Double? = null

    public var runnerName: String? = null

    public var startedAt: String? = null

    public var status: String? = null

    public var steps: List<JsonObject?>? = null

    public var url: String? = null

    /**
     * The name of the workflow.
     */
    public var workflowName: String? = null

    public fun build(): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb {
      check(conclusionValue != null) { "conclusion is required" }
      return InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb(
        conclusion = conclusion,
        checkRunUrl = checkRunUrl,
        completedAt = completedAt,
        createdAt = createdAt,
        headBranch = headBranch,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        labels = labels,
        name = name,
        nodeId = nodeId,
        runAttempt = runAttempt,
        runId = runId,
        runUrl = runUrl,
        runnerGroupId = runnerGroupId,
        runnerGroupName = runnerGroupName,
        runnerId = runnerId,
        runnerName = runnerName,
        startedAt = startedAt,
        status = status,
        steps = steps,
        url = url,
        workflowName = workflowName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb must be a JSON object")
      val conclusion = json.decodeRequired<InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2ConclusionX18b7b09f>(rawObject, "conclusion")
      return InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb(
        conclusion = conclusion,
        checkRunUrl = rawObject["check_run_url"]?.let { json.decodeFromJsonElement<String>(it) },
        completedAt = rawObject["completed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        headBranch = rawObject["head_branch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        headSha = rawObject["head_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<String?>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        runAttempt = rawObject["run_attempt"]?.let { json.decodeFromJsonElement<Int>(it) },
        runId = rawObject["run_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        runUrl = rawObject["run_url"]?.let { json.decodeFromJsonElement<String>(it) },
        runnerGroupId = rawObject["runner_group_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        runnerGroupName = rawObject["runner_group_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        runnerId = rawObject["runner_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        runnerName = rawObject["runner_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        startedAt = rawObject["started_at"]?.let { json.decodeFromJsonElement<String>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
        steps = rawObject["steps"]?.let { json.decodeFromJsonElement<List<JsonObject?>>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        workflowName = rawObject["workflow_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("conclusion", json.encodeToJsonElement(value.conclusion))
        value.checkRunUrl?.let { put("check_run_url", it) }
        value.completedAt?.let { put("completed_at", it) }
        value.createdAt?.let { put("created_at", it) }
        value.headBranch?.let { put("head_branch", it) }
        value.headSha?.let { put("head_sha", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.runAttempt?.let { put("run_attempt", json.encodeToJsonElement(it)) }
        value.runId?.let { put("run_id", json.encodeToJsonElement(it)) }
        value.runUrl?.let { put("run_url", it) }
        value.runnerGroupId?.let { put("runner_group_id", json.encodeToJsonElement(it)) }
        value.runnerGroupName?.let { put("runner_group_name", it) }
        value.runnerId?.let { put("runner_id", json.encodeToJsonElement(it)) }
        value.runnerName?.let { put("runner_name", it) }
        value.startedAt?.let { put("started_at", it) }
        value.status?.let { put("status", it) }
        value.steps?.let { put("steps", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
        value.workflowName?.let { put("workflow_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb(block: InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb.Builder.() -> Unit): InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb = InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowJobCompletedWorkflowJobAllOf2X26069deb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

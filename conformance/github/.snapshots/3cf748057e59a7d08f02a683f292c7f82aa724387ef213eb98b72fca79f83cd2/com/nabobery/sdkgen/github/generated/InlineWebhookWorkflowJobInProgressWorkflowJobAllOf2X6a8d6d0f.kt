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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/1
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f.Serializer::class)
public class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f(
  public val status: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StatusX45436e42,
  steps: List<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0>,
  public val checkRunUrl: String? = null,
  public val completedAt: String? = null,
  public val conclusion: String? = null,
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
  public val labels: List<String>? = null,
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
  public val url: String? = null,
  /**
   * The name of the workflow.
   */
  public val workflowName: String? = null,
) {
  public val steps: List<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0> =
      steps.toList()

  public class Builder {
    private var statusValue: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StatusX45436e42? =
        null

    public var status: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StatusX45436e42
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var stepsValue:
        List<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0>? = null

    public var steps: List<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0>
      get() = requireNotNull(stepsValue) { "steps is required" }
      set(`value`) {
        stepsValue = value
      }

    public var checkRunUrl: String? = null

    public var completedAt: String? = null

    public var conclusion: String? = null

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

    public var labels: List<String>? = null

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

    public var url: String? = null

    /**
     * The name of the workflow.
     */
    public var workflowName: String? = null

    public fun build(): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f {
      check(statusValue != null) { "status is required" }
      check(stepsValue != null) { "steps is required" }
      return InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f(
        status = status,
        steps = steps,
        checkRunUrl = checkRunUrl,
        completedAt = completedAt,
        conclusion = conclusion,
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
        url = url,
        workflowName = workflowName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f must be a JSON object")
      val status = json.decodeRequired<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StatusX45436e42>(rawObject, "status")
      val steps = json.decodeRequired<List<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0>>(rawObject, "steps")
      return InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f(
        status = status,
        steps = steps,
        checkRunUrl = rawObject["check_run_url"]?.let { json.decodeFromJsonElement<String>(it) },
        completedAt = rawObject["completed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        conclusion = rawObject["conclusion"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        headBranch = rawObject["head_branch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        headSha = rawObject["head_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<String>>(it) },
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
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        workflowName = rawObject["workflow_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("steps", json.encodeToJsonElement(value.steps))
        value.checkRunUrl?.let { put("check_run_url", it) }
        value.completedAt?.let { put("completed_at", it) }
        value.conclusion?.let { put("conclusion", it) }
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
        value.url?.let { put("url", it) }
        value.workflowName?.let { put("workflow_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f(block: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f.Builder.() -> Unit): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2X6a8d6d0f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-waiting/properties/workflow_job
 */
@Serializable(with = InlineWebhookWorkflowJobWaitingWorkflowJobXed204101.Serializer::class)
public class InlineWebhookWorkflowJobWaitingWorkflowJobXed204101(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val checkRunUrl: String,
  public val completedAt: String?,
  public val conclusion: String?,
  /**
   * The time that the job created.
   */
  public val createdAt: String,
  /**
   * The name of the current branch.
   */
  public val headBranch: String?,
  public val headSha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  labels: List<String>,
  public val name: String,
  public val nodeId: String,
  public val runAttempt: Int,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val runId: Double,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val runUrl: String,
  public val runnerGroupId: Int?,
  public val runnerGroupName: String?,
  public val runnerId: Int?,
  public val runnerName: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startedAt: String,
  public val status: InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179,
  steps: List<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemXac2b2333>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * The name of the workflow.
   */
  public val workflowName: String?,
) {
  public val labels: List<String> = labels.toList()

  public val steps: List<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemXac2b2333> =
      steps.toList()

  public class Builder {
    private var checkRunUrlValue: String? = null

    public var checkRunUrl: String
      get() = requireNotNull(checkRunUrlValue) { "checkRunUrl is required" }
      set(`value`) {
        checkRunUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var headShaValue: String? = null

    public var headSha: String
      get() = requireNotNull(headShaValue) { "headSha is required" }
      set(`value`) {
        headShaValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var labelsValue: List<String>? = null

    public var labels: List<String>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var runAttemptValue: Int? = null

    public var runAttempt: Int
      get() = requireNotNull(runAttemptValue) { "runAttempt is required" }
      set(`value`) {
        runAttemptValue = value
      }

    private var runIdValue: Double? = null

    public var runId: Double
      get() = requireNotNull(runIdValue) { "runId is required" }
      set(`value`) {
        runIdValue = value
      }

    private var runUrlValue: String? = null

    public var runUrl: String
      get() = requireNotNull(runUrlValue) { "runUrl is required" }
      set(`value`) {
        runUrlValue = value
      }

    private var startedAtValue: String? = null

    public var startedAt: String
      get() = requireNotNull(startedAtValue) { "startedAt is required" }
      set(`value`) {
        startedAtValue = value
      }

    private var statusValue: InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179? = null

    public var status: InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var stepsValue: List<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemXac2b2333>? =
        null

    public var steps: List<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemXac2b2333>
      get() = requireNotNull(stepsValue) { "steps is required" }.toList()
      set(`value`) {
        stepsValue = value.toList()
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var conclusionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: String?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var headBranchState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the current branch.
     * Required nullable field; assigning `null` records present-null.
     */
    public var headBranch: String?
      get() = headBranchState.valueOrNull()
      set(`value`) {
        headBranchState = value.toNullableFieldState()
      }

    private var runnerGroupIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerGroupId: Int?
      get() = runnerGroupIdState.valueOrNull()
      set(`value`) {
        runnerGroupIdState = value.toNullableFieldState()
      }

    private var runnerGroupNameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerGroupName: String?
      get() = runnerGroupNameState.valueOrNull()
      set(`value`) {
        runnerGroupNameState = value.toNullableFieldState()
      }

    private var runnerIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerId: Int?
      get() = runnerIdState.valueOrNull()
      set(`value`) {
        runnerIdState = value.toNullableFieldState()
      }

    private var runnerNameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerName: String?
      get() = runnerNameState.valueOrNull()
      set(`value`) {
        runnerNameState = value.toNullableFieldState()
      }

    private var workflowNameState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the workflow.
     * Required nullable field; assigning `null` records present-null.
     */
    public var workflowName: String?
      get() = workflowNameState.valueOrNull()
      set(`value`) {
        workflowNameState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 {
      check(checkRunUrlValue != null) { "checkRunUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(headShaValue != null) { "headSha is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(labelsValue != null) { "labels is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(runAttemptValue != null) { "runAttempt is required" }
      check(runIdValue != null) { "runId is required" }
      check(runUrlValue != null) { "runUrl is required" }
      check(startedAtValue != null) { "startedAt is required" }
      check(statusValue != null) { "status is required" }
      check(stepsValue != null) { "steps is required" }
      check(urlValue != null) { "url is required" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(headBranchState !== FieldState.Absent) { "headBranch is required, even when null" }
      check(runnerGroupIdState !== FieldState.Absent) { "runnerGroupId is required, even when null" }
      check(runnerGroupNameState !== FieldState.Absent) { "runnerGroupName is required, even when null" }
      check(runnerIdState !== FieldState.Absent) { "runnerId is required, even when null" }
      check(runnerNameState !== FieldState.Absent) { "runnerName is required, even when null" }
      check(workflowNameState !== FieldState.Absent) { "workflowName is required, even when null" }
      return InlineWebhookWorkflowJobWaitingWorkflowJobXed204101(
        checkRunUrl = checkRunUrl,
        completedAt = completedAtState.valueOrNull(),
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        headBranch = headBranchState.valueOrNull(),
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        labels = labels,
        name = name,
        nodeId = nodeId,
        runAttempt = runAttempt,
        runId = runId,
        runUrl = runUrl,
        runnerGroupId = runnerGroupIdState.valueOrNull(),
        runnerGroupName = runnerGroupNameState.valueOrNull(),
        runnerId = runnerIdState.valueOrNull(),
        runnerName = runnerNameState.valueOrNull(),
        startedAt = startedAt,
        status = status,
        steps = steps,
        url = url,
        workflowName = workflowNameState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobWaitingWorkflowJobXed204101> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 must be a JSON object")
      val checkRunUrl = json.decodeRequired<String>(rawObject, "check_run_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val runAttempt = json.decodeRequired<Int>(rawObject, "run_attempt")
      val runId = json.decodeRequired<Double>(rawObject, "run_id")
      val runUrl = json.decodeRequired<String>(rawObject, "run_url")
      val startedAt = json.decodeRequired<String>(rawObject, "started_at")
      val status = json.decodeRequired<InlineWebhookWorkflowJobWaitingWorkflowJobStatusX51dac179>(rawObject, "status")
      val steps = json.decodeRequired<List<InlineWebhookWorkflowJobWaitingWorkflowJobStepsItemXac2b2333>>(rawObject, "steps")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_group_id")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'runner_group_id'")
      }
      val runnerGroupId = rawObject["runner_group_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_group_name")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'runner_group_name'")
      }
      val runnerGroupName = rawObject["runner_group_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_id")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'runner_id'")
      }
      val runnerId = rawObject["runner_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_name")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'runner_name'")
      }
      val runnerName = rawObject["runner_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("workflow_name")) {
        throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property 'workflow_name'")
      }
      val workflowName = rawObject["workflow_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookWorkflowJobWaitingWorkflowJobXed204101(
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
        status = status,
        steps = steps,
        url = url,
        workflowName = workflowName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobWaitingWorkflowJobXed204101) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("check_run_url", value.checkRunUrl)
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("head_branch", value.headBranch?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("labels", json.encodeToJsonElement(value.labels))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("run_attempt", json.encodeToJsonElement(value.runAttempt))
        put("run_id", json.encodeToJsonElement(value.runId))
        put("run_url", value.runUrl)
        put("runner_group_id", value.runnerGroupId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("runner_group_name", value.runnerGroupName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("runner_id", value.runnerId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("runner_name", value.runnerName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("started_at", value.startedAt)
        put("status", json.encodeToJsonElement(value.status))
        put("steps", json.encodeToJsonElement(value.steps))
        put("url", value.url)
        put("workflow_name", value.workflowName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowJobWaitingWorkflowJobXed204101(block: InlineWebhookWorkflowJobWaitingWorkflowJobXed204101.Builder.() -> Unit): InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 = InlineWebhookWorkflowJobWaitingWorkflowJobXed204101.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookWorkflowJobWaitingWorkflowJobXed204101 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}

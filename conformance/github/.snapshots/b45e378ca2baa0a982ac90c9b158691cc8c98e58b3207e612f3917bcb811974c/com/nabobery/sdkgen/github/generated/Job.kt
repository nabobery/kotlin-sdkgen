package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Information of a job execution in a workflow run
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/job
 */
@Serializable(with = Job.Serializer::class)
public class Job internal constructor(
  public val checkRunUrl: String,
  /**
   * The time that the job finished, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String?,
  /**
   * The outcome of the job.
   */
  public val conclusion: InlineJobConclusionXaafde230?,
  /**
   * The time that the job created, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The name of the current branch.
   */
  public val headBranch: String?,
  /**
   * The SHA of the commit that is being run.
   */
  public val headSha: String,
  public val htmlUrl: String?,
  /**
   * The id of the job.
   */
  public val id: Int,
  labels: List<String>,
  /**
   * The name of the job.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * The id of the associated workflow run.
   */
  public val runId: Int,
  public val runUrl: String,
  /**
   * The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be
   * null.)
   */
  public val runnerGroupId: Int?,
  /**
   * The name of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will
   * be null.)
   */
  public val runnerGroupName: String?,
  /**
   * The ID of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be
   * null.)
   */
  public val runnerId: Int?,
  /**
   * The name of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be
   * null.)
   */
  public val runnerName: String?,
  /**
   * The time that the job started, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startedAt: String,
  /**
   * The phase of the lifecycle that the job is currently in.
   */
  public val status: InlineJobStatusX8d47bb87,
  public val url: String,
  /**
   * The name of the workflow.
   */
  public val workflowName: String?,
  private val runAttemptState: FieldState<Int>,
  stepsState: FieldState<List<InlineJobStepsItemX5c6597f4>>,
) {
  /**
   * Labels for the workflow job. Specified by the "runs_on" attribute in the action's workflow file.
   */
  public val labels: List<String> = labels.toList()

  private val stepsState: FieldState<List<InlineJobStepsItemX5c6597f4>> =
      stepsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run.
   */
  public val runAttempt: Int?
    get() = runAttemptState.valueOrNull()

  /**
   * Steps in this job.
   */
  public val steps: List<InlineJobStepsItemX5c6597f4>?
    get() = stepsState.valueOrNull()

  public constructor(
    checkRunUrl: String,
    completedAt: String?,
    conclusion: InlineJobConclusionXaafde230?,
    createdAt: String,
    headBranch: String?,
    headSha: String,
    htmlUrl: String?,
    id: Int,
    labels: List<String>,
    name: String,
    nodeId: String,
    runId: Int,
    runUrl: String,
    runnerGroupId: Int?,
    runnerGroupName: String?,
    runnerId: Int?,
    runnerName: String?,
    startedAt: String,
    status: InlineJobStatusX8d47bb87,
    url: String,
    workflowName: String?,
  ) : this(checkRunUrl = checkRunUrl,
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
  runId = runId,
  runUrl = runUrl,
  runnerGroupId = runnerGroupId,
  runnerGroupName = runnerGroupName,
  runnerId = runnerId,
  runnerName = runnerName,
  startedAt = startedAt,
  status = status,
  url = url,
  workflowName = workflowName,
  runAttemptState = FieldState.Absent,
  stepsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `run_attempt`.
   */
  public fun runAttemptPresence(): FieldPresence = runAttemptState.presence

  /**
   * Returns the wire presence of `steps`.
   */
  public fun stepsPresence(): FieldPresence = stepsState.presence

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

    private var runIdValue: Int? = null

    public var runId: Int
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

    private var statusValue: InlineJobStatusX8d47bb87? = null

    public var status: InlineJobStatusX8d47bb87
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time that the job finished, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var conclusionState: FieldState<InlineJobConclusionXaafde230?> = FieldState.Absent

    /**
     * The outcome of the job.
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineJobConclusionXaafde230?
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

    private var htmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        htmlUrlState = value.toNullableFieldState()
      }

    private var runnerGroupIdState: FieldState<Int?> = FieldState.Absent

    /**
     * The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will
     * be null.)
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerGroupId: Int?
      get() = runnerGroupIdState.valueOrNull()
      set(`value`) {
        runnerGroupIdState = value.toNullableFieldState()
      }

    private var runnerGroupNameState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this
     * will be null.)
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerGroupName: String?
      get() = runnerGroupNameState.valueOrNull()
      set(`value`) {
        runnerGroupNameState = value.toNullableFieldState()
      }

    private var runnerIdState: FieldState<Int?> = FieldState.Absent

    /**
     * The ID of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be
     * null.)
     * Required nullable field; assigning `null` records present-null.
     */
    public var runnerId: Int?
      get() = runnerIdState.valueOrNull()
      set(`value`) {
        runnerIdState = value.toNullableFieldState()
      }

    private var runnerNameState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be
     * null.)
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

    private var runAttemptState: FieldState<Int> = FieldState.Absent

    /**
     * Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runAttempt: Int?
      get() = runAttemptState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runAttempt is not nullable; call unsetRunAttempt() to omit it" }
        runAttemptState = FieldState.Value(present)
      }

    private var stepsState: FieldState<List<InlineJobStepsItemX5c6597f4>> = FieldState.Absent

    /**
     * Steps in this job.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var steps: List<InlineJobStepsItemX5c6597f4>?
      get() = stepsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "steps is not nullable; call unsetSteps() to omit it" }
        stepsState = FieldState.Value(present.toList())
      }

    /**
     * Omits `run_attempt` from serialized output.
     */
    public fun unsetRunAttempt() {
      runAttemptState = FieldState.Absent
    }

    /**
     * Omits `steps` from serialized output.
     */
    public fun unsetSteps() {
      stepsState = FieldState.Absent
    }

    public fun build(): Job {
      check(checkRunUrlValue != null) { "checkRunUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(headShaValue != null) { "headSha is required" }
      check(idValue != null) { "id is required" }
      check(labelsValue != null) { "labels is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(runIdValue != null) { "runId is required" }
      check(runUrlValue != null) { "runUrl is required" }
      check(startedAtValue != null) { "startedAt is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(headBranchState !== FieldState.Absent) { "headBranch is required, even when null" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      check(runnerGroupIdState !== FieldState.Absent) { "runnerGroupId is required, even when null" }
      check(runnerGroupNameState !== FieldState.Absent) { "runnerGroupName is required, even when null" }
      check(runnerIdState !== FieldState.Absent) { "runnerId is required, even when null" }
      check(runnerNameState !== FieldState.Absent) { "runnerName is required, even when null" }
      check(workflowNameState !== FieldState.Absent) { "workflowName is required, even when null" }
      return Job(
        checkRunUrl = checkRunUrl,
        completedAt = completedAtState.valueOrNull(),
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        headBranch = headBranchState.valueOrNull(),
        headSha = headSha,
        htmlUrl = htmlUrlState.valueOrNull(),
        id = id,
        labels = labels,
        name = name,
        nodeId = nodeId,
        runId = runId,
        runUrl = runUrl,
        runnerGroupId = runnerGroupIdState.valueOrNull(),
        runnerGroupName = runnerGroupNameState.valueOrNull(),
        runnerId = runnerIdState.valueOrNull(),
        runnerName = runnerNameState.valueOrNull(),
        startedAt = startedAt,
        status = status,
        url = url,
        workflowName = workflowNameState.valueOrNull(),
        runAttemptState = runAttemptState,
        stepsState = stepsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Job = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Job> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Job {
      val jsonDecoder = decoder.requireJsonDecoder("Job")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Job must be a JSON object")
      val checkRunUrl = json.decodeRequired<String>(rawObject, "check_run_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val runId = json.decodeRequired<Int>(rawObject, "run_id")
      val runUrl = json.decodeRequired<String>(rawObject, "run_url")
      val startedAt = json.decodeRequired<String>(rawObject, "started_at")
      val status = json.decodeRequired<InlineJobStatusX8d47bb87>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("Job is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("Job is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineJobConclusionXaafde230?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("Job is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("Job is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_group_id")) {
        throw SerializationException("Job is missing required property 'runner_group_id'")
      }
      val runnerGroupId = rawObject["runner_group_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_group_name")) {
        throw SerializationException("Job is missing required property 'runner_group_name'")
      }
      val runnerGroupName = rawObject["runner_group_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_id")) {
        throw SerializationException("Job is missing required property 'runner_id'")
      }
      val runnerId = rawObject["runner_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("runner_name")) {
        throw SerializationException("Job is missing required property 'runner_name'")
      }
      val runnerName = rawObject["runner_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("workflow_name")) {
        throw SerializationException("Job is missing required property 'workflow_name'")
      }
      val workflowName = rawObject["workflow_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Job(
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
        runId = runId,
        runUrl = runUrl,
        runnerGroupId = runnerGroupId,
        runnerGroupName = runnerGroupName,
        runnerId = runnerId,
        runnerName = runnerName,
        startedAt = startedAt,
        status = status,
        url = url,
        workflowName = workflowName,
        runAttemptState = json.decodeOptional(rawObject, "run_attempt", nullable = false),
        stepsState = json.decodeOptional(rawObject, "steps", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Job) {
      val jsonEncoder = encoder.requireJsonEncoder("Job")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("check_run_url", value.checkRunUrl)
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("head_branch", value.headBranch?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("labels", json.encodeToJsonElement(value.labels))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("run_id", json.encodeToJsonElement(value.runId))
        put("run_url", value.runUrl)
        put("runner_group_id", value.runnerGroupId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("runner_group_name", value.runnerGroupName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("runner_id", value.runnerId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("runner_name", value.runnerName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("started_at", value.startedAt)
        put("status", json.encodeToJsonElement(value.status))
        put("url", value.url)
        put("workflow_name", value.workflowName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("run_attempt", value.runAttemptState, json::encodeToJsonElement)
        putState("steps", value.stepsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun job(block: Job.Builder.() -> Unit): Job = Job.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Job is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Job property '" + name + "' is not nullable")
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

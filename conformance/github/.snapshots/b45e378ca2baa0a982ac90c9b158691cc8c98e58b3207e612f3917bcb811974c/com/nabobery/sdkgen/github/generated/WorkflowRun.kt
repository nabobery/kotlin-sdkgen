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
 * An invocation of a workflow
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow-run
 */
@Serializable(with = WorkflowRun.Serializer::class)
public class WorkflowRun internal constructor(
  /**
   * The URL to the artifacts for the workflow run.
   */
  public val artifactsUrl: String,
  /**
   * The URL to cancel the workflow run.
   */
  public val cancelUrl: String,
  /**
   * The URL to the associated check suite.
   */
  public val checkSuiteUrl: String,
  public val conclusion: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The event-specific title associated with the run or the run-name if set, or the value of `run-name` if it is set in
   * the workflow.
   */
  public val displayTitle: String,
  public val event: String,
  public val headBranch: String?,
  public val headCommit: NullableSimpleCommit?,
  public val headRepository: MinimalRepository,
  /**
   * The SHA of the head commit that points to the version of the workflow being run.
   */
  public val headSha: String,
  public val htmlUrl: String,
  /**
   * The ID of the workflow run.
   */
  public val id: Int,
  /**
   * The URL to the jobs for the workflow run.
   */
  public val jobsUrl: String,
  /**
   * The URL to download the logs for the workflow run.
   */
  public val logsUrl: String,
  public val nodeId: String,
  /**
   * The full path of the workflow
   */
  public val path: String,
  pullRequests: List<PullRequestMinimal>?,
  public val repository: MinimalRepository,
  /**
   * The URL to rerun the workflow run.
   */
  public val rerunUrl: String,
  /**
   * The auto incrementing run number for the workflow run.
   */
  public val runNumber: Int,
  public val status: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * The URL to the workflow run.
   */
  public val url: String,
  /**
   * The ID of the parent workflow.
   */
  public val workflowId: Int,
  /**
   * The URL to the workflow.
   */
  public val workflowUrl: String,
  private val actorState: FieldState<SimpleUser>,
  private val checkSuiteIdState: FieldState<Int>,
  private val checkSuiteNodeIdState: FieldState<String>,
  private val headRepositoryIdState: FieldState<Int>,
  private val nameState: FieldState<String?>,
  private val previousAttemptUrlState: FieldState<String?>,
  referencedWorkflowsState: FieldState<List<ReferencedWorkflow>?>,
  private val runAttemptState: FieldState<Int>,
  private val runStartedAtState: FieldState<String>,
  private val triggeringActorState: FieldState<SimpleUser>,
) {
  /**
   * Pull requests that are open with a `head_sha` or `head_branch` that matches the workflow run. The returned pull
   * requests do not necessarily indicate pull requests that triggered the run.
   */
  public val pullRequests: List<PullRequestMinimal>? =
      pullRequests?.let { collection0 -> collection0.toList() }

  private val referencedWorkflowsState: FieldState<List<ReferencedWorkflow>?> =
      referencedWorkflowsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  public val actor: SimpleUser?
    get() = actorState.valueOrNull()

  /**
   * The ID of the associated check suite.
   */
  public val checkSuiteId: Int?
    get() = checkSuiteIdState.valueOrNull()

  /**
   * The node ID of the associated check suite.
   */
  public val checkSuiteNodeId: String?
    get() = checkSuiteNodeIdState.valueOrNull()

  public val headRepositoryId: Int?
    get() = headRepositoryIdState.valueOrNull()

  /**
   * The name of the workflow run.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The URL to the previous attempted run of this workflow, if one exists.
   */
  public val previousAttemptUrl: String?
    get() = previousAttemptUrlState.valueOrNull()

  public val referencedWorkflows: List<ReferencedWorkflow>?
    get() = referencedWorkflowsState.valueOrNull()

  /**
   * Attempt number of the run, 1 for first attempt and higher if the workflow was re-run.
   */
  public val runAttempt: Int?
    get() = runAttemptState.valueOrNull()

  /**
   * The start time of the latest run. Resets on re-run.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val runStartedAt: String?
    get() = runStartedAtState.valueOrNull()

  public val triggeringActor: SimpleUser?
    get() = triggeringActorState.valueOrNull()

  public constructor(
    artifactsUrl: String,
    cancelUrl: String,
    checkSuiteUrl: String,
    conclusion: String?,
    createdAt: String,
    displayTitle: String,
    event: String,
    headBranch: String?,
    headCommit: NullableSimpleCommit?,
    headRepository: MinimalRepository,
    headSha: String,
    htmlUrl: String,
    id: Int,
    jobsUrl: String,
    logsUrl: String,
    nodeId: String,
    path: String,
    pullRequests: List<PullRequestMinimal>?,
    repository: MinimalRepository,
    rerunUrl: String,
    runNumber: Int,
    status: String?,
    updatedAt: String,
    url: String,
    workflowId: Int,
    workflowUrl: String,
  ) : this(artifactsUrl = artifactsUrl,
  cancelUrl = cancelUrl,
  checkSuiteUrl = checkSuiteUrl,
  conclusion = conclusion,
  createdAt = createdAt,
  displayTitle = displayTitle,
  event = event,
  headBranch = headBranch,
  headCommit = headCommit,
  headRepository = headRepository,
  headSha = headSha,
  htmlUrl = htmlUrl,
  id = id,
  jobsUrl = jobsUrl,
  logsUrl = logsUrl,
  nodeId = nodeId,
  path = path,
  pullRequests = pullRequests,
  repository = repository,
  rerunUrl = rerunUrl,
  runNumber = runNumber,
  status = status,
  updatedAt = updatedAt,
  url = url,
  workflowId = workflowId,
  workflowUrl = workflowUrl,
  actorState = FieldState.Absent,
  checkSuiteIdState = FieldState.Absent,
  checkSuiteNodeIdState = FieldState.Absent,
  headRepositoryIdState = FieldState.Absent,
  nameState = FieldState.Absent,
  previousAttemptUrlState = FieldState.Absent,
  referencedWorkflowsState = FieldState.Absent,
  runAttemptState = FieldState.Absent,
  runStartedAtState = FieldState.Absent,
  triggeringActorState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `actor`.
   */
  public fun actorPresence(): FieldPresence = actorState.presence

  /**
   * Returns the wire presence of `check_suite_id`.
   */
  public fun checkSuiteIdPresence(): FieldPresence = checkSuiteIdState.presence

  /**
   * Returns the wire presence of `check_suite_node_id`.
   */
  public fun checkSuiteNodeIdPresence(): FieldPresence = checkSuiteNodeIdState.presence

  /**
   * Returns the wire presence of `head_repository_id`.
   */
  public fun headRepositoryIdPresence(): FieldPresence = headRepositoryIdState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `previous_attempt_url`.
   */
  public fun previousAttemptUrlPresence(): FieldPresence = previousAttemptUrlState.presence

  /**
   * Returns the wire presence of `referenced_workflows`.
   */
  public fun referencedWorkflowsPresence(): FieldPresence = referencedWorkflowsState.presence

  /**
   * Returns the wire presence of `run_attempt`.
   */
  public fun runAttemptPresence(): FieldPresence = runAttemptState.presence

  /**
   * Returns the wire presence of `run_started_at`.
   */
  public fun runStartedAtPresence(): FieldPresence = runStartedAtState.presence

  /**
   * Returns the wire presence of `triggering_actor`.
   */
  public fun triggeringActorPresence(): FieldPresence = triggeringActorState.presence

  public class Builder {
    private var artifactsUrlValue: String? = null

    public var artifactsUrl: String
      get() = requireNotNull(artifactsUrlValue) { "artifactsUrl is required" }
      set(`value`) {
        artifactsUrlValue = value
      }

    private var cancelUrlValue: String? = null

    public var cancelUrl: String
      get() = requireNotNull(cancelUrlValue) { "cancelUrl is required" }
      set(`value`) {
        cancelUrlValue = value
      }

    private var checkSuiteUrlValue: String? = null

    public var checkSuiteUrl: String
      get() = requireNotNull(checkSuiteUrlValue) { "checkSuiteUrl is required" }
      set(`value`) {
        checkSuiteUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var displayTitleValue: String? = null

    public var displayTitle: String
      get() = requireNotNull(displayTitleValue) { "displayTitle is required" }
      set(`value`) {
        displayTitleValue = value
      }

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
      }

    private var headRepositoryValue: MinimalRepository? = null

    public var headRepository: MinimalRepository
      get() = requireNotNull(headRepositoryValue) { "headRepository is required" }
      set(`value`) {
        headRepositoryValue = value
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

    private var jobsUrlValue: String? = null

    public var jobsUrl: String
      get() = requireNotNull(jobsUrlValue) { "jobsUrl is required" }
      set(`value`) {
        jobsUrlValue = value
      }

    private var logsUrlValue: String? = null

    public var logsUrl: String
      get() = requireNotNull(logsUrlValue) { "logsUrl is required" }
      set(`value`) {
        logsUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var rerunUrlValue: String? = null

    public var rerunUrl: String
      get() = requireNotNull(rerunUrlValue) { "rerunUrl is required" }
      set(`value`) {
        rerunUrlValue = value
      }

    private var runNumberValue: Int? = null

    public var runNumber: Int
      get() = requireNotNull(runNumberValue) { "runNumber is required" }
      set(`value`) {
        runNumberValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var workflowIdValue: Int? = null

    public var workflowId: Int
      get() = requireNotNull(workflowIdValue) { "workflowId is required" }
      set(`value`) {
        workflowIdValue = value
      }

    private var workflowUrlValue: String? = null

    public var workflowUrl: String
      get() = requireNotNull(workflowUrlValue) { "workflowUrl is required" }
      set(`value`) {
        workflowUrlValue = value
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
     * Required nullable field; assigning `null` records present-null.
     */
    public var headBranch: String?
      get() = headBranchState.valueOrNull()
      set(`value`) {
        headBranchState = value.toNullableFieldState()
      }

    private var headCommitState: FieldState<NullableSimpleCommit?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var headCommit: NullableSimpleCommit?
      get() = headCommitState.valueOrNull()
      set(`value`) {
        headCommitState = value.toNullableFieldState()
      }

    private var pullRequestsState: FieldState<List<PullRequestMinimal>?> = FieldState.Absent

    /**
     * Pull requests that are open with a `head_sha` or `head_branch` that matches the workflow run. The returned pull
     * requests do not necessarily indicate pull requests that triggered the run.
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullRequests: List<PullRequestMinimal>?
      get() = pullRequestsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pullRequestsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var statusState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: String?
      get() = statusState.valueOrNull()
      set(`value`) {
        statusState = value.toNullableFieldState()
      }

    private var actorState: FieldState<SimpleUser> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var actor: SimpleUser?
      get() = actorState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "actor is not nullable; call unsetActor() to omit it" }
        actorState = FieldState.Value(present)
      }

    private var checkSuiteIdState: FieldState<Int> = FieldState.Absent

    /**
     * The ID of the associated check suite.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var checkSuiteId: Int?
      get() = checkSuiteIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "checkSuiteId is not nullable; call unsetCheckSuiteId() to omit it" }
        checkSuiteIdState = FieldState.Value(present)
      }

    private var checkSuiteNodeIdState: FieldState<String> = FieldState.Absent

    /**
     * The node ID of the associated check suite.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var checkSuiteNodeId: String?
      get() = checkSuiteNodeIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "checkSuiteNodeId is not nullable; call unsetCheckSuiteNodeId() to omit it" }
        checkSuiteNodeIdState = FieldState.Value(present)
      }

    private var headRepositoryIdState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var headRepositoryId: Int?
      get() = headRepositoryIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "headRepositoryId is not nullable; call unsetHeadRepositoryId() to omit it" }
        headRepositoryIdState = FieldState.Value(present)
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the workflow run.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var previousAttemptUrlState: FieldState<String?> = FieldState.Absent

    /**
     * The URL to the previous attempted run of this workflow, if one exists.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var previousAttemptUrl: String?
      get() = previousAttemptUrlState.valueOrNull()
      set(`value`) {
        previousAttemptUrlState = value.toNullableFieldState()
      }

    private var referencedWorkflowsState: FieldState<List<ReferencedWorkflow>?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var referencedWorkflows: List<ReferencedWorkflow>?
      get() = referencedWorkflowsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        referencedWorkflowsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var runAttemptState: FieldState<Int> = FieldState.Absent

    /**
     * Attempt number of the run, 1 for first attempt and higher if the workflow was re-run.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runAttempt: Int?
      get() = runAttemptState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runAttempt is not nullable; call unsetRunAttempt() to omit it" }
        runAttemptState = FieldState.Value(present)
      }

    private var runStartedAtState: FieldState<String> = FieldState.Absent

    /**
     * The start time of the latest run. Resets on re-run.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runStartedAt: String?
      get() = runStartedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runStartedAt is not nullable; call unsetRunStartedAt() to omit it" }
        runStartedAtState = FieldState.Value(present)
      }

    private var triggeringActorState: FieldState<SimpleUser> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var triggeringActor: SimpleUser?
      get() = triggeringActorState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "triggeringActor is not nullable; call unsetTriggeringActor() to omit it" }
        triggeringActorState = FieldState.Value(present)
      }

    /**
     * Omits `actor` from serialized output.
     */
    public fun unsetActor() {
      actorState = FieldState.Absent
    }

    /**
     * Omits `check_suite_id` from serialized output.
     */
    public fun unsetCheckSuiteId() {
      checkSuiteIdState = FieldState.Absent
    }

    /**
     * Omits `check_suite_node_id` from serialized output.
     */
    public fun unsetCheckSuiteNodeId() {
      checkSuiteNodeIdState = FieldState.Absent
    }

    /**
     * Omits `head_repository_id` from serialized output.
     */
    public fun unsetHeadRepositoryId() {
      headRepositoryIdState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `previous_attempt_url` from serialized output.
     */
    public fun unsetPreviousAttemptUrl() {
      previousAttemptUrlState = FieldState.Absent
    }

    /**
     * Omits `referenced_workflows` from serialized output.
     */
    public fun unsetReferencedWorkflows() {
      referencedWorkflowsState = FieldState.Absent
    }

    /**
     * Omits `run_attempt` from serialized output.
     */
    public fun unsetRunAttempt() {
      runAttemptState = FieldState.Absent
    }

    /**
     * Omits `run_started_at` from serialized output.
     */
    public fun unsetRunStartedAt() {
      runStartedAtState = FieldState.Absent
    }

    /**
     * Omits `triggering_actor` from serialized output.
     */
    public fun unsetTriggeringActor() {
      triggeringActorState = FieldState.Absent
    }

    public fun build(): WorkflowRun {
      check(artifactsUrlValue != null) { "artifactsUrl is required" }
      check(cancelUrlValue != null) { "cancelUrl is required" }
      check(checkSuiteUrlValue != null) { "checkSuiteUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(displayTitleValue != null) { "displayTitle is required" }
      check(eventValue != null) { "event is required" }
      check(headRepositoryValue != null) { "headRepository is required" }
      check(headShaValue != null) { "headSha is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(jobsUrlValue != null) { "jobsUrl is required" }
      check(logsUrlValue != null) { "logsUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pathValue != null) { "path is required" }
      check(repositoryValue != null) { "repository is required" }
      check(rerunUrlValue != null) { "rerunUrl is required" }
      check(runNumberValue != null) { "runNumber is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(workflowIdValue != null) { "workflowId is required" }
      check(workflowUrlValue != null) { "workflowUrl is required" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(headBranchState !== FieldState.Absent) { "headBranch is required, even when null" }
      check(headCommitState !== FieldState.Absent) { "headCommit is required, even when null" }
      check(pullRequestsState !== FieldState.Absent) { "pullRequests is required, even when null" }
      check(statusState !== FieldState.Absent) { "status is required, even when null" }
      return WorkflowRun(
        artifactsUrl = artifactsUrl,
        cancelUrl = cancelUrl,
        checkSuiteUrl = checkSuiteUrl,
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        displayTitle = displayTitle,
        event = event,
        headBranch = headBranchState.valueOrNull(),
        headCommit = headCommitState.valueOrNull(),
        headRepository = headRepository,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        jobsUrl = jobsUrl,
        logsUrl = logsUrl,
        nodeId = nodeId,
        path = path,
        pullRequests = pullRequestsState.valueOrNull(),
        repository = repository,
        rerunUrl = rerunUrl,
        runNumber = runNumber,
        status = statusState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        workflowId = workflowId,
        workflowUrl = workflowUrl,
        actorState = actorState,
        checkSuiteIdState = checkSuiteIdState,
        checkSuiteNodeIdState = checkSuiteNodeIdState,
        headRepositoryIdState = headRepositoryIdState,
        nameState = nameState,
        previousAttemptUrlState = previousAttemptUrlState,
        referencedWorkflowsState = referencedWorkflowsState,
        runAttemptState = runAttemptState,
        runStartedAtState = runStartedAtState,
        triggeringActorState = triggeringActorState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WorkflowRun = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WorkflowRun> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WorkflowRun {
      val jsonDecoder = decoder.requireJsonDecoder("WorkflowRun")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WorkflowRun must be a JSON object")
      val artifactsUrl = json.decodeRequired<String>(rawObject, "artifacts_url")
      val cancelUrl = json.decodeRequired<String>(rawObject, "cancel_url")
      val checkSuiteUrl = json.decodeRequired<String>(rawObject, "check_suite_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val displayTitle = json.decodeRequired<String>(rawObject, "display_title")
      val event = json.decodeRequired<String>(rawObject, "event")
      val headRepository = json.decodeRequired<MinimalRepository>(rawObject, "head_repository")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val jobsUrl = json.decodeRequired<String>(rawObject, "jobs_url")
      val logsUrl = json.decodeRequired<String>(rawObject, "logs_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val path = json.decodeRequired<String>(rawObject, "path")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val rerunUrl = json.decodeRequired<String>(rawObject, "rerun_url")
      val runNumber = json.decodeRequired<Int>(rawObject, "run_number")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val workflowId = json.decodeRequired<Int>(rawObject, "workflow_id")
      val workflowUrl = json.decodeRequired<String>(rawObject, "workflow_url")
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("WorkflowRun is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("WorkflowRun is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_commit")) {
        throw SerializationException("WorkflowRun is missing required property 'head_commit'")
      }
      val headCommit = rawObject["head_commit"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleCommit?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pull_requests")) {
        throw SerializationException("WorkflowRun is missing required property 'pull_requests'")
      }
      val pullRequests = rawObject["pull_requests"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PullRequestMinimal>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status")) {
        throw SerializationException("WorkflowRun is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return WorkflowRun(
        artifactsUrl = artifactsUrl,
        cancelUrl = cancelUrl,
        checkSuiteUrl = checkSuiteUrl,
        conclusion = conclusion,
        createdAt = createdAt,
        displayTitle = displayTitle,
        event = event,
        headBranch = headBranch,
        headCommit = headCommit,
        headRepository = headRepository,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        jobsUrl = jobsUrl,
        logsUrl = logsUrl,
        nodeId = nodeId,
        path = path,
        pullRequests = pullRequests,
        repository = repository,
        rerunUrl = rerunUrl,
        runNumber = runNumber,
        status = status,
        updatedAt = updatedAt,
        url = url,
        workflowId = workflowId,
        workflowUrl = workflowUrl,
        actorState = json.decodeOptional(rawObject, "actor", nullable = false),
        checkSuiteIdState = json.decodeOptional(rawObject, "check_suite_id", nullable = false),
        checkSuiteNodeIdState = json.decodeOptional(rawObject, "check_suite_node_id", nullable = false),
        headRepositoryIdState = json.decodeOptional(rawObject, "head_repository_id", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
        previousAttemptUrlState = json.decodeOptional(rawObject, "previous_attempt_url", nullable = true),
        referencedWorkflowsState = json.decodeOptional(rawObject, "referenced_workflows", nullable = true),
        runAttemptState = json.decodeOptional(rawObject, "run_attempt", nullable = false),
        runStartedAtState = json.decodeOptional(rawObject, "run_started_at", nullable = false),
        triggeringActorState = json.decodeOptional(rawObject, "triggering_actor", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WorkflowRun) {
      val jsonEncoder = encoder.requireJsonEncoder("WorkflowRun")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("artifacts_url", value.artifactsUrl)
        put("cancel_url", value.cancelUrl)
        put("check_suite_url", value.checkSuiteUrl)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("display_title", value.displayTitle)
        put("event", value.event)
        put("head_branch", value.headBranch?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_commit", value.headCommit?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_repository", json.encodeToJsonElement(value.headRepository))
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("jobs_url", value.jobsUrl)
        put("logs_url", value.logsUrl)
        put("node_id", value.nodeId)
        put("path", value.path)
        put("pull_requests", value.pullRequests?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository", json.encodeToJsonElement(value.repository))
        put("rerun_url", value.rerunUrl)
        put("run_number", json.encodeToJsonElement(value.runNumber))
        put("status", value.status?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("workflow_id", json.encodeToJsonElement(value.workflowId))
        put("workflow_url", value.workflowUrl)
        putState("actor", value.actorState, json::encodeToJsonElement)
        putState("check_suite_id", value.checkSuiteIdState, json::encodeToJsonElement)
        putState("check_suite_node_id", value.checkSuiteNodeIdState, json::encodeToJsonElement)
        putState("head_repository_id", value.headRepositoryIdState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("previous_attempt_url", value.previousAttemptUrlState, json::encodeToJsonElement)
        putState("referenced_workflows", value.referencedWorkflowsState, json::encodeToJsonElement)
        putState("run_attempt", value.runAttemptState, json::encodeToJsonElement)
        putState("run_started_at", value.runStartedAtState, json::encodeToJsonElement)
        putState("triggering_actor", value.triggeringActorState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workflowRun(block: WorkflowRun.Builder.() -> Unit): WorkflowRun = WorkflowRun.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WorkflowRun is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WorkflowRun property '" + name + "' is not nullable")
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

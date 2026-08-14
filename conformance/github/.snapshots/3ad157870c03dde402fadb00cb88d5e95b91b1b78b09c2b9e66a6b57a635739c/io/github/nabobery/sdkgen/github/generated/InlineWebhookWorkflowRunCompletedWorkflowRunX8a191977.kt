package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977.Serializer::class)
public class InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 internal constructor(
  public val actor: InlineWebhookWorkflowRunCompletedWorkflowRunActorX59ac9174?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val artifactsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val cancelUrl: String,
  public val checkSuiteId: Int,
  public val checkSuiteNodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val checkSuiteUrl: String,
  public val conclusion: InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val event: String,
  public val headBranch: String?,
  public val headCommit: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916,
  public val headRepository: InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryX1d185027,
  public val headSha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val jobsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val logsUrl: String,
  public val name: String?,
  public val nodeId: String,
  public val path: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val previousAttemptUrl: String?,
  pullRequests: List<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834?>,
  public val repository: InlineWebhookWorkflowRunCompletedWorkflowRunRepositoryXac86dc12,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val rerunUrl: String,
  public val runAttempt: Int,
  public val runNumber: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val runStartedAt: String,
  public val status: InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174,
  public val triggeringActor: InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorX8a4c06c4?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val workflowId: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val workflowUrl: String,
  private val displayTitleState: FieldState<String>,
  referencedWorkflowsState: FieldState<List<InlineWebhookWorkflowRunCompletedWorkflowRunReferencedWorkflowsItemX27dce706>?>,
) {
  public val pullRequests:
      List<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834?> =
      pullRequests.toList()

  private val referencedWorkflowsState:
      FieldState<List<InlineWebhookWorkflowRunCompletedWorkflowRunReferencedWorkflowsItemX27dce706>?>
      =
      referencedWorkflowsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  /**
   * The event-specific title associated with the run or the run-name if set, or the value of `run-name` if it is set in
   * the workflow.
   */
  public val displayTitle: String?
    get() = displayTitleState.valueOrNull()

  public val referencedWorkflows:
      List<InlineWebhookWorkflowRunCompletedWorkflowRunReferencedWorkflowsItemX27dce706>?
    get() = referencedWorkflowsState.valueOrNull()

  public constructor(
    actor: InlineWebhookWorkflowRunCompletedWorkflowRunActorX59ac9174?,
    artifactsUrl: String,
    cancelUrl: String,
    checkSuiteId: Int,
    checkSuiteNodeId: String,
    checkSuiteUrl: String,
    conclusion: InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a?,
    createdAt: String,
    event: String,
    headBranch: String?,
    headCommit: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916,
    headRepository: InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryX1d185027,
    headSha: String,
    htmlUrl: String,
    id: Int,
    jobsUrl: String,
    logsUrl: String,
    name: String?,
    nodeId: String,
    path: String,
    previousAttemptUrl: String?,
    pullRequests: List<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834?>,
    repository: InlineWebhookWorkflowRunCompletedWorkflowRunRepositoryXac86dc12,
    rerunUrl: String,
    runAttempt: Int,
    runNumber: Int,
    runStartedAt: String,
    status: InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174,
    triggeringActor: InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorX8a4c06c4?,
    updatedAt: String,
    url: String,
    workflowId: Int,
    workflowUrl: String,
  ) : this(actor = actor,
  artifactsUrl = artifactsUrl,
  cancelUrl = cancelUrl,
  checkSuiteId = checkSuiteId,
  checkSuiteNodeId = checkSuiteNodeId,
  checkSuiteUrl = checkSuiteUrl,
  conclusion = conclusion,
  createdAt = createdAt,
  event = event,
  headBranch = headBranch,
  headCommit = headCommit,
  headRepository = headRepository,
  headSha = headSha,
  htmlUrl = htmlUrl,
  id = id,
  jobsUrl = jobsUrl,
  logsUrl = logsUrl,
  name = name,
  nodeId = nodeId,
  path = path,
  previousAttemptUrl = previousAttemptUrl,
  pullRequests = pullRequests,
  repository = repository,
  rerunUrl = rerunUrl,
  runAttempt = runAttempt,
  runNumber = runNumber,
  runStartedAt = runStartedAt,
  status = status,
  triggeringActor = triggeringActor,
  updatedAt = updatedAt,
  url = url,
  workflowId = workflowId,
  workflowUrl = workflowUrl,
  displayTitleState = FieldState.Absent,
  referencedWorkflowsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `display_title`.
   */
  public fun displayTitlePresence(): FieldPresence = displayTitleState.presence

  /**
   * Returns the wire presence of `referenced_workflows`.
   */
  public fun referencedWorkflowsPresence(): FieldPresence = referencedWorkflowsState.presence

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

    private var checkSuiteIdValue: Int? = null

    public var checkSuiteId: Int
      get() = requireNotNull(checkSuiteIdValue) { "checkSuiteId is required" }
      set(`value`) {
        checkSuiteIdValue = value
      }

    private var checkSuiteNodeIdValue: String? = null

    public var checkSuiteNodeId: String
      get() = requireNotNull(checkSuiteNodeIdValue) { "checkSuiteNodeId is required" }
      set(`value`) {
        checkSuiteNodeIdValue = value
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

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
      }

    private var headCommitValue: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916? =
        null

    public var headCommit: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916
      get() = requireNotNull(headCommitValue) { "headCommit is required" }
      set(`value`) {
        headCommitValue = value
      }

    private var headRepositoryValue:
        InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryX1d185027? = null

    public var headRepository: InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryX1d185027
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

    private var pullRequestsValue:
        List<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834?>? = null

    public var pullRequests:
        List<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834?>
      get() = requireNotNull(pullRequestsValue) { "pullRequests is required" }.toList()
      set(`value`) {
        pullRequestsValue = value.toList()
      }

    private var repositoryValue: InlineWebhookWorkflowRunCompletedWorkflowRunRepositoryXac86dc12? =
        null

    public var repository: InlineWebhookWorkflowRunCompletedWorkflowRunRepositoryXac86dc12
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

    private var runAttemptValue: Int? = null

    public var runAttempt: Int
      get() = requireNotNull(runAttemptValue) { "runAttempt is required" }
      set(`value`) {
        runAttemptValue = value
      }

    private var runNumberValue: Int? = null

    public var runNumber: Int
      get() = requireNotNull(runNumberValue) { "runNumber is required" }
      set(`value`) {
        runNumberValue = value
      }

    private var runStartedAtValue: String? = null

    public var runStartedAt: String
      get() = requireNotNull(runStartedAtValue) { "runStartedAt is required" }
      set(`value`) {
        runStartedAtValue = value
      }

    private var statusValue: InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174? = null

    public var status: InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
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

    private var actorState: FieldState<InlineWebhookWorkflowRunCompletedWorkflowRunActorX59ac9174?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var actor: InlineWebhookWorkflowRunCompletedWorkflowRunActorX59ac9174?
      get() = actorState.valueOrNull()
      set(`value`) {
        actorState = value.toNullableFieldState()
      }

    private var conclusionState:
        FieldState<InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a?
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

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var previousAttemptUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var previousAttemptUrl: String?
      get() = previousAttemptUrlState.valueOrNull()
      set(`value`) {
        previousAttemptUrlState = value.toNullableFieldState()
      }

    private var triggeringActorState:
        FieldState<InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorX8a4c06c4?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var triggeringActor:
        InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorX8a4c06c4?
      get() = triggeringActorState.valueOrNull()
      set(`value`) {
        triggeringActorState = value.toNullableFieldState()
      }

    private var displayTitleState: FieldState<String> = FieldState.Absent

    /**
     * The event-specific title associated with the run or the run-name if set, or the value of `run-name` if it is set
     * in the workflow.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var displayTitle: String?
      get() = displayTitleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "displayTitle is not nullable; call unsetDisplayTitle() to omit it" }
        displayTitleState = FieldState.Value(present)
      }

    private var referencedWorkflowsState:
        FieldState<List<InlineWebhookWorkflowRunCompletedWorkflowRunReferencedWorkflowsItemX27dce706>?>
        = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var referencedWorkflows:
        List<InlineWebhookWorkflowRunCompletedWorkflowRunReferencedWorkflowsItemX27dce706>?
      get() = referencedWorkflowsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        referencedWorkflowsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    /**
     * Omits `display_title` from serialized output.
     */
    public fun unsetDisplayTitle() {
      displayTitleState = FieldState.Absent
    }

    /**
     * Omits `referenced_workflows` from serialized output.
     */
    public fun unsetReferencedWorkflows() {
      referencedWorkflowsState = FieldState.Absent
    }

    public fun build(): InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 {
      check(artifactsUrlValue != null) { "artifactsUrl is required" }
      check(cancelUrlValue != null) { "cancelUrl is required" }
      check(checkSuiteIdValue != null) { "checkSuiteId is required" }
      check(checkSuiteNodeIdValue != null) { "checkSuiteNodeId is required" }
      check(checkSuiteUrlValue != null) { "checkSuiteUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventValue != null) { "event is required" }
      check(headCommitValue != null) { "headCommit is required" }
      check(headRepositoryValue != null) { "headRepository is required" }
      check(headShaValue != null) { "headSha is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(jobsUrlValue != null) { "jobsUrl is required" }
      check(logsUrlValue != null) { "logsUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pathValue != null) { "path is required" }
      check(pullRequestsValue != null) { "pullRequests is required" }
      check(repositoryValue != null) { "repository is required" }
      check(rerunUrlValue != null) { "rerunUrl is required" }
      check(runAttemptValue != null) { "runAttempt is required" }
      check(runNumberValue != null) { "runNumber is required" }
      check(runStartedAtValue != null) { "runStartedAt is required" }
      check(statusValue != null) { "status is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(workflowIdValue != null) { "workflowId is required" }
      check(workflowUrlValue != null) { "workflowUrl is required" }
      check(actorState !== FieldState.Absent) { "actor is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(headBranchState !== FieldState.Absent) { "headBranch is required, even when null" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      check(previousAttemptUrlState !== FieldState.Absent) { "previousAttemptUrl is required, even when null" }
      check(triggeringActorState !== FieldState.Absent) { "triggeringActor is required, even when null" }
      return InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977(
        actor = actorState.valueOrNull(),
        artifactsUrl = artifactsUrl,
        cancelUrl = cancelUrl,
        checkSuiteId = checkSuiteId,
        checkSuiteNodeId = checkSuiteNodeId,
        checkSuiteUrl = checkSuiteUrl,
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        event = event,
        headBranch = headBranchState.valueOrNull(),
        headCommit = headCommit,
        headRepository = headRepository,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        jobsUrl = jobsUrl,
        logsUrl = logsUrl,
        name = nameState.valueOrNull(),
        nodeId = nodeId,
        path = path,
        previousAttemptUrl = previousAttemptUrlState.valueOrNull(),
        pullRequests = pullRequests,
        repository = repository,
        rerunUrl = rerunUrl,
        runAttempt = runAttempt,
        runNumber = runNumber,
        runStartedAt = runStartedAt,
        status = status,
        triggeringActor = triggeringActorState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        workflowId = workflowId,
        workflowUrl = workflowUrl,
        displayTitleState = displayTitleState,
        referencedWorkflowsState = referencedWorkflowsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 must be a JSON object")
      val artifactsUrl = json.decodeRequired<String>(rawObject, "artifacts_url")
      val cancelUrl = json.decodeRequired<String>(rawObject, "cancel_url")
      val checkSuiteId = json.decodeRequired<Int>(rawObject, "check_suite_id")
      val checkSuiteNodeId = json.decodeRequired<String>(rawObject, "check_suite_node_id")
      val checkSuiteUrl = json.decodeRequired<String>(rawObject, "check_suite_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val event = json.decodeRequired<String>(rawObject, "event")
      val headCommit = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916>(rawObject, "head_commit")
      val headRepository = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunHeadRepositoryX1d185027>(rawObject, "head_repository")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val jobsUrl = json.decodeRequired<String>(rawObject, "jobs_url")
      val logsUrl = json.decodeRequired<String>(rawObject, "logs_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val path = json.decodeRequired<String>(rawObject, "path")
      val pullRequests = json.decodeRequired<List<InlineWebhookWorkflowRunCompletedWorkflowRunPullRequestsItemXba795834?>>(rawObject, "pull_requests")
      val repository = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunRepositoryXac86dc12>(rawObject, "repository")
      val rerunUrl = json.decodeRequired<String>(rawObject, "rerun_url")
      val runAttempt = json.decodeRequired<Int>(rawObject, "run_attempt")
      val runNumber = json.decodeRequired<Int>(rawObject, "run_number")
      val runStartedAt = json.decodeRequired<String>(rawObject, "run_started_at")
      val status = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunStatusXdba80174>(rawObject, "status")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val workflowId = json.decodeRequired<Int>(rawObject, "workflow_id")
      val workflowUrl = json.decodeRequired<String>(rawObject, "workflow_url")
      if (!rawObject.containsKey("actor")) {
        throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property 'actor'")
      }
      val actor = rawObject["actor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookWorkflowRunCompletedWorkflowRunActorX59ac9174?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookWorkflowRunCompletedWorkflowRunConclusionX1ae54a0a?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("previous_attempt_url")) {
        throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property 'previous_attempt_url'")
      }
      val previousAttemptUrl = rawObject["previous_attempt_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("triggering_actor")) {
        throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property 'triggering_actor'")
      }
      val triggeringActor = rawObject["triggering_actor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorX8a4c06c4?>(requireNotNull(element)) }
      return InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977(
        actor = actor,
        artifactsUrl = artifactsUrl,
        cancelUrl = cancelUrl,
        checkSuiteId = checkSuiteId,
        checkSuiteNodeId = checkSuiteNodeId,
        checkSuiteUrl = checkSuiteUrl,
        conclusion = conclusion,
        createdAt = createdAt,
        event = event,
        headBranch = headBranch,
        headCommit = headCommit,
        headRepository = headRepository,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        jobsUrl = jobsUrl,
        logsUrl = logsUrl,
        name = name,
        nodeId = nodeId,
        path = path,
        previousAttemptUrl = previousAttemptUrl,
        pullRequests = pullRequests,
        repository = repository,
        rerunUrl = rerunUrl,
        runAttempt = runAttempt,
        runNumber = runNumber,
        runStartedAt = runStartedAt,
        status = status,
        triggeringActor = triggeringActor,
        updatedAt = updatedAt,
        url = url,
        workflowId = workflowId,
        workflowUrl = workflowUrl,
        displayTitleState = json.decodeOptional(rawObject, "display_title", nullable = false),
        referencedWorkflowsState = json.decodeOptional(rawObject, "referenced_workflows", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", value.actor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("artifacts_url", value.artifactsUrl)
        put("cancel_url", value.cancelUrl)
        put("check_suite_id", json.encodeToJsonElement(value.checkSuiteId))
        put("check_suite_node_id", value.checkSuiteNodeId)
        put("check_suite_url", value.checkSuiteUrl)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("event", value.event)
        put("head_branch", value.headBranch?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_commit", json.encodeToJsonElement(value.headCommit))
        put("head_repository", json.encodeToJsonElement(value.headRepository))
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("jobs_url", value.jobsUrl)
        put("logs_url", value.logsUrl)
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("path", value.path)
        put("previous_attempt_url", value.previousAttemptUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pull_requests", json.encodeToJsonElement(value.pullRequests))
        put("repository", json.encodeToJsonElement(value.repository))
        put("rerun_url", value.rerunUrl)
        put("run_attempt", json.encodeToJsonElement(value.runAttempt))
        put("run_number", json.encodeToJsonElement(value.runNumber))
        put("run_started_at", value.runStartedAt)
        put("status", json.encodeToJsonElement(value.status))
        put("triggering_actor", value.triggeringActor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("workflow_id", json.encodeToJsonElement(value.workflowId))
        put("workflow_url", value.workflowUrl)
        putState("display_title", value.displayTitleState, json::encodeToJsonElement)
        putState("referenced_workflows", value.referencedWorkflowsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowRunCompletedWorkflowRunX8a191977(block: InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977.Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 = InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977 property '" + name + "' is not nullable")
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

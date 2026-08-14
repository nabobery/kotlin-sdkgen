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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15.Serializer::class)
public class InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 internal constructor(
  public val actor: InlineWebhookDeploymentReviewApprovedWorkflowRunActorX5793b28f?,
  public val checkSuiteId: Int,
  public val checkSuiteNodeId: String,
  public val conclusion: InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val displayTitle: String,
  public val event: String,
  public val headBranch: String,
  public val headSha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val name: String,
  public val nodeId: String,
  public val path: String,
  pullRequests: List<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443>,
  public val runAttempt: Int,
  public val runNumber: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val runStartedAt: String,
  public val status: InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607,
  public val triggeringActor:
      InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorXac0a0450?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val workflowId: Int,
  private val artifactsUrlState: FieldState<String>,
  private val cancelUrlState: FieldState<String>,
  private val checkSuiteUrlState: FieldState<String>,
  private val headCommitState: FieldState<JsonObject?>,
  private val headRepositoryState:
      FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunHeadRepositoryX7217a158>,
  private val jobsUrlState: FieldState<String>,
  private val logsUrlState: FieldState<String>,
  private val previousAttemptUrlState: FieldState<String?>,
  referencedWorkflowsState: FieldState<List<InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f>?>,
  private val repositoryState:
      FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunRepositoryX19b501e2>,
  private val rerunUrlState: FieldState<String>,
  private val workflowUrlState: FieldState<String>,
) {
  public val pullRequests:
      List<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443> =
      pullRequests.toList()

  private val referencedWorkflowsState:
      FieldState<List<InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f>?>
      =
      referencedWorkflowsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  public val artifactsUrl: String?
    get() = artifactsUrlState.valueOrNull()

  public val cancelUrl: String?
    get() = cancelUrlState.valueOrNull()

  public val checkSuiteUrl: String?
    get() = checkSuiteUrlState.valueOrNull()

  public val headCommit: JsonObject?
    get() = headCommitState.valueOrNull()

  public val headRepository:
      InlineWebhookDeploymentReviewApprovedWorkflowRunHeadRepositoryX7217a158?
    get() = headRepositoryState.valueOrNull()

  public val jobsUrl: String?
    get() = jobsUrlState.valueOrNull()

  public val logsUrl: String?
    get() = logsUrlState.valueOrNull()

  public val previousAttemptUrl: String?
    get() = previousAttemptUrlState.valueOrNull()

  public val referencedWorkflows:
      List<InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f>?
    get() = referencedWorkflowsState.valueOrNull()

  public val repository: InlineWebhookDeploymentReviewApprovedWorkflowRunRepositoryX19b501e2?
    get() = repositoryState.valueOrNull()

  public val rerunUrl: String?
    get() = rerunUrlState.valueOrNull()

  public val workflowUrl: String?
    get() = workflowUrlState.valueOrNull()

  public constructor(
    actor: InlineWebhookDeploymentReviewApprovedWorkflowRunActorX5793b28f?,
    checkSuiteId: Int,
    checkSuiteNodeId: String,
    conclusion: InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9?,
    createdAt: String,
    displayTitle: String,
    event: String,
    headBranch: String,
    headSha: String,
    htmlUrl: String,
    id: Int,
    name: String,
    nodeId: String,
    path: String,
    pullRequests: List<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443>,
    runAttempt: Int,
    runNumber: Int,
    runStartedAt: String,
    status: InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607,
    triggeringActor: InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorXac0a0450?,
    updatedAt: String,
    url: String,
    workflowId: Int,
  ) : this(actor = actor,
  checkSuiteId = checkSuiteId,
  checkSuiteNodeId = checkSuiteNodeId,
  conclusion = conclusion,
  createdAt = createdAt,
  displayTitle = displayTitle,
  event = event,
  headBranch = headBranch,
  headSha = headSha,
  htmlUrl = htmlUrl,
  id = id,
  name = name,
  nodeId = nodeId,
  path = path,
  pullRequests = pullRequests,
  runAttempt = runAttempt,
  runNumber = runNumber,
  runStartedAt = runStartedAt,
  status = status,
  triggeringActor = triggeringActor,
  updatedAt = updatedAt,
  url = url,
  workflowId = workflowId,
  artifactsUrlState = FieldState.Absent,
  cancelUrlState = FieldState.Absent,
  checkSuiteUrlState = FieldState.Absent,
  headCommitState = FieldState.Absent,
  headRepositoryState = FieldState.Absent,
  jobsUrlState = FieldState.Absent,
  logsUrlState = FieldState.Absent,
  previousAttemptUrlState = FieldState.Absent,
  referencedWorkflowsState = FieldState.Absent,
  repositoryState = FieldState.Absent,
  rerunUrlState = FieldState.Absent,
  workflowUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `artifacts_url`.
   */
  public fun artifactsUrlPresence(): FieldPresence = artifactsUrlState.presence

  /**
   * Returns the wire presence of `cancel_url`.
   */
  public fun cancelUrlPresence(): FieldPresence = cancelUrlState.presence

  /**
   * Returns the wire presence of `check_suite_url`.
   */
  public fun checkSuiteUrlPresence(): FieldPresence = checkSuiteUrlState.presence

  /**
   * Returns the wire presence of `head_commit`.
   */
  public fun headCommitPresence(): FieldPresence = headCommitState.presence

  /**
   * Returns the wire presence of `head_repository`.
   */
  public fun headRepositoryPresence(): FieldPresence = headRepositoryState.presence

  /**
   * Returns the wire presence of `jobs_url`.
   */
  public fun jobsUrlPresence(): FieldPresence = jobsUrlState.presence

  /**
   * Returns the wire presence of `logs_url`.
   */
  public fun logsUrlPresence(): FieldPresence = logsUrlState.presence

  /**
   * Returns the wire presence of `previous_attempt_url`.
   */
  public fun previousAttemptUrlPresence(): FieldPresence = previousAttemptUrlState.presence

  /**
   * Returns the wire presence of `referenced_workflows`.
   */
  public fun referencedWorkflowsPresence(): FieldPresence = referencedWorkflowsState.presence

  /**
   * Returns the wire presence of `repository`.
   */
  public fun repositoryPresence(): FieldPresence = repositoryState.presence

  /**
   * Returns the wire presence of `rerun_url`.
   */
  public fun rerunUrlPresence(): FieldPresence = rerunUrlState.presence

  /**
   * Returns the wire presence of `workflow_url`.
   */
  public fun workflowUrlPresence(): FieldPresence = workflowUrlState.presence

  public class Builder {
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

    private var headBranchValue: String? = null

    public var headBranch: String
      get() = requireNotNull(headBranchValue) { "headBranch is required" }
      set(`value`) {
        headBranchValue = value
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

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var pullRequestsValue:
        List<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443>? = null

    public var pullRequests:
        List<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443>
      get() = requireNotNull(pullRequestsValue) { "pullRequests is required" }.toList()
      set(`value`) {
        pullRequestsValue = value.toList()
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

    private var statusValue: InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607? = null

    public var status: InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607
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

    private var actorState:
        FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunActorX5793b28f?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var actor: InlineWebhookDeploymentReviewApprovedWorkflowRunActorX5793b28f?
      get() = actorState.valueOrNull()
      set(`value`) {
        actorState = value.toNullableFieldState()
      }

    private var conclusionState:
        FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var triggeringActorState:
        FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorXac0a0450?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var triggeringActor:
        InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorXac0a0450?
      get() = triggeringActorState.valueOrNull()
      set(`value`) {
        triggeringActorState = value.toNullableFieldState()
      }

    private var artifactsUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var artifactsUrl: String?
      get() = artifactsUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "artifactsUrl is not nullable; call unsetArtifactsUrl() to omit it" }
        artifactsUrlState = FieldState.Value(present)
      }

    private var cancelUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var cancelUrl: String?
      get() = cancelUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "cancelUrl is not nullable; call unsetCancelUrl() to omit it" }
        cancelUrlState = FieldState.Value(present)
      }

    private var checkSuiteUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var checkSuiteUrl: String?
      get() = checkSuiteUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "checkSuiteUrl is not nullable; call unsetCheckSuiteUrl() to omit it" }
        checkSuiteUrlState = FieldState.Value(present)
      }

    private var headCommitState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var headCommit: JsonObject?
      get() = headCommitState.valueOrNull()
      set(`value`) {
        headCommitState = value.toNullableFieldState()
      }

    private var headRepositoryState:
        FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunHeadRepositoryX7217a158> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var headRepository:
        InlineWebhookDeploymentReviewApprovedWorkflowRunHeadRepositoryX7217a158?
      get() = headRepositoryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "headRepository is not nullable; call unsetHeadRepository() to omit it" }
        headRepositoryState = FieldState.Value(present)
      }

    private var jobsUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var jobsUrl: String?
      get() = jobsUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "jobsUrl is not nullable; call unsetJobsUrl() to omit it" }
        jobsUrlState = FieldState.Value(present)
      }

    private var logsUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var logsUrl: String?
      get() = logsUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "logsUrl is not nullable; call unsetLogsUrl() to omit it" }
        logsUrlState = FieldState.Value(present)
      }

    private var previousAttemptUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var previousAttemptUrl: String?
      get() = previousAttemptUrlState.valueOrNull()
      set(`value`) {
        previousAttemptUrlState = value.toNullableFieldState()
      }

    private var referencedWorkflowsState:
        FieldState<List<InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f>?>
        = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var referencedWorkflows:
        List<InlineWebhookDeploymentReviewApprovedWorkflowRunReferencedWorkflowsItemXbbd67b7f>?
      get() = referencedWorkflowsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        referencedWorkflowsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var repositoryState:
        FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunRepositoryX19b501e2> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repository: InlineWebhookDeploymentReviewApprovedWorkflowRunRepositoryX19b501e2?
      get() = repositoryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "repository is not nullable; call unsetRepository() to omit it" }
        repositoryState = FieldState.Value(present)
      }

    private var rerunUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var rerunUrl: String?
      get() = rerunUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "rerunUrl is not nullable; call unsetRerunUrl() to omit it" }
        rerunUrlState = FieldState.Value(present)
      }

    private var workflowUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var workflowUrl: String?
      get() = workflowUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "workflowUrl is not nullable; call unsetWorkflowUrl() to omit it" }
        workflowUrlState = FieldState.Value(present)
      }

    /**
     * Omits `artifacts_url` from serialized output.
     */
    public fun unsetArtifactsUrl() {
      artifactsUrlState = FieldState.Absent
    }

    /**
     * Omits `cancel_url` from serialized output.
     */
    public fun unsetCancelUrl() {
      cancelUrlState = FieldState.Absent
    }

    /**
     * Omits `check_suite_url` from serialized output.
     */
    public fun unsetCheckSuiteUrl() {
      checkSuiteUrlState = FieldState.Absent
    }

    /**
     * Omits `head_commit` from serialized output.
     */
    public fun unsetHeadCommit() {
      headCommitState = FieldState.Absent
    }

    /**
     * Omits `head_repository` from serialized output.
     */
    public fun unsetHeadRepository() {
      headRepositoryState = FieldState.Absent
    }

    /**
     * Omits `jobs_url` from serialized output.
     */
    public fun unsetJobsUrl() {
      jobsUrlState = FieldState.Absent
    }

    /**
     * Omits `logs_url` from serialized output.
     */
    public fun unsetLogsUrl() {
      logsUrlState = FieldState.Absent
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
     * Omits `repository` from serialized output.
     */
    public fun unsetRepository() {
      repositoryState = FieldState.Absent
    }

    /**
     * Omits `rerun_url` from serialized output.
     */
    public fun unsetRerunUrl() {
      rerunUrlState = FieldState.Absent
    }

    /**
     * Omits `workflow_url` from serialized output.
     */
    public fun unsetWorkflowUrl() {
      workflowUrlState = FieldState.Absent
    }

    public fun build(): InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 {
      check(checkSuiteIdValue != null) { "checkSuiteId is required" }
      check(checkSuiteNodeIdValue != null) { "checkSuiteNodeId is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(displayTitleValue != null) { "displayTitle is required" }
      check(eventValue != null) { "event is required" }
      check(headBranchValue != null) { "headBranch is required" }
      check(headShaValue != null) { "headSha is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pathValue != null) { "path is required" }
      check(pullRequestsValue != null) { "pullRequests is required" }
      check(runAttemptValue != null) { "runAttempt is required" }
      check(runNumberValue != null) { "runNumber is required" }
      check(runStartedAtValue != null) { "runStartedAt is required" }
      check(statusValue != null) { "status is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(workflowIdValue != null) { "workflowId is required" }
      check(actorState !== FieldState.Absent) { "actor is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(triggeringActorState !== FieldState.Absent) { "triggeringActor is required, even when null" }
      return InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15(
        actor = actorState.valueOrNull(),
        checkSuiteId = checkSuiteId,
        checkSuiteNodeId = checkSuiteNodeId,
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        displayTitle = displayTitle,
        event = event,
        headBranch = headBranch,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        path = path,
        pullRequests = pullRequests,
        runAttempt = runAttempt,
        runNumber = runNumber,
        runStartedAt = runStartedAt,
        status = status,
        triggeringActor = triggeringActorState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        workflowId = workflowId,
        artifactsUrlState = artifactsUrlState,
        cancelUrlState = cancelUrlState,
        checkSuiteUrlState = checkSuiteUrlState,
        headCommitState = headCommitState,
        headRepositoryState = headRepositoryState,
        jobsUrlState = jobsUrlState,
        logsUrlState = logsUrlState,
        previousAttemptUrlState = previousAttemptUrlState,
        referencedWorkflowsState = referencedWorkflowsState,
        repositoryState = repositoryState,
        rerunUrlState = rerunUrlState,
        workflowUrlState = workflowUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 must be a JSON object")
      val checkSuiteId = json.decodeRequired<Int>(rawObject, "check_suite_id")
      val checkSuiteNodeId = json.decodeRequired<String>(rawObject, "check_suite_node_id")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val displayTitle = json.decodeRequired<String>(rawObject, "display_title")
      val event = json.decodeRequired<String>(rawObject, "event")
      val headBranch = json.decodeRequired<String>(rawObject, "head_branch")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val path = json.decodeRequired<String>(rawObject, "path")
      val pullRequests = json.decodeRequired<List<InlineWebhookDeploymentReviewApprovedWorkflowRunPullRequestsItemX954ea443>>(rawObject, "pull_requests")
      val runAttempt = json.decodeRequired<Int>(rawObject, "run_attempt")
      val runNumber = json.decodeRequired<Int>(rawObject, "run_number")
      val runStartedAt = json.decodeRequired<String>(rawObject, "run_started_at")
      val status = json.decodeRequired<InlineWebhookDeploymentReviewApprovedWorkflowRunStatusX72743607>(rawObject, "status")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val workflowId = json.decodeRequired<Int>(rawObject, "workflow_id")
      if (!rawObject.containsKey("actor")) {
        throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 is missing required property 'actor'")
      }
      val actor = rawObject["actor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewApprovedWorkflowRunActorX5793b28f?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewApprovedWorkflowRunConclusionX30cfaae9?>(requireNotNull(element)) }
      if (!rawObject.containsKey("triggering_actor")) {
        throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 is missing required property 'triggering_actor'")
      }
      val triggeringActor = rawObject["triggering_actor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorXac0a0450?>(requireNotNull(element)) }
      return InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15(
        actor = actor,
        checkSuiteId = checkSuiteId,
        checkSuiteNodeId = checkSuiteNodeId,
        conclusion = conclusion,
        createdAt = createdAt,
        displayTitle = displayTitle,
        event = event,
        headBranch = headBranch,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        path = path,
        pullRequests = pullRequests,
        runAttempt = runAttempt,
        runNumber = runNumber,
        runStartedAt = runStartedAt,
        status = status,
        triggeringActor = triggeringActor,
        updatedAt = updatedAt,
        url = url,
        workflowId = workflowId,
        artifactsUrlState = json.decodeOptional(rawObject, "artifacts_url", nullable = false),
        cancelUrlState = json.decodeOptional(rawObject, "cancel_url", nullable = false),
        checkSuiteUrlState = json.decodeOptional(rawObject, "check_suite_url", nullable = false),
        headCommitState = json.decodeOptional(rawObject, "head_commit", nullable = true),
        headRepositoryState = json.decodeOptional(rawObject, "head_repository", nullable = false),
        jobsUrlState = json.decodeOptional(rawObject, "jobs_url", nullable = false),
        logsUrlState = json.decodeOptional(rawObject, "logs_url", nullable = false),
        previousAttemptUrlState = json.decodeOptional(rawObject, "previous_attempt_url", nullable = true),
        referencedWorkflowsState = json.decodeOptional(rawObject, "referenced_workflows", nullable = true),
        repositoryState = json.decodeOptional(rawObject, "repository", nullable = false),
        rerunUrlState = json.decodeOptional(rawObject, "rerun_url", nullable = false),
        workflowUrlState = json.decodeOptional(rawObject, "workflow_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", value.actor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("check_suite_id", json.encodeToJsonElement(value.checkSuiteId))
        put("check_suite_node_id", value.checkSuiteNodeId)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("display_title", value.displayTitle)
        put("event", value.event)
        put("head_branch", value.headBranch)
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("path", value.path)
        put("pull_requests", json.encodeToJsonElement(value.pullRequests))
        put("run_attempt", json.encodeToJsonElement(value.runAttempt))
        put("run_number", json.encodeToJsonElement(value.runNumber))
        put("run_started_at", value.runStartedAt)
        put("status", json.encodeToJsonElement(value.status))
        put("triggering_actor", value.triggeringActor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("workflow_id", json.encodeToJsonElement(value.workflowId))
        putState("artifacts_url", value.artifactsUrlState, json::encodeToJsonElement)
        putState("cancel_url", value.cancelUrlState, json::encodeToJsonElement)
        putState("check_suite_url", value.checkSuiteUrlState, json::encodeToJsonElement)
        putState("head_commit", value.headCommitState, json::encodeToJsonElement)
        putState("head_repository", value.headRepositoryState, json::encodeToJsonElement)
        putState("jobs_url", value.jobsUrlState, json::encodeToJsonElement)
        putState("logs_url", value.logsUrlState, json::encodeToJsonElement)
        putState("previous_attempt_url", value.previousAttemptUrlState, json::encodeToJsonElement)
        putState("referenced_workflows", value.referencedWorkflowsState, json::encodeToJsonElement)
        putState("repository", value.repositoryState, json::encodeToJsonElement)
        putState("rerun_url", value.rerunUrlState, json::encodeToJsonElement)
        putState("workflow_url", value.workflowUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15(block: InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15.Builder.() -> Unit): InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 = InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15 property '" + name + "' is not nullable")
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

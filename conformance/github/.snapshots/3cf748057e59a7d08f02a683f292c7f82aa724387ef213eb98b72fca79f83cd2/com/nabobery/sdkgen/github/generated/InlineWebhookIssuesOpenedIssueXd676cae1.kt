package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
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
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue
 */
@Serializable(with = InlineWebhookIssuesOpenedIssueXd676cae1.Serializer::class)
public class InlineWebhookIssuesOpenedIssueXd676cae1 internal constructor(
  public val activeLockReason: InlineWebhookIssuesOpenedIssueActiveLockReasonXe861b810?,
  assignees: List<InlineWebhookIssuesOpenedIssueAssigneesItemX1a9659fe?>,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineWebhookIssuesOpenedIssueAuthorAssociationX10323599,
  /**
   * Contents of the issue
   */
  public val body: String?,
  public val closedAt: String?,
  public val comments: Int,
  public val commentsUrl: String,
  public val createdAt: String,
  public val eventsUrl: String,
  public val htmlUrl: String,
  public val id: Long,
  public val labelsUrl: String,
  /**
   * A collection of related issues and pull requests.
   */
  public val milestone: InlineWebhookIssuesOpenedIssueMilestoneX9de81add?,
  public val nodeId: String,
  public val number: Int,
  public val reactions: InlineWebhookIssuesOpenedIssueReactionsX07b32dbf,
  public val repositoryUrl: String,
  /**
   * Title of the issue
   */
  public val title: String,
  public val updatedAt: String,
  /**
   * URL for the issue
   */
  public val url: String,
  public val user: InlineWebhookIssuesOpenedIssueUserXca221b5b?,
  private val assigneeState: FieldState<InlineWebhookIssuesOpenedIssueAssigneeX1e0487c9?>,
  private val draftState: FieldState<Boolean>,
  private val issueDependenciesSummaryState: FieldState<IssueDependenciesSummary>,
  private val issueFieldValuesState: FieldState<List<IssueFieldValue>>,
  private val labelsState: FieldState<List<InlineWebhookIssuesOpenedIssueLabelsItemXd3d5734d>>,
  private val lockedState: FieldState<Boolean>,
  private val performedViaGithubAppState:
      FieldState<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppXc347bccc?>,
  private val pinnedCommentState: FieldState<NullableIssueComment?>,
  private val pullRequestState: FieldState<InlineWebhookIssuesOpenedIssuePullRequestX12fda013>,
  private val stateState: FieldState<InlineWebhookIssuesOpenedIssueStateX511ef4ed>,
  private val stateReasonState: FieldState<String?>,
  private val subIssuesSummaryState: FieldState<SubIssuesSummary>,
  private val timelineUrlState: FieldState<String>,
  private val typeState: FieldState<IssueType?>,
) {
  public val assignees: List<InlineWebhookIssuesOpenedIssueAssigneesItemX1a9659fe?> =
      assignees.toList()

  public val assignee: InlineWebhookIssuesOpenedIssueAssigneeX1e0487c9?
    get() = assigneeState.valueOrNull()

  public val draft: Boolean?
    get() = draftState.valueOrNull()

  public val issueDependenciesSummary: IssueDependenciesSummary?
    get() = issueDependenciesSummaryState.valueOrNull()

  public val issueFieldValues: List<IssueFieldValue>?
    get() = issueFieldValuesState.valueOrNull()

  public val labels: List<InlineWebhookIssuesOpenedIssueLabelsItemXd3d5734d>?
    get() = labelsState.valueOrNull()

  public val locked: Boolean?
    get() = lockedState.valueOrNull()

  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val performedViaGithubApp: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppXc347bccc?
    get() = performedViaGithubAppState.valueOrNull()

  public val pinnedComment: NullableIssueComment?
    get() = pinnedCommentState.valueOrNull()

  public val pullRequest: InlineWebhookIssuesOpenedIssuePullRequestX12fda013?
    get() = pullRequestState.valueOrNull()

  /**
   * State of the issue; either 'open' or 'closed'
   */
  public val state: InlineWebhookIssuesOpenedIssueStateX511ef4ed?
    get() = stateState.valueOrNull()

  public val stateReason: String?
    get() = stateReasonState.valueOrNull()

  public val subIssuesSummary: SubIssuesSummary?
    get() = subIssuesSummaryState.valueOrNull()

  public val timelineUrl: String?
    get() = timelineUrlState.valueOrNull()

  public val type: IssueType?
    get() = typeState.valueOrNull()

  public constructor(
    activeLockReason: InlineWebhookIssuesOpenedIssueActiveLockReasonXe861b810?,
    assignees: List<InlineWebhookIssuesOpenedIssueAssigneesItemX1a9659fe?>,
    authorAssociation: InlineWebhookIssuesOpenedIssueAuthorAssociationX10323599,
    body: String?,
    closedAt: String?,
    comments: Int,
    commentsUrl: String,
    createdAt: String,
    eventsUrl: String,
    htmlUrl: String,
    id: Long,
    labelsUrl: String,
    milestone: InlineWebhookIssuesOpenedIssueMilestoneX9de81add?,
    nodeId: String,
    number: Int,
    reactions: InlineWebhookIssuesOpenedIssueReactionsX07b32dbf,
    repositoryUrl: String,
    title: String,
    updatedAt: String,
    url: String,
    user: InlineWebhookIssuesOpenedIssueUserXca221b5b?,
  ) : this(activeLockReason = activeLockReason,
  assignees = assignees,
  authorAssociation = authorAssociation,
  body = body,
  closedAt = closedAt,
  comments = comments,
  commentsUrl = commentsUrl,
  createdAt = createdAt,
  eventsUrl = eventsUrl,
  htmlUrl = htmlUrl,
  id = id,
  labelsUrl = labelsUrl,
  milestone = milestone,
  nodeId = nodeId,
  number = number,
  reactions = reactions,
  repositoryUrl = repositoryUrl,
  title = title,
  updatedAt = updatedAt,
  url = url,
  user = user,
  assigneeState = FieldState.Absent,
  draftState = FieldState.Absent,
  issueDependenciesSummaryState = FieldState.Absent,
  issueFieldValuesState = FieldState.Absent,
  labelsState = FieldState.Absent,
  lockedState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  pinnedCommentState = FieldState.Absent,
  pullRequestState = FieldState.Absent,
  stateState = FieldState.Absent,
  stateReasonState = FieldState.Absent,
  subIssuesSummaryState = FieldState.Absent,
  timelineUrlState = FieldState.Absent,
  typeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `assignee`.
   */
  public fun assigneePresence(): FieldPresence = assigneeState.presence

  /**
   * Returns the wire presence of `draft`.
   */
  public fun draftPresence(): FieldPresence = draftState.presence

  /**
   * Returns the wire presence of `issue_dependencies_summary`.
   */
  public fun issueDependenciesSummaryPresence(): FieldPresence = issueDependenciesSummaryState.presence

  /**
   * Returns the wire presence of `issue_field_values`.
   */
  public fun issueFieldValuesPresence(): FieldPresence = issueFieldValuesState.presence

  /**
   * Returns the wire presence of `labels`.
   */
  public fun labelsPresence(): FieldPresence = labelsState.presence

  /**
   * Returns the wire presence of `locked`.
   */
  public fun lockedPresence(): FieldPresence = lockedState.presence

  /**
   * Returns the wire presence of `performed_via_github_app`.
   */
  public fun performedViaGithubAppPresence(): FieldPresence = performedViaGithubAppState.presence

  /**
   * Returns the wire presence of `pinned_comment`.
   */
  public fun pinnedCommentPresence(): FieldPresence = pinnedCommentState.presence

  /**
   * Returns the wire presence of `pull_request`.
   */
  public fun pullRequestPresence(): FieldPresence = pullRequestState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `state_reason`.
   */
  public fun stateReasonPresence(): FieldPresence = stateReasonState.presence

  /**
   * Returns the wire presence of `sub_issues_summary`.
   */
  public fun subIssuesSummaryPresence(): FieldPresence = subIssuesSummaryState.presence

  /**
   * Returns the wire presence of `timeline_url`.
   */
  public fun timelineUrlPresence(): FieldPresence = timelineUrlState.presence

  /**
   * Returns the wire presence of `type`.
   */
  public fun typePresence(): FieldPresence = typeState.presence

  public class Builder {
    private var assigneesValue: List<InlineWebhookIssuesOpenedIssueAssigneesItemX1a9659fe?>? = null

    public var assignees: List<InlineWebhookIssuesOpenedIssueAssigneesItemX1a9659fe?>
      get() = requireNotNull(assigneesValue) { "assignees is required" }
      set(`value`) {
        assigneesValue = value
      }

    private var authorAssociationValue: InlineWebhookIssuesOpenedIssueAuthorAssociationX10323599? =
        null

    public var authorAssociation: InlineWebhookIssuesOpenedIssueAuthorAssociationX10323599
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var commentsValue: Int? = null

    public var comments: Int
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commentsUrlValue: String? = null

    public var commentsUrl: String
      get() = requireNotNull(commentsUrlValue) { "commentsUrl is required" }
      set(`value`) {
        commentsUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var labelsUrlValue: String? = null

    public var labelsUrl: String
      get() = requireNotNull(labelsUrlValue) { "labelsUrl is required" }
      set(`value`) {
        labelsUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var reactionsValue: InlineWebhookIssuesOpenedIssueReactionsX07b32dbf? = null

    public var reactions: InlineWebhookIssuesOpenedIssueReactionsX07b32dbf
      get() = requireNotNull(reactionsValue) { "reactions is required" }
      set(`value`) {
        reactionsValue = value
      }

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
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

    private var activeLockReasonState:
        FieldState<InlineWebhookIssuesOpenedIssueActiveLockReasonXe861b810?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var activeLockReason: InlineWebhookIssuesOpenedIssueActiveLockReasonXe861b810?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * Contents of the issue
     * Required nullable field; assigning `null` records present-null.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var closedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var milestoneState: FieldState<InlineWebhookIssuesOpenedIssueMilestoneX9de81add?> =
        FieldState.Absent

    /**
     * A collection of related issues and pull requests.
     * Required nullable field; assigning `null` records present-null.
     */
    public var milestone: InlineWebhookIssuesOpenedIssueMilestoneX9de81add?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhookIssuesOpenedIssueUserXca221b5b?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookIssuesOpenedIssueUserXca221b5b?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var assigneeState: FieldState<InlineWebhookIssuesOpenedIssueAssigneeX1e0487c9?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var assignee: InlineWebhookIssuesOpenedIssueAssigneeX1e0487c9?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
      }

    private var draftState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var draft: Boolean?
      get() = draftState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "draft is not nullable; call unsetDraft() to omit it" }
        draftState = FieldState.Value(present)
      }

    private var issueDependenciesSummaryState: FieldState<IssueDependenciesSummary> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var issueDependenciesSummary: IssueDependenciesSummary?
      get() = issueDependenciesSummaryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "issueDependenciesSummary is not nullable; call unsetIssueDependenciesSummary() to omit it" }
        issueDependenciesSummaryState = FieldState.Value(present)
      }

    private var issueFieldValuesState: FieldState<List<IssueFieldValue>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var issueFieldValues: List<IssueFieldValue>?
      get() = issueFieldValuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "issueFieldValues is not nullable; call unsetIssueFieldValues() to omit it" }
        issueFieldValuesState = FieldState.Value(present)
      }

    private var labelsState: FieldState<List<InlineWebhookIssuesOpenedIssueLabelsItemXd3d5734d>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var labels: List<InlineWebhookIssuesOpenedIssueLabelsItemXd3d5734d>?
      get() = labelsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "labels is not nullable; call unsetLabels() to omit it" }
        labelsState = FieldState.Value(present)
      }

    private var lockedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var locked: Boolean?
      get() = lockedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "locked is not nullable; call unsetLocked() to omit it" }
        lockedState = FieldState.Value(present)
      }

    private var performedViaGithubAppState:
        FieldState<InlineWebhookIssuesOpenedIssuePerformedViaGithubAppXc347bccc?> =
        FieldState.Absent

    /**
     * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
     * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps
     * are first class actors within GitHub.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp: InlineWebhookIssuesOpenedIssuePerformedViaGithubAppXc347bccc?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var pinnedCommentState: FieldState<NullableIssueComment?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pinnedComment: NullableIssueComment?
      get() = pinnedCommentState.valueOrNull()
      set(`value`) {
        pinnedCommentState = value.toNullableFieldState()
      }

    private var pullRequestState: FieldState<InlineWebhookIssuesOpenedIssuePullRequestX12fda013> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pullRequest: InlineWebhookIssuesOpenedIssuePullRequestX12fda013?
      get() = pullRequestState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pullRequest is not nullable; call unsetPullRequest() to omit it" }
        pullRequestState = FieldState.Value(present)
      }

    private var stateState: FieldState<InlineWebhookIssuesOpenedIssueStateX511ef4ed> =
        FieldState.Absent

    /**
     * State of the issue; either 'open' or 'closed'
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineWebhookIssuesOpenedIssueStateX511ef4ed?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var stateReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var stateReason: String?
      get() = stateReasonState.valueOrNull()
      set(`value`) {
        stateReasonState = value.toNullableFieldState()
      }

    private var subIssuesSummaryState: FieldState<SubIssuesSummary> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var subIssuesSummary: SubIssuesSummary?
      get() = subIssuesSummaryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "subIssuesSummary is not nullable; call unsetSubIssuesSummary() to omit it" }
        subIssuesSummaryState = FieldState.Value(present)
      }

    private var timelineUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var timelineUrl: String?
      get() = timelineUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "timelineUrl is not nullable; call unsetTimelineUrl() to omit it" }
        timelineUrlState = FieldState.Value(present)
      }

    private var typeState: FieldState<IssueType?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var type: IssueType?
      get() = typeState.valueOrNull()
      set(`value`) {
        typeState = value.toNullableFieldState()
      }

    /**
     * Omits `assignee` from serialized output.
     */
    public fun unsetAssignee() {
      assigneeState = FieldState.Absent
    }

    /**
     * Omits `draft` from serialized output.
     */
    public fun unsetDraft() {
      draftState = FieldState.Absent
    }

    /**
     * Omits `issue_dependencies_summary` from serialized output.
     */
    public fun unsetIssueDependenciesSummary() {
      issueDependenciesSummaryState = FieldState.Absent
    }

    /**
     * Omits `issue_field_values` from serialized output.
     */
    public fun unsetIssueFieldValues() {
      issueFieldValuesState = FieldState.Absent
    }

    /**
     * Omits `labels` from serialized output.
     */
    public fun unsetLabels() {
      labelsState = FieldState.Absent
    }

    /**
     * Omits `locked` from serialized output.
     */
    public fun unsetLocked() {
      lockedState = FieldState.Absent
    }

    /**
     * Omits `performed_via_github_app` from serialized output.
     */
    public fun unsetPerformedViaGithubApp() {
      performedViaGithubAppState = FieldState.Absent
    }

    /**
     * Omits `pinned_comment` from serialized output.
     */
    public fun unsetPinnedComment() {
      pinnedCommentState = FieldState.Absent
    }

    /**
     * Omits `pull_request` from serialized output.
     */
    public fun unsetPullRequest() {
      pullRequestState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `state_reason` from serialized output.
     */
    public fun unsetStateReason() {
      stateReasonState = FieldState.Absent
    }

    /**
     * Omits `sub_issues_summary` from serialized output.
     */
    public fun unsetSubIssuesSummary() {
      subIssuesSummaryState = FieldState.Absent
    }

    /**
     * Omits `timeline_url` from serialized output.
     */
    public fun unsetTimelineUrl() {
      timelineUrlState = FieldState.Absent
    }

    /**
     * Omits `type` from serialized output.
     */
    public fun unsetType() {
      typeState = FieldState.Absent
    }

    public fun build(): InlineWebhookIssuesOpenedIssueXd676cae1 {
      check(assigneesValue != null) { "assignees is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(commentsValue != null) { "comments is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(labelsUrlValue != null) { "labelsUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(reactionsValue != null) { "reactions is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(activeLockReasonState !== FieldState.Absent) { "activeLockReason is required, even when null" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(milestoneState !== FieldState.Absent) { "milestone is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookIssuesOpenedIssueXd676cae1(
        activeLockReason = activeLockReasonState.valueOrNull(),
        assignees = assignees,
        authorAssociation = authorAssociation,
        body = bodyState.valueOrNull(),
        closedAt = closedAtState.valueOrNull(),
        comments = comments,
        commentsUrl = commentsUrl,
        createdAt = createdAt,
        eventsUrl = eventsUrl,
        htmlUrl = htmlUrl,
        id = id,
        labelsUrl = labelsUrl,
        milestone = milestoneState.valueOrNull(),
        nodeId = nodeId,
        number = number,
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        assigneeState = assigneeState,
        draftState = draftState,
        issueDependenciesSummaryState = issueDependenciesSummaryState,
        issueFieldValuesState = issueFieldValuesState,
        labelsState = labelsState,
        lockedState = lockedState,
        performedViaGithubAppState = performedViaGithubAppState,
        pinnedCommentState = pinnedCommentState,
        pullRequestState = pullRequestState,
        stateState = stateState,
        stateReasonState = stateReasonState,
        subIssuesSummaryState = subIssuesSummaryState,
        timelineUrlState = timelineUrlState,
        typeState = typeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesOpenedIssueXd676cae1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesOpenedIssueXd676cae1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssueXd676cae1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesOpenedIssueXd676cae1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 must be a JSON object")
      val assignees = json.decodeRequired<List<InlineWebhookIssuesOpenedIssueAssigneesItemX1a9659fe?>>(rawObject, "assignees")
      val authorAssociation = json.decodeRequired<InlineWebhookIssuesOpenedIssueAuthorAssociationX10323599>(rawObject, "author_association")
      val comments = json.decodeRequired<Int>(rawObject, "comments")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val labelsUrl = json.decodeRequired<String>(rawObject, "labels_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val reactions = json.decodeRequired<InlineWebhookIssuesOpenedIssueReactionsX07b32dbf>(rawObject, "reactions")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("active_lock_reason")) {
        throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 is missing required property 'active_lock_reason'")
      }
      val activeLockReason = rawObject["active_lock_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueActiveLockReasonXe861b810?>(requireNotNull(element)) }
      if (!rawObject.containsKey("body")) {
        throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("milestone")) {
        throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 is missing required property 'milestone'")
      }
      val milestone = rawObject["milestone"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueMilestoneX9de81add?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedIssueUserXca221b5b?>(requireNotNull(element)) }
      return InlineWebhookIssuesOpenedIssueXd676cae1(
        activeLockReason = activeLockReason,
        assignees = assignees,
        authorAssociation = authorAssociation,
        body = body,
        closedAt = closedAt,
        comments = comments,
        commentsUrl = commentsUrl,
        createdAt = createdAt,
        eventsUrl = eventsUrl,
        htmlUrl = htmlUrl,
        id = id,
        labelsUrl = labelsUrl,
        milestone = milestone,
        nodeId = nodeId,
        number = number,
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = user,
        assigneeState = json.decodeOptional(rawObject, "assignee", nullable = true),
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
        issueDependenciesSummaryState = json.decodeOptional(rawObject, "issue_dependencies_summary", nullable = false),
        issueFieldValuesState = json.decodeOptional(rawObject, "issue_field_values", nullable = false),
        labelsState = json.decodeOptional(rawObject, "labels", nullable = false),
        lockedState = json.decodeOptional(rawObject, "locked", nullable = false),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
        pinnedCommentState = json.decodeOptional(rawObject, "pinned_comment", nullable = true),
        pullRequestState = json.decodeOptional(rawObject, "pull_request", nullable = false),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        stateReasonState = json.decodeOptional(rawObject, "state_reason", nullable = true),
        subIssuesSummaryState = json.decodeOptional(rawObject, "sub_issues_summary", nullable = false),
        timelineUrlState = json.decodeOptional(rawObject, "timeline_url", nullable = false),
        typeState = json.decodeOptional(rawObject, "type", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssueXd676cae1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesOpenedIssueXd676cae1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active_lock_reason", value.activeLockReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("assignees", json.encodeToJsonElement(value.assignees))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("comments", json.encodeToJsonElement(value.comments))
        put("comments_url", value.commentsUrl)
        put("created_at", value.createdAt)
        put("events_url", value.eventsUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("labels_url", value.labelsUrl)
        put("milestone", value.milestone?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("reactions", json.encodeToJsonElement(value.reactions))
        put("repository_url", value.repositoryUrl)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("assignee", value.assigneeState, json::encodeToJsonElement)
        putState("draft", value.draftState, json::encodeToJsonElement)
        putState("issue_dependencies_summary", value.issueDependenciesSummaryState, json::encodeToJsonElement)
        putState("issue_field_values", value.issueFieldValuesState, json::encodeToJsonElement)
        putState("labels", value.labelsState, json::encodeToJsonElement)
        putState("locked", value.lockedState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
        putState("pinned_comment", value.pinnedCommentState, json::encodeToJsonElement)
        putState("pull_request", value.pullRequestState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("state_reason", value.stateReasonState, json::encodeToJsonElement)
        putState("sub_issues_summary", value.subIssuesSummaryState, json::encodeToJsonElement)
        putState("timeline_url", value.timelineUrlState, json::encodeToJsonElement)
        putState("type", value.typeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesOpenedIssueXd676cae1(block: InlineWebhookIssuesOpenedIssueXd676cae1.Builder.() -> Unit): InlineWebhookIssuesOpenedIssueXd676cae1 = InlineWebhookIssuesOpenedIssueXd676cae1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookIssuesOpenedIssueXd676cae1 property '" + name + "' is not nullable")
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

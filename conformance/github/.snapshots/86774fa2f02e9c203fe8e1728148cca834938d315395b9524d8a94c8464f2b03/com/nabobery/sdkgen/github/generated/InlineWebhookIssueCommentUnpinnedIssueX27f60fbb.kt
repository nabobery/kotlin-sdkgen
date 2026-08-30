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
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) the comment belongs to.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueX27f60fbb.Serializer::class)
public class InlineWebhookIssueCommentUnpinnedIssueX27f60fbb internal constructor(
  public val activeLockReason:
      InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade?,
  public val assignee: InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeX6866af4b?,
  assignees: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneesItemX07c21cd3?>,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation:
      InlineWebhookIssueCommentUnpinnedIssueAllOf1AuthorAssociationX1cd1fe5b,
  /**
   * Contents of the issue
   */
  public val body: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val closedAt: String?,
  public val comments: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val eventsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  labels: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd>,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val labelsUrl: String,
  public val locked: Boolean,
  /**
   * A collection of related issues and pull requests.
   */
  public val milestone: InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneX80cb615d?,
  public val nodeId: String,
  public val number: Int,
  public val reactions: InlineWebhookIssueCommentUnpinnedIssueAllOf1ReactionsX6144d025,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String,
  /**
   * State of the issue; either 'open' or 'closed'
   */
  public val state: InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8,
  /**
   * Title of the issue
   */
  public val title: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * URL for the issue
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: InlineWebhookIssueCommentUnpinnedIssueAllOf2UserXa9d6a2e0,
  private val draftState: FieldState<Boolean>,
  private val issueDependenciesSummaryState: FieldState<IssueDependenciesSummary>,
  private val performedViaGithubAppState:
      FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf1PerformedViaGithubAppX8a563758?>,
  private val pullRequestState:
      FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c>,
  private val stateReasonState: FieldState<String?>,
  private val subIssuesSummaryState: FieldState<SubIssuesSummary>,
  private val timelineUrlState: FieldState<String>,
  private val typeState: FieldState<IssueType?>,
) {
  public val assignees: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneesItemX07c21cd3?> =
      assignees.toList()

  public val labels: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd> =
      labels.toList()

  public val draft: Boolean?
    get() = draftState.valueOrNull()

  public val issueDependenciesSummary: IssueDependenciesSummary?
    get() = issueDependenciesSummaryState.valueOrNull()

  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val performedViaGithubApp:
      InlineWebhookIssueCommentUnpinnedIssueAllOf1PerformedViaGithubAppX8a563758?
    get() = performedViaGithubAppState.valueOrNull()

  public val pullRequest: InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c?
    get() = pullRequestState.valueOrNull()

  public val stateReason: String?
    get() = stateReasonState.valueOrNull()

  public val subIssuesSummary: SubIssuesSummary?
    get() = subIssuesSummaryState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val timelineUrl: String?
    get() = timelineUrlState.valueOrNull()

  public val type: IssueType?
    get() = typeState.valueOrNull()

  public constructor(
    activeLockReason: InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade?,
    assignee: InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeX6866af4b?,
    assignees: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneesItemX07c21cd3?>,
    authorAssociation: InlineWebhookIssueCommentUnpinnedIssueAllOf1AuthorAssociationX1cd1fe5b,
    body: String?,
    closedAt: String?,
    comments: Int,
    commentsUrl: String,
    createdAt: String,
    eventsUrl: String,
    htmlUrl: String,
    id: Long,
    labels: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd>,
    labelsUrl: String,
    locked: Boolean,
    milestone: InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneX80cb615d?,
    nodeId: String,
    number: Int,
    reactions: InlineWebhookIssueCommentUnpinnedIssueAllOf1ReactionsX6144d025,
    repositoryUrl: String,
    state: InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8,
    title: String,
    updatedAt: String,
    url: String,
    user: InlineWebhookIssueCommentUnpinnedIssueAllOf2UserXa9d6a2e0,
  ) : this(activeLockReason = activeLockReason,
  assignee = assignee,
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
  labels = labels,
  labelsUrl = labelsUrl,
  locked = locked,
  milestone = milestone,
  nodeId = nodeId,
  number = number,
  reactions = reactions,
  repositoryUrl = repositoryUrl,
  state = state,
  title = title,
  updatedAt = updatedAt,
  url = url,
  user = user,
  draftState = FieldState.Absent,
  issueDependenciesSummaryState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  pullRequestState = FieldState.Absent,
  stateReasonState = FieldState.Absent,
  subIssuesSummaryState = FieldState.Absent,
  timelineUrlState = FieldState.Absent,
  typeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `draft`.
   */
  public fun draftPresence(): FieldPresence = draftState.presence

  /**
   * Returns the wire presence of `issue_dependencies_summary`.
   */
  public fun issueDependenciesSummaryPresence(): FieldPresence = issueDependenciesSummaryState.presence

  /**
   * Returns the wire presence of `performed_via_github_app`.
   */
  public fun performedViaGithubAppPresence(): FieldPresence = performedViaGithubAppState.presence

  /**
   * Returns the wire presence of `pull_request`.
   */
  public fun pullRequestPresence(): FieldPresence = pullRequestState.presence

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
    private var assigneesValue:
        List<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneesItemX07c21cd3?>? = null

    public var assignees: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneesItemX07c21cd3?>
      get() = requireNotNull(assigneesValue) { "assignees is required" }.toList()
      set(`value`) {
        assigneesValue = value.toList()
      }

    private var authorAssociationValue:
        InlineWebhookIssueCommentUnpinnedIssueAllOf1AuthorAssociationX1cd1fe5b? = null

    public var authorAssociation:
        InlineWebhookIssueCommentUnpinnedIssueAllOf1AuthorAssociationX1cd1fe5b
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

    private var labelsValue: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd>?
        = null

    public var labels: List<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
      }

    private var labelsUrlValue: String? = null

    public var labelsUrl: String
      get() = requireNotNull(labelsUrlValue) { "labelsUrl is required" }
      set(`value`) {
        labelsUrlValue = value
      }

    private var lockedValue: Boolean? = null

    public var locked: Boolean
      get() = requireNotNull(lockedValue) { "locked is required" }
      set(`value`) {
        lockedValue = value
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

    private var reactionsValue: InlineWebhookIssueCommentUnpinnedIssueAllOf1ReactionsX6144d025? =
        null

    public var reactions: InlineWebhookIssueCommentUnpinnedIssueAllOf1ReactionsX6144d025
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

    private var stateValue: InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8? = null

    public var state: InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
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

    private var userValue: InlineWebhookIssueCommentUnpinnedIssueAllOf2UserXa9d6a2e0? = null

    public var user: InlineWebhookIssueCommentUnpinnedIssueAllOf2UserXa9d6a2e0
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    private var activeLockReasonState:
        FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var activeLockReason:
        InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var assigneeState:
        FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeX6866af4b?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var assignee: InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeX6866af4b?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
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
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var milestoneState:
        FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneX80cb615d?> =
        FieldState.Absent

    /**
     * A collection of related issues and pull requests.
     * Required nullable field; assigning `null` records present-null.
     */
    public var milestone: InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneX80cb615d?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
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

    private var performedViaGithubAppState:
        FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf1PerformedViaGithubAppX8a563758?> =
        FieldState.Absent

    /**
     * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
     * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps
     * are first class actors within GitHub.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp:
        InlineWebhookIssueCommentUnpinnedIssueAllOf1PerformedViaGithubAppX8a563758?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var pullRequestState:
        FieldState<InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pullRequest: InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c?
      get() = pullRequestState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pullRequest is not nullable; call unsetPullRequest() to omit it" }
        pullRequestState = FieldState.Value(present)
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
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
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
     * Omits `performed_via_github_app` from serialized output.
     */
    public fun unsetPerformedViaGithubApp() {
      performedViaGithubAppState = FieldState.Absent
    }

    /**
     * Omits `pull_request` from serialized output.
     */
    public fun unsetPullRequest() {
      pullRequestState = FieldState.Absent
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

    public fun build(): InlineWebhookIssueCommentUnpinnedIssueX27f60fbb {
      check(assigneesValue != null) { "assignees is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(commentsValue != null) { "comments is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(labelsValue != null) { "labels is required" }
      check(labelsUrlValue != null) { "labelsUrl is required" }
      check(lockedValue != null) { "locked is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(reactionsValue != null) { "reactions is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(stateValue != null) { "state is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(userValue != null) { "user is required" }
      check(activeLockReasonState !== FieldState.Absent) { "activeLockReason is required, even when null" }
      check(assigneeState !== FieldState.Absent) { "assignee is required, even when null" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(milestoneState !== FieldState.Absent) { "milestone is required, even when null" }
      return InlineWebhookIssueCommentUnpinnedIssueX27f60fbb(
        activeLockReason = activeLockReasonState.valueOrNull(),
        assignee = assigneeState.valueOrNull(),
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
        labels = labels,
        labelsUrl = labelsUrl,
        locked = locked,
        milestone = milestoneState.valueOrNull(),
        nodeId = nodeId,
        number = number,
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        state = state,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = user,
        draftState = draftState,
        issueDependenciesSummaryState = issueDependenciesSummaryState,
        performedViaGithubAppState = performedViaGithubAppState,
        pullRequestState = pullRequestState,
        stateReasonState = stateReasonState,
        subIssuesSummaryState = subIssuesSummaryState,
        timelineUrlState = timelineUrlState,
        typeState = typeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentUnpinnedIssueX27f60fbb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueX27f60fbb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueX27f60fbb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb must be a JSON object")
      val assignees = json.decodeRequired<List<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneesItemX07c21cd3?>>(rawObject, "assignees")
      val authorAssociation = json.decodeRequired<InlineWebhookIssueCommentUnpinnedIssueAllOf1AuthorAssociationX1cd1fe5b>(rawObject, "author_association")
      val comments = json.decodeRequired<Int>(rawObject, "comments")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val labels = json.decodeRequired<List<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd>>(rawObject, "labels")
      val labelsUrl = json.decodeRequired<String>(rawObject, "labels_url")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val reactions = json.decodeRequired<InlineWebhookIssueCommentUnpinnedIssueAllOf1ReactionsX6144d025>(rawObject, "reactions")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val state = json.decodeRequired<InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8>(rawObject, "state")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val user = json.decodeRequired<InlineWebhookIssueCommentUnpinnedIssueAllOf2UserXa9d6a2e0>(rawObject, "user")
      if (!rawObject.containsKey("active_lock_reason")) {
        throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb is missing required property 'active_lock_reason'")
      }
      val activeLockReason = rawObject["active_lock_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssueCommentUnpinnedIssueAllOf1ActiveLockReasonX587a5ade?>(requireNotNull(element)) }
      if (!rawObject.containsKey("assignee")) {
        throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb is missing required property 'assignee'")
      }
      val assignee = rawObject["assignee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeX6866af4b?>(requireNotNull(element)) }
      if (!rawObject.containsKey("body")) {
        throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("milestone")) {
        throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb is missing required property 'milestone'")
      }
      val milestone = rawObject["milestone"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneX80cb615d?>(requireNotNull(element)) }
      return InlineWebhookIssueCommentUnpinnedIssueX27f60fbb(
        activeLockReason = activeLockReason,
        assignee = assignee,
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
        labels = labels,
        labelsUrl = labelsUrl,
        locked = locked,
        milestone = milestone,
        nodeId = nodeId,
        number = number,
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        state = state,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = user,
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
        issueDependenciesSummaryState = json.decodeOptional(rawObject, "issue_dependencies_summary", nullable = false),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
        pullRequestState = json.decodeOptional(rawObject, "pull_request", nullable = false),
        stateReasonState = json.decodeOptional(rawObject, "state_reason", nullable = true),
        subIssuesSummaryState = json.decodeOptional(rawObject, "sub_issues_summary", nullable = false),
        timelineUrlState = json.decodeOptional(rawObject, "timeline_url", nullable = false),
        typeState = json.decodeOptional(rawObject, "type", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueX27f60fbb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active_lock_reason", value.activeLockReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("assignee", value.assignee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
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
        put("labels", json.encodeToJsonElement(value.labels))
        put("labels_url", value.labelsUrl)
        put("locked", json.encodeToJsonElement(value.locked))
        put("milestone", value.milestone?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("reactions", json.encodeToJsonElement(value.reactions))
        put("repository_url", value.repositoryUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", json.encodeToJsonElement(value.user))
        putState("draft", value.draftState, json::encodeToJsonElement)
        putState("issue_dependencies_summary", value.issueDependenciesSummaryState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
        putState("pull_request", value.pullRequestState, json::encodeToJsonElement)
        putState("state_reason", value.stateReasonState, json::encodeToJsonElement)
        putState("sub_issues_summary", value.subIssuesSummaryState, json::encodeToJsonElement)
        putState("timeline_url", value.timelineUrlState, json::encodeToJsonElement)
        putState("type", value.typeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssueCommentUnpinnedIssueX27f60fbb(block: InlineWebhookIssueCommentUnpinnedIssueX27f60fbb.Builder.() -> Unit): InlineWebhookIssueCommentUnpinnedIssueX27f60fbb = InlineWebhookIssueCommentUnpinnedIssueX27f60fbb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueX27f60fbb property '" + name + "' is not nullable")
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

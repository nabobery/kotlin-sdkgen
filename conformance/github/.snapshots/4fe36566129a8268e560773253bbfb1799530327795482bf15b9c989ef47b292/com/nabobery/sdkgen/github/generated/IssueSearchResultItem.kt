package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
 * Issue Search Result Item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-search-result-item
 */
@Serializable(with = IssueSearchResultItem.Serializer::class)
public class IssueSearchResultItem internal constructor(
  public val assignee: NullableSimpleUser?,
  public val authorAssociation: AuthorAssociation,
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
  labels: List<InlineIssueSearchResultItemLabelsItemXa4bc3a16>,
  public val labelsUrl: String,
  public val locked: Boolean,
  public val milestone: NullableMilestone?,
  public val nodeId: String,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  public val state: String,
  public val title: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  private val activeLockReasonState: FieldState<String?>,
  assigneesState: FieldState<List<SimpleUser>?>,
  private val bodyState: FieldState<String>,
  private val bodyHtmlState: FieldState<String>,
  private val bodyTextState: FieldState<String>,
  private val draftState: FieldState<Boolean>,
  private val issueDependenciesSummaryState: FieldState<IssueDependenciesSummary>,
  issueFieldValuesState: FieldState<List<IssueFieldValue>>,
  private val performedViaGithubAppState: FieldState<NullableIntegration?>,
  private val pinnedCommentState: FieldState<NullableIssueComment?>,
  private val pullRequestState: FieldState<InlineIssueSearchResultItemPullRequestXc30aa29e>,
  private val reactionsState: FieldState<ReactionRollup>,
  private val repositoryState: FieldState<Repository>,
  private val stateReasonState: FieldState<String?>,
  private val subIssuesSummaryState: FieldState<SubIssuesSummary>,
  textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>>,
  private val timelineUrlState: FieldState<String>,
  private val typeState: FieldState<IssueType?>,
) {
  public val labels: List<InlineIssueSearchResultItemLabelsItemXa4bc3a16> = labels.toList()

  private val assigneesState: FieldState<List<SimpleUser>?> =
      assigneesState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val issueFieldValuesState: FieldState<List<IssueFieldValue>> =
      issueFieldValuesState.copyValue { fieldValue -> fieldValue.toList() }

  private val textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
      textMatchesState.copyValue { fieldValue -> fieldValue.toList() }

  public val activeLockReason: String?
    get() = activeLockReasonState.valueOrNull()

  public val assignees: List<SimpleUser>?
    get() = assigneesState.valueOrNull()

  public val body: String?
    get() = bodyState.valueOrNull()

  public val bodyHtml: String?
    get() = bodyHtmlState.valueOrNull()

  public val bodyText: String?
    get() = bodyTextState.valueOrNull()

  public val draft: Boolean?
    get() = draftState.valueOrNull()

  public val issueDependenciesSummary: IssueDependenciesSummary?
    get() = issueDependenciesSummaryState.valueOrNull()

  public val issueFieldValues: List<IssueFieldValue>?
    get() = issueFieldValuesState.valueOrNull()

  public val performedViaGithubApp: NullableIntegration?
    get() = performedViaGithubAppState.valueOrNull()

  public val pinnedComment: NullableIssueComment?
    get() = pinnedCommentState.valueOrNull()

  public val pullRequest: InlineIssueSearchResultItemPullRequestXc30aa29e?
    get() = pullRequestState.valueOrNull()

  public val reactions: ReactionRollup?
    get() = reactionsState.valueOrNull()

  public val repository: Repository?
    get() = repositoryState.valueOrNull()

  public val stateReason: String?
    get() = stateReasonState.valueOrNull()

  public val subIssuesSummary: SubIssuesSummary?
    get() = subIssuesSummaryState.valueOrNull()

  public val textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
    get() = textMatchesState.valueOrNull()

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val timelineUrl: String?
    get() = timelineUrlState.valueOrNull()

  public val type: IssueType?
    get() = typeState.valueOrNull()

  public constructor(
    assignee: NullableSimpleUser?,
    authorAssociation: AuthorAssociation,
    closedAt: String?,
    comments: Int,
    commentsUrl: String,
    createdAt: String,
    eventsUrl: String,
    htmlUrl: String,
    id: Long,
    labels: List<InlineIssueSearchResultItemLabelsItemXa4bc3a16>,
    labelsUrl: String,
    locked: Boolean,
    milestone: NullableMilestone?,
    nodeId: String,
    number: Int,
    repositoryUrl: String,
    score: Double,
    state: String,
    title: String,
    updatedAt: String,
    url: String,
    user: NullableSimpleUser?,
  ) : this(assignee = assignee,
  authorAssociation = authorAssociation,
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
  repositoryUrl = repositoryUrl,
  score = score,
  state = state,
  title = title,
  updatedAt = updatedAt,
  url = url,
  user = user,
  activeLockReasonState = FieldState.Absent,
  assigneesState = FieldState.Absent,
  bodyState = FieldState.Absent,
  bodyHtmlState = FieldState.Absent,
  bodyTextState = FieldState.Absent,
  draftState = FieldState.Absent,
  issueDependenciesSummaryState = FieldState.Absent,
  issueFieldValuesState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  pinnedCommentState = FieldState.Absent,
  pullRequestState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  repositoryState = FieldState.Absent,
  stateReasonState = FieldState.Absent,
  subIssuesSummaryState = FieldState.Absent,
  textMatchesState = FieldState.Absent,
  timelineUrlState = FieldState.Absent,
  typeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `active_lock_reason`.
   */
  public fun activeLockReasonPresence(): FieldPresence = activeLockReasonState.presence

  /**
   * Returns the wire presence of `assignees`.
   */
  public fun assigneesPresence(): FieldPresence = assigneesState.presence

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `body_html`.
   */
  public fun bodyHtmlPresence(): FieldPresence = bodyHtmlState.presence

  /**
   * Returns the wire presence of `body_text`.
   */
  public fun bodyTextPresence(): FieldPresence = bodyTextState.presence

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
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  /**
   * Returns the wire presence of `repository`.
   */
  public fun repositoryPresence(): FieldPresence = repositoryState.presence

  /**
   * Returns the wire presence of `state_reason`.
   */
  public fun stateReasonPresence(): FieldPresence = stateReasonState.presence

  /**
   * Returns the wire presence of `sub_issues_summary`.
   */
  public fun subIssuesSummaryPresence(): FieldPresence = subIssuesSummaryState.presence

  /**
   * Returns the wire presence of `text_matches`.
   */
  public fun textMatchesPresence(): FieldPresence = textMatchesState.presence

  /**
   * Returns the wire presence of `timeline_url`.
   */
  public fun timelineUrlPresence(): FieldPresence = timelineUrlState.presence

  /**
   * Returns the wire presence of `type`.
   */
  public fun typePresence(): FieldPresence = typeState.presence

  public class Builder {
    private var authorAssociationValue: AuthorAssociation? = null

    public var authorAssociation: AuthorAssociation
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

    private var labelsValue: List<InlineIssueSearchResultItemLabelsItemXa4bc3a16>? = null

    public var labels: List<InlineIssueSearchResultItemLabelsItemXa4bc3a16>
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

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
      }

    private var stateValue: String? = null

    public var state: String
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

    private var assigneeState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var assignee: NullableSimpleUser?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
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

    private var milestoneState: FieldState<NullableMilestone?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var milestone: NullableMilestone?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var activeLockReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var activeLockReason: String?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var assigneesState: FieldState<List<SimpleUser>?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var assignees: List<SimpleUser>?
      get() = assigneesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        assigneesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var bodyState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "body is not nullable; call unsetBody() to omit it" }
        bodyState = FieldState.Value(present)
      }

    private var bodyHtmlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bodyHtml: String?
      get() = bodyHtmlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bodyHtml is not nullable; call unsetBodyHtml() to omit it" }
        bodyHtmlState = FieldState.Value(present)
      }

    private var bodyTextState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bodyText: String?
      get() = bodyTextState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bodyText is not nullable; call unsetBodyText() to omit it" }
        bodyTextState = FieldState.Value(present)
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
      get() = issueFieldValuesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "issueFieldValues is not nullable; call unsetIssueFieldValues() to omit it" }
        issueFieldValuesState = FieldState.Value(present.toList())
      }

    private var performedViaGithubAppState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp: NullableIntegration?
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

    private var pullRequestState: FieldState<InlineIssueSearchResultItemPullRequestXc30aa29e> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pullRequest: InlineIssueSearchResultItemPullRequestXc30aa29e?
      get() = pullRequestState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pullRequest is not nullable; call unsetPullRequest() to omit it" }
        pullRequestState = FieldState.Value(present)
      }

    private var reactionsState: FieldState<ReactionRollup> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: ReactionRollup?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    private var repositoryState: FieldState<Repository> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repository: Repository?
      get() = repositoryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "repository is not nullable; call unsetRepository() to omit it" }
        repositoryState = FieldState.Value(present)
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

    private var textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
      get() = textMatchesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "textMatches is not nullable; call unsetTextMatches() to omit it" }
        textMatchesState = FieldState.Value(present.toList())
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
     * Omits `active_lock_reason` from serialized output.
     */
    public fun unsetActiveLockReason() {
      activeLockReasonState = FieldState.Absent
    }

    /**
     * Omits `assignees` from serialized output.
     */
    public fun unsetAssignees() {
      assigneesState = FieldState.Absent
    }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    /**
     * Omits `body_html` from serialized output.
     */
    public fun unsetBodyHtml() {
      bodyHtmlState = FieldState.Absent
    }

    /**
     * Omits `body_text` from serialized output.
     */
    public fun unsetBodyText() {
      bodyTextState = FieldState.Absent
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
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    /**
     * Omits `repository` from serialized output.
     */
    public fun unsetRepository() {
      repositoryState = FieldState.Absent
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
     * Omits `text_matches` from serialized output.
     */
    public fun unsetTextMatches() {
      textMatchesState = FieldState.Absent
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

    public fun build(): IssueSearchResultItem {
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
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(scoreValue != null) { "score is required" }
      check(stateValue != null) { "state is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(assigneeState !== FieldState.Absent) { "assignee is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(milestoneState !== FieldState.Absent) { "milestone is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return IssueSearchResultItem(
        assignee = assigneeState.valueOrNull(),
        authorAssociation = authorAssociation,
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
        repositoryUrl = repositoryUrl,
        score = score,
        state = state,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        activeLockReasonState = activeLockReasonState,
        assigneesState = assigneesState,
        bodyState = bodyState,
        bodyHtmlState = bodyHtmlState,
        bodyTextState = bodyTextState,
        draftState = draftState,
        issueDependenciesSummaryState = issueDependenciesSummaryState,
        issueFieldValuesState = issueFieldValuesState,
        performedViaGithubAppState = performedViaGithubAppState,
        pinnedCommentState = pinnedCommentState,
        pullRequestState = pullRequestState,
        reactionsState = reactionsState,
        repositoryState = repositoryState,
        stateReasonState = stateReasonState,
        subIssuesSummaryState = subIssuesSummaryState,
        textMatchesState = textMatchesState,
        timelineUrlState = timelineUrlState,
        typeState = typeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueSearchResultItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueSearchResultItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueSearchResultItem {
      val jsonDecoder = decoder.requireJsonDecoder("IssueSearchResultItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueSearchResultItem must be a JSON object")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val comments = json.decodeRequired<Int>(rawObject, "comments")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val labels = json.decodeRequired<List<InlineIssueSearchResultItemLabelsItemXa4bc3a16>>(rawObject, "labels")
      val labelsUrl = json.decodeRequired<String>(rawObject, "labels_url")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val score = json.decodeRequired<Double>(rawObject, "score")
      val state = json.decodeRequired<String>(rawObject, "state")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("assignee")) {
        throw SerializationException("IssueSearchResultItem is missing required property 'assignee'")
      }
      val assignee = rawObject["assignee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("IssueSearchResultItem is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("milestone")) {
        throw SerializationException("IssueSearchResultItem is missing required property 'milestone'")
      }
      val milestone = rawObject["milestone"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableMilestone?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("IssueSearchResultItem is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return IssueSearchResultItem(
        assignee = assignee,
        authorAssociation = authorAssociation,
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
        repositoryUrl = repositoryUrl,
        score = score,
        state = state,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = user,
        activeLockReasonState = json.decodeOptional(rawObject, "active_lock_reason", nullable = true),
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = true),
        bodyState = json.decodeOptional(rawObject, "body", nullable = false),
        bodyHtmlState = json.decodeOptional(rawObject, "body_html", nullable = false),
        bodyTextState = json.decodeOptional(rawObject, "body_text", nullable = false),
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
        issueDependenciesSummaryState = json.decodeOptional(rawObject, "issue_dependencies_summary", nullable = false),
        issueFieldValuesState = json.decodeOptional(rawObject, "issue_field_values", nullable = false),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
        pinnedCommentState = json.decodeOptional(rawObject, "pinned_comment", nullable = true),
        pullRequestState = json.decodeOptional(rawObject, "pull_request", nullable = false),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
        repositoryState = json.decodeOptional(rawObject, "repository", nullable = false),
        stateReasonState = json.decodeOptional(rawObject, "state_reason", nullable = true),
        subIssuesSummaryState = json.decodeOptional(rawObject, "sub_issues_summary", nullable = false),
        textMatchesState = json.decodeOptional(rawObject, "text_matches", nullable = false),
        timelineUrlState = json.decodeOptional(rawObject, "timeline_url", nullable = false),
        typeState = json.decodeOptional(rawObject, "type", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueSearchResultItem) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueSearchResultItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assignee", value.assignee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
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
        put("repository_url", value.repositoryUrl)
        put("score", json.encodeToJsonElement(value.score))
        put("state", value.state)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("active_lock_reason", value.activeLockReasonState, json::encodeToJsonElement)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("body_html", value.bodyHtmlState, json::encodeToJsonElement)
        putState("body_text", value.bodyTextState, json::encodeToJsonElement)
        putState("draft", value.draftState, json::encodeToJsonElement)
        putState("issue_dependencies_summary", value.issueDependenciesSummaryState, json::encodeToJsonElement)
        putState("issue_field_values", value.issueFieldValuesState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
        putState("pinned_comment", value.pinnedCommentState, json::encodeToJsonElement)
        putState("pull_request", value.pullRequestState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
        putState("repository", value.repositoryState, json::encodeToJsonElement)
        putState("state_reason", value.stateReasonState, json::encodeToJsonElement)
        putState("sub_issues_summary", value.subIssuesSummaryState, json::encodeToJsonElement)
        putState("text_matches", value.textMatchesState, json::encodeToJsonElement)
        putState("timeline_url", value.timelineUrlState, json::encodeToJsonElement)
        putState("type", value.typeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueSearchResultItem(block: IssueSearchResultItem.Builder.() -> Unit): IssueSearchResultItem = IssueSearchResultItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueSearchResultItem is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("IssueSearchResultItem property '" + name + "' is not nullable")
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

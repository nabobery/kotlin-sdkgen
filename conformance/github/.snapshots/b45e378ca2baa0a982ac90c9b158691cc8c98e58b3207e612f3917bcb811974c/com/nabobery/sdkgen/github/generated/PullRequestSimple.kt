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
 * Pull Request Simple
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-simple
 */
@Serializable(with = PullRequestSimple.Serializer::class)
public class PullRequestSimple internal constructor(
  public val links: InlinePullRequestSimpleLinksX4d97c639,
  public val assignee: NullableSimpleUser?,
  public val authorAssociation: AuthorAssociation,
  public val autoMerge: AutoMerge?,
  public val base: InlinePullRequestSimpleBaseX090c35a6,
  public val body: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val closedAt: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commitsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val diffUrl: String,
  public val head: InlinePullRequestSimpleHeadX38384998,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueUrl: String,
  labels: List<InlinePullRequestSimpleLabelsItemX5ec3a33e>,
  public val locked: Boolean,
  public val mergeCommitSha: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val mergedAt: String?,
  public val milestone: NullableMilestone?,
  public val nodeId: String,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val patchUrl: String,
  public val reviewCommentUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reviewCommentsUrl: String,
  public val state: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val statusesUrl: String,
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
  assigneesState: FieldState<List<SimpleUser>>,
  private val draftState: FieldState<Boolean>,
  requestedReviewersState: FieldState<List<SimpleUser>>,
  requestedTeamsState: FieldState<List<Team>>,
) {
  public val labels: List<InlinePullRequestSimpleLabelsItemX5ec3a33e> = labels.toList()

  private val assigneesState: FieldState<List<SimpleUser>> =
      assigneesState.copyValue { fieldValue -> fieldValue.toList() }

  private val requestedReviewersState: FieldState<List<SimpleUser>> =
      requestedReviewersState.copyValue { fieldValue -> fieldValue.toList() }

  private val requestedTeamsState: FieldState<List<Team>> =
      requestedTeamsState.copyValue { fieldValue -> fieldValue.toList() }

  public val activeLockReason: String?
    get() = activeLockReasonState.valueOrNull()

  public val assignees: List<SimpleUser>?
    get() = assigneesState.valueOrNull()

  /**
   * Indicates whether or not the pull request is a draft.
   */
  public val draft: Boolean?
    get() = draftState.valueOrNull()

  public val requestedReviewers: List<SimpleUser>?
    get() = requestedReviewersState.valueOrNull()

  public val requestedTeams: List<Team>?
    get() = requestedTeamsState.valueOrNull()

  public constructor(
    links: InlinePullRequestSimpleLinksX4d97c639,
    assignee: NullableSimpleUser?,
    authorAssociation: AuthorAssociation,
    autoMerge: AutoMerge?,
    base: InlinePullRequestSimpleBaseX090c35a6,
    body: String?,
    closedAt: String?,
    commentsUrl: String,
    commitsUrl: String,
    createdAt: String,
    diffUrl: String,
    head: InlinePullRequestSimpleHeadX38384998,
    htmlUrl: String,
    id: Long,
    issueUrl: String,
    labels: List<InlinePullRequestSimpleLabelsItemX5ec3a33e>,
    locked: Boolean,
    mergeCommitSha: String?,
    mergedAt: String?,
    milestone: NullableMilestone?,
    nodeId: String,
    number: Int,
    patchUrl: String,
    reviewCommentUrl: String,
    reviewCommentsUrl: String,
    state: String,
    statusesUrl: String,
    title: String,
    updatedAt: String,
    url: String,
    user: NullableSimpleUser?,
  ) : this(links = links,
  assignee = assignee,
  authorAssociation = authorAssociation,
  autoMerge = autoMerge,
  base = base,
  body = body,
  closedAt = closedAt,
  commentsUrl = commentsUrl,
  commitsUrl = commitsUrl,
  createdAt = createdAt,
  diffUrl = diffUrl,
  head = head,
  htmlUrl = htmlUrl,
  id = id,
  issueUrl = issueUrl,
  labels = labels,
  locked = locked,
  mergeCommitSha = mergeCommitSha,
  mergedAt = mergedAt,
  milestone = milestone,
  nodeId = nodeId,
  number = number,
  patchUrl = patchUrl,
  reviewCommentUrl = reviewCommentUrl,
  reviewCommentsUrl = reviewCommentsUrl,
  state = state,
  statusesUrl = statusesUrl,
  title = title,
  updatedAt = updatedAt,
  url = url,
  user = user,
  activeLockReasonState = FieldState.Absent,
  assigneesState = FieldState.Absent,
  draftState = FieldState.Absent,
  requestedReviewersState = FieldState.Absent,
  requestedTeamsState = FieldState.Absent,
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
   * Returns the wire presence of `draft`.
   */
  public fun draftPresence(): FieldPresence = draftState.presence

  /**
   * Returns the wire presence of `requested_reviewers`.
   */
  public fun requestedReviewersPresence(): FieldPresence = requestedReviewersState.presence

  /**
   * Returns the wire presence of `requested_teams`.
   */
  public fun requestedTeamsPresence(): FieldPresence = requestedTeamsState.presence

  public class Builder {
    private var linksValue: InlinePullRequestSimpleLinksX4d97c639? = null

    public var links: InlinePullRequestSimpleLinksX4d97c639
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var authorAssociationValue: AuthorAssociation? = null

    public var authorAssociation: AuthorAssociation
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var baseValue: InlinePullRequestSimpleBaseX090c35a6? = null

    public var base: InlinePullRequestSimpleBaseX090c35a6
      get() = requireNotNull(baseValue) { "base is required" }
      set(`value`) {
        baseValue = value
      }

    private var commentsUrlValue: String? = null

    public var commentsUrl: String
      get() = requireNotNull(commentsUrlValue) { "commentsUrl is required" }
      set(`value`) {
        commentsUrlValue = value
      }

    private var commitsUrlValue: String? = null

    public var commitsUrl: String
      get() = requireNotNull(commitsUrlValue) { "commitsUrl is required" }
      set(`value`) {
        commitsUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var diffUrlValue: String? = null

    public var diffUrl: String
      get() = requireNotNull(diffUrlValue) { "diffUrl is required" }
      set(`value`) {
        diffUrlValue = value
      }

    private var headValue: InlinePullRequestSimpleHeadX38384998? = null

    public var head: InlinePullRequestSimpleHeadX38384998
      get() = requireNotNull(headValue) { "head is required" }
      set(`value`) {
        headValue = value
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

    private var issueUrlValue: String? = null

    public var issueUrl: String
      get() = requireNotNull(issueUrlValue) { "issueUrl is required" }
      set(`value`) {
        issueUrlValue = value
      }

    private var labelsValue: List<InlinePullRequestSimpleLabelsItemX5ec3a33e>? = null

    public var labels: List<InlinePullRequestSimpleLabelsItemX5ec3a33e>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
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

    private var patchUrlValue: String? = null

    public var patchUrl: String
      get() = requireNotNull(patchUrlValue) { "patchUrl is required" }
      set(`value`) {
        patchUrlValue = value
      }

    private var reviewCommentUrlValue: String? = null

    public var reviewCommentUrl: String
      get() = requireNotNull(reviewCommentUrlValue) { "reviewCommentUrl is required" }
      set(`value`) {
        reviewCommentUrlValue = value
      }

    private var reviewCommentsUrlValue: String? = null

    public var reviewCommentsUrl: String
      get() = requireNotNull(reviewCommentsUrlValue) { "reviewCommentsUrl is required" }
      set(`value`) {
        reviewCommentsUrlValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var statusesUrlValue: String? = null

    public var statusesUrl: String
      get() = requireNotNull(statusesUrlValue) { "statusesUrl is required" }
      set(`value`) {
        statusesUrlValue = value
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

    private var autoMergeState: FieldState<AutoMerge?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var autoMerge: AutoMerge?
      get() = autoMergeState.valueOrNull()
      set(`value`) {
        autoMergeState = value.toNullableFieldState()
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
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

    private var mergeCommitShaState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var mergeCommitSha: String?
      get() = mergeCommitShaState.valueOrNull()
      set(`value`) {
        mergeCommitShaState = value.toNullableFieldState()
      }

    private var mergedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var mergedAt: String?
      get() = mergedAtState.valueOrNull()
      set(`value`) {
        mergedAtState = value.toNullableFieldState()
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

    private var assigneesState: FieldState<List<SimpleUser>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var assignees: List<SimpleUser>?
      get() = assigneesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "assignees is not nullable; call unsetAssignees() to omit it" }
        assigneesState = FieldState.Value(present.toList())
      }

    private var draftState: FieldState<Boolean> = FieldState.Absent

    /**
     * Indicates whether or not the pull request is a draft.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var draft: Boolean?
      get() = draftState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "draft is not nullable; call unsetDraft() to omit it" }
        draftState = FieldState.Value(present)
      }

    private var requestedReviewersState: FieldState<List<SimpleUser>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requestedReviewers: List<SimpleUser>?
      get() = requestedReviewersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "requestedReviewers is not nullable; call unsetRequestedReviewers() to omit it" }
        requestedReviewersState = FieldState.Value(present.toList())
      }

    private var requestedTeamsState: FieldState<List<Team>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requestedTeams: List<Team>?
      get() = requestedTeamsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "requestedTeams is not nullable; call unsetRequestedTeams() to omit it" }
        requestedTeamsState = FieldState.Value(present.toList())
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
     * Omits `draft` from serialized output.
     */
    public fun unsetDraft() {
      draftState = FieldState.Absent
    }

    /**
     * Omits `requested_reviewers` from serialized output.
     */
    public fun unsetRequestedReviewers() {
      requestedReviewersState = FieldState.Absent
    }

    /**
     * Omits `requested_teams` from serialized output.
     */
    public fun unsetRequestedTeams() {
      requestedTeamsState = FieldState.Absent
    }

    public fun build(): PullRequestSimple {
      check(linksValue != null) { "links is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(baseValue != null) { "base is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitsUrlValue != null) { "commitsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(diffUrlValue != null) { "diffUrl is required" }
      check(headValue != null) { "head is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issueUrlValue != null) { "issueUrl is required" }
      check(labelsValue != null) { "labels is required" }
      check(lockedValue != null) { "locked is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(patchUrlValue != null) { "patchUrl is required" }
      check(reviewCommentUrlValue != null) { "reviewCommentUrl is required" }
      check(reviewCommentsUrlValue != null) { "reviewCommentsUrl is required" }
      check(stateValue != null) { "state is required" }
      check(statusesUrlValue != null) { "statusesUrl is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(assigneeState !== FieldState.Absent) { "assignee is required, even when null" }
      check(autoMergeState !== FieldState.Absent) { "autoMerge is required, even when null" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(mergeCommitShaState !== FieldState.Absent) { "mergeCommitSha is required, even when null" }
      check(mergedAtState !== FieldState.Absent) { "mergedAt is required, even when null" }
      check(milestoneState !== FieldState.Absent) { "milestone is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return PullRequestSimple(
        links = links,
        assignee = assigneeState.valueOrNull(),
        authorAssociation = authorAssociation,
        autoMerge = autoMergeState.valueOrNull(),
        base = base,
        body = bodyState.valueOrNull(),
        closedAt = closedAtState.valueOrNull(),
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        createdAt = createdAt,
        diffUrl = diffUrl,
        head = head,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        labels = labels,
        locked = locked,
        mergeCommitSha = mergeCommitShaState.valueOrNull(),
        mergedAt = mergedAtState.valueOrNull(),
        milestone = milestoneState.valueOrNull(),
        nodeId = nodeId,
        number = number,
        patchUrl = patchUrl,
        reviewCommentUrl = reviewCommentUrl,
        reviewCommentsUrl = reviewCommentsUrl,
        state = state,
        statusesUrl = statusesUrl,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        activeLockReasonState = activeLockReasonState,
        assigneesState = assigneesState,
        draftState = draftState,
        requestedReviewersState = requestedReviewersState,
        requestedTeamsState = requestedTeamsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestSimple = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestSimple> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestSimple {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestSimple")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestSimple must be a JSON object")
      val links = json.decodeRequired<InlinePullRequestSimpleLinksX4d97c639>(rawObject, "_links")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val base = json.decodeRequired<InlinePullRequestSimpleBaseX090c35a6>(rawObject, "base")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commitsUrl = json.decodeRequired<String>(rawObject, "commits_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diffUrl = json.decodeRequired<String>(rawObject, "diff_url")
      val head = json.decodeRequired<InlinePullRequestSimpleHeadX38384998>(rawObject, "head")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val labels = json.decodeRequired<List<InlinePullRequestSimpleLabelsItemX5ec3a33e>>(rawObject, "labels")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val patchUrl = json.decodeRequired<String>(rawObject, "patch_url")
      val reviewCommentUrl = json.decodeRequired<String>(rawObject, "review_comment_url")
      val reviewCommentsUrl = json.decodeRequired<String>(rawObject, "review_comments_url")
      val state = json.decodeRequired<String>(rawObject, "state")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("assignee")) {
        throw SerializationException("PullRequestSimple is missing required property 'assignee'")
      }
      val assignee = rawObject["assignee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("auto_merge")) {
        throw SerializationException("PullRequestSimple is missing required property 'auto_merge'")
      }
      val autoMerge = rawObject["auto_merge"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AutoMerge?>(requireNotNull(element)) }
      if (!rawObject.containsKey("body")) {
        throw SerializationException("PullRequestSimple is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("PullRequestSimple is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("merge_commit_sha")) {
        throw SerializationException("PullRequestSimple is missing required property 'merge_commit_sha'")
      }
      val mergeCommitSha = rawObject["merge_commit_sha"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("merged_at")) {
        throw SerializationException("PullRequestSimple is missing required property 'merged_at'")
      }
      val mergedAt = rawObject["merged_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("milestone")) {
        throw SerializationException("PullRequestSimple is missing required property 'milestone'")
      }
      val milestone = rawObject["milestone"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableMilestone?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("PullRequestSimple is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return PullRequestSimple(
        links = links,
        assignee = assignee,
        authorAssociation = authorAssociation,
        autoMerge = autoMerge,
        base = base,
        body = body,
        closedAt = closedAt,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        createdAt = createdAt,
        diffUrl = diffUrl,
        head = head,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        labels = labels,
        locked = locked,
        mergeCommitSha = mergeCommitSha,
        mergedAt = mergedAt,
        milestone = milestone,
        nodeId = nodeId,
        number = number,
        patchUrl = patchUrl,
        reviewCommentUrl = reviewCommentUrl,
        reviewCommentsUrl = reviewCommentsUrl,
        state = state,
        statusesUrl = statusesUrl,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = user,
        activeLockReasonState = json.decodeOptional(rawObject, "active_lock_reason", nullable = true),
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
        requestedReviewersState = json.decodeOptional(rawObject, "requested_reviewers", nullable = false),
        requestedTeamsState = json.decodeOptional(rawObject, "requested_teams", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestSimple) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestSimple")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("assignee", value.assignee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("auto_merge", value.autoMerge?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("base", json.encodeToJsonElement(value.base))
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("comments_url", value.commentsUrl)
        put("commits_url", value.commitsUrl)
        put("created_at", value.createdAt)
        put("diff_url", value.diffUrl)
        put("head", json.encodeToJsonElement(value.head))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issue_url", value.issueUrl)
        put("labels", json.encodeToJsonElement(value.labels))
        put("locked", json.encodeToJsonElement(value.locked))
        put("merge_commit_sha", value.mergeCommitSha?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("merged_at", value.mergedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("milestone", value.milestone?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("patch_url", value.patchUrl)
        put("review_comment_url", value.reviewCommentUrl)
        put("review_comments_url", value.reviewCommentsUrl)
        put("state", value.state)
        put("statuses_url", value.statusesUrl)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("active_lock_reason", value.activeLockReasonState, json::encodeToJsonElement)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("draft", value.draftState, json::encodeToJsonElement)
        putState("requested_reviewers", value.requestedReviewersState, json::encodeToJsonElement)
        putState("requested_teams", value.requestedTeamsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestSimple(block: PullRequestSimple.Builder.() -> Unit): PullRequestSimple = PullRequestSimple.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestSimple is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PullRequestSimple property '" + name + "' is not nullable")
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

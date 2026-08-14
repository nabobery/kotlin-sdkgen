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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestX172aa877.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedPullRequestX172aa877(
  public val links: InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e,
  public val activeLockReason:
      InlineWebhookPullRequestReviewDismissedPullRequestActiveLockReasonX1d15c3f5?,
  public val assignee: InlineWebhookPullRequestReviewDismissedPullRequestAssigneeXbff4c7dd?,
  assignees: List<InlineWebhookPullRequestReviewDismissedPullRequestAssigneesItemXb16679f5?>,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation:
      InlineWebhookPullRequestReviewDismissedPullRequestAuthorAssociationX8bc5fba9,
  /**
   * The status of auto merging a pull request.
   */
  public val autoMerge: InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeX9e4acd51?,
  public val base: InlineWebhookPullRequestReviewDismissedPullRequestBaseX23885a8b,
  public val body: String?,
  public val closedAt: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commitsUrl: String,
  public val createdAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val diffUrl: String,
  public val draft: Boolean,
  public val head: InlineWebhookPullRequestReviewDismissedPullRequestHeadX01e7f98d,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueUrl: String,
  labels: List<InlineWebhookPullRequestReviewDismissedPullRequestLabelsItemX178286ee>,
  public val locked: Boolean,
  public val mergeCommitSha: String?,
  public val mergedAt: String?,
  /**
   * A collection of related issues and pull requests.
   */
  public val milestone: InlineWebhookPullRequestReviewDismissedPullRequestMilestoneXa8b608c5?,
  public val nodeId: String,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val patchUrl: String,
  requestedReviewers: List<InlineWebhookPullRequestRe8581PullRequestRequestedReviewersItemX7fe7f3b1>,
  requestedTeams: List<InlineWebhookPullRequestReviewDismissedPullRequestRequestedTeamsItemX9c573b88>,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reviewCommentUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reviewCommentsUrl: String,
  public val state: InlineWebhookPullRequestReviewDismissedPullRequestStateXdde96a73,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val statusesUrl: String,
  public val title: String,
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: InlineWebhookPullRequestReviewDismissedPullRequestUserX638cac00?,
) {
  public val assignees:
      List<InlineWebhookPullRequestReviewDismissedPullRequestAssigneesItemXb16679f5?> =
      assignees.toList()

  public val labels: List<InlineWebhookPullRequestReviewDismissedPullRequestLabelsItemX178286ee> =
      labels.toList()

  public val requestedReviewers:
      List<InlineWebhookPullRequestRe8581PullRequestRequestedReviewersItemX7fe7f3b1> =
      requestedReviewers.toList()

  public val requestedTeams:
      List<InlineWebhookPullRequestReviewDismissedPullRequestRequestedTeamsItemX9c573b88> =
      requestedTeams.toList()

  public class Builder {
    private var linksValue: InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e? = null

    public var links: InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var assigneesValue:
        List<InlineWebhookPullRequestReviewDismissedPullRequestAssigneesItemXb16679f5?>? = null

    public var assignees:
        List<InlineWebhookPullRequestReviewDismissedPullRequestAssigneesItemXb16679f5?>
      get() = requireNotNull(assigneesValue) { "assignees is required" }.toList()
      set(`value`) {
        assigneesValue = value.toList()
      }

    private var authorAssociationValue:
        InlineWebhookPullRequestReviewDismissedPullRequestAuthorAssociationX8bc5fba9? = null

    public var authorAssociation:
        InlineWebhookPullRequestReviewDismissedPullRequestAuthorAssociationX8bc5fba9
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var baseValue: InlineWebhookPullRequestReviewDismissedPullRequestBaseX23885a8b? = null

    public var base: InlineWebhookPullRequestReviewDismissedPullRequestBaseX23885a8b
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

    private var draftValue: Boolean? = null

    public var draft: Boolean
      get() = requireNotNull(draftValue) { "draft is required" }
      set(`value`) {
        draftValue = value
      }

    private var headValue: InlineWebhookPullRequestReviewDismissedPullRequestHeadX01e7f98d? = null

    public var head: InlineWebhookPullRequestReviewDismissedPullRequestHeadX01e7f98d
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

    private var idValue: Int? = null

    public var id: Int
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

    private var labelsValue:
        List<InlineWebhookPullRequestReviewDismissedPullRequestLabelsItemX178286ee>? = null

    public var labels: List<InlineWebhookPullRequestReviewDismissedPullRequestLabelsItemX178286ee>
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

    private var requestedReviewersValue:
        List<InlineWebhookPullRequestRe8581PullRequestRequestedReviewersItemX7fe7f3b1>? = null

    public var requestedReviewers:
        List<InlineWebhookPullRequestRe8581PullRequestRequestedReviewersItemX7fe7f3b1>
      get() = requireNotNull(requestedReviewersValue) { "requestedReviewers is required" }.toList()
      set(`value`) {
        requestedReviewersValue = value.toList()
      }

    private var requestedTeamsValue:
        List<InlineWebhookPullRequestReviewDismissedPullRequestRequestedTeamsItemX9c573b88>? = null

    public var requestedTeams:
        List<InlineWebhookPullRequestReviewDismissedPullRequestRequestedTeamsItemX9c573b88>
      get() = requireNotNull(requestedTeamsValue) { "requestedTeams is required" }.toList()
      set(`value`) {
        requestedTeamsValue = value.toList()
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

    private var stateValue: InlineWebhookPullRequestReviewDismissedPullRequestStateXdde96a73? = null

    public var state: InlineWebhookPullRequestReviewDismissedPullRequestStateXdde96a73
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

    private var activeLockReasonState:
        FieldState<InlineWebhookPullRequestReviewDismissedPullRequestActiveLockReasonX1d15c3f5?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var activeLockReason:
        InlineWebhookPullRequestReviewDismissedPullRequestActiveLockReasonX1d15c3f5?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var assigneeState:
        FieldState<InlineWebhookPullRequestReviewDismissedPullRequestAssigneeXbff4c7dd?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var assignee: InlineWebhookPullRequestReviewDismissedPullRequestAssigneeXbff4c7dd?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
      }

    private var autoMergeState:
        FieldState<InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeX9e4acd51?> =
        FieldState.Absent

    /**
     * The status of auto merging a pull request.
     * Required nullable field; assigning `null` records present-null.
     */
    public var autoMerge: InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeX9e4acd51?
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
     * Required nullable field; assigning `null` records present-null.
     */
    public var mergedAt: String?
      get() = mergedAtState.valueOrNull()
      set(`value`) {
        mergedAtState = value.toNullableFieldState()
      }

    private var milestoneState:
        FieldState<InlineWebhookPullRequestReviewDismissedPullRequestMilestoneXa8b608c5?> =
        FieldState.Absent

    /**
     * A collection of related issues and pull requests.
     * Required nullable field; assigning `null` records present-null.
     */
    public var milestone: InlineWebhookPullRequestReviewDismissedPullRequestMilestoneXa8b608c5?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestReviewDismissedPullRequestUserX638cac00?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestReviewDismissedPullRequestUserX638cac00?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 {
      check(linksValue != null) { "links is required" }
      check(assigneesValue != null) { "assignees is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(baseValue != null) { "base is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitsUrlValue != null) { "commitsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(diffUrlValue != null) { "diffUrl is required" }
      check(draftValue != null) { "draft is required" }
      check(headValue != null) { "head is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issueUrlValue != null) { "issueUrl is required" }
      check(labelsValue != null) { "labels is required" }
      check(lockedValue != null) { "locked is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(patchUrlValue != null) { "patchUrl is required" }
      check(requestedReviewersValue != null) { "requestedReviewers is required" }
      check(requestedTeamsValue != null) { "requestedTeams is required" }
      check(reviewCommentUrlValue != null) { "reviewCommentUrl is required" }
      check(reviewCommentsUrlValue != null) { "reviewCommentsUrl is required" }
      check(stateValue != null) { "state is required" }
      check(statusesUrlValue != null) { "statusesUrl is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(activeLockReasonState !== FieldState.Absent) { "activeLockReason is required, even when null" }
      check(assigneeState !== FieldState.Absent) { "assignee is required, even when null" }
      check(autoMergeState !== FieldState.Absent) { "autoMerge is required, even when null" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(mergeCommitShaState !== FieldState.Absent) { "mergeCommitSha is required, even when null" }
      check(mergedAtState !== FieldState.Absent) { "mergedAt is required, even when null" }
      check(milestoneState !== FieldState.Absent) { "milestone is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestReviewDismissedPullRequestX172aa877(
        links = links,
        activeLockReason = activeLockReasonState.valueOrNull(),
        assignee = assigneeState.valueOrNull(),
        assignees = assignees,
        authorAssociation = authorAssociation,
        autoMerge = autoMergeState.valueOrNull(),
        base = base,
        body = bodyState.valueOrNull(),
        closedAt = closedAtState.valueOrNull(),
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        createdAt = createdAt,
        diffUrl = diffUrl,
        draft = draft,
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
        requestedReviewers = requestedReviewers,
        requestedTeams = requestedTeams,
        reviewCommentUrl = reviewCommentUrl,
        reviewCommentsUrl = reviewCommentsUrl,
        state = state,
        statusesUrl = statusesUrl,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestX172aa877> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 must be a JSON object")
      val links = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e>(rawObject, "_links")
      val assignees = json.decodeRequired<List<InlineWebhookPullRequestReviewDismissedPullRequestAssigneesItemXb16679f5?>>(rawObject, "assignees")
      val authorAssociation = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestAuthorAssociationX8bc5fba9>(rawObject, "author_association")
      val base = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestBaseX23885a8b>(rawObject, "base")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commitsUrl = json.decodeRequired<String>(rawObject, "commits_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diffUrl = json.decodeRequired<String>(rawObject, "diff_url")
      val draft = json.decodeRequired<Boolean>(rawObject, "draft")
      val head = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestHeadX01e7f98d>(rawObject, "head")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val labels = json.decodeRequired<List<InlineWebhookPullRequestReviewDismissedPullRequestLabelsItemX178286ee>>(rawObject, "labels")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val patchUrl = json.decodeRequired<String>(rawObject, "patch_url")
      val requestedReviewers = json.decodeRequired<List<InlineWebhookPullRequestRe8581PullRequestRequestedReviewersItemX7fe7f3b1>>(rawObject, "requested_reviewers")
      val requestedTeams = json.decodeRequired<List<InlineWebhookPullRequestReviewDismissedPullRequestRequestedTeamsItemX9c573b88>>(rawObject, "requested_teams")
      val reviewCommentUrl = json.decodeRequired<String>(rawObject, "review_comment_url")
      val reviewCommentsUrl = json.decodeRequired<String>(rawObject, "review_comments_url")
      val state = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestStateXdde96a73>(rawObject, "state")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("active_lock_reason")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'active_lock_reason'")
      }
      val activeLockReason = rawObject["active_lock_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewDismissedPullRequestActiveLockReasonX1d15c3f5?>(requireNotNull(element)) }
      if (!rawObject.containsKey("assignee")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'assignee'")
      }
      val assignee = rawObject["assignee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewDismissedPullRequestAssigneeXbff4c7dd?>(requireNotNull(element)) }
      if (!rawObject.containsKey("auto_merge")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'auto_merge'")
      }
      val autoMerge = rawObject["auto_merge"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeX9e4acd51?>(requireNotNull(element)) }
      if (!rawObject.containsKey("body")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("merge_commit_sha")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'merge_commit_sha'")
      }
      val mergeCommitSha = rawObject["merge_commit_sha"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("merged_at")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'merged_at'")
      }
      val mergedAt = rawObject["merged_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("milestone")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'milestone'")
      }
      val milestone = rawObject["milestone"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewDismissedPullRequestMilestoneXa8b608c5?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewDismissedPullRequestUserX638cac00?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewDismissedPullRequestX172aa877(
        links = links,
        activeLockReason = activeLockReason,
        assignee = assignee,
        assignees = assignees,
        authorAssociation = authorAssociation,
        autoMerge = autoMerge,
        base = base,
        body = body,
        closedAt = closedAt,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        createdAt = createdAt,
        diffUrl = diffUrl,
        draft = draft,
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
        requestedReviewers = requestedReviewers,
        requestedTeams = requestedTeams,
        reviewCommentUrl = reviewCommentUrl,
        reviewCommentsUrl = reviewCommentsUrl,
        state = state,
        statusesUrl = statusesUrl,
        title = title,
        updatedAt = updatedAt,
        url = url,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestX172aa877) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("active_lock_reason", value.activeLockReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("assignee", value.assignee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("assignees", json.encodeToJsonElement(value.assignees))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("auto_merge", value.autoMerge?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("base", json.encodeToJsonElement(value.base))
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("comments_url", value.commentsUrl)
        put("commits_url", value.commitsUrl)
        put("created_at", value.createdAt)
        put("diff_url", value.diffUrl)
        put("draft", json.encodeToJsonElement(value.draft))
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
        put("requested_reviewers", json.encodeToJsonElement(value.requestedReviewers))
        put("requested_teams", json.encodeToJsonElement(value.requestedTeams))
        put("review_comment_url", value.reviewCommentUrl)
        put("review_comments_url", value.reviewCommentsUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("statuses_url", value.statusesUrl)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedPullRequestX172aa877(block: InlineWebhookPullRequestReviewDismissedPullRequestX172aa877.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 = InlineWebhookPullRequestReviewDismissedPullRequestX172aa877.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestX172aa877 property '" + name + "' is not nullable")
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

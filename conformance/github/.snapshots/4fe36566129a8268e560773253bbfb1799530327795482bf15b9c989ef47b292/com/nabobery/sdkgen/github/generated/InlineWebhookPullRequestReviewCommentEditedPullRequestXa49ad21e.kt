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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e.Serializer::class)
public class InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e internal constructor(
  public val links: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311,
  public val activeLockReason:
      InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684?,
  public val assignee: InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneeXfba4428d?,
  assignees: List<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemX1f2b88dc?>,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation:
      InlineWebhookPullRequestReviewCommentEditedPullRequestAuthorAssociationX0b59c6b1,
  public val base: InlineWebhookPullRequestReviewCommentEditedPullRequestBaseX47ee583c,
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
  public val head: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueUrl: String,
  labels: List<InlineWebhookPullRequestReviewCommentEditedPullRequestLabelsItemX9ac22feb>,
  public val locked: Boolean,
  public val mergeCommitSha: String?,
  public val mergedAt: String?,
  /**
   * A collection of related issues and pull requests.
   */
  public val milestone: InlineWebhookPullRequestReviewCommentEditedPullRequestMilestoneX3d5bfccb?,
  public val nodeId: String,
  public val number: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val patchUrl: String,
  requestedReviewers: List<InlineWebhookPullRequestRed95bPullRequestRequestedReviewersItemXd1949048>,
  requestedTeams: List<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemXb29acce1>,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reviewCommentUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reviewCommentsUrl: String,
  public val state: InlineWebhookPullRequestReviewCommentEditedPullRequestStateX76c7ad96,
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
  public val user: InlineWebhookPullRequestReviewCommentEditedPullRequestUserXda4f1398?,
  private val autoMergeState:
      FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestAutoMergeXd6b0b13d?>,
  private val draftState: FieldState<Boolean>,
) {
  public val assignees:
      List<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemX1f2b88dc?> =
      assignees.toList()

  public val labels: List<InlineWebhookPullRequestReviewCommentEditedPullRequestLabelsItemX9ac22feb>
      = labels.toList()

  public val requestedReviewers:
      List<InlineWebhookPullRequestRed95bPullRequestRequestedReviewersItemXd1949048> =
      requestedReviewers.toList()

  public val requestedTeams:
      List<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemXb29acce1> =
      requestedTeams.toList()

  /**
   * The status of auto merging a pull request.
   */
  public val autoMerge: InlineWebhookPullRequestReviewCommentEditedPullRequestAutoMergeXd6b0b13d?
    get() = autoMergeState.valueOrNull()

  public val draft: Boolean?
    get() = draftState.valueOrNull()

  public constructor(
    links: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311,
    activeLockReason: InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684?,
    assignee: InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneeXfba4428d?,
    assignees: List<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemX1f2b88dc?>,
    authorAssociation: InlineWebhookPullRequestReviewCommentEditedPullRequestAuthorAssociationX0b59c6b1,
    base: InlineWebhookPullRequestReviewCommentEditedPullRequestBaseX47ee583c,
    body: String?,
    closedAt: String?,
    commentsUrl: String,
    commitsUrl: String,
    createdAt: String,
    diffUrl: String,
    head: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e,
    htmlUrl: String,
    id: Int,
    issueUrl: String,
    labels: List<InlineWebhookPullRequestReviewCommentEditedPullRequestLabelsItemX9ac22feb>,
    locked: Boolean,
    mergeCommitSha: String?,
    mergedAt: String?,
    milestone: InlineWebhookPullRequestReviewCommentEditedPullRequestMilestoneX3d5bfccb?,
    nodeId: String,
    number: Int,
    patchUrl: String,
    requestedReviewers: List<InlineWebhookPullRequestRed95bPullRequestRequestedReviewersItemXd1949048>,
    requestedTeams: List<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemXb29acce1>,
    reviewCommentUrl: String,
    reviewCommentsUrl: String,
    state: InlineWebhookPullRequestReviewCommentEditedPullRequestStateX76c7ad96,
    statusesUrl: String,
    title: String,
    updatedAt: String,
    url: String,
    user: InlineWebhookPullRequestReviewCommentEditedPullRequestUserXda4f1398?,
  ) : this(links = links,
  activeLockReason = activeLockReason,
  assignee = assignee,
  assignees = assignees,
  authorAssociation = authorAssociation,
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
  autoMergeState = FieldState.Absent,
  draftState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `auto_merge`.
   */
  public fun autoMergePresence(): FieldPresence = autoMergeState.presence

  /**
   * Returns the wire presence of `draft`.
   */
  public fun draftPresence(): FieldPresence = draftState.presence

  public class Builder {
    private var linksValue: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311? =
        null

    public var links: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var assigneesValue:
        List<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemX1f2b88dc?>? = null

    public var assignees:
        List<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemX1f2b88dc?>
      get() = requireNotNull(assigneesValue) { "assignees is required" }.toList()
      set(`value`) {
        assigneesValue = value.toList()
      }

    private var authorAssociationValue:
        InlineWebhookPullRequestReviewCommentEditedPullRequestAuthorAssociationX0b59c6b1? = null

    public var authorAssociation:
        InlineWebhookPullRequestReviewCommentEditedPullRequestAuthorAssociationX0b59c6b1
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var baseValue: InlineWebhookPullRequestReviewCommentEditedPullRequestBaseX47ee583c? =
        null

    public var base: InlineWebhookPullRequestReviewCommentEditedPullRequestBaseX47ee583c
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

    private var headValue: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e? =
        null

    public var head: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e
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
        List<InlineWebhookPullRequestReviewCommentEditedPullRequestLabelsItemX9ac22feb>? = null

    public var labels:
        List<InlineWebhookPullRequestReviewCommentEditedPullRequestLabelsItemX9ac22feb>
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
        List<InlineWebhookPullRequestRed95bPullRequestRequestedReviewersItemXd1949048>? = null

    public var requestedReviewers:
        List<InlineWebhookPullRequestRed95bPullRequestRequestedReviewersItemXd1949048>
      get() = requireNotNull(requestedReviewersValue) { "requestedReviewers is required" }.toList()
      set(`value`) {
        requestedReviewersValue = value.toList()
      }

    private var requestedTeamsValue:
        List<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemXb29acce1>? = null

    public var requestedTeams:
        List<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemXb29acce1>
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

    private var stateValue: InlineWebhookPullRequestReviewCommentEditedPullRequestStateX76c7ad96? =
        null

    public var state: InlineWebhookPullRequestReviewCommentEditedPullRequestStateX76c7ad96
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
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var activeLockReason:
        InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var assigneeState:
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneeXfba4428d?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var assignee: InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneeXfba4428d?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
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
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestMilestoneX3d5bfccb?> =
        FieldState.Absent

    /**
     * A collection of related issues and pull requests.
     * Required nullable field; assigning `null` records present-null.
     */
    public var milestone: InlineWebhookPullRequestReviewCommentEditedPullRequestMilestoneX3d5bfccb?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestUserXda4f1398?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestReviewCommentEditedPullRequestUserXda4f1398?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var autoMergeState:
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestAutoMergeXd6b0b13d?> =
        FieldState.Absent

    /**
     * The status of auto merging a pull request.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var autoMerge: InlineWebhookPullRequestReviewCommentEditedPullRequestAutoMergeXd6b0b13d?
      get() = autoMergeState.valueOrNull()
      set(`value`) {
        autoMergeState = value.toNullableFieldState()
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

    /**
     * Omits `auto_merge` from serialized output.
     */
    public fun unsetAutoMerge() {
      autoMergeState = FieldState.Absent
    }

    /**
     * Omits `draft` from serialized output.
     */
    public fun unsetDraft() {
      draftState = FieldState.Absent
    }

    public fun build(): InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e {
      check(linksValue != null) { "links is required" }
      check(assigneesValue != null) { "assignees is required" }
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
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(mergeCommitShaState !== FieldState.Absent) { "mergeCommitSha is required, even when null" }
      check(mergedAtState !== FieldState.Absent) { "mergedAt is required, even when null" }
      check(milestoneState !== FieldState.Absent) { "milestone is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e(
        links = links,
        activeLockReason = activeLockReasonState.valueOrNull(),
        assignee = assigneeState.valueOrNull(),
        assignees = assignees,
        authorAssociation = authorAssociation,
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
        autoMergeState = autoMergeState,
        draftState = draftState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e must be a JSON object")
      val links = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311>(rawObject, "_links")
      val assignees = json.decodeRequired<List<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneesItemX1f2b88dc?>>(rawObject, "assignees")
      val authorAssociation = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestAuthorAssociationX0b59c6b1>(rawObject, "author_association")
      val base = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestBaseX47ee583c>(rawObject, "base")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commitsUrl = json.decodeRequired<String>(rawObject, "commits_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diffUrl = json.decodeRequired<String>(rawObject, "diff_url")
      val head = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e>(rawObject, "head")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val labels = json.decodeRequired<List<InlineWebhookPullRequestReviewCommentEditedPullRequestLabelsItemX9ac22feb>>(rawObject, "labels")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val patchUrl = json.decodeRequired<String>(rawObject, "patch_url")
      val requestedReviewers = json.decodeRequired<List<InlineWebhookPullRequestRed95bPullRequestRequestedReviewersItemXd1949048>>(rawObject, "requested_reviewers")
      val requestedTeams = json.decodeRequired<List<InlineWebhookPullRequestRed95bPullRequestRequestedTeamsItemXb29acce1>>(rawObject, "requested_teams")
      val reviewCommentUrl = json.decodeRequired<String>(rawObject, "review_comment_url")
      val reviewCommentsUrl = json.decodeRequired<String>(rawObject, "review_comments_url")
      val state = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestStateX76c7ad96>(rawObject, "state")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("active_lock_reason")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'active_lock_reason'")
      }
      val activeLockReason = rawObject["active_lock_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentEditedPullRequestActiveLockReasonXd473f684?>(requireNotNull(element)) }
      if (!rawObject.containsKey("assignee")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'assignee'")
      }
      val assignee = rawObject["assignee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentEditedPullRequestAssigneeXfba4428d?>(requireNotNull(element)) }
      if (!rawObject.containsKey("body")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("merge_commit_sha")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'merge_commit_sha'")
      }
      val mergeCommitSha = rawObject["merge_commit_sha"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("merged_at")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'merged_at'")
      }
      val mergedAt = rawObject["merged_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("milestone")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'milestone'")
      }
      val milestone = rawObject["milestone"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentEditedPullRequestMilestoneX3d5bfccb?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentEditedPullRequestUserXda4f1398?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e(
        links = links,
        activeLockReason = activeLockReason,
        assignee = assignee,
        assignees = assignees,
        authorAssociation = authorAssociation,
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
        autoMergeState = json.decodeOptional(rawObject, "auto_merge", nullable = true),
        draftState = json.decodeOptional(rawObject, "draft", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("active_lock_reason", value.activeLockReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("assignee", value.assignee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("assignees", json.encodeToJsonElement(value.assignees))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
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
        putState("auto_merge", value.autoMergeState, json::encodeToJsonElement)
        putState("draft", value.draftState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e(block: InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e = InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e property '" + name + "' is not nullable")
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

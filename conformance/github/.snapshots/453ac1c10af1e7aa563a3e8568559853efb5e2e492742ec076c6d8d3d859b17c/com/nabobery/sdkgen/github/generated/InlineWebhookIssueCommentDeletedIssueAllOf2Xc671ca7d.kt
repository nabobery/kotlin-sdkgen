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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/1
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d.Serializer::class)
public class InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d internal constructor(
  public val assignee: InlineWebhookIssueCommentDeletedIssueAllOf2AssigneeX3e6b9c19?,
  labels: List<InlineWebhookIssueCommentDeletedIssueAllOf2LabelsItemX5a6125ce>,
  public val locked: Boolean,
  /**
   * State of the issue; either 'open' or 'closed'
   */
  public val state: InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f,
  private val activeLockReasonState: FieldState<String?>,
  assigneesState: FieldState<List<JsonObject?>>,
  private val authorAssociationState: FieldState<String>,
  private val bodyState: FieldState<String?>,
  private val closedAtState: FieldState<String?>,
  private val commentsState: FieldState<Int>,
  private val commentsUrlState: FieldState<String>,
  private val createdAtState: FieldState<String>,
  private val eventsUrlState: FieldState<String>,
  private val htmlUrlState: FieldState<String>,
  private val idState: FieldState<Int>,
  private val labelsUrlState: FieldState<String>,
  private val milestoneState: FieldState<JsonObject?>,
  private val nodeIdState: FieldState<String>,
  private val numberState: FieldState<Int>,
  private val performedViaGithubAppState: FieldState<JsonObject?>,
  private val reactionsState:
      FieldState<InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4>,
  private val repositoryUrlState: FieldState<String>,
  private val timelineUrlState: FieldState<String>,
  private val titleState: FieldState<String>,
  private val updatedAtState: FieldState<String>,
  private val urlState: FieldState<String>,
  private val userState: FieldState<InlineWebhookIssueCommentDeletedIssueAllOf2UserX8d8fdb61>,
) {
  public val labels: List<InlineWebhookIssueCommentDeletedIssueAllOf2LabelsItemX5a6125ce> =
      labels.toList()

  private val assigneesState: FieldState<List<JsonObject?>> =
      assigneesState.copyValue { fieldValue -> fieldValue.toList() }

  public val activeLockReason: String?
    get() = activeLockReasonState.valueOrNull()

  public val assignees: List<JsonObject?>?
    get() = assigneesState.valueOrNull()

  public val authorAssociation: String?
    get() = authorAssociationState.valueOrNull()

  public val body: String?
    get() = bodyState.valueOrNull()

  public val closedAt: String?
    get() = closedAtState.valueOrNull()

  public val comments: Int?
    get() = commentsState.valueOrNull()

  public val commentsUrl: String?
    get() = commentsUrlState.valueOrNull()

  public val createdAt: String?
    get() = createdAtState.valueOrNull()

  public val eventsUrl: String?
    get() = eventsUrlState.valueOrNull()

  public val htmlUrl: String?
    get() = htmlUrlState.valueOrNull()

  public val id: Int?
    get() = idState.valueOrNull()

  public val labelsUrl: String?
    get() = labelsUrlState.valueOrNull()

  public val milestone: JsonObject?
    get() = milestoneState.valueOrNull()

  public val nodeId: String?
    get() = nodeIdState.valueOrNull()

  public val number: Int?
    get() = numberState.valueOrNull()

  public val performedViaGithubApp: JsonObject?
    get() = performedViaGithubAppState.valueOrNull()

  public val reactions: InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4?
    get() = reactionsState.valueOrNull()

  public val repositoryUrl: String?
    get() = repositoryUrlState.valueOrNull()

  public val timelineUrl: String?
    get() = timelineUrlState.valueOrNull()

  public val title: String?
    get() = titleState.valueOrNull()

  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public val url: String?
    get() = urlState.valueOrNull()

  public val user: InlineWebhookIssueCommentDeletedIssueAllOf2UserX8d8fdb61?
    get() = userState.valueOrNull()

  public constructor(
    assignee: InlineWebhookIssueCommentDeletedIssueAllOf2AssigneeX3e6b9c19?,
    labels: List<InlineWebhookIssueCommentDeletedIssueAllOf2LabelsItemX5a6125ce>,
    locked: Boolean,
    state: InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f,
  ) : this(assignee = assignee,
  labels = labels,
  locked = locked,
  state = state,
  activeLockReasonState = FieldState.Absent,
  assigneesState = FieldState.Absent,
  authorAssociationState = FieldState.Absent,
  bodyState = FieldState.Absent,
  closedAtState = FieldState.Absent,
  commentsState = FieldState.Absent,
  commentsUrlState = FieldState.Absent,
  createdAtState = FieldState.Absent,
  eventsUrlState = FieldState.Absent,
  htmlUrlState = FieldState.Absent,
  idState = FieldState.Absent,
  labelsUrlState = FieldState.Absent,
  milestoneState = FieldState.Absent,
  nodeIdState = FieldState.Absent,
  numberState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  repositoryUrlState = FieldState.Absent,
  timelineUrlState = FieldState.Absent,
  titleState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  urlState = FieldState.Absent,
  userState = FieldState.Absent,
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
   * Returns the wire presence of `author_association`.
   */
  public fun authorAssociationPresence(): FieldPresence = authorAssociationState.presence

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `closed_at`.
   */
  public fun closedAtPresence(): FieldPresence = closedAtState.presence

  /**
   * Returns the wire presence of `comments`.
   */
  public fun commentsPresence(): FieldPresence = commentsState.presence

  /**
   * Returns the wire presence of `comments_url`.
   */
  public fun commentsUrlPresence(): FieldPresence = commentsUrlState.presence

  /**
   * Returns the wire presence of `created_at`.
   */
  public fun createdAtPresence(): FieldPresence = createdAtState.presence

  /**
   * Returns the wire presence of `events_url`.
   */
  public fun eventsUrlPresence(): FieldPresence = eventsUrlState.presence

  /**
   * Returns the wire presence of `html_url`.
   */
  public fun htmlUrlPresence(): FieldPresence = htmlUrlState.presence

  /**
   * Returns the wire presence of `id`.
   */
  public fun idPresence(): FieldPresence = idState.presence

  /**
   * Returns the wire presence of `labels_url`.
   */
  public fun labelsUrlPresence(): FieldPresence = labelsUrlState.presence

  /**
   * Returns the wire presence of `milestone`.
   */
  public fun milestonePresence(): FieldPresence = milestoneState.presence

  /**
   * Returns the wire presence of `node_id`.
   */
  public fun nodeIdPresence(): FieldPresence = nodeIdState.presence

  /**
   * Returns the wire presence of `number`.
   */
  public fun numberPresence(): FieldPresence = numberState.presence

  /**
   * Returns the wire presence of `performed_via_github_app`.
   */
  public fun performedViaGithubAppPresence(): FieldPresence = performedViaGithubAppState.presence

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  /**
   * Returns the wire presence of `repository_url`.
   */
  public fun repositoryUrlPresence(): FieldPresence = repositoryUrlState.presence

  /**
   * Returns the wire presence of `timeline_url`.
   */
  public fun timelineUrlPresence(): FieldPresence = timelineUrlState.presence

  /**
   * Returns the wire presence of `title`.
   */
  public fun titlePresence(): FieldPresence = titleState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  /**
   * Returns the wire presence of `url`.
   */
  public fun urlPresence(): FieldPresence = urlState.presence

  /**
   * Returns the wire presence of `user`.
   */
  public fun userPresence(): FieldPresence = userState.presence

  public class Builder {
    private var labelsValue: List<InlineWebhookIssueCommentDeletedIssueAllOf2LabelsItemX5a6125ce>? =
        null

    public var labels: List<InlineWebhookIssueCommentDeletedIssueAllOf2LabelsItemX5a6125ce>
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

    private var stateValue: InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f? = null

    public var state: InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var assigneeState:
        FieldState<InlineWebhookIssueCommentDeletedIssueAllOf2AssigneeX3e6b9c19?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var assignee: InlineWebhookIssueCommentDeletedIssueAllOf2AssigneeX3e6b9c19?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
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

    private var assigneesState: FieldState<List<JsonObject?>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var assignees: List<JsonObject?>?
      get() = assigneesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "assignees is not nullable; call unsetAssignees() to omit it" }
        assigneesState = FieldState.Value(present.toList())
      }

    private var authorAssociationState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var authorAssociation: String?
      get() = authorAssociationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "authorAssociation is not nullable; call unsetAuthorAssociation() to omit it" }
        authorAssociationState = FieldState.Value(present)
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var closedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var commentsState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var comments: Int?
      get() = commentsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "comments is not nullable; call unsetComments() to omit it" }
        commentsState = FieldState.Value(present)
      }

    private var commentsUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var commentsUrl: String?
      get() = commentsUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "commentsUrl is not nullable; call unsetCommentsUrl() to omit it" }
        commentsUrlState = FieldState.Value(present)
      }

    private var createdAtState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "createdAt is not nullable; call unsetCreatedAt() to omit it" }
        createdAtState = FieldState.Value(present)
      }

    private var eventsUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var eventsUrl: String?
      get() = eventsUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "eventsUrl is not nullable; call unsetEventsUrl() to omit it" }
        eventsUrlState = FieldState.Value(present)
      }

    private var htmlUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "htmlUrl is not nullable; call unsetHtmlUrl() to omit it" }
        htmlUrlState = FieldState.Value(present)
      }

    private var idState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var id: Int?
      get() = idState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "id is not nullable; call unsetId() to omit it" }
        idState = FieldState.Value(present)
      }

    private var labelsUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var labelsUrl: String?
      get() = labelsUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "labelsUrl is not nullable; call unsetLabelsUrl() to omit it" }
        labelsUrlState = FieldState.Value(present)
      }

    private var milestoneState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var milestone: JsonObject?
      get() = milestoneState.valueOrNull()
      set(`value`) {
        milestoneState = value.toNullableFieldState()
      }

    private var nodeIdState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var nodeId: String?
      get() = nodeIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "nodeId is not nullable; call unsetNodeId() to omit it" }
        nodeIdState = FieldState.Value(present)
      }

    private var numberState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var number: Int?
      get() = numberState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "number is not nullable; call unsetNumber() to omit it" }
        numberState = FieldState.Value(present)
      }

    private var performedViaGithubAppState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp: JsonObject?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var reactionsState:
        FieldState<InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    private var repositoryUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repositoryUrl: String?
      get() = repositoryUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "repositoryUrl is not nullable; call unsetRepositoryUrl() to omit it" }
        repositoryUrlState = FieldState.Value(present)
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

    private var titleState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "title is not nullable; call unsetTitle() to omit it" }
        titleState = FieldState.Value(present)
      }

    private var updatedAtState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "updatedAt is not nullable; call unsetUpdatedAt() to omit it" }
        updatedAtState = FieldState.Value(present)
      }

    private var urlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "url is not nullable; call unsetUrl() to omit it" }
        urlState = FieldState.Value(present)
      }

    private var userState: FieldState<InlineWebhookIssueCommentDeletedIssueAllOf2UserX8d8fdb61> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var user: InlineWebhookIssueCommentDeletedIssueAllOf2UserX8d8fdb61?
      get() = userState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "user is not nullable; call unsetUser() to omit it" }
        userState = FieldState.Value(present)
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
     * Omits `author_association` from serialized output.
     */
    public fun unsetAuthorAssociation() {
      authorAssociationState = FieldState.Absent
    }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    /**
     * Omits `closed_at` from serialized output.
     */
    public fun unsetClosedAt() {
      closedAtState = FieldState.Absent
    }

    /**
     * Omits `comments` from serialized output.
     */
    public fun unsetComments() {
      commentsState = FieldState.Absent
    }

    /**
     * Omits `comments_url` from serialized output.
     */
    public fun unsetCommentsUrl() {
      commentsUrlState = FieldState.Absent
    }

    /**
     * Omits `created_at` from serialized output.
     */
    public fun unsetCreatedAt() {
      createdAtState = FieldState.Absent
    }

    /**
     * Omits `events_url` from serialized output.
     */
    public fun unsetEventsUrl() {
      eventsUrlState = FieldState.Absent
    }

    /**
     * Omits `html_url` from serialized output.
     */
    public fun unsetHtmlUrl() {
      htmlUrlState = FieldState.Absent
    }

    /**
     * Omits `id` from serialized output.
     */
    public fun unsetId() {
      idState = FieldState.Absent
    }

    /**
     * Omits `labels_url` from serialized output.
     */
    public fun unsetLabelsUrl() {
      labelsUrlState = FieldState.Absent
    }

    /**
     * Omits `milestone` from serialized output.
     */
    public fun unsetMilestone() {
      milestoneState = FieldState.Absent
    }

    /**
     * Omits `node_id` from serialized output.
     */
    public fun unsetNodeId() {
      nodeIdState = FieldState.Absent
    }

    /**
     * Omits `number` from serialized output.
     */
    public fun unsetNumber() {
      numberState = FieldState.Absent
    }

    /**
     * Omits `performed_via_github_app` from serialized output.
     */
    public fun unsetPerformedViaGithubApp() {
      performedViaGithubAppState = FieldState.Absent
    }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    /**
     * Omits `repository_url` from serialized output.
     */
    public fun unsetRepositoryUrl() {
      repositoryUrlState = FieldState.Absent
    }

    /**
     * Omits `timeline_url` from serialized output.
     */
    public fun unsetTimelineUrl() {
      timelineUrlState = FieldState.Absent
    }

    /**
     * Omits `title` from serialized output.
     */
    public fun unsetTitle() {
      titleState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    /**
     * Omits `url` from serialized output.
     */
    public fun unsetUrl() {
      urlState = FieldState.Absent
    }

    /**
     * Omits `user` from serialized output.
     */
    public fun unsetUser() {
      userState = FieldState.Absent
    }

    public fun build(): InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d {
      check(labelsValue != null) { "labels is required" }
      check(lockedValue != null) { "locked is required" }
      check(stateValue != null) { "state is required" }
      check(assigneeState !== FieldState.Absent) { "assignee is required, even when null" }
      return InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d(
        assignee = assigneeState.valueOrNull(),
        labels = labels,
        locked = locked,
        state = state,
        activeLockReasonState = activeLockReasonState,
        assigneesState = assigneesState,
        authorAssociationState = authorAssociationState,
        bodyState = bodyState,
        closedAtState = closedAtState,
        commentsState = commentsState,
        commentsUrlState = commentsUrlState,
        createdAtState = createdAtState,
        eventsUrlState = eventsUrlState,
        htmlUrlState = htmlUrlState,
        idState = idState,
        labelsUrlState = labelsUrlState,
        milestoneState = milestoneState,
        nodeIdState = nodeIdState,
        numberState = numberState,
        performedViaGithubAppState = performedViaGithubAppState,
        reactionsState = reactionsState,
        repositoryUrlState = repositoryUrlState,
        timelineUrlState = timelineUrlState,
        titleState = titleState,
        updatedAtState = updatedAtState,
        urlState = urlState,
        userState = userState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d must be a JSON object")
      val labels = json.decodeRequired<List<InlineWebhookIssueCommentDeletedIssueAllOf2LabelsItemX5a6125ce>>(rawObject, "labels")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val state = json.decodeRequired<InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f>(rawObject, "state")
      if (!rawObject.containsKey("assignee")) {
        throw SerializationException("InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d is missing required property 'assignee'")
      }
      val assignee = rawObject["assignee"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssueCommentDeletedIssueAllOf2AssigneeX3e6b9c19?>(requireNotNull(element)) }
      return InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d(
        assignee = assignee,
        labels = labels,
        locked = locked,
        state = state,
        activeLockReasonState = json.decodeOptional(rawObject, "active_lock_reason", nullable = true),
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        authorAssociationState = json.decodeOptional(rawObject, "author_association", nullable = false),
        bodyState = json.decodeOptional(rawObject, "body", nullable = true),
        closedAtState = json.decodeOptional(rawObject, "closed_at", nullable = true),
        commentsState = json.decodeOptional(rawObject, "comments", nullable = false),
        commentsUrlState = json.decodeOptional(rawObject, "comments_url", nullable = false),
        createdAtState = json.decodeOptional(rawObject, "created_at", nullable = false),
        eventsUrlState = json.decodeOptional(rawObject, "events_url", nullable = false),
        htmlUrlState = json.decodeOptional(rawObject, "html_url", nullable = false),
        idState = json.decodeOptional(rawObject, "id", nullable = false),
        labelsUrlState = json.decodeOptional(rawObject, "labels_url", nullable = false),
        milestoneState = json.decodeOptional(rawObject, "milestone", nullable = true),
        nodeIdState = json.decodeOptional(rawObject, "node_id", nullable = false),
        numberState = json.decodeOptional(rawObject, "number", nullable = false),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
        repositoryUrlState = json.decodeOptional(rawObject, "repository_url", nullable = false),
        timelineUrlState = json.decodeOptional(rawObject, "timeline_url", nullable = false),
        titleState = json.decodeOptional(rawObject, "title", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = false),
        urlState = json.decodeOptional(rawObject, "url", nullable = false),
        userState = json.decodeOptional(rawObject, "user", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("assignee", value.assignee?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("labels", json.encodeToJsonElement(value.labels))
        put("locked", json.encodeToJsonElement(value.locked))
        put("state", json.encodeToJsonElement(value.state))
        putState("active_lock_reason", value.activeLockReasonState, json::encodeToJsonElement)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("author_association", value.authorAssociationState, json::encodeToJsonElement)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("closed_at", value.closedAtState, json::encodeToJsonElement)
        putState("comments", value.commentsState, json::encodeToJsonElement)
        putState("comments_url", value.commentsUrlState, json::encodeToJsonElement)
        putState("created_at", value.createdAtState, json::encodeToJsonElement)
        putState("events_url", value.eventsUrlState, json::encodeToJsonElement)
        putState("html_url", value.htmlUrlState, json::encodeToJsonElement)
        putState("id", value.idState, json::encodeToJsonElement)
        putState("labels_url", value.labelsUrlState, json::encodeToJsonElement)
        putState("milestone", value.milestoneState, json::encodeToJsonElement)
        putState("node_id", value.nodeIdState, json::encodeToJsonElement)
        putState("number", value.numberState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
        putState("repository_url", value.repositoryUrlState, json::encodeToJsonElement)
        putState("timeline_url", value.timelineUrlState, json::encodeToJsonElement)
        putState("title", value.titleState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
        putState("url", value.urlState, json::encodeToJsonElement)
        putState("user", value.userState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d(block: InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d.Builder.() -> Unit): InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d = InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookIssueCommentDeletedIssueAllOf2Xc671ca7d property '" + name + "' is not nullable")
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

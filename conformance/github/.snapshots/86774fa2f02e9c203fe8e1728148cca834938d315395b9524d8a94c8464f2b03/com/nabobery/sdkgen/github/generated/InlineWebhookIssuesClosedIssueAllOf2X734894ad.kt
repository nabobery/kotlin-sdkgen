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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/issue/allOf/1
 */
@Serializable(with = InlineWebhookIssuesClosedIssueAllOf2X734894ad.Serializer::class)
public class InlineWebhookIssuesClosedIssueAllOf2X734894ad internal constructor(
  public val closedAt: String?,
  public val state: InlineWebhookIssuesClosedIssueAllOf2StateX36be21c5,
  private val activeLockReasonState: FieldState<String?>,
  private val assigneeState: FieldState<JsonObject?>,
  assigneesState: FieldState<List<JsonObject?>>,
  private val authorAssociationState: FieldState<String>,
  private val bodyState: FieldState<String?>,
  private val commentsState: FieldState<Int>,
  private val commentsUrlState: FieldState<String>,
  private val createdAtState: FieldState<String>,
  private val eventsUrlState: FieldState<String>,
  private val htmlUrlState: FieldState<String>,
  private val idState: FieldState<Int>,
  labelsState: FieldState<List<JsonObject?>>,
  private val labelsUrlState: FieldState<String>,
  private val lockedState: FieldState<Boolean>,
  private val milestoneState: FieldState<JsonObject?>,
  private val nodeIdState: FieldState<String>,
  private val numberState: FieldState<Int>,
  private val performedViaGithubAppState: FieldState<JsonObject?>,
  private val reactionsState: FieldState<InlineWebhookIssuesClosedIssueAllOf2ReactionsXf8b04513>,
  private val repositoryUrlState: FieldState<String>,
  private val timelineUrlState: FieldState<String>,
  private val titleState: FieldState<String>,
  private val updatedAtState: FieldState<String>,
  private val urlState: FieldState<String>,
  private val userState: FieldState<InlineWebhookIssuesClosedIssueAllOf2UserX4f593b11>,
) {
  private val assigneesState: FieldState<List<JsonObject?>> =
      assigneesState.copyValue { fieldValue -> fieldValue.toList() }

  private val labelsState: FieldState<List<JsonObject?>> =
      labelsState.copyValue { fieldValue -> fieldValue.toList() }

  public val activeLockReason: String?
    get() = activeLockReasonState.valueOrNull()

  public val assignee: JsonObject?
    get() = assigneeState.valueOrNull()

  public val assignees: List<JsonObject?>?
    get() = assigneesState.valueOrNull()

  public val authorAssociation: String?
    get() = authorAssociationState.valueOrNull()

  public val body: String?
    get() = bodyState.valueOrNull()

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

  public val labels: List<JsonObject?>?
    get() = labelsState.valueOrNull()

  public val labelsUrl: String?
    get() = labelsUrlState.valueOrNull()

  public val locked: Boolean?
    get() = lockedState.valueOrNull()

  public val milestone: JsonObject?
    get() = milestoneState.valueOrNull()

  public val nodeId: String?
    get() = nodeIdState.valueOrNull()

  public val number: Int?
    get() = numberState.valueOrNull()

  public val performedViaGithubApp: JsonObject?
    get() = performedViaGithubAppState.valueOrNull()

  public val reactions: InlineWebhookIssuesClosedIssueAllOf2ReactionsXf8b04513?
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

  public val user: InlineWebhookIssuesClosedIssueAllOf2UserX4f593b11?
    get() = userState.valueOrNull()

  public constructor(closedAt: String?, state: InlineWebhookIssuesClosedIssueAllOf2StateX36be21c5) : this(closedAt = closedAt,
  state = state,
  activeLockReasonState = FieldState.Absent,
  assigneeState = FieldState.Absent,
  assigneesState = FieldState.Absent,
  authorAssociationState = FieldState.Absent,
  bodyState = FieldState.Absent,
  commentsState = FieldState.Absent,
  commentsUrlState = FieldState.Absent,
  createdAtState = FieldState.Absent,
  eventsUrlState = FieldState.Absent,
  htmlUrlState = FieldState.Absent,
  idState = FieldState.Absent,
  labelsState = FieldState.Absent,
  labelsUrlState = FieldState.Absent,
  lockedState = FieldState.Absent,
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
   * Returns the wire presence of `assignee`.
   */
  public fun assigneePresence(): FieldPresence = assigneeState.presence

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
   * Returns the wire presence of `labels`.
   */
  public fun labelsPresence(): FieldPresence = labelsState.presence

  /**
   * Returns the wire presence of `labels_url`.
   */
  public fun labelsUrlPresence(): FieldPresence = labelsUrlState.presence

  /**
   * Returns the wire presence of `locked`.
   */
  public fun lockedPresence(): FieldPresence = lockedState.presence

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
    private var stateValue: InlineWebhookIssuesClosedIssueAllOf2StateX36be21c5? = null

    public var state: InlineWebhookIssuesClosedIssueAllOf2StateX36be21c5
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
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

    private var activeLockReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var activeLockReason: String?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var assigneeState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var assignee: JsonObject?
      get() = assigneeState.valueOrNull()
      set(`value`) {
        assigneeState = value.toNullableFieldState()
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

    private var labelsState: FieldState<List<JsonObject?>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var labels: List<JsonObject?>?
      get() = labelsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "labels is not nullable; call unsetLabels() to omit it" }
        labelsState = FieldState.Value(present.toList())
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

    private var reactionsState: FieldState<InlineWebhookIssuesClosedIssueAllOf2ReactionsXf8b04513> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: InlineWebhookIssuesClosedIssueAllOf2ReactionsXf8b04513?
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

    private var userState: FieldState<InlineWebhookIssuesClosedIssueAllOf2UserX4f593b11> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var user: InlineWebhookIssuesClosedIssueAllOf2UserX4f593b11?
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
     * Omits `assignee` from serialized output.
     */
    public fun unsetAssignee() {
      assigneeState = FieldState.Absent
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
     * Omits `labels` from serialized output.
     */
    public fun unsetLabels() {
      labelsState = FieldState.Absent
    }

    /**
     * Omits `labels_url` from serialized output.
     */
    public fun unsetLabelsUrl() {
      labelsUrlState = FieldState.Absent
    }

    /**
     * Omits `locked` from serialized output.
     */
    public fun unsetLocked() {
      lockedState = FieldState.Absent
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

    public fun build(): InlineWebhookIssuesClosedIssueAllOf2X734894ad {
      check(stateValue != null) { "state is required" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      return InlineWebhookIssuesClosedIssueAllOf2X734894ad(
        closedAt = closedAtState.valueOrNull(),
        state = state,
        activeLockReasonState = activeLockReasonState,
        assigneeState = assigneeState,
        assigneesState = assigneesState,
        authorAssociationState = authorAssociationState,
        bodyState = bodyState,
        commentsState = commentsState,
        commentsUrlState = commentsUrlState,
        createdAtState = createdAtState,
        eventsUrlState = eventsUrlState,
        htmlUrlState = htmlUrlState,
        idState = idState,
        labelsState = labelsState,
        labelsUrlState = labelsUrlState,
        lockedState = lockedState,
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesClosedIssueAllOf2X734894ad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedIssueAllOf2X734894ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedIssueAllOf2X734894ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesClosedIssueAllOf2X734894ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesClosedIssueAllOf2X734894ad must be a JSON object")
      val state = json.decodeRequired<InlineWebhookIssuesClosedIssueAllOf2StateX36be21c5>(rawObject, "state")
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("InlineWebhookIssuesClosedIssueAllOf2X734894ad is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookIssuesClosedIssueAllOf2X734894ad(
        closedAt = closedAt,
        state = state,
        activeLockReasonState = json.decodeOptional(rawObject, "active_lock_reason", nullable = true),
        assigneeState = json.decodeOptional(rawObject, "assignee", nullable = true),
        assigneesState = json.decodeOptional(rawObject, "assignees", nullable = false),
        authorAssociationState = json.decodeOptional(rawObject, "author_association", nullable = false),
        bodyState = json.decodeOptional(rawObject, "body", nullable = true),
        commentsState = json.decodeOptional(rawObject, "comments", nullable = false),
        commentsUrlState = json.decodeOptional(rawObject, "comments_url", nullable = false),
        createdAtState = json.decodeOptional(rawObject, "created_at", nullable = false),
        eventsUrlState = json.decodeOptional(rawObject, "events_url", nullable = false),
        htmlUrlState = json.decodeOptional(rawObject, "html_url", nullable = false),
        idState = json.decodeOptional(rawObject, "id", nullable = false),
        labelsState = json.decodeOptional(rawObject, "labels", nullable = false),
        labelsUrlState = json.decodeOptional(rawObject, "labels_url", nullable = false),
        lockedState = json.decodeOptional(rawObject, "locked", nullable = false),
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedIssueAllOf2X734894ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesClosedIssueAllOf2X734894ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("state", json.encodeToJsonElement(value.state))
        putState("active_lock_reason", value.activeLockReasonState, json::encodeToJsonElement)
        putState("assignee", value.assigneeState, json::encodeToJsonElement)
        putState("assignees", value.assigneesState, json::encodeToJsonElement)
        putState("author_association", value.authorAssociationState, json::encodeToJsonElement)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("comments", value.commentsState, json::encodeToJsonElement)
        putState("comments_url", value.commentsUrlState, json::encodeToJsonElement)
        putState("created_at", value.createdAtState, json::encodeToJsonElement)
        putState("events_url", value.eventsUrlState, json::encodeToJsonElement)
        putState("html_url", value.htmlUrlState, json::encodeToJsonElement)
        putState("id", value.idState, json::encodeToJsonElement)
        putState("labels", value.labelsState, json::encodeToJsonElement)
        putState("labels_url", value.labelsUrlState, json::encodeToJsonElement)
        putState("locked", value.lockedState, json::encodeToJsonElement)
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

public fun inlineWebhookIssuesClosedIssueAllOf2X734894ad(block: InlineWebhookIssuesClosedIssueAllOf2X734894ad.Builder.() -> Unit): InlineWebhookIssuesClosedIssueAllOf2X734894ad = InlineWebhookIssuesClosedIssueAllOf2X734894ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesClosedIssueAllOf2X734894ad is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookIssuesClosedIssueAllOf2X734894ad property '" + name + "' is not nullable")
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

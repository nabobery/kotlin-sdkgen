package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class ReviewRequestedIssueEventView(
  public val actor: SimpleUser,
  @SerialName("commit_id")
  public val commitId: String?,
  @SerialName("commit_url")
  public val commitUrl: String?,
  @SerialName("created_at")
  public val createdAt: String,
  public val event: String,
  public val id: Int,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("performed_via_github_app")
  public val performedViaGithubApp: NullableIntegration?,
  @SerialName("requested_reviewer")
  public val requestedReviewer: SimpleUser? = null,
  @SerialName("requested_team")
  public val requestedTeam: Team? = null,
  @SerialName("review_requester")
  public val reviewRequester: SimpleUser,
  public val url: String,
)

/**
 * Review Requested Issue Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-requested-issue-event
 */
@Serializable(with = ReviewRequestedIssueEvent.Serializer::class)
public class ReviewRequestedIssueEvent internal constructor(
  public val actor: SimpleUser,
  public val commitId: String?,
  public val commitUrl: String?,
  public val createdAt: String,
  public val event: String,
  public val id: Int,
  public val nodeId: String,
  public val performedViaGithubApp: NullableIntegration?,
  public val reviewRequester: SimpleUser,
  public val url: String,
  private val requestedReviewerState: FieldState<SimpleUser>,
  private val requestedTeamState: FieldState<Team>,
) {
  public val requestedReviewer: SimpleUser?
    get() = requestedReviewerState.valueOrNull()

  public val requestedTeam: Team?
    get() = requestedTeamState.valueOrNull()

  public constructor(
    actor: SimpleUser,
    commitId: String?,
    commitUrl: String?,
    createdAt: String,
    event: String,
    id: Int,
    nodeId: String,
    performedViaGithubApp: NullableIntegration?,
    reviewRequester: SimpleUser,
    url: String,
  ) : this(actor = actor,
  commitId = commitId,
  commitUrl = commitUrl,
  createdAt = createdAt,
  event = event,
  id = id,
  nodeId = nodeId,
  performedViaGithubApp = performedViaGithubApp,
  reviewRequester = reviewRequester,
  url = url,
  requestedReviewerState = FieldState.Absent,
  requestedTeamState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `requested_reviewer`.
   */
  public fun requestedReviewerPresence(): FieldPresence = requestedReviewerState.presence

  /**
   * Returns the wire presence of `requested_team`.
   */
  public fun requestedTeamPresence(): FieldPresence = requestedTeamState.presence

  public class Builder {
    private var actorValue: SimpleUser? = null

    public var actor: SimpleUser
      get() = requireNotNull(actorValue) { "actor is required" }
      set(`value`) {
        actorValue = value
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

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var reviewRequesterValue: SimpleUser? = null

    public var reviewRequester: SimpleUser
      get() = requireNotNull(reviewRequesterValue) { "reviewRequester is required" }
      set(`value`) {
        reviewRequesterValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var commitIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitId: String?
      get() = commitIdState.valueOrNull()
      set(`value`) {
        commitIdState = value.toNullableFieldState()
      }

    private var commitUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitUrl: String?
      get() = commitUrlState.valueOrNull()
      set(`value`) {
        commitUrlState = value.toNullableFieldState()
      }

    private var performedViaGithubAppState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var performedViaGithubApp: NullableIntegration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var requestedReviewerState: FieldState<SimpleUser> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requestedReviewer: SimpleUser?
      get() = requestedReviewerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requestedReviewer is not nullable; call unsetRequestedReviewer() to omit it" }
        requestedReviewerState = FieldState.Value(present)
      }

    private var requestedTeamState: FieldState<Team> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requestedTeam: Team?
      get() = requestedTeamState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requestedTeam is not nullable; call unsetRequestedTeam() to omit it" }
        requestedTeamState = FieldState.Value(present)
      }

    /**
     * Omits `requested_reviewer` from serialized output.
     */
    public fun unsetRequestedReviewer() {
      requestedReviewerState = FieldState.Absent
    }

    /**
     * Omits `requested_team` from serialized output.
     */
    public fun unsetRequestedTeam() {
      requestedTeamState = FieldState.Absent
    }

    public fun build(): ReviewRequestedIssueEvent {
      check(actorValue != null) { "actor is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventValue != null) { "event is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(reviewRequesterValue != null) { "reviewRequester is required" }
      check(urlValue != null) { "url is required" }
      check(commitIdState !== FieldState.Absent) { "commitId is required, even when null" }
      check(commitUrlState !== FieldState.Absent) { "commitUrl is required, even when null" }
      check(performedViaGithubAppState !== FieldState.Absent) { "performedViaGithubApp is required, even when null" }
      return ReviewRequestedIssueEvent(
        actor = actor,
        commitId = commitIdState.valueOrNull(),
        commitUrl = commitUrlState.valueOrNull(),
        createdAt = createdAt,
        event = event,
        id = id,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubAppState.valueOrNull(),
        reviewRequester = reviewRequester,
        url = url,
        requestedReviewerState = requestedReviewerState,
        requestedTeamState = requestedTeamState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReviewRequestedIssueEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReviewRequestedIssueEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReviewRequestedIssueEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ReviewRequestedIssueEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReviewRequestedIssueEvent must be a JSON object")
      val actor = json.decodeRequired<SimpleUser>(rawObject, "actor")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val event = json.decodeRequired<String>(rawObject, "event")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val reviewRequester = json.decodeRequired<SimpleUser>(rawObject, "review_requester")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("commit_id")) {
        throw SerializationException("ReviewRequestedIssueEvent is missing required property 'commit_id'")
      }
      val commitId = rawObject["commit_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("commit_url")) {
        throw SerializationException("ReviewRequestedIssueEvent is missing required property 'commit_url'")
      }
      val commitUrl = rawObject["commit_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("performed_via_github_app")) {
        throw SerializationException("ReviewRequestedIssueEvent is missing required property 'performed_via_github_app'")
      }
      val performedViaGithubApp = rawObject["performed_via_github_app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIntegration?>(requireNotNull(element)) }
      return ReviewRequestedIssueEvent(
        actor = actor,
        commitId = commitId,
        commitUrl = commitUrl,
        createdAt = createdAt,
        event = event,
        id = id,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubApp,
        reviewRequester = reviewRequester,
        url = url,
        requestedReviewerState = json.decodeOptional(rawObject, "requested_reviewer", nullable = false),
        requestedTeamState = json.decodeOptional(rawObject, "requested_team", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReviewRequestedIssueEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ReviewRequestedIssueEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("commit_id", value.commitId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_url", value.commitUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("event", value.event)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("performed_via_github_app", value.performedViaGithubApp?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("review_requester", json.encodeToJsonElement(value.reviewRequester))
        put("url", value.url)
        putState("requested_reviewer", value.requestedReviewerState, json::encodeToJsonElement)
        putState("requested_team", value.requestedTeamState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reviewRequestedIssueEvent(block: ReviewRequestedIssueEvent.Builder.() -> Unit): ReviewRequestedIssueEvent = ReviewRequestedIssueEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReviewRequestedIssueEvent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ReviewRequestedIssueEvent property '" + name + "' is not nullable")
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

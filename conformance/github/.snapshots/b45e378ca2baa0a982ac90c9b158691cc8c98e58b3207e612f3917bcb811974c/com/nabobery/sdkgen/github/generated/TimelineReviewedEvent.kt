package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Timeline Reviewed Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-reviewed-event
 */
@Serializable(with = TimelineReviewedEvent.Serializer::class)
public class TimelineReviewedEvent internal constructor(
  public val links: InlineTimelineReviewedEventLinksX23bbde05,
  public val authorAssociation: AuthorAssociation,
  /**
   * The text of the review.
   */
  public val body: String?,
  /**
   * A commit SHA for the review.
   */
  public val commitId: String,
  public val event: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the review
   */
  public val id: Int,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String,
  public val state: String,
  public val user: SimpleUser,
  private val bodyHtmlState: FieldState<String>,
  private val bodyTextState: FieldState<String>,
  private val submittedAtState: FieldState<String>,
  private val updatedAtState: FieldState<String?>,
) {
  public val bodyHtml: String?
    get() = bodyHtmlState.valueOrNull()

  public val bodyText: String?
    get() = bodyTextState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val submittedAt: String?
    get() = submittedAtState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public constructor(
    links: InlineTimelineReviewedEventLinksX23bbde05,
    authorAssociation: AuthorAssociation,
    body: String?,
    commitId: String,
    event: String,
    htmlUrl: String,
    id: Int,
    nodeId: String,
    pullRequestUrl: String,
    state: String,
    user: SimpleUser,
  ) : this(links = links,
  authorAssociation = authorAssociation,
  body = body,
  commitId = commitId,
  event = event,
  htmlUrl = htmlUrl,
  id = id,
  nodeId = nodeId,
  pullRequestUrl = pullRequestUrl,
  state = state,
  user = user,
  bodyHtmlState = FieldState.Absent,
  bodyTextState = FieldState.Absent,
  submittedAtState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `body_html`.
   */
  public fun bodyHtmlPresence(): FieldPresence = bodyHtmlState.presence

  /**
   * Returns the wire presence of `body_text`.
   */
  public fun bodyTextPresence(): FieldPresence = bodyTextState.presence

  /**
   * Returns the wire presence of `submitted_at`.
   */
  public fun submittedAtPresence(): FieldPresence = submittedAtState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  public class Builder {
    private var linksValue: InlineTimelineReviewedEventLinksX23bbde05? = null

    public var links: InlineTimelineReviewedEventLinksX23bbde05
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

    private var commitIdValue: String? = null

    public var commitId: String
      get() = requireNotNull(commitIdValue) { "commitId is required" }
      set(`value`) {
        commitIdValue = value
      }

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
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

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var pullRequestUrlValue: String? = null

    public var pullRequestUrl: String
      get() = requireNotNull(pullRequestUrlValue) { "pullRequestUrl is required" }
      set(`value`) {
        pullRequestUrlValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var userValue: SimpleUser? = null

    public var user: SimpleUser
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * The text of the review.
     * Required nullable field; assigning `null` records present-null.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
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

    private var submittedAtState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var submittedAt: String?
      get() = submittedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "submittedAt is not nullable; call unsetSubmittedAt() to omit it" }
        submittedAtState = FieldState.Value(present)
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
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
     * Omits `submitted_at` from serialized output.
     */
    public fun unsetSubmittedAt() {
      submittedAtState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    public fun build(): TimelineReviewedEvent {
      check(linksValue != null) { "links is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(commitIdValue != null) { "commitId is required" }
      check(eventValue != null) { "event is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pullRequestUrlValue != null) { "pullRequestUrl is required" }
      check(stateValue != null) { "state is required" }
      check(userValue != null) { "user is required" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      return TimelineReviewedEvent(
        links = links,
        authorAssociation = authorAssociation,
        body = bodyState.valueOrNull(),
        commitId = commitId,
        event = event,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        pullRequestUrl = pullRequestUrl,
        state = state,
        user = user,
        bodyHtmlState = bodyHtmlState,
        bodyTextState = bodyTextState,
        submittedAtState = submittedAtState,
        updatedAtState = updatedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TimelineReviewedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TimelineReviewedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TimelineReviewedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("TimelineReviewedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TimelineReviewedEvent must be a JSON object")
      val links = json.decodeRequired<InlineTimelineReviewedEventLinksX23bbde05>(rawObject, "_links")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val event = json.decodeRequired<String>(rawObject, "event")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val pullRequestUrl = json.decodeRequired<String>(rawObject, "pull_request_url")
      val state = json.decodeRequired<String>(rawObject, "state")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      if (!rawObject.containsKey("body")) {
        throw SerializationException("TimelineReviewedEvent is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return TimelineReviewedEvent(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        event = event,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        pullRequestUrl = pullRequestUrl,
        state = state,
        user = user,
        bodyHtmlState = json.decodeOptional(rawObject, "body_html", nullable = false),
        bodyTextState = json.decodeOptional(rawObject, "body_text", nullable = false),
        submittedAtState = json.decodeOptional(rawObject, "submitted_at", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: TimelineReviewedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("TimelineReviewedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_id", value.commitId)
        put("event", value.event)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("pull_request_url", value.pullRequestUrl)
        put("state", value.state)
        put("user", json.encodeToJsonElement(value.user))
        putState("body_html", value.bodyHtmlState, json::encodeToJsonElement)
        putState("body_text", value.bodyTextState, json::encodeToJsonElement)
        putState("submitted_at", value.submittedAtState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun timelineReviewedEvent(block: TimelineReviewedEvent.Builder.() -> Unit): TimelineReviewedEvent = TimelineReviewedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TimelineReviewedEvent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("TimelineReviewedEvent property '" + name + "' is not nullable")
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
